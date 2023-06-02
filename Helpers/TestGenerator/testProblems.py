import os
from random import random

from problem import Problem
from problemType import ProblemType
from constants import PROBLEMS_PATH, PROBLEMS_MAX_LEVEL

class TestProblems:

    def __init__(self):
        self.problems = []
        self.load_all_problems()

    def load_all_problems(self):
        problems = []
        for problem_type in ProblemType:
            for directory in os.listdir(PROBLEMS_PATH + problem_type):
                problems.append(Problem(directory))
        self.problems = problems

    def pop(self, problem_type, level_lower, level_higher):
        if level_lower < 1:
            level_lower = 1
        if level_higher > PROBLEMS_MAX_LEVEL:
            level_higher = PROBLEMS_MAX_LEVEL

        problems_per_type = self.problems[problem_type]
        problems_filtered = list(filter(lambda p: level_lower <= p.level <= level_higher, problems_per_type))
        if len(problems_filtered) > 0:
            return problems_filtered[random.randint(0, len(problems_filtered)-1)]
        return self.get_random_problem_per_level(problem_type, level_lower-1, level_higher+1)
