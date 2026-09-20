package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tky0 {

    /* JADX INFO: renamed from: a */
    public final int f221272a;

    /* JADX INFO: renamed from: b */
    public final int f221273b;

    public tky0(int i, int i2) {
        this.f221272a = i;
        this.f221273b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tky0)) {
            return false;
        }
        tky0 tky0Var = (tky0) obj;
        return this.f221272a == tky0Var.f221272a && this.f221273b == tky0Var.f221273b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f221273b) + (Integer.hashCode(this.f221272a) * 31);
    }
}
