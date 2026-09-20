package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x7k0 {

    /* JADX INFO: renamed from: a */
    public final float f258945a;

    public x7k0(float f) {
        this.f258945a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7k0) && ybs.m93301b(this.f258945a, ((x7k0) obj).f258945a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f258945a);
    }
}
