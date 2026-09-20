package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ln70 implements ojb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f135107a;

    /* JADX INFO: renamed from: b */
    public final String f135108b;

    public ln70(ilb1 ilb1Var, String str) {
        this.f135107a = ilb1Var;
        this.f135108b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln70)) {
            return false;
        }
        ln70 ln70Var = (ln70) obj;
        return wj50.m88271j(this.f135107a, ln70Var.f135107a) && wj50.m88271j(this.f135108b, ln70Var.f135108b);
    }

    public final int hashCode() {
        int iHashCode = this.f135107a.hashCode() * 31;
        String str = this.f135108b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 25724023;
    }
}
