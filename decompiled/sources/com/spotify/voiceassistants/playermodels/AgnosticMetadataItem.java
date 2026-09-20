package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/AgnosticMetadataItem;", "", ContextTrack.Metadata.KEY_TITLE, "", ContextTrack.Metadata.KEY_SUBTITLE, "uri", "image", "Lcom/spotify/voiceassistants/playermodels/Image;", "explicit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/Image;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getUri", "getImage", "()Lcom/spotify/voiceassistants/playermodels/Image;", "getExplicit", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class AgnosticMetadataItem {
    private final boolean explicit;
    private final Image image;
    private final String subtitle;
    private final String title;
    private final String uri;

    public AgnosticMetadataItem(String str, String str2, String str3, Image image, boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.uri = str3;
        this.image = image;
        this.explicit = z;
    }

    public static /* synthetic */ AgnosticMetadataItem copy$default(AgnosticMetadataItem agnosticMetadataItem, String str, String str2, String str3, Image image, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agnosticMetadataItem.title;
        }
        if ((i & 2) != 0) {
            str2 = agnosticMetadataItem.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = agnosticMetadataItem.uri;
        }
        if ((i & 8) != 0) {
            image = agnosticMetadataItem.image;
        }
        if ((i & 16) != 0) {
            z = agnosticMetadataItem.explicit;
        }
        boolean z2 = z;
        String str4 = str3;
        return agnosticMetadataItem.copy(str, str2, str4, image, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getExplicit() {
        return this.explicit;
    }

    public final AgnosticMetadataItem copy(String title, String subtitle, String uri, Image image, boolean explicit) {
        return new AgnosticMetadataItem(title, subtitle, uri, image, explicit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgnosticMetadataItem)) {
            return false;
        }
        AgnosticMetadataItem agnosticMetadataItem = (AgnosticMetadataItem) other;
        return wj50.m88271j(this.title, agnosticMetadataItem.title) && wj50.m88271j(this.subtitle, agnosticMetadataItem.subtitle) && wj50.m88271j(this.uri, agnosticMetadataItem.uri) && wj50.m88271j(this.image, agnosticMetadataItem.image) && this.explicit == agnosticMetadataItem.explicit;
    }

    public final boolean getExplicit() {
        return this.explicit;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Boolean.hashCode(this.explicit) + ((this.image.hashCode() + s571.m77243b(s571.m77243b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.uri)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
