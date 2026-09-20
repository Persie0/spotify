package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qn81 {

    /* JADX INFO: renamed from: a */
    public final String f190523a;

    /* JADX INFO: renamed from: b */
    public final List f190524b;

    /* JADX INFO: renamed from: c */
    public final w9s f190525c;

    /* JADX INFO: renamed from: d */
    public final qsj f190526d;

    /* JADX INFO: renamed from: e */
    public final boolean f190527e;

    /* JADX INFO: renamed from: f */
    public final boolean f190528f;

    /* JADX INFO: renamed from: g */
    public final boolean f190529g;

    /* JADX INFO: renamed from: h */
    public final boolean f190530h;

    /* JADX INFO: renamed from: i */
    public final iut0 f190531i;

    /* JADX INFO: renamed from: j */
    public final String f190532j;

    /* JADX INFO: renamed from: k */
    public final boolean f190533k;

    public qn81(String str, List list, w9s w9sVar, qsj qsjVar, boolean z, boolean z2, boolean z3, boolean z4, iut0 iut0Var, String str2, boolean z5) {
        this.f190523a = str;
        this.f190524b = list;
        this.f190525c = w9sVar;
        this.f190526d = qsjVar;
        this.f190527e = z;
        this.f190528f = z2;
        this.f190529g = z3;
        this.f190530h = z4;
        this.f190531i = iut0Var;
        this.f190532j = str2;
        this.f190533k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn81)) {
            return false;
        }
        qn81 qn81Var = (qn81) obj;
        return wj50.m88271j(this.f190523a, qn81Var.f190523a) && wj50.m88271j(this.f190524b, qn81Var.f190524b) && this.f190525c == qn81Var.f190525c && this.f190526d == qn81Var.f190526d && this.f190527e == qn81Var.f190527e && this.f190528f == qn81Var.f190528f && this.f190529g == qn81Var.f190529g && this.f190530h == qn81Var.f190530h && wj50.m88271j(this.f190531i, qn81Var.f190531i) && wj50.m88271j(this.f190532j, qn81Var.f190532j) && this.f190533k == qn81Var.f190533k;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + s571.m77245d(s571.m77243b((this.f190531i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(xl81.m91401j(this.f190526d, (this.f190525c.hashCode() + s571.m77244c(this.f190523a.hashCode() * 31, 31, this.f190524b)) * 31, 31), 31, this.f190527e), 31, this.f190528f), 31, this.f190529g), 31, this.f190530h), 31, false)) * 31, 961, this.f190532j), 31, this.f190533k);
    }
}
