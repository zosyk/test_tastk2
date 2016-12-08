[![Build Status](https://travis-ci.org/zosyk/test_task.svg?branch=master)](https://travis-ci.org/zosyk/test_task)
# test_task

Написать консольное приложение на java, с использованием maven.


Приложение должно выводить на экран приветственное сообщение, в зависимости от текущего времени суток.


Good morning, World! в 06:00 - 09:00


Good day, World! в 09:00 - 19:00


Good evening, World! в 19:00 - 23:00


Good night, World! в 23:00 - 06:00


Код должен содержать все возможные юнит-тесты и создавать читабельный лог файл.


Выводящиеся на консоль сообщения должны быть получены из message resource и зависеть от системной локали пользователя. Сделать перевод на русский язык.	


Код решения должен быть опубликован на GitHub’е без упоминания названия компании. 
В README должен присутствовать статус сборки от Travis CI (https://docs.travis-ci.com/user/status-images/) или Circle CI (https://circleci.com/docs/status-badges) в виде бейджика, по клику на который происходит переход на страницу сборки. Сборка должна быть успешной, во время сборки должны проходить тесты. Пример проекта с бейджиками - https://github.com/codecentric/spring-boot-admin
