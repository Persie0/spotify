package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qtl0 extends wtl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f192409a;

    /* JADX INFO: renamed from: b */
    public final String f192410b;

    public qtl0(zo20 zo20Var, String str) {
        this.f192409a = zo20Var;
        this.f192410b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtl0)) {
            return false;
        }
        qtl0 qtl0Var = (qtl0) obj;
        return wj50.m88271j(this.f192409a, qtl0Var.f192409a) && wj50.m88271j(this.f192410b, qtl0Var.f192410b);
    }

    public final int hashCode() {
        return this.f192410b.hashCode() + (this.f192409a.hashCode() * 31);
    }
}
