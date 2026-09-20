package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g3y {

    /* JADX INFO: renamed from: a */
    public final ebf0 f76294a;

    /* JADX INFO: renamed from: b */
    public final boolean f76295b;

    public g3y(ebf0 ebf0Var, boolean z) {
        this.f76294a = ebf0Var;
        this.f76295b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3y)) {
            return false;
        }
        g3y g3yVar = (g3y) obj;
        return wj50.m88271j(this.f76294a, g3yVar.f76294a) && this.f76295b == g3yVar.f76295b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76295b) + (this.f76294a.f57921a.hashCode() * 31);
    }
}
