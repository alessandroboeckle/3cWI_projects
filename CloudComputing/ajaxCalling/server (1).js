var express = require('express'); // handles requests + responses
var path = require('path'); // path module provides utilities for working with file and directory paths
var bodyParser = require('body-parser'); //needed to parse request params

// create app
var app = express();

// configure app
// Serve Static Assets
app.use(express.static('public'));
app.use(express.json());
app.use(express.urlencoded({extended: true})) // for parsing application/x-www-form-urlencoded

const PORT = process.env.PORT || 8080;

// Serve Static Assets
app.use(express.static('public'));

//HTTP POST
app.post('/sayhello', function (req, res) {
    console.log("body: " + JSON.stringify(req.body));
    console.log("name: " + req.body.name);

    // Prepare output in JSON format
    var response = {
        name: req.body.name,
        salutation: 'Hello'
    };

    res.end(JSON.stringify(response));
});

//HTTP POST 2
app.post('/age', function (req, res) {
    console.log("body: " + JSON.stringify(req.body));
    console.log("age: " + req.body.age);

    // Prepare output in JSON format
    var response = {
        age: req.body.age,
        salutation: 'Dein Alter:'
    };

    res.end(JSON.stringify(response));
});

//HTTP POST for calculation of the body-mass-index
app.post('/bmi', function (req, res) {
    console.log("body: " + JSON.stringify(req.body));

    var weight = req.body.weight;
    var height = req.body.height;
    var bmi = weight / ((height / 100) * (height / 100));

    // Prepare output in JSON format
    var response = {
        height: height,
        weight: weight,
        bmi: bmi
    };

    res.end(JSON.stringify(response));
});

app.listen(PORT, () => {
    console.log('Server connected at:', PORT);
});
