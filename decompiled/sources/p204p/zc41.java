package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zc41 {

    /* JADX INFO: renamed from: a */
    public final boolean f281454a;

    /* JADX INFO: renamed from: b */
    public final boolean f281455b;

    public zc41(boolean z, boolean z2) {
        this.f281454a = z;
        this.f281455b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc41)) {
            return false;
        }
        zc41 zc41Var = (zc41) obj;
        return this.f281454a == zc41Var.f281454a && this.f281455b == zc41Var.f281455b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281455b) + (Boolean.hashCode(this.f281454a) * 31);
    }
}
