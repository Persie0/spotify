package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fs11 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f72737a;

    /* JADX INFO: renamed from: b */
    public final String f72738b;

    /* JADX INFO: renamed from: c */
    public final String f72739c;

    /* JADX INFO: renamed from: d */
    public final String f72740d;

    /* JADX INFO: renamed from: e */
    public final String f72741e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f72742f;

    /* JADX INFO: renamed from: g */
    public final wzk f72743g;

    /* JADX INFO: renamed from: h */
    public final boolean f72744h;

    /* JADX INFO: renamed from: i */
    public final boolean f72745i;

    /* JADX INFO: renamed from: j */
    public final boolean f72746j;

    /* JADX INFO: renamed from: k */
    public final int f72747k;

    /* JADX INFO: renamed from: l */
    public final String f72748l;

    /* JADX INFO: renamed from: m */
    public final int f72749m;

    public fs11(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, wzk wzkVar, boolean z, boolean z2, boolean z3, int i, String str6, int i2) {
        this.f72737a = str;
        this.f72738b = str2;
        this.f72739c = str3;
        this.f72740d = str4;
        this.f72741e = str5;
        this.f72742f = arrayList;
        this.f72743g = wzkVar;
        this.f72744h = z;
        this.f72745i = z2;
        this.f72746j = z3;
        this.f72747k = i;
        this.f72748l = str6;
        this.f72749m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs11)) {
            return false;
        }
        fs11 fs11Var = (fs11) obj;
        return wj50.m88271j(this.f72737a, fs11Var.f72737a) && wj50.m88271j(this.f72738b, fs11Var.f72738b) && wj50.m88271j(this.f72739c, fs11Var.f72739c) && wj50.m88271j(this.f72740d, fs11Var.f72740d) && wj50.m88271j(this.f72741e, fs11Var.f72741e) && this.f72742f.equals(fs11Var.f72742f) && this.f72743g.equals(fs11Var.f72743g) && this.f72744h == fs11Var.f72744h && this.f72745i == fs11Var.f72745i && this.f72746j == fs11Var.f72746j && this.f72747k == fs11Var.f72747k && wj50.m88271j(this.f72748l, fs11Var.f72748l) && this.f72749m == fs11Var.f72749m;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f72747k, s571.m77245d(s571.m77245d(s571.m77245d((this.f72743g.hashCode() + lq51.m59700f(this.f72742f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f72737a.hashCode() * 31, 31, this.f72738b), 31, this.f72739c), 31, this.f72740d), 31, this.f72741e), 31)) * 31, 31, this.f72744h), 31, this.f72745i), 31, this.f72746j), 31);
        String str = this.f72748l;
        return edb.m38547C(this.f72749m) + ((iM40938f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
