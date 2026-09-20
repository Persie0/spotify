package com.spotify.betamax.player.exception;

import java.io.IOException;
import kotlin.Metadata;
import p204p.ahw;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/betamax/player/exception/BetamaxException;", "Ljava/io/IOException;", "src_main_java_com_spotify_betamax_player-player"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class BetamaxException extends IOException {

    /* JADX INFO: renamed from: a */
    public final ahw f3084a;

    public BetamaxException(String str, ahw ahwVar, Throwable th) {
        super(str, th);
        this.f3084a = ahwVar;
    }
}
