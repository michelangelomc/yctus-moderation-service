# yctus-moderation-service
---

## 🏗️ Microsserviço 2: ModerationService

## Estrutura do Projeto
- src
    - main
        - java
            - com.yctus.commentservice
                - api
                    - controller
                    - middleware
                - application
                    - enuns
                    - mappers
                    - models
                    - usecases
                    - utils
                - crosscuting
                    - utils
                - domain
                    - abstractions
                    - entities
                    - enuns
                    - gateways
                    - utils
        - infraestructure
            - configurations
            - dataproviders
            - filter
            - helthchecks
            - proper ties
            - utils


### 📡 Responsabilidades

- Expor endpoint REST para validação de comentários
- Validar se o texto contém palavras proibidas
- Manter lista de palavras proibidas em memória

### 🔌 Endpoints

```http
POST /api/moderate  # Validar comentário
```

### 🎮 Controller: ModerationController

#### `POST /api/moderate`
**Verifica se o texto possui palavras proibidas**

**Entrada (ModerationInput):**
```json
{
  "text": "string",
  "commentId": "UUID"
}
```

**Saída (ModerationOutput):**
```json
{
  "approved": true,
  "reason": "string"
}
```

**Resposta:**
- `200 OK` - aprovado ou reprovado

### 📦 DTOs

#### ModerationInput
```json
{
  "text": "string",
  "commentId": "UUID"
}
```

#### ModerationOutput
```json
{
  "approved": true,
  "reason": "string"
}
```

### ✔️ Regras de Validação

- 🚫 **Palavras Proibidas:** `["ódio", "xingamento"]`

### ⚙️ Requisitos Técnicos

- 💾 **Armazenamento:** Palavras proibidas em memória (lista fixa)

---
