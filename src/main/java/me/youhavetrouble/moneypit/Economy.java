package me.youhavetrouble.moneypit;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Economy interface for MoneyPitAPI
 */
public interface Economy {

    /**
     * Check if the economy is enabled
     * @return true if enabled, false if not
     */
    boolean isEnabled();

    /**
     * Get the name of the economy
     * @return name of the economy
     */
    String getName();

    /**
     * Format an amount of money
     * @param amount amount to format
     * @return formatted amount
     */
    String format(long amount);

    /**
     * Get the balance of a player
     * @param id UUID
     * @return CompletableFuture of the balance
     */
    CompletableFuture<Long> getBalance(@NotNull UUID id);

    /**
     * Deposit money into a player's account. Negative amounts should be clamped to 0.
     * @param id UUID
     * @param amount amount to deposit
     * @return CompletableFuture of the response
     */
    CompletableFuture<EconomyResponse> deposit(@NotNull UUID id, long amount);

    /**
     * Withdraw money from a player's account. Negative amounts should be clamped to 0.
     * @param id UUID
     * @param amount amount to withdraw
     * @return CompletableFuture of the response
     */
    CompletableFuture<EconomyResponse> withdraw(@NotNull UUID id, long amount);

    /**
     * Set the balance of a player's account. Negative amounts should be clamped to 0.
     * @param id UUID
     * @param amount amount to set
     * @return CompletableFuture of the response
     */
    CompletableFuture<EconomyResponse> setBalance(@NotNull UUID id, long amount);

    /**
     * Check if a player has at least a certain amount of money
     * @param id UUID
     * @param amount amount to check
     * @return CompletableFuture of the response
     */
    CompletableFuture<Boolean> has(@NotNull UUID id, long amount);


    /**
     * Returns a list of the top balances with an optional page number
     * @param page page number
     * @param size size of the page
     * @throws NotImplementedException if the economy plugin does not support this feature
     * @return CompletableFuture of the list of top balances
     */
    CompletableFuture<List<BaltopEntry>> getBaltop(int page, int size) throws NotImplementedException;

    /**
     * Returns a list of the top balances
     * @param size size of the page
     * @throws NotImplementedException if the economy plugin does not support this feature
     * @return CompletableFuture of the list of top balances
     */
    CompletableFuture<List<BaltopEntry>> getBaltop(int size) throws NotImplementedException;

}
