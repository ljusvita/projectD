from requests_html import HTMLSession

class Loto7Gatherer:

    session = HTMLSession()

    def __init__(self):
        self.latest_loto7_numbers = []

    def check(self):
        return self.latest_loto7_numbers

    def gather(self):
        r = self.session.get(
            'https://www.mizuhobank.co.jp/retail/takarakuji/check/loto/loto7/index.html')
        r.html.render()

        find_result = r.html.find('.js-lottery-number-pc')
        self.latest_loto7_numbers = find_result[0:7]