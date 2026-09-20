package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uq1 implements vq1 {

    /* JADX INFO: renamed from: a */
    public final String f232884a;

    /* JADX INFO: renamed from: b */
    public final String f232885b;

    /* JADX INFO: renamed from: c */
    public final String f232886c;

    /* JADX INFO: renamed from: d */
    public final boolean f232887d;

    /* JADX INFO: renamed from: e */
    public final boolean f232888e;

    /* JADX INFO: renamed from: f */
    public final String f232889f;

    /* JADX INFO: renamed from: g */
    public final boolean f232890g;

    /* JADX INFO: renamed from: h */
    public final boolean f232891h;

    /* JADX INFO: renamed from: i */
    public final String f232892i;

    /* JADX INFO: renamed from: j */
    public final boolean f232893j;

    /* JADX INFO: renamed from: k */
    public final boolean f232894k;

    /* JADX INFO: renamed from: l */
    public final int f232895l;

    /* JADX INFO: renamed from: m */
    public final Map f232896m;

    /* JADX INFO: renamed from: n */
    public final int f232897n;

    public uq1(String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, boolean z5, boolean z6, int i, Map map, int i2) {
        this.f232884a = str;
        this.f232885b = str2;
        this.f232886c = str3;
        this.f232887d = z;
        this.f232888e = z2;
        this.f232889f = str4;
        this.f232890g = z3;
        this.f232891h = z4;
        this.f232892i = str5;
        this.f232893j = z5;
        this.f232894k = z6;
        this.f232895l = i;
        this.f232896m = map;
        this.f232897n = i2;
    }

    /* JADX INFO: renamed from: c */
    public static uq1 m83756c(uq1 uq1Var, boolean z, int i) {
        return new uq1(uq1Var.f232884a, uq1Var.f232885b, uq1Var.f232886c, (i & 8) != 0 ? uq1Var.f232887d : true, z, uq1Var.f232889f, uq1Var.f232890g, uq1Var.f232891h, uq1Var.f232892i, uq1Var.f232893j, uq1Var.f232894k, uq1Var.f232895l, uq1Var.f232896m, uq1Var.f232897n);
    }

    @Override // p204p.vq1
    /* JADX INFO: renamed from: a */
    public final String mo81292a() {
        return this.f232886c;
    }

    @Override // p204p.vq1
    /* JADX INFO: renamed from: b */
    public final boolean mo81293b() {
        return this.f232888e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq1)) {
            return false;
        }
        uq1 uq1Var = (uq1) obj;
        return wj50.m88271j(this.f232884a, uq1Var.f232884a) && wj50.m88271j(this.f232885b, uq1Var.f232885b) && wj50.m88271j(this.f232886c, uq1Var.f232886c) && this.f232887d == uq1Var.f232887d && this.f232888e == uq1Var.f232888e && wj50.m88271j(this.f232889f, uq1Var.f232889f) && this.f232890g == uq1Var.f232890g && this.f232891h == uq1Var.f232891h && wj50.m88271j(this.f232892i, uq1Var.f232892i) && this.f232893j == uq1Var.f232893j && this.f232894k == uq1Var.f232894k && this.f232895l == uq1Var.f232895l && wj50.m88271j(this.f232896m, uq1Var.f232896m) && this.f232897n == uq1Var.f232897n;
    }

    @Override // p204p.vq1
    public final String getUri() {
        return this.f232884a;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f232884a.hashCode() * 31, 31, this.f232885b), 31, this.f232886c), 31, this.f232887d), 31, this.f232888e), 31, this.f232889f), 31, this.f232890g), 31, this.f232891h);
        String str = this.f232892i;
        return edb.m38547C(this.f232897n) + edb.m38557f(f710.m40938f(this.f232895l, s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f232893j), 31, this.f232894k), 31), 31, this.f232896m);
    }

    public /* synthetic */ uq1(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3, String str5, boolean z4, boolean z5, int i, Map map, int i2, int i3) {
        this(str, str2, str3, z, z, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? true : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? false : z4, (i3 & 1024) != 0 ? false : z5, (i3 & 2048) != 0 ? 1 : i, (i3 & 4096) != 0 ? nau.f152117a : map, (i3 & 8192) != 0 ? 4 : i2);
    }
}
