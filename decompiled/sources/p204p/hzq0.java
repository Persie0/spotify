package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hzq0 extends xul0 {

    /* JADX INFO: renamed from: a */
    public final Object f96997a;

    public hzq0(Object obj) {
        this.f96997a = obj;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: b */
    public final Object mo49278b() {
        return this.f96997a;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: c */
    public final boolean mo49279c() {
        return true;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: e */
    public final Object mo49280e(Object obj) {
        c95.m31848n(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f96997a;
    }

    @Override // p204p.xul0
    public final boolean equals(Object obj) {
        if (obj instanceof hzq0) {
            return this.f96997a.equals(((hzq0) obj).f96997a);
        }
        return false;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: f */
    public final Object mo49281f(n5b n5bVar) {
        return this.f96997a;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: g */
    public final xul0 mo49282g(xul0 xul0Var) {
        xul0Var.getClass();
        return this;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: h */
    public final Object mo49283h() {
        return this.f96997a;
    }

    @Override // p204p.xul0
    public final int hashCode() {
        return this.f96997a.hashCode() + 1502476572;
    }

    @Override // p204p.xul0
    /* JADX INFO: renamed from: i */
    public final xul0 mo49284i(qh00 qh00Var) {
        Object objApply = qh00Var.apply(this.f96997a);
        c95.m31848n(objApply, "the Function passed to Optional.transform() must not return null.");
        return new hzq0(objApply);
    }

    @Override // p204p.xul0
    public final String toString() {
        return edb.m38568q(new StringBuilder("Optional.of("), this.f96997a, ")");
    }
}
