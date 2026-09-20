package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class jpt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f114716a;

    public jpt(spt sptVar) {
        this.f114716a = sptVar;
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
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ipt iptVar;
        if (ibkVar instanceof ipt) {
            iptVar = (ipt) ibkVar;
            int i = iptVar.f104552b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iptVar.f104552b = i - Integer.MIN_VALUE;
            } else {
                iptVar = new ipt(this, ibkVar);
            }
        } else {
            iptVar = new ipt(this, ibkVar);
        }
        Object objM34964e = iptVar.f104551a;
        int i2 = iptVar.f104552b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = iptVar.f104554d;
                bga.m29073P(objM34964e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM34964e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM34964e);
        d5a0 d5a0Var = this.f114716a.f212947g;
        iptVar.f104554d = bqz0Var;
        iptVar.f104552b = 1;
        objM34964e = d5a0Var.m34964e(arx.f19162a, iptVar);
        if (objM34964e != yukVar) {
        }
        return yukVar;
        iptVar.f104554d = null;
        iptVar.f104552b = 2;
    }
}
