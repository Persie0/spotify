package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class eiv implements miv {

    /* JADX INFO: renamed from: a */
    public final View f60017a;

    public eiv(View view) {
        this.f60017a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eiv) && wj50.m88271j(this.f60017a, ((eiv) obj).f60017a);
    }

    public final int hashCode() {
        return this.f60017a.hashCode();
    }
}
