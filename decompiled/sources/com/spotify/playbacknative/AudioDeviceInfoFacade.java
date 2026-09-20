package com.spotify.playbacknative;

import android.media.AudioDeviceInfo;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J<\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006!"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "", "deviceId", "", "productName", "", "audioDeviceInfoType", "address", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "audioDeviceInfo", "Landroid/media/AudioDeviceInfo;", "(Landroid/media/AudioDeviceInfo;)V", "(I)V", "getDeviceId", "()I", "getProductName", "()Ljava/lang/String;", "getAudioDeviceInfoType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAddress", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "equals", "", "other", "hashCode", "toString", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class AudioDeviceInfoFacade {
    private final String address;
    private final Integer audioDeviceInfoType;
    private final int deviceId;
    private final String productName;

    public AudioDeviceInfoFacade(int i, String str, Integer num, String str2) {
        this.deviceId = i;
        this.productName = str;
        this.audioDeviceInfoType = num;
        this.address = str2;
    }

    public static /* synthetic */ AudioDeviceInfoFacade copy$default(AudioDeviceInfoFacade audioDeviceInfoFacade, int i, String str, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = audioDeviceInfoFacade.deviceId;
        }
        if ((i2 & 2) != 0) {
            str = audioDeviceInfoFacade.productName;
        }
        if ((i2 & 4) != 0) {
            num = audioDeviceInfoFacade.audioDeviceInfoType;
        }
        if ((i2 & 8) != 0) {
            str2 = audioDeviceInfoFacade.address;
        }
        return audioDeviceInfoFacade.copy(i, str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAudioDeviceInfoType() {
        return this.audioDeviceInfoType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final AudioDeviceInfoFacade copy(int deviceId, String productName, Integer audioDeviceInfoType, String address) {
        return new AudioDeviceInfoFacade(deviceId, productName, audioDeviceInfoType, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioDeviceInfoFacade)) {
            return false;
        }
        AudioDeviceInfoFacade audioDeviceInfoFacade = (AudioDeviceInfoFacade) other;
        return this.deviceId == audioDeviceInfoFacade.deviceId && wj50.m88271j(this.productName, audioDeviceInfoFacade.productName) && wj50.m88271j(this.audioDeviceInfoType, audioDeviceInfoFacade.audioDeviceInfoType) && wj50.m88271j(this.address, audioDeviceInfoFacade.address);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Integer getAudioDeviceInfoType() {
        return this.audioDeviceInfoType;
    }

    public final int getDeviceId() {
        return this.deviceId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.deviceId) * 31;
        String str = this.productName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.audioDeviceInfoType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.address;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return super.toString();
    }

    public AudioDeviceInfoFacade(AudioDeviceInfo audioDeviceInfo) {
        this(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString(), Integer.valueOf(audioDeviceInfo.getType()), AudioDeviceInfoFacadeKt.getAddressFrom(audioDeviceInfo));
    }

    public AudioDeviceInfoFacade(int i) {
        this(i, null, null, null);
    }
}
