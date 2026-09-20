package com.spotify.notifications.models.preferences;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a5c;
import p204p.ei6;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/notifications/models/preferences/Channels;", "Landroid/os/Parcelable;", "", "email", "push", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/spotify/notifications/models/preferences/Channels;", "a", "Ljava/lang/Boolean;", "getEmail", "()Ljava/lang/Boolean;", "setEmail", "(Ljava/lang/Boolean;)V", "getEmail$annotations", "()V", "b", "getPush", "setPush", "getPush$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Channels implements Parcelable {
    public static final Parcelable.Creator<Channels> CREATOR = new a5c(20);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Boolean email;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Boolean push;

    public Channels(@gk60(name = "email") Boolean bool, @gk60(name = "push") Boolean bool2) {
        this.email = bool;
        this.push = bool2;
    }

    @gk60(name = "email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @gk60(name = "push")
    public static /* synthetic */ void getPush$annotations() {
    }

    public final Channels copy(@gk60(name = "email") Boolean email, @gk60(name = "push") Boolean push) {
        return new Channels(email, push);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channels)) {
            return false;
        }
        Channels channels = (Channels) obj;
        return wj50.m88271j(this.email, channels.email) && wj50.m88271j(this.push, channels.push);
    }

    public final int hashCode() {
        Boolean bool = this.email;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.push;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.email;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        Boolean bool2 = this.push;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool2);
        }
    }

    public /* synthetic */ Channels(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
