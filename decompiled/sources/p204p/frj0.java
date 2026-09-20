package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class frj0 {

    /* JADX INFO: renamed from: a */
    public final ock f72494a;

    /* JADX INFO: renamed from: b */
    public final oqj0 f72495b;

    /* JADX INFO: renamed from: c */
    public final boolean f72496c;

    public frj0(ock ockVar, oqj0 oqj0Var, boolean z) {
        this.f72494a = ockVar;
        this.f72495b = oqj0Var;
        this.f72496c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frj0)) {
            return false;
        }
        frj0 frj0Var = (frj0) obj;
        return wj50.m88271j(this.f72494a, frj0Var.f72494a) && wj50.m88271j(this.f72495b, frj0Var.f72495b) && this.f72496c == frj0Var.f72496c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72496c) + ((this.f72495b.hashCode() + (this.f72494a.hashCode() * 31)) * 31);
    }
}
