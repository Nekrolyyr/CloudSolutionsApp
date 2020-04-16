# ![Lakeside Mutual Logo](../resources/logo-32x32.png) Lakeside Mutual: Customer Management Frontend

The Customer Management frontend allows Customer-Service operators to interact with customers and help them resolve issues related to
Lakeside Mutual's insurance products.

## Editor

To view and edit the source code, we recommend the cross-platform code editor [Visual Studio Code](https://code.visualstudio.com/). Other IDEs might work as well, but this application has only been tested with VS Code. The code that calls the backend APIs can be found in the source files in [src/redux-rest-easy](src/redux-rest-easy).

## Installation

The Customer Management frontend is a [React](https://reactjs.org/) application and its dependencies are managed with an [npm package](https://www.npmjs.com/) as indicated by the `package.json` file. To get started, first install [Node.js](https://nodejs.org) (which includes npm) and then use npm to install the application's dependencies (which includes React):

1.  Install Node.js (see [https://nodejs.org](https://nodejs.org) for installation instructions)
2.  In the directory where this README is located, run `npm install` to install the application's dependencies into the local `node_modules` folder. Warnings about missing optional dependencies can safely be ignored.

Now you are ready to launch the Customer Management frontend.

## Launch Application

First you need to start the Customer Management backend and the Customer Self-Service backend, because the Customer Management frontend depends on these two services. For instructions on how to start these two services, consult their respective README files.

Run the command `npm start` in order to launch the Customer Management frontend. This will start a development server and automatically loads the application's home page (http://localhost:3020/ by default) in a new browser tab. By default, the application starts on port 3020. If this port is already used by a different application, you can change it in the `.env` file.

To stop the application press `Ctrl+C` in the shell that was used to start the application and close the corresponding browser tab. Note that this only stops the Customer Management frontend but not the Customer Self-Service backend or the Customer Management backend.
