package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class m45 extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public int f139840a;

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f139840a++;
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f139840a--;
    }
}
