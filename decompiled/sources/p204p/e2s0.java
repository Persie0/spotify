package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e2s0 {

    /* JADX INFO: renamed from: a */
    public final String f55507a;

    /* JADX INFO: renamed from: b */
    public final String f55508b;

    /* JADX INFO: renamed from: c */
    public final String f55509c;

    /* JADX INFO: renamed from: d */
    public final String f55510d;

    /* JADX INFO: renamed from: e */
    public final boolean f55511e;

    /* JADX INFO: renamed from: f */
    public final String f55512f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f55513g;

    /* JADX INFO: renamed from: h */
    public final List f55514h;

    public e2s0(String str, String str2, String str3, String str4, boolean z, String str5, rcm0 rcm0Var, List list) {
        this.f55507a = str;
        this.f55508b = str2;
        this.f55509c = str3;
        this.f55510d = str4;
        this.f55511e = z;
        this.f55512f = str5;
        this.f55513g = rcm0Var;
        this.f55514h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2s0)) {
            return false;
        }
        e2s0 e2s0Var = (e2s0) obj;
        return wj50.m88271j(this.f55507a, e2s0Var.f55507a) && wj50.m88271j(this.f55508b, e2s0Var.f55508b) && wj50.m88271j(this.f55509c, e2s0Var.f55509c) && wj50.m88271j(this.f55510d, e2s0Var.f55510d) && this.f55511e == e2s0Var.f55511e && wj50.m88271j(this.f55512f, e2s0Var.f55512f) && wj50.m88271j(this.f55513g, e2s0Var.f55513g) && wj50.m88271j(this.f55514h, e2s0Var.f55514h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f55507a.hashCode() * 31, 31, this.f55508b);
        String str = this.f55509c;
        return this.f55514h.hashCode() + yds.m93483m(this.f55513g, s571.m77243b(s571.m77245d(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f55510d), 31, this.f55511e), 31, this.f55512f), 31);
    }
}
