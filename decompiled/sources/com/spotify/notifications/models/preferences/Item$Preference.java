package com.spotify.notifications.models.preferences;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p204p.gd50;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;
import p204p.wq50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJB\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001b\u0010\u0011R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m24212d2 = {"com/spotify/notifications/models/preferences/Item$Preference", "Lp/wq50;", "", "type", "key", "name", "description", "Lcom/spotify/notifications/models/preferences/Channels;", "channels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/notifications/models/preferences/Channels;)V", "Lcom/spotify/notifications/models/preferences/Item$Preference;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/notifications/models/preferences/Channels;)Lcom/spotify/notifications/models/preferences/Item$Preference;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getKey", "getKey$annotations", "c", "getName", "getName$annotations", "d", "getDescription", "getDescription$annotations", "e", "Lcom/spotify/notifications/models/preferences/Channels;", "getChannels", "()Lcom/spotify/notifications/models/preferences/Channels;", "getChannels$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Item$Preference extends wq50 {
    public static final Parcelable.Creator<Item$Preference> CREATOR = new gd50(29);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Channels channels;

    public Item$Preference(@gk60(name = "type") String str, @gk60(name = "key") String str2, @gk60(name = "name") String str3, @gk60(name = "description") String str4, @gk60(name = "channels") Channels channels) {
        this.type = str;
        this.key = str2;
        this.name = str3;
        this.description = str4;
        this.channels = channels;
    }

    @gk60(name = "channels")
    public static /* synthetic */ void getChannels$annotations() {
    }

    @gk60(name = "description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @gk60(name = "key")
    public static /* synthetic */ void getKey$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public final Item$Preference copy(@gk60(name = "type") String type, @gk60(name = "key") String key, @gk60(name = "name") String name, @gk60(name = "description") String description, @gk60(name = "channels") Channels channels) {
        return new Item$Preference(type, key, name, description, channels);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item$Preference)) {
            return false;
        }
        Item$Preference item$Preference = (Item$Preference) obj;
        return wj50.m88271j(this.type, item$Preference.type) && wj50.m88271j(this.key, item$Preference.key) && wj50.m88271j(this.name, item$Preference.name) && wj50.m88271j(this.description, item$Preference.description) && wj50.m88271j(this.channels, item$Preference.channels);
    }

    public final int hashCode() {
        return this.channels.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.type.hashCode() * 31, 31, this.key), 31, this.name), 31, this.description);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        this.channels.writeToParcel(parcel, i);
    }
}
