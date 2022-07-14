var express = require('express');
var router = express.Router();
const mainController = require('../controllers/mainController');

router.get('/', mainController.home); // Get home
router.get('/create', mainController.creationForm); // Get Creation form
router.get('/lanzaderas/:id', mainController.detailsLanzadera); // Get details Lanzaderas
router.get('/roboticas/:id', mainController.detailsRobotica); // Get details Roboticas
router.get('/tripuladas/:id', mainController.detailsTripulada); // Get details Tripuladas
router.get('/:category', mainController.byCategory); // Get by category

router.post('/create', mainController.create); // Creation process

module.exports = router;
