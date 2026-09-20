package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class n371 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o371 f149949a;

    public n371(o371 o371Var) {
        this.f149949a = o371Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r10.mo30229d(r11, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        m371 m371Var;
        if (ibkVar instanceof m371) {
            m371Var = (m371) ibkVar;
            int i = m371Var.f139553b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m371Var.f139553b = i - Integer.MIN_VALUE;
            } else {
                m371Var = new m371(this, ibkVar);
            }
        } else {
            m371Var = new m371(this, ibkVar);
        }
        Object objM28059a = m371Var.f139552a;
        int i2 = m371Var.f139553b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = m371Var.f139555d;
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
        o371 o371Var = this.f149949a;
        b411 b411Var = o371Var.f161307i;
        ld01 ld01Var = new ld01((q371) obj, o371Var, fbkVar, 24);
        m371Var.f139555d = bqz0Var;
        m371Var.f139553b = 1;
        objM28059a = b411Var.m28059a("sharing.text_content_share_format_loading", null, ld01Var, m371Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        m371Var.f139555d = null;
        m371Var.f139553b = 2;
    }
}
