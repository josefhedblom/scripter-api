# Scriptomatic – En enkel manusformaterare

**Scriptomatic** är ett verktyg för manusförfattare som snabbt vill formatera text till manusformat med hjälp av [Fountain](https://fountain.io)-syntax. Appen är byggd för att vara snabb, enkel och flexibel – perfekt för att skapa ett första utkast du kan dela vidare.

---

## Varför?

Jag skriver själv manus, och jag saknade ett enkelt verktyg där jag snabbt kunde:

- Klistra in en scenidé
- Få den snyggt formaterad direkt
- Spara ner eller dela med andra
---

## Teknik

Appen består av två delar:

### Backend – Spring Boot + Fountain

- REST API byggt i Java (Spring Boot)
- Tar emot rå text i Fountain-format via `POST /api/parse`
- Returnerar HTML som manus

### Frontend – React + Vite

- En enkel, responsiv webapp
- Användaren kan:
    - Skriva eller ladda upp textfiler
    - Förhandsgranska formaterat manus
    - Exportera till PDF (via `html2pdf.js`)
- Använder proxy under utveckling för att undvika CORS

---

## Varför ett API?

Att ha ett fristående API gör det enkelt att:

- Bygga fler appar i framtiden (mobil, desktop, CLI)
- Dela formatteringstjänsten med andra användare
- Integrera med t.ex. molntjänster eller samarbetsplattformar

---
