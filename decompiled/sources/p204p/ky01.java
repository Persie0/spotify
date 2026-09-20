package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ky01 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w8q0 f127612a;

    public ky01(w8q0 w8q0Var) {
        this.f127612a = w8q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        jy01 jy01Var;
        if (ibkVar instanceof jy01) {
            jy01Var = (jy01) ibkVar;
            int i = jy01Var.f117263b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy01Var.f117263b = i - Integer.MIN_VALUE;
            } else {
                jy01Var = new jy01(this, ibkVar);
            }
        } else {
            jy01Var = new jy01(this, ibkVar);
        }
        Object objM28059a = jy01Var.f117262a;
        int i2 = jy01Var.f117263b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = jy01Var.f117265d;
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
        jy01Var.f117265d = bqz0Var;
        jy01Var.f117263b = 1;
        w8q0 w8q0Var = this.f127612a;
        objM28059a = ((b411) w8q0Var.f248995c).m28059a("sharing.entry_point_plugins_loading", null, new ilw0(w8q0Var, (a011) obj, fbkVar, 3), jy01Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        jy01Var.f117265d = null;
        jy01Var.f117263b = 2;
    }
}
