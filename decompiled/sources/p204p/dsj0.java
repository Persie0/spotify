package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dsj0 {

    /* JADX INFO: renamed from: a */
    public bsj0 f52591a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m36776a(String str, ibk ibkVar) throws Throwable {
        csj0 csj0Var;
        guf gufVar;
        if (ibkVar instanceof csj0) {
            csj0Var = (csj0) ibkVar;
            int i = csj0Var.f41624c;
            if ((i & Integer.MIN_VALUE) != 0) {
                csj0Var.f41624c = i - Integer.MIN_VALUE;
            } else {
                csj0Var = new csj0(this, ibkVar);
            }
        } else {
            csj0Var = new csj0(this, ibkVar);
        }
        Object objM38777P = csj0Var.f41622a;
        yuk yukVar = yuk.f276404a;
        int i2 = csj0Var.f41624c;
        boolean z = false;
        if (i2 == 0) {
            bga.m29073P(objM38777P);
            synchronized (this) {
                bsj0 bsj0Var = this.f52591a;
                gufVar = null;
                if (bsj0Var != null) {
                    if (!wj50.m88271j(bsj0Var.f30339a, str)) {
                        bsj0Var = null;
                    }
                    if (bsj0Var != null) {
                        gufVar = bsj0Var.f30340b;
                    }
                }
            }
            if (gufVar != null) {
                csj0Var.f41624c = 1;
                objM38777P = gufVar.m38777P(csj0Var);
                if (objM38777P == yukVar) {
                    return yukVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM38777P);
        if (((Boolean) objM38777P).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m36777b(String str, boolean z) {
        bsj0 bsj0Var = this.f52591a;
        if (bsj0Var != null) {
            if (!wj50.m88271j(bsj0Var.f30339a, str)) {
                bsj0Var = null;
            }
            if (bsj0Var != null) {
                this.f52591a = null;
                bsj0Var.f30340b.m38797k0(Boolean.valueOf(z));
            }
        }
    }
}
