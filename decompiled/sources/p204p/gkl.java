package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class gkl implements hkl {

    /* JADX INFO: renamed from: a */
    public final View f80827a;

    public gkl(View view) {
        this.f80827a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkl) && wj50.m88271j(this.f80827a, ((gkl) obj).f80827a);
    }

    public final int hashCode() {
        return this.f80827a.hashCode();
    }
}
