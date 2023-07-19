# Project D 문서

## 도입 배경
한국의 로또는 QR 코드를 찍으면 바로 당첨여부가 확인이 가능하나, 일본의 경우 오프라인 점포에서 사면 당첨여부를 수기로 체크해야 하는 불편함이 있음.
또, 매번 어떤 번호를 찍을까 고민을 하는 경우가 있어 이를 해결하고자 하였음.

## 구현 내용
어떤 로또를 구매 하였는지(e.g. ロト６、ロト７、ロトミニ)에 따라, 무작위로 생성한 번호와 당첨여부를 출력하는 페이지를 생성함.

## Why series
### Database
#### spring data r2dbc(mysql)
- due to using webflux, asynchronous database driver needed.