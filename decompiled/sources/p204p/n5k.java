package p204p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class n5k {

    /* JADX INFO: renamed from: a */
    public final LayerDrawable f150572a;

    public n5k(LayerDrawable layerDrawable) {
        this.f150572a = layerDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5k) && this.f150572a.equals(((n5k) obj).f150572a);
    }

    public final int hashCode() {
        return this.f150572a.hashCode();
    }
}
