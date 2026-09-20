package p204p;

import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ReactionsRow;

/* JADX INFO: loaded from: classes9.dex */
public final class tff {

    /* JADX INFO: renamed from: a */
    public final lff f219935a;

    /* JADX INFO: renamed from: b */
    public final String f219936b;

    /* JADX INFO: renamed from: c */
    public final int f219937c;

    /* JADX INFO: renamed from: d */
    public final String f219938d;

    /* JADX INFO: renamed from: e */
    public final boolean f219939e;

    /* JADX INFO: renamed from: f */
    public final String f219940f;

    /* JADX INFO: renamed from: g */
    public final boolean f219941g;

    /* JADX INFO: renamed from: h */
    public final boolean f219942h;

    /* JADX INFO: renamed from: i */
    public final long f219943i;

    /* JADX INFO: renamed from: j */
    public final String f219944j;

    /* JADX INFO: renamed from: k */
    public final int f219945k;

    /* JADX INFO: renamed from: l */
    public final ReactionsRow f219946l;

    /* JADX INFO: renamed from: m */
    public final boolean f219947m;

    /* JADX INFO: renamed from: n */
    public final ov71 f219948n;

    public tff(lff lffVar, String str, int i, String str2, boolean z, String str3, boolean z2, boolean z3, long j, String str4, int i2, ReactionsRow reactionsRow, boolean z4, ov71 ov71Var) {
        this.f219935a = lffVar;
        this.f219936b = str;
        this.f219937c = i;
        this.f219938d = str2;
        this.f219939e = z;
        this.f219940f = str3;
        this.f219941g = z2;
        this.f219942h = z3;
        this.f219943i = j;
        this.f219944j = str4;
        this.f219945k = i2;
        this.f219946l = reactionsRow;
        this.f219947m = z4;
        this.f219948n = ov71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tff)) {
            return false;
        }
        tff tffVar = (tff) obj;
        return wj50.m88271j(this.f219935a, tffVar.f219935a) && wj50.m88271j(this.f219936b, tffVar.f219936b) && this.f219937c == tffVar.f219937c && wj50.m88271j(this.f219938d, tffVar.f219938d) && this.f219939e == tffVar.f219939e && wj50.m88271j(this.f219940f, tffVar.f219940f) && this.f219941g == tffVar.f219941g && this.f219942h == tffVar.f219942h && this.f219943i == tffVar.f219943i && wj50.m88271j(this.f219944j, tffVar.f219944j) && this.f219945k == tffVar.f219945k && wj50.m88271j(this.f219946l, tffVar.f219946l) && this.f219947m == tffVar.f219947m && wj50.m88271j(this.f219948n, tffVar.f219948n);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(mt60.m62800g(this.f219937c, s571.m77243b(this.f219935a.hashCode() * 31, 31, this.f219936b), 31), 31, this.f219938d), 31, this.f219939e);
        String str = this.f219940f;
        int iM62800g = mt60.m62800g(this.f219945k, s571.m77243b(dq60.m36605e(s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f219941g), 31, this.f219942h), this.f219943i, 31), 31, this.f219944j), 31);
        ReactionsRow reactionsRow = this.f219946l;
        return this.f219948n.hashCode() + s571.m77245d((iM62800g + (reactionsRow != null ? reactionsRow.hashCode() : 0)) * 31, 31, this.f219947m);
    }

    public /* synthetic */ tff(lff lffVar, String str, String str2, String str3, boolean z, boolean z2, long j, String str4, int i, ReactionsRow reactionsRow, boolean z3, ov71 ov71Var) {
        this(lffVar, str, 0, str2, false, str3, z, z2, j, str4, i, reactionsRow, z3, ov71Var);
    }
}
