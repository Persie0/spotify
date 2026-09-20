package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class gdv {

    /* JADX INFO: renamed from: a */
    public final View f78952a;

    public gdv(View view) {
        this.f78952a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdv) && wj50.m88271j(this.f78952a, ((gdv) obj).f78952a);
    }

    public final int hashCode() {
        return this.f78952a.hashCode();
    }
}
