package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class d1l0 extends f1l0 {

    /* JADX INFO: renamed from: a */
    public final rzd1 f44309a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f44310b;

    public d1l0(rzd1 rzd1Var, ArrayList arrayList) {
        this.f44309a = rzd1Var;
        this.f44310b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final un20 m34659a() {
        return this.f44309a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1l0)) {
            return false;
        }
        d1l0 d1l0Var = (d1l0) obj;
        return this.f44309a.equals(d1l0Var.f44309a) && this.f44310b.equals(d1l0Var.f44310b);
    }

    public final int hashCode() {
        return this.f44310b.hashCode() + ((this.f44309a.hashCode() - 1150326230) * 31);
    }
}
