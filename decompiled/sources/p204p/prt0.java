package p204p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class prt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f180666a;

    /* JADX INFO: renamed from: b */
    public final int f180667b;

    /* JADX INFO: renamed from: c */
    public final nrt0 f180668c;

    /* JADX INFO: renamed from: d */
    public final Set f180669d;

    /* JADX INFO: renamed from: e */
    public final Set f180670e;

    /* JADX INFO: renamed from: f */
    public final Set f180671f;

    /* JADX INFO: renamed from: g */
    public final Set f180672g;

    /* JADX INFO: renamed from: h */
    public final Set f180673h;

    /* JADX INFO: renamed from: i */
    public final boolean f180674i;

    /* JADX INFO: renamed from: j */
    public final Set f180675j;

    /* JADX INFO: renamed from: k */
    public final Set f180676k;

    /* JADX INFO: renamed from: l */
    public final boolean f180677l;

    /* JADX INFO: renamed from: m */
    public final boolean f180678m;

    public /* synthetic */ prt0(boolean z, int i, Set set, Set set2, Set set3, Set set4, Set set5, boolean z2, Set set6, Set set7, boolean z3, boolean z4, int i2) {
        this(z, i, nrt0.f157608c, set, set2, set3, set4, set5, z2, set6, set7, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: a */
    public static prt0 m70733a(prt0 prt0Var, nrt0 nrt0Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        boolean z = prt0Var.f180666a;
        int i2 = prt0Var.f180667b;
        Set set = prt0Var.f180669d;
        Set set2 = prt0Var.f180670e;
        Set set3 = prt0Var.f180671f;
        Set set4 = prt0Var.f180672g;
        Set set5 = prt0Var.f180673h;
        boolean z2 = prt0Var.f180674i;
        Set set6 = (i & 512) != 0 ? prt0Var.f180675j : linkedHashSet;
        Set set7 = (i & 1024) != 0 ? prt0Var.f180676k : linkedHashSet2;
        boolean z3 = prt0Var.f180677l;
        boolean z4 = prt0Var.f180678m;
        prt0Var.getClass();
        return new prt0(z, i2, nrt0Var, set, set2, set3, set4, set5, z2, set6, set7, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prt0)) {
            return false;
        }
        prt0 prt0Var = (prt0) obj;
        return this.f180666a == prt0Var.f180666a && this.f180667b == prt0Var.f180667b && this.f180668c == prt0Var.f180668c && wj50.m88271j(this.f180669d, prt0Var.f180669d) && wj50.m88271j(this.f180670e, prt0Var.f180670e) && wj50.m88271j(this.f180671f, prt0Var.f180671f) && wj50.m88271j(this.f180672g, prt0Var.f180672g) && wj50.m88271j(this.f180673h, prt0Var.f180673h) && this.f180674i == prt0Var.f180674i && wj50.m88271j(this.f180675j, prt0Var.f180675j) && wj50.m88271j(this.f180676k, prt0Var.f180676k) && this.f180677l == prt0Var.f180677l && this.f180678m == prt0Var.f180678m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180678m) + s571.m77245d(klh.m56830b(klh.m56830b(s571.m77245d(klh.m56830b(klh.m56830b(klh.m56830b(klh.m56830b(klh.m56830b((this.f180668c.hashCode() + f710.m40938f(this.f180667b, Boolean.hashCode(this.f180666a) * 31, 31)) * 31, 31, this.f180669d), 31, this.f180670e), 31, this.f180671f), 31, this.f180672g), 31, this.f180673h), 31, this.f180674i), 31, this.f180675j), 31, this.f180676k), 31, this.f180677l);
    }

    public prt0(boolean z, int i, nrt0 nrt0Var, Set set, Set set2, Set set3, Set set4, Set set5, boolean z2, Set set6, Set set7, boolean z3, boolean z4) {
        this.f180666a = z;
        this.f180667b = i;
        this.f180668c = nrt0Var;
        this.f180669d = set;
        this.f180670e = set2;
        this.f180671f = set3;
        this.f180672g = set4;
        this.f180673h = set5;
        this.f180674i = z2;
        this.f180675j = set6;
        this.f180676k = set7;
        this.f180677l = z3;
        this.f180678m = z4;
    }
}
