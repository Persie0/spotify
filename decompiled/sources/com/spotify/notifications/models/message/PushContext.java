package com.spotify.notifications.models.message;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJn\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0019\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001f\u0010\u0012R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0010\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0012R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0014\u001a\u0004\b&\u0010'¨\u0006)"}, m24212d2 = {"Lcom/spotify/notifications/models/message/PushContext;", "", "", "opportunityId", "messageId", "appDeviceId", "collapseKey", "pushRequestId", "feature", "", "featureData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/spotify/notifications/models/message/PushContext;", "a", "Ljava/lang/String;", "getOpportunityId", "()Ljava/lang/String;", "getOpportunityId$annotations", "()V", "b", "getMessageId", "getMessageId$annotations", "c", "getAppDeviceId", "getAppDeviceId$annotations", "d", "getCollapseKey", "getCollapseKey$annotations", "e", "getPushRequestId", "getPushRequestId$annotations", "f", "getFeature", "getFeature$annotations", "g", "Ljava/util/Map;", "getFeatureData", "()Ljava/util/Map;", "getFeatureData$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class PushContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String opportunityId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String messageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String appDeviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String collapseKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String pushRequestId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String feature;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Map featureData;

    public PushContext(@gk60(name = "opportunityId") String str, @gk60(name = "messageId") String str2, @gk60(name = "appDeviceId") String str3, @gk60(name = "collapse_key") String str4, @gk60(name = "pushRequestId") String str5, @gk60(name = "feature") String str6, @gk60(name = "featureData") Map<String, String> map) {
        this.opportunityId = str;
        this.messageId = str2;
        this.appDeviceId = str3;
        this.collapseKey = str4;
        this.pushRequestId = str5;
        this.feature = str6;
        this.featureData = map;
    }

    @gk60(name = "appDeviceId")
    public static /* synthetic */ void getAppDeviceId$annotations() {
    }

    @gk60(name = "collapse_key")
    public static /* synthetic */ void getCollapseKey$annotations() {
    }

    @gk60(name = "feature")
    public static /* synthetic */ void getFeature$annotations() {
    }

    @gk60(name = "featureData")
    public static /* synthetic */ void getFeatureData$annotations() {
    }

    @gk60(name = "messageId")
    public static /* synthetic */ void getMessageId$annotations() {
    }

    @gk60(name = "opportunityId")
    public static /* synthetic */ void getOpportunityId$annotations() {
    }

    @gk60(name = "pushRequestId")
    public static /* synthetic */ void getPushRequestId$annotations() {
    }

    public final PushContext copy(@gk60(name = "opportunityId") String opportunityId, @gk60(name = "messageId") String messageId, @gk60(name = "appDeviceId") String appDeviceId, @gk60(name = "collapse_key") String collapseKey, @gk60(name = "pushRequestId") String pushRequestId, @gk60(name = "feature") String feature, @gk60(name = "featureData") Map<String, String> featureData) {
        return new PushContext(opportunityId, messageId, appDeviceId, collapseKey, pushRequestId, feature, featureData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushContext)) {
            return false;
        }
        PushContext pushContext = (PushContext) obj;
        return wj50.m88271j(this.opportunityId, pushContext.opportunityId) && wj50.m88271j(this.messageId, pushContext.messageId) && wj50.m88271j(this.appDeviceId, pushContext.appDeviceId) && wj50.m88271j(this.collapseKey, pushContext.collapseKey) && wj50.m88271j(this.pushRequestId, pushContext.pushRequestId) && wj50.m88271j(this.feature, pushContext.feature) && wj50.m88271j(this.featureData, pushContext.featureData);
    }

    public final int hashCode() {
        String str = this.opportunityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.messageId;
        int iM77243b = s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.appDeviceId);
        String str3 = this.collapseKey;
        int iHashCode2 = (iM77243b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pushRequestId;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feature;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.featureData;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public /* synthetic */ PushContext(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : map);
    }
}
