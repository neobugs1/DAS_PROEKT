# Тим

- Никола Смилески, 193265
- Бидејќи не можев да стапам во контакт со останатите колеги за сега сум само јас во тимот, но може да се додадат и други колеги или
потполно да се промени овој проект бидејќи идеата сеуште не е финална.

# Опис

Главна цел на проектот е од естетска гледна точка софистицирана и прегледна
апликација која листа и сортира локации на затвори во нашата држава и мапирање и навигирање кон нив.
За секој затвор се чуваат затвореници. Фокусот е несомнено наоѓањето, мапирањето, филтрирање(според име, град, и други атрибути) и додавање на затвореници
во затворите од страна на обвинител.

JusticeIsServed е веб апликација која содржи база со сите локации на затвори и затвореници во
Македонија. Целта на оваа веб апликација е лесен пристап до сите осудени криминалци во државата,
нивниот статус и кривично дело, од страна на Министерството за внатрешни работи и други луѓе заинтересирани за оваа област.

За секој затвор се чува негова гео-локација со координати, име, град и општина,
а за секој затвореник се чуваат ID, име, презиме, пол, статус (притвор/во бегство/мртов),
слика од осудениот, опис на кривично дело, опис на инцидентот, датум на инцидентот, професија, ниво на едукација,
години/датум на раѓање, датум на осудување, град на живеење.

Исто така при најавување од страна на обвинител доколку тој обвинител има улога за тој конкретен затвор би можел да
додава нови затвореници или да ги променува информациите за претходните.

# Функционални и нефункционални барања

### Функционални барања
- Системот му дозволува на корисникот да одбере затвор кој сака да го прегледува
- Системот овозможува корисникот да ја внесе неговата адреса на живеење со цел навигација
- Системот му покажува листа од затворите во државата
- Системот овозможува корисникот да си ја измени локацијата
- Системот го прикажува најкраткиот пат до одбран затвор
- Системот му овозможува да остави коментар во однос на пријава на осомничено лице
- Системот дозволува преглед на сите затвореници во одбран затвор
- Системот нуди филтирање и пребарување според атрибути на затворениците
- Системот овозможува корисникот да се логира на системот преку корисничко име и лозинка

### Нефункционални барања

- Системот треба биде достапен 99% од времето
- Системот треба секогаш да му го прикаже најблискиот пат до затворот на корисникот
- Системот треба да информира авторизирано лице при Error на страната
- Системот може да се користи на компјутер и на мобилен телефон
- Системот треба да биде на Македонски јазик

# Pipe and Filter

Во рамки на фолдерот за ресурси се додадени табелите за затвори и затвореници, а под фолдерот service се наоѓа интерфејсот Filter и класата Pipe 

Слики од табелите:

![alt text](https://i.imgur.com/OiMVuwO.png)
![alt text](https://i.imgur.com/7CePOCm.png)

Деталите не се финални!
