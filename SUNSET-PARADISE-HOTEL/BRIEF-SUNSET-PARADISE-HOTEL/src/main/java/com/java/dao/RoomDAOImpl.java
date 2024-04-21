package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.beans.Room;

public class RoomDAOImpl implements RoomDAO {
	
	public static void statementRoom(ArrayList<Room> arrayRoom, PreparedStatement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {;
			Integer id = (resultSet.getInt("roomId"));
            String type =  (resultSet.getString("roomType"));
            Integer price = (resultSet.getInt("roomPrice"));
            Integer capacity = (resultSet.getInt("roomCapacity"));
            String equipement = (resultSet.getString("roomequipement"));
            Boolean availability = (resultSet.getBoolean("roomAvailability"));
            String picture = (resultSet.getString("roomPicture"));
            arrayRoom.add(new Room(id, type, price, capacity, equipement, availability, picture));
        }
    }

	@Override
	public ArrayList<Room> getDataRoom() throws SQLException, ClassNotFoundException {
		ArrayList<Room> arrayRoom = new ArrayList<>();
        Connection connection = ConnectionDAO.getConnection();
        String getDataRoom = "SELECT * FROM room";
        PreparedStatement statement = connection.prepareStatement(getDataRoom);
        statementRoom(arrayRoom, statement);
        connection.close();
        statement.close();
        return arrayRoom;
	}

	@Override
	public ArrayList<Room> searchAvailableRoom(String roomType, Integer roomCapacity) throws ClassNotFoundException, SQLException{
		ArrayList<Room> arrayRoom = new ArrayList<>();
        Connection connection = ConnectionDAO.getConnection();
        String SearchAvailableRoom = "SELECT * FROM room WHERE roomAvailability = ? AND (roomType LIKE ?  OR roomCapacity = ?)";
        PreparedStatement statement = connection.prepareStatement(SearchAvailableRoom);
        statement.setBoolean(1, true);
        statement.setString(2, "%" + roomType + "%");
        statement.setInt(3, roomCapacity);
        statementRoom(arrayRoom, statement);
        connection.close();
        statement.close();
		return arrayRoom;
	}
	
	
}

