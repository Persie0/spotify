package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class jhi {

    /* JADX INFO: renamed from: a */
    public final boolean f112474a;

    /* JADX INFO: renamed from: b */
    public final ihi f112475b;

    /* JADX INFO: renamed from: c */
    public final la80 f112476c;

    /* JADX INFO: renamed from: d */
    public final boolean f112477d;

    /* JADX INFO: renamed from: e */
    public final Map f112478e;

    public jhi(boolean z, ihi ihiVar, la80 la80Var, boolean z2, Map map) {
        this.f112474a = z;
        this.f112475b = ihiVar;
        this.f112476c = la80Var;
        this.f112477d = z2;
        this.f112478e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhi)) {
            return false;
        }
        jhi jhiVar = (jhi) obj;
        return this.f112474a == jhiVar.f112474a && wj50.m88271j(this.f112475b, jhiVar.f112475b) && this.f112476c == jhiVar.f112476c && this.f112477d == jhiVar.f112477d && wj50.m88271j(this.f112478e, jhiVar.f112478e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f112474a) * 31;
        ihi ihiVar = this.f112475b;
        int iHashCode2 = (iHashCode + (ihiVar == null ? 0 : ihiVar.hashCode())) * 31;
        la80 la80Var = this.f112476c;
        return this.f112478e.hashCode() + s571.m77245d((iHashCode2 + (la80Var != null ? la80Var.hashCode() : 0)) * 31, 31, this.f112477d);
    }
}
