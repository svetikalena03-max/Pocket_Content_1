package com.example.contentinpocket.data

import com.example.contentinpocket.domain.ContentFormat
import com.example.contentinpocket.domain.ContentTemplate
import com.example.contentinpocket.domain.Niche

object MockData {
    val niches = listOf(
        Niche("fashion", "Магазин одежды"),
        Niche("beauty", "Бьюти"),
        Niche("nutrition", "Нутрициолог"),
        Niche("travel", "Турагент")
    )

    val formats = listOf(
        ContentFormat("post", "Пост"),
        ContentFormat("stories", "Сторис"),
        ContentFormat("reels", "Reels"),
        ContentFormat("warmup", "Прогрев")
    )

    val templates = listOf(
        ContentTemplate("fashion_post_1", "fashion", "post", "Новая коллекция уже в магазине! Собрали базовые образы на каждый день: легко комбинируются и выглядят дорого. Напишите в директ слово ХОЧУ — подберем ваш размер."),
        ContentTemplate("fashion_post_2", "fashion", "post", "3 вещи, которые обновят гардероб этой весной: жакет свободного кроя, прямые джинсы и белая рубашка. Сохраняйте, чтобы не потерять подборку."),
        ContentTemplate("fashion_stories_1", "fashion", "stories", "Сторис 1: Сегодня разбираем капсулу на неделю.\nСторис 2: Показываем 3 готовых образа.\nСторис 3: Голосование — какой образ повторить завтра?"),
        ContentTemplate("fashion_stories_2", "fashion", "stories", "Сторис 1: Новинки дня уже на рейле.\nСторис 2: До конца дня скидка 10%.\nСторис 3: Напишите размер в ответ — отложим примерку."),
        ContentTemplate("fashion_reels_1", "fashion", "reels", "Идея Reels: до/после — из базового образа в стильный за 15 секунд. Текст на видео: Как выглядеть дороже без лишних трат."),
        ContentTemplate("fashion_reels_2", "fashion", "reels", "Идея Reels: 5 образов из одной рубашки. Завершение: Сохрани, чтобы повторить и не думать, что надеть."),
        ContentTemplate("fashion_warmup_1", "fashion", "warmup", "День 1: Почему стиль = уверенность.\nДень 2: Частые ошибки в гардеробе.\nДень 3: Мой простой чек-лист покупок.\nДень 4: Завтра покажу готовые комплекты и открою запись."),
        ContentTemplate("fashion_warmup_2", "fashion", "warmup", "Прогрев на 3 дня: боль клиента (нечего надеть) -> решение (капсула) -> оффер (подбор образов в директ)."),
        ContentTemplate("beauty_post_1", "beauty", "post", "Сияющая кожа — это система, а не случайность. В карусели показываю 4 шага домашнего ухода, которые действительно работают."),
        ContentTemplate("beauty_post_2", "beauty", "post", "Топ-3 процедуры перед важным событием: мягкий пилинг, увлажнение и лифтинг-массаж. Сохраняйте пост как шпаргалку."),
        ContentTemplate("beauty_stories_1", "beauty", "stories", "Сторис 1: Разбор вашего ухода по типу кожи.\nСторис 2: Мини-тест с вариантами ответа.\nСторис 3: Подарок — чек-лист в директ."),
        ContentTemplate("beauty_stories_2", "beauty", "stories", "Сторис 1: Сегодня окно на 2 записи.\nСторис 2: Показываю результат клиента до/после.\nСторис 3: Кнопка — забрать время."),
        ContentTemplate("beauty_reels_1", "beauty", "reels", "Идея Reels: Ошибки в уходе, которые сушат кожу. Формат: быстрые титры + демонстрация правильного шага."),
        ContentTemplate("beauty_reels_2", "beauty", "reels", "Идея Reels: Утренний beauty-ритуал за 5 минут. Финал: Напиши УХОД — отправлю подборку средств."),
        ContentTemplate("beauty_warmup_1", "beauty", "warmup", "День 1: Мифы об уходе.\nДень 2: Реальные кейсы клиентов.\nДень 3: Мой метод подбора домашнего ухода.\nДень 4: Открываю запись на консультации."),
        ContentTemplate("beauty_warmup_2", "beauty", "warmup", "Прогрев: вскрыть проблему (тусклая кожа), показать причину, дать мини-решение, пригласить на личный разбор."),
        ContentTemplate("nutrition_post_1", "nutrition", "post", "Если хотите снизить вес без срывов, начните с тарелки: белок + клетчатка + полезные жиры. Простая формула, которая работает каждый день."),
        ContentTemplate("nutrition_post_2", "nutrition", "post", "5 перекусов, которые поддерживают энергию и не мешают фигуре. Сохраняйте список и берите с собой на работу."),
        ContentTemplate("nutrition_stories_1", "nutrition", "stories", "Сторис 1: Разбираем ошибки завтрака.\nСторис 2: Мой вариант сбалансированного меню.\nСторис 3: Хотите готовый план на 3 дня?"),
        ContentTemplate("nutrition_stories_2", "nutrition", "stories", "Сторис 1: Что есть вечером, чтобы не переедать.\nСторис 2: Пример легкого ужина.\nСторис 3: Реакция клиентов + отзывы."),
        ContentTemplate("nutrition_reels_1", "nutrition", "reels", "Идея Reels: 3 быстрых завтрака для стабильной энергии. Кадры с приготовлением + подписи по БЖУ."),
        ContentTemplate("nutrition_reels_2", "nutrition", "reels", "Идея Reels: Разбор популярных диет и почему они не работают в долгую."),
        ContentTemplate("nutrition_warmup_1", "nutrition", "warmup", "День 1: Почему вес стоит на месте.\nДень 2: Что мешает дефициту калорий.\nДень 3: Показываю схему питания клиента.\nДень 4: Набор в сопровождение."),
        ContentTemplate("nutrition_warmup_2", "nutrition", "warmup", "Прогрев: кейс клиента -> объяснение принципов -> мини-задание -> приглашение в программу."),
        ContentTemplate("travel_post_1", "travel", "post", "Майские без переплат: подобрали 5 направлений с комфортным бюджетом и удобными перелетами. Напишите слово ТУР — отправим варианты."),
        ContentTemplate("travel_post_2", "travel", "post", "Как выбрать отпуск, чтобы реально перезагрузиться: климат, длительность, формат отдыха и запасной план на случай дождя."),
        ContentTemplate("travel_stories_1", "travel", "stories", "Сторис 1: Горящие предложения на неделю.\nСторис 2: Условия и цены.\nСторис 3: Опрос — море или экскурсии?"),
        ContentTemplate("travel_stories_2", "travel", "stories", "Сторис 1: Подборка отелей 4-5 звезд.\nСторис 2: Что входит в стоимость.\nСторис 3: Отправляю подборку в директ."),
        ContentTemplate("travel_reels_1", "travel", "reels", "Идея Reels: Топ-3 локации страны за 30 секунд + подписи с ценами и сезоном."),
        ContentTemplate("travel_reels_2", "travel", "reels", "Идея Reels: Чек-лист сборов в поездку. Финал: Сохрани, чтобы ничего не забыть."),
        ContentTemplate("travel_warmup_1", "travel", "warmup", "День 1: Как не переплатить за тур.\nДень 2: Когда лучше бронировать.\nДень 3: Кейсы клиентов с выгодой.\nДень 4: Открываю набор на подбор туров."),
        ContentTemplate("travel_warmup_2", "travel", "warmup", "Прогрев на запуск: боль (сложно выбрать), решение (персональный подбор), оффер (бесплатная консультация 15 минут).")
    )
}
