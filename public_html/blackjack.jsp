<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <div class="dealerCards">
            <h2>Dealer</h2>
            ${blackJackBean.dealerString}
        </div>
        <div class="playerCards">
            <h2>Player</h2>
            ${blackJackBean.playerString}
            ${blackJackBean.latestMove}
            <%-- <form class="" action="/java112/blackjack" method="GET">
                <button type="button" name="hit" formaction="/java112/blackjack?playerMove=hit">HIT</button>
                <button type="button" name="stand" formaction="/java112/blackjack?playerMove=stand">STAND</button>
            </form> --%>
            <a href="/java112/blackjack?playerHit=hit&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">Hit Me!</a>
            <a href="/java112/blackjack?playerStand=stand&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">I'll Stand!</a>
        </div>
    </body>
</html>
