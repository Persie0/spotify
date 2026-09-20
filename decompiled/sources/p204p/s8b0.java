package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s8b0 extends t8b0 {

    /* JADX INFO: renamed from: a */
    public final float f206621a;

    public s8b0(float f) {
        this.f206621a = f;
    }

    @Override // p204p.t8b0
    /* JADX INFO: renamed from: a */
    public final float mo74977a(u8b0 u8b0Var) {
        return this.f206621a;
    }

    @Override // p204p.t8b0
    /* JADX INFO: renamed from: b */
    public final float mo74978b(u8b0 u8b0Var) {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s8b0) {
            return Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f206621a, ((s8b0) obj).f206621a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f206621a) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Progress(min=0.0, max=" + this.f206621a + ")";
    }
}
