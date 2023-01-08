package com.sayzen.campfiresdk.app.develop

/*

!!!!
ИНСТРУКЦИЯ ПО СБОРКЕ СЕРВЕРА

1. В консоли в корне \Campfire
gradlew CampfireServer:build

2. Сделать резервную копию

3. Выключить сервер
systemctl stop campfire*.service
или
systemctl stop campfire.service

4. Содержимым Campfire\CampfireServer\build\distributions\CampfireServer.zip заменить аналогичные файлы на сервере

5. Включить сервер
systemctl start campfire*.service
или
systemctl start campfire.service

Журнал:
journalctl -r -xu campfire.service

Sql:
psql campfire_db
!!!






        !!! Исправить баг с отрицательными переводами!!!



----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            RELEASE
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

(#sit) Пользовательские квесты (бета)
  - Редактор (почти) полноценных квестов в Campfire
  - Новая ачивка и множитель кармы x1.5 (в квестах)
  - Переменные, спец. эффекты, развилки и не только
  - Отдельная лента для квестов
(#NikiTank) Картинка для пустующих черновиков

Также добавил 10 и 11 правила:

*Запрещено провоцировать преследования, например, раскрывая чью-то личную или конфиденциальную информацию.*
{green - Пользователь упомянул в разговоре соц. сеть другого пользователя, о которой он сам публично упоминал}
{red - Приятель пользователя начал публиковать его личную информацию без согласия}
{red - Пользователь обманом заставил другого пользователя раскрыть свои данные}

*В разделе квестов правила выше умножаются на 10, а также применяются дополнительные правила:*
1. Все квесты должны рассказывать какую-то историю или показывать механики, которые можно реализовать с помощью квестов
2. Квесты с большим количеством грамматических ошибок не разрешены
3. Нельзя публиковать квесты с демонстрацией механик, которые уже много раз демонстрировались
4. В квестах с историей должна быть как минимум одна развилка
{green - Пользователь создал квест, который является дополнением к существующему рассказу}
{green - Пользователь создал квест, который является фанфиком по видеоигре}
{red - Пользователь создал квест, который рассказывает про его сохранение в видеоигре}

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            Актуальные задачи
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------


    ===============================
    Из большого поста пользователей о багах:
    ===============================

    Баги:
    Исправлены @post_3792333 -
    Если 3-4 раза быстро переключиться между разделом ленты и чата, а потом остановиться в разделе ленты, то экран попросту ничего не показывает. Тоже самое работает и с уведомлениями, но не всегда. Для исправления можно вручную перейти на другой раздел.
    Иногда если выйти из аккаунта, потом переключиться на другой, то Кемп может запуститься с прошлого аккаунта.

    При редактировании вики больше не будут удаляться последние карточки
    Теперь обычные участники конференций не могут менять фон чата
    Исправлен @post_3748818 - в обучении пройдено 15 из 16 но все пройдены (Fines)
    Теперь модераторы могут нормально редактировать чаты фэндома
    Исправлен @post_3736175 - отображается кнопка не участвовать на эстафете, при этом написано НЕТ ПОЛЬЗОВАТЕЛЯ (возможно евентбас)

    Новое:
    Добавлено уведомление о подписке

    Теперь протоадмины могут защищать
    1 фэндомы, после этого их никто не сможет удалить
    2 вики, то же + никто не сможет редактировать
    3 публикации, сам автор сможет так же всё делать, но другие не смогут заблокировать публикацию
    Были защищены все вики кемпа, а также все основные фэндомы(список здесь @wikiarticle_1174)

    Убрана кнопка "Изменить" у вики. Теперь юзайте карандашик
    Теперь наместники фэндомов могут защищать вики от удаления(редактирование по прежнему остаётся возможным)
    Теперь те, кто имеет возможность редактировать вики могут сравнивать 2 версии вики и возвращать старые версии 1 нажатием кнопки.
    В истории можно зажать 2 версии, внизу появится кнопочка "Сравнить", нажимаем на неё и открывается специальный экран сравнения
    Добавлен режим быстрого редактирования тегов, сравнение и возврат старых версий тегов
    Теперь посты в профиле можно фильтровать по нескольким фэндомам, и также наоборот, в фэндомах можно фильтровать по пользователям
    Теперь в опросах работает форматирование
    Теперь можно сделать разный текст для открытого и закрытого спойлера
    Теперь отредактированный текст автоматически сохраняется даже при выходе из приложения
    При добавлении видео к посту добавлена подсказка
    Теперь создатели конференций являются протоадминами. Они могут передать свои права другому
    Теперь модераторы фэндома могут исключать пользователей из эстафет Уровень 6.3 карма 750
    Теперь можно перемещать вики

    Теперь картинки нигде не шакалятся
    Теперь сохраняются все сообщения в основных чатах фэндомов
    Количество картинок в 1 карточке увеличено до 20
    Убрана привилегия удаления медиа из старых постов
    Теперь в публикации можно добавлять аудио Скачивать тоже можно

    ===============================
    ===============================

    Баг. Если во время загрузки чата написать сообщения, все ломается

    Баг. Категории тегов начали странно перемещаться
    Баг. Дважды вырос коф. рубрики
    Баг. ? У некоторых пользователей сломан счетчик оценок
    Баг. Отображается некорректно число стикеров
    Баг. У пользователя низкий уровень, но есть надпись нажмите для статуса
    Баг. ? Пользователю выдается проклятие хейтера за блокировки по жалобам
    Баг. На экране жалоб, при блокировке поста не открываются шаблоны наказаний (Возможно связанно с языком)

    В модераторское событие о блокировке добавить наказание
    В жалобах добавить значок фэндома


    Не просить принять правила дважды
    После регистрации не просить повторно ввести почту и пароль

    Баг. Если нажать на уведомление из чата, не открывается чат (приложение закрыто)
    Баг. ? Мультиязычные посты не показывают.
    Баг. У некоторых пользователей некорректное кол-во фэндомов в профиле
    Баг. В подтверждение блокировок цвет кодом


----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            BACK LOG - Отложенные идеи и ошибки
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Ачивка за нахождение в топе по карме

1) 12.1 lvl с 2150 кармой - возможность удалить пользователей из списка "очереди" в эстафетах
2) 4.4 lvl - возможность управлять рубрикой
3) 12.25 lvl c 2175 кармой - возможность изменить срок ожидания поста в эстафетах
4) 8.55 lvl с 1350 кармой - возможность запретить конкретному пользователю попасть в очередь в эстафетах. (приглашения от других пользователей разрешены)
5) 3.65 lvl - возможность создать собственный чат.
6) 7.15 lvl с 750 кармой - возможность задавать лимит сообщений для определённого чата

Сделать медленный режим в чате общем

    Система пользовательского перевода
        -   Пользователь не видит что он уже перевел (на модерации)
        -   Добавить ачивку
        -   Рейтинг переводчиков (Строк переведено, Процент перевода приложения)
        -   Возможность чистить историю.
        -   Событие в истории о чистке, событие в профиле
        -   Сделать защиту от удаления подстановочных символов

    Авторизация через email
        -   Отправка письма с подтверждением
        -   Подтверждение email. (что если закрыть приложение?)
        -   Забыл пароль

    !!! DonationAlerts


    Баг. При добавлении картинки они серые (редминоут 7)
    Баг. Не работают таблицы
    Баг. В статусе съедаются слова
    Баг. Через пост перешел в фэндом - удалил фэндом - вернулся в пост - снова перешел на фэндома (Закрывать посты удаленных фэндомов в стаке)
    Баг. Если отредактировать сообщение и сохранить его, мат сохранится (только на клиенте)
    Баг. Цитирование игнорирует экранирование форматирования текста
    Баг. Если одна картинка из набора не загрузилась, то все сбрасывается
    Баг. В уведомлении в шторке мат с тегами форматирования
    Баг. Каким-то образом в чате стало отрицательно кол-во подписок
    Баг. Иногда новые сообщения появляются пустыми
    Баг. Когда много людей в чате происходит дедлок
    Баг. 1703855_1703952 цитата занимает слишком много места
    Баг. Не работает цензура с переносом строки
    Баг. В белой теме нет иконок в навигации
    Баг. При получении нового сообщения остальные подпрыгивают.
    Баг. Если упомянули  чате из которого вышел, то можно перейти к сообщению и приходит уведомление.
    Баг. Можно листать чат при открытом меню если не отпускать
    Баг. Клавиатура может открыться поверх стикеров - Скипнуть приложение и вернуться
    Баг. Дата зависит от языка устройства а не приложения
    Баг. Анимация с виджета кармы попадает на тень он MaxSizesLayout
    Баг. При блокировке и разблокировке экрана меняется цвет навигации при диалоге
    Баг. Лишнее уведомления о не работе пушей (Записывать в логи статус отправки пушей)
    Баг. Если проскролить к комментам и назад к посту то нельзя скопировать текст
    Баг. Линия на своей картинке в сообщениях (возникает из-за adjustViewBounds)
    Баг. После просмотра видео пропадает навигация
    Баг. Подвисает лента если в ней большой текст (не парсить теги и ссылки) (выводить тост при создании)
    Баг. Нет анимации клика на заголовке фэндома в посте
    Баг. При удалении страницы, не чистятся ресурсы
    Баг. Если из черновика перейти в чат, потом вернуться, клавиатура не открывается
    Баг. У некоторых пользователей время в приложении на час отличается от реального

    Архив эстафет
    Ссылки на правила в событиях блокировки
    Возможность следить за кучей вещей - уведомления (Модерациями, постами в рубриках) post_2712491
    Добавить примеры к правилам модерации.
    Эффект общественные работы
    Эффект админ
    Возможность выделить несколько тегов
    Фильтр по пользователю внутри фэндома
    Возможность игнорировать эстафеты
    Правило о фейковых новостях
    Правило, если не активен, могут снять ник.
    Выбор из 6ти дефолтных аватаров
    Спец админ (Выдача админки)
    Подтверждение 3мя админами
    Возможность указать рубрику после публикации поста (+изменить)
    Запретить оценивать мод. действие над своим постом
    Возможность указать эстафету после публикации поста (+изменить)
    Автоматическая перемотка к новым сообщениям плюс заголовок
    Прямая ссылка на картинку без загрузки на сервер
    Ограничить количество эстафет в которые можно вступить и сразу начать
    Архивирование рубрик
    Возможность поменять папку для загрузки картинок
    Отображать больше 9 уведомлений
    Якоря. Клик по тексту для скролла к странице.
    Возможность редактировать сразу несколько картинок
    Поиск стикерпаков
    Би. Поиск постов
    Би. Объединять комменты к посту в уведомлениях
    Би. Сделать вступление в беседы по приглашениям, а не сразу (в течении 24 часов активно)
    Использовать число подписчиков на языке для фэндомов
    Добавить себя в рейтинги даже если нет в списке
    Хранить кол-во подписчиков чата в поле подписки
    Цветной фон текста тегами
    Возможность отправить пост на проверку админам до публикации (+ комментарий)
    При игноре игнорить сообщения. (Что если это последнее сообщение)
    При игноре игнорить посты. (Выводить метку?)
    При игноре игнорить комментарии. (Выводить метку?)
    Заменить возраст на дату рождения
    Доделать скрипт индексации ресурсов
    Фризы при скролле ленты и фризы при сколле комментов (Первом)
    Возможность отключить анимацию аватара для конкретного пользователя
    Нейтральный гендр?
    Напоминание о донатах
    Ускорить загрузку (Похоже отправляются лишние запросы)
    Переделать систему переводов (Карма, принятие/отклонение, предложка, активности)
    Возможность обжаловать действия админа / уведомление при подтверждении мод действия (?) + 3 админа должны подтвердить
     - Админы. Возможность жаловаться на админа/модератора
     - Админы. Экран жалоб на админов/модераторов
     - Админы. Экран c админскими банами и комментариями
    Переделать отзывы в рецензии
    ? Донаты через киви
        -   Перенести домен на сервер
        -   HTTPS
        -   HTTP - https://habr.com/ru/post/69136/ (Проблема с сертификатом)
    Вместо 10 приватных сообщений, стакать их
    Скрытые фэндомы. (С создателем, только по приглашениям и т.д.)
    Значки ссылок на популярные сервисы в профиле
    Добавить уведомление протоадмина при критических ошибках
    Избранные чаты
    Люди часто жалуются что непонятно что происходит с кармой (Сделать график как в стаке?)
    Выводить в уведомления отформатированный текст а не \*Текст\*
    Сделать чтоб на стикерах кому ответ.
    Скрипт отображающий изменения в тексте
    Возможно следует сделать какой-то рейтинг по поиску багов.
    В уведомлениях о сделал/снял модератора нет имени админа и коммента
    История тега
    Описание в пользовательские чаты
    В жалобах нужно отображать фэндом иначе не понятно тчо это мультиязычный пост
    Комментарии со стикерами ?
     ? Челендж активности
    Переделать фильтры в ленте так чтоб все влазили
    При блокировке стикера в профилях должно появляться событие и должно приходить уведомление
    Возможность цитировать аудио сообщения (+ свайп)
    Индикатор что есть новые уведомления при использовании драйвера
    При игноре - игнорить посты, сообщения, упоминания
    Система хештегов. Тренды. Поиск по хештегу.
    Корзина для постов и черновиков (Удаление через 7 дней)
    В уведомлениях о реакциях выводить реакцию и коммент
    Возможность выбрать стартовый экран лента/чаты/фэндом
    Блокнот
    Возможность просматривать фэндомы сеткой.
    Войс. Линия не отражает реальный звук
    Войс. Если поднести к уху - менять динамик (Если убрать от уха - пауза) (Код написан, но не работает)
    Возможность пометить пост как фейк или сомнительный (отображать комментарий) + событие
    Возможность отключить загрузку гифок в настройках - Если у пользователя отключена загрузка гифок, нужно как-то давать ему возможность её загрузить кликом (+вес?)
    Посты. Музыка
    Фэндом. Расширенный поиск, с отображением скриншотов
    Кнопка прочитано в шторке для сообщений
    Возможность передать черновики. (+ защита от спама (через чс?)) (+ возможность отключить)
    Опрос. Опрос с несколькими вариантами
    Опрос. посмотреть результаты голосования без голосования (опционально)
    Опрос. Возможность посмотреть кто голосовал в опросах (открытый / закрытый опрос)
    Опрос. Опрос с картинками
    Улучшить защиту ресурсов
    Посты. Переводы статей
    Почты. Репост статей с других сообществ
    Посты. Страница Твит
    Посты. Страница Куб
    Посты. Возможность делится файлами
    Чат. Ограничение ЛС (только те на кого подписан)
    Чат. Возможность отвечать на сообщения в уведомлении
    Чат. Возможность отключить уведомления от конкретного пользователя (на время / навсегда)
    Фэндом. Подписка на теги
    Возможность призвать админа/модератора (@Admin @Moderator)
    Ссылки на фэндом по названию (Как быть с языком? Что если в названии есть _)

    Картинки
        -   Дефолтная аватарка пользователя (можно разные)
        -   Аватарка для анонимной оценки
        -   Пустой вики список
        -   Пустой вики статья
        -   Картинка с флажками на фон профиля
        -   Список рубрик



----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            Long Box
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Би. Поиск в фэндоме с использованием хештегов (#Zeon все посты зеона)
    Би. Медальки

    Гибридные ЕЗ
    Профиль. Функция вайп аккаунта - удалить ВСЁ связанное с аккаунтом, кроме id и GoogleId
    Инвентарь (Предмет превращающий кого-то в свинку, подарки)
    Страница - генератор рандома. Задаешь срок. И в это время она генерирует случайное число / выбирает случайного пользователя / комментарий / текст
    Переводы песен + приложение
    Секретные ачивки
    Холивары
    Оптимизация экранов под планшеты
    Вселенные
    Система званий
    Система комитетов

    Гильдии
        -   Кнопки: Чат, Участники, Теги, Форумы, Фэндомы
        -   Описание
        -   Картинки
        -   Ссылки
        -   Посты
        -   Система заявок
        -   Система званий/привилегий
        -   Система меток (консты)
        -   Система контроля. (таблицы / налоги)

    Примечания
       -   Выбор цвета
       -   Долгий тап на аватар
       -   Отображение цвета на аватаре
       -   Возможность добавить примечание долгим тапом на аватар

    Вики
        -   Список объектов (+ заголовок)
        -   Избранное
        -   Объект ссылка на вики статью/раздел
        -   Возможность переключится на сетку
        -   Возможность восстановить из удаленных
        -   Возможность откатить изменения элемента
        -   Возможность откатить изменения статьи
        -   Перенос разделов
        -   Возможность жаловаться
        -   Возможность переводить вики
        -   Перекрестные ссылки
        -   Юниты о публикации и редактировании в профиле и фэндоме
        -   Поиск
        -   Автоматически парсить текст на сервере на предмет ссылок на вики и добавлять форматирование с названиями (+ обновлять при пересохранении статьи на случай изменения)
        -   Над всеми языками нужна подпись
        -   ? Есл удалить картинку, то она пропадет во всех ревизиях
        -   Сообщение что не заполнено на вашем языке
        -   Переключение на английский

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            Hard
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------


    Возможность скролить при просмотре картинок в экране (нижняя панель) (Индикатор имеет собственный скролл, пробовал засунуть в скролвью - виджет пропал)

    Баг. Гифки объединяются. Одна гифка на прозрачном фоне другой. размазанный кадр гифки отображается как фон. при перезагрузке новой гифки, задний кадр меняется, пропадает когда выходит время проигрывания первой гифки.



----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            INFO
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Project was created 10 apr 2016




 */
