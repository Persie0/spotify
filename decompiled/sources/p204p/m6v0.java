package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m6v0 extends o6v0 {

    /* JADX INFO: renamed from: a */
    public final int f140578a;

    /* JADX INFO: renamed from: b */
    public final pxj f140579b;

    /* JADX INFO: renamed from: c */
    public final s4v0 f140580c;

    public m6v0(int i, pxj pxjVar, s4v0 s4v0Var) {
        this.f140578a = i;
        this.f140579b = pxjVar;
        this.f140580c = s4v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6v0)) {
            return false;
        }
        m6v0 m6v0Var = (m6v0) obj;
        return this.f140578a == m6v0Var.f140578a && this.f140579b == m6v0Var.f140579b && this.f140580c == m6v0Var.f140580c;
    }

    public final int hashCode() {
        return this.f140580c.hashCode() + ((this.f140579b.hashCode() + (Integer.hashCode(this.f140578a) * 31)) * 31);
    }
}
