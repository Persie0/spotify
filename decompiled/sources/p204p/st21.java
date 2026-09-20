package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class st21 {

    /* JADX INFO: renamed from: a */
    public final tu21 f213765a;

    /* JADX INFO: renamed from: b */
    public final String f213766b;

    public st21(String str, tu21 tu21Var) {
        this.f213765a = tu21Var;
        this.f213766b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m79227a() {
        return this.f213766b;
    }

    /* JADX INFO: renamed from: b */
    public final tu21 m79228b() {
        return this.f213765a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st21)) {
            return false;
        }
        st21 st21Var = (st21) obj;
        return this.f213765a == st21Var.f213765a && wj50.m88271j(this.f213766b, st21Var.f213766b);
    }

    public final int hashCode() {
        int iHashCode = this.f213765a.hashCode() * 31;
        String str = this.f213766b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
