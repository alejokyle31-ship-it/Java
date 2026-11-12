<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Personal Portfolio</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #EBFADC;
            color: #222;
        }

        .hero {
            background-color: white;
            text-align: center;
            padding: 40px 20px;
        }

        h1, h2, h3 {
            color: #07523d;
        }

        nav {
            background-color: #063c2d;
            padding: 15px;
            text-align: center;
        }

        nav a {
            color: white;
            text-decoration: none;
            padding: 15px;
            display: inline-block;
        }

        nav a:hover {
            background-color: #07523d;
        }

        main {
            max-width: 1000px;
            margin: 25px auto;
            padding: 15px;
        }

        section {
            background-color: white;
            padding: 25px;
            margin-bottom: 20px;
            border-radius: 10px;
        }

        .about {
            display: flex;
            align-items: center;
            gap: 25px;
        }

        .profile-picture {
            width: 200px;
            height: 200px;
            object-fit: cover;
            border: 3px solid #07523d;
            border-radius: 10px;
        }

        .projects {
            display: grid;
            grid-template-columns: repeat(2, 1fr);
            gap: 15px;
        }

        .project-card {
            background-color: #f1f7ed;
            padding: 18px;
            border-left: 5px solid #07523d;
            border-radius: 6px;
        }

        .project-card a {
            color: #07523d;
            font-weight: bold;
        }

        footer {
            background-color: #063c2d;
            color: white;
            padding: 20px;
            text-align: center;
        }

        @media (max-width: 600px) {
            .about {
                flex-direction: column;
                align-items: flex-start;
            }

            .projects {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>

<body>

    <div class="hero" id="home">
        <h1>My Personal Portfolio</h1>
        <p>Welcome to my website!</p>
    </div>

    <nav>
        <a href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#projects">Projects</a>
        <a href="#contact">Contact</a>
    </nav>

    <main>

        <section id="about">
            <div class="about">

                <img class="profile-picture"
                     src="Profilepic.jpeg"
                     alt="My Profile Picture">

                <div>
                    <h2>About Me</h2>

                    <p>
                        Hello! My name is
                        <strong>Kyle Andrei S. Alejo</strong>.
                    </p>

                    <p>
                        I am an IT student learning about computers,
                        programming, and web development.
                    </p>

                    <p>
                        I am also a player of the OLSCHO men's
                        volleyball team.
                    </p>

                    <p>
                        My goal is to improve my programming skills
                        and become a better IT student.
                    </p>
                </div>

            </div>
        </section>

        <section id="projects">
            <h2>My Projects</h2>

            <div class="projects">

                <div class="project-card">
                    <h3>My Profile Website</h3>
                    <p>
                        A personal website created using HTML and CSS.
                    </p>
                    <a href="prof.html">Visit Profile Website</a>
                </div>

                <div class="project-card">
                    <h3>Smart Student Helper</h3>
                    <p>
                        A Java program with a multiplication table,
                        palindrome checker, age calculator,
                        diamond pattern, and SDG messages.
                    </p>
                    <a href="SmartStudentHelper.java" download>
                        Download Java Code
                    </a>
                </div>

                <div class="project-card">
                    <h3>Zodiac Sign Checker</h3>
                    <p>
                        Checks a person's zodiac sign using
                        their birth month and date.
                    </p>
                    <a href="zodiac.java" download>
                        Download Java Code
                    </a>
                </div>

                <div class="project-card">
                    <h3>Grade Checker</h3>
                    <p>
                        Displays a message based on the
                        letter grade entered by the user.
                    </p>
                    <a href="GRADING.java" download>
                        Download Java Code
                    </a>
                </div>

                <div class="project-card">
                    <h3>Food Menu Calculator</h3>
                    <p>
                        Displays a food menu and calculates
                        the price based on the selected food
                        and quantity.
                    </p>
                    <a href="food.java" download>
                        Download Java Code
                    </a>
                </div>

            </div>
        </section>

        <section id="contact">
            <h2>Contact Me</h2>

            <p>
                Email:
                <a href="mailto:yourname@example.com">
                    yourname@example.com
                </a>
            </p>

            <p>
                Facebook:
                <a href="https://www.facebook.com/"
                   target="_blank">
                    Visit My Facebook
                </a>
            </p>

            <p>Thank you for visiting my portfolio!</p>
        </section>

    </main>

    <footer>
        <p>CC101 - INTRODUCTION TO COMPUTING</p>
        <p>My Personal Portfolio</p>
    </footer>

</body>
</html>