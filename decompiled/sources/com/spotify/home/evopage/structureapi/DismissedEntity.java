package com.spotify.home.evopage.structureapi;

import androidx.annotation.Keep;
import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/home/evopage/structureapi/DismissedEntity;", "", "id", "", "type", "Lcom/spotify/home/evopage/structureapi/DismissedEntity$Type;", "<init>", "(Ljava/lang/String;Lcom/spotify/home/evopage/structureapi/DismissedEntity$Type;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/spotify/home/evopage/structureapi/DismissedEntity$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "src_main_java_com_spotify_home_evopage_structureapi-structureapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class DismissedEntity {
    private final String id;
    private final Type type;

    @Keep
    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/home/evopage/structureapi/DismissedEntity$Type;", "", "<init>", "(Ljava/lang/String;I)V", "MARKED_AS_PLAYED", "EXPLICIT_FEEDBACK", "ONBOARDING", "RECENTS", "SHOWCASE", "VERTICAL_VIDEO_CARD", "RECENTLY_PLAYED", "INLINE_CARD", "src_main_java_com_spotify_home_evopage_structureapi-structureapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public enum Type {
        MARKED_AS_PLAYED,
        EXPLICIT_FEEDBACK,
        ONBOARDING,
        RECENTS,
        SHOWCASE,
        VERTICAL_VIDEO_CARD,
        RECENTLY_PLAYED,
        INLINE_CARD;

        private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

        public static lzv getEntries() {
            return $ENTRIES;
        }
    }

    public DismissedEntity(String str, Type type) {
        this.id = str;
        this.type = type;
    }

    public static /* synthetic */ DismissedEntity copy$default(DismissedEntity dismissedEntity, String str, Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dismissedEntity.id;
        }
        if ((i & 2) != 0) {
            type = dismissedEntity.type;
        }
        return dismissedEntity.copy(str, type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final DismissedEntity copy(String id, Type type) {
        return new DismissedEntity(id, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DismissedEntity)) {
            return false;
        }
        DismissedEntity dismissedEntity = (DismissedEntity) other;
        return wj50.m88271j(this.id, dismissedEntity.id) && this.type == dismissedEntity.type;
    }

    public final String getId() {
        return this.id;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }
}
