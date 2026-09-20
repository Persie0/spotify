package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vny0 implements xny0 {

    /* JADX INFO: renamed from: a */
    public final float f243272a;

    public vny0(float f) {
        this.f243272a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vny0) && Float.compare(this.f243272a, ((vny0) obj).f243272a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f243272a);
    }
}
