package p204p;

import com.spotify.connectivity.auth.esperanto.proto.EsSession$APPermanentErrorResult;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class lxz0 implements Function {

    /* JADX INFO: renamed from: a */
    public static final lxz0 f137920a = new lxz0();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        EsSession$APPermanentErrorResult esSession$APPermanentErrorResult = (EsSession$APPermanentErrorResult) obj;
        int i = kxz0.f127609a[esSession$APPermanentErrorResult.m7489n().ordinal()];
        if (i != -1) {
            if (i == 1) {
                return C2320r.f194337a;
            }
            if (i == 2) {
                return C2320r.f194338b;
            }
            if (i == 3) {
                return C2320r.f194339c;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        EsSession$APPermanentErrorResult.GenericError genericErrorM7490o = esSession$APPermanentErrorResult.m7490o();
        return new C2357s(genericErrorM7490o.m7492o(), genericErrorM7490o.m7493p());
    }
}
