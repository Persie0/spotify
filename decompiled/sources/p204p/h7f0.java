package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class h7f0 implements i7f0 {

    /* JADX INFO: renamed from: a */
    public final View f88448a;

    /* JADX INFO: renamed from: b */
    public final boolean f88449b;

    public h7f0(View view, boolean z) {
        this.f88448a = view;
        this.f88449b = z;
    }

    @Override // p204p.i7f0
    /* JADX INFO: renamed from: a */
    public final boolean mo43814a() {
        return this.f88449b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7f0)) {
            return false;
        }
        h7f0 h7f0Var = (h7f0) obj;
        return wj50.m88271j(this.f88448a, h7f0Var.f88448a) && this.f88449b == h7f0Var.f88449b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88449b) + (this.f88448a.hashCode() * 31);
    }
}
