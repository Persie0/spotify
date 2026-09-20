package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class usd implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w6j0 f233587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ er70 f233588b;

    public usd(w6j0 w6j0Var, er70 er70Var) {
        this.f233587a = w6j0Var;
        this.f233588b = er70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        tsd tsdVar;
        vv91 vv91Var;
        if (ibkVar instanceof tsd) {
            tsdVar = (tsd) ibkVar;
            int i = tsdVar.f223286b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsdVar.f223286b = i - Integer.MIN_VALUE;
            } else {
                tsdVar = new tsd(this, ibkVar);
            }
        } else {
            tsdVar = new tsd(this, ibkVar);
        }
        Object obj2 = tsdVar.f223285a;
        int i2 = tsdVar.f223286b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            m2j0 m2j0Var = new m2j0(null);
            w6j0 w6j0Var = this.f233587a;
            w6j0Var.m87294e(m2j0Var);
            w6j0Var.m87295f(m2j0Var);
            String str = ((osd) obj).f168801a;
            fnm0 fnm0Var = str != null ? new fnm0(str) : null;
            if (fnm0Var != null && (vv91Var = (vv91) this.f233588b.get()) != null) {
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                ((sfa0) vv91Var).m78001I(xgg1.m90633J0(), fnm0Var);
            }
            tsdVar.f223286b = 1;
            Object objMo30229d = bqz0Var.mo30229d(ysd.f275745a, tsdVar);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
