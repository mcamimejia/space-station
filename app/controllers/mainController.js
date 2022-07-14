const db = require('../database/models');

const mainController = {
    home: (req,res) => {
        let lanzaderasPromise = db.Lanzadera.findAll({
            limit: 3
        });
        let roboticasPromise = db.Robotica.findAll({
            limit: 3
        });
        let tripuladasPromise = db.Tripulada.findAll({
            limit: 3
        });

        Promise.all([lanzaderasPromise, roboticasPromise, tripuladasPromise])
            .then(([lanzaderas, roboticas, tripuladas]) => {
                res.render("index", {lanzaderas, roboticas, tripuladas});
            })
    },

    creationForm: (req,res) => {

        let categories = ['lanzaderas', 'roboticas', 'tripuladas'];

        res.render("creationForm", {categories});
    },

    detailsLanzadera: (req,res) => {
        db.Lanzadera.findByPk(req.params.id)
            .then(data => {
                res.render("details", {data});
            })
    },

    detailsRobotica: (req,res) => {
        db.Robotica.findByPk(req.params.id)
            .then(data => {
                res.render("details", {data});
            })
    },

    detailsTripulada: (req,res) => {
        db.Tripulada.findByPk(req.params.id)
            .then(data => {
                res.render("details", {data});
            })
    },

    byCategory: (req,res) => {
        let category = req.params.category;
        switch (category) {
            case "lanzaderas":
            db.Lanzadera.findAll()
                .then((data) => {
                    res.render("navesByCategory", {data, category});
                })
            break;

            case "roboticas":
            db.Robotica.findAll()
                .then((data) => {
                    res.render("navesByCategory", {data, category});
                })
            break;

            case "tripuladas":
            db.Tripulada.findAll()
                .then((data) => {
                    res.render("navesByCategory", {data, category});
                })
            break
        }
    },

    create: (req,res) => {
        categorySelected = req.body.category;
        switch (categorySelected){
            case "lanzaderas":
                db.Lanzadera
                    .create({
                        name: req.body.name,
                        country: req.body.country,
                        activity_start: req.body.activity_start,
                        activity_end: req.body.activity_end,
                        fuel: req.body.fuel,
                        cargo: req.body.cargo
                    })
                    .then(result => {
                        res.redirect('/')
                    })
            break;

            case "roboticas":
                db.Robotica
                    .create({
                        name: req.body.name,
                        country: req.body.country,
                        activity_start: req.body.activity_start,
                        activity_end: req.body.activity_end,
                        fuel: req.body.fuel,
                        research: req.body.research
                    })
                    .then(result => {
                        res.redirect('/')
                    })
            break;

            case "tripuladas":
                db.Tripulada
                    .create({
                        name: req.body.name,
                        country: req.body.country,
                        activity_start: req.body.activity_start,
                        activity_end: req.body.activity_end,
                        fuel: req.body.fuel,
                        capacity: req.body.capacity,
                        objective: req.body.objective
                    })
                    .then(result => {
                        res.redirect('/')
                    })
            break;
        }
    }

}
module.exports = mainController;