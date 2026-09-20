package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AskToJoinResponse;", "", "Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "activeJoinRequest", "<init>", "(Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;)V", "copy", "(Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;)Lcom/spotify/jam/internal/socialconnect/models/AskToJoinResponse;", "a", "Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "getActiveJoinRequest", "()Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "getActiveJoinRequest$annotations", "()V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AskToJoinResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ActiveJoinRequest activeJoinRequest;

    public AskToJoinResponse(@gk60(name = "active_join_request") ActiveJoinRequest activeJoinRequest) {
        this.activeJoinRequest = activeJoinRequest;
    }

    @gk60(name = "active_join_request")
    public static /* synthetic */ void getActiveJoinRequest$annotations() {
    }

    public final AskToJoinResponse copy(@gk60(name = "active_join_request") ActiveJoinRequest activeJoinRequest) {
        return new AskToJoinResponse(activeJoinRequest);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AskToJoinResponse) && wj50.m88271j(this.activeJoinRequest, ((AskToJoinResponse) obj).activeJoinRequest);
    }

    public final int hashCode() {
        return this.activeJoinRequest.hashCode();
    }
}
