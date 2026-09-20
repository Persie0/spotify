package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class s2y0 {

    /* JADX INFO: renamed from: d */
    public static final fv31 f205094d = fv31.m42756b("account_linking_dialog_time_first_shown");

    /* JADX INFO: renamed from: e */
    public static final fv31 f205095e = fv31.m42756b("account_linking_dialog_times_shown");

    /* JADX INFO: renamed from: a */
    public final wb11 f205096a;

    /* JADX INFO: renamed from: b */
    public final Activity f205097b;

    /* JADX INFO: renamed from: c */
    public xul0 f205098c = C2244p5.f174033a;

    public s2y0(Activity activity, wb11 wb11Var) {
        this.f205096a = wb11Var;
        this.f205097b = activity;
    }

    /* JADX INFO: renamed from: a */
    public final int m77111a() {
        if (this.f205098c.mo49279c()) {
            return ((hv31) this.f205098c.mo49278b()).mo48717l(f205095e, 0);
        }
        throw new RuntimeException("setup needs to be called first");
    }
}
