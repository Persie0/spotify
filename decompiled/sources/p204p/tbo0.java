package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class tbo0 {

    /* JADX INFO: renamed from: a */
    public final r7o0 f218910a;

    /* JADX INFO: renamed from: b */
    public final C1744ck f218911b;

    /* JADX INFO: renamed from: c */
    public final Map f218912c;

    /* JADX INFO: renamed from: d */
    public final String f218913d;

    /* JADX INFO: renamed from: e */
    public final String f218914e;

    /* JADX INFO: renamed from: f */
    public final List f218915f;

    /* JADX INFO: renamed from: g */
    public final boolean f218916g;

    /* JADX INFO: renamed from: h */
    public final boolean f218917h;

    /* JADX INFO: renamed from: i */
    public final boolean f218918i;

    /* JADX INFO: renamed from: j */
    public final j9i0 f218919j;

    public tbo0(r7o0 r7o0Var, C1744ck c1744ck, Map map, String str, String str2, List list, boolean z, boolean z2, boolean z3, j9i0 j9i0Var) {
        this.f218910a = r7o0Var;
        this.f218911b = c1744ck;
        this.f218912c = map;
        this.f218913d = str;
        this.f218914e = str2;
        this.f218915f = list;
        this.f218916g = z;
        this.f218917h = z2;
        this.f218918i = z3;
        this.f218919j = j9i0Var;
    }

    /* JADX INFO: renamed from: a */
    public static tbo0 m80405a(tbo0 tbo0Var, boolean z, boolean z2, int i) {
        r7o0 r7o0Var = tbo0Var.f218910a;
        C1744ck c1744ck = tbo0Var.f218911b;
        Map map = tbo0Var.f218912c;
        String str = tbo0Var.f218913d;
        String str2 = tbo0Var.f218914e;
        List list = tbo0Var.f218915f;
        tbo0Var.getClass();
        if ((i & 256) != 0) {
            z2 = tbo0Var.f218917h;
        }
        boolean z3 = tbo0Var.f218918i;
        j9i0 j9i0Var = tbo0Var.f218919j;
        tbo0Var.getClass();
        return new tbo0(r7o0Var, c1744ck, map, str, str2, list, z, z2, z3, j9i0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbo0)) {
            return false;
        }
        tbo0 tbo0Var = (tbo0) obj;
        return this.f218910a.equals(tbo0Var.f218910a) && this.f218911b.equals(tbo0Var.f218911b) && this.f218912c.equals(tbo0Var.f218912c) && this.f218913d.equals(tbo0Var.f218913d) && this.f218914e.equals(tbo0Var.f218914e) && wj50.m88271j(this.f218915f, tbo0Var.f218915f) && this.f218916g == tbo0Var.f218916g && this.f218917h == tbo0Var.f218917h && this.f218918i == tbo0Var.f218918i && wj50.m88271j(this.f218919j, tbo0Var.f218919j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(s571.m77243b(s571.m77243b(edb.m38557f((this.f218911b.hashCode() + (this.f218910a.hashCode() * 31)) * 31, 31, this.f218912c), 31, this.f218913d), 31, this.f218914e), 31, this.f218915f), 31, false), 31, this.f218916g), 31, this.f218917h), 31, this.f218918i);
        j9i0 j9i0Var = this.f218919j;
        return iM77245d + (j9i0Var != null ? j9i0Var.hashCode() : 0);
    }
}
