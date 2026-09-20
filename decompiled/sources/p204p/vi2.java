package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vi2 implements yi2 {

    /* JADX INFO: renamed from: a */
    public final String f241599a;

    /* JADX INFO: renamed from: b */
    public final String f241600b;

    /* JADX INFO: renamed from: c */
    public final u9v0 f241601c;

    public vi2(String str, String str2, u9v0 u9v0Var) {
        this.f241599a = str;
        this.f241600b = str2;
        this.f241601c = u9v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi2)) {
            return false;
        }
        vi2 vi2Var = (vi2) obj;
        return wj50.m88271j(this.f241599a, vi2Var.f241599a) && wj50.m88271j(this.f241600b, vi2Var.f241600b) && wj50.m88271j(this.f241601c, vi2Var.f241601c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f241599a.hashCode() * 31, 31, this.f241600b);
        u9v0 u9v0Var = this.f241601c;
        return iM77243b + (u9v0Var == null ? 0 : u9v0Var.hashCode());
    }
}
