package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bzk0 {

    /* JADX INFO: renamed from: a */
    public final float f32525a;

    /* JADX INFO: renamed from: b */
    public final int f32526b;

    public bzk0(float f, int i) {
        this.f32525a = f;
        this.f32526b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzk0)) {
            return false;
        }
        bzk0 bzk0Var = (bzk0) obj;
        return Float.compare(this.f32525a, bzk0Var.f32525a) == 0 && this.f32526b == bzk0Var.f32526b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32526b) + (Float.hashCode(this.f32525a) * 31);
    }
}
