package p204p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes7.dex */
public final class zke1 {

    /* JADX INFO: renamed from: a */
    public final zxx0 f283733a;

    /* JADX INFO: renamed from: b */
    public final vmz f283734b;

    /* JADX INFO: renamed from: c */
    public final Flowable f283735c;

    /* JADX INFO: renamed from: d */
    public final ob90 f283736d;

    /* JADX INFO: renamed from: e */
    public final xre f283737e;

    /* JADX INFO: renamed from: f */
    public final zv41 f283738f = jag1.m52819d(Boolean.FALSE);

    public zke1(zxx0 zxx0Var, vmz vmzVar, Flowable flowable, ob90 ob90Var, xre xreVar) {
        this.f283733a = zxx0Var;
        this.f283734b = vmzVar;
        this.f283735c = flowable;
        this.f283736d = ob90Var;
        this.f283737e = xreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m96321a(zke1 zke1Var, ibk ibkVar) {
        xke1 xke1Var;
        if (ibkVar instanceof xke1) {
            xke1Var = (xke1) ibkVar;
            int i = xke1Var.f262360c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xke1Var.f262360c = i - Integer.MIN_VALUE;
            } else {
                xke1Var = new xke1(zke1Var, ibkVar);
            }
        } else {
            xke1Var = new xke1(zke1Var, ibkVar);
        }
        Object objM44308h = xke1Var.f262358a;
        int i2 = xke1Var.f262360c;
        if (i2 == 0) {
            bga.m29073P(objM44308h);
            ob90 ob90Var = zke1Var.f283736d;
            xke1Var.f262360c = 1;
            objM44308h = ((gc90) ob90Var).m44308h(xke1Var);
            yuk yukVar = yuk.f276404a;
            if (objM44308h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM44308h);
        }
        mb90 mb90Var = (mb90) objM44308h;
        if (mb90Var == null) {
            return new ysk(ske1.f210087a, 27);
        }
        return new ysk(new qke1(mb90Var.f141841d, mb90Var.f141838a, mb90Var.f141839b, mb90Var.f141840c), 27);
    }

    /* JADX INFO: renamed from: b */
    public final fiz m96322b() {
        fbk fbkVar = null;
        nnc nncVarM92074U = xtm0.m92074U(mvl0.m62953p(new std1(this.f283733a.mo27555a(), 4)), new vke1(fbkVar, this, 0));
        d0k[] d0kVarArr = bmu0.f28619a;
        return mvl0.m62953p(new zux(nncVarM92074U, xtm0.m92074U(mvl0.m62955r(new onc(this.f283735c), ube1.f228708N0, mvl0.f147608b), new pl81(null, this)), new jl0(3, 28, fbkVar), 1));
    }
}
