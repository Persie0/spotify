package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class rsd0 {

    /* JADX INFO: renamed from: a */
    public final String f202292a;

    /* JADX INFO: renamed from: b */
    public final String f202293b;

    /* JADX INFO: renamed from: c */
    public final boolean f202294c;

    /* JADX INFO: renamed from: d */
    public final String f202295d;

    /* JADX INFO: renamed from: e */
    public final String f202296e;

    /* JADX INFO: renamed from: f */
    public final String f202297f;

    /* JADX INFO: renamed from: g */
    public final Uri f202298g;

    /* JADX INFO: renamed from: h */
    public final jzk f202299h;

    /* JADX INFO: renamed from: i */
    public final qsd0 f202300i;

    /* JADX INFO: renamed from: j */
    public final boolean f202301j;

    /* JADX INFO: renamed from: k */
    public final boolean f202302k;

    /* JADX INFO: renamed from: l */
    public final String f202303l;

    /* JADX INFO: renamed from: m */
    public final String f202304m;

    /* JADX INFO: renamed from: n */
    public final String f202305n;

    /* JADX INFO: renamed from: o */
    public final String f202306o;

    /* JADX INFO: renamed from: p */
    public final String f202307p;

    /* JADX INFO: renamed from: q */
    public final Uri f202308q;

    /* JADX INFO: renamed from: r */
    public final Uri f202309r;

    /* JADX INFO: renamed from: s */
    public final boolean f202310s;

    /* JADX INFO: renamed from: t */
    public final boolean f202311t;

    /* JADX INFO: renamed from: u */
    public final boolean f202312u;

    /* JADX INFO: renamed from: v */
    public final String f202313v;

    public rsd0(String str, String str2, boolean z, String str3, String str4, String str5, Uri uri, jzk jzkVar, qsd0 qsd0Var, boolean z2, boolean z3, String str6, String str7, String str8, String str9, String str10, Uri uri2, Uri uri3, boolean z4, boolean z5, boolean z6, String str11) {
        this.f202292a = str;
        this.f202293b = str2;
        this.f202294c = z;
        this.f202295d = str3;
        this.f202296e = str4;
        this.f202297f = str5;
        this.f202298g = uri;
        this.f202299h = jzkVar;
        this.f202300i = qsd0Var;
        this.f202301j = z2;
        this.f202302k = z3;
        this.f202303l = str6;
        this.f202304m = str7;
        this.f202305n = str8;
        this.f202306o = str9;
        this.f202307p = str10;
        this.f202308q = uri2;
        this.f202309r = uri3;
        this.f202310s = z4;
        this.f202311t = z5;
        this.f202312u = z6;
        this.f202313v = str11;
    }

    /* JADX INFO: renamed from: a */
    public final String m76315a() {
        return this.f202292a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76316b() {
        return this.f202311t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsd0)) {
            return false;
        }
        rsd0 rsd0Var = (rsd0) obj;
        return wj50.m88271j(this.f202292a, rsd0Var.f202292a) && wj50.m88271j(this.f202293b, rsd0Var.f202293b) && this.f202294c == rsd0Var.f202294c && wj50.m88271j(this.f202295d, rsd0Var.f202295d) && wj50.m88271j(this.f202296e, rsd0Var.f202296e) && wj50.m88271j(this.f202297f, rsd0Var.f202297f) && wj50.m88271j(this.f202298g, rsd0Var.f202298g) && wj50.m88271j(this.f202299h, rsd0Var.f202299h) && wj50.m88271j(this.f202300i, rsd0Var.f202300i) && this.f202301j == rsd0Var.f202301j && this.f202302k == rsd0Var.f202302k && wj50.m88271j(this.f202303l, rsd0Var.f202303l) && wj50.m88271j(this.f202304m, rsd0Var.f202304m) && wj50.m88271j(this.f202305n, rsd0Var.f202305n) && wj50.m88271j(this.f202306o, rsd0Var.f202306o) && wj50.m88271j(this.f202307p, rsd0Var.f202307p) && wj50.m88271j(this.f202308q, rsd0Var.f202308q) && wj50.m88271j(this.f202309r, rsd0Var.f202309r) && this.f202310s == rsd0Var.f202310s && this.f202311t == rsd0Var.f202311t && this.f202312u == rsd0Var.f202312u && wj50.m88271j(this.f202313v, rsd0Var.f202313v);
    }

    public final int hashCode() {
        int iHashCode = this.f202292a.hashCode() * 31;
        String str = this.f202293b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f202294c);
        String str2 = this.f202295d;
        int iHashCode2 = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f202296e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f202297f;
        int iM64019l = nap.m64019l(this.f202298g, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        jzk jzkVar = this.f202299h;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d((this.f202300i.hashCode() + ((iM64019l + (jzkVar == null ? 0 : jzkVar.f117743a.hashCode())) * 31)) * 31, 31, this.f202301j), 31, this.f202302k), 31, this.f202303l), 31, this.f202304m);
        String str5 = this.f202305n;
        return this.f202313v.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(nap.m64019l(this.f202309r, nap.m64019l(this.f202308q, s571.m77243b(s571.m77243b((iM77243b + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f202306o), 31, this.f202307p), 31), 31), 31, this.f202310s), 31, this.f202311t), 31, this.f202312u);
    }
}
