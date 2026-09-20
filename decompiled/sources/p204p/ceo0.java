package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ceo0 {

    /* JADX INFO: renamed from: a */
    public static final wy41 f37163a = new wy41(lin0.f133839X);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m32590a(zdo0 zdo0Var, th00 th00Var, ibk ibkVar) {
        aeo0 aeo0Var;
        if (ibkVar instanceof aeo0) {
            aeo0Var = (aeo0) ibkVar;
            int i = aeo0Var.f14928b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeo0Var.f14928b = i - Integer.MIN_VALUE;
            } else {
                aeo0Var = new aeo0(ibkVar);
            }
        } else {
            aeo0Var = new aeo0(ibkVar);
        }
        Object obj = aeo0Var.f14927a;
        int i2 = aeo0Var.f14928b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        if (!((exh0) zdo0Var).f63770a.f63766L0) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        g2m0 g2m0VarM88320J = wjg1.m88320J(zdo0Var);
        vpn0 vpn0Var = (vpn0) wjg1.m88319I(zdo0Var).f135670a1;
        vpn0Var.getClass();
        if (rqg1.m76244o(vpn0Var, f37163a) != null) {
            throw new ClassCastException();
        }
        aeo0Var.f14928b = 1;
        m32591b(g2m0VarM88320J, th00Var, aeo0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final void m32591b(g2m0 g2m0Var, th00 th00Var, ibk ibkVar) {
        beo0 beo0Var;
        if (ibkVar instanceof beo0) {
            beo0Var = (beo0) ibkVar;
            int i = beo0Var.f26414b;
            if ((i & Integer.MIN_VALUE) != 0) {
                beo0Var.f26414b = i - Integer.MIN_VALUE;
            } else {
                beo0Var = new beo0(ibkVar);
            }
        } else {
            beo0Var = new beo0(ibkVar);
        }
        Object obj = beo0Var.f26413a;
        int i2 = beo0Var.f26414b;
        if (i2 == 0) {
            bga.m29073P(obj);
            beo0Var.f26414b = 1;
            ((oz3) g2m0Var).m68594L(th00Var, beo0Var);
        } else {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            if (i2 == 2) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
