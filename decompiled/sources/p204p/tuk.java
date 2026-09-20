package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tuk extends hzd0 {

    /* JADX INFO: renamed from: Z */
    public yq9 f223870Z;

    @Override // p204p.hzd0, p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        super.mo15625h();
        yq9 yq9Var = this.f223870Z;
        if (yq9Var != null) {
            di41 di41Var = yq9Var.f275170g;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            fbk fbkVar = null;
            yq9Var.f275170g = null;
            if (yq9Var.f275169f != null) {
                return;
            }
            yq9Var.f275169f = x0h1.m89578u(yq9Var.f275167d, null, 0, new lw2(yq9Var, fbkVar, 3), 3);
        }
    }

    @Override // p204p.hzd0, p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        super.mo15626i();
        yq9 yq9Var = this.f223870Z;
        if (yq9Var != null) {
            if (yq9Var.f275170g != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            xuk xukVar = yq9Var.f275167d;
            n5q n5qVar = xsr.f265651a;
            yq9Var.f275170g = x0h1.m89578u(xukVar, pvb0.f181680a.f197428f, 0, new cg5(yq9Var, (fbk) null, 11), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final void m81589o(ibk ibkVar) {
        suk sukVar;
        tuk tukVar;
        if (ibkVar instanceof suk) {
            sukVar = (suk) ibkVar;
            int i = sukVar.f214141c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sukVar.f214141c = i - Integer.MIN_VALUE;
            } else {
                sukVar = new suk(this, ibkVar);
            }
        } else {
            sukVar = new suk(this, ibkVar);
        }
        Object obj = sukVar.f214139a;
        int i2 = sukVar.f214141c;
        if (i2 == 0) {
            bga.m29073P(obj);
            tukVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            tukVar = null;
        }
        tukVar.getClass();
    }
}
