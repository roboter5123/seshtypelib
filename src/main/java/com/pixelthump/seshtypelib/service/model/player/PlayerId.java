package com.pixelthump.seshtypelib.service.model.player;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class PlayerId implements Serializable {

    private String playerName;
    private String seshCode;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof PlayerId playerId)) return false;
        return Objects.equals(playerName, playerId.playerName) && Objects.equals(seshCode, playerId.seshCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playerName, seshCode);
    }
}