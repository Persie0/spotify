package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class bhp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yz80 f27223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f27224b;

    public bhp0(yz80 yz80Var, String str) {
        this.f27223a = yz80Var;
        this.f27224b = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r12.mo30229d(r13, r7) == r9) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ahp0 ahp0Var;
        Object yhp0Var;
        lhp0 lhp0Var;
        if (ibkVar instanceof ahp0) {
            ahp0Var = (ahp0) ibkVar;
            int i = ahp0Var.f15748b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahp0Var.f15748b = i - Integer.MIN_VALUE;
            } else {
                ahp0Var = new ahp0(this, ibkVar);
            }
        } else {
            ahp0Var = new ahp0(this, ibkVar);
        }
        ahp0 ahp0Var2 = ahp0Var;
        Object objM63309f = ahp0Var2.f15747a;
        int i2 = ahp0Var2.f15748b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    lhp0Var = ahp0Var2.f15751e;
                    bqz0Var = ahp0Var2.f15750d;
                    bga.m29073P(objM63309f);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM63309f);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM63309f);
            lhp0Var = (lhp0) obj;
            yz80 yz80Var = this.f27223a;
            String str = lhp0Var.f133617b;
            List listSingletonList = Collections.singletonList(lhp0Var.f133616a);
            String str2 = this.f27224b;
            qz80 qz80Var = lhp0Var.f133619d;
            ahp0Var2.f15750d = bqz0Var;
            ahp0Var2.f15751e = lhp0Var;
            ahp0Var2.f15748b = 1;
            objM63309f = ((n090) yz80Var).m63309f(str, listSingletonList, str2, "", qz80Var, ahp0Var2);
            if (objM63309f == yukVar) {
            }
            return yukVar;
            p2x0 p2x0Var = (p2x0) objM63309f;
            if (p2x0Var instanceof m2x0) {
                yhp0Var = new zhp0(lhp0Var.f133618c);
            } else {
                if (!(p2x0Var instanceof k2x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                yhp0Var = new yhp0(lhp0Var.f133618c);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            yhp0Var = new yhp0(obj.f133618c);
        }
        ahp0Var2.f15750d = null;
        ahp0Var2.f15751e = null;
        ahp0Var2.f15748b = 2;
    }
}
