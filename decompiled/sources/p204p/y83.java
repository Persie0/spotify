package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class y83 implements z83 {

    /* JADX INFO: renamed from: d */
    public static final fv31 f270179d;

    /* JADX INFO: renamed from: e */
    public static final fv31 f270180e;

    /* JADX INFO: renamed from: f */
    public static final fv31 f270181f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f270182g;

    /* JADX INFO: renamed from: a */
    public final wb11 f270183a;

    /* JADX INFO: renamed from: b */
    public final Activity f270184b;

    /* JADX INFO: renamed from: c */
    public hv31 f270185c;

    static {
        si5 si5Var = fv31.f73628b;
        f270179d = si5Var.m78183U("alexa_account_linking_dialog_time_first_shown");
        f270180e = si5Var.m78183U("alexa_account_linking_dialog_times_shown");
        f270181f = si5Var.m78183U("alexa_account_linking_not_linked");
        f270182g = si5Var.m78183U("alexa_account_linking_nudge_attempt_count");
    }

    public y83(Activity activity, wb11 wb11Var) {
        this.f270183a = wb11Var;
        this.f270184b = activity;
    }

    /* JADX INFO: renamed from: a */
    public final int m93043a() {
        hv31 hv31Var = this.f270185c;
        if (hv31Var != null) {
            return hv31Var.mo48717l(f270180e, 0);
        }
        throw new IllegalStateException("setup needs to be called first");
    }
}
