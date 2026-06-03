/*
1. JavaScript Basics & Setup
Scenario: Set up your community portal to use JavaScript.
Objective: Configure environment and test basic script functionality.
Task:
• Use <script src="main.js"></script> in HTML
• Log "Welcome to the Community Portal" using console.log()
• Use an alert to notify when the page is fully loaded
*/
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Community Portal</title>

    <!-- External JS file simulation (included inside same file for single-code requirement) -->
    <script>
        // Log message in console
        console.log("Welcome to the Community Portal");

        // Alert when page is fully loaded
        window.onload = function () {
            alert("Page is fully loaded!");
        };
    </script>
</head>

<body>

    <h1>Community Portal</h1>

</body>
</html>