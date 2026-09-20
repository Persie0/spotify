package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class fhp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yz80 f69690a;

    public fhp0(yz80 yz80Var) {
        this.f69690a = yz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ehp0 ehp0Var;
        if (ibkVar instanceof ehp0) {
            ehp0Var = (ehp0) ibkVar;
            int i = ehp0Var.f59634b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehp0Var.f59634b = i - Integer.MIN_VALUE;
            } else {
                ehp0Var = new ehp0(this, ibkVar);
            }
        } else {
            ehp0Var = new ehp0(this, ibkVar);
        }
        Object objM56450a = ehp0Var.f59633a;
        int i2 = ehp0Var.f59634b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ehp0Var.f59636d;
                bga.m29073P(objM56450a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56450a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56450a);
        qhp0 qhp0Var = (qhp0) obj;
        String str = qhp0Var.f188819b;
        String str2 = qhp0Var.f188818a;
        int i3 = qhp0Var.f188820c;
        ehp0Var.f59636d = bqz0Var;
        ehp0Var.f59634b = 1;
        objM56450a = khp0.m56450a(this.f69690a, str, str2, i3, ehp0Var);
        if (objM56450a != yukVar) {
        }
        return yukVar;
        ehp0Var.f59636d = null;
        ehp0Var.f59634b = 2;
    }
}
