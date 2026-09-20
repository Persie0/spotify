package p204p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public final class up21 {

    /* JADX INFO: renamed from: a */
    public final Activity f232561a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f232562b;

    /* JADX INFO: renamed from: c */
    public final k5m0 f232563c;

    public up21(Activity activity, z9j0 z9j0Var, k5m0 k5m0Var) {
        this.f232561a = activity;
        this.f232562b = z9j0Var;
        this.f232563c = k5m0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m83644a(String str, zo21 zo21Var, d850 d850Var) {
        z650 z650Var;
        Bundle bundleM70529j = pp91.m70529j(new pqm0("sleep_timer_menu_item_uri", str), new pqm0("sleep_timer_menu_content_type", Integer.valueOf(zo21Var.ordinal())));
        z9j0 z9j0Var = this.f232562b;
        Activity activity = this.f232561a;
        if (z9j0Var.mo47349j(activity)) {
            if (d850Var != null) {
                z9j0Var.mo47342b(vp21.f243572i.f243453a, d850Var, bundleM70529j);
                return;
            } else {
                z9j0Var.mo47347h(vp21.f243572i.f243453a, bundleM70529j);
                return;
            }
        }
        String str2 = vp21.f243572i.f243453a;
        String str3 = (d850Var == null || (z650Var = d850Var.f46380a) == null) ? null : z650Var.f279709a;
        k5m0 k5m0Var = this.f232563c;
        k5m0Var.mo55549k(str2, str3, bundleM70529j, k5m0Var.mo55547g(activity));
    }
}
