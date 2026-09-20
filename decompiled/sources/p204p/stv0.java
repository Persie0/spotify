package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class stv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ utv0 f213957a;

    public stv0(utv0 utv0Var) {
        this.f213957a = utv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rtv0 rtv0Var;
        Object ztv0Var;
        if (ibkVar instanceof rtv0) {
            rtv0Var = (rtv0) ibkVar;
            int i = rtv0Var.f202693b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtv0Var.f202693b = i - Integer.MIN_VALUE;
            } else {
                rtv0Var = new rtv0(this, ibkVar);
            }
        } else {
            rtv0Var = new rtv0(this, ibkVar);
        }
        Object objM95889g = rtv0Var.f202692a;
        int i2 = rtv0Var.f202693b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = rtv0Var.f202695d;
                    bga.m29073P(objM95889g);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM95889g);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM95889g);
            ktv0 ktv0Var = (ktv0) obj;
            zby zbyVar = this.f213957a.f233997a;
            String str = ktv0Var.f126403b;
            rtv0Var.f202695d = bqz0Var;
            rtv0Var.f202693b = 1;
            objM95889g = zbyVar.m95889g(str, rtv0Var);
            if (objM95889g == yukVar) {
            }
            return yukVar;
            ztv0Var = new ztv0(p1h1.m68811x((gtv0) objM95889g));
        } catch (Throwable unused) {
            ztv0Var = ytv0.f276225a;
        }
        rtv0Var.f202695d = null;
        rtv0Var.f202693b = 2;
    }
}
