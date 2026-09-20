package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class e4s0 implements f4s0 {

    /* JADX INFO: renamed from: a */
    public final float f56170a;

    public e4s0(float f) {
        this.f56170a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4s0) && Float.compare(this.f56170a, ((e4s0) obj).f56170a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f56170a);
    }
}
