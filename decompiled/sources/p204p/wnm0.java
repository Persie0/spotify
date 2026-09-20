package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wnm0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f253217a;

    /* JADX INFO: renamed from: b */
    public final Integer f253218b;

    /* JADX INFO: renamed from: c */
    public final boolean f253219c;

    /* JADX INFO: renamed from: d */
    public final boolean f253220d;

    /* JADX INFO: renamed from: e */
    public final boolean f253221e;

    /* JADX INFO: renamed from: f */
    public final boolean f253222f;

    /* JADX INFO: renamed from: g */
    public final boolean f253223g;

    /* JADX INFO: renamed from: h */
    public final boolean f253224h;

    public wnm0(qf40 qf40Var, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f253217a = qf40Var;
        this.f253218b = num;
        this.f253219c = z;
        this.f253220d = z2;
        this.f253221e = z3;
        this.f253222f = z4;
        this.f253223g = z5;
        this.f253224h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnm0)) {
            return false;
        }
        wnm0 wnm0Var = (wnm0) obj;
        return wj50.m88271j(this.f253217a, wnm0Var.f253217a) && wj50.m88271j(this.f253218b, wnm0Var.f253218b) && this.f253219c == wnm0Var.f253219c && this.f253220d == wnm0Var.f253220d && this.f253221e == wnm0Var.f253221e && this.f253222f == wnm0Var.f253222f && this.f253223g == wnm0Var.f253223g && this.f253224h == wnm0Var.f253224h;
    }

    public final int hashCode() {
        int iHashCode = this.f253217a.hashCode() * 31;
        Integer num = this.f253218b;
        return Boolean.hashCode(this.f253224h) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f253219c), 31, this.f253220d), 31, this.f253221e), 31, this.f253222f), 31, this.f253223g);
    }
}
