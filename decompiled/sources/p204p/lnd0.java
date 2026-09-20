package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class lnd0 implements vwf, dq70 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f135147a;

    /* JADX INFO: renamed from: b */
    public final cq70 f135148b;

    public lnd0(ArrayList arrayList) {
        cq70 cq70Var = new cq70(true);
        this.f135147a = arrayList;
        this.f135148b = cq70Var;
    }

    @Override // p204p.dq70
    /* JADX INFO: renamed from: a */
    public final cq70 mo36628a() {
        return this.f135148b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnd0)) {
            return false;
        }
        lnd0 lnd0Var = (lnd0) obj;
        return this.f135147a.equals(lnd0Var.f135147a) && this.f135148b.equals(lnd0Var.f135148b);
    }

    public final int hashCode() {
        return this.f135148b.hashCode() + (this.f135147a.hashCode() * 31);
    }
}
