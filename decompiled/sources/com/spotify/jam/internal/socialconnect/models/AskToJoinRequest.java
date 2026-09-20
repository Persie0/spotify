package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AskToJoinRequest;", "", "", "joinToken", "joinType", "rawPlaybackControl", "joinAttemptId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/AskToJoinRequest;", "a", "Ljava/lang/String;", "getJoinToken", "()Ljava/lang/String;", "getJoinToken$annotations", "()V", "b", "getJoinType", "getJoinType$annotations", "c", "getRawPlaybackControl", "getRawPlaybackControl$annotations", "d", "getJoinAttemptId", "getJoinAttemptId$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AskToJoinRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String joinToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String joinType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String rawPlaybackControl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String joinAttemptId;

    public AskToJoinRequest(@gk60(name = "join_token") String str, @gk60(name = "join_type") String str2, @gk60(name = "playback_control") String str3, @gk60(name = "join_attempt_id") String str4) {
        this.joinToken = str;
        this.joinType = str2;
        this.rawPlaybackControl = str3;
        this.joinAttemptId = str4;
    }

    @gk60(name = "join_attempt_id")
    public static /* synthetic */ void getJoinAttemptId$annotations() {
    }

    @gk60(name = "join_token")
    public static /* synthetic */ void getJoinToken$annotations() {
    }

    @gk60(name = "join_type")
    public static /* synthetic */ void getJoinType$annotations() {
    }

    @gk60(name = "playback_control")
    public static /* synthetic */ void getRawPlaybackControl$annotations() {
    }

    public final AskToJoinRequest copy(@gk60(name = "join_token") String joinToken, @gk60(name = "join_type") String joinType, @gk60(name = "playback_control") String rawPlaybackControl, @gk60(name = "join_attempt_id") String joinAttemptId) {
        return new AskToJoinRequest(joinToken, joinType, rawPlaybackControl, joinAttemptId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AskToJoinRequest)) {
            return false;
        }
        AskToJoinRequest askToJoinRequest = (AskToJoinRequest) obj;
        return wj50.m88271j(this.joinToken, askToJoinRequest.joinToken) && wj50.m88271j(this.joinType, askToJoinRequest.joinType) && wj50.m88271j(this.rawPlaybackControl, askToJoinRequest.rawPlaybackControl) && wj50.m88271j(this.joinAttemptId, askToJoinRequest.joinAttemptId);
    }

    public final int hashCode() {
        return this.joinAttemptId.hashCode() + s571.m77243b(s571.m77243b(this.joinToken.hashCode() * 31, 31, this.joinType), 31, this.rawPlaybackControl);
    }
}
