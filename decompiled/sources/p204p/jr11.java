package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jr11 implements hwf {

    /* JADX INFO: renamed from: a */
    public final v64 f115055a;

    /* JADX INFO: renamed from: b */
    public final boolean f115056b;

    public jr11(v64 v64Var, boolean z) {
        this.f115055a = v64Var;
        this.f115056b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr11)) {
            return false;
        }
        jr11 jr11Var = (jr11) obj;
        return this.f115055a == jr11Var.f115055a && this.f115056b == jr11Var.f115056b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115056b) + (this.f115055a.hashCode() * 31);
    }
}
