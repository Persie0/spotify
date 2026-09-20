package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zhn0 {

    /* JADX INFO: renamed from: a */
    public final xhn0 f282977a;

    /* JADX INFO: renamed from: b */
    public final int f282978b;

    /* JADX INFO: renamed from: c */
    public final i6t0 f282979c;

    /* JADX INFO: renamed from: d */
    public final String f282980d;

    /* JADX INFO: renamed from: e */
    public final boolean f282981e;

    /* JADX INFO: renamed from: f */
    public final boolean f282982f;

    public zhn0(xhn0 xhn0Var, int i, i6t0 i6t0Var, String str, boolean z, boolean z2) {
        this.f282977a = xhn0Var;
        this.f282978b = i;
        this.f282979c = i6t0Var;
        this.f282980d = str;
        this.f282981e = z;
        this.f282982f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhn0)) {
            return false;
        }
        zhn0 zhn0Var = (zhn0) obj;
        return this.f282977a.equals(zhn0Var.f282977a) && this.f282978b == zhn0Var.f282978b && wj50.m88271j(this.f282979c, zhn0Var.f282979c) && wj50.m88271j(this.f282980d, zhn0Var.f282980d) && this.f282981e == zhn0Var.f282981e && this.f282982f == zhn0Var.f282982f;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f282978b, this.f282977a.hashCode() * 31, 31);
        i6t0 i6t0Var = this.f282979c;
        return Boolean.hashCode(this.f282982f) + s571.m77245d(s571.m77243b((iM40938f + (i6t0Var == null ? 0 : i6t0Var.hashCode())) * 31, 31, this.f282980d), 31, this.f282981e);
    }
}
