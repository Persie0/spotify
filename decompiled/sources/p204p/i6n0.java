package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class i6n0 {

    /* JADX INFO: renamed from: a */
    public AtomicBoolean f99294a;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m49812a(gh00 gh00Var, ibk ibkVar) {
        h6n0 h6n0Var;
        AtomicBoolean atomicBoolean = this.f99294a;
        if (ibkVar instanceof h6n0) {
            h6n0Var = (h6n0) ibkVar;
            int i = h6n0Var.f88206c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6n0Var.f88206c = i - Integer.MIN_VALUE;
            } else {
                h6n0Var = new h6n0(this, ibkVar);
            }
        } else {
            h6n0Var = new h6n0(this, ibkVar);
        }
        Object objInvoke = h6n0Var.f88204a;
        int i2 = h6n0Var.f88206c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            if (atomicBoolean.getAndSet(false)) {
                h6n0Var.f88206c = 1;
                objInvoke = gh00Var.invoke(h6n0Var);
                Object obj = yuk.f276404a;
                if (objInvoke == obj) {
                    return obj;
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            atomicBoolean.set(true);
        }
        return w2a1Var;
    }
}
