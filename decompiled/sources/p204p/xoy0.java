package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class xoy0 extends Drawable {

    /* JADX INFO: renamed from: h */
    public static final tjc f264380h = new tjc(10, Integer.class, "level");

    /* JADX INFO: renamed from: a */
    public final kiq f264381a;

    /* JADX INFO: renamed from: b */
    public final kiq f264382b;

    /* JADX INFO: renamed from: c */
    public final kiq f264383c;

    /* JADX INFO: renamed from: d */
    public final kiq f264384d = kiq.m56517g(0.0f);

    /* JADX INFO: renamed from: e */
    public final kiq f264385e = kiq.m56517g(0.0f);

    /* JADX INFO: renamed from: f */
    public final Paint f264386f;

    /* JADX INFO: renamed from: g */
    public final RectF f264387g;

    public xoy0(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f264386f = paint;
        this.f264387g = new RectF();
        paint.setColor(i4);
        kiq kiqVarM56517g = kiq.m56517g(255.0f);
        this.f264382b = kiqVarM56517g.m56522k(i).m56519f();
        this.f264381a = kiqVarM56517g.m56522k(i2).m56519f();
        this.f264383c = kiqVarM56517g.m56522k(i3).m56519f();
    }

    /* JADX INFO: renamed from: a */
    public final void m91573a() {
        float fM56523l = this.f264382b.m56523l(getLevel());
        float fM56523l2 = this.f264381a.m56523l(getLevel());
        float fM56523l3 = this.f264384d.m56523l(getLevel());
        float fM56523l4 = this.f264385e.m56523l(getLevel());
        Rect bounds = getBounds();
        RectF rectF = this.f264387g;
        rectF.set(bounds);
        float f = fM56523l4 / 2.0f;
        float f2 = fM56523l3 / 2.0f;
        rectF.offset(f - f2, 0.0f);
        rectF.inset(fM56523l + f2 + f, fM56523l2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fM56523l = this.f264383c.m56523l(getLevel());
        canvas.drawRoundRect(this.f264387g, fM56523l, fM56523l, this.f264386f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        m91573a();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        m91573a();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
