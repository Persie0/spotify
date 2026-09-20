package p204p;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class a4a1 extends RippleDrawable {

    /* JADX INFO: renamed from: a */
    public final boolean f12176a;

    /* JADX INFO: renamed from: b */
    public n6f f12177b;

    /* JADX INFO: renamed from: c */
    public boolean f12178c;

    public a4a1(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f12176a = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f12176a) {
            this.f12178c = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f12178c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f12178c;
    }
}
