package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\u0011R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010\u0013\u001a\u0004\b\t\u0010!¨\u0006#"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "", "", "deviceId", "Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "outputDeviceInfo", "deviceName", "deviceType", "", "isGroup", "<init>", "(Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "getDeviceId$annotations", "()V", "b", "Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "getOutputDeviceInfo", "()Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "getOutputDeviceInfo$annotations", "c", "getDeviceName", "getDeviceName$annotations", "d", "getDeviceType", "getDeviceType$annotations", "e", "Z", "()Z", "isGroup$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SessionDeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String deviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final OutputDeviceInfo outputDeviceInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String deviceName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String deviceType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isGroup;

    public SessionDeviceInfo(@gk60(name = "device_id") String str, @gk60(name = "output_device_info") OutputDeviceInfo outputDeviceInfo, @gk60(name = "device_name") String str2, @gk60(name = "device_type") String str3, @gk60(name = "is_group") boolean z) {
        this.deviceId = str;
        this.outputDeviceInfo = outputDeviceInfo;
        this.deviceName = str2;
        this.deviceType = str3;
        this.isGroup = z;
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

    @gk60(name = "output_device_info")
    public static /* synthetic */ void getOutputDeviceInfo$annotations() {
    }

    @gk60(name = "is_group")
    public static /* synthetic */ void isGroup$annotations() {
    }

    public final SessionDeviceInfo copy(@gk60(name = "device_id") String deviceId, @gk60(name = "output_device_info") OutputDeviceInfo outputDeviceInfo, @gk60(name = "device_name") String deviceName, @gk60(name = "device_type") String deviceType, @gk60(name = "is_group") boolean isGroup) {
        return new SessionDeviceInfo(deviceId, outputDeviceInfo, deviceName, deviceType, isGroup);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDeviceInfo)) {
            return false;
        }
        SessionDeviceInfo sessionDeviceInfo = (SessionDeviceInfo) obj;
        return wj50.m88271j(this.deviceId, sessionDeviceInfo.deviceId) && wj50.m88271j(this.outputDeviceInfo, sessionDeviceInfo.outputDeviceInfo) && wj50.m88271j(this.deviceName, sessionDeviceInfo.deviceName) && wj50.m88271j(this.deviceType, sessionDeviceInfo.deviceType) && this.isGroup == sessionDeviceInfo.isGroup;
    }

    public final int hashCode() {
        String str = this.deviceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OutputDeviceInfo outputDeviceInfo = this.outputDeviceInfo;
        int iHashCode2 = (iHashCode + (outputDeviceInfo == null ? 0 : outputDeviceInfo.hashCode())) * 31;
        String str2 = this.deviceName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceType;
        return Boolean.hashCode(this.isGroup) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public /* synthetic */ SessionDeviceInfo(String str, OutputDeviceInfo outputDeviceInfo, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : outputDeviceInfo, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
    }
}
