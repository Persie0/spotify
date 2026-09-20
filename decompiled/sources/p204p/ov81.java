package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ov81 {

    /* JADX INFO: renamed from: a */
    public final String f170446a;

    /* JADX INFO: renamed from: b */
    public final String f170447b;

    /* JADX INFO: renamed from: c */
    public final int f170448c;

    /* JADX INFO: renamed from: d */
    public final boolean f170449d;

    /* JADX INFO: renamed from: e */
    public final boolean f170450e;

    /* JADX INFO: renamed from: f */
    public final String f170451f;

    /* JADX INFO: renamed from: g */
    public final boolean f170452g;

    /* JADX INFO: renamed from: h */
    public final boolean f170453h;

    /* JADX INFO: renamed from: i */
    public final tl11 f170454i;

    public ov81(String str, String str2, int i, boolean z, boolean z2, String str3, boolean z3, boolean z4, tl11 tl11Var) {
        this.f170446a = str;
        this.f170447b = str2;
        this.f170448c = i;
        this.f170449d = z;
        this.f170450e = z2;
        this.f170451f = str3;
        this.f170452g = z3;
        this.f170453h = z4;
        this.f170454i = tl11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov81)) {
            return false;
        }
        ov81 ov81Var = (ov81) obj;
        return wj50.m88271j(this.f170446a, ov81Var.f170446a) && wj50.m88271j(this.f170447b, ov81Var.f170447b) && this.f170448c == ov81Var.f170448c && this.f170449d == ov81Var.f170449d && this.f170450e == ov81Var.f170450e && wj50.m88271j(this.f170451f, ov81Var.f170451f) && this.f170452g == ov81Var.f170452g && this.f170453h == ov81Var.f170453h && wj50.m88271j(this.f170454i, ov81Var.f170454i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(mt60.m62800g(this.f170448c, s571.m77243b(this.f170446a.hashCode() * 31, 31, this.f170447b), 31), 31, this.f170449d), 31, this.f170450e);
        String str = this.f170451f;
        return this.f170454i.hashCode() + s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f170452g), 31, this.f170453h);
    }
}
