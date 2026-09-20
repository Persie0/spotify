package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hko0 {

    /* JADX INFO: renamed from: a */
    public final String f92463a;

    /* JADX INFO: renamed from: b */
    public final fko0 f92464b;

    public hko0(String str, fko0 fko0Var) {
        this.f92463a = str;
        this.f92464b = fko0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hko0)) {
            return false;
        }
        hko0 hko0Var = (hko0) obj;
        return wj50.m88271j(this.f92463a, hko0Var.f92463a) && wj50.m88271j(this.f92464b, hko0Var.f92464b);
    }

    public final int hashCode() {
        return this.f92464b.hashCode() + (this.f92463a.hashCode() * 31);
    }
}
