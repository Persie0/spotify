package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m2r implements o2r, n1c {

    /* JADX INFO: renamed from: a */
    public final z0r f139450a;

    /* JADX INFO: renamed from: b */
    public final int f139451b;

    public m2r(z0r z0rVar, int i) {
        this.f139450a = z0rVar;
        this.f139451b = i;
    }

    @Override // p204p.n1c
    /* JADX INFO: renamed from: a */
    public final int mo60617a() {
        return this.f139451b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2r)) {
            return false;
        }
        m2r m2rVar = (m2r) obj;
        return wj50.m88271j(this.f139450a, m2rVar.f139450a) && this.f139451b == m2rVar.f139451b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139451b) + (this.f139450a.hashCode() * 31);
    }
}
