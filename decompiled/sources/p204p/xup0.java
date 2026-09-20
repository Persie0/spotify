package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xup0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final iup0 f266153d = new iup0(14);

    /* JADX INFO: renamed from: a */
    public final mec0 f266154a;

    /* JADX INFO: renamed from: b */
    public final String f266155b;

    /* JADX INFO: renamed from: c */
    public final String f266156c;

    public xup0(mec0 mec0Var, String str, String str2) {
        this.f266154a = mec0Var;
        this.f266155b = str;
        this.f266156c = str2;
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
        if (!(obj instanceof xup0)) {
            return false;
        }
        xup0 xup0Var = (xup0) obj;
        return this.f266154a.equals(xup0Var.f266154a) && wj50.m88271j(this.f266155b, xup0Var.f266155b) && wj50.m88271j(this.f266156c, xup0Var.f266156c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f266153d;
    }

    public final int hashCode() {
        int iHashCode = this.f266154a.hashCode() * 31;
        String str = this.f266155b;
        return this.f266156c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
