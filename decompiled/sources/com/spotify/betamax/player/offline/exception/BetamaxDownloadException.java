package com.spotify.betamax.player.offline.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/betamax/player/offline/exception/BetamaxDownloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_betamax_player-player"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BetamaxDownloadException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f3085a;

    public BetamaxDownloadException(String str, int i, Throwable th) {
        super(str, th);
        this.f3085a = i;
    }
}
