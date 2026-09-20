package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class acs0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f14418a;

    /* JADX INFO: renamed from: b */
    public final String f14419b;

    /* JADX INFO: renamed from: c */
    public final String f14420c;

    /* JADX INFO: renamed from: d */
    public final String f14421d;

    /* JADX INFO: renamed from: e */
    public final String f14422e;

    /* JADX INFO: renamed from: f */
    public final Object f14423f;

    /* JADX INFO: renamed from: g */
    public final Long f14424g;

    /* JADX INFO: renamed from: h */
    public final String f14425h;

    /* JADX INFO: renamed from: i */
    public final Object f14426i;

    /* JADX INFO: renamed from: j */
    public final String f14427j;

    /* JADX INFO: renamed from: k */
    public final String f14428k;

    /* JADX INFO: renamed from: l */
    public final boolean f14429l;

    /* JADX INFO: renamed from: m */
    public final int f14430m;

    /* JADX INFO: renamed from: n */
    public final String f14431n;

    /* JADX INFO: renamed from: o */
    public final boolean f14432o;

    public acs0(String str, String str2, String str3, String str4, String str5, List list, Long l, String str6, List list2, String str7, String str8, boolean z, int i, String str9, boolean z2) {
        this.f14418a = str;
        this.f14419b = str2;
        this.f14420c = str3;
        this.f14421d = str4;
        this.f14422e = str5;
        this.f14423f = list;
        this.f14424g = l;
        this.f14425h = str6;
        this.f14426i = list2;
        this.f14427j = str7;
        this.f14428k = str8;
        this.f14429l = z;
        this.f14430m = i;
        this.f14431n = str9;
        this.f14432o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acs0)) {
            return false;
        }
        acs0 acs0Var = (acs0) obj;
        return wj50.m88271j(this.f14418a, acs0Var.f14418a) && wj50.m88271j(this.f14419b, acs0Var.f14419b) && wj50.m88271j(this.f14420c, acs0Var.f14420c) && wj50.m88271j(this.f14421d, acs0Var.f14421d) && wj50.m88271j(this.f14422e, acs0Var.f14422e) && this.f14423f.equals(acs0Var.f14423f) && wj50.m88271j(this.f14424g, acs0Var.f14424g) && wj50.m88271j(this.f14425h, acs0Var.f14425h) && this.f14426i.equals(acs0Var.f14426i) && wj50.m88271j(this.f14427j, acs0Var.f14427j) && wj50.m88271j(this.f14428k, acs0Var.f14428k) && this.f14429l == acs0Var.f14429l && this.f14430m == acs0Var.f14430m && this.f14431n.equals(acs0Var.f14431n) && this.f14432o == acs0Var.f14432o;
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f14418a.hashCode() * 31, 31, this.f14419b), 31, this.f14420c), 31, this.f14421d), 31, this.f14422e), 31, this.f14423f);
        Long l = this.f14424g;
        return Boolean.hashCode(this.f14432o) + s571.m77243b(mt60.m62800g(this.f14430m, s571.m77245d(s571.m77243b(s571.m77243b(dq60.m36604d(s571.m77243b((iM36604d + (l == null ? 0 : l.hashCode())) * 31, 31, this.f14425h), 31, this.f14426i), 31, this.f14427j), 31, this.f14428k), 31, this.f14429l), 31), 31, this.f14431n);
    }
}
