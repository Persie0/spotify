package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ck0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f38729d = new ak0(1);

    /* JADX INFO: renamed from: a */
    public final mec0 f38730a;

    /* JADX INFO: renamed from: b */
    public final String f38731b;

    /* JADX INFO: renamed from: c */
    public final String f38732c;

    public ck0(mec0 mec0Var, String str, String str2) {
        this.f38730a = mec0Var;
        this.f38731b = str;
        this.f38732c = str2;
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
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return this.f38730a.equals(ck0Var.f38730a) && wj50.m88271j(this.f38731b, ck0Var.f38731b) && wj50.m88271j(this.f38732c, ck0Var.f38732c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f38729d;
    }

    public final int hashCode() {
        int iHashCode = this.f38730a.hashCode() * 31;
        String str = this.f38731b;
        return this.f38732c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
