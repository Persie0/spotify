package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class wmi implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ami f252900a;

    public wmi(ami amiVar) {
        this.f252900a = amiVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bma0 bma0Var;
        zji zjiVar = (zji) obj;
        String str = zjiVar.f283446a;
        String str2 = zjiVar.f283447b;
        p7x0 p7x0Var = this.f252900a.f17146b;
        zla0 zla0Var = new zla0(str2);
        if (str == null) {
            bma0Var = null;
        } else {
            if (wl51.m88460J0(str)) {
                str = null;
            }
            if (str != null) {
                bma0Var = new bma0(str, true);
            } else {
                bma0Var = null;
            }
        }
        p7x0Var.mo25060a(new hcm(Collections.singletonList(new x151("confirm-generation-location", zla0Var, bma0Var, null, 8))), null);
        return w2a1.f247311a;
    }
}
