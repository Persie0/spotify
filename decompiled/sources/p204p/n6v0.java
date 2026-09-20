package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n6v0 extends o6v0 {

    /* JADX INFO: renamed from: a */
    public final int f150959a;

    /* JADX INFO: renamed from: b */
    public final pxj f150960b;

    /* JADX INFO: renamed from: c */
    public final s4v0 f150961c;

    public n6v0(int i, pxj pxjVar, s4v0 s4v0Var) {
        this.f150959a = i;
        this.f150960b = pxjVar;
        this.f150961c = s4v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6v0)) {
            return false;
        }
        n6v0 n6v0Var = (n6v0) obj;
        return this.f150959a == n6v0Var.f150959a && this.f150960b == n6v0Var.f150960b && this.f150961c == n6v0Var.f150961c;
    }

    public final int hashCode() {
        return this.f150961c.hashCode() + ((this.f150960b.hashCode() + (Integer.hashCode(this.f150959a) * 31)) * 31);
    }
}
