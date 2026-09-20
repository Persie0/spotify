package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ij0 {

    /* JADX INFO: renamed from: a */
    public final fd01 f102661a;

    /* JADX INFO: renamed from: b */
    public final fd01 f102662b;

    /* JADX INFO: renamed from: c */
    public final tdu f102663c;

    public ij0(fd01 fd01Var, fd01 fd01Var2, tdu tduVar) {
        this.f102661a = fd01Var;
        this.f102662b = fd01Var2;
        this.f102663c = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        return wj50.m88271j(this.f102661a, ij0Var.f102661a) && wj50.m88271j(this.f102662b, ij0Var.f102662b) && wj50.m88271j(this.f102663c, ij0Var.f102663c);
    }

    public final int hashCode() {
        return this.f102663c.hashCode() + ((this.f102662b.hashCode() + (this.f102661a.hashCode() * 31)) * 31);
    }
}
