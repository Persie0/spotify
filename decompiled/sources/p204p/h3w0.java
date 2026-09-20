package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h3w0 extends j3w0 {

    /* JADX INFO: renamed from: a */
    public final v72 f87351a;

    /* JADX INFO: renamed from: b */
    public final String f87352b;

    public h3w0(v72 v72Var, String str) {
        this.f87351a = v72Var;
        this.f87352b = str;
    }

    @Override // p204p.j3w0
    /* JADX INFO: renamed from: a */
    public final String mo34897a() {
        return this.f87352b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3w0)) {
            return false;
        }
        h3w0 h3w0Var = (h3w0) obj;
        return wj50.m88271j(this.f87351a, h3w0Var.f87351a) && wj50.m88271j(this.f87352b, h3w0Var.f87352b);
    }

    public final int hashCode() {
        v72 v72Var = this.f87351a;
        int iHashCode = (v72Var == null ? 0 : v72Var.hashCode()) * 31;
        String str = this.f87352b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
