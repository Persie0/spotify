package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class itn0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f105632d = new dx00(7);

    /* JADX INFO: renamed from: a */
    public final mec0 f105633a;

    /* JADX INFO: renamed from: b */
    public final String f105634b;

    /* JADX INFO: renamed from: c */
    public final String f105635c;

    public itn0(mec0 mec0Var, String str, String str2) {
        this.f105633a = mec0Var;
        this.f105634b = str;
        this.f105635c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itn0)) {
            return false;
        }
        itn0 itn0Var = (itn0) obj;
        return this.f105633a.equals(itn0Var.f105633a) && wj50.m88271j(this.f105634b, itn0Var.f105634b) && wj50.m88271j(this.f105635c, itn0Var.f105635c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f105632d;
    }

    public final int hashCode() {
        int iHashCode = this.f105633a.hashCode() * 31;
        String str = this.f105634b;
        return this.f105635c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
