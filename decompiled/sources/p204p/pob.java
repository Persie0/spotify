package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pob {

    /* JADX INFO: renamed from: a */
    public final String f179663a;

    /* JADX INFO: renamed from: b */
    public final boolean f179664b;

    /* JADX INFO: renamed from: c */
    public final int f179665c;

    /* JADX INFO: renamed from: d */
    public final wl6 f179666d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f179667e;

    public pob(String str, boolean z, int i, wl6 wl6Var, ArrayList arrayList) {
        this.f179663a = str;
        this.f179664b = z;
        this.f179665c = i;
        this.f179666d = wl6Var;
        this.f179667e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pob)) {
            return false;
        }
        pob pobVar = (pob) obj;
        return wj50.m88271j(this.f179663a, pobVar.f179663a) && this.f179664b == pobVar.f179664b && this.f179665c == pobVar.f179665c && wj50.m88271j(this.f179666d, pobVar.f179666d) && this.f179667e.equals(pobVar.f179667e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f179665c, s571.m77245d(this.f179663a.hashCode() * 31, 31, this.f179664b), 31);
        wl6 wl6Var = this.f179666d;
        return this.f179667e.hashCode() + ((iM40938f + (wl6Var == null ? 0 : wl6Var.hashCode())) * 31);
    }
}
