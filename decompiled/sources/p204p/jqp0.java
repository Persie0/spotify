package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jqp0 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f114943a;

    /* JADX INFO: renamed from: b */
    public final v64 f114944b;

    public jqp0(v64 v64Var, boolean z) {
        this.f114943a = z;
        this.f114944b = v64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqp0)) {
            return false;
        }
        jqp0 jqp0Var = (jqp0) obj;
        return this.f114943a == jqp0Var.f114943a && this.f114944b == jqp0Var.f114944b;
    }

    public final int hashCode() {
        return this.f114944b.hashCode() + (Boolean.hashCode(this.f114943a) * 31);
    }
}
