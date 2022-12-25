public class СSingleton {
    private static СSingleton instance;
    private СSingleton() {
    }

    public static СSingleton getInstance() {
        if (instance == null) {
            synchronized (СSingleton.class) {
                if (instance == null) {
                    instance = new СSingleton();
                }
            }
        }
        return instance;
    }

}
