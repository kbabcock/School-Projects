%% This is our Prolog program—the beginnings of a full-fledged AI system.
%% The symbol to the left indicates a comment. First one declares the objects
%% in our rules. The number indicates the number of arguments for the object. For
%% example, “has_toll/2” indicates that “has_toll” takes two arguments.

:- dynamic has_toll/2.
:- dynamic is_type/2.
:- dynamic has_purpose/2.

%% Here are three rules with variables. 

has_toll(X, level_1) :- is_type(X, motorcycle).
has_toll(X, level_2) :- has_purpose(X, rally).
has_toll(X, level_5) :- is_type(X, automobile) , has_purpose(X, business).
has_toll(X, level_1) :- is_type(X, gov_automobile) ; is_type(X, public_bus).

%% Here are some facts.

is_type(stans_honda, motorcycle).
is_type(dans_camry, automobile).
is_type(snhu_bus32, public_bus).
is_type(racer, automobile).
has_purpose(dans_camry, business).
has_purpose(snhu_bus32, business).
has_purpose(racer, rally).