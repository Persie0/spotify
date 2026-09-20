package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class sk31 {

    /* JADX INFO: renamed from: a */
    public final v140 f209999a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f210000b;

    public sk31(v140 v140Var, ArrayList arrayList) {
        this.f209999a = v140Var;
        this.f210000b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk31)) {
            return false;
        }
        sk31 sk31Var = (sk31) obj;
        return wj50.m88271j(this.f209999a, sk31Var.f209999a) && this.f210000b.equals(sk31Var.f210000b);
    }

    public final int hashCode() {
        return this.f210000b.hashCode() + (this.f209999a.hashCode() * 31);
    }
}
