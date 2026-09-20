package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e1r {

    /* JADX INFO: renamed from: a */
    public final String f55241a;

    /* JADX INFO: renamed from: b */
    public final d1r f55242b;

    public e1r(String str, d1r d1rVar) {
        this.f55241a = str;
        this.f55242b = d1rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1r)) {
            return false;
        }
        e1r e1rVar = (e1r) obj;
        return wj50.m88271j(this.f55241a, e1rVar.f55241a) && wj50.m88271j(this.f55242b, e1rVar.f55242b);
    }

    public final int hashCode() {
        int iHashCode = this.f55241a.hashCode() * 31;
        d1r d1rVar = this.f55242b;
        return iHashCode + (d1rVar == null ? 0 : d1rVar.hashCode());
    }
}
