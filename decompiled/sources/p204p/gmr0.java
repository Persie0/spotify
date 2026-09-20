package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gmr0 {

    /* JADX INFO: renamed from: a */
    public final String f81450a;

    /* JADX INFO: renamed from: b */
    public final String f81451b;

    /* JADX INFO: renamed from: c */
    public final String f81452c;

    /* JADX INFO: renamed from: d */
    public final String f81453d;

    /* JADX INFO: renamed from: e */
    public final List f81454e;

    /* JADX INFO: renamed from: f */
    public final String f81455f;

    /* JADX INFO: renamed from: g */
    public final int f81456g;

    /* JADX INFO: renamed from: h */
    public final boolean f81457h;

    /* JADX INFO: renamed from: i */
    public final boolean f81458i;

    /* JADX INFO: renamed from: j */
    public final boolean f81459j;

    /* JADX INFO: renamed from: k */
    public final boolean f81460k;

    /* JADX INFO: renamed from: l */
    public final boolean f81461l;

    /* JADX INFO: renamed from: m */
    public final boolean f81462m;

    /* JADX INFO: renamed from: n */
    public final boolean f81463n;

    public gmr0(String str, String str2, String str3, String str4, List list, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f81450a = str;
        this.f81451b = str2;
        this.f81452c = str3;
        this.f81453d = str4;
        this.f81454e = list;
        this.f81455f = str5;
        this.f81456g = i;
        this.f81457h = z;
        this.f81458i = z2;
        this.f81459j = z3;
        this.f81460k = z4;
        this.f81461l = z5;
        this.f81462m = z6;
        this.f81463n = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmr0)) {
            return false;
        }
        gmr0 gmr0Var = (gmr0) obj;
        return wj50.m88271j(this.f81450a, gmr0Var.f81450a) && wj50.m88271j(this.f81451b, gmr0Var.f81451b) && wj50.m88271j(this.f81452c, gmr0Var.f81452c) && wj50.m88271j(this.f81453d, gmr0Var.f81453d) && wj50.m88271j(this.f81454e, gmr0Var.f81454e) && wj50.m88271j(this.f81455f, gmr0Var.f81455f) && this.f81456g == gmr0Var.f81456g && this.f81457h == gmr0Var.f81457h && this.f81458i == gmr0Var.f81458i && this.f81459j == gmr0Var.f81459j && this.f81460k == gmr0Var.f81460k && this.f81461l == gmr0Var.f81461l && this.f81462m == gmr0Var.f81462m && this.f81463n == gmr0Var.f81463n;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f81450a.hashCode() * 31, 31, this.f81451b);
        String str = this.f81452c;
        int iM77244c = s571.m77244c(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f81453d), 31, this.f81454e);
        String str2 = this.f81455f;
        return Boolean.hashCode(this.f81463n) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f81456g, (iM77244c + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f81457h), 31, this.f81458i), 31, this.f81459j), 31, this.f81460k), 31, this.f81461l), 31, this.f81462m);
    }
}
