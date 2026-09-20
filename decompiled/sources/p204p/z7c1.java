package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class z7c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c8c1 f280170a;

    public z7c1(c8c1 c8c1Var) {
        this.f280170a = c8c1Var;
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
        y7c1 y7c1Var;
        e8c1 e8c1Var;
        if (ibkVar instanceof y7c1) {
            y7c1Var = (y7c1) ibkVar;
            int i = y7c1Var.f270027b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y7c1Var.f270027b = i - Integer.MIN_VALUE;
            } else {
                y7c1Var = new y7c1(this, ibkVar);
            }
        } else {
            y7c1Var = new y7c1(this, ibkVar);
        }
        y7c1 y7c1Var2 = y7c1Var;
        Object obj2 = y7c1Var2.f270026a;
        int i2 = y7c1Var2.f270027b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = y7c1Var2.f270029d;
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
            r7c1 r7c1Var = (r7c1) obj;
            zby zbyVar = this.f280170a.f35184a;
            String str = r7c1Var.f196495c;
            Boolean boolValueOf = Boolean.valueOf(r7c1Var.f196496d);
            y7c1Var2.f270029d = bqz0Var;
            y7c1Var2.f270027b = 1;
            if (zby.m95882j(zbyVar, str, null, null, boolValueOf, null, y7c1Var2, 22) == yukVar) {
            }
            return yukVar;
            e8c1Var = new e8c1(2, true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            e8c1Var = new e8c1(2, false);
        }
        y7c1Var2.f270029d = null;
        y7c1Var2.f270027b = 2;
    }
}
