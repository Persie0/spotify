package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c740 {

    /* JADX INFO: renamed from: a */
    public final v96 f34742a;

    /* JADX INFO: renamed from: b */
    public final String f34743b;

    /* JADX INFO: renamed from: c */
    public final String f34744c;

    /* JADX INFO: renamed from: d */
    public final String f34745d;

    /* JADX INFO: renamed from: e */
    public final String f34746e;

    /* JADX INFO: renamed from: f */
    public final String f34747f;

    /* JADX INFO: renamed from: g */
    public final Integer f34748g;

    /* JADX INFO: renamed from: h */
    public final b740 f34749h;

    /* JADX INFO: renamed from: i */
    public final boolean f34750i;

    public c740(v96 v96Var, String str, String str2, String str3, String str4, String str5, Integer num, b740 b740Var, boolean z) {
        this.f34742a = v96Var;
        this.f34743b = str;
        this.f34744c = str2;
        this.f34745d = str3;
        this.f34746e = str4;
        this.f34747f = str5;
        this.f34748g = num;
        this.f34749h = b740Var;
        this.f34750i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c740)) {
            return false;
        }
        c740 c740Var = (c740) obj;
        return wj50.m88271j(this.f34742a, c740Var.f34742a) && wj50.m88271j(this.f34743b, c740Var.f34743b) && wj50.m88271j(this.f34744c, c740Var.f34744c) && wj50.m88271j(this.f34745d, c740Var.f34745d) && wj50.m88271j(this.f34746e, c740Var.f34746e) && wj50.m88271j(this.f34747f, c740Var.f34747f) && wj50.m88271j(this.f34748g, c740Var.f34748g) && wj50.m88271j(this.f34749h, c740Var.f34749h) && this.f34750i == c740Var.f34750i;
    }

    public final int hashCode() {
        v96 v96Var = this.f34742a;
        int iHashCode = (v96Var == null ? 0 : v96Var.hashCode()) * 31;
        String str = this.f34743b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34744c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34745d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34746e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f34747f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f34748g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        b740 b740Var = this.f34749h;
        return Boolean.hashCode(this.f34750i) + ((iHashCode7 + (b740Var != null ? b740Var.hashCode() : 0)) * 31);
    }
}
