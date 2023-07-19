from bottle import route, run
import loto7_gatherer

@route('/')
def index():
    gatherer = loto7_gatherer.Loto7Gatherer
    return loto7_gatherer.Loto7Gatherer.check(loto7_gatherer)

run(host='localhost', port=18081)