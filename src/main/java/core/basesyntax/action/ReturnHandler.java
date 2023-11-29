package core.basesyntax.action;

import core.basesyntax.dao.StorageDao;
import core.basesyntax.dao.StorageDaoImpl;

public class ReturnHandler implements ActionHandler {
    private final StorageDao storageDao;

    public ReturnHandler() {
        this.storageDao = new StorageDaoImpl();
    }

    @Override
    public int performAction(String fruitName, int amount) {
        return storageDao.get(fruitName) + amount;
    }
}
