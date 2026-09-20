package com.spotify.jam.internal.socialconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.w301;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\r\u0010\u0014R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionUpdate;", "", "Lcom/spotify/jam/internal/socialconnect/models/Session;", "session", "Lp/w301;", "reason", "", "Lcom/spotify/jam/internal/socialconnect/models/SessionMember;", "updateSessionMembers", "<init>", "(Lcom/spotify/jam/internal/socialconnect/models/Session;Lp/w301;Ljava/util/List;)V", "copy", "(Lcom/spotify/jam/internal/socialconnect/models/Session;Lp/w301;Ljava/util/List;)Lcom/spotify/jam/internal/socialconnect/models/SessionUpdate;", "a", "Lcom/spotify/jam/internal/socialconnect/models/Session;", "b", "()Lcom/spotify/jam/internal/socialconnect/models/Session;", "getSession$annotations", "()V", "Lp/w301;", "()Lp/w301;", "getReason$annotations", "c", "Ljava/util/List;", "()Ljava/util/List;", "getUpdateSessionMembers$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SessionUpdate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Session session;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final w301 reason;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List updateSessionMembers;

    static {
        new SessionUpdate(null, null, null, 7, null);
    }

    public SessionUpdate(@gk60(name = "session") Session session, @gk60(name = "reason") w301 w301Var, @gk60(name = "update_session_members") List<SessionMember> list) {
        this.session = session;
        this.reason = w301Var;
        this.updateSessionMembers = list;
    }

    @gk60(name = "reason")
    public static /* synthetic */ void getReason$annotations() {
    }

    @gk60(name = "session")
    public static /* synthetic */ void getSession$annotations() {
    }

    @gk60(name = "update_session_members")
    public static /* synthetic */ void getUpdateSessionMembers$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w301 getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getUpdateSessionMembers() {
        return this.updateSessionMembers;
    }

    public final SessionUpdate copy(@gk60(name = "session") Session session, @gk60(name = "reason") w301 reason, @gk60(name = "update_session_members") List<SessionMember> updateSessionMembers) {
        return new SessionUpdate(session, reason, updateSessionMembers);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionUpdate)) {
            return false;
        }
        SessionUpdate sessionUpdate = (SessionUpdate) obj;
        return wj50.m88271j(this.session, sessionUpdate.session) && this.reason == sessionUpdate.reason && wj50.m88271j(this.updateSessionMembers, sessionUpdate.updateSessionMembers);
    }

    public final int hashCode() {
        Session session = this.session;
        int iHashCode = (session == null ? 0 : session.hashCode()) * 31;
        w301 w301Var = this.reason;
        int iHashCode2 = (iHashCode + (w301Var == null ? 0 : w301Var.hashCode())) * 31;
        List list = this.updateSessionMembers;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public /* synthetic */ SessionUpdate(Session session, w301 w301Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : session, (i & 2) != 0 ? null : w301Var, (i & 4) != 0 ? null : list);
    }
}
