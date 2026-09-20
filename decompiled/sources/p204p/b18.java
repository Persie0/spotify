package p204p;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class b18 implements s640 {

    /* JADX INFO: renamed from: a */
    public final fs61 f22238a;

    /* JADX INFO: renamed from: b */
    public final long f22239b;

    /* JADX INFO: renamed from: c */
    public final int f22240c;

    /* JADX INFO: renamed from: d */
    public final Matrix f22241d;

    public b18(fs61 fs61Var, long j, int i, Matrix matrix) {
        if (fs61Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f22238a = fs61Var;
        this.f22239b = j;
        this.f22240c = i;
        this.f22241d = matrix;
    }

    @Override // p204p.s640
    /* JADX INFO: renamed from: a */
    public final fs61 mo27893a() {
        return this.f22238a;
    }

    @Override // p204p.s640
    /* JADX INFO: renamed from: b */
    public final int mo27894b() {
        return this.f22240c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b18) {
            b18 b18Var = (b18) obj;
            if (this.f22238a.equals(b18Var.f22238a) && this.f22239b == b18Var.f22239b && this.f22240c == b18Var.f22240c && this.f22241d.equals(b18Var.f22241d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.s640
    public final long getTimestamp() {
        return this.f22239b;
    }

    public final int hashCode() {
        int iHashCode = (this.f22238a.hashCode() ^ 1000003) * 1000003;
        long j = this.f22239b;
        return ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f22240c) * 1000003) ^ this.f22241d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f22238a + ", timestamp=" + this.f22239b + ", rotationDegrees=" + this.f22240c + ", sensorToBufferTransformMatrix=" + this.f22241d + "}";
    }
}
