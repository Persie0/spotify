package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.Alert;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tc41 extends Drawable {

    /* JADX INFO: renamed from: a */
    public vc41 f219008a;

    /* JADX INFO: renamed from: b */
    public float f219009b;

    /* JADX INFO: renamed from: c */
    public fmd0 f219010c;

    /* JADX INFO: renamed from: f */
    public float f219013f;

    /* JADX INFO: renamed from: g */
    public final Paint f219014g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f219015h;

    /* JADX INFO: renamed from: k */
    public float f219018k;

    /* JADX INFO: renamed from: l */
    public float f219019l;

    /* JADX INFO: renamed from: m */
    public final p4l0 f219020m;

    /* JADX INFO: renamed from: n */
    public sc41 f219021n;

    /* JADX INFO: renamed from: o */
    public final float f219022o;

    /* JADX INFO: renamed from: p */
    public final int f219023p;

    /* JADX INFO: renamed from: d */
    public int f219011d = -1;

    /* JADX INFO: renamed from: e */
    public int f219012e = 255;

    /* JADX INFO: renamed from: i */
    public final Rect f219016i = new Rect();

    /* JADX INFO: renamed from: j */
    public final float[] f219017j = new float[1];

    public tc41(Context context, vc41 vc41Var, float f) {
        kq11 kq11Var = new kq11(this, 8);
        this.f219020m = new p4l0(this);
        this.f219021n = kq11Var;
        this.f219023p = 1;
        this.f219008a = vc41Var;
        this.f219009b = f;
        this.f219022o = context.getResources().getDisplayMetrics().density;
        m80421f();
        Typeface typefaceM82233b = u1x0.m82233b(context, R.font.spoticon);
        Paint paint = new Paint();
        this.f219014g = paint;
        paint.setColor(this.f219011d);
        paint.setTypeface(typefaceM82233b);
        paint.setTextSize(f);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        m80422g();
    }

    /* JADX INFO: renamed from: a */
    public final String m80416a() {
        if (this.f219010c.m42098s()) {
            return this.f219010c.m42094m();
        }
        int i = this.f219023p;
        return (i == 3 || (i == 1 && svg1.m79490z(this) == 1)) ? this.f219010c.m42095n() : this.f219010c.m42094m();
    }

    /* JADX INFO: renamed from: b */
    public final void m80417b(int i) {
        this.f219015h = null;
        this.f219011d = i;
        this.f219014g.setColor(i);
        m80420e();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public final void m80418c(ColorStateList colorStateList) {
        this.f219015h = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public final void m80419d(float f) {
        this.f219009b = f;
        this.f219014g.setTextSize(f);
        m80421f();
        m80422g();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f219021n.mo57069c(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m80420e() {
        this.f219014g.setAlpha((Color.alpha(this.f219011d) * this.f219012e) / 255);
    }

    /* JADX INFO: renamed from: f */
    public final void m80421f() {
        int iAbs;
        int iRound = Math.round(this.f219009b / this.f219022o);
        vc41 vc41Var = this.f219008a;
        int[] iArr = vc41Var.f240046a;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 2 && (iAbs = Math.abs(iArr[i2] - iRound)) <= i) {
            i3 = i2;
            i2++;
            i = iAbs;
        }
        int i4 = iArr[i3];
        this.f219010c = new fmd0(vc41Var.f240047b[i3], vc41Var.f240048c[i3], vc41Var.f240049d[i3], 15);
    }

    /* JADX INFO: renamed from: g */
    public final void m80422g() {
        String strM42094m = this.f219010c.m42094m();
        Rect rect = this.f219016i;
        Paint paint = this.f219014g;
        paint.getTextBounds(strM42094m, 0, 1, rect);
        paint.getTextWidths(this.f219010c.m42094m(), 0, 1, this.f219017j);
        float f = this.f219009b;
        this.f219019l = (-1.0064484f) * f;
        this.f219018k = f * 1.0233134f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f219021n.mo57071h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f219021n.mo57072j();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.f219014g;
        if (paint.getXfermode() != null) {
            return -3;
        }
        int alpha = paint.getAlpha();
        if (alpha == 0) {
            return -2;
        }
        return alpha == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f219015h != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f219015h;
        if (colorStateList == null) {
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, this.f219011d);
        this.f219011d = colorForState;
        this.f219014g.setColor(colorForState);
        m80420e();
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f219012e = i;
        m80420e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f219014g.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
