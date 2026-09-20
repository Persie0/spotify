package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ewl0 {

    /* JADX INFO: renamed from: a */
    public final l1p0 f63570a;

    /* JADX INFO: renamed from: b */
    public final l1p0 f63571b;

    public ewl0(l1p0 l1p0Var, l1p0 l1p0Var2) {
        this.f63570a = l1p0Var;
        this.f63571b = l1p0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewl0)) {
            return false;
        }
        ewl0 ewl0Var = (ewl0) obj;
        return wj50.m88271j(this.f63570a, ewl0Var.f63570a) && wj50.m88271j(this.f63571b, ewl0Var.f63571b);
    }

    public final int hashCode() {
        int iHashCode = this.f63570a.hashCode() * 31;
        l1p0 l1p0Var = this.f63571b;
        return iHashCode + (l1p0Var == null ? 0 : l1p0Var.hashCode());
    }
}
