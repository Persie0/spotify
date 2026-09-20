package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k41 {

    /* JADX INFO: renamed from: a */
    public final q9o0 f119040a;

    /* JADX INFO: renamed from: b */
    public final String f119041b;

    public k41(q9o0 q9o0Var, String str) {
        this.f119040a = q9o0Var;
        this.f119041b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k41)) {
            return false;
        }
        k41 k41Var = (k41) obj;
        return wj50.m88271j(this.f119040a, k41Var.f119040a) && wj50.m88271j(this.f119041b, k41Var.f119041b);
    }

    public final int hashCode() {
        int iHashCode = this.f119040a.hashCode() * 31;
        String str = this.f119041b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
