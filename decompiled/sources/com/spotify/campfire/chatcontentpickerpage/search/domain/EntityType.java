package com.spotify.campfire.chatcontentpickerpage.search.domain;

import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/campfire/chatcontentpickerpage/search/domain/EntityType;", "", "<init>", "(Ljava/lang/String;I)V", "Artist", "Album", "Song", "Playlist", "Podcast", "Episode", "Audiobook", "src_main_java_com_spotify_campfire_chatcontentpickerpage_search-search"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum EntityType {
    Artist,
    Album,
    Song,
    Playlist,
    Podcast,
    Episode,
    Audiobook;

    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    public static lzv getEntries() {
        return $ENTRIES;
    }
}
