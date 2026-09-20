package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dcv implements jcv {

    /* JADX INFO: renamed from: a */
    public final View f47649a;

    public dcv(View view) {
        this.f47649a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcv) && wj50.m88271j(this.f47649a, ((dcv) obj).f47649a);
    }

    public final int hashCode() {
        return this.f47649a.hashCode();
    }
}
