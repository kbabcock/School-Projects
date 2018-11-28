%% Assignment 2-4 written by Kris Babcock

:- dynamic character/1.
:- dynamic species/2.
:- dynamic weapon/2.
:- dynamic color/2.

%% Here are rules. 

character(X) :- species(X, robot).
character(X) :- species(X, human).
character(X) :- species(X, mutant).

%% Here are some facts.

species(optimus_prime, robot).
species(megatron, robot).
species(racerx, human).
species(batman, human).
species(magneto, mutant).
weapon(optimus_prime, cannon).
weapon(megatron, cannon).
weapon(racerx, car).
weapon(batman, batarang).
weapon(magneto, magnetism).
color(optimus_prime, red).
color(magneto, red).
color(megatron, white).
color(racerx, white).
color(batman, black).