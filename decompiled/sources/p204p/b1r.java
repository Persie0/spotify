package p204p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class b1r implements d1r {

    /* JADX INFO: renamed from: a */
    public final LayerDrawable f22392a;

    public b1r(LayerDrawable layerDrawable) {
        this.f22392a = layerDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1r) && this.f22392a.equals(((b1r) obj).f22392a);
    }

    public final int hashCode() {
        return this.f22392a.hashCode();
    }
}
