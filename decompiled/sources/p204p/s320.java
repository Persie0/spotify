package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class s320 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f205159a;

    /* JADX INFO: renamed from: b */
    public final th00 f205160b;

    public s320(ArrayList arrayList, th00 th00Var) {
        this.f205159a = arrayList;
        this.f205160b = th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s320)) {
            return false;
        }
        s320 s320Var = (s320) obj;
        return this.f205159a.equals(s320Var.f205159a) && wj50.m88271j(this.f205160b, s320Var.f205160b);
    }

    public final int hashCode() {
        return this.f205160b.hashCode() + (this.f205159a.hashCode() * 31);
    }
}
