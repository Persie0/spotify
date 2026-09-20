package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class ay00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cy00 f21057a;

    public ay00(cy00 cy00Var) {
        this.f21057a = cy00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        zx00 zx00Var;
        if (ibkVar instanceof zx00) {
            zx00Var = (zx00) ibkVar;
            int i = zx00Var.f287140b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx00Var.f287140b = i - Integer.MIN_VALUE;
            } else {
                zx00Var = new zx00(this, ibkVar);
            }
        } else {
            zx00Var = new zx00(this, ibkVar);
        }
        Object objM34335a = zx00Var.f287139a;
        int i2 = zx00Var.f287140b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = zx00Var.f287142d;
                bga.m29073P(objM34335a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM34335a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM34335a);
        zx00Var.f287142d = bqz0Var;
        zx00Var.f287140b = 1;
        objM34335a = cy00.m34335a(this.f21057a, (ux00) obj, zx00Var);
        if (objM34335a != yukVar) {
        }
        return yukVar;
        zx00Var.f287142d = null;
        zx00Var.f287140b = 2;
    }
}
