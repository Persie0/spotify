package com.spotify.cosmos.parsers;

import com.spotify.cosmos.cosmos.Response;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/parsers/ResponseParser;", "T", "", "parseResponse", "response", "Lcom/spotify/cosmos/cosmos/Response;", "(Lcom/spotify/cosmos/cosmos/Response;)Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_parsers-parsers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ResponseParser<T> {
    T parseResponse(Response response);
}
