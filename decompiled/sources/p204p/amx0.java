package p204p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class amx0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f17218a;

    /* JADX INFO: renamed from: b */
    public final Paint f17219b;

    /* JADX INFO: renamed from: c */
    public final RectF f17220c;

    /* JADX INFO: renamed from: d */
    public final Rect f17221d;

    /* JADX INFO: renamed from: e */
    public float f17222e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f17225h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f17226i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f17227j;

    /* JADX INFO: renamed from: f */
    public boolean f17223f = false;

    /* JADX INFO: renamed from: g */
    public boolean f17224g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f17228k = PorterDuff.Mode.SRC_IN;

    public amx0(ColorStateList colorStateList, float f) {
        this.f17218a = f;
        Paint paint = new Paint(5);
        this.f17219b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f17225h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f17225h.getDefaultColor()));
        this.f17220c = new RectF();
        this.f17221d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m26451a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m26452b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f17220c;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f17221d;
        rect2.set(rect);
        if (this.f17223f) {
            rect2.inset((int) Math.ceil(bmx0.m29922a(this.f17222e, this.f17218a, this.f17224g)), (int) Math.ceil(bmx0.m29923b(this.f17222e, this.f17218a, this.f17224g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f17226i;
        Paint paint = this.f17219b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f17226i);
            z = true;
        }
        RectF rectF = this.f17220c;
        float f = this.f17218a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f17221d, this.f17218a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f17227j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f17225h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m26452b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f17225h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f17219b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f17227j;
        if (colorStateList2 == null || (mode = this.f17228k) == null) {
            return z;
        }
        this.f17226i = m26451a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f17219b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17219b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f17227j = colorStateList;
        this.f17226i = m26451a(colorStateList, this.f17228k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f17228k = mode;
        this.f17226i = m26451a(this.f17227j, mode);
        invalidateSelf();
    }
}
