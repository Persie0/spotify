package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class jjr0 extends ljr0 {

    /* JADX INFO: renamed from: l */
    public final Set f113086l;

    /* JADX INFO: renamed from: m */
    public final Set f113087m;

    /* JADX INFO: renamed from: n */
    public final Set f113088n;

    /* JADX INFO: renamed from: o */
    public final Set f113089o;

    /* JADX INFO: renamed from: p */
    public final Set f113090p;

    /* JADX INFO: renamed from: q */
    public final Set f113091q;

    /* JADX INFO: renamed from: r */
    public final boolean f113092r;

    /* JADX INFO: renamed from: s */
    public final Set f113093s;

    /* JADX INFO: renamed from: t */
    public final boolean f113094t;

    /* JADX INFO: renamed from: u */
    public final boolean f113095u;

    public jjr0(Set set, Set set2, Set set3, Set set4, Set set5, Set set6, boolean z, Set set7, boolean z2, boolean z3) {
        super(2, set, set2, set3, set6, set4, set5, z, set7, z2, z3);
        this.f113086l = set;
        this.f113087m = set2;
        this.f113088n = set3;
        this.f113089o = set4;
        this.f113090p = set5;
        this.f113091q = set6;
        this.f113092r = z;
        this.f113093s = set7;
        this.f113094t = z2;
        this.f113095u = z3;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: a */
    public final Set mo50819a() {
        return this.f113086l;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: b */
    public final Set mo50820b() {
        return this.f113090p;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: c */
    public final Set mo50821c() {
        return this.f113089o;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: d */
    public final Set mo50822d() {
        return this.f113091q;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: e */
    public final Set mo50823e() {
        return this.f113088n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjr0)) {
            return false;
        }
        jjr0 jjr0Var = (jjr0) obj;
        return wj50.m88271j(this.f113086l, jjr0Var.f113086l) && wj50.m88271j(this.f113087m, jjr0Var.f113087m) && wj50.m88271j(this.f113088n, jjr0Var.f113088n) && wj50.m88271j(this.f113089o, jjr0Var.f113089o) && wj50.m88271j(this.f113090p, jjr0Var.f113090p) && wj50.m88271j(this.f113091q, jjr0Var.f113091q) && this.f113092r == jjr0Var.f113092r && wj50.m88271j(this.f113093s, jjr0Var.f113093s) && this.f113094t == jjr0Var.f113094t && this.f113095u == jjr0Var.f113095u;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: f */
    public final Set mo50824f() {
        return this.f113087m;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: g */
    public final Set mo50825g() {
        return this.f113093s;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: h */
    public final boolean mo50826h() {
        return this.f113092r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113095u) + s571.m77245d(klh.m56830b(s571.m77245d(klh.m56830b(klh.m56830b(klh.m56830b(klh.m56830b(klh.m56830b(this.f113086l.hashCode() * 31, 31, this.f113087m), 31, this.f113088n), 31, this.f113089o), 31, this.f113090p), 31, this.f113091q), 31, this.f113092r), 31, this.f113093s), 31, this.f113094t);
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: j */
    public final boolean mo50828j() {
        return this.f113094t;
    }

    @Override // p204p.ljr0
    /* JADX INFO: renamed from: k */
    public final boolean mo50829k() {
        return this.f113095u;
    }
}
