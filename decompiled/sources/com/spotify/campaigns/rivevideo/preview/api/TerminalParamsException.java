package com.spotify.campaigns.rivevideo.preview.api;

import kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/campaigns/rivevideo/preview/api/TerminalParamsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_campaigns_rivevideo_preview_api-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TerminalParamsException extends Exception {
    public TerminalParamsException(String str, HttpException httpException) {
        super(str, httpException);
    }
}
