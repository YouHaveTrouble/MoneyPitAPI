package me.youhavetrouble.moneypit;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * An entry for balance top list
 * @param id ID of the player
 * @param displayName display name of the player
 * @param place place of the player in the balance top list. Should be 1-indexed.
 * @param balance balance of the player's account
 */
public record BaltopEntry(@NotNull UUID id, @NotNull String displayName, int place, long balance) {

    /**
     * ID of the player
     * @return ID of the player
     */
    @Override
    public @NotNull UUID id() {
        return id;
    }

    /**
     * Display name of the player
     * @return display name of the player
     */
    @Override
    public @NotNull String displayName() {
        return displayName;
    }

    /**
     * Place of the player in the balance top list
     * @return place of the player in the balance top list
     */
    @Override
    public int place() {
        return place;
    }

    /**
     * Balance of the player
     * @return balance of the player's account
     */
    @Override
    public long balance() {
        return balance;
    }

}
