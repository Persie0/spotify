package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g920 {

    /* JADX INFO: renamed from: a */
    public final String f77644a;

    /* JADX INFO: renamed from: b */
    public final String f77645b;

    /* JADX INFO: renamed from: c */
    public final boolean f77646c;

    /* JADX INFO: renamed from: d */
    public final boolean f77647d;

    /* JADX INFO: renamed from: e */
    public final Double f77648e;

    /* JADX INFO: renamed from: f */
    public final Integer f77649f;

    /* JADX INFO: renamed from: g */
    public final boolean f77650g;

    public g920(String str, String str2, boolean z, boolean z2, Double d, Integer num, boolean z3) {
        this.f77644a = str;
        this.f77645b = str2;
        this.f77646c = z;
        this.f77647d = z2;
        this.f77648e = d;
        this.f77649f = num;
        this.f77650g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g920)) {
            return false;
        }
        g920 g920Var = (g920) obj;
        return wj50.m88271j(this.f77644a, g920Var.f77644a) && wj50.m88271j(this.f77645b, g920Var.f77645b) && this.f77646c == g920Var.f77646c && this.f77647d == g920Var.f77647d && wj50.m88271j(this.f77648e, g920Var.f77648e) && wj50.m88271j(this.f77649f, g920Var.f77649f) && this.f77650g == g920Var.f77650g;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f77644a.hashCode() * 31, 31, this.f77645b), 31, this.f77646c), 31, this.f77647d);
        Double d = this.f77648e;
        int iHashCode = (iM77245d + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f77649f;
        return Boolean.hashCode(this.f77650g) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
