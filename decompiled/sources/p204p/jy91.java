package p204p;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class jy91 extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ky91 f117342a;

    public jy91(ky91 ky91Var) {
        this.f117342a = ky91Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        Logger.m3965a("[ForegroundKeeperService] activity pre-created: " + activity, new Object[0]);
        ky91 ky91Var = this.f117342a;
        if (ky91Var.f127768c == 0) {
            ((h240) ky91Var.f127767b).m46471b(bei0.f26363a);
        }
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Logger.m3965a("[ForegroundKeeperService] activity started: " + activity, new Object[0]);
        ky91 ky91Var = this.f117342a;
        if (ky91Var.f127768c == 0) {
            ((h240) ky91Var.f127767b).m46471b(bei0.f26363a);
        }
        ky91Var.f127768c++;
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Logger.m3965a("[ForegroundKeeperService] activity stopped: " + activity, new Object[0]);
        ky91 ky91Var = this.f117342a;
        int i = ky91Var.f127768c + (-1);
        ky91Var.f127768c = i;
        if (i == 0) {
            ((h240) ky91Var.f127767b).m46477h(bei0.f26363a);
        }
    }
}
