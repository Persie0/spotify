package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class xbk0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qyr f259940a;

    public xbk0(qyr qyrVar) {
        this.f259940a = qyrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wbk0 wbk0Var;
        if (ibkVar instanceof wbk0) {
            wbk0Var = (wbk0) ibkVar;
            int i = wbk0Var.f249778b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbk0Var.f249778b = i - Integer.MIN_VALUE;
            } else {
                wbk0Var = new wbk0(this, ibkVar);
            }
        } else {
            wbk0Var = new wbk0(this, ibkVar);
        }
        Object obj2 = wbk0Var.f249777a;
        int i2 = wbk0Var.f249778b;
        qyr qyrVar = this.f259940a;
        yuk yukVar = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            wbk0Var.f249780d = bqz0Var;
            wbk0Var.f249778b = 1;
            l950 l950Var = qyrVar.f194019d;
            if (l950Var != null) {
                l950Var.cancel();
            }
            w850 w850Var = (w850) qyrVar.f194016a.get();
            l950 l950VarMo52729d = w850Var != null ? w850Var.mo52729d(qyrVar.f194017b) : null;
            qyrVar.f194019d = l950VarMo52729d;
            if (l950VarMo52729d != null) {
                l950VarMo52729d.mo44005d();
            }
            if (w2a1Var != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bqz0Var = wbk0Var.f249780d;
        bga.m29073P(obj2);
        fiz fizVar = qyrVar.f194020e;
        mwa0 mwa0Var = new mwa0(bqz0Var, 21);
        wbk0Var.f249780d = null;
        wbk0Var.f249778b = 2;
        Object objCollect = fizVar.collect(new w3k0(mwa0Var, 6), wbk0Var);
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
