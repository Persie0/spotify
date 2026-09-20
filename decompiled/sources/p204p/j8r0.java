package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j8r0 implements s8r0 {

    /* JADX INFO: renamed from: a */
    public final float f109992a;

    public j8r0(float f) {
        this.f109992a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8r0) && Float.compare(this.f109992a, ((j8r0) obj).f109992a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f109992a);
    }
}
