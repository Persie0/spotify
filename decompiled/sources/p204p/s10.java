package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class s10 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f204565a;

    /* JADX INFO: renamed from: b */
    public final Object f204566b;

    public /* synthetic */ s10(Object obj, int i) {
        this.f204565a = i;
        this.f204566b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f204565a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f204566b;
                if (actionBarContainer.f101g) {
                    Drawable drawable = actionBarContainer.f100f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f98d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f99e;
                    if (drawable3 != null && actionBarContainer.f102h) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            case 1:
                cby0 cby0Var = (cby0) this.f204566b;
                cby0Var.getClass();
                Drawable drawable4 = cby0Var.f36267a;
                float intrinsicWidth = drawable4.getIntrinsicWidth();
                float intrinsicHeight = drawable4.getIntrinsicHeight();
                int iSave = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth, intrinsicHeight);
                canvas.scale(fMin, fMin);
                float f = cby0Var.f36268b;
                canvas.scale(f, f);
                canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
                drawable4.draw(canvas);
                canvas.restoreToCount(iSave);
                break;
            case 2:
                dby0 dby0Var = (dby0) this.f204566b;
                int i = dby0Var.f47386c;
                if (i != 0) {
                    canvas.drawColor(i);
                }
                float intrinsicWidth2 = dby0Var.f47384a.getIntrinsicWidth();
                float intrinsicHeight2 = dby0Var.f47384a.getIntrinsicHeight();
                int iSave2 = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin2 = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth2, intrinsicHeight2);
                canvas.scale(fMin2, fMin2);
                float f2 = dby0Var.f47385b;
                canvas.scale(f2, f2);
                canvas.translate((-intrinsicWidth2) / 2.0f, (-intrinsicHeight2) / 2.0f);
                dby0Var.f47384a.draw(canvas);
                canvas.restoreToCount(iSave2);
                break;
            default:
                ((Drawable) this.f204566b).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        switch (this.f204565a) {
            case 3:
                return ((Drawable) this.f204566b).getChangingConfigurations();
            default:
                return super.getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        switch (this.f204565a) {
            case 1:
                cby0 cby0Var = (cby0) this.f204566b;
                cby0Var.f36269c = getChangingConfigurations();
                return cby0Var;
            case 2:
                dby0 dby0Var = (dby0) this.f204566b;
                dby0Var.f47387d = getChangingConfigurations();
                return dby0Var;
            default:
                return super.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.f204565a) {
            case 1:
                cby0 cby0Var = (cby0) this.f204566b;
                return (int) (cby0Var.f36267a.getIntrinsicHeight() / cby0Var.f36268b);
            case 2:
                dby0 dby0Var = (dby0) this.f204566b;
                return (int) (dby0Var.f47384a.getIntrinsicHeight() / dby0Var.f47385b);
            case 3:
                Drawable drawable = (Drawable) this.f204566b;
                return Math.max(drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth());
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float intrinsicWidth;
        float f;
        switch (this.f204565a) {
            case 1:
                cby0 cby0Var = (cby0) this.f204566b;
                intrinsicWidth = cby0Var.f36267a.getIntrinsicWidth();
                f = cby0Var.f36268b;
                break;
            case 2:
                dby0 dby0Var = (dby0) this.f204566b;
                intrinsicWidth = dby0Var.f47384a.getIntrinsicWidth();
                f = dby0Var.f47385b;
                break;
            case 3:
                return getIntrinsicHeight();
            default:
                return super.getIntrinsicWidth();
        }
        return (int) (intrinsicWidth / f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        float minimumHeight;
        float f;
        switch (this.f204565a) {
            case 1:
                cby0 cby0Var = (cby0) this.f204566b;
                minimumHeight = cby0Var.f36267a.getMinimumHeight();
                f = cby0Var.f36268b;
                break;
            case 2:
                dby0 dby0Var = (dby0) this.f204566b;
                minimumHeight = dby0Var.f47384a.getMinimumHeight();
                f = dby0Var.f47385b;
                break;
            default:
                return super.getMinimumHeight();
        }
        return (int) (minimumHeight / f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        float minimumWidth;
        float f;
        switch (this.f204565a) {
            case 1:
                cby0 cby0Var = (cby0) this.f204566b;
                minimumWidth = cby0Var.f36267a.getMinimumWidth();
                f = cby0Var.f36268b;
                break;
            case 2:
                dby0 dby0Var = (dby0) this.f204566b;
                minimumWidth = dby0Var.f47384a.getMinimumWidth();
                f = dby0Var.f47385b;
                break;
            default:
                return super.getMinimumWidth();
        }
        return (int) (minimumWidth / f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f204565a) {
            case 0:
                return 0;
            case 1:
                return ((cby0) this.f204566b).f36267a.getOpacity();
            case 2:
                return ((dby0) this.f204566b).f47384a.getOpacity();
            default:
                return ((Drawable) this.f204566b).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f204565a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f204566b;
                if (!actionBarContainer.f101g) {
                    Drawable drawable = actionBarContainer.f98d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f100f != null) {
                    actionBarContainer.f98d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        switch (this.f204565a) {
            case 1:
                return ((cby0) this.f204566b).f36267a.getState();
            case 2:
                return ((dby0) this.f204566b).f47384a.getState();
            case 3:
                return ((Drawable) this.f204566b).getState();
            default:
                return super.getState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        switch (this.f204565a) {
            case 1:
                return ((cby0) this.f204566b).f36267a.isStateful();
            case 2:
                return ((dby0) this.f204566b).f47384a.isStateful();
            case 3:
                return ((Drawable) this.f204566b).isStateful();
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        switch (this.f204565a) {
            case 1:
                ((cby0) this.f204566b).f36267a.jumpToCurrentState();
                break;
            case 2:
                ((dby0) this.f204566b).f47384a.jumpToCurrentState();
                break;
            case 3:
                ((Drawable) this.f204566b).jumpToCurrentState();
                break;
            default:
                super.jumpToCurrentState();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        switch (this.f204565a) {
            case 1:
                return getConstantState().newDrawable();
            case 2:
                return getConstantState().newDrawable();
            default:
                return super.mutate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.f204565a) {
            case 3:
                ((Drawable) this.f204566b).setBounds(rect);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        switch (this.f204565a) {
            case 1:
                return ((cby0) this.f204566b).f36267a.setLevel(i);
            case 2:
                return ((dby0) this.f204566b).f47384a.setLevel(i);
            default:
                return super.onLevelChange(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        switch (this.f204565a) {
            case 1:
                return ((cby0) this.f204566b).f36267a.setState(iArr);
            case 2:
                return ((dby0) this.f204566b).f47384a.setState(iArr);
            default:
                return super.onStateChange(iArr);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.f204565a) {
            case 0:
                break;
            case 1:
                ((cby0) this.f204566b).f36267a.setAlpha(i);
                break;
            case 2:
                ((dby0) this.f204566b).f47384a.setAlpha(i);
                break;
            default:
                ((Drawable) this.f204566b).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f204565a) {
            case 0:
                break;
            case 1:
                ((cby0) this.f204566b).f36267a.setColorFilter(colorFilter);
                break;
            case 2:
                ((dby0) this.f204566b).f47384a.setColorFilter(colorFilter);
                break;
            default:
                ((Drawable) this.f204566b).setColorFilter(colorFilter);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        switch (this.f204565a) {
            case 1:
                return ((cby0) this.f204566b).f36267a.setState(iArr);
            case 2:
                return ((dby0) this.f204566b).f47384a.setState(iArr);
            case 3:
                return ((Drawable) this.f204566b).setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    public s10(Drawable drawable, float f) {
        this.f204565a = 1;
        this.f204566b = new cby0(drawable, f);
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("drawable must have an intrinsic size");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s10(Drawable drawable, float f, int i, int i2) {
        this(drawable, f);
        this.f204565a = i2;
        switch (i2) {
            case 2:
                this.f204566b = new dby0(f, i, drawable);
                if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
                    throw new IllegalArgumentException("drawable must have an intrinsic size");
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m76905a(int i) {
    }

    /* JADX INFO: renamed from: b */
    private final void m76906b(ColorFilter colorFilter) {
    }
}
