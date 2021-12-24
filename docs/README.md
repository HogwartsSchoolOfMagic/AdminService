<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h1>
        <a href="https://ninjaenterprise.github.io/AdminService/">AdminService</a>
    </h1>
</div>

<div align="center">
    <a href="https://github.com/NinjaEnterprise/AdminService/blob/master/docs/translations/README_RU.md">
        <img alt="russian-version" src="https://raw.githubusercontent.com/NinjaEnterprise/AdminService/master/assets/languages/russian.png"/>
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

### 📖 Description
___

Administration service, viewing metrics and other additional information about services.

### ❗ Requirements
___

* **JDK**: 17 and higher;

### 📋 Start-up instructions
___

*All commands are executed in the console. For all actions, you can use the IDE, but who knows about it — and
will do it, the instruction is not needed.*
<details style="margin-left: 40px">	
   <summary><b>Clone Repository</b></summary>

   <ol>
      <li>Create a folder: <code>mkdir GitProjects</code> (the folder name can be anything, but you will need to 
      continue to use only it);</li>
      <li>Go to the folder: <code>cd GitProjects</code>;</li>
      <li>Cloning a repository: <code>git clone https://github.com/NinjaEnterprise/AdminService.git</code>;</li>
      <li>Go to the folder: <code>cd AdminService</code>.</li>
      <li>Complete.</li>
   </ol>
</details>

<details style="margin-left: 40px">	
   <summary><b>Build Code</b></summary>

   <i>After cloning the repository — we should already be in the project folder.</i> We execute the command:
   <code>mvn clean install</code>.
</details>

<details style="margin-left: 40px">	
   <summary><b>Application launch</b></summary>

   After building the application, execute the command: <code>mvn spring-boot:run</code>. <b>Default port: 8777</b>.
</details>

### ⚙ Includes functionality
___

- Show client service metrics;
- Displaying information about client services.

### 🔨 Technology stack
___

- Spring Boot: WEB;
- Spring Cloud: Config client, Eureka client;
- Lombok.

### 🎫 License
___

**[MIT](https://github.com/NinjaEnterprise/ConfigurationService/blob/master/LICENSE)**

_Copyright ©2021, Vladislav [[Bangerok]](https://github.com/Bangerok) Kuznetsov_