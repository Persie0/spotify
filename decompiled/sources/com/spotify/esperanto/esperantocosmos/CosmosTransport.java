package com.spotify.esperanto.esperantocosmos;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p204p.edb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/esperanto/esperantocosmos/CosmosTransport;", "Lcom/spotify/esperanto/esperanto/Transport;", "mRouter", "Lcom/spotify/esperanto/esperantocosmos/EsperantoRxRouter;", "<init>", "(Lcom/spotify/esperanto/esperantocosmos/EsperantoRxRouter;)V", "CHARSET_UTF8", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "getCHARSET_UTF8$annotations", "()V", "call", "Lio/reactivex/rxjava3/core/Observable;", "", "service", "", "method", "payload", "cosmosMethod", "callStream", "callSingle", "Lio/reactivex/rxjava3/core/Single;", "callSync", "src_main_java_com_spotify_esperanto_esperantocosmos-esperantocosmos_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosTransport implements Transport {
    private final Charset CHARSET_UTF8 = Charset.forName("UTF8");
    private final EsperantoRxRouter mRouter;

    public CosmosTransport(EsperantoRxRouter esperantoRxRouter) {
        this.mRouter = esperantoRxRouter;
    }

    private final Observable<byte[]> call(String service, String method, byte[] payload, String cosmosMethod) {
        String strM38566o = edb.m38566o("sp://esperanto/", service, "/", method);
        Request request = new Request(cosmosMethod, strM38566o, payload);
        final CosmosTransport$call$mapFunc$1 cosmosTransport$call$mapFunc$1 = new CosmosTransport$call$mapFunc$1(this, strM38566o);
        return this.mRouter.resolve(request).map(new Function() { // from class: com.spotify.esperanto.esperantocosmos.CosmosTransport$sam$io_reactivex_rxjava3_functions_Function$0
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply */
            public final /* synthetic */ Object mo98394apply(Object obj) {
                return cosmosTransport$call$mapFunc$1.invoke(obj);
            }
        });
    }

    private static /* synthetic */ void getCHARSET_UTF8$annotations() {
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public Single<byte[]> callSingle(String service, String method, byte[] payload) {
        return call(service, method, payload, Request.POST).firstOrError();
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public Observable<byte[]> callStream(String service, String method, byte[] payload) {
        return call(service, method, payload, Request.SUB);
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public byte[] callSync(String service, String method, byte[] payload) {
        return new byte[0];
    }
}
