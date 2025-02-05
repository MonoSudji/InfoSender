package com.mono.infosender.loaders.ext;

import com.mono.infosender.annotations.Load;
import com.mono.infosender.loaders.AbsLoader;
import org.bukkit.entity.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;


public class ObjectLoader<T extends JavaPlugin> extends AbsLoader {
    private T plugin;
    private HashMap<String, Object> objects = new HashMap<>();
    @Override
    public void load() {
        Reflections reflections = new Reflections("com.mono.infosender", TypeAnnotationsScanner.class);
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(Load.class);

        for (Class<?> clazz : annotatedClasses) {
            if (Entity.class.isAssignableFrom(clazz)) {
                try {
                    Entity entity = (Entity) clazz.newInstance();
                    objects.put(clazz.getName(), entity);
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                Logger logger = plugin.getLogger();
                logger.warning("Class " + clazz.getName() + " is not an entity!");
            }
        }
    }

    @Override
    public Map getBukkit() {
        return objects;
    }
}