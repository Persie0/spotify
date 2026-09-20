package p204p;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class szq0 implements t3d0 {

    /* JADX INFO: renamed from: a */
    public final int f215631a;

    /* JADX INFO: renamed from: b */
    public final int f215632b;

    /* JADX INFO: renamed from: c */
    public float f215633c;

    /* JADX INFO: renamed from: d */
    public final int f215634d;

    /* JADX INFO: renamed from: e */
    public final int f215635e;

    /* JADX INFO: renamed from: f */
    public float f215636f;

    /* JADX INFO: renamed from: g */
    public float f215637g;

    /* JADX INFO: renamed from: h */
    public Matrix f215638h;

    public szq0(int i, int i2, float f) {
        c95.m31844j(f == -1.0f || i == -1, "width and aspect ratio should not both be set");
        this.f215631a = i;
        this.f215632b = i2;
        this.f215633c = f;
        this.f215634d = 9729;
        this.f215635e = 1;
        this.f215636f = -1.0f;
        this.f215637g = -1.0f;
        this.f215638h = new Matrix();
    }

    /* JADX INFO: renamed from: f */
    public static szq0 m79757f(int i, int i2) {
        c95.m31842h("width %s must be positive", i, i > 0);
        c95.m31842h("height %s must be positive", i2, i2 > 0);
        return new szq0(i, i2, -1.0f);
    }

    @Override // p204p.t3d0
    /* JADX INFO: renamed from: b */
    public final Matrix mo27903b() {
        Matrix matrix = this.f215638h;
        c95.m31848n(matrix, "configure must be called first");
        return matrix;
    }

    @Override // p204p.t3d0
    /* JADX INFO: renamed from: c */
    public final int mo79758c() {
        return this.f215634d;
    }

    @Override // p204p.t3d0
    /* JADX INFO: renamed from: d */
    public final di21 mo79759d(int i, int i2) {
        c95.m31844j(i > 0, "inputWidth must be positive");
        c95.m31844j(i2 > 0, "inputHeight must be positive");
        Matrix matrix = new Matrix();
        this.f215638h = matrix;
        float f = i;
        this.f215636f = f;
        float f2 = i2;
        this.f215637g = f2;
        int i3 = this.f215631a;
        int i4 = this.f215632b;
        if (i3 != -1 && i4 != -1) {
            this.f215633c = i3 / i4;
        }
        float f3 = this.f215633c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                this.f215636f = this.f215637g * this.f215633c;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                this.f215637g = this.f215636f / this.f215633c;
            }
        }
        if (i4 != -1) {
            if (i3 != -1) {
                this.f215636f = i3;
                this.f215637g = i4;
            } else {
                float f5 = i4;
                float f6 = (this.f215636f * f5) / this.f215637g;
                this.f215636f = f6;
                double d = f6;
                int i5 = this.f215635e;
                this.f215636f = Math.round(d / ((double) i5)) * ((long) i5);
                this.f215637g = f5;
            }
        }
        return new di21(Math.round(this.f215636f), Math.round(this.f215637g));
    }

    @Override // p204p.td10
    /* JADX INFO: renamed from: e */
    public final boolean mo79760e(int i, int i2) {
        mo79759d(i, i2);
        Matrix matrix = this.f215638h;
        matrix.getClass();
        return matrix.isIdentity() && i == Math.round(this.f215636f) && i2 == Math.round(this.f215637g);
    }
}
