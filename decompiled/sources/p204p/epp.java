package p204p;

import android.os.Parcelable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class epp implements gc80, hc80 {

    /* JADX INFO: renamed from: a */
    public final Parcelable f61683a;

    /* JADX INFO: renamed from: b */
    public final r55 f61684b;

    /* JADX INFO: renamed from: c */
    public final kdi0 f61685c;

    /* JADX INFO: renamed from: d */
    public final Set f61686d;

    /* JADX INFO: renamed from: e */
    public final List f61687e;

    /* JADX INFO: renamed from: f */
    public boolean f61688f;

    /* JADX INFO: renamed from: g */
    public final oxe f61689g = qxe.m74116a();

    /* JADX INFO: renamed from: h */
    public final oc80 f61690h;

    /* JADX INFO: renamed from: i */
    public final fex f61691i;

    /* JADX INFO: renamed from: t */
    public final wqa0 f61692t;

    public epp(Parcelable parcelable, r55 r55Var, kdi0 kdi0Var, Set set, Set set2, List list) {
        this.f61683a = parcelable;
        this.f61684b = r55Var;
        this.f61685c = kdi0Var;
        this.f61686d = set2;
        this.f61687e = list;
        oc80 oc80Var = new oc80(this, true);
        this.f61690h = oc80Var;
        dpp dppVar = parcelable instanceof dpp ? (dpp) parcelable : null;
        if (dppVar != null) {
            this.f61688f = dppVar.f51378a;
        }
        wqa0 wqa0Var = new wqa0(set);
        this.f61692t = wqa0Var;
        oc80Var.mo31986a(wqa0Var);
        fex fexVar = new fex(oc80Var, 2);
        this.f61691i = fexVar;
        r55Var.f31643a.mo31986a(fexVar);
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f61690h;
    }
}
