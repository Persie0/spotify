package com.spotify.jam.internal.socialconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.lau;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001d\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u000f\u0010\u001e¨\u0006 "}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;", "", "Lcom/spotify/jam/internal/socialconnect/models/JoinToken;", "joinToken", "", "Lcom/spotify/jam/internal/socialconnect/models/AvailableMember;", "members", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "playbackInfo", "Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;", "capabilities", "<init>", "(Lcom/spotify/jam/internal/socialconnect/models/JoinToken;Ljava/util/List;Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;)V", "copy", "(Lcom/spotify/jam/internal/socialconnect/models/JoinToken;Ljava/util/List;Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;)Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;", "a", "Lcom/spotify/jam/internal/socialconnect/models/JoinToken;", "b", "()Lcom/spotify/jam/internal/socialconnect/models/JoinToken;", "getJoinToken$annotations", "()V", "Ljava/util/List;", "c", "()Ljava/util/List;", "getMembers$annotations", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "d", "()Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "getPlaybackInfo$annotations", "Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;", "()Lcom/spotify/jam/internal/socialconnect/models/AvailableJamCapabilities;", "getCapabilities$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AvailableJam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final JoinToken joinToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List members;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final SessionDeviceInfo playbackInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final AvailableJamCapabilities capabilities;

    public AvailableJam(@gk60(name = "join_token") JoinToken joinToken, @gk60(name = "available_members") List<AvailableMember> list, @gk60(name = "playback_device_info") SessionDeviceInfo sessionDeviceInfo, @gk60(name = "capabilities") AvailableJamCapabilities availableJamCapabilities) {
        this.joinToken = joinToken;
        this.members = list;
        this.playbackInfo = sessionDeviceInfo;
        this.capabilities = availableJamCapabilities;
    }

    @gk60(name = "capabilities")
    public static /* synthetic */ void getCapabilities$annotations() {
    }

    @gk60(name = "join_token")
    public static /* synthetic */ void getJoinToken$annotations() {
    }

    @gk60(name = "available_members")
    public static /* synthetic */ void getMembers$annotations() {
    }

    @gk60(name = "playback_device_info")
    public static /* synthetic */ void getPlaybackInfo$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AvailableJamCapabilities getCapabilities() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final JoinToken getJoinToken() {
        return this.joinToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    public final AvailableJam copy(@gk60(name = "join_token") JoinToken joinToken, @gk60(name = "available_members") List<AvailableMember> members, @gk60(name = "playback_device_info") SessionDeviceInfo playbackInfo, @gk60(name = "capabilities") AvailableJamCapabilities capabilities) {
        return new AvailableJam(joinToken, members, playbackInfo, capabilities);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SessionDeviceInfo getPlaybackInfo() {
        return this.playbackInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableJam)) {
            return false;
        }
        AvailableJam availableJam = (AvailableJam) obj;
        return wj50.m88271j(this.joinToken, availableJam.joinToken) && wj50.m88271j(this.members, availableJam.members) && wj50.m88271j(this.playbackInfo, availableJam.playbackInfo) && wj50.m88271j(this.capabilities, availableJam.capabilities);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.joinToken.token.hashCode() * 31, 31, this.members);
        SessionDeviceInfo sessionDeviceInfo = this.playbackInfo;
        return Boolean.hashCode(this.capabilities.blockHost) + ((iM77244c + (sessionDeviceInfo == null ? 0 : sessionDeviceInfo.hashCode())) * 31);
    }

    public /* synthetic */ AvailableJam(JoinToken joinToken, List list, SessionDeviceInfo sessionDeviceInfo, AvailableJamCapabilities availableJamCapabilities, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(joinToken, (i & 2) != 0 ? lau.f131415a : list, (i & 4) != 0 ? null : sessionDeviceInfo, (i & 8) != 0 ? new AvailableJamCapabilities(false, 1, null) : availableJamCapabilities);
    }
}
