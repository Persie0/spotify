package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class oxc implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yxc f170958a;

    public oxc(yxc yxcVar) {
        this.f170958a = yxcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        nxc nxcVar;
        if (ibkVar instanceof nxc) {
            nxcVar = (nxc) ibkVar;
            int i = nxcVar.f159436b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxcVar.f159436b = i - Integer.MIN_VALUE;
            } else {
                nxcVar = new nxc(this, ibkVar);
            }
        } else {
            nxcVar = new nxc(this, ibkVar);
        }
        Object obj2 = nxcVar.f159435a;
        int i2 = nxcVar.f159436b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ixc ixcVar = (ixc) obj;
                yxc yxcVar = this.f170958a;
                aj2 aj2Var = yxcVar.f277211a;
                String str = ixcVar.f106652a;
                j741 j741Var = ixcVar.f106653b;
                if (j741Var == null) {
                    j741Var = new j741(((wl91) yxcVar.f277208X).m88506a(), 2);
                }
                qvw0 qvw0Var = new qvw0((nk2) null, (String) null, j741Var, (String) null, (String) null, 59);
                nxcVar.f159436b = 1;
                Object objM33056M = ((ck2) aj2Var).m33056M(str, qvw0Var, nxcVar);
                yuk yukVar = yuk.f276404a;
                if (objM33056M == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to send request", e2);
        }
        return w2a1.f247311a;
    }
}
