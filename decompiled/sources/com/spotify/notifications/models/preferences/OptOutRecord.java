package com.spotify.notifications.models.preferences;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p204p.cpl0;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/notifications/models/preferences/OptOutRecord;", "Landroid/os/Parcelable;", "", "optOutType", "channel", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/notifications/models/preferences/OptOutRecord;", "a", "Ljava/lang/String;", "getOptOutType", "()Ljava/lang/String;", "getOptOutType$annotations", "()V", "b", "getChannel", "getChannel$annotations", "c", "Z", "getValue", "()Z", "getValue$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class OptOutRecord implements Parcelable {
    public static final Parcelable.Creator<OptOutRecord> CREATOR = new cpl0(2);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String optOutType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean value;

    public OptOutRecord(@gk60(name = "optOutType") String str, @gk60(name = "channel") String str2, @gk60(name = "value") boolean z) {
        this.optOutType = str;
        this.channel = str2;
        this.value = z;
    }

    @gk60(name = "channel")
    public static /* synthetic */ void getChannel$annotations() {
    }

    @gk60(name = "optOutType")
    public static /* synthetic */ void getOptOutType$annotations() {
    }

    @gk60(name = "value")
    public static /* synthetic */ void getValue$annotations() {
    }

    public final OptOutRecord copy(@gk60(name = "optOutType") String optOutType, @gk60(name = "channel") String channel, @gk60(name = "value") boolean value) {
        return new OptOutRecord(optOutType, channel, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptOutRecord)) {
            return false;
        }
        OptOutRecord optOutRecord = (OptOutRecord) obj;
        return wj50.m88271j(this.optOutType, optOutRecord.optOutType) && wj50.m88271j(this.channel, optOutRecord.channel) && this.value == optOutRecord.value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value) + s571.m77243b(this.optOutType.hashCode() * 31, 31, this.channel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.optOutType);
        parcel.writeString(this.channel);
        parcel.writeInt(this.value ? 1 : 0);
    }
}
