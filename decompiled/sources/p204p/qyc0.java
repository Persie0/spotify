package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qyc0 implements uyc0 {

    /* JADX INFO: renamed from: a */
    public final bc51 f193869a;

    /* JADX INFO: renamed from: b */
    public final boolean f193870b;

    public qyc0(bc51 bc51Var, boolean z) {
        this.f193869a = bc51Var;
        this.f193870b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyc0)) {
            return false;
        }
        qyc0 qyc0Var = (qyc0) obj;
        return wj50.m88271j(this.f193869a, qyc0Var.f193869a) && this.f193870b == qyc0Var.f193870b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193870b) + (this.f193869a.hashCode() * 31);
    }
}
