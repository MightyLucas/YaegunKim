import express from "express";
import path from "path";

const server = express();
const port = process.env.PORT || 8080;

server.get('/', function (req, res) {
    res.sendFile(path.join(__dirname, 'public/index.html'));
});

server.get('/login', function (req, res) {
    res.sendFile(path.join(__dirname, 'public/login.html'));
});


server.listen(port, () => console.log('Server started at http://localhost:' + port));

