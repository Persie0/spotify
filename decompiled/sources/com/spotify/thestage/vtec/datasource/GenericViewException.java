package com.spotify.thestage.vtec.datasource;

import kotlin.Metadata;
import p204p.f6d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/thestage/vtec/datasource/GenericViewException;", "Lp/f6d1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class GenericViewException extends Exception implements f6d1 {

    /* JADX INFO: renamed from: a */
    public final String f6697a;

    public GenericViewException(String str) {
        super(str);
        this.f6697a = str;
    }

    @Override // java.lang.Throwable, p204p.f6d1
    public final String getMessage() {
        return this.f6697a;
    }
}
