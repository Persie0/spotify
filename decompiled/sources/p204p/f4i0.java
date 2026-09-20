package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f4i0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final float f65782a;

    /* JADX INFO: renamed from: b */
    public final e4i0 f65783b;

    /* JADX INFO: renamed from: c */
    public final e4i0 f65784c;

    public f4i0(float f, e4i0 e4i0Var, e4i0 e4i0Var2) {
        this.f65782a = f;
        this.f65783b = e4i0Var;
        this.f65784c = e4i0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f4i0)) {
            return false;
        }
        f4i0 f4i0Var = (f4i0) obj;
        return Float.compare(this.f65782a, f4i0Var.f65782a) == 0 && Objects.equals(this.f65783b, f4i0Var.f65783b) && Objects.equals(this.f65784c, f4i0Var.f65784c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f65782a) * 31;
        e4i0 e4i0Var = this.f65783b;
        int iHashCode2 = (iHashCode + (e4i0Var != null ? e4i0Var.hashCode() : 0)) * 31;
        e4i0 e4i0Var2 = this.f65784c;
        return iHashCode2 + (e4i0Var2 != null ? e4i0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f65782a + ", field 1=" + this.f65783b + ", field 2=" + this.f65784c;
    }
}
