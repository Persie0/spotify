package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class piv extends uiv {

    /* JADX INFO: renamed from: a */
    public final View f178063a;

    /* JADX INFO: renamed from: b */
    public final int f178064b;

    /* JADX INFO: renamed from: c */
    public final String f178065c;

    public piv(View view, int i, String str) {
        this.f178063a = view;
        this.f178064b = i;
        this.f178065c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piv)) {
            return false;
        }
        piv pivVar = (piv) obj;
        return this.f178063a.equals(pivVar.f178063a) && this.f178064b == pivVar.f178064b && this.f178065c.equals(pivVar.f178065c);
    }

    public final int hashCode() {
        return this.f178065c.hashCode() + mt60.m62800g(this.f178064b, this.f178063a.hashCode() * 31, 31);
    }
}
