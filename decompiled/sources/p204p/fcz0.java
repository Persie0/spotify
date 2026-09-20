package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fcz0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f68276a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f68277b;

    /* JADX INFO: renamed from: c */
    public final o4x f68278c;

    /* JADX INFO: renamed from: d */
    public final long f68279d;

    /* JADX INFO: renamed from: e */
    public final long f68280e;

    public fcz0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, long j, long j2) {
        this.f68276a = otd0Var;
        this.f68277b = ibp0Var;
        this.f68278c = o4xVar;
        this.f68279d = j;
        this.f68280e = j2;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m41341a() {
        return this.f68278c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m41342b() {
        return this.f68276a;
    }

    /* JADX INFO: renamed from: c */
    public final ibp0 m41343c() {
        return this.f68277b;
    }

    /* JADX INFO: renamed from: d */
    public final long m41344d() {
        return this.f68280e;
    }

    /* JADX INFO: renamed from: e */
    public final long m41345e() {
        return this.f68279d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcz0)) {
            return false;
        }
        fcz0 fcz0Var = (fcz0) obj;
        return wj50.m88271j(this.f68276a, fcz0Var.f68276a) && wj50.m88271j(this.f68277b, fcz0Var.f68277b) && wj50.m88271j(this.f68278c, fcz0Var.f68278c) && this.f68279d == fcz0Var.f68279d && this.f68280e == fcz0Var.f68280e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68280e) + dq60.m36605e((this.f68278c.hashCode() + ((this.f68277b.hashCode() + (this.f68276a.hashCode() * 31)) * 31)) * 31, this.f68279d, 31);
    }
}
