package p204p;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class v9x0 extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public WeakReference f239061a;

    /* JADX INFO: renamed from: b */
    public final hb11 f239062b = j0g1.m52092t(0, 0, 0, 7);

    /* JADX INFO: renamed from: a */
    public final Activity m84993a() {
        WeakReference weakReference = this.f239061a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakReference weakReference = this.f239061a;
        if (activity.equals(weakReference != null ? (Activity) weakReference.get() : null)) {
            WeakReference weakReference2 = this.f239061a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            this.f239061a = null;
        }
        this.f239062b.mo46962a(new s9x0(activity));
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        WeakReference weakReference = this.f239061a;
        if (activity.equals(weakReference != null ? (Activity) weakReference.get() : null)) {
            WeakReference weakReference2 = this.f239061a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            this.f239061a = null;
        }
        this.f239062b.mo46962a(new t9x0(activity));
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f239061a = new WeakReference(activity);
    }
}
