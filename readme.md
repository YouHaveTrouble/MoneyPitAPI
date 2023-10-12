# MoneyPitAPI

## Usage

### Implementing in bukkit plugin wanting to use economy

```java
public final class YourPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        RegisteredServiceProvider<Economy> provider = getServer()
                .getServicesManager()
                .getRegistration(Economy.class);

        if (provider == null) {
            getLogger().severe("No economy provider found!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        Economy economy = provider.getProvider();
        if (!economy.isEnabled()) {
            getLogger().severe("Economy provider is not enabled!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        economy.has(getServer().getOfflinePlayer("YouHaveTrouble").getUniqueId(), 1000000).thenAccept(has -> {
            if (has) {
                getLogger().info("YouHaveTrouble is a millionaire!");
            } else {
                getLogger().info("YouHaveTrouble is not a millionaire :(");
            }
        });
    }
}
```

### implementing in bukkit economy plugin

```java
public final class YourPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // your implementation of Economy class
        Economy economyImplementation = new EconomyImplementation(); 

        Bukkit.getServer()
                .getServicesManager()
                .register(
                        Economy.class,
                        economyImplementation,
                        this,
                        ServicePriority.Highest
                );
    }
}
```
