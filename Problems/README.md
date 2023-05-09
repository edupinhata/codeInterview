# Problems

This directory contains a list of problems that may be used to create the interview tests.

## Problem types

Right now we have the following types of problems:

- **CodeReview (CR):** there is a Pull Request that will apply some changes in a code. The interviewer should make a code review, pointing improvements, errors, code smells. 
- **Database (DB):** questions that tests candidate strength in database, like understanding of a  architecture, queries, etc.
- **FixTheCode (FTC):** there is a code with semantic, runtime or/and syntax errors. The interviewer should fix all errors.
- **Implementation (I):** the interviewer need to make a implementation to solve a problem given.

## Levels

The problems are rated in levels from 1-10 (check better interval), where 
1 is the easiest problem and 10 the hardest problem.

- 1-2: Intern problem level
- 2-4: Junior problem level
- 4-7: Pleno problem level
- 7-10: Senior problem level

## Problem Folder Name

Each problem will be located in a folder named using the following pattern (check if need to be changed):

````
ProblemTypeAcronym_Level_UniqueName
````

The Unique Name should be a name that shortly identify the problem. 
It also must be unique.

Example:
````
FTC_1_sorting-algorithms
````

This is a level 1 problem of type Fix The Code about sorting algorithms.

