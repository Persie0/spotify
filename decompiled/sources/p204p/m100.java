package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m100 {

    /* JADX INFO: renamed from: a */
    public final int f138780a;

    /* JADX INFO: renamed from: b */
    public final qf40 f138781b;

    public m100(int i, qf40 qf40Var) {
        this.f138780a = i;
        this.f138781b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m100)) {
            return false;
        }
        m100 m100Var = (m100) obj;
        return this.f138780a == m100Var.f138780a && wj50.m88271j(this.f138781b, m100Var.f138781b);
    }

    public final int hashCode() {
        return this.f138781b.hashCode() + (Integer.hashCode(this.f138780a) * 31);
    }
}
