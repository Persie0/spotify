package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class uf50 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Drawable f229683a;

    /* JADX INFO: renamed from: b */
    public Drawable f229684b;

    /* JADX INFO: renamed from: c */
    public final long f229685c;

    /* JADX INFO: renamed from: d */
    public int f229686d = 255;

    /* JADX INFO: renamed from: e */
    public boolean f229687e;

    public uf50(Drawable drawable, Drawable drawable2, int i) {
        this.f229683a = drawable;
        if (i != 1) {
            this.f229684b = drawable2;
            this.f229687e = true;
            this.f229685c = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.f229687e;
        Drawable drawable = this.f229683a;
        if (!z) {
            drawable.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.f229685c) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.f229687e = false;
            this.f229684b = null;
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = this.f229684b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        drawable.setAlpha((int) (this.f229686d * fUptimeMillis));
        drawable.draw(canvas);
        drawable.setAlpha(this.f229686d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f229683a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f229683a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f229683a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f229683a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f229683a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f229683a.setBounds(rect);
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f229683a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f229686d = i;
        Drawable drawable = this.f229684b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.f229683a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f229684b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.f229683a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.f229683a.setState(iArr);
    }
}
