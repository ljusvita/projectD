import requests

def test_gather_7_numbers():
    response = requests.get('http://127.0.0.1:18081/')

    assert response.status_code == 200
    # assert len(response.json()) == 7
