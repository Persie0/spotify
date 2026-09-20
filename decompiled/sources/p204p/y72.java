package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class y72 extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public Activity f269937a;

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (wj50.m88271j(this.f269937a, activity)) {
            this.f269937a = null;
        }
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f269937a = activity;
    }
}
