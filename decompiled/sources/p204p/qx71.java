package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qx71 {

    /* JADX INFO: renamed from: a */
    public final boolean f193538a;

    /* JADX INFO: renamed from: b */
    public final boolean f193539b;

    public qx71(boolean z, boolean z2) {
        this.f193538a = z;
        this.f193539b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx71)) {
            return false;
        }
        qx71 qx71Var = (qx71) obj;
        return this.f193538a == qx71Var.f193538a && this.f193539b == qx71Var.f193539b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193539b) + (Boolean.hashCode(this.f193538a) * 31);
    }
}
