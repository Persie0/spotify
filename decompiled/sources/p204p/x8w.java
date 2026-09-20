package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class x8w {

    /* JADX INFO: renamed from: a */
    public final Context f259228a;

    /* JADX INFO: renamed from: b */
    public final g9b0 f259229b;

    /* JADX INFO: renamed from: c */
    public final e940 f259230c;

    public x8w(Context context, g9b0 g9b0Var, e940 e940Var) {
        this.f259228a = context;
        this.f259229b = g9b0Var;
        this.f259230c = e940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8w)) {
            return false;
        }
        x8w x8wVar = (x8w) obj;
        return wj50.m88271j(this.f259228a, x8wVar.f259228a) && wj50.m88271j(this.f259229b, x8wVar.f259229b) && wj50.m88271j(this.f259230c, x8wVar.f259230c);
    }

    public final int hashCode() {
        return this.f259230c.hashCode() + ((this.f259229b.hashCode() + (this.f259228a.hashCode() * 31)) * 31);
    }
}
