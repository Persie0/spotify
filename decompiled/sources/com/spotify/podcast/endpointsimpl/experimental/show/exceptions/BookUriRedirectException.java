package com.spotify.podcast.endpointsimpl.experimental.show.exceptions;

import com.spotify.episodepage.loading.exceptions.CustomErrorException;
import kotlin.Metadata;
import p204p.edb;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcast/endpointsimpl/experimental/show/exceptions/BookUriRedirectException;", "Lcom/spotify/episodepage/loading/exceptions/CustomErrorException;", "src_main_java_com_spotify_podcast_endpointsimpl-endpointsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BookUriRedirectException extends CustomErrorException {

    /* JADX INFO: renamed from: a */
    public final String f6481a;

    /* JADX INFO: renamed from: b */
    public final String f6482b;

    public BookUriRedirectException(String str, String str2) {
        super(edb.m38566o("Show response audiobookRelations metadataextension returned an alternative book uri: ", str2, " for original uri: ", str));
        this.f6481a = str;
        this.f6482b = str2;
    }
}
