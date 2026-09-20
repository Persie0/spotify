package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jk6 {

    /* JADX INFO: renamed from: a */
    public final boolean f113219a;

    /* JADX INFO: renamed from: b */
    public final boolean f113220b;

    /* JADX INFO: renamed from: c */
    public final List f113221c;

    /* JADX INFO: renamed from: d */
    public final boolean f113222d;

    /* JADX INFO: renamed from: e */
    public final boolean f113223e;

    /* JADX INFO: renamed from: f */
    public final boolean f113224f;

    /* JADX INFO: renamed from: g */
    public final bep0 f113225g;

    /* JADX INFO: renamed from: h */
    public final ui6 f113226h;

    /* JADX INFO: renamed from: i */
    public final ai6 f113227i;

    public jk6(boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, bep0 bep0Var, ui6 ui6Var, ai6 ai6Var) {
        this.f113219a = z;
        this.f113220b = z2;
        this.f113221c = list;
        this.f113222d = z3;
        this.f113223e = z4;
        this.f113224f = z5;
        this.f113225g = bep0Var;
        this.f113226h = ui6Var;
        this.f113227i = ai6Var;
    }

    /* JADX INFO: renamed from: a */
    public static jk6 m53585a(jk6 jk6Var, boolean z, boolean z2, ArrayList arrayList, boolean z3, boolean z4, boolean z5, bep0 bep0Var, ai6 ai6Var, int i) {
        if ((i & 1) != 0) {
            z = jk6Var.f113219a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = jk6Var.f113220b;
        }
        boolean z7 = z2;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = jk6Var.f113221c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z3 = jk6Var.f113222d;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = jk6Var.f113223e;
        }
        boolean z9 = z4;
        boolean z10 = (i & 32) != 0 ? jk6Var.f113224f : z5;
        bep0 bep0Var2 = (i & 64) != 0 ? jk6Var.f113225g : bep0Var;
        ui6 ui6Var = jk6Var.f113226h;
        ai6 ai6Var2 = (i & 256) != 0 ? jk6Var.f113227i : ai6Var;
        jk6Var.getClass();
        return new jk6(z6, z7, list2, z8, z9, z10, bep0Var2, ui6Var, ai6Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk6)) {
            return false;
        }
        jk6 jk6Var = (jk6) obj;
        return this.f113219a == jk6Var.f113219a && this.f113220b == jk6Var.f113220b && wj50.m88271j(this.f113221c, jk6Var.f113221c) && this.f113222d == jk6Var.f113222d && this.f113223e == jk6Var.f113223e && this.f113224f == jk6Var.f113224f && wj50.m88271j(this.f113225g, jk6Var.f113225g) && this.f113226h == jk6Var.f113226h && wj50.m88271j(this.f113227i, jk6Var.f113227i);
    }

    public final int hashCode() {
        return this.f113227i.hashCode() + ((this.f113226h.hashCode() + ((this.f113225g.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77244c(s571.m77245d(Boolean.hashCode(this.f113219a) * 31, 31, this.f113220b), 31, this.f113221c), 31, this.f113222d), 31, this.f113223e), 31, this.f113224f)) * 31)) * 31);
    }
}
