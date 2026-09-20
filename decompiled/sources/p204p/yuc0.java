package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class yuc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x2a0 f276307a;

    public yuc0(x2a0 x2a0Var) {
        this.f276307a = x2a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xuc0 xuc0Var;
        if (ibkVar instanceof xuc0) {
            xuc0Var = (xuc0) ibkVar;
            int i = xuc0Var.f266076b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xuc0Var.f266076b = i - Integer.MIN_VALUE;
            } else {
                xuc0Var = new xuc0(this, ibkVar);
            }
        } else {
            xuc0Var = new xuc0(this, ibkVar);
        }
        Object obj2 = xuc0Var.f266075a;
        int i2 = xuc0Var.f266076b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fiz fizVar = (fiz) this.f276307a.invoke((rtc0) obj);
            mwa0 mwa0Var = new mwa0(bqz0Var, 10);
            xuc0Var.f266076b = 1;
            Object objCollect = fizVar.collect(mwa0Var, xuc0Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
