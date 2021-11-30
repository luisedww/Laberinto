 package Laberinto;
  3: 
  4: import java.awt.*;
  5: import javax.swing.*;
  6: 
  7: /
 15:  *
 16:  *  
 22: public class Laberinto { 
 23: 
 24:   /**
 25:    *  Creates a small maze with 2 rooms. 
 26:    */ 
 27:   public static Maze createMaze() { 
 28:     Maze maze = new Maze(); 
 29:     Room room1 = new Room(1); 
 30:     Room room2 = new Room(2); 
 31:     Door door = new Door(room1, room2);
 32: 
 33:     room1.setSide(Direction.NORTH, new Wall());
 34:     room1.setSide(Direction.EAST, door);
 35:     room1.setSide(Direction.SOUTH, new Wall());
 36:     room1.setSide(Direction.WEST, new Wall());
 37:     
 38:     room2.setSide(Direction.NORTH, new Wall());
 39:     room2.setSide(Direction.EAST, new Wall());
 40:     room2.setSide(Direction.SOUTH, new Wall());
 41:     room2.setSide(Direction.WEST, door);
 42: 
 43:     maze.addRoom(room1);
 44:     maze.addRoom(room2);
 45: 
 46:     return laberinto; 
 47:   }
 48: 
 49:   /**
 50:    *  Crea un laberinto de 9 cuadros. 
 51:    */ 
 52:   public static Maze createLargeMaze() { 
 53:     Maze maze = new Maze(); 
 54:     Room room1 = new Room(1); 
 55:     Room room2 = new Room(2); 
 56:     Room room3 = new Room(3); 
 57:     Room room4 = new Room(4); 
 58:     Room room5 = new Room(5); 
 59:     Room room6 = new Room(6); 
 60:     Room room7 = new Room(7); 
 61:     Room room8 = new Room(8); 
 62:     Room room9 = new Room(9); 
 63:     Door door1 = new Door(room1, room2);
 64:     Door door2 = new Door(room2, room3);
 65:     Door door3 = new Door(room4, room5);
 66:     Door door4 = new Door(room5, room6);
 67:     Door door5 = new Door(room5, room8);
 68:     Door door6 = new Door(room6, room9);
 69:     Door door7 = new Door(room7, room8);
 70:     Door door8 = new Door(room1, room4);