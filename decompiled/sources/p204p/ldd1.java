package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ldd1 {

    /* JADX INFO: renamed from: a */
    public final float f132147a;

    public ldd1(float f) {
        this.f132147a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldd1) && Float.compare(this.f132147a, ((ldd1) obj).f132147a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132147a);
    }
}
