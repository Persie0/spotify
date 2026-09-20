package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h5o0 {

    /* JADX INFO: renamed from: a */
    public final String f87873a;

    /* JADX INFO: renamed from: b */
    public final s4o0 f87874b;

    /* JADX INFO: renamed from: c */
    public final wls0 f87875c;

    /* JADX INFO: renamed from: d */
    public final l7z f87876d;

    public h5o0(String str, s4o0 s4o0Var, wls0 wls0Var, l7z l7zVar) {
        this.f87873a = str;
        this.f87874b = s4o0Var;
        this.f87875c = wls0Var;
        this.f87876d = l7zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5o0)) {
            return false;
        }
        h5o0 h5o0Var = (h5o0) obj;
        return wj50.m88271j(this.f87873a, h5o0Var.f87873a) && wj50.m88271j(this.f87874b, h5o0Var.f87874b) && wj50.m88271j(this.f87875c, h5o0Var.f87875c) && wj50.m88271j(this.f87876d, h5o0Var.f87876d);
    }

    public final int hashCode() {
        int iHashCode = (this.f87874b.hashCode() + (this.f87873a.hashCode() * 31)) * 31;
        wls0 wls0Var = this.f87875c;
        int iHashCode2 = (iHashCode + (wls0Var == null ? 0 : wls0Var.hashCode())) * 31;
        l7z l7zVar = this.f87876d;
        return iHashCode2 + (l7zVar != null ? l7zVar.hashCode() : 0);
    }
}
