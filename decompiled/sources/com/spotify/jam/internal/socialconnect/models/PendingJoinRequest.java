package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/PendingJoinRequest;", "", "", "requestUserName", "rawPlaybackControl", "joinType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/PendingJoinRequest;", "a", "Ljava/lang/String;", "getRequestUserName", "()Ljava/lang/String;", "getRequestUserName$annotations", "()V", "b", "getRawPlaybackControl", "getRawPlaybackControl$annotations", "c", "getJoinType", "getJoinType$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class PendingJoinRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String requestUserName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String rawPlaybackControl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String joinType;

    public PendingJoinRequest(@gk60(name = "requester_username") String str, @gk60(name = "playback_control") String str2, @gk60(name = "join_type") String str3) {
        this.requestUserName = str;
        this.rawPlaybackControl = str2;
        this.joinType = str3;
    }

    @gk60(name = "join_type")
    public static /* synthetic */ void getJoinType$annotations() {
    }

    @gk60(name = "playback_control")
    public static /* synthetic */ void getRawPlaybackControl$annotations() {
    }

    @gk60(name = "requester_username")
    public static /* synthetic */ void getRequestUserName$annotations() {
    }

    public final PendingJoinRequest copy(@gk60(name = "requester_username") String requestUserName, @gk60(name = "playback_control") String rawPlaybackControl, @gk60(name = "join_type") String joinType) {
        return new PendingJoinRequest(requestUserName, rawPlaybackControl, joinType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingJoinRequest)) {
            return false;
        }
        PendingJoinRequest pendingJoinRequest = (PendingJoinRequest) obj;
        return wj50.m88271j(this.requestUserName, pendingJoinRequest.requestUserName) && wj50.m88271j(this.rawPlaybackControl, pendingJoinRequest.rawPlaybackControl) && wj50.m88271j(this.joinType, pendingJoinRequest.joinType);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.requestUserName.hashCode() * 31, 31, this.rawPlaybackControl);
        String str = this.joinType;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ PendingJoinRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
