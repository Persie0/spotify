package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v0z0 extends vbg1 {

    /* JADX INFO: renamed from: c */
    public final String f236185c;

    /* JADX INFO: renamed from: d */
    public final int f236186d;

    /* JADX INFO: renamed from: e */
    public final boolean f236187e;

    /* JADX INFO: renamed from: f */
    public final kct f236188f;

    /* JADX INFO: renamed from: g */
    public final boolean f236189g;

    /* JADX INFO: renamed from: h */
    public final boolean f236190h;

    /* JADX INFO: renamed from: i */
    public final boolean f236191i;

    /* JADX INFO: renamed from: j */
    public final Integer f236192j;

    /* JADX INFO: renamed from: k */
    public final boolean f236193k;

    /* JADX INFO: renamed from: l */
    public final s0z0 f236194l;

    /* JADX INFO: renamed from: m */
    public final String f236195m;

    /* JADX INFO: renamed from: n */
    public final String f236196n;

    /* JADX INFO: renamed from: o */
    public final String f236197o;

    /* JADX INFO: renamed from: p */
    public final boolean f236198p;

    /* JADX INFO: renamed from: q */
    public final int f236199q;

    /* JADX INFO: renamed from: r */
    public final boolean f236200r;

    /* JADX INFO: renamed from: s */
    public final boolean f236201s;

    public /* synthetic */ v0z0(String str, int i, boolean z, kct kctVar, boolean z2, boolean z3, Integer num, boolean z4, s0z0 s0z0Var, String str2, String str3, String str4, boolean z5, int i2, boolean z6, boolean z7, int i3) {
        this(str, i, z, kctVar, false, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? false : z4, s0z0Var, (i3 & 1024) != 0 ? null : str2, str3, (i3 & 4096) != 0 ? null : str4, (i3 & 8192) != 0 ? false : z5, (i3 & 16384) != 0 ? 1 : i2, (32768 & i3) != 0 ? false : z6, (i3 & 65536) != 0 ? false : z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0z0)) {
            return false;
        }
        v0z0 v0z0Var = (v0z0) obj;
        return wj50.m88271j(this.f236185c, v0z0Var.f236185c) && this.f236186d == v0z0Var.f236186d && this.f236187e == v0z0Var.f236187e && wj50.m88271j(this.f236188f, v0z0Var.f236188f) && this.f236189g == v0z0Var.f236189g && this.f236190h == v0z0Var.f236190h && this.f236191i == v0z0Var.f236191i && wj50.m88271j(this.f236192j, v0z0Var.f236192j) && this.f236193k == v0z0Var.f236193k && wj50.m88271j(this.f236194l, v0z0Var.f236194l) && wj50.m88271j(this.f236195m, v0z0Var.f236195m) && wj50.m88271j(this.f236196n, v0z0Var.f236196n) && wj50.m88271j(this.f236197o, v0z0Var.f236197o) && this.f236198p == v0z0Var.f236198p && this.f236199q == v0z0Var.f236199q && this.f236200r == v0z0Var.f236200r && this.f236201s == v0z0Var.f236201s;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f236186d, this.f236185c.hashCode() * 31, 31), 31, this.f236187e);
        kct kctVar = this.f236188f;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (kctVar == null ? 0 : kctVar.hashCode())) * 31, 31, this.f236189g), 31, this.f236190h), 31, this.f236191i);
        Integer num = this.f236192j;
        int iHashCode = (this.f236194l.hashCode() + s571.m77245d((iM77245d2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f236193k)) * 31;
        String str = this.f236195m;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f236196n);
        String str2 = this.f236197o;
        return Boolean.hashCode(this.f236201s) + s571.m77245d(f710.m40938f(this.f236199q, s571.m77245d((iM77243b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f236198p), 31), 31, this.f236200r);
    }

    @Override // p204p.vbg1
    /* JADX INFO: renamed from: r */
    public final Integer mo79852r() {
        return this.f236192j;
    }

    @Override // p204p.vbg1
    /* JADX INFO: renamed from: s */
    public final int mo79853s() {
        return this.f236186d;
    }

    @Override // p204p.vbg1
    /* JADX INFO: renamed from: t */
    public final boolean mo79854t() {
        return this.f236191i;
    }

    @Override // p204p.vbg1
    /* JADX INFO: renamed from: u */
    public final String mo79855u() {
        return this.f236185c;
    }

    @Override // p204p.vbg1
    /* JADX INFO: renamed from: v */
    public final boolean mo79856v() {
        return this.f236187e;
    }

    public v0z0(String str, int i, boolean z, kct kctVar, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, s0z0 s0z0Var, String str2, String str3, String str4, boolean z6, int i2, boolean z7, boolean z8) {
        this.f236185c = str;
        this.f236186d = i;
        this.f236187e = z;
        this.f236188f = kctVar;
        this.f236189g = z2;
        this.f236190h = z3;
        this.f236191i = z4;
        this.f236192j = num;
        this.f236193k = z5;
        this.f236194l = s0z0Var;
        this.f236195m = str2;
        this.f236196n = str3;
        this.f236197o = str4;
        this.f236198p = z6;
        this.f236199q = i2;
        this.f236200r = z7;
        this.f236201s = z8;
    }
}
