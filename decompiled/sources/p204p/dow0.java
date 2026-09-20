package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dow0 extends now0 {

    /* JADX INFO: renamed from: a */
    public final qla1 f51124a;

    /* JADX INFO: renamed from: b */
    public final rvc f51125b;

    /* JADX INFO: renamed from: c */
    public final String f51126c;

    public dow0(qla1 qla1Var, rvc rvcVar, String str) {
        this.f51124a = qla1Var;
        this.f51125b = rvcVar;
        this.f51126c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dow0)) {
            return false;
        }
        dow0 dow0Var = (dow0) obj;
        return wj50.m88271j(this.f51124a, dow0Var.f51124a) && wj50.m88271j(this.f51125b, dow0Var.f51125b) && wj50.m88271j(this.f51126c, dow0Var.f51126c);
    }

    public final int hashCode() {
        return this.f51126c.hashCode() + ((this.f51125b.hashCode() + (this.f51124a.hashCode() * 31)) * 31);
    }
}
