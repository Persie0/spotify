package p204p;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class rh01 extends vh01 {

    /* JADX INFO: renamed from: b */
    public final th01 f199077b;

    /* JADX INFO: renamed from: c */
    public final float f199078c;

    /* JADX INFO: renamed from: d */
    public final float f199079d;

    public rh01(th01 th01Var, float f, float f2) {
        this.f199077b = th01Var;
        this.f199078c = f;
        this.f199079d = f2;
    }

    @Override // p204p.vh01
    /* JADX INFO: renamed from: a */
    public final void mo69934a(Matrix matrix, yg01 yg01Var, int i, Canvas canvas) {
        th01 th01Var = this.f199077b;
        float f = th01Var.f220299c;
        float f2 = this.f199079d;
        float f3 = th01Var.f220298b;
        float f4 = this.f199078c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m75494b());
        yg01Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = yg01Var.f272415f;
        int[] iArr = yg01.f272406i;
        iArr[0] = i2;
        iArr[1] = yg01Var.f272414e;
        iArr[2] = yg01Var.f272413d;
        Paint paint = yg01Var.f272412c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, yg01.f272407j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m75494b() {
        th01 th01Var = this.f199077b;
        return (float) Math.toDegrees(Math.atan((th01Var.f220299c - this.f199079d) / (th01Var.f220298b - this.f199078c)));
    }
}
