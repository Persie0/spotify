package com.comscore.android.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.comscore.Analytics;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
@TargetApi(14)
public class BackgroundManager implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private Application f1572a;

    public BackgroundManager(Application application) {
        this.f1572a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Analytics.notifyExitForeground();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Analytics.notifyEnterForeground();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public void register() {
        this.f1572a.registerActivityLifecycleCallbacks(this);
    }

    public void unregister() {
        this.f1572a.unregisterActivityLifecycleCallbacks(this);
    }
}
