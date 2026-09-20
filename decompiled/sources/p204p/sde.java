package p204p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class sde extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207996a;

    /* JADX INFO: renamed from: b */
    public final float f207997b;

    /* JADX INFO: renamed from: c */
    public final Paint f207998c;

    /* JADX INFO: renamed from: d */
    public final Paint f207999d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f208000e;

    /* JADX INFO: renamed from: f */
    public int f208001f;

    /* JADX INFO: renamed from: g */
    public int f208002g;

    /* JADX INFO: renamed from: h */
    public final Drawable f208003h;

    public sde(tc41 tc41Var, float f) {
        this.f207996a = 0;
        this.f208003h = tc41Var;
        this.f207997b = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.f207998c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.f207999d = paint2;
        this.f208001f = 255;
        if (tc41Var.f219021n.mo57072j() < 0 || tc41Var.f219021n.mo57071h() < 0) {
            throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77832a() {
        switch (this.f207996a) {
            case 0:
                this.f207998c.setAlpha((Color.alpha(0) * this.f208001f) / 255);
                this.f207999d.setAlpha((Color.alpha(this.f208002g) * this.f208001f) / 255);
                break;
            default:
                this.f207998c.setAlpha((Color.alpha(0) * this.f208001f) / 255);
                this.f207999d.setAlpha((Color.alpha(this.f208002g) * this.f208001f) / 255);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f207996a) {
            case 0:
                tc41 tc41Var = (tc41) this.f208003h;
                int iSave = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin = Math.min(getBounds().width(), getBounds().height());
                Paint paint = this.f207998c;
                float strokeWidth = (fMin / 2.0f) - (paint.getStrokeWidth() / 2.0f);
                canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.f207999d);
                if (paint.getStrokeWidth() > 0.0f) {
                    canvas.drawCircle(0.0f, 0.0f, strokeWidth, paint);
                }
                int iMo57072j = tc41Var.f219021n.mo57072j();
                int iMo57071h = tc41Var.f219021n.mo57071h();
                float fMax = fMin / Math.max(iMo57072j, iMo57071h);
                canvas.scale(fMax, fMax);
                float f = this.f207997b;
                canvas.scale(f, f);
                canvas.translate((-iMo57072j) / 2.0f, (-iMo57071h) / 2.0f);
                tc41Var.draw(canvas);
                canvas.restoreToCount(iSave);
                break;
            default:
                int iSave2 = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin2 = Math.min(getBounds().width(), getBounds().height());
                Paint paint2 = this.f207998c;
                float strokeWidth2 = (fMin2 / 2.0f) - (paint2.getStrokeWidth() / 2.0f);
                canvas.drawCircle(0.0f, 0.0f, strokeWidth2, this.f207999d);
                if (paint2.getStrokeWidth() > 0.0f) {
                    canvas.drawCircle(0.0f, 0.0f, strokeWidth2, paint2);
                }
                Drawable drawable = this.f208003h;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float fMax2 = fMin2 / Math.max(intrinsicWidth, intrinsicHeight);
                canvas.scale(fMax2, fMax2);
                float f2 = this.f207997b;
                canvas.scale(f2, f2);
                canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave2);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float fMax;
        float f;
        switch (this.f207996a) {
            case 0:
                tc41 tc41Var = (tc41) this.f208003h;
                fMax = Math.max(tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
                f = this.f207997b;
                break;
            default:
                Drawable drawable = this.f208003h;
                fMax = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                f = this.f207997b;
                break;
        }
        return (int) (fMax / f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMax;
        float f;
        switch (this.f207996a) {
            case 0:
                tc41 tc41Var = (tc41) this.f208003h;
                fMax = Math.max(tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
                f = this.f207997b;
                break;
            default:
                Drawable drawable = this.f208003h;
                fMax = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                f = this.f207997b;
                break;
        }
        return (int) (fMax / f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f207996a) {
            case 0:
                int alpha = this.f207999d.getAlpha();
                if (alpha != 0) {
                    return alpha != 255 ? -3 : -1;
                }
                return ((tc41) this.f208003h).getOpacity();
            default:
                int alpha2 = this.f207999d.getAlpha();
                if (alpha2 != 0) {
                    return alpha2 != 255 ? -3 : -1;
                }
                return this.f208003h.getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        switch (this.f207996a) {
            case 0:
                ColorStateList colorStateList = this.f208000e;
                return (colorStateList != null && colorStateList.isStateful()) || ((tc41) this.f208003h).isStateful();
            default:
                ColorStateList colorStateList2 = this.f208000e;
                return (colorStateList2 != null && colorStateList2.isStateful()) || this.f208003h.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        switch (this.f207996a) {
            case 0:
                super.onBoundsChange(rect);
                tc41 tc41Var = (tc41) this.f208003h;
                tc41Var.setBounds(0, 0, tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
                break;
            default:
                super.onBoundsChange(rect);
                Drawable drawable = this.f208003h;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        switch (this.f207996a) {
            case 0:
                tc41 tc41Var = (tc41) this.f208003h;
                boolean z = false;
                boolean state = tc41Var.isStateful() ? tc41Var.setState(iArr) : false;
                ColorStateList colorStateList = this.f208000e;
                if (colorStateList != null) {
                    Paint paint = this.f207999d;
                    int color = paint.getColor();
                    int colorForState = colorStateList.getColorForState(iArr, color);
                    paint.setColor(colorForState);
                    this.f208002g = colorForState;
                    if (colorForState != color) {
                        z = true;
                    }
                }
                boolean z2 = state | z;
                m77832a();
                if (z2) {
                    invalidateSelf();
                }
                return z2;
            default:
                Drawable drawable = this.f208003h;
                boolean z3 = false;
                boolean state2 = drawable.isStateful() ? drawable.setState(iArr) : false;
                ColorStateList colorStateList2 = this.f208000e;
                if (colorStateList2 != null) {
                    Paint paint2 = this.f207999d;
                    int color2 = paint2.getColor();
                    int colorForState2 = colorStateList2.getColorForState(iArr, color2);
                    paint2.setColor(colorForState2);
                    this.f208002g = colorForState2;
                    if (colorForState2 != color2) {
                        z3 = true;
                    }
                }
                boolean z4 = state2 | z3;
                m77832a();
                if (z4) {
                    invalidateSelf();
                }
                return z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.f207996a) {
            case 0:
                this.f208001f = i;
                m77832a();
                ((tc41) this.f208003h).setAlpha(i);
                invalidateSelf();
                break;
            default:
                this.f208001f = i;
                m77832a();
                this.f208003h.setAlpha(i);
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f207996a) {
            case 0:
                this.f207999d.setColorFilter(colorFilter);
                this.f207998c.setColorFilter(colorFilter);
                ((tc41) this.f208003h).setColorFilter(colorFilter);
                invalidateSelf();
                break;
            default:
                this.f207999d.setColorFilter(colorFilter);
                this.f207998c.setColorFilter(colorFilter);
                this.f208003h.setColorFilter(colorFilter);
                invalidateSelf();
                break;
        }
    }

    public sde(Drawable drawable) {
        this.f207996a = 1;
        this.f208003h = drawable;
        this.f207997b = 0.6f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.f207998c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.f207999d = paint2;
        this.f208001f = 255;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
        }
    }
}
