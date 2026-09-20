package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sm5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final s7j0 f210565a;

    /* JADX INFO: renamed from: b */
    public final String f210566b;

    public sm5(s7j0 s7j0Var, String str) {
        this.f210565a = s7j0Var;
        this.f210566b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm5)) {
            return false;
        }
        sm5 sm5Var = (sm5) obj;
        return wj50.m88271j(this.f210565a, sm5Var.f210565a) && wj50.m88271j(this.f210566b, sm5Var.f210566b);
    }

    public final int hashCode() {
        int iHashCode = this.f210565a.hashCode() * 31;
        String str = this.f210566b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
