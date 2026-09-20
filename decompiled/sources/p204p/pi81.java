package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pi81 {

    /* JADX INFO: renamed from: a */
    public final String f177856a;

    /* JADX INFO: renamed from: b */
    public final qf40 f177857b;

    /* JADX INFO: renamed from: c */
    public final boolean f177858c;

    /* JADX INFO: renamed from: d */
    public final boolean f177859d;

    /* JADX INFO: renamed from: e */
    public final String f177860e;

    /* JADX INFO: renamed from: f */
    public final String f177861f;

    /* JADX INFO: renamed from: g */
    public final boolean f177862g;

    /* JADX INFO: renamed from: h */
    public final String f177863h;

    /* JADX INFO: renamed from: i */
    public final boolean f177864i;

    /* JADX INFO: renamed from: j */
    public final boolean f177865j;

    public pi81(String str, qf40 qf40Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, boolean z4, boolean z5) {
        this.f177856a = str;
        this.f177857b = qf40Var;
        this.f177858c = z;
        this.f177859d = z2;
        this.f177860e = str2;
        this.f177861f = str3;
        this.f177862g = z3;
        this.f177863h = str4;
        this.f177864i = z4;
        this.f177865j = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi81)) {
            return false;
        }
        pi81 pi81Var = (pi81) obj;
        return wj50.m88271j(this.f177856a, pi81Var.f177856a) && wj50.m88271j(this.f177857b, pi81Var.f177857b) && this.f177858c == pi81Var.f177858c && this.f177859d == pi81Var.f177859d && this.f177860e.equals(pi81Var.f177860e) && wj50.m88271j(this.f177861f, pi81Var.f177861f) && this.f177862g == pi81Var.f177862g && wj50.m88271j(this.f177863h, pi81Var.f177863h) && this.f177864i == pi81Var.f177864i && this.f177865j == pi81Var.f177865j;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(fr0.m42461e(this.f177857b, this.f177856a.hashCode() * 31, 31), 31, this.f177858c), 31, this.f177859d), 31, true), 31, this.f177860e), 31, this.f177861f), 31, this.f177862g);
        String str = this.f177863h;
        return Boolean.hashCode(this.f177865j) + s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f177864i);
    }
}
