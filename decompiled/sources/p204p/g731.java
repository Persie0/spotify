package p204p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes10.dex */
public final class g731 implements h731 {

    /* JADX INFO: renamed from: a */
    public final String f77168a;

    /* JADX INFO: renamed from: b */
    public final Drawable f77169b;

    public g731(String str, Drawable drawable) {
        this.f77168a = str;
        this.f77169b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g731)) {
            return false;
        }
        g731 g731Var = (g731) obj;
        return wj50.m88271j(this.f77168a, g731Var.f77168a) && wj50.m88271j(this.f77169b, g731Var.f77169b);
    }

    public final int hashCode() {
        return this.f77169b.hashCode() + (this.f77168a.hashCode() * 31);
    }
}
