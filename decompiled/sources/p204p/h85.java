package p204p;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.spotify.android.base.SpotifyAppComponentFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h85 extends AppComponentFactory {
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        sbz.m77755a(str);
        try {
            Activity activity = (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
            xy3 xy3Var = (xy3) spotifyAppComponentFactory.f2944a;
            if (wj50.m88271j(xy3Var.f267195h, nvf.f158883c)) {
                xy3Var.f267195h = new evf(0, intent, activity.getClass().getName());
            }
            return activity;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        try {
            ContentProvider contentProvider = (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
            spotifyAppComponentFactory.f2944a.getClass();
            return contentProvider;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        sbz.m77756b(str);
        try {
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
            xy3 xy3Var = (xy3) spotifyAppComponentFactory.f2944a;
            if (wj50.m88271j(xy3Var.f267195h, nvf.f158883c)) {
                if (!wj50.m88271j(intent != null ? intent.getAction() : null, "android.intent.action.BOOT_COMPLETED")) {
                    xy3Var.f267195h = new evf(1, intent, broadcastReceiver.getClass().getName());
                }
            }
            return broadcastReceiver;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        SpotifyAppComponentFactory spotifyAppComponentFactory = (SpotifyAppComponentFactory) this;
        sbz.m77757c(str);
        try {
            Service service = (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
            xy3 xy3Var = (xy3) spotifyAppComponentFactory.f2944a;
            if (wj50.m88271j(xy3Var.f267195h, nvf.f158883c)) {
                xy3Var.f267195h = new evf(2, intent, service.getClass().getName());
            }
            return service;
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
