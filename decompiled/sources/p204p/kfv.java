package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class kfv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xyx f122230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x6j0 f122231b;

    public kfv(xyx xyxVar, x6j0 x6j0Var) {
        this.f122230a = xyxVar;
        this.f122231b = x6j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        jfv jfvVar;
        if (ibkVar instanceof jfv) {
            jfvVar = (jfv) ibkVar;
            int i = jfvVar.f111975b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfvVar.f111975b = i - Integer.MIN_VALUE;
            } else {
                jfvVar = new jfv(this, ibkVar);
            }
        } else {
            jfvVar = new jfv(this, ibkVar);
        }
        Object obj2 = jfvVar.f111974a;
        int i2 = jfvVar.f111975b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vev vevVar = (vev) obj;
            fiz fizVarM92433k = this.f122230a.m92433k(vevVar.f240822a);
            x6j0 x6j0Var = this.f122231b;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new s5u(new vjz(fizVarM92433k, new mdr(x6j0Var, vevVar, fbkVar, 19)), x6j0Var, 4), new ju0(x6j0Var, fbkVar, 13), 2);
            d6i d6iVar = new d6i(bqz0Var, 28);
            jfvVar.f111975b = 1;
            Object objCollect = vjzVar.collect(d6iVar, jfvVar);
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
