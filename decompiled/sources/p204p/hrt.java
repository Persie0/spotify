package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class hrt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xvx0 f94533a;

    public hrt(xvx0 xvx0Var) {
        this.f94533a = xvx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        grt grtVar;
        if (ibkVar instanceof grt) {
            grtVar = (grt) ibkVar;
            int i = grtVar.f83826b;
            if ((i & Integer.MIN_VALUE) != 0) {
                grtVar.f83826b = i - Integer.MIN_VALUE;
            } else {
                grtVar = new grt(this, ibkVar);
            }
        } else {
            grtVar = new grt(this, ibkVar);
        }
        Object obj2 = grtVar.f83825a;
        int i2 = grtVar.f83826b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            yab yabVarM65827f = nxf1.m65827f(new lmz0(this.f94533a, (vjt) obj, (fbk) null, 16));
            d6i d6iVar = new d6i(bqz0Var, 23);
            grtVar.f83826b = 1;
            Object objCollect = yabVarM65827f.collect(d6iVar, grtVar);
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
