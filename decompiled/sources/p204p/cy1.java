package p204p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes8.dex */
public final class cy1 {

    /* JADX INFO: renamed from: a */
    public final View f43137a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserver f43138b;

    /* JADX INFO: renamed from: c */
    public final int f43139c;

    public cy1(View view) {
        this.f43137a = view;
        this.f43138b = view.getViewTreeObserver();
        this.f43139c = view.getId();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cy1) && wj50.m88271j(this.f43137a, ((cy1) obj).f43137a);
    }

    public final int hashCode() {
        return this.f43137a.hashCode();
    }
}
