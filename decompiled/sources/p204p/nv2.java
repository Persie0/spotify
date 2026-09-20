package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nv2 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f158761d = new ak0(3);

    /* JADX INFO: renamed from: a */
    public final mec0 f158762a;

    /* JADX INFO: renamed from: b */
    public final String f158763b;

    /* JADX INFO: renamed from: c */
    public final String f158764c;

    public nv2(mec0 mec0Var, String str, String str2) {
        this.f158762a = mec0Var;
        this.f158763b = str;
        this.f158764c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv2)) {
            return false;
        }
        nv2 nv2Var = (nv2) obj;
        return this.f158762a.equals(nv2Var.f158762a) && wj50.m88271j(this.f158763b, nv2Var.f158763b) && wj50.m88271j(this.f158764c, nv2Var.f158764c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f158761d;
    }

    public final int hashCode() {
        int iHashCode = this.f158762a.hashCode() * 31;
        String str = this.f158763b;
        return this.f158764c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
