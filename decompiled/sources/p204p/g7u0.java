package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g7u0 extends i7u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f77355a;

    /* JADX INFO: renamed from: b */
    public final b7u0 f77356b;

    /* JADX INFO: renamed from: c */
    public final Integer f77357c;

    public g7u0(boolean z, b7u0 b7u0Var, Integer num) {
        this.f77355a = z;
        this.f77356b = b7u0Var;
        this.f77357c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7u0)) {
            return false;
        }
        g7u0 g7u0Var = (g7u0) obj;
        return this.f77355a == g7u0Var.f77355a && wj50.m88271j(this.f77356b, g7u0Var.f77356b) && wj50.m88271j(this.f77357c, g7u0Var.f77357c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f77355a) * 31;
        b7u0 b7u0Var = this.f77356b;
        int iHashCode2 = (iHashCode + (b7u0Var == null ? 0 : b7u0Var.hashCode())) * 31;
        Integer num = this.f77357c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
