# Дианс проект
Проектна задача по предметот Дизајн и архитектура на софтвер.
___

### Содржина
- [Домашна работа 1](#домашна-работа-1)
- [Домашна работа 2](#домашна-работа-2)
- [Домашна работа 3](#домашна-работа-3)
- [About](#about)
-----
# Домашна работа 1

## Тим

- Никола Смилески, 193265
- Емилија Буревска, 191066

## Опис

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

## Функционални и нефункционални барања

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

## Pipe and Filter

Во рамки на фолдерот за ресурси се додадени табелите за затвори и затвореници, а под фолдерот service се наоѓа интерфејсот Filter и класата Pipe 

Слики од табелите:

![alt text](https://i.imgur.com/OiMVuwO.png)
![alt text](https://i.imgur.com/7CePOCm.png)

Деталите не се финални!

-----

# Домашна работа 2

## Архитектурен Дизајн

### Концептуална архитектура

#### Компоненти

- App UI
  - Прикажи затвори
  - Прикажи кориснички профил
  - Прикажи рута кон одберен затвор
  - Прикажи затвореници од тој затвор
- Admin Panel
  - Приказ на затворениците во базата
- Navigation Service
  - Започни калкулација
  - Избери најбрза рута
  - Пресметај оддалеченост до даден затвор
- Admin Service
  - Додај затвореник
  - Избриши затвореник
- Route Finder
  - Пресметај навигација
- User Manager
  - Регистрирај корисник
  - Логирај корисник
  - Избриши корисник
- PrisonerManager
  - Прикажи затвореник
  - Додај затвореник (со дадени пермисии)
  - Избриши затвореник (со дадени пермисии)
- PrisonerInformation Manager
  - Додај локација
  - Избриши локација
  - Побарај локација
  - Промени локација
  - Додај затвореник
- Избриши затвореник

#### Слика на архитектурата

  ![conceptual](https://user-images.githubusercontent.com/82407556/206924519-54c4e087-2c38-4a89-a78e-81d70321e891.png)

-----

### Извршна архитектура

#### Компоненти

- Графички кориснички интерфејс
- Сервис за навигација
- Сервис за корисници
- RouteFinder - користи го веб пребарувачот за да најдеш затвор.
- DATABASE e всушност service.

Корисничкиот интерфејс бара инпути од страна на корисникот.

#### Слика на архитектурата

![execution](https://user-images.githubusercontent.com/82407556/206924709-9a979b20-c090-41d1-8a1c-f45ba456c58d.png)

-----

### Имплементациска архитектура

Имплементациската архитектура е слоевито поделена во 3 слоја:
- Презентациски слој (Presentation layer): кој содржи информации за изгледот на веб страната.
- Услужен слој (Service Layer): кој содржи имплементација на сервисите односно ова е backend делот.
- Податочен слој (Data layer) : кој ги содржи податоците.

#### Слика на архитектурата

![implementation](https://user-images.githubusercontent.com/82407556/206925168-36edc955-fa5d-45b6-9526-ca249c6d309f.png)

-----

## Mockup

### Главната страна

<img src="https://user-images.githubusercontent.com/82407556/206926463-1cecfca7-1865-414f-9821-12b924c4c0db.png" width="800" />

### Логин формата

<img src="https://user-images.githubusercontent.com/82407556/206926594-32e11108-079d-4284-9276-5aee23056b22.png" width="800" />

### Форма за додавање нов осомничен

<img src="https://user-images.githubusercontent.com/82407556/206926592-d969eb00-a3c3-4e1a-a8a4-55db940d2cee.png" width="800" />




## Технички прототип

### Видео:
[![embed](https://user-images.githubusercontent.com/82407556/206928794-ab66cb90-c9fb-4c12-9b96-6b69e043bb7f.png)](https://youtu.be/jA7omAcKB-4 "Youtube Video")

Кликнете на сликата или во случај тоа да не работи, линк: https://youtu.be/jA7omAcKB-4

# Домашна работа 3

Напомена: Во документацијата не беше наведено, но и тогаш и сега се користеше PostrgreSQL база на податоци.

## Имплементирани функционалности

### Функционални барања
- [x] Системот му дозволува на корисникот да одбере затвор кој сака да го прегледува
- [x] Системот овозможува корисникот да ја внесе неговата адреса на живеење со цел навигација
- [x] Системот му покажува листа од затворите во државата
- [x] Системот овозможува корисникот да си ја измени локацијата
- [x] Системот го прикажува најкраткиот пат до одбран затвор
- [x] Системот му овозможува на корисникот да пријави осомничено лице
- [x] Системот дозволува преглед на сите затвореници во одбран затвор
- [x] Системот нуди филтирање и пребарување според атрибути на затворениците
- [x] Системот овозможува корисникот да се логира на системот преку корисничко име и лозинка

### Нефункционални барања

- [ ] Системот треба биде достапен 99% од времето <code>Апликацијата сеуште не е публикувана</code>
- [x] Системот треба секогаш да му го прикаже најблискиот пат до затворот на корисникот
- [x] Системот треба да информира авторизирано лице при Error на страната
- [x] Системот може да се користи на компјутер и на мобилен телефон
- [x] Системот треба да биде на Македонски јазик


## About
<code>"1. Доколку не успеете да ја публикувате апликацијата во продукција, можете и да снимите видео од екранот на кое ќе покажете како апликацијата работи. Во овој случај, сите функционални и нефункционални барања кои нема да бидат покажани ќе се сметаат за неимплементирани." </code>
- Бидејќи апликацијата користи база на податоци сметам дека е подобро да се публикува после докеризацијата.

### Видео:
[![embed](https://user-images.githubusercontent.com/82407556/206928794-ab66cb90-c9fb-4c12-9b96-6b69e043bb7f.png)](https://www.youtube.com/watch?v=-oRC8zOC3uU "Youtube Video")

Кликнете на сликата или во случај тоа да не работи, линк: https://www.youtube.com/watch?v=-oRC8zOC3uU
