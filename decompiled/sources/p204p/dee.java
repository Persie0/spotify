package p204p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class dee extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final LinearInterpolator f48059g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final ydy f48060h = new ydy();

    /* JADX INFO: renamed from: i */
    public static final int[] f48061i = {-16777216};

    /* JADX INFO: renamed from: a */
    public final cee f48062a;

    /* JADX INFO: renamed from: b */
    public float f48063b;

    /* JADX INFO: renamed from: c */
    public final Resources f48064c;

    /* JADX INFO: renamed from: d */
    public final ValueAnimator f48065d;

    /* JADX INFO: renamed from: e */
    public float f48066e;

    /* JADX INFO: renamed from: f */
    public boolean f48067f;

    public dee(Context context) {
        context.getClass();
        this.f48064c = context.getResources();
        cee ceeVar = new cee();
        this.f48062a = ceeVar;
        ceeVar.f37099i = f48061i;
        ceeVar.m32555a(0);
        ceeVar.f37098h = 2.5f;
        ceeVar.f37092b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new aee(this, ceeVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f48059g);
        valueAnimatorOfFloat.addListener(new bee(this, ceeVar));
        this.f48065d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: d */
    public static void m35776d(float f, cee ceeVar) {
        if (f <= 0.75f) {
            ceeVar.f37111u = ceeVar.f37099i[ceeVar.f37100j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = ceeVar.f37099i;
        int i = ceeVar.f37100j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        ceeVar.f37111u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    /* JADX INFO: renamed from: a */
    public final void m35777a(float f, cee ceeVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f48067f) {
            m35776d(f, ceeVar);
            float fFloor = (float) (Math.floor(ceeVar.f37103m / 0.8f) + 1.0d);
            float f2 = ceeVar.f37101k;
            float f3 = ceeVar.f37102l;
            ceeVar.f37095e = (((f3 - 0.01f) - f2) * f) + f2;
            ceeVar.f37096f = f3;
            float f4 = ceeVar.f37103m;
            ceeVar.f37097g = edb.m38555d(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = ceeVar.f37103m;
            ydy ydyVar = f48060h;
            if (f < 0.5f) {
                interpolation = ceeVar.f37101k;
                interpolation2 = (ydyVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = ceeVar.f37101k + 0.79f;
                interpolation = f6 - (((1.0f - ydyVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f48066e) * 216.0f;
            ceeVar.f37095e = interpolation;
            ceeVar.f37096f = interpolation2;
            ceeVar.f37097g = f7;
            this.f48063b = f8;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m35778b(float f, float f2, float f3, float f4) {
        float f5 = this.f48064c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        cee ceeVar = this.f48062a;
        ceeVar.f37098h = f6;
        ceeVar.f37092b.setStrokeWidth(f6);
        ceeVar.f37107q = f * f5;
        ceeVar.m32555a(0);
        ceeVar.f37108r = (int) (f3 * f5);
        ceeVar.f37109s = (int) (f4 * f5);
    }

    /* JADX INFO: renamed from: c */
    public final void m35779c(int i) {
        if (i == 0) {
            m35778b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m35778b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f48063b, bounds.exactCenterX(), bounds.exactCenterY());
        cee ceeVar = this.f48062a;
        Paint paint = ceeVar.f37092b;
        RectF rectF = ceeVar.f37091a;
        float f = ceeVar.f37107q;
        float fMin = (ceeVar.f37098h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((ceeVar.f37108r * ceeVar.f37106p) / 2.0f, ceeVar.f37098h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = ceeVar.f37095e;
        float f3 = ceeVar.f37097g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((ceeVar.f37096f + f3) * 360.0f) - f4;
        paint.setColor(ceeVar.f37111u);
        paint.setAlpha(ceeVar.f37110t);
        float f6 = ceeVar.f37098h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ceeVar.f37094d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = ceeVar.f37093c;
        if (ceeVar.f37104n) {
            Path path = ceeVar.f37105o;
            if (path == null) {
                Path path2 = new Path();
                ceeVar.f37105o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (ceeVar.f37108r * ceeVar.f37106p) / 2.0f;
            ceeVar.f37105o.moveTo(0.0f, 0.0f);
            ceeVar.f37105o.lineTo(ceeVar.f37108r * ceeVar.f37106p, 0.0f);
            Path path3 = ceeVar.f37105o;
            float f9 = ceeVar.f37108r;
            float f10 = ceeVar.f37106p;
            path3.lineTo((f9 * f10) / 2.0f, ceeVar.f37109s * f10);
            ceeVar.f37105o.offset((rectF.centerX() + fMin2) - f8, (ceeVar.f37098h / 2.0f) + rectF.centerY());
            ceeVar.f37105o.close();
            paint2.setColor(ceeVar.f37111u);
            paint2.setAlpha(ceeVar.f37110t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ceeVar.f37105o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f48062a.f37110t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f48065d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f48062a.f37110t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f48062a.f37092b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f48065d.cancel();
        cee ceeVar = this.f48062a;
        float f = ceeVar.f37095e;
        ceeVar.f37101k = f;
        float f2 = ceeVar.f37096f;
        ceeVar.f37102l = f2;
        ceeVar.f37103m = ceeVar.f37097g;
        if (f2 != f) {
            this.f48067f = true;
            this.f48065d.setDuration(666L);
            this.f48065d.start();
            return;
        }
        ceeVar.m32555a(0);
        ceeVar.f37101k = 0.0f;
        ceeVar.f37102l = 0.0f;
        ceeVar.f37103m = 0.0f;
        ceeVar.f37095e = 0.0f;
        ceeVar.f37096f = 0.0f;
        ceeVar.f37097g = 0.0f;
        this.f48065d.setDuration(1332L);
        this.f48065d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f48065d.cancel();
        this.f48063b = 0.0f;
        cee ceeVar = this.f48062a;
        if (ceeVar.f37104n) {
            ceeVar.f37104n = false;
        }
        ceeVar.m32555a(0);
        ceeVar.f37101k = 0.0f;
        ceeVar.f37102l = 0.0f;
        ceeVar.f37103m = 0.0f;
        ceeVar.f37095e = 0.0f;
        ceeVar.f37096f = 0.0f;
        ceeVar.f37097g = 0.0f;
        invalidateSelf();
    }
}
