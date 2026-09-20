package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class d010 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e010 f43694a;

    public d010(e010 e010Var) {
        this.f43694a = e010Var;
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
        c010 c010Var;
        if (ibkVar instanceof c010) {
            c010Var = (c010) ibkVar;
            int i = c010Var.f32643b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c010Var.f32643b = i - Integer.MIN_VALUE;
            } else {
                c010Var = new c010(this, ibkVar);
            }
        } else {
            c010Var = new c010(this, ibkVar);
        }
        Object objM82091e = c010Var.f32642a;
        int i2 = c010Var.f32643b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = c010Var.f32645d;
                bga.m29073P(objM82091e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM82091e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM82091e);
        u010 u010Var = this.f43694a.f54823a;
        c010Var.f32645d = bqz0Var;
        c010Var.f32643b = 1;
        objM82091e = u010Var.m82091e((f010) obj, c010Var);
        if (objM82091e != yukVar) {
        }
        return yukVar;
        c010Var.f32645d = null;
        c010Var.f32643b = 2;
    }
}
