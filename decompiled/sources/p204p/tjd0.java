package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class tjd0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ujd0 f220894a;

    public tjd0(ujd0 ujd0Var) {
        this.f220894a = ujd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r10.mo30229d(r11, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        sjd0 sjd0Var;
        if (ibkVar instanceof sjd0) {
            sjd0Var = (sjd0) ibkVar;
            int i = sjd0Var.f209809b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjd0Var.f209809b = i - Integer.MIN_VALUE;
            } else {
                sjd0Var = new sjd0(this, ibkVar);
            }
        } else {
            sjd0Var = new sjd0(this, ibkVar);
        }
        Object objM89557A = sjd0Var.f209808a;
        int i2 = sjd0Var.f209809b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = sjd0Var.f209811d;
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
        ujd0 ujd0Var = this.f220894a;
        luk lukVar = ujd0Var.f230972b;
        sqc0 sqc0Var = new sqc0(ujd0Var, (gid0) obj, fbkVar, 5);
        sjd0Var.f209811d = bqz0Var;
        sjd0Var.f209809b = 1;
        objM89557A = x0h1.m89557A(lukVar, sqc0Var, sjd0Var);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        sjd0Var.f209811d = null;
        sjd0Var.f209809b = 2;
    }
}
