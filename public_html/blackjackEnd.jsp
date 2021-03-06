<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link href="default.css" rel="stylesheet" type="text/css" />
        <title>Game's over, folks.</title>
    </head>
    <body>
        <div id="content">
            <div id="posts">
                <div id=post>
                    <h2 class="title" id="Unit2">
                        Unit 2
                    </h2>
                    <div class="cardTable story">
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
                        <h3>App Diagram</h3>
                        <img src="/java112/images/diagram.png" />
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
