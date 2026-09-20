package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f45140a;

    /* JADX INFO: renamed from: b */
    public final z650 f45141b;

    /* JADX INFO: renamed from: c */
    public final int f45142c;

    public d4d(String str, z650 z650Var, int i) {
        this.f45140a = str;
        this.f45141b = z650Var;
        this.f45142c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4d)) {
            return false;
        }
        d4d d4dVar = (d4d) obj;
        return wj50.m88271j(this.f45140a, d4dVar.f45140a) && wj50.m88271j(this.f45141b, d4dVar.f45141b) && this.f45142c == d4dVar.f45142c;
    }

    public final int hashCode() {
        int iHashCode = this.f45140a.hashCode() * 31;
        z650 z650Var = this.f45141b;
        int iHashCode2 = (iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode())) * 31;
        int i = this.f45142c;
        return iHashCode2 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
