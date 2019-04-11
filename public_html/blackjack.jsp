<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link href="default.css" rel="stylesheet" type="text/css" />
        <title>Let's play some blackjack!</title>
    </head>
    <body>
        <div id="content">
            <div id="posts">
                <div id="post">
                    <div class="cardTable">
                        <%@ include file="blackjackTable.jsp"%>

                        <a href="/java112/blackjack?playerHit=hit&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">Hit Me!</a>
                        <a href="/java112/blackjack?playerStand=stand&dealerHand=${blackJackBean.dealerString}&playerHand=${blackJackBean.playerString}">I'll Stand!</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
