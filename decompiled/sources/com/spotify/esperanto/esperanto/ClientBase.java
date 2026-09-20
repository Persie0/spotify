package com.spotify.esperanto.esperanto;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p204p.pre0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/esperanto/esperanto/ClientBase;", "", "Lcom/spotify/esperanto/esperanto/Transport;", "transport", "<init>", "(Lcom/spotify/esperanto/esperanto/Transport;)V", "", "service", "method", "Lp/pre0;", "payload", "Lio/reactivex/rxjava3/core/Observable;", "", "callStream", "(Ljava/lang/String;Ljava/lang/String;Lp/pre0;)Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/core/Single;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;Lp/pre0;)Lio/reactivex/rxjava3/core/Single;", "callSync", "(Ljava/lang/String;Ljava/lang/String;Lp/pre0;)[B", "Lcom/spotify/esperanto/esperanto/Transport;", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class ClientBase {
    private final Transport transport;

    public ClientBase(Transport transport) {
        this.transport = transport;
    }

    public final Single<byte[]> callSingle(String service, String method, pre0 payload) {
        return this.transport.callSingle(service, method, payload.toByteArray());
    }

    public final Observable<byte[]> callStream(String service, String method, pre0 payload) {
        return this.transport.callStream(service, method, payload.toByteArray());
    }

    public final byte[] callSync(String service, String method, pre0 payload) {
        return this.transport.callSync(service, method, payload.toByteArray());
    }
}
