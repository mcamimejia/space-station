module.exports = (sequelize, dataTypes) => {
    let alias = 'Tripulada';
    let cols = {
        id: {
            type: dataTypes.INTEGER.UNSIGNED,
            primaryKey: true,
            autoIncrement: true,
            allowNull: false
        },
        name: {
            type: dataTypes.STRING(50),
            allowNull: false
        },
        country: {
            type: dataTypes.STRING(50)
        },
        activity_start: {
            type: dataTypes.INTEGER
        },
        activity_end: {
            type: dataTypes.INTEGER
        },
        fuel: {
            type: dataTypes.STRING(50)
        },
        capacity: {
            type: dataTypes.INTEGER
        },
        objective: {
            type: dataTypes.STRING(50)
        }
    };
    let config = {
        tableName: 'naves_tripuladas',
        timestamps: false
    }
    const Tripulada = sequelize.define(alias, cols, config); 
 
    return Tripulada
};