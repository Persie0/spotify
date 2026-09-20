package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class s2s extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f205057a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f205058b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f205059c;

    /* JADX INFO: renamed from: d */
    public final tc41 f205060d;

    /* JADX INFO: renamed from: e */
    public final Drawable f205061e;

    /* JADX INFO: renamed from: f */
    public final wg61 f205062f;

    /* JADX INFO: renamed from: g */
    public w9s f205063g;

    public s2s(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.progress_small_holo);
        if (drawable == null) {
            throw new IllegalStateException("R.drawable.progress_small_holo is not found");
        }
        this.f205061e = drawable;
        this.f205062f = new wg61(new edq(this, 21));
        this.f205063g = w9s.f249256b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_badge_size);
        this.f205057a = lzj.m60387w(context, R.color.encore_accessory_green);
        this.f205058b = lzj.m60387w(context, R.color.encore_download_waiting);
        this.f205059c = lzj.m60387w(context, R.color.encore_download_error);
        this.f205060d = iqg1.m51376r(context, vc41.DOWNLOAD, R.color.encore_download_waiting, dimensionPixelSize);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        tc41 tc41Var = this.f205060d;
        tc41Var.setBounds(bounds);
        Rect bounds2 = getBounds();
        Drawable drawable = this.f205061e;
        drawable.setBounds(bounds2);
        if (r2s.f195220a[this.f205063g.ordinal()] == 4) {
            drawable.draw(canvas);
        } else {
            tc41Var.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f205060d.f219021n.mo57071h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f205060d.f219021n.mo57072j();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f205063g == w9s.f249257c ? this.f205061e.getOpacity() : this.f205060d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return r2s.f195220a[this.f205063g.ordinal()] == 4 ? this.f205061e.isStateful() : this.f205060d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f205060d.setBounds(getBounds());
        this.f205061e.setBounds(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (r2s.f195220a[this.f205063g.ordinal()] == 4) {
            invalidateSelf();
            return this.f205061e.setState(iArr);
        }
        invalidateSelf();
        return this.f205060d.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f205060d.setAlpha(i);
        this.f205061e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f205060d.setColorFilter(colorFilter);
        this.f205061e.setColorFilter(colorFilter);
    }
}
