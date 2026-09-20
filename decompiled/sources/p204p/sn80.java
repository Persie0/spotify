package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sn80 extends c95 {

    /* JADX INFO: renamed from: e */
    public final up60 f210850e;

    /* JADX INFO: renamed from: f */
    public final Object f210851f;

    /* JADX INFO: renamed from: g */
    public final c95 f210852g;

    public sn80(up60 up60Var, Object obj, c95 c95Var) {
        this.f210850e = up60Var;
        this.f210851f = obj;
        this.f210852g = c95Var;
    }

    @Override // p204p.c95
    /* JADX INFO: renamed from: B */
    public final Object mo31861B(up60 up60Var) {
        return up60Var.equals(this.f210850e) ? ((ife) up60Var).mo28587A().cast(this.f210851f) : this.f210852g.mo31861B(up60Var);
    }

    @Override // p204p.c95
    /* JADX INFO: renamed from: Q */
    public final c95 mo31862Q(up60 up60Var, Object obj) {
        up60 up60Var2 = this.f210850e;
        boolean zEquals = up60Var.equals(up60Var2);
        c95 sn80Var = this.f210852g;
        if (!zEquals) {
            c95 c95VarMo31862Q = sn80Var.mo31862Q(up60Var, null);
            sn80Var = c95VarMo31862Q == sn80Var ? this : new sn80(up60Var2, this.f210851f, c95VarMo31862Q);
        }
        return obj != null ? new sn80(up60Var, obj, sn80Var) : sn80Var;
    }

    public final String toString() {
        return g6f.m43753y0(g6f.m43704R0(btz0.m30496T(btz0.m30487K(this, new f150(17)))), null, "{", "}", new f150(18), 25);
    }
}
