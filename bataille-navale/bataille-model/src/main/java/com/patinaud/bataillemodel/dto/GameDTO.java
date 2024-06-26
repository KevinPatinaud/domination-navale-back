package com.patinaud.bataillemodel.dto;

import com.patinaud.bataillemodel.constants.GameMode;
import com.patinaud.bataillemodel.constants.IdPlayer;

public class GameDTO {

    private String id;

    private GameMode mode;

    private IdPlayer idPlayerTurn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GameMode getMode() {
        return mode;
    }

    public void setMode(GameMode mode) {
        this.mode = mode;
    }

    public IdPlayer getIdPlayerTurn() {
        return idPlayerTurn;
    }

    public void setIdPlayerTurn(IdPlayer idPlayerTurn) {
        this.idPlayerTurn = idPlayerTurn;
    }

    public String toString() {
        return "idGame : " + getId() + ", idPlayerTurn : " + getIdPlayerTurn();
    }
}
