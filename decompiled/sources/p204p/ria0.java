package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ria0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wiy0 f199469a;

    public ria0(wiy0 wiy0Var) {
        this.f199469a = wiy0Var;
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
        qia0 qia0Var;
        if (ibkVar instanceof qia0) {
            qia0Var = (qia0) ibkVar;
            int i = qia0Var.f188971b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qia0Var.f188971b = i - Integer.MIN_VALUE;
            } else {
                qia0Var = new qia0(this, ibkVar);
            }
        } else {
            qia0Var = new qia0(this, ibkVar);
        }
        Object objM88228b = qia0Var.f188970a;
        int i2 = qia0Var.f188971b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = qia0Var.f188973d;
                bga.m29073P(objM88228b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88228b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM88228b);
        String str = ((cia0) obj).f38263c;
        qia0Var.f188973d = bqz0Var;
        qia0Var.f188971b = 1;
        objM88228b = this.f199469a.m88228b(str, qia0Var);
        if (objM88228b != yukVar) {
        }
        return yukVar;
        qia0Var.f188973d = null;
        qia0Var.f188971b = 2;
    }
}
