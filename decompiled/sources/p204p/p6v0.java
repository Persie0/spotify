package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p6v0 {

    /* JADX INFO: renamed from: a */
    public final pxj f174500a;

    /* JADX INFO: renamed from: b */
    public final s4v0 f174501b;

    /* JADX INFO: renamed from: c */
    public final qf40 f174502c;

    public p6v0(pxj pxjVar, s4v0 s4v0Var, qf40 qf40Var) {
        this.f174500a = pxjVar;
        this.f174501b = s4v0Var;
        this.f174502c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6v0)) {
            return false;
        }
        p6v0 p6v0Var = (p6v0) obj;
        return this.f174500a == p6v0Var.f174500a && this.f174501b == p6v0Var.f174501b && wj50.m88271j(this.f174502c, p6v0Var.f174502c);
    }

    public final int hashCode() {
        pxj pxjVar = this.f174500a;
        int iHashCode = (pxjVar == null ? 0 : pxjVar.hashCode()) * 31;
        s4v0 s4v0Var = this.f174501b;
        return this.f174502c.hashCode() + ((iHashCode + (s4v0Var != null ? s4v0Var.hashCode() : 0)) * 31);
    }
}
