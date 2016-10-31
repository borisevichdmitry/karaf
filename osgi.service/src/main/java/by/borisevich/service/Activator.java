package by.borisevich.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by dima on 10/28/16.
 */
public class Activator implements BundleActivator {

    public void start(BundleContext context) {
        System.out.println("Starting the service bundle");
    }

    public void stop(BundleContext context) {
        System.out.println("Stopping the service bundle");
    }

}
