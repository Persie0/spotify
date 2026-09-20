package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pfz0 {

    /* JADX INFO: renamed from: a */
    public final String f177163a;

    /* JADX INFO: renamed from: b */
    public final String f177164b;

    /* JADX INFO: renamed from: c */
    public final String f177165c;

    /* JADX INFO: renamed from: d */
    public final String f177166d;

    /* JADX INFO: renamed from: e */
    public final ci20 f177167e;

    /* JADX INFO: renamed from: f */
    public final boolean f177168f;

    /* JADX INFO: renamed from: g */
    public final Long f177169g;

    public pfz0(String str, String str2, String str3, String str4, ci20 ci20Var, boolean z, Long l) {
        this.f177163a = str;
        this.f177164b = str2;
        this.f177165c = str3;
        this.f177166d = str4;
        this.f177167e = ci20Var;
        this.f177168f = z;
        this.f177169g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfz0)) {
            return false;
        }
        pfz0 pfz0Var = (pfz0) obj;
        return wj50.m88271j(this.f177163a, pfz0Var.f177163a) && wj50.m88271j(this.f177164b, pfz0Var.f177164b) && wj50.m88271j(this.f177165c, pfz0Var.f177165c) && wj50.m88271j(this.f177166d, pfz0Var.f177166d) && wj50.m88271j(this.f177167e, pfz0Var.f177167e) && this.f177168f == pfz0Var.f177168f && wj50.m88271j(this.f177169g, pfz0Var.f177169g);
    }

    public final int hashCode() {
        String str = this.f177163a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f177164b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f177165c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f177166d;
        int iM77245d = s571.m77245d((this.f177167e.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.f177168f);
        Long l = this.f177169g;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
