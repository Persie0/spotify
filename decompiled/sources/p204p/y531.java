package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class y531 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final float f269316a;

    /* JADX INFO: renamed from: b */
    public final int f269317b;

    public y531(float f, int i) {
        this.f269316a = f;
        this.f269317b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y531.class == obj.getClass()) {
            y531 y531Var = (y531) obj;
            if (this.f269316a == y531Var.f269316a && this.f269317b == y531Var.f269317b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f269316a).hashCode() + 527) * 31) + this.f269317b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f269316a + ", svcTemporalLayerCount=" + this.f269317b;
    }
}
