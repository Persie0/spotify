package com.spotify.voiceassistants.playermodels;

import java.util.List;
import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/AgnosticResponse;", "", "utteranceId", "", "utterance", "firstIsActive", "", "contextUri", "items", "", "Lcom/spotify/voiceassistants/playermodels/AgnosticMetadataItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getUtteranceId", "()Ljava/lang/String;", "getUtterance", "getFirstIsActive", "()Z", "getContextUri", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class AgnosticResponse {
    private final String contextUri;
    private final boolean firstIsActive;
    private final List<AgnosticMetadataItem> items;
    private final String utterance;
    private final String utteranceId;

    public AgnosticResponse(String str, String str2, boolean z, String str3, List<AgnosticMetadataItem> list) {
        this.utteranceId = str;
        this.utterance = str2;
        this.firstIsActive = z;
        this.contextUri = str3;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgnosticResponse copy$default(AgnosticResponse agnosticResponse, String str, String str2, boolean z, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agnosticResponse.utteranceId;
        }
        if ((i & 2) != 0) {
            str2 = agnosticResponse.utterance;
        }
        if ((i & 4) != 0) {
            z = agnosticResponse.firstIsActive;
        }
        if ((i & 8) != 0) {
            str3 = agnosticResponse.contextUri;
        }
        if ((i & 16) != 0) {
            list = agnosticResponse.items;
        }
        List list2 = list;
        boolean z2 = z;
        return agnosticResponse.copy(str, str2, z2, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUtteranceId() {
        return this.utteranceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUtterance() {
        return this.utterance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFirstIsActive() {
        return this.firstIsActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContextUri() {
        return this.contextUri;
    }

    public final List<AgnosticMetadataItem> component5() {
        return this.items;
    }

    public final AgnosticResponse copy(String utteranceId, String utterance, boolean firstIsActive, String contextUri, List<AgnosticMetadataItem> items) {
        return new AgnosticResponse(utteranceId, utterance, firstIsActive, contextUri, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgnosticResponse)) {
            return false;
        }
        AgnosticResponse agnosticResponse = (AgnosticResponse) other;
        return wj50.m88271j(this.utteranceId, agnosticResponse.utteranceId) && wj50.m88271j(this.utterance, agnosticResponse.utterance) && this.firstIsActive == agnosticResponse.firstIsActive && wj50.m88271j(this.contextUri, agnosticResponse.contextUri) && wj50.m88271j(this.items, agnosticResponse.items);
    }

    public final String getContextUri() {
        return this.contextUri;
    }

    public final boolean getFirstIsActive() {
        return this.firstIsActive;
    }

    public final List<AgnosticMetadataItem> getItems() {
        return this.items;
    }

    public final String getUtterance() {
        return this.utterance;
    }

    public final String getUtteranceId() {
        return this.utteranceId;
    }

    public int hashCode() {
        return this.items.hashCode() + s571.m77243b(s571.m77245d(s571.m77243b(this.utteranceId.hashCode() * 31, 31, this.utterance), 31, this.firstIsActive), 31, this.contextUri);
    }

    public String toString() {
        return super.toString();
    }
}
