package p204p;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class pkc1 {

    /* JADX INFO: renamed from: a */
    public final Matrix f178431a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final RectF f178432b = new RectF();

    /* JADX INFO: renamed from: c */
    public float f178433c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f178434d = 0.0f;

    /* JADX INFO: renamed from: e */
    public final float f178435e = 1.0f;

    /* JADX INFO: renamed from: f */
    public final float f178436f = Float.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f178437g = 1.0f;

    /* JADX INFO: renamed from: h */
    public float f178438h = Float.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    public float f178439i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f178440j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f178441k = 0.0f;

    /* JADX INFO: renamed from: l */
    public float f178442l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f178443m = 0.0f;

    /* JADX INFO: renamed from: n */
    public final Matrix f178444n = new Matrix();

    /* JADX INFO: renamed from: o */
    public final float[] f178445o = new float[9];

    /* JADX INFO: renamed from: a */
    public final boolean m70185a(float f) {
        return this.f178432b.left <= f + 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m70186b(float f) {
        return this.f178432b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public final void m70187c(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.f178445o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.f178439i = Math.min(Math.max(this.f178437g, f2), this.f178438h);
        this.f178440j = Math.min(Math.max(this.f178435e, f4), this.f178436f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.f178441k = Math.min(Math.max(f, ((this.f178439i - 1.0f) * (-fWidth)) - this.f178442l), this.f178442l);
        float fMax = Math.max(Math.min(f3, ((this.f178440j - 1.0f) * fHeight) + this.f178443m), -this.f178443m);
        fArr[2] = this.f178441k;
        fArr[0] = this.f178439i;
        fArr[5] = fMax;
        fArr[4] = this.f178440j;
        matrix.setValues(fArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m70188d(Matrix matrix, dx8 dx8Var, boolean z) {
        Matrix matrix2 = this.f178431a;
        matrix2.set(matrix);
        m70187c(matrix2, this.f178432b);
        if (z) {
            dx8Var.invalidate();
        }
        matrix.set(matrix2);
    }
}
