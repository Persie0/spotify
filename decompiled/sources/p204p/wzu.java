package p204p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class wzu extends fgs {

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f256684b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f256685c;

    /* JADX INFO: renamed from: d */
    public int[] f256686d;

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f256686d;
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f256685c;
        if (colorStateList == null) {
            return true;
        }
        int colorForState = colorStateList.getColorForState(iArr, -1);
        Drawable drawable = this.f69395a;
        if (drawable != null) {
            PorterDuff.Mode mode = this.f256684b;
            if (mode == null) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(colorForState, mode));
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (Arrays.equals(this.f256686d, iArr)) {
            return false;
        }
        this.f256686d = iArr;
        onStateChange(iArr);
        return true;
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f256685c = colorStateList;
        invalidateSelf();
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f256684b = mode;
        invalidateSelf();
    }
}
