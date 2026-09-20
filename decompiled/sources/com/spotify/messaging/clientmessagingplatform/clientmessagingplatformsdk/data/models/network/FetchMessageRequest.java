package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network;

import java.util.List;
import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageRequest;", "", "locale", "", "triggerType", "triggerPatterns", "", "entityUri", "opportunityId", "purchaseAllowed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getLocale", "()Ljava/lang/String;", "getTriggerType", "getTriggerPatterns", "()Ljava/util/List;", "getEntityUri", "getOpportunityId", "getPurchaseAllowed", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class FetchMessageRequest {
    public static final int $stable = 0;
    private final String entityUri;
    private final String locale;
    private final String opportunityId;
    private final boolean purchaseAllowed;
    private final List<String> triggerPatterns;
    private final String triggerType;

    public FetchMessageRequest(String str, String str2, List<String> list, String str3, String str4, boolean z) {
        this.locale = str;
        this.triggerType = str2;
        this.triggerPatterns = list;
        this.entityUri = str3;
        this.opportunityId = str4;
        this.purchaseAllowed = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchMessageRequest copy$default(FetchMessageRequest fetchMessageRequest, String str, String str2, List list, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchMessageRequest.locale;
        }
        if ((i & 2) != 0) {
            str2 = fetchMessageRequest.triggerType;
        }
        if ((i & 4) != 0) {
            list = fetchMessageRequest.triggerPatterns;
        }
        if ((i & 8) != 0) {
            str3 = fetchMessageRequest.entityUri;
        }
        if ((i & 16) != 0) {
            str4 = fetchMessageRequest.opportunityId;
        }
        if ((i & 32) != 0) {
            z = fetchMessageRequest.purchaseAllowed;
        }
        String str5 = str4;
        boolean z2 = z;
        return fetchMessageRequest.copy(str, str2, list, str3, str5, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTriggerType() {
        return this.triggerType;
    }

    public final List<String> component3() {
        return this.triggerPatterns;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntityUri() {
        return this.entityUri;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPurchaseAllowed() {
        return this.purchaseAllowed;
    }

    public final FetchMessageRequest copy(String locale, String triggerType, List<String> triggerPatterns, String entityUri, String opportunityId, boolean purchaseAllowed) {
        return new FetchMessageRequest(locale, triggerType, triggerPatterns, entityUri, opportunityId, purchaseAllowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchMessageRequest)) {
            return false;
        }
        FetchMessageRequest fetchMessageRequest = (FetchMessageRequest) other;
        return wj50.m88271j(this.locale, fetchMessageRequest.locale) && wj50.m88271j(this.triggerType, fetchMessageRequest.triggerType) && wj50.m88271j(this.triggerPatterns, fetchMessageRequest.triggerPatterns) && wj50.m88271j(this.entityUri, fetchMessageRequest.entityUri) && wj50.m88271j(this.opportunityId, fetchMessageRequest.opportunityId) && this.purchaseAllowed == fetchMessageRequest.purchaseAllowed;
    }

    public final String getEntityUri() {
        return this.entityUri;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public final boolean getPurchaseAllowed() {
        return this.purchaseAllowed;
    }

    public final List<String> getTriggerPatterns() {
        return this.triggerPatterns;
    }

    public final String getTriggerType() {
        return this.triggerType;
    }

    public int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.locale.hashCode() * 31, 31, this.triggerType), 31, this.triggerPatterns);
        String str = this.entityUri;
        return Boolean.hashCode(this.purchaseAllowed) + s571.m77243b((iM77244c + (str == null ? 0 : str.hashCode())) * 31, 31, this.opportunityId);
    }

    public String toString() {
        return super.toString();
    }
}
