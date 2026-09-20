package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ssd implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w6j0 f213572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ er70 f213573b;

    public ssd(w6j0 w6j0Var, er70 er70Var) {
        this.f213572a = w6j0Var;
        this.f213573b = er70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rsd rsdVar;
        vv91 vv91Var;
        if (ibkVar instanceof rsd) {
            rsdVar = (rsd) ibkVar;
            int i = rsdVar.f202290b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsdVar.f202290b = i - Integer.MIN_VALUE;
            } else {
                rsdVar = new rsd(this, ibkVar);
            }
        } else {
            rsdVar = new rsd(this, ibkVar);
        }
        Object obj2 = rsdVar.f202289a;
        int i2 = rsdVar.f202290b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            psd psdVar = (psd) obj;
            Set set = dd41.f47702f;
            String strM61969e = mjd.m61969e(r46.m74726U(r46.m74726U(psdVar.f180816a).m35712j()));
            d850 d850Var = psdVar.f180818c;
            if (d850Var != null) {
                z2j0 z2j0Var = new z2j0(strM61969e, d850Var.f46380a);
                w6j0 w6j0Var = this.f213572a;
                w6j0Var.m87294e(z2j0Var);
                w6j0Var.m87295f(z2j0Var);
            }
            fnm0 fnm0Var = strM61969e != null ? new fnm0(strM61969e) : null;
            if (fnm0Var != null && (vv91Var = (vv91) this.f213573b.get()) != null) {
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                ((sfa0) vv91Var).m78001I(xgg1.m90633J0(), fnm0Var);
            }
            Object zsdVar = new zsd(psdVar.f180817b);
            rsdVar.f202290b = 1;
            Object objMo30229d = bqz0Var.mo30229d(zsdVar, rsdVar);
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
