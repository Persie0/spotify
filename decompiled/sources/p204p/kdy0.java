package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kdy0 implements ldy0 {

    /* JADX INFO: renamed from: a */
    public final r391 f121749a;

    /* JADX INFO: renamed from: b */
    public final ob71 f121750b;

    public kdy0(r391 r391Var, ob71 ob71Var) {
        this.f121749a = r391Var;
        this.f121750b = ob71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdy0)) {
            return false;
        }
        kdy0 kdy0Var = (kdy0) obj;
        return wj50.m88271j(this.f121749a, kdy0Var.f121749a) && wj50.m88271j(this.f121750b, kdy0Var.f121750b);
    }

    public final int hashCode() {
        int iHashCode = this.f121749a.hashCode() * 31;
        ob71 ob71Var = this.f121750b;
        return iHashCode + (ob71Var == null ? 0 : ob71Var.hashCode());
    }
}
