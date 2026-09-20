package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xw00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f266551d = new ak0(24);

    /* JADX INFO: renamed from: a */
    public final mec0 f266552a;

    /* JADX INFO: renamed from: b */
    public final String f266553b;

    /* JADX INFO: renamed from: c */
    public final String f266554c;

    public xw00(mec0 mec0Var, String str, String str2) {
        this.f266552a = mec0Var;
        this.f266553b = str;
        this.f266554c = str2;
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
        if (!(obj instanceof xw00)) {
            return false;
        }
        xw00 xw00Var = (xw00) obj;
        return this.f266552a.equals(xw00Var.f266552a) && wj50.m88271j(this.f266553b, xw00Var.f266553b) && wj50.m88271j(this.f266554c, xw00Var.f266554c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f266551d;
    }

    public final int hashCode() {
        int iHashCode = this.f266552a.hashCode() * 31;
        String str = this.f266553b;
        return this.f266554c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
