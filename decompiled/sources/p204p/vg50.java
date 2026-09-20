package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class vg50 extends yg50 {

    /* JADX INFO: renamed from: a */
    public final View f241145a;

    public vg50(View view) {
        this.f241145a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg50) && wj50.m88271j(this.f241145a, ((vg50) obj).f241145a);
    }

    public final int hashCode() {
        return this.f241145a.hashCode();
    }
}
