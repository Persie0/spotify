package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001a\u001a\u0004\b'\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u001a\u001a\u0004\b1\u00102R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u0010\u001a\u001a\u0004\b5\u00102R\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00100\u0012\u0004\b9\u0010\u001a\u001a\u0004\b8\u00102R\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u00100\u0012\u0004\b<\u0010\u001a\u001a\u0004\b;\u00102R\"\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010&\u0012\u0004\b>\u0010\u001a\u001a\u0004\b\u0011\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010&\u0012\u0004\b@\u0010\u001a\u001a\u0004\b\u0012\u0010(¨\u0006A"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Track", "Lcom/spotify/interapp/model/a;", "Lcom/spotify/interapp/model/AppProtocol$Artist;", "artist", "", "artists", "Lcom/spotify/interapp/model/AppProtocol$Album;", "album", "", "saved", "", "duration", "", "name", "uri", "uid", "imageUri", "isEpisode", "isPodcast", "<init>", "(Lcom/spotify/interapp/model/AppProtocol$Artist;Ljava/util/List;Lcom/spotify/interapp/model/AppProtocol$Album;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "c", "Lcom/spotify/interapp/model/AppProtocol$Artist;", "getArtist", "()Lcom/spotify/interapp/model/AppProtocol$Artist;", "getArtist$annotations", "()V", "d", "Ljava/util/List;", "getArtists", "()Ljava/util/List;", "getArtists$annotations", "e", "Lcom/spotify/interapp/model/AppProtocol$Album;", "getAlbum", "()Lcom/spotify/interapp/model/AppProtocol$Album;", "getAlbum$annotations", "f", "Ljava/lang/Boolean;", "getSaved", "()Ljava/lang/Boolean;", "getSaved$annotations", "g", "Ljava/lang/Long;", "getDuration", "()Ljava/lang/Long;", "getDuration$annotations", "h", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "i", "getUri", "getUri$annotations", "j", "getUid", "getUid$annotations", "k", "getImageUri", "getImageUri$annotations", "l", "isEpisode$annotations", "m", "isPodcast$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$Track extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AppProtocol$Artist artist;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List artists;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final AppProtocol$Album album;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Boolean saved;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Long duration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String uid;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final String imageUri;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final Boolean isEpisode;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Boolean isPodcast;

    public AppProtocol$Track(@gk60(name = "artist") AppProtocol$Artist appProtocol$Artist, @gk60(name = "artists") List<AppProtocol$Artist> list, @gk60(name = "album") AppProtocol$Album appProtocol$Album, @gk60(name = "saved") Boolean bool, @gk60(name = "duration_ms") Long l, @gk60(name = "name") String str, @gk60(name = "uri") String str2, @gk60(name = "uid") String str3, @gk60(name = "image_id") String str4, @gk60(name = "is_episode") Boolean bool2, @gk60(name = "is_podcast") Boolean bool3) {
        this.artist = appProtocol$Artist;
        this.artists = list;
        this.album = appProtocol$Album;
        this.saved = bool;
        this.duration = l;
        this.name = str;
        this.uri = str2;
        this.uid = str3;
        this.imageUri = str4;
        this.isEpisode = bool2;
        this.isPodcast = bool3;
    }

    @gk60(name = "album")
    public static /* synthetic */ void getAlbum$annotations() {
    }

    @gk60(name = "artist")
    public static /* synthetic */ void getArtist$annotations() {
    }

    @gk60(name = "artists")
    public static /* synthetic */ void getArtists$annotations() {
    }

    @gk60(name = "duration_ms")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @gk60(name = "image_id")
    public static /* synthetic */ void getImageUri$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = "saved")
    public static /* synthetic */ void getSaved$annotations() {
    }

    @gk60(name = "uid")
    public static /* synthetic */ void getUid$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    @gk60(name = "is_episode")
    public static /* synthetic */ void isEpisode$annotations() {
    }

    @gk60(name = "is_podcast")
    public static /* synthetic */ void isPodcast$annotations() {
    }
}
