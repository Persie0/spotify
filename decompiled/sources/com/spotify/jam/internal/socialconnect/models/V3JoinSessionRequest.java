package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJN\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0010R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u0012\u0004\b!\u0010\u0012\u001a\u0004\b \u0010\u0010¨\u0006\""}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/V3JoinSessionRequest;", "", "", "joinToken", "joinType", "playbackControl", "localDeviceId", "joinAttemptId", "permissionMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/V3JoinSessionRequest;", "a", "Ljava/lang/String;", "getJoinToken", "()Ljava/lang/String;", "getJoinToken$annotations", "()V", "b", "getJoinType", "getJoinType$annotations", "c", "getPlaybackControl", "getPlaybackControl$annotations", "d", "getLocalDeviceId", "getLocalDeviceId$annotations", "e", "getJoinAttemptId", "getJoinAttemptId$annotations", "f", "getPermissionMode", "getPermissionMode$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class V3JoinSessionRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String joinToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String joinType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String playbackControl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String localDeviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String joinAttemptId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String permissionMode;

    public V3JoinSessionRequest(@gk60(name = "join_token") String str, @gk60(name = "join_type") String str2, @gk60(name = "playback_control") String str3, @gk60(name = "local_device_id") String str4, @gk60(name = "join_attempt_id") String str5, @gk60(name = "permission_mode") String str6) {
        this.joinToken = str;
        this.joinType = str2;
        this.playbackControl = str3;
        this.localDeviceId = str4;
        this.joinAttemptId = str5;
        this.permissionMode = str6;
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

    @gk60(name = "local_device_id")
    public static /* synthetic */ void getLocalDeviceId$annotations() {
    }

    @gk60(name = "permission_mode")
    public static /* synthetic */ void getPermissionMode$annotations() {
    }

    @gk60(name = "playback_control")
    public static /* synthetic */ void getPlaybackControl$annotations() {
    }

    public final V3JoinSessionRequest copy(@gk60(name = "join_token") String joinToken, @gk60(name = "join_type") String joinType, @gk60(name = "playback_control") String playbackControl, @gk60(name = "local_device_id") String localDeviceId, @gk60(name = "join_attempt_id") String joinAttemptId, @gk60(name = "permission_mode") String permissionMode) {
        return new V3JoinSessionRequest(joinToken, joinType, playbackControl, localDeviceId, joinAttemptId, permissionMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V3JoinSessionRequest)) {
            return false;
        }
        V3JoinSessionRequest v3JoinSessionRequest = (V3JoinSessionRequest) obj;
        return wj50.m88271j(this.joinToken, v3JoinSessionRequest.joinToken) && wj50.m88271j(this.joinType, v3JoinSessionRequest.joinType) && wj50.m88271j(this.playbackControl, v3JoinSessionRequest.playbackControl) && wj50.m88271j(this.localDeviceId, v3JoinSessionRequest.localDeviceId) && wj50.m88271j(this.joinAttemptId, v3JoinSessionRequest.joinAttemptId) && wj50.m88271j(this.permissionMode, v3JoinSessionRequest.permissionMode);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.joinToken.hashCode() * 31, 31, this.joinType), 31, this.playbackControl), 31, this.localDeviceId), 31, this.joinAttemptId);
        String str = this.permissionMode;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ V3JoinSessionRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6);
    }
}
