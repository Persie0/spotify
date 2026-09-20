package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class obk {

    /* JADX INFO: renamed from: a */
    public final String f163659a;

    /* JADX INFO: renamed from: b */
    public final String f163660b;

    /* JADX INFO: renamed from: c */
    public final String f163661c;

    /* JADX INFO: renamed from: d */
    public final long f163662d;

    /* JADX INFO: renamed from: e */
    public final long f163663e;

    /* JADX INFO: renamed from: f */
    public final int f163664f;

    /* JADX INFO: renamed from: g */
    public final int f163665g;

    /* JADX INFO: renamed from: h */
    public final int f163666h;

    /* JADX INFO: renamed from: i */
    public final String f163667i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f163668j;

    /* JADX INFO: renamed from: k */
    public final int f163669k;

    /* JADX INFO: renamed from: l */
    public final boolean f163670l;

    /* JADX INFO: renamed from: m */
    public final boolean f163671m;

    /* JADX INFO: renamed from: n */
    public final nug1 f163672n;

    /* JADX INFO: renamed from: o */
    public final a5x0 f163673o;

    public obk(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, ArrayList arrayList, int i4, boolean z, boolean z2, nug1 nug1Var, a5x0 a5x0Var) {
        this.f163659a = str;
        this.f163660b = str2;
        this.f163661c = str3;
        this.f163662d = j;
        this.f163663e = j2;
        this.f163664f = i;
        this.f163665g = i2;
        this.f163666h = i3;
        this.f163667i = str4;
        this.f163668j = arrayList;
        this.f163669k = i4;
        this.f163670l = z;
        this.f163671m = z2;
        this.f163672n = nug1Var;
        this.f163673o = a5x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obk)) {
            return false;
        }
        obk obkVar = (obk) obj;
        return wj50.m88271j(this.f163659a, obkVar.f163659a) && wj50.m88271j(this.f163660b, obkVar.f163660b) && wj50.m88271j(this.f163661c, obkVar.f163661c) && this.f163662d == obkVar.f163662d && this.f163663e == obkVar.f163663e && this.f163664f == obkVar.f163664f && this.f163665g == obkVar.f163665g && this.f163666h == obkVar.f163666h && wj50.m88271j(this.f163667i, obkVar.f163667i) && this.f163668j.equals(obkVar.f163668j) && this.f163669k == obkVar.f163669k && this.f163670l == obkVar.f163670l && this.f163671m == obkVar.f163671m && this.f163672n.equals(obkVar.f163672n) && this.f163673o.equals(obkVar.f163673o);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f163666h, f710.m40938f(this.f163665g, f710.m40938f(this.f163664f, dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b(this.f163659a.hashCode() * 31, 31, this.f163660b), 31, this.f163661c), this.f163662d, 31), this.f163663e, 31), 31), 31), 31);
        String str = this.f163667i;
        return this.f163673o.hashCode() + ((this.f163672n.hashCode() + s571.m77245d(s571.m77245d(mt60.m62800g(this.f163669k, lq51.m59700f(this.f163668j, (iM40938f + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f163670l), 31, this.f163671m)) * 31);
    }
}
