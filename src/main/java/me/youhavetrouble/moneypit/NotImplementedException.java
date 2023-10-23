package me.youhavetrouble.moneypit;

public class NotImplementedException extends UnsupportedOperationException {

    public NotImplementedException() {
        super("This feature is not implemented by the economy plugin.");
    }

}
