package p204p;

import android.graphics.ColorFilter;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes11.dex */
public final class r3r0 extends StateListDrawable {

    /* JADX INFO: renamed from: a */
    public ColorFilter f195563a;

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        for (int i : iArr) {
            if (i == 16842919) {
                setColorFilter(this.f195563a);
                return super.onStateChange(iArr);
            }
        }
        clearColorFilter();
        return super.onStateChange(iArr);
    }
}
