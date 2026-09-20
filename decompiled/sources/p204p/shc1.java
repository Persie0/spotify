package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes8.dex */
public final class shc1 {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f209171a;

    public shc1(ViewGroup viewGroup) {
        this.f209171a = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shc1) && wj50.m88271j(this.f209171a, ((shc1) obj).f209171a);
    }

    public final int hashCode() {
        return this.f209171a.hashCode();
    }
}
