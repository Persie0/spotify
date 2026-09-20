package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class nqb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sdo f157222a;

    public nqb1(sdo sdoVar) {
        this.f157222a = sdoVar;
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
        mqb1 mqb1Var;
        if (ibkVar instanceof mqb1) {
            mqb1Var = (mqb1) ibkVar;
            int i = mqb1Var.f146238b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqb1Var.f146238b = i - Integer.MIN_VALUE;
            } else {
                mqb1Var = new mqb1(this, ibkVar);
            }
        } else {
            mqb1Var = new mqb1(this, ibkVar);
        }
        Object objM28059a = mqb1Var.f146237a;
        int i2 = mqb1Var.f146238b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = mqb1Var.f146240d;
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
        mqb1Var.f146240d = bqz0Var;
        mqb1Var.f146238b = 1;
        sdo sdoVar = this.f157222a;
        objM28059a = ((b411) sdoVar.f208053g).m28059a("sharing.video_chapter_share_format_loading", null, new i090((qqb1) obj, sdoVar, fbkVar, 17), mqb1Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        mqb1Var.f146240d = null;
        mqb1Var.f146238b = 2;
    }
}
