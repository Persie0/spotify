package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class dy40 implements fy40 {

    /* JADX INFO: renamed from: a */
    public final View f54171a;

    /* JADX INFO: renamed from: b */
    public final ky40 f54172b;

    public dy40(View view, ky40 ky40Var) {
        this.f54171a = view;
        this.f54172b = ky40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy40)) {
            return false;
        }
        dy40 dy40Var = (dy40) obj;
        return wj50.m88271j(this.f54171a, dy40Var.f54171a) && this.f54172b == dy40Var.f54172b;
    }

    public final int hashCode() {
        return this.f54172b.hashCode() + (this.f54171a.hashCode() * 31);
    }
}
