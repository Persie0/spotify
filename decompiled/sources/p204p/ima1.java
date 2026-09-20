package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ima1 implements nma1 {

    /* JADX INFO: renamed from: a */
    public final String f103656a;

    /* JADX INFO: renamed from: b */
    public final String f103657b;

    public ima1(String str, String str2) {
        this.f103656a = str;
        this.f103657b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ima1)) {
            return false;
        }
        ima1 ima1Var = (ima1) obj;
        return wj50.m88271j(this.f103656a, ima1Var.f103656a) && wj50.m88271j(this.f103657b, ima1Var.f103657b);
    }

    @Override // p204p.nma1
    public final String getUri() {
        return this.f103656a;
    }

    public final int hashCode() {
        return this.f103657b.hashCode() + (this.f103656a.hashCode() * 31);
    }
}
