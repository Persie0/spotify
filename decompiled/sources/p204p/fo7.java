package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fo7 {

    /* JADX INFO: renamed from: a */
    public final String f71457a;

    /* JADX INFO: renamed from: b */
    public final String f71458b;

    /* JADX INFO: renamed from: c */
    public final String f71459c;

    /* JADX INFO: renamed from: d */
    public final String f71460d;

    /* JADX INFO: renamed from: e */
    public final boolean f71461e;

    /* JADX INFO: renamed from: f */
    public final boolean f71462f;

    /* JADX INFO: renamed from: g */
    public final boolean f71463g;

    /* JADX INFO: renamed from: h */
    public final String f71464h;

    /* JADX INFO: renamed from: i */
    public final rcm0 f71465i;

    public fo7(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, rcm0 rcm0Var) {
        this.f71457a = str;
        this.f71458b = str2;
        this.f71459c = str3;
        this.f71460d = str4;
        this.f71461e = z;
        this.f71462f = z2;
        this.f71463g = z3;
        this.f71464h = str5;
        this.f71465i = rcm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo7)) {
            return false;
        }
        fo7 fo7Var = (fo7) obj;
        return wj50.m88271j(this.f71457a, fo7Var.f71457a) && wj50.m88271j(this.f71458b, fo7Var.f71458b) && wj50.m88271j(this.f71459c, fo7Var.f71459c) && wj50.m88271j(this.f71460d, fo7Var.f71460d) && this.f71461e == fo7Var.f71461e && this.f71462f == fo7Var.f71462f && this.f71463g == fo7Var.f71463g && wj50.m88271j(this.f71464h, fo7Var.f71464h) && this.f71465i.equals(fo7Var.f71465i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f71457a.hashCode() * 31, 31, this.f71458b);
        String str = this.f71459c;
        return this.f71465i.hashCode() + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f71460d), 31, false), 31, this.f71461e), 31, this.f71462f), 31, this.f71463g), 31, this.f71464h);
    }
}
