package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xgu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final String f261379a;

    /* JADX INFO: renamed from: b */
    public final Throwable f261380b;

    public xgu0(String str, Throwable th) {
        this.f261379a = str;
        this.f261380b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgu0)) {
            return false;
        }
        xgu0 xgu0Var = (xgu0) obj;
        return wj50.m88271j(this.f261379a, xgu0Var.f261379a) && wj50.m88271j(this.f261380b, xgu0Var.f261380b);
    }

    public final int hashCode() {
        String str = this.f261379a;
        return this.f261380b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
