
# Invest Simples 💰📊

Invest Simples é uma plataforma de **educação financeira** e **simulação de investimentos** que oferece ao usuário uma experiência visual, prática e personalizada sobre o mundo das finanças.

## 🔧 Tecnologias

- Java 17
- Spring Boot
- HTML5, CSS3, JS (protótipos Figma)
- REST APIs
- Alpha Vantage API
- Vercel (hospedagem front-end)
- Docker (planejado para produção)
- Banco de Dados: PostgreSQL ou MongoDB (em fase de definição)

## 📂 Estrutura do Projeto

src/
├── controller/
│   └── AlphaVantageApiController.java
├── service/
│   └── AlphaVantageService.java
├── domain/
│   ├── CurrencyExchangeRate.java
│   └── Wallet.java
├── utils/
│   └── Assets.java

## 🚀 Executando localmente

1. Clone o projeto
```bash
git clone https://github.com/seu-usuario/invest-simples.git
```

2. Configure seu `application.yml` com sua chave AlphaVantage
```yaml
alpha:
  base-url: https://www.alphavantage.co/query
  apikey: SUA_CHAVE_API
```

3. Rode a aplicação
```bash
./mvnw spring-boot:run
```

## 🛠 Endpoints

- `GET /v1/alpha-vantage-api` → retorna cotação de moeda configurada

## 📈 Funcionalidades Futuras

- Integração com base de dados de usuários
- Login com OAuth (Google, Facebook)
- Plano de estudo gamificado por perfil
- API para recomendação de ativos
