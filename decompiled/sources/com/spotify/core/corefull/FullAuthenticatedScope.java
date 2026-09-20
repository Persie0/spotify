package com.spotify.core.corefull;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory;
import com.spotify.esperanto.esperanto.Transport;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/core/corefull/FullAuthenticatedScope;", "", "contentDeliveryIOTransport", "Lcom/spotify/esperanto/esperanto/Transport;", "tokenExchangeTransport", "mediaProcessorFactory", "Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessorFactory;", "src_main_java_com_spotify_core_corefull-corefull"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface FullAuthenticatedScope {
    Transport contentDeliveryIOTransport();

    NativeMediaProcessorFactory mediaProcessorFactory();

    Transport tokenExchangeTransport();
}
