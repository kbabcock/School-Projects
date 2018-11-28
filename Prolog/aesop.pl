:- dynamic event/1.
:- dynamic rule/3.
:- dynamic situation/6.

%%%%%%%%%%%%% Event Database (our working memory, or what we know) 

event([(freq_visited_terrorist_url(abcal), tq([]))]).
event([(visited_url(jackson,abcal,10), tq(5,15))]).
event([(passport_record(jackson,country-xyz),tq(5,35))]).
event([(near(jackson,gg_bridge), tq(20,25))]).
event([(icon(gg_bridge), tq(20,25))]).

%%%%%%%%%%%%%%% The Rule Set.  

rule(if([(passport_record(Person,Country), T1)]),          
     tc([]), 
     then([(traveled_outside_US(Person),T1)])). 

rule(if([(traveled_outside_US(Person), T1), 
         (freq_visited_terrorist_url(URL), T2),
         (visited_url(Person,URL,N), T3)]), 
     tc([during(T3,T1), N > 2]), 
     then([(terrorist_suspect(Person),T1)])).

%%%%%%%%%%%%%% Temporal Rules %%%%%%%%%%%%%%%%%%%%%%%%%%%%

during(tq(T1,T2),tq(T3,T4)) :- T1 >= T3, T4 >= T2.

%%%%%%%%%%%%%% A Situation Templates, modeled on a "case" in Case-Based Reasoning. 

situation( name([(potential_attack)]),
	   background([(terrorist_suspect(P),T1), (near(P,Place), T2), (icon(Place),T2), (crowded(Place),T2) ]),
	   expectations([(attack(Place),T2)]),
	   problem([(potential_attack(Place), T2)]),
	   solution([secure(Place), T2]),
	   result([degree_of_success(good)]) ).

%%%%%%%%%%%%%%% Runtime Parameters %%%%%%%%%%%%%%%%%%

threshold(0.5).

%%%%%%%%%%%%%% The Hybrid RBR/CBR Engine %%%%%%%%%%%%%

%%%%%%%%%%%%%% Event Correlation. Phase 1 of the hybrid RBR/CBR system. This is the RBR part. Forward chaining.

go :- findall((Event), event(Event), Pre_WM),
      flatten(Pre_WM,WM),
		
      findall(_,(rule(if(A),tc(TC),then(C)),
	  	 subset(A,WM),  
		 (TC = [] ; (member(PTC,TC), PTC)), 
		 member(I_event,C),
		 not(event([I_event]) ), nl,write('ASSERTING INFERRED EVENT: '), write(I_event), nl,nl,
		 assert(event([I_event])) ), _ ),

%%%%%%%%%%%%%% Situation Analysis. Phase 2 of the hybrid RBR/CBR system. This is the CBR part.

       findall((Sim, N, Haves, Have_nots, E, P, S, R),
		  (situation(name(N), background(B), expectations(E), problem(P), solution(S), result(R)),
		   flatten([B], All),
		   intersection(All, WM, Haves),
		   subtract(All, Haves, Pre_Have_nots), list_to_set(Pre_Have_nots, Have_nots),
		   length(Haves, HL), length(All, AL),
		   Sim is (HL/AL), threshold(TH), Sim > TH ),
		Sits), 
       msort(Sits,Y), reverse(Y,Z), (write_all(Z) ; true).

%%%%%%%%%%%%%%% Write Out Results of Situation Analysis %%%

write_all([(W1, W2, W3, W4, W5, W6, W7, W8)]) :- nl,
   write('SITUATION: '), write(W2), nl,  
   write('Degree of support is '), write(W1), nl, 
   write('What we have is '), write(W3), nl,
   write('What we do not have is '), write(W4), nl,
   write('What we expect is '), write(W5), nl,
   write('The problem is '), write(W6), nl,
   write('The solution is '), write(W7), nl,
   write('The result should be '), write(W8).