package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d63 {

    /* JADX INFO: renamed from: a */
    public final String f45544a;

    /* JADX INFO: renamed from: b */
    public final List f45545b;

    /* JADX INFO: renamed from: c */
    public final w9s f45546c;

    /* JADX INFO: renamed from: d */
    public final qsj f45547d;

    /* JADX INFO: renamed from: e */
    public final boolean f45548e;

    /* JADX INFO: renamed from: f */
    public final boolean f45549f;

    /* JADX INFO: renamed from: g */
    public final boolean f45550g;

    /* JADX INFO: renamed from: h */
    public final boolean f45551h;

    /* JADX INFO: renamed from: i */
    public final iut0 f45552i;

    /* JADX INFO: renamed from: j */
    public final int f45553j;

    /* JADX INFO: renamed from: k */
    public final Object f45554k;

    /* JADX INFO: renamed from: l */
    public final String f45555l;

    /* JADX INFO: renamed from: m */
    public final boolean f45556m;

    public d63(String str, List list, w9s w9sVar, qsj qsjVar, boolean z, boolean z2, boolean z3, boolean z4, iut0 iut0Var, int i, nw80 nw80Var, String str2, boolean z5, int i2) {
        String str3 = (i2 & 1) != 0 ? "" : str;
        List list2 = (i2 & 2) != 0 ? lau.f131415a : list;
        w9s w9sVar2 = (i2 & 4) != 0 ? w9s.f249255a : w9sVar;
        qsj qsjVar2 = (i2 & 8) != 0 ? qsj.f192130d : qsjVar;
        boolean z6 = (i2 & 16) != 0 ? false : z;
        boolean z7 = (i2 & 32) != 0 ? false : z2;
        boolean z8 = (i2 & 64) != 0 ? false : z3;
        boolean z9 = (i2 & 128) != 0 ? true : z4;
        iut0 iut0Var2 = (i2 & 256) != 0 ? gut0.f84543a : iut0Var;
        int i3 = (i2 & 512) != 0 ? 0 : i;
        nw80 nw80Var2 = (i2 & 1024) != 0 ? null : nw80Var;
        String str4 = (i2 & 2048) == 0 ? str2 : "";
        boolean z10 = (i2 & 8192) == 0 ? z5 : false;
        this.f45544a = str3;
        this.f45545b = list2;
        this.f45546c = w9sVar2;
        this.f45547d = qsjVar2;
        this.f45548e = z6;
        this.f45549f = z7;
        this.f45550g = z8;
        this.f45551h = z9;
        this.f45552i = iut0Var2;
        this.f45553j = i3;
        this.f45554k = nw80Var2;
        this.f45555l = str4;
        this.f45556m = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d63)) {
            return false;
        }
        d63 d63Var = (d63) obj;
        return wj50.m88271j(this.f45544a, d63Var.f45544a) && wj50.m88271j(this.f45545b, d63Var.f45545b) && this.f45546c == d63Var.f45546c && this.f45547d == d63Var.f45547d && this.f45548e == d63Var.f45548e && this.f45549f == d63Var.f45549f && this.f45550g == d63Var.f45550g && this.f45551h == d63Var.f45551h && wj50.m88271j(this.f45552i, d63Var.f45552i) && this.f45553j == d63Var.f45553j && wj50.m88271j(this.f45554k, d63Var.f45554k) && wj50.m88271j(this.f45555l, d63Var.f45555l) && this.f45556m == d63Var.f45556m;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f45553j, (this.f45552i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(xl81.m91401j(this.f45547d, (this.f45546c.hashCode() + s571.m77244c(this.f45544a.hashCode() * 31, 31, this.f45545b)) * 31, 31), 31, this.f45548e), 31, this.f45549f), 31, this.f45550g), 31, this.f45551h)) * 31, 31);
        Object obj = this.f45554k;
        return Integer.hashCode(0) + s571.m77245d(s571.m77243b((iM62800g + (obj == null ? 0 : obj.hashCode())) * 31, 961, this.f45555l), 31, this.f45556m);
    }
}
