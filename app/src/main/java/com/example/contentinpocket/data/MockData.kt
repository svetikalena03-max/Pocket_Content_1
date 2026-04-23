package com.example.contentinpocket.data

import com.example.contentinpocket.domain.ContentFormat
import com.example.contentinpocket.domain.ContentNiche
import com.example.contentinpocket.domain.ContentTemplate

object MockData {
    val niches = listOf(
        ContentNiche("fashion", "Магазин одежды"),
        ContentNiche("beauty", "Бьюти"),
        ContentNiche("nutrition", "Нутрициолог"),
        ContentNiche("travel", "Турагент")
    )

    val formats = listOf(
        ContentFormat("post", "Пост"),
        ContentFormat("stories", "Сторис"),
        ContentFormat("reels", "Reels"),
        ContentFormat("warmup", "Прогрев")
    )

    val templates = listOf(
        ContentTemplate("fashion_post_1", "fashion", "post", "Новая коллекция уже в магазине: 5 готовых образов на каждый день. Напишите в директ слово СТИЛЬ — подберем размер и комплект."),
        ContentTemplate("fashion_stories_1", "fashion", "stories", "Сторис: Сегодня показываем капсулу на неделю, 3 образа из базовых вещей и голосование, какой лук повторить завтра."),
        ContentTemplate("fashion_reels_1", "fashion", "reels", "Reels-идея: трансформация образа за 15 секунд. Заголовок на экране: Как выглядеть дороже без лишних трат."),
        ContentTemplate("fashion_warmup_1", "fashion", "warmup", "Прогрев: боль клиента (нечего надеть) -> решение (капсула) -> мини-пример образа -> приглашение в подбор в директ."),

        ContentTemplate("beauty_post_1", "beauty", "post", "Сияющая кожа — это система. В посте даю 4 шага домашнего ухода, которые помогут выровнять тон и увлажнить кожу."),
        ContentTemplate("beauty_stories_1", "beauty", "stories", "Сторис: разбор ухода по типу кожи, мини-тест и подарок — чек-лист базового ухода в директ."),
        ContentTemplate("beauty_reels_1", "beauty", "reels", "Reels-идея: 3 ошибки в уходе, которые сушат кожу. Короткие титры + правильные действия."),
        ContentTemplate("beauty_warmup_1", "beauty", "warmup", "Прогрев: миф об уходе -> реальный кейс клиента -> мини-совет -> приглашение на персональный разбор."),

        ContentTemplate("nutrition_post_1", "nutrition", "post", "Сбалансированная тарелка: белок + клетчатка + полезные жиры. Это базовый принцип снижения веса без жестких ограничений."),
        ContentTemplate("nutrition_stories_1", "nutrition", "stories", "Сторис: ошибки завтрака, пример сбалансированного меню и опрос, кому нужен готовый план на 3 дня."),
        ContentTemplate("nutrition_reels_1", "nutrition", "reels", "Reels-идея: 3 быстрых завтрака для стабильной энергии и контроля аппетита в течение дня."),
        ContentTemplate("nutrition_warmup_1", "nutrition", "warmup", "Прогрев: почему вес может стоять -> что исправить в питании -> мини-задание -> приглашение в сопровождение."),

        ContentTemplate("travel_post_1", "travel", "post", "Подобрали 5 направлений для отпуска без переплат. Напишите слово ТУР — отправим варианты под ваш бюджет."),
        ContentTemplate("travel_stories_1", "travel", "stories", "Сторис: горячие предложения недели, коротко по ценам и опрос — море или экскурсионный отдых."),
        ContentTemplate("travel_reels_1", "travel", "reels", "Reels-идея: топ-3 локации страны за 30 секунд с подписями по сезону и ориентировочному бюджету."),
        ContentTemplate("travel_warmup_1", "travel", "warmup", "Прогрев: сложность выбора отдыха -> как мы подбираем туры -> кейс клиента -> оффер на бесплатную консультацию.")
    )
}
