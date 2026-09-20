package p204p;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0043a;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class l1i0 {

    /* JADX INFO: renamed from: a */
    public float[] f128725a;

    /* JADX INFO: renamed from: b */
    public final int[] f128726b;

    /* JADX INFO: renamed from: c */
    public final float[] f128727c;

    /* JADX INFO: renamed from: d */
    public Path f128728d;

    /* JADX INFO: renamed from: e */
    public final Paint f128729e;

    /* JADX INFO: renamed from: f */
    public final Paint f128730f;

    /* JADX INFO: renamed from: g */
    public final Paint f128731g;

    /* JADX INFO: renamed from: h */
    public final Paint f128732h;

    /* JADX INFO: renamed from: i */
    public final Paint f128733i;

    /* JADX INFO: renamed from: j */
    public final float[] f128734j;

    /* JADX INFO: renamed from: k */
    public int f128735k;

    /* JADX INFO: renamed from: l */
    public final Rect f128736l = new Rect();

    /* JADX INFO: renamed from: m */
    public final int f128737m = 1;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ MotionLayout f128738n;

    public l1i0(MotionLayout motionLayout) {
        this.f128738n = motionLayout;
        Paint paint = new Paint();
        this.f128729e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f128730f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f128731g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f128732h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f128734j = new float[8];
        Paint paint5 = new Paint();
        this.f128733i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f128727c = new float[100];
        this.f128726b = new int[50];
    }

    /* JADX INFO: renamed from: a */
    public final void m57875a(Canvas canvas, int i, int i2, C0043a c0043a) {
        Canvas canvas2;
        int width;
        int height;
        float f;
        boolean z;
        Paint paint = this.f128731g;
        int[] iArr = this.f128726b;
        boolean z2 = false;
        int i3 = 4;
        if (i == 4) {
            int i4 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i4 < this.f128735k) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    z = z3;
                    z = true;
                }
                if (i5 == 0) {
                    z4 = true;
                }
                i4++;
                z3 = z;
                z4 = z4;
            }
            if (z3) {
                float[] fArr = this.f128725a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z4) {
                m57876b(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.f128725a;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[fArr2.length - 2];
            float f5 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f2, f3, f4, f5, paint);
        } else {
            canvas2 = canvas;
        }
        if (i == 3) {
            m57876b(canvas);
        }
        canvas2.drawLines(this.f128725a, this.f128729e);
        View view = c0043a.f699b;
        if (view != null) {
            width = view.getWidth();
            height = c0043a.f699b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 1;
        while (i6 < i2 - 1) {
            if (i != i3 || iArr[i6 - 1] != 0) {
                int i7 = i6 * 2;
                float[] fArr3 = this.f128727c;
                float f6 = fArr3[i7];
                float f7 = fArr3[i7 + 1];
                this.f128728d.reset();
                this.f128728d.moveTo(f6, f7 + 10.0f);
                this.f128728d.lineTo(f6 + 10.0f, f7);
                this.f128728d.lineTo(f6, f7 - 10.0f);
                this.f128728d.lineTo(f6 - 10.0f, f7);
                this.f128728d.close();
                int i8 = i6 - 1;
                Paint paint2 = this.f128733i;
                if (i == i3) {
                    int i9 = iArr[i8];
                    if (i9 == 1) {
                        m57878d(canvas2, f6 - 0.0f, f7 - 0.0f);
                    } else if (i9 == 0) {
                        m57877c(canvas2, f6 - 0.0f, f7 - 0.0f);
                    } else {
                        if (i9 == 2) {
                            f = f7;
                            m57879e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                        }
                        canvas2.drawPath(this.f128728d, paint2);
                    }
                    f = f7;
                    canvas2.drawPath(this.f128728d, paint2);
                } else {
                    f = f7;
                }
                if (i == 2) {
                    m57878d(canvas2, f6 - 0.0f, f - 0.0f);
                }
                if (i == 3) {
                    m57877c(canvas2, f6 - 0.0f, f - 0.0f);
                }
                if (i == 6) {
                    m57879e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                }
                canvas2.drawPath(this.f128728d, paint2);
            }
            i6++;
            z2 = z2;
            i3 = 4;
        }
        boolean z5 = z2;
        float[] fArr4 = this.f128725a;
        if (fArr4.length > 1) {
            float f8 = fArr4[z5 ? 1 : 0];
            float f9 = fArr4[1];
            Paint paint3 = this.f128730f;
            canvas2.drawCircle(f8, f9, 8.0f, paint3);
            float[] fArr5 = this.f128725a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57876b(Canvas canvas) {
        float[] fArr = this.f128725a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = this.f128731g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    /* JADX INFO: renamed from: c */
    public final void m57877c(Canvas canvas, float f, float f2) {
        float[] fArr = this.f128725a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f128732h;
        Rect rect = this.f128736l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = this.f128731g;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    /* JADX INFO: renamed from: d */
    public final void m57878d(Canvas canvas, float f, float f2) {
        float[] fArr = this.f128725a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
        float f10 = (f7 * f9) + f3;
        float f11 = (f9 * f8) + f4;
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f128732h;
        Rect rect = this.f128736l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.f128731g);
    }

    /* JADX INFO: renamed from: e */
    public final void m57879e(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        MotionLayout motionLayout = this.f128738n;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        int length = string.length();
        Paint paint = this.f128732h;
        Rect rect = this.f128736l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f128731g;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }
}
