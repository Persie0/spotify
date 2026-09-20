package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class km5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qm5 f124054a;

    public km5(qm5 qm5Var) {
        this.f124054a = qm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r10 == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r9.mo30229d(r8, r1) == r6) goto L36;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        jm5 jm5Var;
        Object pn5Var;
        xk5 xk5Var = this.f124054a.f190136k;
        if (ibkVar instanceof jm5) {
            jm5Var = (jm5) ibkVar;
            int i = jm5Var.f113762b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm5Var.f113762b = i - Integer.MIN_VALUE;
            } else {
                jm5Var = new jm5(this, ibkVar);
            }
        } else {
            jm5Var = new jm5(this, ibkVar);
        }
        Object objM83925c = jm5Var.f113761a;
        int i2 = jm5Var.f113762b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = jm5Var.f113764d;
                bga.m29073P(objM83925c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83925c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM83925c);
        ol5 ol5Var = (ol5) obj;
        lk5 lk5VarMo27644a = xk5Var.mo27644a();
        ut9 ut9Var = lk5VarMo27644a instanceof ut9 ? (ut9) lk5VarMo27644a : null;
        if (ut9Var == null) {
            pn5Var = new pn5(Collections.singletonList(new ik5("This content type does not support triggering generation")));
            jm5Var.f113764d = null;
            jm5Var.f113762b = 2;
        } else {
            ik91 ik91Var = new ik91(ol5Var.f166761a);
            jm5Var.f113764d = bqz0Var;
            jm5Var.f113762b = 1;
            objM83925c = ut9Var.m83925c(ik91Var, jm5Var);
        }
        return yukVar;
        hk91 hk91Var = (hk91) objM83925c;
        if (hk91Var instanceof gk91) {
            pn5Var = new qn5(((gk91) hk91Var).f80756a);
        } else if (wj50.m88271j(hk91Var, ek91.f60416a)) {
            pn5Var = on5.f167159a;
        } else {
            if (!(hk91Var instanceof fk91)) {
                throw new NoWhenBranchMatchedException();
            }
            pn5Var = new pn5(xk5Var.mo27648e(((fk91) hk91Var).f70511a));
        }
        jm5Var.f113764d = null;
        jm5Var.f113762b = 2;
    }
}
