package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o231 {

    /* JADX INFO: renamed from: a */
    public final n231 f160929a;

    /* JADX INFO: renamed from: b */
    public final sko0 f160930b;

    /* JADX INFO: renamed from: c */
    public final List f160931c;

    public o231(n231 n231Var, sko0 sko0Var, List list) {
        this.f160929a = n231Var;
        this.f160930b = sko0Var;
        this.f160931c = list;
    }

    /* JADX INFO: renamed from: a */
    public static o231 m66094a(o231 o231Var, n231 n231Var, sko0 sko0Var, List list, int i) {
        if ((i & 1) != 0) {
            n231Var = o231Var.f160929a;
        }
        if ((i & 2) != 0) {
            sko0Var = o231Var.f160930b;
        }
        if ((i & 4) != 0) {
            list = o231Var.f160931c;
        }
        o231Var.getClass();
        return new o231(n231Var, sko0Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o231)) {
            return false;
        }
        o231 o231Var = (o231) obj;
        return wj50.m88271j(this.f160929a, o231Var.f160929a) && wj50.m88271j(this.f160930b, o231Var.f160930b) && wj50.m88271j(this.f160931c, o231Var.f160931c);
    }

    public final int hashCode() {
        n231 n231Var = this.f160929a;
        int iHashCode = (n231Var == null ? 0 : n231Var.hashCode()) * 31;
        sko0 sko0Var = this.f160930b;
        return this.f160931c.hashCode() + ((iHashCode + (sko0Var != null ? sko0Var.hashCode() : 0)) * 31);
    }
}
