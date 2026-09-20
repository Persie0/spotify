package p204p;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class fg11 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final eg11 f69174a = new eg11(this);

    /* JADX INFO: renamed from: b */
    public final Paint f69175b;

    /* JADX INFO: renamed from: c */
    public final Rect f69176c;

    /* JADX INFO: renamed from: d */
    public final Matrix f69177d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f69178e;

    /* JADX INFO: renamed from: f */
    public cg11 f69179f;

    public fg11() {
        Paint paint = new Paint();
        this.f69175b = paint;
        this.f69176c = new Rect();
        this.f69177d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m41562a() {
        cg11 cg11Var;
        ValueAnimator valueAnimator = this.f69178e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cg11Var = this.f69179f) == null || !cg11Var.f37526o || getCallback() == null) {
            return;
        }
        this.f69178e.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m41563b() {
        cg11 cg11Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (cg11Var = this.f69179f) == null) {
            return;
        }
        int iRound = cg11Var.f37518g;
        if (iRound <= 0) {
            iRound = Math.round(cg11Var.f37520i * iWidth);
        }
        cg11 cg11Var2 = this.f69179f;
        int iRound2 = cg11Var2.f37519h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(cg11Var2.f37521j * iHeight);
        }
        cg11 cg11Var3 = this.f69179f;
        boolean z = true;
        if (cg11Var3.f37517f != 1) {
            int i = cg11Var3.f37514c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            cg11 cg11Var4 = this.f69179f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, cg11Var4.f37513b, cg11Var4.f37512a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            cg11 cg11Var5 = this.f69179f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, cg11Var5.f37513b, cg11Var5.f37512a, Shader.TileMode.CLAMP);
        }
        this.f69175b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fM38555d;
        float fM38555d2;
        if (this.f69179f != null) {
            Paint paint = this.f69175b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f69179f.f37524m));
            Rect rect = this.f69176c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f69178e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f69179f.f37514c;
            if (i != 1) {
                if (i == 2) {
                    fM38555d2 = edb.m38555d(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f2 = -fHeight;
                    fM38555d2 = edb.m38555d(fHeight, f2, animatedFraction, f2);
                } else {
                    fM38555d = edb.m38555d(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fM38555d2;
                fM38555d = 0.0f;
            } else {
                float f3 = -fWidth;
                fM38555d = edb.m38555d(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.f69177d;
            matrix.reset();
            matrix.setRotate(this.f69179f.f37524m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fM38555d);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        cg11 cg11Var = this.f69179f;
        if (cg11Var != null) {
            return (cg11Var.f37525n || cg11Var.f37527p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f69176c.set(0, 0, rect.width(), rect.height());
        m41563b();
        m41562a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
