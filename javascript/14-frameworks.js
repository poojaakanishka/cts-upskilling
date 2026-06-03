/*
14. jQuery and JS Frameworks
Scenario: Use jQuery to simplify DOM tasks.
Objective: Understand and use jQuery.
Task:
• Use $('#registerBtn').click(...) to handle click events
• Use .fadeIn() and .fadeOut() for event cards
• Mention one benefit of moving to frameworks like React or Vue
*/
$(document).ready(function () {

    $("#registerBtn").click(function () {

        alert("Registration Successful!");

        $("#eventCard").fadeIn(1000);

        setTimeout(function () {
            $("#eventCard").fadeOut(1000);
        }, 2000);
    });

});

