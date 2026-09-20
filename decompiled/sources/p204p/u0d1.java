package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes11.dex */
public final class u0d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v0d1 f225465a;

    public u0d1(v0d1 v0d1Var) {
        this.f225465a = v0d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        t0d1 t0d1Var;
        if (ibkVar instanceof t0d1) {
            t0d1Var = (t0d1) ibkVar;
            int i = t0d1Var.f215850b;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0d1Var.f215850b = i - Integer.MIN_VALUE;
            } else {
                t0d1Var = new t0d1(this, ibkVar);
            }
        } else {
            t0d1Var = new t0d1(this, ibkVar);
        }
        Object objM89557A = t0d1Var.f215849a;
        int i2 = t0d1Var.f215850b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = t0d1Var.f215852d;
                bga.m29073P(objM89557A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89557A);
        t0d1Var.f215852d = bqz0Var;
        t0d1Var.f215850b = 1;
        v0d1 v0d1Var = this.f225465a;
        objM89557A = x0h1.m89557A(v0d1Var.f235974e, new oj71(v0d1Var, (l0d1) obj, fbkVar, 27), t0d1Var);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        t0d1Var.f215852d = null;
        t0d1Var.f215850b = 2;
    }
}
