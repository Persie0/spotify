package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class xh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gu3 f261408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f261409b;

    public xh0(gu3 gu3Var, om0 om0Var) {
        this.f261408a = gu3Var;
        this.f261409b = om0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qm0 qm0Var;
        ssw0 ssw0Var = (ssw0) obj;
        if (!this.f261408a.m45717c()) {
            int iM38547C = edb.m38547C(ssw0Var.f213723a);
            if (iM38547C == 0) {
                qm0Var = qm0.IMPRESSION;
            } else if (iM38547C == 1) {
                qm0Var = qm0.VIEWABILITY_0;
            } else if (iM38547C == 2) {
                qm0Var = qm0.VIEWABILITY_50;
            } else if (iM38547C == 3) {
                qm0Var = qm0.VIEWABILITY_50_LESS;
            } else {
                if (iM38547C != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                qm0Var = qm0.VIEWABILITY_100;
            }
            qm0 qm0Var2 = qm0Var;
            om0.m67310a(this.f261409b, qm0Var2, ssw0Var.f213724b, null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
