package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class nh40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f153871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sh40 f153872b;

    public nh40(boolean z, sh40 sh40Var) {
        this.f153871a = z;
        this.f153872b = sh40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        mh40 mh40Var;
        if (ibkVar instanceof mh40) {
            mh40Var = (mh40) ibkVar;
            int i = mh40Var.f143703b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mh40Var.f143703b = i - Integer.MIN_VALUE;
            } else {
                mh40Var = new mh40(this, ibkVar);
            }
        } else {
            mh40Var = new mh40(this, ibkVar);
        }
        Object obj2 = mh40Var.f143702a;
        int i2 = mh40Var.f143703b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fiz fizVarM65828g = this.f153871a ? nxf1.m65828g(new nux0((hh40) obj, this.f153872b.f209086a, null)) : gau.f78095a;
            zax zaxVar = new zax(bqz0Var, 20);
            mh40Var.f143703b = 1;
            Object objCollect = fizVarM65828g.collect(zaxVar, mh40Var);
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
