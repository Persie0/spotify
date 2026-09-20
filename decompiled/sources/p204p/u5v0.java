package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u5v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final String f227126a;

    /* JADX INFO: renamed from: b */
    public final d850 f227127b;

    public u5v0(String str, d850 d850Var) {
        this.f227126a = str;
        this.f227127b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5v0)) {
            return false;
        }
        u5v0 u5v0Var = (u5v0) obj;
        return wj50.m88271j(this.f227126a, u5v0Var.f227126a) && wj50.m88271j(this.f227127b, u5v0Var.f227127b);
    }

    public final int hashCode() {
        return this.f227127b.hashCode() + (this.f227126a.hashCode() * 31);
    }
}
