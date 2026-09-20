package com.spotify.connect.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p204p.bc3;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/connect/core/model/AndroidUris;", "Landroid/os/Parcelable;", "", "uri", "redirectBackAppParam", "deviceNameParam", "fallbackUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/connect/core/model/AndroidUris;", "a", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "getUri$annotations", "()V", "b", "getRedirectBackAppParam", "getRedirectBackAppParam$annotations", "c", "getDeviceNameParam", "getDeviceNameParam$annotations", "d", "getFallbackUrl", "getFallbackUrl$annotations", "src_main_java_com_spotify_connect_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AndroidUris implements Parcelable {
    public static final Parcelable.Creator<AndroidUris> CREATOR = new bc3(19);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String redirectBackAppParam;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String deviceNameParam;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String fallbackUrl;

    public AndroidUris(@gk60(name = "uri") String str, @gk60(name = "redirectBackAppParam") String str2, @gk60(name = "deviceNameParam") String str3, @gk60(name = "fallbackUrl") String str4) {
        this.uri = str;
        this.redirectBackAppParam = str2;
        this.deviceNameParam = str3;
        this.fallbackUrl = str4;
    }

    @gk60(name = "deviceNameParam")
    public static /* synthetic */ void getDeviceNameParam$annotations() {
    }

    @gk60(name = "fallbackUrl")
    public static /* synthetic */ void getFallbackUrl$annotations() {
    }

    @gk60(name = "redirectBackAppParam")
    public static /* synthetic */ void getRedirectBackAppParam$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    public final AndroidUris copy(@gk60(name = "uri") String uri, @gk60(name = "redirectBackAppParam") String redirectBackAppParam, @gk60(name = "deviceNameParam") String deviceNameParam, @gk60(name = "fallbackUrl") String fallbackUrl) {
        return new AndroidUris(uri, redirectBackAppParam, deviceNameParam, fallbackUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidUris)) {
            return false;
        }
        AndroidUris androidUris = (AndroidUris) obj;
        return wj50.m88271j(this.uri, androidUris.uri) && wj50.m88271j(this.redirectBackAppParam, androidUris.redirectBackAppParam) && wj50.m88271j(this.deviceNameParam, androidUris.deviceNameParam) && wj50.m88271j(this.fallbackUrl, androidUris.fallbackUrl);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectBackAppParam;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceNameParam;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fallbackUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.redirectBackAppParam);
        parcel.writeString(this.deviceNameParam);
        parcel.writeString(this.fallbackUrl);
    }
}
