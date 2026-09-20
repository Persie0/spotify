package p204p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class uf0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public Object f229632a;

    /* JADX INFO: renamed from: b */
    public Activity f229633b;

    /* JADX INFO: renamed from: c */
    public final int f229634c;

    /* JADX INFO: renamed from: d */
    public boolean f229635d = false;

    /* JADX INFO: renamed from: e */
    public boolean f229636e = false;

    /* JADX INFO: renamed from: f */
    public boolean f229637f = false;

    public uf0(Activity activity) {
        this.f229633b = activity;
        this.f229634c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f229633b == activity) {
            this.f229633b = null;
            this.f229636e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f229636e || this.f229637f || this.f229635d) {
            return;
        }
        Object obj = this.f229632a;
        try {
            Object obj2 = vf0.f240856c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f229634c) {
                vf0.f240860g.postAtFrontOfQueue(new uqf1(2, vf0.f240855b.get(activity), obj2));
                this.f229637f = true;
                this.f229632a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f229633b == activity) {
            this.f229635d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
