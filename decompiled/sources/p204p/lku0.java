package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final String f134454a;

    /* JADX INFO: renamed from: b */
    public final Throwable f134455b;

    public lku0(String str, Throwable th) {
        this.f134454a = str;
        this.f134455b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lku0)) {
            return false;
        }
        lku0 lku0Var = (lku0) obj;
        return wj50.m88271j(this.f134454a, lku0Var.f134454a) && wj50.m88271j(this.f134455b, lku0Var.f134455b);
    }

    public final int hashCode() {
        return this.f134455b.hashCode() + (this.f134454a.hashCode() * 31);
    }
}
