package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class f1w0 {

    /* JADX INFO: renamed from: a */
    public final String f64988a;

    /* JADX INFO: renamed from: b */
    public final String f64989b;

    /* JADX INFO: renamed from: c */
    public final List f64990c;

    /* JADX INFO: renamed from: d */
    public final Long f64991d;

    /* JADX INFO: renamed from: e */
    public final Object f64992e;

    /* JADX INFO: renamed from: f */
    public final int f64993f;

    /* JADX INFO: renamed from: g */
    public final String f64994g;

    public f1w0(String str, String str2, List list, Long l, List list2, int i, String str3) {
        this.f64988a = str;
        this.f64989b = str2;
        this.f64990c = list;
        this.f64991d = l;
        this.f64992e = list2;
        this.f64993f = i;
        this.f64994g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1w0)) {
            return false;
        }
        f1w0 f1w0Var = (f1w0) obj;
        return wj50.m88271j(this.f64988a, f1w0Var.f64988a) && wj50.m88271j(this.f64989b, f1w0Var.f64989b) && wj50.m88271j(this.f64990c, f1w0Var.f64990c) && wj50.m88271j(this.f64991d, f1w0Var.f64991d) && wj50.m88271j(this.f64992e, f1w0Var.f64992e) && this.f64993f == f1w0Var.f64993f && wj50.m88271j(this.f64994g, f1w0Var.f64994g);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f64988a.hashCode() * 31, 31, this.f64989b), 31, this.f64990c);
        Long l = this.f64991d;
        int iM40938f = f710.m40938f(this.f64993f, dq60.m36604d((iM77244c + (l == null ? 0 : l.hashCode())) * 31, 31, this.f64992e), 31);
        String str = this.f64994g;
        return iM40938f + (str != null ? str.hashCode() : 0);
    }
}
