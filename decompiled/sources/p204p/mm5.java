package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class mm5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qm5 f145052a;

    public mm5(qm5 qm5Var) {
        this.f145052a = qm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r4.mo30229d(r1, r3) == r8) goto L29;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lm5 lm5Var;
        bqz0 bqz0Var2;
        Object rm5Var;
        xk5 xk5Var = this.f145052a.f190136k;
        if (ibkVar instanceof lm5) {
            lm5Var = (lm5) ibkVar;
            int i = lm5Var.f134788b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lm5Var.f134788b = i - Integer.MIN_VALUE;
            } else {
                lm5Var = new lm5(this, ibkVar);
            }
        } else {
            lm5Var = new lm5(this, ibkVar);
        }
        Object objM67258c = lm5Var.f134787a;
        int i2 = lm5Var.f134788b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var2 = lm5Var.f134790d;
                bga.m29073P(objM67258c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67258c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM67258c);
        el5 el5Var = (el5) obj;
        lk5 lk5VarMo27644a = xk5Var.mo27644a();
        okp0 okp0Var = lk5VarMo27644a instanceof okp0 ? (okp0) lk5VarMo27644a : null;
        if (okp0Var == null) {
            rm5Var = new rm5(Collections.singletonList(new ik5("This content type does not support template generation")));
            bqz0Var2 = bqz0Var;
            lm5Var.f134790d = null;
            lm5Var.f134788b = 2;
        } else {
            y210 y210VarMo27654m = xk5Var.mo27654m(new a310("", null, el5Var.f60586a, null, null, null, null, el5Var.f60587b, null, null, 890));
            lm5Var.f134790d = bqz0Var;
            lm5Var.f134788b = 1;
            objM67258c = okp0Var.m67258c(y210VarMo27654m, lm5Var);
            if (objM67258c != yukVar) {
                bqz0Var2 = bqz0Var;
            }
        }
        return yukVar;
        rm5Var = nkf1.m64688d((qk5) objM67258c, xk5Var, false);
        lm5Var.f134790d = null;
        lm5Var.f134788b = 2;
    }
}
