package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m4i0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final float f139971a;

    /* JADX INFO: renamed from: b */
    public final float f139972b;

    public m4i0(float f, float f2) {
        c95.m31844j(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.f139971a = f;
        this.f139972b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m4i0.class == obj.getClass()) {
            m4i0 m4i0Var = (m4i0) obj;
            if (this.f139971a == m4i0Var.f139971a && this.f139972b == m4i0Var.f139972b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f139972b).hashCode() + ((Float.valueOf(this.f139971a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f139971a + ", longitude=" + this.f139972b;
    }
}
