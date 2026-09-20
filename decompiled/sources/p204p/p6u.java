package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
public final class p6u extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f174494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lqi0 f174495c;

    public /* synthetic */ p6u(Activity activity, lqi0 lqi0Var, int i) {
        this.f174493a = i;
        this.f174494b = activity;
        this.f174495c = lqi0Var;
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f174493a) {
            case 0:
                Activity activity2 = this.f174494b;
                if (activity == activity2) {
                    activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
                    Boolean bool = Boolean.TRUE;
                    zv41 zv41Var = (zv41) this.f174495c;
                    zv41Var.getClass();
                    zv41Var.m97091m(null, bool);
                    break;
                }
                break;
            default:
                Activity activity3 = this.f174494b;
                if (activity == activity3) {
                    activity3.getApplication().unregisterActivityLifecycleCallbacks(this);
                    Boolean bool2 = Boolean.TRUE;
                    zv41 zv41Var2 = (zv41) this.f174495c;
                    zv41Var2.getClass();
                    zv41Var2.m97091m(null, bool2);
                    break;
                }
                break;
        }
    }
}
