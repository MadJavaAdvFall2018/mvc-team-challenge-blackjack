<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <div class="cardTable">
            <%@ include file="blackjackTable.jsp"%>

            <a href="/java112/blackjack">Play Again</a><br />

            <h3>Bean Status</h3>
            <table>
                <tr>
                    <td>dealerString</td>
                    <td>${blackJackBean.dealerString}</td>
                </tr>
                <tr>
                    <td>playerString</td>
                    <td>${blackJackBean.playerString}</td>
                </tr>
                <tr>
                    <td>dealerScore</td>
                    <td>${blackJackBean.dealerScore}</td>
                </tr>
                <tr>
                    <td>playerScore</td>
                    <td>${blackJackBean.playerScore}</td>
                </tr>
                <tr>
                    <td>latestMove</td>
                    <td>${blackJackBean.latestMove}</td>
                </tr>
                <tr>
                    <td>gameOver</td>
                    <td>${blackJackBean.gameOver}</td>
                </tr>
            </table>

        </div>
    </body>
</html>
