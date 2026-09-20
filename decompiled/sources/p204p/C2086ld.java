package p204p;

import com.spotify.authentication.login5esperanto.EsAccessTokenClient$ErrorResponse;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: renamed from: p.ld */
/* JADX INFO: loaded from: classes.dex */
public final class C2086ld implements Function {

    /* JADX INFO: renamed from: a */
    public static final C2086ld f132014a = new C2086ld();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        EsAccessTokenClient$ErrorResponse esAccessTokenClient$ErrorResponse = (EsAccessTokenClient$ErrorResponse) obj;
        esAccessTokenClient$ErrorResponse.toString();
        if (esAccessTokenClient$ErrorResponse.m3488s()) {
            return new nh7(Integer.valueOf(esAccessTokenClient$ErrorResponse.m3485p().m3491o()), esAccessTokenClient$ErrorResponse.m3485p().m3492p());
        }
        return esAccessTokenClient$ErrorResponse.m3489t() ? new nh7(Integer.valueOf(esAccessTokenClient$ErrorResponse.m3487r()), esAccessTokenClient$ErrorResponse.m3486q().name()) : new nh7(null, "Received error without specific or generic error");
    }
}
