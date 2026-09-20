package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class n540 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150486a;

    /* JADX INFO: renamed from: b */
    public final Object f150487b;

    public /* synthetic */ n540(Object obj, int i) {
        this.f150486a = i;
        this.f150487b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f150486a) {
            case 0:
                ((p340) this.f150487b).mo68987c(canvas);
                break;
            default:
                ((Drawable) this.f150487b).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        switch (this.f150486a) {
            case 1:
                return ((Drawable) this.f150487b).getChangingConfigurations();
            default:
                return super.getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.f150486a) {
            case 1:
                Drawable drawable = (Drawable) this.f150487b;
                return Math.max(drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth());
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.f150486a) {
            case 1:
                return getIntrinsicHeight();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f150486a) {
            case 0:
                return 0;
            default:
                return ((Drawable) this.f150487b).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        switch (this.f150486a) {
            case 1:
                return ((Drawable) this.f150487b).getState();
            default:
                return super.getState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        switch (this.f150486a) {
            case 1:
                return ((Drawable) this.f150487b).isStateful();
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        switch (this.f150486a) {
            case 1:
                ((Drawable) this.f150487b).jumpToCurrentState();
                break;
            default:
                super.jumpToCurrentState();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.f150486a) {
            case 1:
                ((Drawable) this.f150487b).setBounds(rect);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.f150486a) {
            case 0:
                break;
            default:
                ((Drawable) this.f150487b).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f150486a) {
            case 0:
                break;
            default:
                ((Drawable) this.f150487b).setColorFilter(colorFilter);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        switch (this.f150486a) {
            case 1:
                return ((Drawable) this.f150487b).setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m63709a(int i) {
    }

    /* JADX INFO: renamed from: b */
    private final void m63710b(ColorFilter colorFilter) {
    }
}
