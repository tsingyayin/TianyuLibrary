package cn.yxgeneral.weavestudio.tianyulibrary;

import org.bukkit.plugin.java.JavaPlugin;

public final class TianyuLibrary extends JavaPlugin {
    static TianyuLibrary Instance;
    static boolean PAPI = false;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Tianyu Plugin Library is enabled!");
        if (getServer().getPluginManager().getPlugin("PlaceHolderAPI")!=null){
            info("PlaceHolderAPI found, enabling PlaceHolderAPI support...");
            PAPI = true;
        }else{
            warning("PlaceHolderAPI not found, disabling PlaceHolderAPI support...");
            PAPI = false;
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static TianyuLibrary getInstance() {
        return Instance;
    }
    public static void info(String info){
        Instance.getLogger().info(info);
    }
    public static void warning(String warning){
        Instance.getLogger().warning(warning);
    }
}
