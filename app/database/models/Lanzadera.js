module.exports = (sequelize, dataTypes) => {
    let alias = 'Lanzadera';
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
        cargo: {
            type: dataTypes.STRING(50)
        }
    };
    let config = {
        tableName: 'naves_lanzaderas',
        timestamps: false
    }
    const Lanzadera = sequelize.define(alias, cols, config); 
 
    return Lanzadera
};