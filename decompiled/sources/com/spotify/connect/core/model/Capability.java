package com.spotify.connect.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import p204p.gk60;
import p204p.n6f1;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJX\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\"¨\u0006$"}, m24212d2 = {"Lcom/spotify/connect/core/model/Capability;", "Landroid/os/Parcelable;", "", "id", "defaultTitle", "iconUrl", "Lcom/spotify/connect/core/model/RedirectUris;", "redirectUris", "", "localizedTitles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/connect/core/model/RedirectUris;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/connect/core/model/RedirectUris;Ljava/util/Map;)Lcom/spotify/connect/core/model/Capability;", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "b", "getDefaultTitle", "getDefaultTitle$annotations", "c", "getIconUrl", "getIconUrl$annotations", "d", "Lcom/spotify/connect/core/model/RedirectUris;", "getRedirectUris", "()Lcom/spotify/connect/core/model/RedirectUris;", "getRedirectUris$annotations", "e", "Ljava/util/Map;", "getLocalizedTitles", "()Ljava/util/Map;", "getLocalizedTitles$annotations", "src_main_java_com_spotify_connect_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Capability implements Parcelable {
    public static final Parcelable.Creator<Capability> CREATOR = new n6f1(6);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String defaultTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final RedirectUris redirectUris;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Map localizedTitles;

    public Capability(@gk60(name = "id") String str, @gk60(name = "defaultTitle") String str2, @gk60(name = "iconUrl") String str3, @gk60(name = "redirectUris") RedirectUris redirectUris, @gk60(name = "localizedTitle") Map<String, String> map) {
        this.id = str;
        this.defaultTitle = str2;
        this.iconUrl = str3;
        this.redirectUris = redirectUris;
        this.localizedTitles = map;
    }

    @gk60(name = "defaultTitle")
    public static /* synthetic */ void getDefaultTitle$annotations() {
    }

    @gk60(name = "iconUrl")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "localizedTitle")
    public static /* synthetic */ void getLocalizedTitles$annotations() {
    }

    @gk60(name = "redirectUris")
    public static /* synthetic */ void getRedirectUris$annotations() {
    }

    public final Capability copy(@gk60(name = "id") String id, @gk60(name = "defaultTitle") String defaultTitle, @gk60(name = "iconUrl") String iconUrl, @gk60(name = "redirectUris") RedirectUris redirectUris, @gk60(name = "localizedTitle") Map<String, String> localizedTitles) {
        return new Capability(id, defaultTitle, iconUrl, redirectUris, localizedTitles);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Capability)) {
            return false;
        }
        Capability capability = (Capability) obj;
        return wj50.m88271j(this.id, capability.id) && wj50.m88271j(this.defaultTitle, capability.defaultTitle) && wj50.m88271j(this.iconUrl, capability.iconUrl) && wj50.m88271j(this.redirectUris, capability.redirectUris) && wj50.m88271j(this.localizedTitles, capability.localizedTitles);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RedirectUris redirectUris = this.redirectUris;
        int iHashCode4 = (iHashCode3 + (redirectUris == null ? 0 : redirectUris.hashCode())) * 31;
        Map map = this.localizedTitles;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.defaultTitle);
        parcel.writeString(this.iconUrl);
        RedirectUris redirectUris = this.redirectUris;
        if (redirectUris == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            redirectUris.writeToParcel(parcel, i);
        }
        Map map = this.localizedTitles;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
