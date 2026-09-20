package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class lut0 {

    /* JADX INFO: renamed from: a */
    public final Context f137153a;

    /* JADX INFO: renamed from: b */
    public final e940 f137154b;

    public lut0(Context context, e940 e940Var) {
        this.f137153a = context;
        this.f137154b = e940Var;
    }

    /* JADX INFO: renamed from: a */
    public final Context m60026a() {
        return this.f137153a;
    }

    /* JADX INFO: renamed from: b */
    public final e940 m60027b() {
        return this.f137154b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lut0)) {
            return false;
        }
        lut0 lut0Var = (lut0) obj;
        return wj50.m88271j(this.f137153a, lut0Var.f137153a) && wj50.m88271j(this.f137154b, lut0Var.f137154b);
    }

    public final int hashCode() {
        return this.f137154b.hashCode() + (this.f137153a.hashCode() * 31);
    }
}
