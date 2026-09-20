package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ntn0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f158105d = new dx00(10);

    /* JADX INFO: renamed from: a */
    public final mec0 f158106a;

    /* JADX INFO: renamed from: b */
    public final String f158107b;

    /* JADX INFO: renamed from: c */
    public final String f158108c;

    public ntn0(mec0 mec0Var, String str, String str2) {
        this.f158106a = mec0Var;
        this.f158107b = str;
        this.f158108c = str2;
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
        if (!(obj instanceof ntn0)) {
            return false;
        }
        ntn0 ntn0Var = (ntn0) obj;
        return this.f158106a.equals(ntn0Var.f158106a) && wj50.m88271j(this.f158107b, ntn0Var.f158107b) && wj50.m88271j(this.f158108c, ntn0Var.f158108c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f158105d;
    }

    public final int hashCode() {
        int iHashCode = this.f158106a.hashCode() * 31;
        String str = this.f158107b;
        return this.f158108c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
