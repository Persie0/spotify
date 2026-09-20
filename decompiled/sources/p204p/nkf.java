package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nkf {

    /* JADX INFO: renamed from: a */
    public final voc1 f154865a;

    /* JADX INFO: renamed from: b */
    public final String f154866b;

    /* JADX INFO: renamed from: c */
    public final boolean f154867c;

    /* JADX INFO: renamed from: d */
    public final boolean f154868d;

    /* JADX INFO: renamed from: e */
    public final qm70 f154869e;

    public nkf(voc1 voc1Var, String str, boolean z, boolean z2, qm70 qm70Var) {
        this.f154865a = voc1Var;
        this.f154866b = str;
        this.f154867c = z;
        this.f154868d = z2;
        this.f154869e = qm70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkf)) {
            return false;
        }
        nkf nkfVar = (nkf) obj;
        return wj50.m88271j(this.f154865a, nkfVar.f154865a) && wj50.m88271j(this.f154866b, nkfVar.f154866b) && this.f154867c == nkfVar.f154867c && this.f154868d == nkfVar.f154868d && wj50.m88271j(this.f154869e, nkfVar.f154869e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f154865a.f243453a.hashCode() * 31, 31, this.f154866b), 31, this.f154867c), 31, this.f154868d);
        qm70 qm70Var = this.f154869e;
        return iM77245d + (qm70Var == null ? 0 : qm70Var.hashCode());
    }
}
