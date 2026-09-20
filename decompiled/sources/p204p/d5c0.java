package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class d5c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e5c0 f45391a;

    public d5c0(e5c0 e5c0Var) {
        this.f45391a = e5c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        c5c0 c5c0Var;
        if (ibkVar instanceof c5c0) {
            c5c0Var = (c5c0) ibkVar;
            int i = c5c0Var.f34139b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5c0Var.f34139b = i - Integer.MIN_VALUE;
            } else {
                c5c0Var = new c5c0(this, ibkVar);
            }
        } else {
            c5c0Var = new c5c0(this, ibkVar);
        }
        Object obj2 = c5c0Var.f34138a;
        int i2 = c5c0Var.f34139b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            w4c0 w4c0Var = (w4c0) obj;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new aab0(this.f45391a, w4c0Var, fbkVar, 10)), new ju0(w4c0Var, fbkVar, 20), 2);
            mwa0 mwa0Var = new mwa0(bqz0Var, 8);
            c5c0Var.f34139b = 1;
            Object objCollect = vjzVar.collect(mwa0Var, c5c0Var);
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
