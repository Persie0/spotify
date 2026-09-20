package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zw00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f286869d = new ak0(26);

    /* JADX INFO: renamed from: a */
    public final mec0 f286870a;

    /* JADX INFO: renamed from: b */
    public final String f286871b;

    /* JADX INFO: renamed from: c */
    public final String f286872c;

    public zw00(mec0 mec0Var, String str, String str2) {
        this.f286870a = mec0Var;
        this.f286871b = str;
        this.f286872c = str2;
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
        if (!(obj instanceof zw00)) {
            return false;
        }
        zw00 zw00Var = (zw00) obj;
        return this.f286870a.equals(zw00Var.f286870a) && wj50.m88271j(this.f286871b, zw00Var.f286871b) && wj50.m88271j(this.f286872c, zw00Var.f286872c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f286869d;
    }

    public final int hashCode() {
        int iHashCode = this.f286870a.hashCode() * 31;
        String str = this.f286871b;
        return this.f286872c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
