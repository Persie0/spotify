package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class llf0 {

    /* JADX INFO: renamed from: a */
    public final h2r0 f134631a;

    /* JADX INFO: renamed from: b */
    public final b791 f134632b;

    /* JADX INFO: renamed from: c */
    public final b791 f134633c;

    /* JADX INFO: renamed from: d */
    public final b791 f134634d;

    /* JADX INFO: renamed from: e */
    public final xx7 f134635e;

    /* JADX INFO: renamed from: f */
    public final Integer f134636f;

    public llf0(h2r0 h2r0Var, b791 b791Var, b791 b791Var2, b791 b791Var3, xx7 xx7Var, Integer num) {
        this.f134631a = h2r0Var;
        this.f134632b = b791Var;
        this.f134633c = b791Var2;
        this.f134634d = b791Var3;
        this.f134635e = xx7Var;
        this.f134636f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llf0)) {
            return false;
        }
        llf0 llf0Var = (llf0) obj;
        return wj50.m88271j(this.f134631a, llf0Var.f134631a) && wj50.m88271j(this.f134632b, llf0Var.f134632b) && wj50.m88271j(this.f134633c, llf0Var.f134633c) && wj50.m88271j(this.f134634d, llf0Var.f134634d) && this.f134635e == llf0Var.f134635e && wj50.m88271j(this.f134636f, llf0Var.f134636f);
    }

    public final int hashCode() {
        int iHashCode = (this.f134632b.hashCode() + (this.f134631a.hashCode() * 31)) * 31;
        b791 b791Var = this.f134633c;
        int iHashCode2 = (this.f134635e.hashCode() + ((this.f134634d.hashCode() + ((iHashCode + (b791Var == null ? 0 : b791Var.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.f134636f;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
