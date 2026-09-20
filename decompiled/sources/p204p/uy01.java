package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class uy01 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iry0 f235082a;

    public uy01(iry0 iry0Var) {
        this.f235082a = iry0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L28;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ty01 ty01Var;
        if (ibkVar instanceof ty01) {
            ty01Var = (ty01) ibkVar;
            int i = ty01Var.f224798b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ty01Var.f224798b = i - Integer.MIN_VALUE;
            } else {
                ty01Var = new ty01(this, ibkVar);
            }
        } else {
            ty01Var = new ty01(this, ibkVar);
        }
        Object obj2 = ty01Var.f224797a;
        int i2 = ty01Var.f224798b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ty01Var.f224800d;
                bga.m29073P(obj2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        ty01Var.f224800d = bqz0Var;
        ty01Var.f224798b = 1;
        b411 b411Var = (b411) this.f235082a.f105071b;
        if (b411Var.f23169a && b411Var.f23170b == null) {
            b411Var.f23170b = tnk0.f221995a.mo75876t("sharing.share_sheet");
        }
        obj2 = bz01.f32339a;
        if (obj2 != yukVar) {
        }
        return yukVar;
        ty01Var.f224800d = null;
        ty01Var.f224798b = 2;
    }
}
