package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y2d {

    /* JADX INFO: renamed from: a */
    public final c700 f268539a;

    /* JADX INFO: renamed from: b */
    public final pz0 f268540b;

    /* JADX INFO: renamed from: c */
    public final twx0 f268541c;

    /* JADX INFO: renamed from: d */
    public final vmz f268542d;

    /* JADX INFO: renamed from: e */
    public final luk f268543e;

    public y2d(c700 c700Var, pz0 pz0Var, twx0 twx0Var, vmz vmzVar, luk lukVar) {
        this.f268539a = c700Var;
        this.f268540b = pz0Var;
        this.f268541c = twx0Var;
        this.f268542d = vmzVar;
        this.f268543e = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m92696a(zx9 zx9Var, ibk ibkVar) throws Throwable {
        x2d x2dVar;
        if (ibkVar instanceof x2d) {
            x2dVar = (x2d) ibkVar;
            int i = x2dVar.f257419d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x2dVar.f257419d = i - Integer.MIN_VALUE;
            } else {
                x2dVar = new x2d(this, ibkVar);
            }
        } else {
            x2dVar = new x2d(this, ibkVar);
        }
        Object obj = x2dVar.f257417b;
        int i2 = x2dVar.f257419d;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            x2dVar.f257416a = zx9Var;
            x2dVar.f257419d = 1;
            Object objM89557A = x0h1.m89557A(this.f268543e, new cg5(this, (fbk) null, 29), x2dVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A != yukVar) {
                objM89557A = w2a1Var;
            }
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zx9Var = x2dVar.f257416a;
            bga.m29073P(obj);
        }
        zx9Var.invoke();
        return w2a1Var;
    }
}
