package com.spotify.notifications.models.preferences;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p204p.fr0;
import p204p.gd50;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;
import p204p.wq50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u000b\u0010\fJR\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001d\u0010\u0013R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0015\u001a\u0004\b!\u0010\"R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0015\u001a\u0004\b&\u0010'¨\u0006)"}, m24212d2 = {"com/spotify/notifications/models/preferences/Item$Group", "Lp/wq50;", "", "type", "key", "name", "description", "", "showExpanded", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "Lcom/spotify/notifications/models/preferences/Item$Group;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/spotify/notifications/models/preferences/Item$Group;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getKey", "getKey$annotations", "c", "getName", "getName$annotations", "d", "getDescription", "getDescription$annotations", "e", "Z", "getShowExpanded", "()Z", "getShowExpanded$annotations", "f", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Item$Group extends wq50 {
    public static final Parcelable.Creator<Item$Group> CREATOR = new gd50(27);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean showExpanded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final List items;

    public Item$Group(@gk60(name = "type") String str, @gk60(name = "key") String str2, @gk60(name = "name") String str3, @gk60(name = "description") String str4, @gk60(name = "showExpanded") boolean z, @gk60(name = "items") List<? extends wq50> list) {
        this.type = str;
        this.key = str2;
        this.name = str3;
        this.description = str4;
        this.showExpanded = z;
        this.items = list;
    }

    @gk60(name = "description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @gk60(name = "items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @gk60(name = "key")
    public static /* synthetic */ void getKey$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = "showExpanded")
    public static /* synthetic */ void getShowExpanded$annotations() {
    }

    @gk60(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public final Item$Group copy(@gk60(name = "type") String type, @gk60(name = "key") String key, @gk60(name = "name") String name, @gk60(name = "description") String description, @gk60(name = "showExpanded") boolean showExpanded, @gk60(name = "items") List<? extends wq50> items) {
        return new Item$Group(type, key, name, description, showExpanded, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item$Group)) {
            return false;
        }
        Item$Group item$Group = (Item$Group) obj;
        return wj50.m88271j(this.type, item$Group.type) && wj50.m88271j(this.key, item$Group.key) && wj50.m88271j(this.name, item$Group.name) && wj50.m88271j(this.description, item$Group.description) && this.showExpanded == item$Group.showExpanded && wj50.m88271j(this.items, item$Group.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.type.hashCode() * 31, 31, this.key), 31, this.name), 31, this.description), 31, this.showExpanded);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeInt(this.showExpanded ? 1 : 0);
        Iterator itM42468l = fr0.m42468l(parcel, this.items);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }
}
