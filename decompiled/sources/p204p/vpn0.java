package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vpn0 extends eqn0 implements wpn0 {

    /* JADX INFO: renamed from: d */
    public static final vpn0 f243731d = new vpn0(mj91.f144207e, 0);

    @Override // p204p.eqn0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof v3t0) {
            return super.containsKey((v3t0) obj);
        }
        return false;
    }

    @Override // p204p.AbstractC2328r7, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof n3b1) {
            return super.containsValue((n3b1) obj);
        }
        return false;
    }

    @Override // p204p.eqn0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final upn0 mo39729e() {
        upn0 upn0Var = new upn0(this);
        upn0Var.f232740g = this;
        return upn0Var;
    }

    @Override // p204p.eqn0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof v3t0) {
            return (n3b1) super.get((v3t0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof v3t0) ? obj2 : (n3b1) super.getOrDefault((v3t0) obj, (n3b1) obj2);
    }

    /* JADX INFO: renamed from: h */
    public final vpn0 m86165h(v3t0 v3t0Var, n3b1 n3b1Var) {
        t9w0 t9w0VarM61959u = this.f61928a.m61959u(v3t0Var.hashCode(), v3t0Var, n3b1Var, 0);
        if (t9w0VarM61959u == null) {
            return this;
        }
        return new vpn0(t9w0VarM61959u.m80318c(), t9w0VarM61959u.m80319d() + this.f61929b);
    }
}
