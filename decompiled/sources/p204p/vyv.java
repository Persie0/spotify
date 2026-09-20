package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vyv {

    /* JADX INFO: renamed from: a */
    public final int f246332a;

    /* JADX INFO: renamed from: b */
    public final h50 f246333b;

    public vyv(int i, h50 h50Var) {
        this.f246332a = i;
        this.f246333b = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyv)) {
            return false;
        }
        vyv vyvVar = (vyv) obj;
        return this.f246332a == vyvVar.f246332a && wj50.m88271j(this.f246333b, vyvVar.f246333b);
    }

    public final int hashCode() {
        return this.f246333b.hashCode() + (Integer.hashCode(this.f246332a) * 31);
    }
}
