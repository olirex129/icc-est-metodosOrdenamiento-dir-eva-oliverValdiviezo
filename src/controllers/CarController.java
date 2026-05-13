package controllers;

import models.Car;

public class CarController {

  // metodo burbuja avanzado
  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      boolean swap = false;
      for (int j = 0; j < cars.length - 1; j++) {
        if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0) {
          swap = true;
          Car aux = cars[j];
          cars[j] = cars[j + 1];
          cars[j + 1] = aux;

        }

      }
      if (!swap) {
        break;
      }

    }

  }

  public void sortByYear(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      boolean swap = false;
      for (int j = 0; j < cars.length - 1; j++) {
        if (cars[j].getYear() > cars[j + 1].getYear()) {
          swap = true;
          Car aux = cars[j];
          cars[j] = cars[j + 1];
          cars[j + 1] = aux;

        }

      }
      if (!swap) {
        break;
      }

    }

  }

}
