package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xcz {

    /* JADX INFO: renamed from: a */
    public final String f260309a;

    /* JADX INFO: renamed from: b */
    public final String f260310b;

    /* JADX INFO: renamed from: c */
    public final String f260311c;

    /* JADX INFO: renamed from: d */
    public final String f260312d;

    /* JADX INFO: renamed from: e */
    public final int f260313e;

    /* JADX INFO: renamed from: f */
    public final boolean f260314f;

    /* JADX INFO: renamed from: g */
    public final boolean f260315g;

    /* JADX INFO: renamed from: h */
    public final syg1 f260316h;

    /* JADX INFO: renamed from: i */
    public final boolean f260317i;

    /* JADX INFO: renamed from: j */
    public final List f260318j;

    /* JADX INFO: renamed from: k */
    public final int f260319k;

    public xcz(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, syg1 syg1Var, boolean z3, List list, int i2) {
        this.f260309a = str;
        this.f260310b = str2;
        this.f260311c = str3;
        this.f260312d = str4;
        this.f260313e = i;
        this.f260314f = z;
        this.f260315g = z2;
        this.f260316h = syg1Var;
        this.f260317i = z3;
        this.f260318j = list;
        this.f260319k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcz)) {
            return false;
        }
        xcz xczVar = (xcz) obj;
        return wj50.m88271j(this.f260309a, xczVar.f260309a) && this.f260310b.equals(xczVar.f260310b) && this.f260311c.equals(xczVar.f260311c) && this.f260312d.equals(xczVar.f260312d) && this.f260313e == xczVar.f260313e && this.f260314f == xczVar.f260314f && this.f260315g == xczVar.f260315g && this.f260316h.equals(xczVar.f260316h) && this.f260317i == xczVar.f260317i && this.f260318j.equals(xczVar.f260318j) && this.f260319k == xczVar.f260319k;
    }

    public final int hashCode() {
        return edb.m38547C(this.f260319k) + s571.m77244c(s571.m77245d((this.f260316h.hashCode() + s571.m77245d(s571.m77245d(f710.m40938f(this.f260313e, s571.m77243b(s571.m77243b(s571.m77243b(this.f260309a.hashCode() * 31, 31, this.f260310b), 31, this.f260311c), 31, this.f260312d), 31), 31, this.f260314f), 31, this.f260315g)) * 31, 31, this.f260317i), 31, this.f260318j);
    }
}
