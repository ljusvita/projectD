import pytest
from ..loto7.loto7_gatherer import Loto7Gatherer

def test_test():
    assert True == True

def test_gatherer():
    g = Loto7Gatherer()
    g.gather()
    result = g.check()
    assert len(result) == 7
    assert isinstance(result[0], int)
