package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class egg1 implements iyu0 {

    /* JADX INFO: renamed from: a */
    public final tjg1 f59338a;

    /* JADX INFO: renamed from: b */
    public final String f59339b;

    /* JADX INFO: renamed from: c */
    public final fog1 f59340c;

    /* JADX INFO: renamed from: d */
    public final lsi0 f59341d = msi0.m62770a();

    /* JADX INFO: renamed from: e */
    public final okj0 f59342e;

    public egg1(tjg1 tjg1Var, String str, fog1 fog1Var, okj0 okj0Var) {
        this.f59338a = tjg1Var;
        this.f59339b = str;
        this.f59340c = fog1Var;
        this.f59342e = okj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m38870a(hyu0 hyu0Var, long j, ibk ibkVar) throws Throwable {
        ifg1 ifg1Var;
        if (ibkVar instanceof ifg1) {
            ifg1Var = (ifg1) ibkVar;
            int i = ifg1Var.f101765c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifg1Var.f101765c = i - Integer.MIN_VALUE;
            } else {
                ifg1Var = new ifg1(this, ibkVar);
            }
        } else {
            ifg1Var = new ifg1(this, ibkVar);
        }
        Object obj = ifg1Var.f101763a;
        int i2 = ifg1Var.f101765c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((s6x0) obj).f206218a;
        }
        bga.m29073P(obj);
        ifg1Var.f101765c = 1;
        Object objM38871c = m38871c(hyu0Var, j, ifg1Var);
        Object obj2 = yuk.f276404a;
        return objM38871c == obj2 ? obj2 : objM38871c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m38871c(hyu0 hyu0Var, long j, ibk ibkVar) throws Throwable {
        nfg1 nfg1Var;
        if (ibkVar instanceof nfg1) {
            nfg1Var = (nfg1) ibkVar;
            int i = nfg1Var.f153380c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfg1Var.f153380c = i - Integer.MIN_VALUE;
            } else {
                nfg1Var = new nfg1(this, ibkVar);
            }
        } else {
            nfg1Var = new nfg1(this, ibkVar);
        }
        Object objM89557A = nfg1Var.f153378a;
        int i2 = nfg1Var.f153380c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            juk jukVar = ((c9k) this.f59342e.f166381b).f35578a;
            lny0 lny0Var = new lny0(this, j, hyu0Var, (fbk) null);
            nfg1Var.f153380c = 1;
            objM89557A = x0h1.m89557A(jukVar, lny0Var, nfg1Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        return ((s6x0) objM89557A).f206218a;
    }
}
