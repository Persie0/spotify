package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class lbv0 {

    /* JADX INFO: renamed from: a */
    public final int f131723a;

    /* JADX INFO: renamed from: b */
    public final String f131724b;

    /* JADX INFO: renamed from: c */
    public final boolean f131725c;

    /* JADX INFO: renamed from: d */
    public final String f131726d;

    /* JADX INFO: renamed from: e */
    public final boolean f131727e;

    /* JADX INFO: renamed from: f */
    public final String f131728f;

    /* JADX INFO: renamed from: g */
    public final boolean f131729g;

    /* JADX INFO: renamed from: h */
    public final boolean f131730h;

    /* JADX INFO: renamed from: i */
    public final boolean f131731i;

    /* JADX INFO: renamed from: j */
    public final boolean f131732j;

    /* JADX INFO: renamed from: k */
    public final sro0 f131733k;

    /* JADX INFO: renamed from: l */
    public final boolean f131734l;

    /* JADX INFO: renamed from: m */
    public final boolean f131735m;

    /* JADX INFO: renamed from: n */
    public final List f131736n;

    public lbv0(int i, String str, boolean z, String str2, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, sro0 sro0Var, boolean z7, boolean z8, List list) {
        this.f131723a = i;
        this.f131724b = str;
        this.f131725c = z;
        this.f131726d = str2;
        this.f131727e = z2;
        this.f131728f = str3;
        this.f131729g = z3;
        this.f131730h = z4;
        this.f131731i = z5;
        this.f131732j = z6;
        this.f131733k = sro0Var;
        this.f131734l = z7;
        this.f131735m = z8;
        this.f131736n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbv0)) {
            return false;
        }
        lbv0 lbv0Var = (lbv0) obj;
        return this.f131723a == lbv0Var.f131723a && wj50.m88271j(this.f131724b, lbv0Var.f131724b) && this.f131725c == lbv0Var.f131725c && wj50.m88271j(this.f131726d, lbv0Var.f131726d) && this.f131727e == lbv0Var.f131727e && wj50.m88271j(this.f131728f, lbv0Var.f131728f) && this.f131729g == lbv0Var.f131729g && this.f131730h == lbv0Var.f131730h && this.f131731i == lbv0Var.f131731i && this.f131732j == lbv0Var.f131732j && wj50.m88271j(this.f131733k, lbv0Var.f131733k) && this.f131734l == lbv0Var.f131734l && this.f131735m == lbv0Var.f131735m && wj50.m88271j(this.f131736n, lbv0Var.f131736n);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77245d(s571.m77243b(Integer.hashCode(this.f131723a) * 31, 31, this.f131724b), 31, this.f131725c), 31, this.f131726d), 31, this.f131727e);
        String str = this.f131728f;
        return this.f131736n.hashCode() + s571.m77245d(s571.m77245d((this.f131733k.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f131729g), 31, this.f131730h), 31, this.f131731i), 31, this.f131732j)) * 31, 31, this.f131734l), 31, this.f131735m);
    }
}
