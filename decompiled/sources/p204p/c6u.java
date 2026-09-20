package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c6u {

    /* JADX INFO: renamed from: a */
    public final String f34621a;

    /* JADX INFO: renamed from: b */
    public final String f34622b;

    /* JADX INFO: renamed from: c */
    public final String f34623c;

    /* JADX INFO: renamed from: d */
    public final osb1 f34624d;

    /* JADX INFO: renamed from: e */
    public final boolean f34625e;

    /* JADX INFO: renamed from: f */
    public final boolean f34626f;

    /* JADX INFO: renamed from: g */
    public final boolean f34627g;

    /* JADX INFO: renamed from: h */
    public final long f34628h;

    /* JADX INFO: renamed from: i */
    public final boolean f34629i;

    public c6u(String str, String str2, String str3, osb1 osb1Var, boolean z, boolean z2, boolean z3, long j, boolean z4) {
        this.f34621a = str;
        this.f34622b = str2;
        this.f34623c = str3;
        this.f34624d = osb1Var;
        this.f34625e = z;
        this.f34626f = z2;
        this.f34627g = z3;
        this.f34628h = j;
        this.f34629i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6u)) {
            return false;
        }
        c6u c6uVar = (c6u) obj;
        return wj50.m88271j(this.f34621a, c6uVar.f34621a) && wj50.m88271j(this.f34622b, c6uVar.f34622b) && this.f34623c.equals(c6uVar.f34623c) && this.f34624d.equals(c6uVar.f34624d) && this.f34625e == c6uVar.f34625e && this.f34626f == c6uVar.f34626f && this.f34627g == c6uVar.f34627g && this.f34628h == c6uVar.f34628h && this.f34629i == c6uVar.f34629i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34629i) + dq60.m36605e(s571.m77245d(s571.m77245d(s571.m77245d((this.f34624d.hashCode() + s571.m77243b(s571.m77243b(this.f34621a.hashCode() * 31, 31, this.f34622b), 961, this.f34623c)) * 31, 31, this.f34625e), 31, this.f34626f), 31, this.f34627g), this.f34628h, 31);
    }
}
