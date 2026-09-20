package com.spotify.connect.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p204p.gk60;
import p204p.h1v0;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/connect/core/model/RedirectUris;", "Landroid/os/Parcelable;", "Lcom/spotify/connect/core/model/AndroidUris;", "androidUris", "<init>", "(Lcom/spotify/connect/core/model/AndroidUris;)V", "copy", "(Lcom/spotify/connect/core/model/AndroidUris;)Lcom/spotify/connect/core/model/RedirectUris;", "a", "Lcom/spotify/connect/core/model/AndroidUris;", "getAndroidUris", "()Lcom/spotify/connect/core/model/AndroidUris;", "getAndroidUris$annotations", "()V", "src_main_java_com_spotify_connect_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class RedirectUris implements Parcelable {
    public static final Parcelable.Creator<RedirectUris> CREATOR = new h1v0(16);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final AndroidUris androidUris;

    public RedirectUris(@gk60(name = "android") AndroidUris androidUris) {
        this.androidUris = androidUris;
    }

    @gk60(name = "android")
    public static /* synthetic */ void getAndroidUris$annotations() {
    }

    public final RedirectUris copy(@gk60(name = "android") AndroidUris androidUris) {
        return new RedirectUris(androidUris);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RedirectUris) && wj50.m88271j(this.androidUris, ((RedirectUris) obj).androidUris);
    }

    public final int hashCode() {
        AndroidUris androidUris = this.androidUris;
        if (androidUris == null) {
            return 0;
        }
        return androidUris.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AndroidUris androidUris = this.androidUris;
        if (androidUris == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            androidUris.writeToParcel(parcel, i);
        }
    }
}
