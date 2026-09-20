package androidx.car.app;

import android.view.Surface;
import p204p.klh;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class SurfaceContainer {
    private final int mDpi;
    private final int mHeight;
    private final Surface mSurface;
    private final int mWidth;

    public SurfaceContainer(Surface surface, int i, int i2, int i3) {
        this.mSurface = surface;
        this.mWidth = i;
        this.mHeight = i2;
        this.mDpi = i3;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.mSurface);
        sb.append(", ");
        sb.append(this.mWidth);
        sb.append("x");
        sb.append(this.mHeight);
        sb.append(", dpi: ");
        return klh.m56832d(this.mDpi, "]", sb);
    }

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }
}
