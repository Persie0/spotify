package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class h371 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o371 f87156a;

    public h371(o371 o371Var) {
        this.f87156a = o371Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0.m60397a(r1, r7) == r4) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        g371 g371Var;
        int i;
        if (ibkVar instanceof g371) {
            g371Var = (g371) ibkVar;
            int i2 = g371Var.f76127b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g371Var.f76127b = i2 - Integer.MIN_VALUE;
            } else {
                g371Var = new g371(this, ibkVar);
            }
        } else {
            g371Var = new g371(this, ibkVar);
        }
        Object objM78994j = g371Var.f76126a;
        int i3 = g371Var.f76127b;
        o371 o371Var = this.f87156a;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = g371Var.f76129d;
                bga.m29073P(objM78994j);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM78994j);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM78994j);
        sr31 sr31Var = o371Var.f161299a;
        g371Var.f76129d = 0;
        g371Var.f76127b = 1;
        objM78994j = sr31Var.m78994j((r371) obj, g371Var);
        if (objM78994j != yukVar) {
            i = 0;
        }
        return yukVar;
        m011 m011Var = o371Var.f161300b;
        acr0 acr0Var = new acr0(new b3r((v2r) objM78994j));
        g371Var.f76129d = i;
        g371Var.f76127b = 2;
    }
}
