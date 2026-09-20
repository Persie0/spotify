package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class da81 implements ea81 {

    /* JADX INFO: renamed from: a */
    public final int f47000a;

    /* JADX INFO: renamed from: b */
    public final int f47001b;

    public da81(int i, int i2) {
        this.f47000a = i;
        this.f47001b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da81)) {
            return false;
        }
        da81 da81Var = (da81) obj;
        return this.f47000a == da81Var.f47000a && this.f47001b == da81Var.f47001b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47001b) + (Integer.hashCode(this.f47000a) * 31);
    }
}
