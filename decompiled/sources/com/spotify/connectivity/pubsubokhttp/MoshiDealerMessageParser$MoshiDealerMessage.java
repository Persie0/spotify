package com.spotify.connectivity.pubsubokhttp;

import java.util.Map;
import kotlin.Metadata;
import p204p.gk60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ|\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0012\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u0014R.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0016\u001a\u0004\b%\u0010&R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0012\u0012\u0004\b*\u0010\u0016\u001a\u0004\b)\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0012\u0012\u0004\b-\u0010\u0016\u001a\u0004\b,\u0010\u0014¨\u0006."}, m24212d2 = {"com/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessage", "", "", "type", "method", "uri", "messageIdent", "key", "", "headers", "payloads", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/connectivity/pubsubokhttp/MoshiDealerMessageParser$MoshiDealerMessage;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getMethod", "getMethod$annotations", "c", "getUri", "getUri$annotations", "d", "getMessageIdent", "getMessageIdent$annotations", "e", "getKey", "getKey$annotations", "f", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "getHeaders$annotations", "g", "getPayloads", "getPayloads$annotations", "h", "getPayload", "getPayload$annotations", "src_main_java_com_spotify_connectivity_pubsubokhttp-pubsubokhttp"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class MoshiDealerMessageParser$MoshiDealerMessage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String method;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String messageIdent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String key;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Map headers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String payloads;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String payload;

    public MoshiDealerMessageParser$MoshiDealerMessage(@gk60(name = "type") String str, @gk60(name = "method") String str2, @gk60(name = "uri") String str3, @gk60(name = "message_ident") String str4, @gk60(name = "key") String str5, @gk60(name = "headers") Map<String, String> map, @gk60(name = "payloads") String str6, @gk60(name = "payload") String str7) {
        this.type = str;
        this.method = str2;
        this.uri = str3;
        this.messageIdent = str4;
        this.key = str5;
        this.headers = map;
        this.payloads = str6;
        this.payload = str7;
    }

    @gk60(name = "headers")
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @gk60(name = "key")
    public static /* synthetic */ void getKey$annotations() {
    }

    @gk60(name = "message_ident")
    public static /* synthetic */ void getMessageIdent$annotations() {
    }

    @gk60(name = "method")
    public static /* synthetic */ void getMethod$annotations() {
    }

    @gk60(name = "payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @gk60(name = "payloads")
    public static /* synthetic */ void getPayloads$annotations() {
    }

    @gk60(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    public final MoshiDealerMessageParser$MoshiDealerMessage copy(@gk60(name = "type") String type, @gk60(name = "method") String method, @gk60(name = "uri") String uri, @gk60(name = "message_ident") String messageIdent, @gk60(name = "key") String key, @gk60(name = "headers") Map<String, String> headers, @gk60(name = "payloads") String payloads, @gk60(name = "payload") String payload) {
        return new MoshiDealerMessageParser$MoshiDealerMessage(type, method, uri, messageIdent, key, headers, payloads, payload);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoshiDealerMessageParser$MoshiDealerMessage)) {
            return false;
        }
        MoshiDealerMessageParser$MoshiDealerMessage moshiDealerMessageParser$MoshiDealerMessage = (MoshiDealerMessageParser$MoshiDealerMessage) obj;
        return wj50.m88271j(this.type, moshiDealerMessageParser$MoshiDealerMessage.type) && wj50.m88271j(this.method, moshiDealerMessageParser$MoshiDealerMessage.method) && wj50.m88271j(this.uri, moshiDealerMessageParser$MoshiDealerMessage.uri) && wj50.m88271j(this.messageIdent, moshiDealerMessageParser$MoshiDealerMessage.messageIdent) && wj50.m88271j(this.key, moshiDealerMessageParser$MoshiDealerMessage.key) && wj50.m88271j(this.headers, moshiDealerMessageParser$MoshiDealerMessage.headers) && wj50.m88271j(this.payloads, moshiDealerMessageParser$MoshiDealerMessage.payloads) && wj50.m88271j(this.payload, moshiDealerMessageParser$MoshiDealerMessage.payload);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uri;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.messageIdent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.key;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.headers;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.payloads;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payload;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }
}
