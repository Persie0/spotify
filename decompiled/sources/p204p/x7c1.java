package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class x7c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c8c1 f258872a;

    public x7c1(c8c1 c8c1Var) {
        this.f258872a = c8c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r14.mo30229d(r13, r7) == r11) goto L30;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        w7c1 w7c1Var;
        e8c1 e8c1Var;
        if (ibkVar instanceof w7c1) {
            w7c1Var = (w7c1) ibkVar;
            int i = w7c1Var.f248637b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7c1Var.f248637b = i - Integer.MIN_VALUE;
            } else {
                w7c1Var = new w7c1(this, ibkVar);
            }
        } else {
            w7c1Var = new w7c1(this, ibkVar);
        }
        w7c1 w7c1Var2 = w7c1Var;
        Object obj2 = w7c1Var2.f248636a;
        int i2 = w7c1Var2.f248637b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = w7c1Var2.f248639d;
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
            s7c1 s7c1Var = (s7c1) obj;
            zby zbyVar = this.f258872a.f35184a;
            String str = s7c1Var.f206335c;
            Boolean boolValueOf = Boolean.valueOf(s7c1Var.f206336d);
            w7c1Var2.f248639d = bqz0Var;
            w7c1Var2.f248637b = 1;
            if (zby.m95882j(zbyVar, str, null, boolValueOf, null, null, w7c1Var2, 26) == yukVar) {
            }
            return yukVar;
            e8c1Var = new e8c1(1, true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            e8c1Var = new e8c1(1, false);
        }
        w7c1Var2.f248639d = null;
        w7c1Var2.f248637b = 2;
    }
}
