package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vk31 implements wk31 {

    /* JADX INFO: renamed from: a */
    public final float f242131a;

    public vk31(float f) {
        this.f242131a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk31) && ybs.m93301b(this.f242131a, ((vk31) obj).f242131a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f242131a);
    }
}
