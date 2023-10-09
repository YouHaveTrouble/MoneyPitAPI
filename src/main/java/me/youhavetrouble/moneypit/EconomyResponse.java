package me.youhavetrouble.moneypit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record EconomyResponse(
        long amount,
        long balance,
        @NotNull ResponseType type,
        @Nullable String message
) {

    /**
     * Checks if the transaction was successful
     *
     * @return true if the transaction was successful, false if not
     */
    public boolean isSuccessful() {
        return type == ResponseType.SUCCESS;
    }

    public enum ResponseType {
        SUCCESS,
        FAILURE,
        NOT_IMPLEMENTED,
    }

}
