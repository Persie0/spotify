package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o47 {

    /* JADX INFO: renamed from: a */
    public final int f161568a;

    /* JADX INFO: renamed from: b */
    public final int f161569b;

    public o47(int i, int i2) {
        this.f161568a = i;
        this.f161569b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o47)) {
            return false;
        }
        o47 o47Var = (o47) obj;
        return this.f161568a == o47Var.f161568a && this.f161569b == o47Var.f161569b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161569b) + (Integer.hashCode(this.f161568a) * 31);
    }
}
