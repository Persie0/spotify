package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e251 {

    /* JADX INFO: renamed from: a */
    public final int f55364a;

    /* JADX INFO: renamed from: b */
    public final int f55365b;

    public e251(int i, int i2) {
        this.f55364a = i;
        this.f55365b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e251)) {
            return false;
        }
        e251 e251Var = (e251) obj;
        return this.f55364a == e251Var.f55364a && this.f55365b == e251Var.f55365b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55365b) + (Integer.hashCode(this.f55364a) * 31);
    }
}
