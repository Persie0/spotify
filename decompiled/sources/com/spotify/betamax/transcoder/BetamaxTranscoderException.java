package com.spotify.betamax.transcoder;

import com.spotify.betamax.player.exception.BetamaxException;
import kotlin.Metadata;
import p204p.ahw;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/betamax/transcoder/BetamaxTranscoderException;", "Lcom/spotify/betamax/player/exception/BetamaxException;", "src_main_java_com_spotify_betamax_transcoder-transcoder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BetamaxTranscoderException extends BetamaxException {
    public BetamaxTranscoderException(String str, Throwable th, ahw ahwVar, int i) {
        super(str, (i & 4) != 0 ? ahw.ERROR_UNKNOWN : ahwVar, (i & 2) != 0 ? null : th);
    }
}
