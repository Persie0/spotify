package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jqb0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f114871d = new dx00(2);

    /* JADX INFO: renamed from: a */
    public final mec0 f114872a;

    /* JADX INFO: renamed from: b */
    public final String f114873b;

    /* JADX INFO: renamed from: c */
    public final String f114874c;

    public jqb0(mec0 mec0Var, String str, String str2) {
        this.f114872a = mec0Var;
        this.f114873b = str;
        this.f114874c = str2;
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
        if (!(obj instanceof jqb0)) {
            return false;
        }
        jqb0 jqb0Var = (jqb0) obj;
        return this.f114872a.equals(jqb0Var.f114872a) && wj50.m88271j(this.f114873b, jqb0Var.f114873b) && wj50.m88271j(this.f114874c, jqb0Var.f114874c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f114871d;
    }

    public final int hashCode() {
        int iHashCode = this.f114872a.hashCode() * 31;
        String str = this.f114873b;
        return this.f114874c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
