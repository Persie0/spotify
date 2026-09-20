package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class b5c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e5c0 f23559a;

    public b5c0(e5c0 e5c0Var) {
        this.f23559a = e5c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        a5c0 a5c0Var;
        if (ibkVar instanceof a5c0) {
            a5c0Var = (a5c0) ibkVar;
            int i = a5c0Var.f12487b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5c0Var.f12487b = i - Integer.MIN_VALUE;
            } else {
                a5c0Var = new a5c0(this, ibkVar);
            }
        } else {
            a5c0Var = new a5c0(this, ibkVar);
        }
        Object obj2 = a5c0Var.f12486a;
        int i2 = a5c0Var.f12487b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            v4c0 v4c0Var = (v4c0) obj;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new aab0(this.f23559a, v4c0Var, fbkVar, 9)), new ju0(v4c0Var, fbkVar, 19), 2);
            mwa0 mwa0Var = new mwa0(bqz0Var, 7);
            a5c0Var.f12487b = 1;
            Object objCollect = vjzVar.collect(mwa0Var, a5c0Var);
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
