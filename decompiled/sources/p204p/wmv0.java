package p204p;

import android.app.Activity;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class wmv0 {

    /* JADX INFO: renamed from: a */
    public final Activity f252992a;

    /* JADX INFO: renamed from: b */
    public Uri f252993b;

    /* JADX INFO: renamed from: c */
    public final h9y0 f252994c;

    /* JADX WARN: Multi-variable type inference failed */
    public wmv0(Activity activity) {
        this.f252992a = activity;
        h9y0 h9y0Var = (h9y0) activity;
        this.f252994c = h9y0Var;
        nc0 nc0Var = new nc0(this, 6);
        ((cwf) ((dbl0) activity)).f42736Y.add(nc0Var);
        h9y0Var.mo34135x().m41110c("navigation.referrer-accessor.saved_state_key", new C1982ik(this, 17));
        ((hc80) activity).getLifecycle().mo31986a(new vmv0(this));
    }
}
