package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o0r0 {

    /* JADX INFO: renamed from: a */
    public final n0r0 f160451a;

    /* JADX INFO: renamed from: b */
    public final boolean f160452b;

    public o0r0(n0r0 n0r0Var, boolean z) {
        this.f160451a = n0r0Var;
        this.f160452b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0r0)) {
            return false;
        }
        o0r0 o0r0Var = (o0r0) obj;
        return wj50.m88271j(this.f160451a, o0r0Var.f160451a) && this.f160452b == o0r0Var.f160452b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160452b) + (this.f160451a.hashCode() * 31);
    }
}
