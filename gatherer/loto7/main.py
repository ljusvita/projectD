from bottle import route, run
import loto7_gatherer

@route('/')
def index():
    return {}

run(host='localhost', port=18081)