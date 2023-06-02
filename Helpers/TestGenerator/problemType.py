from enum import Enum


class ProblemType(str, Enum):
    CR = 'CodeReview'
    DB = 'Database'
    FTC = 'FixTheCode'
    I = 'Implementation'
