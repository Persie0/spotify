package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class oy01 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ia70 f171633a;

    public oy01(ia70 ia70Var) {
        this.f171633a = ia70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L33;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ny01 ny01Var;
        Object objM28059a;
        if (ibkVar instanceof ny01) {
            ny01Var = (ny01) ibkVar;
            int i = ny01Var.f159659b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny01Var.f159659b = i - Integer.MIN_VALUE;
            } else {
                ny01Var = new ny01(this, ibkVar);
            }
        } else {
            ny01Var = new ny01(this, ibkVar);
        }
        Object fz01Var = ny01Var.f159658a;
        int i2 = ny01Var.f159659b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ny01Var.f159661d;
                bga.m29073P(fz01Var);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(fz01Var);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(fz01Var);
        uz01 uz01Var = (uz01) obj;
        ny01Var.f159661d = bqz0Var;
        ny01Var.f159659b = 1;
        u311 u311Var = uz01Var.f235398b.f194074a;
        if (!(u311Var instanceof r311)) {
            if (u311Var instanceof s311) {
                fz01Var = new fz01(opo.m67546C(u311Var.m82261c()), uz01Var.f235398b.f194082i);
            } else {
                if (!wj50.m88271j(u311Var, t311.f216688a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ia70 ia70Var = this.f171633a;
                objM28059a = ((b411) ia70Var.f100167c).m28059a("sharing.share_formats_loading", null, new i090(ia70Var, uz01Var, fbkVar, 23), ny01Var);
                if (objM28059a != yukVar) {
                    objM28059a = (kz01) objM28059a;
                }
            }
            if (fz01Var != yukVar) {
            }
            return yukVar;
        }
        objM28059a = new fz01(new c6x0(new IllegalStateException("Share sheet already in an error state. Cannot load from that.")), null);
        fz01Var = objM28059a;
        if (fz01Var != yukVar) {
        }
        return yukVar;
        ny01Var.f159661d = null;
        ny01Var.f159659b = 2;
    }
}
