package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class v3x0 {

    /* JADX INFO: renamed from: a */
    public final Activity f236972a;

    /* JADX INFO: renamed from: b */
    public final nrl f236973b;

    /* JADX INFO: renamed from: c */
    public final rta0 f236974c;

    public v3x0(Activity activity, nrl nrlVar, rta0 rta0Var) {
        this.f236972a = activity;
        this.f236973b = nrlVar;
        this.f236974c = rta0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m84629a() {
        Activity activity = this.f236972a;
        activity.finish();
        activity.startActivity(rta0.m76376c(this.f236974c, activity, this.f236973b.m65483c(), null, 88));
    }
}
