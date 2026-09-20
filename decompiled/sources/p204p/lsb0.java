package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class lsb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ msb0 f136495a;

    public lsb0(msb0 msb0Var) {
        this.f136495a = msb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ksb0 ksb0Var;
        if (ibkVar instanceof ksb0) {
            ksb0Var = (ksb0) ibkVar;
            int i = ksb0Var.f125924b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ksb0Var.f125924b = i - Integer.MIN_VALUE;
            } else {
                ksb0Var = new ksb0(this, ibkVar);
            }
        } else {
            ksb0Var = new ksb0(this, ibkVar);
        }
        Object obj2 = ksb0Var.f125923a;
        int i2 = ksb0Var.f125924b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            int i3 = 4;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new aab0(this.f136495a.f146742a, ((dsb0) obj).f52528c, fbkVar, i3)), new th80(3, i3, fbkVar), 2);
            mwa0 mwa0Var = new mwa0(bqz0Var, 2);
            ksb0Var.f125924b = 1;
            Object objCollect = vjzVar.collect(mwa0Var, ksb0Var);
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
