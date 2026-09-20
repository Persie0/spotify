package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mnc1 {

    /* JADX INFO: renamed from: a */
    public final String f145397a;

    /* JADX INFO: renamed from: b */
    public final String f145398b;

    /* JADX INFO: renamed from: c */
    public final String f145399c;

    /* JADX INFO: renamed from: d */
    public final List f145400d;

    /* JADX INFO: renamed from: e */
    public final boolean f145401e;

    /* JADX INFO: renamed from: f */
    public final boolean f145402f;

    /* JADX INFO: renamed from: g */
    public final boolean f145403g;

    /* JADX INFO: renamed from: h */
    public final boolean f145404h;

    public /* synthetic */ mnc1(int i, String str, String str2, String str3, List list, boolean z) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? lau.f131415a : list, (i & 16) == 0, false, (i & 64) == 0, (i & 128) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: a */
    public static mnc1 m62355a(mnc1 mnc1Var, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = mnc1Var.f145397a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = mnc1Var.f145398b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = mnc1Var.f145399c;
        }
        return new mnc1(str4, str5, str3, (i & 8) != 0 ? mnc1Var.f145400d : lau.f131415a, mnc1Var.f145401e, (i & 32) != 0 ? mnc1Var.f145402f : true, mnc1Var.f145403g, mnc1Var.f145404h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnc1)) {
            return false;
        }
        mnc1 mnc1Var = (mnc1) obj;
        return wj50.m88271j(this.f145397a, mnc1Var.f145397a) && wj50.m88271j(this.f145398b, mnc1Var.f145398b) && wj50.m88271j(this.f145399c, mnc1Var.f145399c) && wj50.m88271j(this.f145400d, mnc1Var.f145400d) && this.f145401e == mnc1Var.f145401e && this.f145402f == mnc1Var.f145402f && this.f145403g == mnc1Var.f145403g && this.f145404h == mnc1Var.f145404h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145404h) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(s571.m77243b(s571.m77243b(this.f145397a.hashCode() * 31, 31, this.f145398b), 31, this.f145399c), 31, this.f145400d), 31, this.f145401e), 31, this.f145402f), 31, this.f145403g);
    }

    public mnc1(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f145397a = str;
        this.f145398b = str2;
        this.f145399c = str3;
        this.f145400d = list;
        this.f145401e = z;
        this.f145402f = z2;
        this.f145403g = z3;
        this.f145404h = z4;
    }
}
