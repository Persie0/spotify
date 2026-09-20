package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ku9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f126485d = new ak0(14);

    /* JADX INFO: renamed from: a */
    public final mec0 f126486a;

    /* JADX INFO: renamed from: b */
    public final String f126487b;

    /* JADX INFO: renamed from: c */
    public final String f126488c;

    public ku9(mec0 mec0Var, String str, String str2) {
        this.f126486a = mec0Var;
        this.f126487b = str;
        this.f126488c = str2;
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
        if (!(obj instanceof ku9)) {
            return false;
        }
        ku9 ku9Var = (ku9) obj;
        return this.f126486a.equals(ku9Var.f126486a) && wj50.m88271j(this.f126487b, ku9Var.f126487b) && wj50.m88271j(this.f126488c, ku9Var.f126488c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f126485d;
    }

    public final int hashCode() {
        int iHashCode = this.f126486a.hashCode() * 31;
        String str = this.f126487b;
        return this.f126488c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
