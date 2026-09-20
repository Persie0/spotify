package com.spotify.esperanto.esperanto;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/esperanto/esperanto/Transport;", "", "callStream", "Lio/reactivex/rxjava3/core/Observable;", "", "service", "", "method", "payload", "callSingle", "Lio/reactivex/rxjava3/core/Single;", "callSync", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Transport {
    Single<byte[]> callSingle(String service, String method, byte[] payload);

    Observable<byte[]> callStream(String service, String method, byte[] payload);

    byte[] callSync(String service, String method, byte[] payload);
}
