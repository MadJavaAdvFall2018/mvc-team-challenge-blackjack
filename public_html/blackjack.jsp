<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>

        <div class="cardTable">
            <%@ include file="blackjackTable.jsp"%>

            <a href="/java112/blackjack?playerHit=hit&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">Hit Me!</a>
            <a href="/java112/blackjack?playerStand=stand&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">I'll Stand!</a>
        </div>
    </body>
</html>
