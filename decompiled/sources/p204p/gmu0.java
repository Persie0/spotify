package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gmu0 {

    /* JADX INFO: renamed from: a */
    public final String f81478a;

    /* JADX INFO: renamed from: b */
    public final int f81479b;

    /* JADX INFO: renamed from: c */
    public final String f81480c;

    /* JADX INFO: renamed from: d */
    public final String f81481d;

    /* JADX INFO: renamed from: e */
    public final List f81482e;

    /* JADX INFO: renamed from: f */
    public final int f81483f;

    /* JADX INFO: renamed from: g */
    public final int f81484g;

    /* JADX INFO: renamed from: h */
    public final boolean f81485h;

    /* JADX INFO: renamed from: i */
    public final int f81486i;

    public gmu0(String str, int i, String str2, String str3, List list, int i2, int i3, boolean z, int i4) {
        this.f81478a = str;
        this.f81479b = i;
        this.f81480c = str2;
        this.f81481d = str3;
        this.f81482e = list;
        this.f81483f = i2;
        this.f81484g = i3;
        this.f81485h = z;
        this.f81486i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmu0)) {
            return false;
        }
        gmu0 gmu0Var = (gmu0) obj;
        return wj50.m88271j(this.f81478a, gmu0Var.f81478a) && this.f81479b == gmu0Var.f81479b && wj50.m88271j(this.f81480c, gmu0Var.f81480c) && wj50.m88271j(this.f81481d, gmu0Var.f81481d) && wj50.m88271j(this.f81482e, gmu0Var.f81482e) && this.f81483f == gmu0Var.f81483f && this.f81484g == gmu0Var.f81484g && this.f81485h == gmu0Var.f81485h && this.f81486i == gmu0Var.f81486i;
    }

    public final int hashCode() {
        return edb.m38547C(this.f81486i) + s571.m77245d(mt60.m62800g(this.f81484g, mt60.m62800g(this.f81483f, s571.m77244c(s571.m77243b(s571.m77243b(mt60.m62800g(this.f81479b, this.f81478a.hashCode() * 31, 31), 31, this.f81480c), 31, this.f81481d), 31, this.f81482e), 31), 31), 31, this.f81485h);
    }
}
