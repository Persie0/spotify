package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gq81 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f83385a;

    /* JADX INFO: renamed from: b */
    public final v64 f83386b;

    public gq81(v64 v64Var, boolean z) {
        this.f83385a = z;
        this.f83386b = v64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq81)) {
            return false;
        }
        gq81 gq81Var = (gq81) obj;
        return this.f83385a == gq81Var.f83385a && this.f83386b == gq81Var.f83386b;
    }

    public final int hashCode() {
        return this.f83386b.hashCode() + (Boolean.hashCode(this.f83385a) * 31);
    }
}
