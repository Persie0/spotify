package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dte1 {

    /* JADX INFO: renamed from: a */
    public final wwu f52813a;

    /* JADX INFO: renamed from: b */
    public final String f52814b;

    /* JADX INFO: renamed from: c */
    public final String f52815c;

    /* JADX INFO: renamed from: d */
    public final int f52816d;

    /* JADX INFO: renamed from: e */
    public final boolean f52817e;

    /* JADX INFO: renamed from: f */
    public final cte1 f52818f;

    public dte1(wwu wwuVar, String str, String str2, int i, boolean z, cte1 cte1Var) {
        this.f52813a = wwuVar;
        this.f52814b = str;
        this.f52815c = str2;
        this.f52816d = i;
        this.f52817e = z;
        this.f52818f = cte1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dte1)) {
            return false;
        }
        dte1 dte1Var = (dte1) obj;
        return wj50.m88271j(this.f52813a, dte1Var.f52813a) && wj50.m88271j(this.f52814b, dte1Var.f52814b) && this.f52815c.equals(dte1Var.f52815c) && this.f52816d == dte1Var.f52816d && this.f52817e == dte1Var.f52817e && this.f52818f.equals(dte1Var.f52818f);
    }

    public final int hashCode() {
        return this.f52818f.hashCode() + s571.m77245d((((Integer.hashCode(this.f52816d) + s571.m77243b(s571.m77243b(this.f52813a.hashCode() * 31, 31, this.f52814b), 31, this.f52815c)) * 31) + 580414516) * 31, 31, this.f52817e);
    }
}
