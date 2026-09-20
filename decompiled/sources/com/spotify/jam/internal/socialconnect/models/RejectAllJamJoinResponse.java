package com.spotify.jam.internal.socialconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/RejectAllJamJoinResponse;", "", "", "", "joinAttemptIds", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/spotify/jam/internal/socialconnect/models/RejectAllJamJoinResponse;", "a", "Ljava/util/List;", "getJoinAttemptIds", "()Ljava/util/List;", "getJoinAttemptIds$annotations", "()V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class RejectAllJamJoinResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List joinAttemptIds;

    public RejectAllJamJoinResponse(@gk60(name = "join_attempt_ids") List<String> list) {
        this.joinAttemptIds = list;
    }

    @gk60(name = "join_attempt_ids")
    public static /* synthetic */ void getJoinAttemptIds$annotations() {
    }

    public final RejectAllJamJoinResponse copy(@gk60(name = "join_attempt_ids") List<String> joinAttemptIds) {
        return new RejectAllJamJoinResponse(joinAttemptIds);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RejectAllJamJoinResponse) && wj50.m88271j(this.joinAttemptIds, ((RejectAllJamJoinResponse) obj).joinAttemptIds);
    }

    public final int hashCode() {
        List list = this.joinAttemptIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public /* synthetic */ RejectAllJamJoinResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
