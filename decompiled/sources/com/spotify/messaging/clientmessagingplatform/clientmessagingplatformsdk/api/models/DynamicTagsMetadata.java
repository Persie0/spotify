package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013¨\u0006%"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "Landroid/os/Parcelable;", "", "entityUri", "creatorName", "entityName", "entityImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEntityUri", "getCreatorName", "getEntityName", "getEntityImageUrl", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class DynamicTagsMetadata implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DynamicTagsMetadata> CREATOR = new Creator();
    private final String creatorName;
    private final String entityImageUrl;
    private final String entityName;
    private final String entityUri;

    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Creator implements Parcelable.Creator<DynamicTagsMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicTagsMetadata createFromParcel(Parcel parcel) {
            return new DynamicTagsMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicTagsMetadata[] newArray(int i) {
            return new DynamicTagsMetadata[i];
        }
    }

    public DynamicTagsMetadata() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DynamicTagsMetadata copy$default(DynamicTagsMetadata dynamicTagsMetadata, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicTagsMetadata.entityUri;
        }
        if ((i & 2) != 0) {
            str2 = dynamicTagsMetadata.creatorName;
        }
        if ((i & 4) != 0) {
            str3 = dynamicTagsMetadata.entityName;
        }
        if ((i & 8) != 0) {
            str4 = dynamicTagsMetadata.entityImageUrl;
        }
        return dynamicTagsMetadata.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEntityUri() {
        return this.entityUri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatorName() {
        return this.creatorName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEntityName() {
        return this.entityName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntityImageUrl() {
        return this.entityImageUrl;
    }

    public final DynamicTagsMetadata copy(String entityUri, String creatorName, String entityName, String entityImageUrl) {
        return new DynamicTagsMetadata(entityUri, creatorName, entityName, entityImageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicTagsMetadata)) {
            return false;
        }
        DynamicTagsMetadata dynamicTagsMetadata = (DynamicTagsMetadata) other;
        return wj50.m88271j(this.entityUri, dynamicTagsMetadata.entityUri) && wj50.m88271j(this.creatorName, dynamicTagsMetadata.creatorName) && wj50.m88271j(this.entityName, dynamicTagsMetadata.entityName) && wj50.m88271j(this.entityImageUrl, dynamicTagsMetadata.entityImageUrl);
    }

    public final String getCreatorName() {
        return this.creatorName;
    }

    public final String getEntityImageUrl() {
        return this.entityImageUrl;
    }

    public final String getEntityName() {
        return this.entityName;
    }

    public final String getEntityUri() {
        return this.entityUri;
    }

    public int hashCode() {
        String str = this.entityUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.creatorName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entityName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entityImageUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.entityUri);
        dest.writeString(this.creatorName);
        dest.writeString(this.entityName);
        dest.writeString(this.entityImageUrl);
    }

    public DynamicTagsMetadata(String str, String str2, String str3, String str4) {
        this.entityUri = str;
        this.creatorName = str2;
        this.entityName = str3;
        this.entityImageUrl = str4;
    }

    public /* synthetic */ DynamicTagsMetadata(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
