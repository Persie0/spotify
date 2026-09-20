package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class yey0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zey0 f272075a;

    public yey0(zey0 zey0Var) {
        this.f272075a = zey0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r11.mo30229d(r12, r0) == r4) goto L29;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xey0 xey0Var;
        Object ify0Var;
        rey0 rey0Var;
        if (ibkVar instanceof xey0) {
            xey0Var = (xey0) ibkVar;
            int i = xey0Var.f260789b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xey0Var.f260789b = i - Integer.MIN_VALUE;
            } else {
                xey0Var = new xey0(this, ibkVar);
            }
        } else {
            xey0Var = new xey0(this, ibkVar);
        }
        Object obj2 = xey0Var.f260788a;
        int i2 = xey0Var.f260789b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    rey0Var = xey0Var.f260792e;
                    bqz0Var = xey0Var.f260791d;
                    bga.m29073P(obj2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(obj2);
            rey0Var = (rey0) obj;
            raa1 raa1Var = this.f272075a.f282152a;
            String str = rey0Var.f198451a;
            String str2 = rey0Var.f198452b;
            xfy0 xfy0Var = rey0Var.f198453c;
            pda1 pda1Var = new pda1(str, str2, xfy0Var.f261121a, xfy0Var.f261122b);
            xey0Var.f260791d = bqz0Var;
            xey0Var.f260792e = rey0Var;
            xey0Var.f260789b = 1;
            if (raa1Var.m75106c(pda1Var, xey0Var) == yukVar) {
            }
            return yukVar;
            ify0Var = new ify0(rey0Var.f198454d);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            ify0Var = hfy0.f90966a;
        }
        xey0Var.f260791d = null;
        xey0Var.f260792e = null;
        xey0Var.f260789b = 2;
    }
}
