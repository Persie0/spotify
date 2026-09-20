package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lnu0 {

    /* JADX INFO: renamed from: a */
    public final ue50 f135228a;

    /* JADX INFO: renamed from: b */
    public final zpu0 f135229b;

    /* JADX INFO: renamed from: c */
    public final g291 f135230c;

    /* JADX INFO: renamed from: d */
    public final luk f135231d;

    public lnu0(ue50 ue50Var, zpu0 zpu0Var, g291 g291Var, luk lukVar) {
        this.f135228a = ue50Var;
        this.f135229b = zpu0Var;
        this.f135230c = g291Var;
        this.f135231d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m59509b(String str, ibk ibkVar, boolean z) throws Throwable {
        jnu0 jnu0Var;
        if (ibkVar instanceof jnu0) {
            jnu0Var = (jnu0) ibkVar;
            int i = jnu0Var.f114204c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jnu0Var.f114204c = i - Integer.MIN_VALUE;
            } else {
                jnu0Var = new jnu0(this, ibkVar);
            }
        } else {
            jnu0Var = new jnu0(this, ibkVar);
        }
        Object obj = jnu0Var.f114202a;
        int i2 = jnu0Var.f114204c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        vy81 vy81Var = (vy81) this.f135228a.f229407a.m66541c(str + z);
        if (vy81Var != null) {
            return vy81Var;
        }
        hj1 hj1Var = new hj1(this, str, z, (fbk) null, 29);
        jnu0Var.f114204c = 1;
        Object objM89557A = x0h1.m89557A(this.f135231d, hj1Var, jnu0Var);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }
}
