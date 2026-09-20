package com.spotify.notifications.models.message;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/notifications/models/message/RichPushData;", "", "", "type", "version", "Lcom/spotify/notifications/models/message/RichPushFields;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/notifications/models/message/RichPushFields;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/notifications/models/message/RichPushFields;)Lcom/spotify/notifications/models/message/RichPushData;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getVersion", "getVersion$annotations", "c", "Lcom/spotify/notifications/models/message/RichPushFields;", "getFields", "()Lcom/spotify/notifications/models/message/RichPushFields;", "getFields$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class RichPushData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final RichPushFields fields;

    public RichPushData(@gk60(name = "type") String str, @gk60(name = "version") String str2, @gk60(name = "fields") RichPushFields richPushFields) {
        this.type = str;
        this.version = str2;
        this.fields = richPushFields;
    }

    @gk60(name = "fields")
    public static /* synthetic */ void getFields$annotations() {
    }

    @gk60(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    @gk60(name = "version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public final RichPushData copy(@gk60(name = "type") String type, @gk60(name = "version") String version, @gk60(name = "fields") RichPushFields fields) {
        return new RichPushData(type, version, fields);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichPushData)) {
            return false;
        }
        RichPushData richPushData = (RichPushData) obj;
        return wj50.m88271j(this.type, richPushData.type) && wj50.m88271j(this.version, richPushData.version) && wj50.m88271j(this.fields, richPushData.fields);
    }

    public final int hashCode() {
        return this.fields.hashCode() + s571.m77243b(this.type.hashCode() * 31, 31, this.version);
    }
}
