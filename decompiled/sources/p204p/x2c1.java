package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x2c1 implements b3c1 {

    /* JADX INFO: renamed from: a */
    public final int f257415a;

    public x2c1(int i) {
        this.f257415a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2c1) && this.f257415a == ((x2c1) obj).f257415a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257415a);
    }
}
