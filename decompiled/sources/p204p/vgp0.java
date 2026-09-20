package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class vgp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ el2 f241288a;

    public vgp0(el2 el2Var) {
        this.f241288a = el2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ugp0 ugp0Var;
        if (ibkVar instanceof ugp0) {
            ugp0Var = (ugp0) ibkVar;
            int i = ugp0Var.f230223b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugp0Var.f230223b = i - Integer.MIN_VALUE;
            } else {
                ugp0Var = new ugp0(this, ibkVar);
            }
        } else {
            ugp0Var = new ugp0(this, ibkVar);
        }
        Object obj2 = ugp0Var.f230222a;
        int i2 = ugp0Var.f230223b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                nhp0 nhp0Var = (nhp0) obj;
                el2 el2Var = this.f241288a;
                String str = nhp0Var.f154045a;
                vl2 vl2Var = new vl2(nhp0Var.f154046b, nhp0Var.f154047c, nhp0Var.f154048d);
                ugp0Var.f230223b = 1;
                Object objM70247h = ((pl2) el2Var).m70247h(str, vl2Var, ugp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM70247h == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return w2a1.f247311a;
    }
}
