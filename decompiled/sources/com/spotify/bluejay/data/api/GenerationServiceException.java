package com.spotify.bluejay.data.api;

import kotlin.Metadata;
import p204p.edb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/bluejay/data/api/GenerationServiceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_bluejay_data_api-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class GenerationServiceException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f3103a;

    /* JADX INFO: renamed from: b */
    public final int f3104b;

    public GenerationServiceException(String str, int i, int i2) {
        super(edb.m38563l("Generation failed (", i, ")"));
        this.f3103a = str;
        this.f3104b = i2;
    }
}
