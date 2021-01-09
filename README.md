# GrammarCheck
a program which checks that the inserted word belongs a certain alphabet 

Exercice:
Ecrivez un programme qui vérifié que le mot inséré appartient à l’alphabet A= {a, b} et le
langage L == {a^nb^p, p = n+1, n>=1}

Solution:
============
we try to check if the word begin by 'a' or not if not we stop the loop 
than we count the number of 'a' in the word it must equal (length / 2) -1
and the rest of caracters must be 'b'  