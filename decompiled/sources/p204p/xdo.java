package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class xdo implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aeo f260512a;

    public xdo(aeo aeoVar) {
        this.f260512a = aeoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wdo wdoVar;
        if (ibkVar instanceof wdo) {
            wdoVar = (wdo) ibkVar;
            int i = wdoVar.f250316b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wdoVar.f250316b = i - Integer.MIN_VALUE;
            } else {
                wdoVar = new wdo(this, ibkVar);
            }
        } else {
            wdoVar = new wdo(this, ibkVar);
        }
        Object objM77871v = wdoVar.f250315a;
        int i2 = wdoVar.f250316b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = wdoVar.f250318d;
                bga.m29073P(objM77871v);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM77871v);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM77871v);
        sdo sdoVar = this.f260512a.f14925a;
        ArrayList arrayList = ((pdo) obj).f176528e;
        wdoVar.f250318d = bqz0Var;
        wdoVar.f250316b = 1;
        objM77871v = sdoVar.m77871v(arrayList, wdoVar);
        if (objM77871v != yukVar) {
        }
        return yukVar;
        wdoVar.f250318d = null;
        wdoVar.f250316b = 2;
    }
}
