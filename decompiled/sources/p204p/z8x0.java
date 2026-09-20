package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z8x0 extends mic1 {

    /* JADX INFO: renamed from: b */
    public final t7j f280584b;

    /* JADX INFO: renamed from: c */
    public Boolean f280585c;

    public z8x0(t7j t7jVar) {
        this.f280584b = t7jVar;
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        if (wj50.m88271j(this.f280585c, Boolean.TRUE)) {
            n5q n5qVar = xsr.f265651a;
            rb20 rb20Var = pvb0.f181680a.f197428f;
            uf60 uf60VarM73202g = qlg1.m73202g();
            rb20Var.getClass();
            c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(rb20Var, uf60VarM73202g));
            int i = 1;
            x0h1.m89578u(c9kVarM56661c, null, 0, new cwd0(this, null, i), 3).mo26599N(new wwt(c9kVarM56661c, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m95612e(ibk ibkVar) {
        y8x0 y8x0Var;
        z8x0 z8x0Var;
        if (ibkVar instanceof y8x0) {
            y8x0Var = (y8x0) ibkVar;
            int i = y8x0Var.f270409d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8x0Var.f270409d = i - Integer.MIN_VALUE;
            } else {
                y8x0Var = new y8x0(this, ibkVar);
            }
        } else {
            y8x0Var = new y8x0(this, ibkVar);
        }
        Object objM80233l = y8x0Var.f270407b;
        int i2 = y8x0Var.f270409d;
        if (i2 == 0) {
            bga.m29073P(objM80233l);
            if (this.f280585c == null) {
                y8x0Var.f270406a = this;
                y8x0Var.f270409d = 1;
                objM80233l = this.f280584b.m80233l(y8x0Var);
                yuk yukVar = yuk.f276404a;
                if (objM80233l == yukVar) {
                    return yukVar;
                }
                z8x0Var = this;
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z8x0Var = y8x0Var.f270406a;
        bga.m29073P(objM80233l);
        z8x0Var.f280585c = (Boolean) objM80233l;
        return w2a1.f247311a;
    }
}
