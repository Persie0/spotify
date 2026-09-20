package p204p;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes3.dex */
public final class phs extends fgs {

    /* JADX INFO: renamed from: b */
    public boolean f177717b;

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f177717b) {
            super.draw(canvas);
        }
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f177717b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f177717b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f177717b) {
            return this.f69395a.setState(iArr);
        }
        return false;
    }

    @Override // p204p.fgs, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f177717b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
