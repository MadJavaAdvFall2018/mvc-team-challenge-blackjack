<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>

        <div class="cardTable">
            <h1>BlackJack</h1>

            ${blackJackBean.latestMove}<br />
            <br />

            <h2>Dealer Hand</h2>
            ${blackJackBean.dealerString}<br />
            Dealer score is ${blackJackBean.dealerScore}<br />

            <h2>Player Hand</h2>
            ${blackJackBean.playerString}<br />
            Player score is ${blackJackBean.playerScore}<br />
            <br />
            <br />

            <a href="/java112/blackjack?playerHit=hit&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">Hit Me!</a>
            <a href="/java112/blackjack?playerStand=stand&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">I'll Stand!</a>
        </div>
    </body>
</html>
