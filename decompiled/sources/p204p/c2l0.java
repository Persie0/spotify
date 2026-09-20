package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c2l0 {

    /* JADX INFO: renamed from: a */
    public final String f33414a;

    /* JADX INFO: renamed from: b */
    public final String f33415b;

    /* JADX INFO: renamed from: c */
    public final String f33416c;

    /* JADX INFO: renamed from: d */
    public final String f33417d;

    /* JADX INFO: renamed from: e */
    public final int f33418e;

    /* JADX INFO: renamed from: f */
    public final int f33419f;

    /* JADX INFO: renamed from: g */
    public final boolean f33420g;

    /* JADX INFO: renamed from: h */
    public final boolean f33421h;

    /* JADX INFO: renamed from: i */
    public final int f33422i;

    public c2l0(String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, int i3) {
        this.f33414a = str;
        this.f33415b = str2;
        this.f33416c = str3;
        this.f33417d = str4;
        this.f33418e = i;
        this.f33419f = i2;
        this.f33420g = z;
        this.f33421h = z2;
        this.f33422i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2l0)) {
            return false;
        }
        c2l0 c2l0Var = (c2l0) obj;
        return wj50.m88271j(this.f33414a, c2l0Var.f33414a) && wj50.m88271j(this.f33415b, c2l0Var.f33415b) && wj50.m88271j(this.f33416c, c2l0Var.f33416c) && wj50.m88271j(this.f33417d, c2l0Var.f33417d) && this.f33418e == c2l0Var.f33418e && this.f33419f == c2l0Var.f33419f && this.f33420g == c2l0Var.f33420g && this.f33421h == c2l0Var.f33421h && this.f33422i == c2l0Var.f33422i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f33414a.hashCode() * 31, 31, this.f33415b), 31, this.f33416c);
        String str = this.f33417d;
        return edb.m38547C(this.f33422i) + s571.m77245d(s571.m77245d(f710.m40938f(this.f33419f, f710.m40938f(this.f33418e, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f33420g), 31, this.f33421h);
    }
}
