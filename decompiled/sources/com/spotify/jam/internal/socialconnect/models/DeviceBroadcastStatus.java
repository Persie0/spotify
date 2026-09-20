package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.hla;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011Jt\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0019\u001a\u0004\b!\u0010\"R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010 \u0012\u0004\b&\u0010\u0019\u001a\u0004\b%\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0019\u001a\u0004\b,\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0019\u001a\u0004\b1\u00102R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u0010\u0019\u001a\u0004\b5\u00102R\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00100\u0012\u0004\b9\u0010\u0019\u001a\u0004\b8\u00102¨\u0006:"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;", "", "", "timestamp", "Lp/hla;", "broadcastStatus", "", "deviceId", "deviceName", "deviceType", "Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "outputDeviceInfo", "Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;", "mdnsToken", "socialRadarToken", "linkToken", "<init>", "(JLp/hla;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;)V", "copy", "(JLp/hla;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;)Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;", "a", "J", "getTimestamp", "()J", "getTimestamp$annotations", "()V", "b", "Lp/hla;", "getBroadcastStatus", "()Lp/hla;", "getBroadcastStatus$annotations", "c", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "getDeviceId$annotations", "d", "getDeviceName", "getDeviceName$annotations", "e", "getDeviceType", "getDeviceType$annotations", "f", "Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "getOutputDeviceInfo", "()Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "getOutputDeviceInfo$annotations", "g", "Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;", "getMdnsToken", "()Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;", "getMdnsToken$annotations", "h", "getSocialRadarToken", "getSocialRadarToken$annotations", "i", "getLinkToken", "getLinkToken$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class DeviceBroadcastStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final hla broadcastStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String deviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String deviceName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String deviceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final OutputDeviceInfo outputDeviceInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final BroadcastToken mdnsToken;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final BroadcastToken socialRadarToken;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final BroadcastToken linkToken;

    public DeviceBroadcastStatus(@gk60(name = "timestamp") long j, @gk60(name = "broadcast_status") hla hlaVar, @gk60(name = "device_id") String str, @gk60(name = "device_name") String str2, @gk60(name = "device_type") String str3, @gk60(name = "output_device_info") OutputDeviceInfo outputDeviceInfo, @gk60(name = "mdns_token") BroadcastToken broadcastToken, @gk60(name = "social_radar_token") BroadcastToken broadcastToken2, @gk60(name = "link_token") BroadcastToken broadcastToken3) {
        this.timestamp = j;
        this.broadcastStatus = hlaVar;
        this.deviceId = str;
        this.deviceName = str2;
        this.deviceType = str3;
        this.outputDeviceInfo = outputDeviceInfo;
        this.mdnsToken = broadcastToken;
        this.socialRadarToken = broadcastToken2;
        this.linkToken = broadcastToken3;
    }

    @gk60(name = "broadcast_status")
    public static /* synthetic */ void getBroadcastStatus$annotations() {
    }

    @gk60(name = "device_id")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @gk60(name = "device_name")
    public static /* synthetic */ void getDeviceName$annotations() {
    }

    @gk60(name = "device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @gk60(name = "link_token")
    public static /* synthetic */ void getLinkToken$annotations() {
    }

    @gk60(name = "mdns_token")
    public static /* synthetic */ void getMdnsToken$annotations() {
    }

    @gk60(name = "output_device_info")
    public static /* synthetic */ void getOutputDeviceInfo$annotations() {
    }

    @gk60(name = "social_radar_token")
    public static /* synthetic */ void getSocialRadarToken$annotations() {
    }

    @gk60(name = "timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    public final DeviceBroadcastStatus copy(@gk60(name = "timestamp") long timestamp, @gk60(name = "broadcast_status") hla broadcastStatus, @gk60(name = "device_id") String deviceId, @gk60(name = "device_name") String deviceName, @gk60(name = "device_type") String deviceType, @gk60(name = "output_device_info") OutputDeviceInfo outputDeviceInfo, @gk60(name = "mdns_token") BroadcastToken mdnsToken, @gk60(name = "social_radar_token") BroadcastToken socialRadarToken, @gk60(name = "link_token") BroadcastToken linkToken) {
        return new DeviceBroadcastStatus(timestamp, broadcastStatus, deviceId, deviceName, deviceType, outputDeviceInfo, mdnsToken, socialRadarToken, linkToken);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceBroadcastStatus)) {
            return false;
        }
        DeviceBroadcastStatus deviceBroadcastStatus = (DeviceBroadcastStatus) obj;
        return this.timestamp == deviceBroadcastStatus.timestamp && this.broadcastStatus == deviceBroadcastStatus.broadcastStatus && wj50.m88271j(this.deviceId, deviceBroadcastStatus.deviceId) && wj50.m88271j(this.deviceName, deviceBroadcastStatus.deviceName) && wj50.m88271j(this.deviceType, deviceBroadcastStatus.deviceType) && wj50.m88271j(this.outputDeviceInfo, deviceBroadcastStatus.outputDeviceInfo) && wj50.m88271j(this.mdnsToken, deviceBroadcastStatus.mdnsToken) && wj50.m88271j(this.socialRadarToken, deviceBroadcastStatus.socialRadarToken) && wj50.m88271j(this.linkToken, deviceBroadcastStatus.linkToken);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b((this.broadcastStatus.hashCode() + (Long.hashCode(this.timestamp) * 31)) * 31, 31, this.deviceId), 31, this.deviceName);
        String str = this.deviceType;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        OutputDeviceInfo outputDeviceInfo = this.outputDeviceInfo;
        int iHashCode2 = (iHashCode + (outputDeviceInfo == null ? 0 : outputDeviceInfo.hashCode())) * 31;
        BroadcastToken broadcastToken = this.mdnsToken;
        int iHashCode3 = (iHashCode2 + (broadcastToken == null ? 0 : broadcastToken.token.hashCode())) * 31;
        BroadcastToken broadcastToken2 = this.socialRadarToken;
        int iHashCode4 = (iHashCode3 + (broadcastToken2 == null ? 0 : broadcastToken2.token.hashCode())) * 31;
        BroadcastToken broadcastToken3 = this.linkToken;
        return iHashCode4 + (broadcastToken3 != null ? broadcastToken3.token.hashCode() : 0);
    }

    public /* synthetic */ DeviceBroadcastStatus(long j, hla hlaVar, String str, String str2, String str3, OutputDeviceInfo outputDeviceInfo, BroadcastToken broadcastToken, BroadcastToken broadcastToken2, BroadcastToken broadcastToken3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, hlaVar, str, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : outputDeviceInfo, (i & 64) != 0 ? null : broadcastToken, (i & 128) != 0 ? null : broadcastToken2, (i & 256) != 0 ? null : broadcastToken3);
    }
}
