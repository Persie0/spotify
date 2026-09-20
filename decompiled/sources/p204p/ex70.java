package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ex70 extends pqo implements v3m0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f63690i = {new wys0(ex70.class, "fragments", "getFragments()Ljava/util/List;", 0), new wys0(ex70.class, "empty", "getEmpty()Z", 0)};

    /* JADX INFO: renamed from: d */
    public final nxh0 f63691d;

    /* JADX INFO: renamed from: e */
    public final y400 f63692e;

    /* JADX INFO: renamed from: f */
    public final yma0 f63693f;

    /* JADX INFO: renamed from: g */
    public final yma0 f63694g;

    /* JADX INFO: renamed from: h */
    public final tx70 f63695h;

    /* JADX WARN: Illegal instructions before constructor call */
    public ex70(nxh0 nxh0Var, y400 y400Var, bna0 bna0Var) {
        k25 k25Var = e370.f55667h;
        z400 z400Var = y400Var.f269048a;
        super(k25Var, z400Var.m95303c() ? z400.f279079e : z400Var.m95306g());
        this.f63691d = nxh0Var;
        this.f63692e = y400Var;
        dx70 dx70Var = new dx70(this, 0);
        bna0Var.getClass();
        this.f63693f = new yma0(bna0Var, dx70Var);
        this.f63694g = new yma0(bna0Var, new dx70(this, 1));
        this.f63695h = new tx70(bna0Var, new dx70(this, 2));
    }

    public final boolean equals(Object obj) {
        v3m0 v3m0Var = obj instanceof v3m0 ? (v3m0) obj : null;
        if (v3m0Var == null) {
            return false;
        }
        ex70 ex70Var = (ex70) v3m0Var;
        return wj50.m88271j(this.f63692e, ex70Var.f63692e) && wj50.m88271j(this.f63691d, ex70Var.f63691d);
    }

    public final int hashCode() {
        return this.f63692e.hashCode() + (this.f63691d.hashCode() * 31);
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: o */
    public final oqo mo27379o() {
        y400 y400Var = this.f63692e;
        if (y400Var.f269048a.m95303c()) {
            return null;
        }
        return this.f63691d.mo53208I(y400Var.m92786b());
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28187k(this, obj);
    }
}
