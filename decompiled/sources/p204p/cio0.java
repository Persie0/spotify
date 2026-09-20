package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class cio0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dio0 f38408a;

    public cio0(dio0 dio0Var) {
        this.f38408a = dio0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bio0 bio0Var;
        Object objM47845a;
        if (ibkVar instanceof bio0) {
            bio0Var = (bio0) ibkVar;
            int i = bio0Var.f27518b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bio0Var.f27518b = i - Integer.MIN_VALUE;
            } else {
                bio0Var = new bio0(this, ibkVar);
            }
        } else {
            bio0Var = new bio0(this, ibkVar);
        }
        Object obj2 = bio0Var.f27517a;
        int i2 = bio0Var.f27518b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = bio0Var.f27520d;
                bga.m29073P(obj2);
                objM47845a = ((s6x0) obj2).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        kho0 kho0Var = (kho0) obj;
        hki0 hki0Var = this.f38408a.f49449a;
        String str = kho0Var.f122700a;
        String str2 = kho0Var.f122701b;
        ArrayList arrayList = kho0Var.f122702c;
        bio0Var.f27520d = bqz0Var;
        bio0Var.f27518b = 1;
        objM47845a = hki0Var.m47845a(str, str2, arrayList, bio0Var);
        if (objM47845a != yukVar) {
        }
        return yukVar;
        ojo0 ojo0Var = s6x0.m77348a(objM47845a) == null ? new ojo0(new uwt0(((vwt0) objM47845a).f245553a)) : new ojo0(twt0.f224480c);
        bio0Var.f27520d = null;
        bio0Var.f27518b = 2;
    }
}
