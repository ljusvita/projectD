import pytest
from ..loto7.loto7_gatherer import Loto7Gatherer

def test_transfer_integer():
    assert 4 == int('04')

def test_gatherer():
    g = Loto7Gatherer()
    g.gather()
    result = g.check()
    assert len(result) == 7
    assert isinstance(result[0], int)
