<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Login Success</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

    <style>
        body {
            background: linear-gradient(135deg, #f5f7fa, #e4ecf5);
        }

        .success-card {
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            background: black;
            animation: fadeIn 0.8s ease-in-out;
        }

        .logo {
            width: 220px;
        }

        .nav-logo {
            height: 50px;
            padding-left: 2rem;
        }

        .success-icon {
            font-size: 60px;
            color: #28a745;
            animation: pop 0.6s ease;
        }

        @keyframes pop {
            0% {
                transform: scale(0.5);
                opacity: 0;
            }

            100% {
                transform: scale(1);
                opacity: 1;
            }
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }

            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>

</head>

<body>

    <!-- Navbar Start -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">

            <!-- Logo Left -->
            <a class="navbar-brand" href="#">
                <img src="https://media.licdn.com/dms/image/v2/C5112AQHkJieIgr_a7A/article-cover_image-shrink_720_1280/article-cover_image-shrink_720_1280/0/1569825714486?e=2147483647&v=beta&t=EWt2sBbhUOHhU_GuIDFBUtnw9tFRpam6Ofb-Hze-lJ4"
                    class="nav-logo">
            </a>

            <!-- Navbar Title -->
            <span class="navbar-text text-white fw-bold ms-2">
                Xworkz
            </span>

        </div>
    </nav>
    <!-- Navbar End -->

    <div class="container vh-100 d-flex justify-content-center align-items-center">

        <div class="success-card text-center">

            <img src="https://media.licdn.com/dms/image/v2/C5112AQHkJieIgr_a7A/article-cover_image-shrink_720_1280/article-cover_image-shrink_720_1280/0/1569825714486?e=2147483647&v=beta&t=EWt2sBbhUOHhU_GuIDFBUtnw9tFRpam6Ofb-Hze-lJ4"
                class="logo mb-3">

            <div class="success-icon mb-3">
                <i class="fa-solid fa-circle-check"></i>
            </div>

            <h2 class="text-success fw-bold">Login Successful</h2>

            <p class="text-white">Welcome to the Xworkz.</p>

        </div>

    </div>

</body>

</html>