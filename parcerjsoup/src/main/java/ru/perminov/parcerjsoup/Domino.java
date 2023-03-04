package ru.perminov.parcerjsoup;

//ДРУГОЙ КЛАСС
public class Domino {
  private String nameOfPosition;
  private String price;
  private String image;

  public void setNameOfPosition(String nameOfPosition) {
    this.nameOfPosition = nameOfPosition;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "Domino{" +
        "Название позиции = '" + nameOfPosition + '\'' +
        " - цена = '" + price + '\'' +
        " - ссылка на картинку = '" + image + '\'' +
        '}';
  }
}
