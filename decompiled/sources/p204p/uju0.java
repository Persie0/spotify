package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uju0 {

    /* JADX INFO: renamed from: a */
    public final tju0 f231150a;

    /* JADX INFO: renamed from: b */
    public final String f231151b;

    public uju0(tju0 tju0Var, String str) {
        this.f231150a = tju0Var;
        this.f231151b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uju0)) {
            return false;
        }
        uju0 uju0Var = (uju0) obj;
        return wj50.m88271j(this.f231150a, uju0Var.f231150a) && wj50.m88271j(this.f231151b, uju0Var.f231151b);
    }

    public final int hashCode() {
        int iHashCode = this.f231150a.hashCode() * 31;
        String str = this.f231151b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
