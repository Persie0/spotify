package p204p;

import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class h3d0 extends InsetDrawable {
    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
