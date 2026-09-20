package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b291 implements d291 {

    /* JADX INFO: renamed from: a */
    public final int f22540a;

    /* JADX INFO: renamed from: b */
    public final int f22541b;

    public b291(int i, int i2) {
        this.f22540a = i;
        this.f22541b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b291)) {
            return false;
        }
        b291 b291Var = (b291) obj;
        return this.f22540a == b291Var.f22540a && this.f22541b == b291Var.f22541b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22541b) + (Integer.hashCode(this.f22540a) * 31);
    }
}
