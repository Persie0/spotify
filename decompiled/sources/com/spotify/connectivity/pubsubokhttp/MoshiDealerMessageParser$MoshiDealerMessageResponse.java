package com.spotify.connectivity.pubsubokhttp;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, m24212d2 = {"com/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessageResponse", "", "", "type", "key", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessageResponse;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessageResponse;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getKey", "getKey$annotations", "c", "getPayload", "getPayload$annotations", "src_main_java_com_spotify_connectivity_pubsubokhttp-pubsubokhttp"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class MoshiDealerMessageParser$MoshiDealerMessageResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String payload;

    public MoshiDealerMessageParser$MoshiDealerMessageResponse(@gk60(name = "type") String str, @gk60(name = "key") String str2, @gk60(name = "payload") String str3) {
        this.type = str;
        this.key = str2;
        this.payload = str3;
    }

    @gk60(name = "key")
    public static /* synthetic */ void getKey$annotations() {
    }

    @gk60(name = "payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @gk60(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public final MoshiDealerMessageParser$MoshiDealerMessageResponse copy(@gk60(name = "type") String type, @gk60(name = "key") String key, @gk60(name = "payload") String payload) {
        return new MoshiDealerMessageParser$MoshiDealerMessageResponse(type, key, payload);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoshiDealerMessageParser$MoshiDealerMessageResponse)) {
            return false;
        }
        MoshiDealerMessageParser$MoshiDealerMessageResponse moshiDealerMessageParser$MoshiDealerMessageResponse = (MoshiDealerMessageParser$MoshiDealerMessageResponse) obj;
        return wj50.m88271j(this.type, moshiDealerMessageParser$MoshiDealerMessageResponse.type) && wj50.m88271j(this.key, moshiDealerMessageParser$MoshiDealerMessageResponse.key) && wj50.m88271j(this.payload, moshiDealerMessageParser$MoshiDealerMessageResponse.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + s571.m77243b(this.type.hashCode() * 31, 31, this.key);
    }
}
