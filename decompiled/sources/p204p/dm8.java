package p204p;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dm8 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    public static final dm8 f50469e = new dm8();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f50470a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f50471b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    public final ArrayList f50472c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f50473d = false;

    /* JADX INFO: renamed from: a */
    public static void m36396a(Application application) {
        dm8 dm8Var = f50469e;
        synchronized (dm8Var) {
            try {
                if (!dm8Var.f50473d) {
                    application.registerActivityLifecycleCallbacks(dm8Var);
                    application.registerComponentCallbacks(dm8Var);
                    dm8Var.f50473d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36397b(boolean z) {
        synchronized (f50469e) {
            try {
                Iterator it = this.f50472c.iterator();
                while (it.hasNext()) {
                    ((cm8) it.next()).mo33367a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f50470a.compareAndSet(true, false);
        this.f50471b.set(true);
        if (zCompareAndSet) {
            m36397b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f50470a.compareAndSet(true, false);
        this.f50471b.set(true);
        if (zCompareAndSet) {
            m36397b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f50470a.compareAndSet(false, true)) {
            this.f50471b.set(true);
            m36397b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
