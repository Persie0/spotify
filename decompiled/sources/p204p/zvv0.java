package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zvv0 {

    /* JADX INFO: renamed from: a */
    public final String f286810a;

    /* JADX INFO: renamed from: b */
    public final dwv0 f286811b;

    /* JADX INFO: renamed from: c */
    public final am81 f286812c;

    /* JADX INFO: renamed from: d */
    public final icc0 f286813d;

    public zvv0(String str, dwv0 dwv0Var, am81 am81Var, icc0 icc0Var) {
        this.f286810a = str;
        this.f286811b = dwv0Var;
        this.f286812c = am81Var;
        this.f286813d = icc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvv0)) {
            return false;
        }
        zvv0 zvv0Var = (zvv0) obj;
        return wj50.m88271j(this.f286810a, zvv0Var.f286810a) && wj50.m88271j(this.f286811b, zvv0Var.f286811b) && wj50.m88271j(this.f286812c, zvv0Var.f286812c) && wj50.m88271j(this.f286813d, zvv0Var.f286813d);
    }

    public final int hashCode() {
        return this.f286813d.hashCode() + ((this.f286812c.hashCode() + ((this.f286811b.hashCode() + (this.f286810a.hashCode() * 31)) * 31)) * 31);
    }
}
