package db;

import java.io.Serial;

public class DbException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -3430405503576804979L;

    public DbException(String msg){
        super(msg);
    }
}
