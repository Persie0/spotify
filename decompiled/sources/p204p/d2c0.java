package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d2c0 extends n2c0 {

    /* JADX INFO: renamed from: a */
    public final String f44535a;

    /* JADX INFO: renamed from: b */
    public final boolean f44536b;

    public d2c0(String str, boolean z) {
        this.f44535a = str;
        this.f44536b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2c0)) {
            return false;
        }
        d2c0 d2c0Var = (d2c0) obj;
        return wj50.m88271j(this.f44535a, d2c0Var.f44535a) && this.f44536b == d2c0Var.f44536b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44536b) + (this.f44535a.hashCode() * 31);
    }
}
