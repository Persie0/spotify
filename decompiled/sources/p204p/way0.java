package p204p;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class way0 implements t3d0 {

    /* JADX INFO: renamed from: a */
    public final float f249644a;

    /* JADX INFO: renamed from: b */
    public final Matrix f249645b;

    /* JADX INFO: renamed from: c */
    public Matrix f249646c;

    public way0(float f) {
        this.f249644a = f;
        Matrix matrix = new Matrix();
        this.f249645b = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // p204p.t3d0
    /* JADX INFO: renamed from: b */
    public final Matrix mo27903b() {
        Matrix matrix = this.f249646c;
        c95.m31848n(matrix, "configure must be called first");
        return matrix;
    }

    @Override // p204p.t3d0
    /* JADX INFO: renamed from: d */
    public final di21 mo79759d(int i, int i2) {
        c95.m31844j(i > 0, "inputWidth must be positive");
        c95.m31844j(i2 > 0, "inputHeight must be positive");
        Matrix matrix = this.f249645b;
        this.f249646c = new Matrix(matrix);
        if (matrix.isIdentity()) {
            return new di21(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.f249646c.preScale(f3, 1.0f);
        this.f249646c.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.f249646c.mapPoints(fArr2);
            fMin = Math.min(fMin, fArr2[0]);
            fMax = Math.max(fMax, fArr2[0]);
            fMin2 = Math.min(fMin2, fArr2[1]);
            fMax2 = Math.max(fMax2, fArr2[1]);
        }
        float f4 = (fMax - fMin) / 2.0f;
        float f5 = (fMax2 - fMin2) / 2.0f;
        this.f249646c.postScale(1.0f / f4, 1.0f / f5);
        return new di21(Math.round(f * f4), Math.round(f2 * f5));
    }

    @Override // p204p.td10
    /* JADX INFO: renamed from: e */
    public final boolean mo79760e(int i, int i2) {
        di21 di21VarMo79759d = mo79759d(i, i2);
        Matrix matrix = this.f249646c;
        matrix.getClass();
        return matrix.isIdentity() && i == di21VarMo79759d.f49219a && i2 == di21VarMo79759d.f49220b;
    }
}
