package p204p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes10.dex */
public final class f731 implements h731 {

    /* JADX INFO: renamed from: a */
    public final LayerDrawable f66546a;

    public f731(LayerDrawable layerDrawable) {
        this.f66546a = layerDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f731) && this.f66546a.equals(((f731) obj).f66546a);
    }

    public final int hashCode() {
        return this.f66546a.hashCode();
    }
}
