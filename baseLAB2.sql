-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`seguro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`seguro` (
  `idseguro` INT NOT NULL,
  `empresa_aseguradora` VARCHAR(45) NOT NULL,
  `cobertura_maxima` DOUBLE NOT NULL,
  `tarifa` DOUBLE NOT NULL,
  PRIMARY KEY (`idseguro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`sede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`sede` (
  `idsede` INT NOT NULL,
  `distrito` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idsede`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`auto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`auto` (
  `idauto` INT NOT NULL,
  `modelo` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `kilometraje` INT NOT NULL,
  `costo_por_dia` DOUBLE NOT NULL,
  `sede_idsede` INT NOT NULL,
  PRIMARY KEY (`idauto`),
  INDEX `sede_idsede_idx` (`sede_idsede` ASC) VISIBLE,
  CONSTRAINT `sede_idsede`
    FOREIGN KEY (`sede_idsede`)
    REFERENCES `mydb`.`sede` (`idsede`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
