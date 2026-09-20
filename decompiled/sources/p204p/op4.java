package p204p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class op4 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final double f167751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qp4 f167752b;

    public op4(qp4 qp4Var, hvu0 hvu0Var) {
        this.f167752b = qp4Var;
        fvu0 fvu0Var = hvu0Var.f95795a;
        skp skpVar = l940.f130998a;
        this.f167751a = ((Number) zuj0.m97056s(fvu0Var.f73868b.f207348n, l940.f131001d)).doubleValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m67516a(Context context) {
        long j;
        if (this.f167751a == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        qp4 qp4Var = this.f167752b;
        hvu0 hvu0Var = (hvu0) ((WeakReference) qp4Var.f191124b).get();
        if (hvu0Var == null) {
            qp4Var.m73426k();
            return;
        }
        mvu0 mvu0VarM48899d = hvu0Var.m48899d();
        if (mvu0VarM48899d != null) {
            synchronized (mvu0VarM48899d.f147653c) {
                j = mvu0VarM48899d.f147651a.f224242a;
            }
            mvu0VarM48899d.m62969c(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m67516a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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
