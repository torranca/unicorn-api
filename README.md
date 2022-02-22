# unicorn-api
Unicorn Bank API

    git push heroku main


https://unicorn-bank.herokuapp.com/


## Local Setup

    https://devcenter.heroku.com/articles/heroku-postgresql#local-setup

    export JDBC_DATABASE_URL=jdbc:postgresql://localhost:5432/alantorrance

## Local Testing

    curl -X GET http://localhost:8080/api/v1/account/123
    curl -X GET http://localhost:8080/api/v1/account/456
    
    curl -X POST http://localhost:8080/api/v1/payment -H 'Content-Type: application/json' -d '{"fromAccountId":"456","toAccountId":"123","amount":"10","currency":"USD","reference":"just testing"}'

    curl -X POST https://unicorn-bank.herokuapp.com/api/v1/payment -H 'Content-Type: application/json' -d '{"fromAccountId":"ZCWVWpL1VuRZyfy8ARF7kbCQxjx1","toAccountId":"123","amount":"10","currency":"USD","reference":"just testing"}'
    
    