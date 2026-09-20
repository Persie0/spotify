package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class l271 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgo f128936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tjo f128937b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ khy0 f128938c;

    public l271(pgo pgoVar, tjo tjoVar, khy0 khy0Var) {
        this.f128936a = pgoVar;
        this.f128937b = tjoVar;
        this.f128938c = khy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        k271 k271Var;
        if (ibkVar instanceof k271) {
            k271Var = (k271) ibkVar;
            int i = k271Var.f118541b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k271Var.f118541b = i - Integer.MIN_VALUE;
            } else {
                k271Var = new k271(this, ibkVar);
            }
        } else {
            k271Var = new k271(this, ibkVar);
        }
        Object objM68918u = k271Var.f118540a;
        int i2 = k271Var.f118541b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = k271Var.f118543d;
                bga.m29073P(objM68918u);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM68918u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM68918u);
        k271Var.f118543d = bqz0Var;
        k271Var.f118541b = 1;
        objM68918u = p271.m68918u(this.f128936a, this.f128937b, this.f128938c, (q271) obj, k271Var);
        if (objM68918u != yukVar) {
        }
        return yukVar;
        k271Var.f118543d = null;
        k271Var.f118541b = 2;
    }
}
