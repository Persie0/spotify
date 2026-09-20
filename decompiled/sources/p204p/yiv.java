package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class yiv {

    /* JADX INFO: renamed from: a */
    public final View f273206a;

    public yiv(View view) {
        this.f273206a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yiv) && wj50.m88271j(this.f273206a, ((yiv) obj).f273206a);
    }

    public final int hashCode() {
        return this.f273206a.hashCode();
    }
}
