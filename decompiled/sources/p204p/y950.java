package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y950 {

    /* JADX INFO: renamed from: a */
    public final String f270507a;

    /* JADX INFO: renamed from: b */
    public final d850 f270508b;

    /* JADX INFO: renamed from: c */
    public final boolean f270509c;

    public y950(String str, d850 d850Var, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        d850Var = (i & 2) != 0 ? null : d850Var;
        z = (i & 4) != 0 ? false : z;
        this.f270507a = str;
        this.f270508b = d850Var;
        this.f270509c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y950)) {
            return false;
        }
        y950 y950Var = (y950) obj;
        return wj50.m88271j(this.f270507a, y950Var.f270507a) && wj50.m88271j(this.f270508b, y950Var.f270508b) && this.f270509c == y950Var.f270509c;
    }

    public final int hashCode() {
        String str = this.f270507a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d850 d850Var = this.f270508b;
        return Boolean.hashCode(this.f270509c) + ((iHashCode + (d850Var != null ? d850Var.hashCode() : 0)) * 31);
    }
}
