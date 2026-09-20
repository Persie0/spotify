package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class rr8 extends Drawable {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f201978g = 0;

    /* JADX INFO: renamed from: a */
    public final Drawable f201979a;

    /* JADX INFO: renamed from: b */
    public final sde f201980b;

    /* JADX INFO: renamed from: c */
    public final qr8 f201981c;

    /* JADX INFO: renamed from: d */
    public final Rect f201982d;

    /* JADX INFO: renamed from: e */
    public final Matrix f201983e;

    /* JADX INFO: renamed from: f */
    public final Matrix f201984f;

    public rr8(Drawable drawable, sde sdeVar, qr8 qr8Var) {
        this.f201979a = drawable;
        this.f201980b = sdeVar;
        this.f201981c = qr8Var;
        int intrinsicWidth = sdeVar.getIntrinsicWidth();
        if (intrinsicWidth < 0) {
            throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.");
        }
        int intrinsicHeight = sdeVar.getIntrinsicHeight();
        if (intrinsicHeight < 0) {
            throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.");
        }
        this.f201982d = new Rect(0, 0, intrinsicWidth, intrinsicHeight);
        this.f201983e = new Matrix();
        this.f201984f = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    public static void m76278a(Drawable drawable, Rect rect, Matrix matrix, boolean z) {
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        matrix.reset();
        if (z || intrinsicHeight < 0 || intrinsicWidth < 0) {
            drawable.setBounds(rect);
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        rectF2.set(rect);
        if (rectF.equals(rectF2)) {
            return;
        }
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        matrix.mapRect(rectF);
        float fMax = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
        matrix.postScale(fMax, fMax, rectF2.centerX(), rectF2.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f201983e;
        boolean zIsIdentity = matrix.isIdentity();
        Drawable drawable = this.f201979a;
        if (zIsIdentity) {
            drawable.draw(canvas);
        } else {
            int iSave = canvas.save();
            canvas.concat(matrix);
            drawable.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        Matrix matrix2 = this.f201984f;
        boolean zIsIdentity2 = matrix2.isIdentity();
        sde sdeVar = this.f201980b;
        if (zIsIdentity2) {
            sdeVar.draw(canvas);
            return;
        }
        int iSave2 = canvas.save();
        canvas.concat(matrix2);
        sdeVar.draw(canvas);
        canvas.restoreToCount(iSave2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.f201981c.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f201981c.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return Drawable.resolveOpacity(this.f201979a.getOpacity(), this.f201980b.getOpacity());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        qr8 qr8Var = this.f201981c;
        qr8Var.getClass();
        m76278a(this.f201979a, rect, this.f201983e, false);
        int i = rect.right - qr8Var.f191760b;
        Rect rect2 = this.f201982d;
        rect2.offsetTo(i - rect2.width(), (rect.bottom - qr8Var.f191759a) - rect2.height());
        m76278a(this.f201980b, rect2, this.f201984f, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f201979a.setAlpha(i);
        this.f201980b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f201979a.setColorFilter(colorFilter);
    }
}
