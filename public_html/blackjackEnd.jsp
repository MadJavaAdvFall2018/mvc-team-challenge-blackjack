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

            <a href="/java112/blackjack">Play Again</a><br />

            <h3>Bean Status</h3>
            <table>
                <tr>
                    <td>dealerString</td>
                    <td>${blackjackBean.dealerString}</td>
                </tr>
                <tr>
                    <td>playerString</td>
                    <td>${blackjackBean.playerString}</td>
                </tr>
                <tr>
                    <td>dealerScore</td>
                    <td>${blackjackBean.dealerScore}</td>
                </tr>
                <tr>
                    <td>playerScore</td>
                    <td>${blackjackBean.playerScore}</td>
                </tr>
                <tr>
                    <td>latestMove</td>
                    <td>${blackjackBean.latestMove}</td>
                </tr>
                <tr>
                    <td>gameOver</td>
                    <td>${blackjackBean.gameOver}</td>
                </tr>
            </table>

        </div>
    </body>
</html>
