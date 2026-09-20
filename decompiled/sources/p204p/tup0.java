package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tup0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final iup0 f223904d = new iup0(10);

    /* JADX INFO: renamed from: a */
    public final mec0 f223905a;

    /* JADX INFO: renamed from: b */
    public final String f223906b;

    /* JADX INFO: renamed from: c */
    public final String f223907c;

    public tup0(mec0 mec0Var, String str, String str2) {
        this.f223905a = mec0Var;
        this.f223906b = str;
        this.f223907c = str2;
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
        if (!(obj instanceof tup0)) {
            return false;
        }
        tup0 tup0Var = (tup0) obj;
        return this.f223905a.equals(tup0Var.f223905a) && wj50.m88271j(this.f223906b, tup0Var.f223906b) && wj50.m88271j(this.f223907c, tup0Var.f223907c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f223904d;
    }

    public final int hashCode() {
        int iHashCode = this.f223905a.hashCode() * 31;
        String str = this.f223906b;
        return this.f223907c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
