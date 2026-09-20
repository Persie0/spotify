package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aky0 {

    /* JADX INFO: renamed from: a */
    public final float f16678a;

    /* JADX INFO: renamed from: b */
    public final float f16679b;

    public aky0(float f, float f2) {
        this.f16678a = f;
        this.f16679b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aky0)) {
            return false;
        }
        aky0 aky0Var = (aky0) obj;
        return Float.compare(this.f16678a, aky0Var.f16678a) == 0 && Float.compare(this.f16679b, aky0Var.f16679b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16679b) + (Float.hashCode(this.f16678a) * 31);
    }
}
