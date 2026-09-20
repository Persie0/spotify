package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.qmg1;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "", "", "userName", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "playbackDeviceInfo", "rawPlaybackControl", "<init>", "(Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "getUserName$annotations", "()V", "b", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "getPlaybackDeviceInfo", "()Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "getPlaybackDeviceInfo$annotations", "c", "getRawPlaybackControl", "getRawPlaybackControl$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ActiveJoinRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String userName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final SessionDeviceInfo playbackDeviceInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String rawPlaybackControl;

    public ActiveJoinRequest(@gk60(name = "username") String str, @gk60(name = "playback_device_info") SessionDeviceInfo sessionDeviceInfo, @gk60(name = "playback_control") String str2) {
        this.userName = str;
        this.playbackDeviceInfo = sessionDeviceInfo;
        this.rawPlaybackControl = str2;
        qmg1.m73285l(str2);
    }

    @gk60(name = "playback_device_info")
    public static /* synthetic */ void getPlaybackDeviceInfo$annotations() {
    }

    @gk60(name = "playback_control")
    public static /* synthetic */ void getRawPlaybackControl$annotations() {
    }

    @gk60(name = "username")
    public static /* synthetic */ void getUserName$annotations() {
    }

    public final ActiveJoinRequest copy(@gk60(name = "username") String userName, @gk60(name = "playback_device_info") SessionDeviceInfo playbackDeviceInfo, @gk60(name = "playback_control") String rawPlaybackControl) {
        return new ActiveJoinRequest(userName, playbackDeviceInfo, rawPlaybackControl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveJoinRequest)) {
            return false;
        }
        ActiveJoinRequest activeJoinRequest = (ActiveJoinRequest) obj;
        return wj50.m88271j(this.userName, activeJoinRequest.userName) && wj50.m88271j(this.playbackDeviceInfo, activeJoinRequest.playbackDeviceInfo) && wj50.m88271j(this.rawPlaybackControl, activeJoinRequest.rawPlaybackControl);
    }

    public final int hashCode() {
        return this.rawPlaybackControl.hashCode() + ((this.playbackDeviceInfo.hashCode() + (this.userName.hashCode() * 31)) * 31);
    }
}
