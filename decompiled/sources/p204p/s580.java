package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s580 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public Paint f205747c;

    /* JADX INFO: renamed from: d */
    public Paint f205748d;

    /* JADX INFO: renamed from: e */
    public q580 f205749e;

    /* JADX INFO: renamed from: f */
    public ArrayList f205750f;

    /* JADX INFO: renamed from: g */
    public Paint.FontMetrics f205751g;

    /* JADX INFO: renamed from: h */
    public Path f205752h;

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX INFO: renamed from: F1 */
    public final void m77256F1(Canvas canvas, float f, float f2, r580 r580Var, q580 q580Var) {
        Canvas canvas2;
        Path path = this.f205752h;
        Paint paint = this.f205748d;
        int i = r580Var.f195992e;
        float f3 = r580Var.f195991d;
        float f4 = r580Var.f195990c;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        int i2 = r580Var.f195989b;
        if (i2 == 3) {
            i2 = q580Var.f185464j;
        }
        paint.setColor(i);
        if (Float.isNaN(f4)) {
            f4 = q580Var.f185465k;
        }
        float fM82122c = u0b1.m82122c(f4);
        float f5 = fM82122c / 2.0f;
        int iM38547C = edb.m38547C(i2);
        if (iM38547C == 2) {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        } else if (iM38547C == 3) {
            paint.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f, f2 - f5, f + fM82122c, f2 + f5, paint);
        } else if (iM38547C != 4) {
            if (iM38547C == 5) {
                if (Float.isNaN(f3)) {
                    f3 = q580Var.f185466l;
                }
                float fM82122c2 = u0b1.m82122c(f3);
                q580Var.getClass();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fM82122c2);
                paint.setPathEffect(null);
                path.reset();
                path.moveTo(f, f2);
                path.lineTo(f + fM82122c, f2);
                canvas.drawPath(path, paint);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        }
        canvas2.restoreToCount(iSave);
    }
}
