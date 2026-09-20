package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class qt9 implements y210 {

    /* JADX INFO: renamed from: a */
    public final String f192324a;

    /* JADX INFO: renamed from: b */
    public final String f192325b;

    /* JADX INFO: renamed from: c */
    public final List f192326c;

    /* JADX INFO: renamed from: d */
    public final String f192327d;

    /* JADX INFO: renamed from: e */
    public final String f192328e;

    /* JADX INFO: renamed from: f */
    public final String f192329f;

    /* JADX INFO: renamed from: g */
    public final vda1 f192330g;

    /* JADX INFO: renamed from: h */
    public final ney0 f192331h;

    /* JADX INFO: renamed from: i */
    public final boolean f192332i;

    /* JADX INFO: renamed from: j */
    public final Set f192333j;

    /* JADX INFO: renamed from: k */
    public final String f192334k;

    /* JADX INFO: renamed from: l */
    public final boolean f192335l;

    /* JADX INFO: renamed from: m */
    public final boolean f192336m;

    /* JADX INFO: renamed from: n */
    public final boolean f192337n;

    public qt9(String str, String str2, List list, String str3, String str4, String str5, vda1 vda1Var, ney0 ney0Var, boolean z, Set set, String str6, boolean z2, boolean z3, boolean z4) {
        this.f192324a = str;
        this.f192325b = str2;
        this.f192326c = list;
        this.f192327d = str3;
        this.f192328e = str4;
        this.f192329f = str5;
        this.f192330g = vda1Var;
        this.f192331h = ney0Var;
        this.f192332i = z;
        this.f192333j = set;
        this.f192334k = str6;
        this.f192335l = z2;
        this.f192336m = z3;
        this.f192337n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt9)) {
            return false;
        }
        qt9 qt9Var = (qt9) obj;
        return wj50.m88271j(this.f192324a, qt9Var.f192324a) && wj50.m88271j(this.f192325b, qt9Var.f192325b) && wj50.m88271j(this.f192326c, qt9Var.f192326c) && wj50.m88271j(this.f192327d, qt9Var.f192327d) && wj50.m88271j(this.f192328e, qt9Var.f192328e) && wj50.m88271j(this.f192329f, qt9Var.f192329f) && wj50.m88271j(this.f192330g, qt9Var.f192330g) && wj50.m88271j(this.f192331h, qt9Var.f192331h) && this.f192332i == qt9Var.f192332i && wj50.m88271j(this.f192333j, qt9Var.f192333j) && wj50.m88271j(this.f192334k, qt9Var.f192334k) && this.f192335l == qt9Var.f192335l && this.f192336m == qt9Var.f192336m && this.f192337n == qt9Var.f192337n;
    }

    public final int hashCode() {
        int iHashCode = this.f192324a.hashCode() * 31;
        String str = this.f192325b;
        int iM77243b = s571.m77243b(s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f192326c), 31, this.f192327d);
        String str2 = this.f192328e;
        int iHashCode2 = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f192329f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        vda1 vda1Var = this.f192330g;
        int iHashCode4 = (iHashCode3 + (vda1Var == null ? 0 : vda1Var.hashCode())) * 31;
        ney0 ney0Var = this.f192331h;
        int iM77245d = s571.m77245d((iHashCode4 + (ney0Var == null ? 0 : ney0Var.hashCode())) * 31, 31, this.f192332i);
        Set set = this.f192333j;
        int iHashCode5 = (iM77245d + (set == null ? 0 : set.hashCode())) * 31;
        String str4 = this.f192334k;
        return Boolean.hashCode(this.f192337n) + s571.m77245d(s571.m77245d((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f192335l), 31, this.f192336m);
    }
}
