package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fui0 extends gui0 {

    /* JADX INFO: renamed from: a */
    public final String f73509a;

    /* JADX INFO: renamed from: b */
    public final boolean f73510b;

    public fui0(String str, boolean z) {
        this.f73509a = str;
        this.f73510b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fui0)) {
            return false;
        }
        fui0 fui0Var = (fui0) obj;
        return wj50.m88271j(this.f73509a, fui0Var.f73509a) && this.f73510b == fui0Var.f73510b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73510b) + (this.f73509a.hashCode() * 31);
    }
}
