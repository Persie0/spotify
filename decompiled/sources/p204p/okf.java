package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class okf {

    /* JADX INFO: renamed from: a */
    public final voc1 f166324a;

    /* JADX INFO: renamed from: b */
    public final String f166325b;

    /* JADX INFO: renamed from: c */
    public final boolean f166326c;

    /* JADX INFO: renamed from: d */
    public final boolean f166327d;

    /* JADX INFO: renamed from: e */
    public final qm70 f166328e;

    public okf(voc1 voc1Var, String str, boolean z, boolean z2, qm70 qm70Var) {
        this.f166324a = voc1Var;
        this.f166325b = str;
        this.f166326c = z;
        this.f166327d = z2;
        this.f166328e = qm70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okf)) {
            return false;
        }
        okf okfVar = (okf) obj;
        return wj50.m88271j(this.f166324a, okfVar.f166324a) && wj50.m88271j(this.f166325b, okfVar.f166325b) && this.f166326c == okfVar.f166326c && this.f166327d == okfVar.f166327d && wj50.m88271j(this.f166328e, okfVar.f166328e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f166324a.f243453a.hashCode() * 31, 31, this.f166325b), 31, this.f166326c), 31, this.f166327d);
        qm70 qm70Var = this.f166328e;
        return (iM77245d + (qm70Var == null ? 0 : qm70Var.hashCode())) * 31;
    }
}
