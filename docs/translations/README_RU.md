<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://ninjaenterprise.github.io/AdminService/">AdminService</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/NinjaEnterprise/AdminService/blob/master/docs/README.md">
        <img alt="english-version" src="https://raw.githubusercontent.com/NinjaEnterprise/AdminService/master/assets/languages/english.png"/>
    </a>
</div>

<div align="center">
    <img src="https://img.shields.io/github/last-commit/NinjaEnterprise/AdminService" height="25" alt="last-commit" />
    <img src="https://wakatime.com/badge/github/NinjaEnterprise/AdminService.svg" height="25" alt="time-with-code" />
    <img src="https://tokei.rs/b1/github/NinjaEnterprise/AdminService?category=code" height="25" alt="code-lines" />
    <img src="https://sonarcloud.io/api/project_badges/measure?project=NinjaEnterprise_AdminService&metric=bugs" height="25" alt="sonar-cloud-bugs" />
    <img src="https://github.com/NinjaEnterprise/AdminService/actions/workflows/check-style.yml/badge.svg" height="25" alt="checking-style" />
    <img src="https://github.com/NinjaEnterprise/AdminService/actions/workflows/sonar.yml/badge.svg" height="25" alt="checking-sonar" />
    <img src="https://github.com/NinjaEnterprise/AdminService/actions/workflows/building.yml/badge.svg" height="25" alt="build" />
</div>

### 📖 Описание
___

Сервис администрирования, просмотра метрик и другой дополнительной информации о сервисах.

### ❗ Требования
___

* **JDK**: 17 и выше;

### 📋 Инструкции по запуску
___

*Все команды выполняются в консоли. Для всех действий можно использовать IDE, но кто это знает — тот так и будет делать
и инструкция ему не нужна.*
<details style="margin-left: 40px">	
   <summary><b>Клонирование репозитория</b></summary>

1. Создаем папку: `mkdir GitProjects` (имя папки может быть любым, но вам нужно будет продолжать использовать только
   его);
2. Переходим в папку: `cd GitProjects`;
3. Клонируем репозиторий: `git clone https://github.com/NinjaEnterprise/AdminService.git`;
4. Переходим в созданную папку: `cd AdminService`;
5. Выполнено.
</details>

<details style="margin-left: 40px">	
   <summary><b>Сборка проекта</b></summary>

  <i>После клонирования репозитория - мы уже должны быть в папке проекта.</i> Мы выполняем команду:
  <code>mvn clean install</code>.
</details>

<details style="margin-left: 40px">	
   <summary><b>Запуск приложения</b></summary>

   После сборки приложения выполните команду: <code>mvn spring-boot:run</code>. <b>Стандартный порт: 8777</b>.
</details>

### ⚙ Включает функциональность
___

- Показ метрик клиентских сервисов;
- Отображение общей информации о клиентских сервисах.

### 🔨 Стек технологий
___

- Spring Boot: WEB;
- Spring Cloud: Config client, Eureka client;
- Lombok.

### 🎫 Лицензия
___

**[MIT](https://github.com/NinjaEnterprise/AdminService/blob/master/LICENSE)**

_Copyright ©2021, Владислав [[Bangerok]](https://github.com/Bangerok) Кузнецов_