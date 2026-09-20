package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f283469a;

    /* JADX INFO: renamed from: b */
    public final String f283470b;

    /* JADX INFO: renamed from: c */
    public final int f283471c;

    /* JADX INFO: renamed from: d */
    public final String f283472d;

    /* JADX INFO: renamed from: e */
    public final gkm0 f283473e;

    public zjm0(String str, String str2, int i, String str3, gkm0 gkm0Var) {
        this.f283469a = str;
        this.f283470b = str2;
        this.f283471c = i;
        this.f283472d = str3;
        this.f283473e = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjm0)) {
            return false;
        }
        zjm0 zjm0Var = (zjm0) obj;
        return wj50.m88271j(this.f283469a, zjm0Var.f283469a) && wj50.m88271j(this.f283470b, zjm0Var.f283470b) && this.f283471c == zjm0Var.f283471c && wj50.m88271j(this.f283472d, zjm0Var.f283472d) && wj50.m88271j(this.f283473e, zjm0Var.f283473e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f283471c, s571.m77243b(this.f283469a.hashCode() * 31, 31, this.f283470b), 31);
        String str = this.f283472d;
        return this.f283473e.hashCode() + ((iM62800g + (str == null ? 0 : str.hashCode())) * 31);
    }
}
