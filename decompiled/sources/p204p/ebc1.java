package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ebc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yho f57902a;

    public ebc1(yho yhoVar) {
        this.f57902a = yhoVar;
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
        dbc1 dbc1Var;
        if (ibkVar instanceof dbc1) {
            dbc1Var = (dbc1) ibkVar;
            int i = dbc1Var.f47291b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dbc1Var.f47291b = i - Integer.MIN_VALUE;
            } else {
                dbc1Var = new dbc1(this, ibkVar);
            }
        } else {
            dbc1Var = new dbc1(this, ibkVar);
        }
        Object objM28059a = dbc1Var.f47290a;
        int i2 = dbc1Var.f47291b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dbc1Var.f47293d;
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
        dbc1Var.f47293d = bqz0Var;
        dbc1Var.f47291b = 1;
        yho yhoVar = this.f57902a;
        objM28059a = ((b411) yhoVar.f272932g).m28059a("sharing.video_timestamp_share_format_loading", null, new i090((lbc1) obj, yhoVar, fbkVar, 21), dbc1Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        dbc1Var.f47293d = null;
        dbc1Var.f47291b = 2;
    }
}
