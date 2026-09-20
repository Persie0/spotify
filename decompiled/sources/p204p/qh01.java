package p204p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class qh01 extends vh01 {

    /* JADX INFO: renamed from: b */
    public final sh01 f188589b;

    public qh01(sh01 sh01Var) {
        this.f188589b = sh01Var;
    }

    @Override // p204p.vh01
    /* JADX INFO: renamed from: a */
    public final void mo69934a(Matrix matrix, yg01 yg01Var, int i, Canvas canvas) {
        sh01 sh01Var = this.f188589b;
        float f = sh01Var.f208973f;
        float f2 = sh01Var.f208974g;
        RectF rectF = new RectF(sh01Var.f208969b, sh01Var.f208970c, sh01Var.f208971d, sh01Var.f208972e);
        Paint paint = yg01Var.f272411b;
        boolean z = f2 < 0.0f;
        Path path = yg01Var.f272416g;
        int[] iArr = yg01.f272408k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = yg01Var.f272415f;
            iArr[2] = yg01Var.f272414e;
            iArr[3] = yg01Var.f272413d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = yg01Var.f272413d;
            iArr[2] = yg01Var.f272414e;
            iArr[3] = yg01Var.f272415f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = yg01.f272409l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, yg01Var.f272417h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
