package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tdz0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f219532a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f219533b;

    /* JADX INFO: renamed from: c */
    public final o4x f219534c;

    /* JADX INFO: renamed from: d */
    public final long f219535d;

    /* JADX INFO: renamed from: e */
    public final long f219536e;

    public tdz0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, long j, long j2) {
        this.f219532a = otd0Var;
        this.f219533b = ibp0Var;
        this.f219534c = o4xVar;
        this.f219535d = j;
        this.f219536e = j2;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m80518a() {
        return this.f219534c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m80519b() {
        return this.f219532a;
    }

    /* JADX INFO: renamed from: c */
    public final ibp0 m80520c() {
        return this.f219533b;
    }

    /* JADX INFO: renamed from: d */
    public final long m80521d() {
        return this.f219536e;
    }

    /* JADX INFO: renamed from: e */
    public final long m80522e() {
        return this.f219535d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdz0)) {
            return false;
        }
        tdz0 tdz0Var = (tdz0) obj;
        return wj50.m88271j(this.f219532a, tdz0Var.f219532a) && wj50.m88271j(this.f219533b, tdz0Var.f219533b) && wj50.m88271j(this.f219534c, tdz0Var.f219534c) && this.f219535d == tdz0Var.f219535d && this.f219536e == tdz0Var.f219536e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f219536e) + dq60.m36605e((this.f219534c.hashCode() + ((this.f219533b.hashCode() + (this.f219532a.hashCode() * 31)) * 31)) * 31, this.f219535d, 31);
    }
}
