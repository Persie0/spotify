package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/VoiceAssistantLoggingContext;", "", "packageId", "", "requestedUri", "interactionId", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageId", "()Ljava/lang/String;", "getRequestedUri", "getInteractionId", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class VoiceAssistantLoggingContext {
    private final String interactionId;
    private final String packageId;
    private final String requestedUri;
    private final String userId;

    public VoiceAssistantLoggingContext(String str, String str2, String str3, String str4) {
        this.packageId = str;
        this.requestedUri = str2;
        this.interactionId = str3;
        this.userId = str4;
    }

    public static /* synthetic */ VoiceAssistantLoggingContext copy$default(VoiceAssistantLoggingContext voiceAssistantLoggingContext, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceAssistantLoggingContext.packageId;
        }
        if ((i & 2) != 0) {
            str2 = voiceAssistantLoggingContext.requestedUri;
        }
        if ((i & 4) != 0) {
            str3 = voiceAssistantLoggingContext.interactionId;
        }
        if ((i & 8) != 0) {
            str4 = voiceAssistantLoggingContext.userId;
        }
        return voiceAssistantLoggingContext.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestedUri() {
        return this.requestedUri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInteractionId() {
        return this.interactionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final VoiceAssistantLoggingContext copy(String packageId, String requestedUri, String interactionId, String userId) {
        return new VoiceAssistantLoggingContext(packageId, requestedUri, interactionId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceAssistantLoggingContext)) {
            return false;
        }
        VoiceAssistantLoggingContext voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) other;
        return wj50.m88271j(this.packageId, voiceAssistantLoggingContext.packageId) && wj50.m88271j(this.requestedUri, voiceAssistantLoggingContext.requestedUri) && wj50.m88271j(this.interactionId, voiceAssistantLoggingContext.interactionId) && wj50.m88271j(this.userId, voiceAssistantLoggingContext.userId);
    }

    public final String getInteractionId() {
        return this.interactionId;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final String getRequestedUri() {
        return this.requestedUri;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM77243b = s571.m77243b(this.packageId.hashCode() * 31, 31, this.requestedUri);
        String str = this.interactionId;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceAssistantLoggingContext(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
