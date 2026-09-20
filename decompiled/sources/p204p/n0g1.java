package p204p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class n0g1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s0g1 f149054a;

    public n0g1(s0g1 s0g1Var) {
        this.f149054a = s0g1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f149054a.m76869a(new lzf1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f149054a.m76869a(new tzf1(this, activity, 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f149054a.m76869a(new tzf1(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f149054a.m76869a(new tzf1(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        apf1 apf1Var = new apf1();
        this.f149054a.m76869a(new lzf1(this, activity, apf1Var));
        Bundle bundleM26677e2 = apf1Var.m26677e2(50L);
        if (bundleM26677e2 != null) {
            bundle.putAll(bundleM26677e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f149054a.m76869a(new lsf1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f149054a.m76869a(new tzf1(this, activity, 2));
    }
}
