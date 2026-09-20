package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hr11 {

    /* JADX INFO: renamed from: a */
    public final String f94305a;

    /* JADX INFO: renamed from: b */
    public final String f94306b;

    /* JADX INFO: renamed from: c */
    public final String f94307c;

    /* JADX INFO: renamed from: d */
    public final String f94308d;

    /* JADX INFO: renamed from: e */
    public final String f94309e;

    /* JADX INFO: renamed from: f */
    public final String f94310f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f94311g;

    /* JADX INFO: renamed from: h */
    public final List f94312h;

    /* JADX INFO: renamed from: i */
    public final boolean f94313i;

    public hr11(String str, String str2, String str3, String str4, String str5, String str6, rcm0 rcm0Var, List list, boolean z) {
        this.f94305a = str;
        this.f94306b = str2;
        this.f94307c = str3;
        this.f94308d = str4;
        this.f94309e = str5;
        this.f94310f = str6;
        this.f94311g = rcm0Var;
        this.f94312h = list;
        this.f94313i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr11)) {
            return false;
        }
        hr11 hr11Var = (hr11) obj;
        return wj50.m88271j(this.f94305a, hr11Var.f94305a) && wj50.m88271j(this.f94306b, hr11Var.f94306b) && wj50.m88271j(this.f94307c, hr11Var.f94307c) && wj50.m88271j(this.f94308d, hr11Var.f94308d) && wj50.m88271j(this.f94309e, hr11Var.f94309e) && wj50.m88271j(this.f94310f, hr11Var.f94310f) && wj50.m88271j(this.f94311g, hr11Var.f94311g) && wj50.m88271j(this.f94312h, hr11Var.f94312h) && this.f94313i == hr11Var.f94313i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94313i) + s571.m77244c(yds.m93483m(this.f94311g, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f94305a.hashCode() * 31, 31, this.f94306b), 31, this.f94307c), 31, this.f94308d), 31, this.f94309e), 31, this.f94310f), 31), 31, this.f94312h);
    }
}
