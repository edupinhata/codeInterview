from problemType import ProblemType
from constants import PROBLEMS_PATH


class Problem:
    def __init__(self, problem_folder_name):
        splitted_problem = problem_folder_name.split('_')
        self.name = problem_folder_name
        self.path = r"{}{}/{}".format(PROBLEMS_PATH, ProblemType[splitted_problem[0]], problem_folder_name)
        self.level = int(splitted_problem[1])
        self.description = splitted_problem[2]
