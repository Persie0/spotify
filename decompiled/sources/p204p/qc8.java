package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qc8 extends sc8 {

    /* JADX INFO: renamed from: c */
    public final String f187279c;

    /* JADX INFO: renamed from: d */
    public final lc8 f187280d;

    /* JADX INFO: renamed from: e */
    public final String f187281e;

    public qc8(String str, lc8 lc8Var, String str2) {
        this.f187279c = str;
        this.f187280d = lc8Var;
        this.f187281e = str2;
    }

    @Override // p204p.sc8
    /* JADX INFO: renamed from: D */
    public final lc8 mo72524D() {
        return this.f187280d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc8)) {
            return false;
        }
        qc8 qc8Var = (qc8) obj;
        return wj50.m88271j(this.f187279c, qc8Var.f187279c) && wj50.m88271j(this.f187280d, qc8Var.f187280d) && wj50.m88271j(this.f187281e, qc8Var.f187281e);
    }

    public final int hashCode() {
        return this.f187281e.hashCode() + ((this.f187280d.hashCode() + (this.f187279c.hashCode() * 31)) * 31);
    }
}
