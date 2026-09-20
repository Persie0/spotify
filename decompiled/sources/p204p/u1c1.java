package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class u1c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi5 f225754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9r0 f225755b;

    public u1c1(zi5 zi5Var, z9r0 z9r0Var) {
        this.f225754a = zi5Var;
        this.f225755b = z9r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        t1c1 t1c1Var;
        if (ibkVar instanceof t1c1) {
            t1c1Var = (t1c1) ibkVar;
            int i = t1c1Var.f216224b;
            if ((i & Integer.MIN_VALUE) != 0) {
                t1c1Var.f216224b = i - Integer.MIN_VALUE;
            } else {
                t1c1Var = new t1c1(this, ibkVar);
            }
        } else {
            t1c1Var = new t1c1(this, ibkVar);
        }
        Object objM89631a = t1c1Var.f216223a;
        int i2 = t1c1Var.f216224b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89631a);
            t1c1Var.f216226d = bqz0Var;
            t1c1Var.f216224b = 1;
            objM89631a = x1c1.m89631a((l1c1) obj, this.f225754a, this.f225755b, t1c1Var);
            if (objM89631a != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = t1c1Var.f216226d;
            bga.m29073P(objM89631a);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89631a);
        }
        return w2a1.f247311a;
        t1c1Var.f216226d = null;
        t1c1Var.f216224b = 2;
    }
}
