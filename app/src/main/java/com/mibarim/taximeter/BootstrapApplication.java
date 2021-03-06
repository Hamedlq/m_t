

package com.mibarim.taximeter;

import android.app.Application;

import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.mibarim.taximeter.util.FontsOverride;
import com.onesignal.OneSignal;

import ir.adad.client.Adad;

/**
 * Mibarim application
 */
public abstract class BootstrapApplication extends Application {

    private static BootstrapApplication instance;
    private BootstrapComponent component;

    /**
     * Create taximeter application
     */
    public BootstrapApplication() {
    }


    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

        init();

        instance = this;

        // Perform injection
        //Injector.init(this, )
        component = DaggerComponentInitializer.init();

        onAfterInjection();
        //for font awesome
        TypefaceProvider.registerDefaultIconSets();
        //iransens font
        FontsOverride.setDefaultFont(this, "DEFAULT", "fonts/IRANSans(FaNum)_Light.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/IRANSans(FaNum)_Light.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "fonts/IRANSans(FaNum)_Light.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/IRANSans(FaNum)_Light.ttf");

        Adad.initialize(getApplicationContext());
    }
    public static BootstrapComponent component() {
        return instance.component;
    }

    protected abstract void onAfterInjection();

    protected abstract void init();

    public static BootstrapApplication getInstance() {
        return instance;
    }

    public BootstrapComponent getComponent() {
        return component;
    }

    public final static class DaggerComponentInitializer {

        public static BootstrapComponent init() {
            return DaggerBootstrapComponent.builder()
                    .androidModule(new AndroidModule())
                    .bootstrapModule(new BootstrapModule())
                    .build();
        }

    }

    //private Tracker mTracker;

    /**
     * Gets the default {@link Tracker} for this {@link Application}.
     * @return tracker
     *//*
    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }*/

}
