package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AcceptJamJoinRequest;", "", "", "userName", "localDeviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/AcceptJamJoinRequest;", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "getUserName$annotations", "()V", "b", "getLocalDeviceId", "getLocalDeviceId$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AcceptJamJoinRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String userName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String localDeviceId;

    public AcceptJamJoinRequest(@gk60(name = "username") String str, @gk60(name = "local_device_id") String str2) {
        this.userName = str;
        this.localDeviceId = str2;
    }

    @gk60(name = "local_device_id")
    public static /* synthetic */ void getLocalDeviceId$annotations() {
    }

    @gk60(name = "username")
    public static /* synthetic */ void getUserName$annotations() {
    }

    public final AcceptJamJoinRequest copy(@gk60(name = "username") String userName, @gk60(name = "local_device_id") String localDeviceId) {
        return new AcceptJamJoinRequest(userName, localDeviceId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptJamJoinRequest)) {
            return false;
        }
        AcceptJamJoinRequest acceptJamJoinRequest = (AcceptJamJoinRequest) obj;
        return wj50.m88271j(this.userName, acceptJamJoinRequest.userName) && wj50.m88271j(this.localDeviceId, acceptJamJoinRequest.localDeviceId);
    }

    public final int hashCode() {
        return this.localDeviceId.hashCode() + (this.userName.hashCode() * 31);
    }
}
