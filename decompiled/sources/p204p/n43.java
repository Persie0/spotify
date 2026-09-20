package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n43 {

    /* JADX INFO: renamed from: a */
    public final String f150178a;

    /* JADX INFO: renamed from: b */
    public final String f150179b;

    /* JADX INFO: renamed from: c */
    public final long f150180c;

    /* JADX INFO: renamed from: d */
    public final String f150181d;

    /* JADX INFO: renamed from: e */
    public final String f150182e;

    /* JADX INFO: renamed from: f */
    public final String f150183f;

    /* JADX INFO: renamed from: g */
    public final boolean f150184g;

    /* JADX INFO: renamed from: h */
    public final boolean f150185h;

    public n43(String str, String str2, long j, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f150178a = str;
        this.f150179b = str2;
        this.f150180c = j;
        this.f150181d = str3;
        this.f150182e = str4;
        this.f150183f = str5;
        this.f150184g = z;
        this.f150185h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n43)) {
            return false;
        }
        n43 n43Var = (n43) obj;
        return wj50.m88271j(this.f150178a, n43Var.f150178a) && wj50.m88271j(this.f150179b, n43Var.f150179b) && this.f150180c == n43Var.f150180c && wj50.m88271j(this.f150181d, n43Var.f150181d) && wj50.m88271j(this.f150182e, n43Var.f150182e) && wj50.m88271j(this.f150183f, n43Var.f150183f) && this.f150184g == n43Var.f150184g && this.f150185h == n43Var.f150185h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150185h) + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(dq60.m36605e(s571.m77243b(this.f150178a.hashCode() * 31, 31, this.f150179b), this.f150180c, 31), 31, this.f150181d), 31, this.f150182e), 31, this.f150183f), 31, this.f150184g);
    }
}
