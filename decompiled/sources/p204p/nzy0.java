package p204p;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public final class nzy0 {

    /* JADX INFO: renamed from: a */
    public final Activity f160186a;

    /* JADX INFO: renamed from: b */
    public final dic1 f160187b;

    public nzy0(Activity activity, dic1 dic1Var) {
        this.f160186a = activity;
        this.f160187b = dic1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m65968a() {
        String str = xoc1.f264240z1.f243453a;
        dic1 dic1Var = this.f160187b;
        Activity activity = this.f160186a;
        activity.startActivity((Intent) dic1Var.m36074a(activity, str).f120028b);
    }
}
