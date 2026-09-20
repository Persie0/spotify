package p204p;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vmv0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmv0 f242944a;

    public vmv0(wmv0 wmv0Var) {
        this.f242944a = wmv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        Object c6x0Var;
        Uri uri;
        wmv0 wmv0Var = this.f242944a;
        Bundle bundleM41108a = wmv0Var.f252994c.mo34135x().m41108a("navigation.referrer-accessor.saved_state_key");
        if (bundleM41108a == null) {
            try {
                c6x0Var = ze0.m95952r0(wmv0Var.f252992a);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            if (c6x0Var instanceof c6x0) {
                c6x0Var = null;
            }
            uri = (Uri) c6x0Var;
        } else {
            uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundleM41108a.getParcelable("navigation.referrer-accessor.state_last_referrer", Uri.class) : bundleM41108a.getParcelable("navigation.referrer-accessor.state_last_referrer"));
            if (uri == null) {
                c6x0Var = ze0.m95952r0(wmv0Var.f252992a);
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = null;
                }
                uri = (Uri) c6x0Var;
            }
        }
        wmv0Var.f252993b = uri;
    }
}
