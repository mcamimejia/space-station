const db = require('../database/models');

const mainController = {
    home: (req,res) => {

        res.render("index");
   }

}
module.exports = mainController;