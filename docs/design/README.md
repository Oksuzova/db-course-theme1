# Проєктування бази даних

## Модель бізнес-об'єктів

<div style="
    border-radius:4px;
    border: 1px solid #cfd7e6;
    box-shadow: 0 1px 3px 0 rgba(89,105,129,.05), 0 1px 1px 0 rgba(0,0,0,.025);
    padding: 1em; text-align: center;"
>

@startuml

entity Role
entity Role.id
entity Role.name

entity User
entity User.id
entity User.nickname
entity User.email
entity User.password
entity User.roleId

entity Survey
entity Survey.id
entity Survey.name
entity Survey.startDate
entity Survey.endDate

entity AssignedSurvey
entity AssignedSurvey.surveyId
entity AssignedSurvey.userId

entity Question
entity Question.id
entity Question.description
entity Question.number
entity Question.survey

entity Answer
entity Answer.id
entity Answer.option
entity Answer.questionId

entity Statistic
entity Statistic.id
entity Statistic.surveyId

Role.id --r-* Role
Role.name --r-* Role

User.id --u-* User
User.nickname --u-* User
User.password --u-* User
User.email --u-* User
User.roleId --u-* User

Survey.id --d-* Survey
Survey.name --d-* Survey
Survey.startDate --d-* Survey
Survey.endDate --d-* Survey

AssignedSurvey.surveyId --d-* AssignedSurvey
AssignedSurvey.userId --d-* AssignedSurvey

Question.id --d-* Question
Question.description --d-* Question
Question.number --d-* Question
Question.survey --d-* Question

Answer.id --u-* Answer
Answer.option --u-* Answer
Answer.questionId --u-* Answer

Statistic.id --u-* Statistic
Statistic.surveyId --u-* Statistic

User "0,*" -l- "1" Role
Survey "0,*" -- "1" User
Survey "1" -l- "1,3" Question
Survey "1" -r- "0,*" AssignedSurvey
Question "1,3" -- "1" Answer
Survey "1" -- "1" Statistic

@enduml

</div>

<div style="border-radius:4px; border: 1px solid #cfd7e6; box-shadow: 0 1px 3px 0 rgba(89,105,129,.05), 0 1px 1px 0 rgba(0,0,0,.025); padding: 1em;">

@startuml

entity Role {
id: INT
name: TEXT
}

entity User {
id: INT
nickname: TEXT
email: TEXT
password: TEXT
roleId: INT
}

entity Survey {
id: INT
name: TEXT
startDate: DATE
endDate: DATE
}

entity AssignedSurvey {
surveyId: INT
userId: INT
}

entity Question {
id: INT
description: TEXT
number: NUMBER
surveyId: INT
}

entity Answer {
id: INT
option: TEXT
questionId: INT
}

entity Statistic {
id: INT
surveyId: INT
}

User "0," -d- "1" Role : roleId
Survey "0," -r- "1" User
Survey "1" -l- "1,3" Question : surveyId
Survey "1" -u- "0,*" AssignedSurvey : surveyId
Question "1,3" -- "1" Answer : questionId
Survey "1" -- "1" Statistic : surveyId

@enduml

</div>

