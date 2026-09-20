package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class xer0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yer0 f260763a;

    public xer0(yer0 yer0Var) {
        this.f260763a = yer0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L31;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wer0 wer0Var;
        cfr0 cfr0Var;
        Object ffr0Var;
        if (ibkVar instanceof wer0) {
            wer0Var = (wer0) ibkVar;
            int i = wer0Var.f250609b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wer0Var.f250609b = i - Integer.MIN_VALUE;
            } else {
                wer0Var = new wer0(this, ibkVar);
            }
        } else {
            wer0Var = new wer0(this, ibkVar);
        }
        Object objM63320q = wer0Var.f250608a;
        int i2 = wer0Var.f250609b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                cfr0Var = wer0Var.f250612e;
                bqz0Var = wer0Var.f250611d;
                bga.m29073P(objM63320q);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63320q);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM63320q);
        cfr0Var = (cfr0) obj;
        lnn0 lnn0Var = cfr0Var.f37426b ? lnn0.f135185d : lnn0.f135184c;
        yz80 yz80Var = this.f260763a.f272039c;
        List listSingletonList = Collections.singletonList(cfr0Var.f37425a);
        wer0Var.f250611d = bqz0Var;
        wer0Var.f250612e = cfr0Var;
        wer0Var.f250609b = 1;
        objM63320q = ((n090) yz80Var).m63320q(listSingletonList, lnn0Var, 10000, wer0Var);
        if (objM63320q != yukVar) {
        }
        return yukVar;
        p2x0 p2x0Var = (p2x0) objM63320q;
        if (p2x0Var instanceof m2x0) {
            ffr0Var = new ffr0(cfr0Var.f37426b);
        } else {
            if (!(p2x0Var instanceof k2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            ffr0Var = gfr0.f79447a;
        }
        wer0Var.f250611d = null;
        wer0Var.f250612e = null;
        wer0Var.f250609b = 2;
    }
}
