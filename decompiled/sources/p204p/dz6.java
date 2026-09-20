package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class dz6 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f54540a;

    /* JADX INFO: renamed from: b */
    public final int f54541b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f54542c;

    public dz6(int i, String str, ArrayList arrayList) {
        this.f54540a = str;
        this.f54541b = i;
        this.f54542c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz6)) {
            return false;
        }
        dz6 dz6Var = (dz6) obj;
        return this.f54540a.equals(dz6Var.f54540a) && this.f54541b == dz6Var.f54541b && this.f54542c.equals(dz6Var.f54542c);
    }

    public final int hashCode() {
        return this.f54542c.hashCode() + f710.m40938f(this.f54541b, this.f54540a.hashCode() * 31, 31);
    }
}
