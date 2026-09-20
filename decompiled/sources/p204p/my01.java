package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class my01 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bq70 f148247a;

    public my01(bq70 bq70Var) {
        this.f148247a = bq70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ly01 ly01Var;
        if (ibkVar instanceof ly01) {
            ly01Var = (ly01) ibkVar;
            int i = ly01Var.f137925b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ly01Var.f137925b = i - Integer.MIN_VALUE;
            } else {
                ly01Var = new ly01(this, ibkVar);
            }
        } else {
            ly01Var = new ly01(this, ibkVar);
        }
        Object objM28059a = ly01Var.f137924a;
        int i2 = ly01Var.f137925b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ly01Var.f137927d;
                bga.m29073P(objM28059a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM28059a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM28059a);
        ly01Var.f137927d = bqz0Var;
        ly01Var.f137925b = 1;
        bq70 bq70Var = this.f148247a;
        objM28059a = ((b411) bq70Var.f29722c).m28059a("sharing.slots_configuration_loading", null, new i090(bq70Var, (vz01) obj, fbkVar, 24), ly01Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        ly01Var.f137927d = null;
        ly01Var.f137925b = 2;
    }
}
