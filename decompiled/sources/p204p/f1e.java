package p204p;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class f1e implements tja1, tlm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ toh f64877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k5k0 f64878b;

    public f1e(toh tohVar, k5k0 k5k0Var) {
        this.f64878b = k5k0Var;
        this.f64877a = tohVar;
    }

    @Override // p204p.tja1
    /* JADX INFO: renamed from: a */
    public final boolean mo40533a(Uri uri) {
        return this.f64877a.mo40533a(uri);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p.gh00, p.ri00] */
    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        Object next;
        if (!(olm0Var instanceof ug0)) {
            return false;
        }
        ug0 ug0Var = (ug0) olm0Var;
        if (!(ug0Var instanceof tg0)) {
            return false;
        }
        Iterator it = ((LinkedHashSet) this.f64878b.f119537c).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) ((p5m0) next).f174194a.invoke(((tg0) ug0Var).f220094a)).booleanValue());
        p5m0 p5m0Var = (p5m0) next;
        if (p5m0Var == null) {
            return false;
        }
        p5m0Var.f174195b.invoke(((tg0) ug0Var).f220094a);
        return true;
    }

    @Override // p204p.tja1
    /* JADX INFO: renamed from: c */
    public final boolean mo40534c(Uri uri) {
        return this.f64877a.mo40534c(uri);
    }
}
