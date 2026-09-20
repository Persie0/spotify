package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v87 {

    /* JADX INFO: renamed from: a */
    public final q831 f238415a;

    /* JADX INFO: renamed from: b */
    public final m500 f238416b;

    /* JADX INFO: renamed from: c */
    public final v1k0 f238417c;

    /* JADX INFO: renamed from: d */
    public final luk f238418d;

    public v87(q831 q831Var, m500 m500Var, v1k0 v1k0Var, luk lukVar) {
        this.f238415a = q831Var;
        this.f238416b = m500Var;
        this.f238417c = v1k0Var;
        this.f238418d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m84910a(v87 v87Var, ibk ibkVar) {
        t87 t87Var;
        if (ibkVar instanceof t87) {
            t87Var = (t87) ibkVar;
            int i = t87Var.f217986c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t87Var.f217986c = i - Integer.MIN_VALUE;
            } else {
                t87Var = new t87(v87Var, ibkVar);
            }
        } else {
            t87Var = new t87(v87Var, ibkVar);
        }
        Object objM76980u = t87Var.f217984a;
        int i2 = t87Var.f217986c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            s87 s87Var = new s87(v87Var, null, 1);
            t87Var.f217986c = 1;
            objM76980u = s1h1.m76980u(2000L, s87Var, t87Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        Boolean bool = (Boolean) objM76980u;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
