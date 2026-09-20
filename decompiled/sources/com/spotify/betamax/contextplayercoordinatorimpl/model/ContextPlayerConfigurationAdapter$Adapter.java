package com.spotify.betamax.contextplayercoordinatorimpl.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0005\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m24212d2 = {"com/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerConfigurationAdapter$Adapter", "", "", "languageTag", "", "isClosedCaption", "", "playbackSpeed", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)V", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerConfigurationAdapter$Adapter;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)Lcom/spotify/betamax/contextplayercoordinatorimpl/model/ContextPlayerConfigurationAdapter$Adapter;", "a", "Ljava/lang/String;", "getLanguageTag", "()Ljava/lang/String;", "getLanguageTag$annotations", "()V", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isClosedCaption$annotations", "c", "Ljava/lang/Float;", "getPlaybackSpeed", "()Ljava/lang/Float;", "getPlaybackSpeed$annotations", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ContextPlayerConfigurationAdapter$Adapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String languageTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Boolean isClosedCaption;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Float playbackSpeed;

    public ContextPlayerConfigurationAdapter$Adapter(@gk60(name = "video.subtitles") String str, @gk60(name = "video.subtitles_cc") Boolean bool, @gk60(name = "audio.episode.speed") Float f) {
        this.languageTag = str;
        this.isClosedCaption = bool;
        this.playbackSpeed = f;
    }

    @gk60(name = "video.subtitles")
    public static /* synthetic */ void getLanguageTag$annotations() {
    }

    @gk60(name = "audio.episode.speed")
    public static /* synthetic */ void getPlaybackSpeed$annotations() {
    }

    @gk60(name = "video.subtitles_cc")
    public static /* synthetic */ void isClosedCaption$annotations() {
    }

    public final ContextPlayerConfigurationAdapter$Adapter copy(@gk60(name = "video.subtitles") String languageTag, @gk60(name = "video.subtitles_cc") Boolean isClosedCaption, @gk60(name = "audio.episode.speed") Float playbackSpeed) {
        return new ContextPlayerConfigurationAdapter$Adapter(languageTag, isClosedCaption, playbackSpeed);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextPlayerConfigurationAdapter$Adapter)) {
            return false;
        }
        ContextPlayerConfigurationAdapter$Adapter contextPlayerConfigurationAdapter$Adapter = (ContextPlayerConfigurationAdapter$Adapter) obj;
        return wj50.m88271j(this.languageTag, contextPlayerConfigurationAdapter$Adapter.languageTag) && wj50.m88271j(this.isClosedCaption, contextPlayerConfigurationAdapter$Adapter.isClosedCaption) && wj50.m88271j(this.playbackSpeed, contextPlayerConfigurationAdapter$Adapter.playbackSpeed);
    }

    public final int hashCode() {
        String str = this.languageTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isClosedCaption;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.playbackSpeed;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }
}
