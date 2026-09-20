package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "", "", "deviceName", "rawOutputDeviceType", "rawAccessoryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "a", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "getDeviceName$annotations", "()V", "b", "getRawOutputDeviceType", "getRawOutputDeviceType$annotations", "c", "getRawAccessoryType", "getRawAccessoryType$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class OutputDeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String deviceName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String rawOutputDeviceType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String rawAccessoryType;

    public OutputDeviceInfo(@gk60(name = "device_name") String str, @gk60(name = "output_device_type") String str2, @gk60(name = "accessory_type") String str3) {
        this.deviceName = str;
        this.rawOutputDeviceType = str2;
        this.rawAccessoryType = str3;
    }

    @gk60(name = "device_name")
    public static /* synthetic */ void getDeviceName$annotations() {
    }

    @gk60(name = "accessory_type")
    public static /* synthetic */ void getRawAccessoryType$annotations() {
    }

    @gk60(name = "output_device_type")
    public static /* synthetic */ void getRawOutputDeviceType$annotations() {
    }

    public final OutputDeviceInfo copy(@gk60(name = "device_name") String deviceName, @gk60(name = "output_device_type") String rawOutputDeviceType, @gk60(name = "accessory_type") String rawAccessoryType) {
        return new OutputDeviceInfo(deviceName, rawOutputDeviceType, rawAccessoryType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutputDeviceInfo)) {
            return false;
        }
        OutputDeviceInfo outputDeviceInfo = (OutputDeviceInfo) obj;
        return wj50.m88271j(this.deviceName, outputDeviceInfo.deviceName) && wj50.m88271j(this.rawOutputDeviceType, outputDeviceInfo.rawOutputDeviceType) && wj50.m88271j(this.rawAccessoryType, outputDeviceInfo.rawAccessoryType);
    }

    public final int hashCode() {
        String str = this.deviceName;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.rawOutputDeviceType);
        String str2 = this.rawAccessoryType;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ OutputDeviceInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3);
    }
}
