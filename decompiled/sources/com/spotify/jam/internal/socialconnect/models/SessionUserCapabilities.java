package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;", "", "", "invite", "removeParticipants", "manageParticipantSettings", "askToUpgrade", "<init>", "(ZZZZ)V", "copy", "(ZZZZ)Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;", "a", "Z", "getInvite", "()Z", "getInvite$annotations", "()V", "b", "getRemoveParticipants", "getRemoveParticipants$annotations", "c", "getManageParticipantSettings", "getManageParticipantSettings$annotations", "d", "getAskToUpgrade", "getAskToUpgrade$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SessionUserCapabilities {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean invite;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean removeParticipants;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean manageParticipantSettings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean askToUpgrade;

    public SessionUserCapabilities(@gk60(name = "invite") boolean z, @gk60(name = "remove_participants") boolean z2, @gk60(name = "manage_participant_settings") boolean z3, @gk60(name = "ask_to_upgrade") boolean z4) {
        this.invite = z;
        this.removeParticipants = z2;
        this.manageParticipantSettings = z3;
        this.askToUpgrade = z4;
    }

    @gk60(name = "ask_to_upgrade")
    public static /* synthetic */ void getAskToUpgrade$annotations() {
    }

    @gk60(name = "invite")
    public static /* synthetic */ void getInvite$annotations() {
    }

    @gk60(name = "manage_participant_settings")
    public static /* synthetic */ void getManageParticipantSettings$annotations() {
    }

    @gk60(name = "remove_participants")
    public static /* synthetic */ void getRemoveParticipants$annotations() {
    }

    public final SessionUserCapabilities copy(@gk60(name = "invite") boolean invite, @gk60(name = "remove_participants") boolean removeParticipants, @gk60(name = "manage_participant_settings") boolean manageParticipantSettings, @gk60(name = "ask_to_upgrade") boolean askToUpgrade) {
        return new SessionUserCapabilities(invite, removeParticipants, manageParticipantSettings, askToUpgrade);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionUserCapabilities)) {
            return false;
        }
        SessionUserCapabilities sessionUserCapabilities = (SessionUserCapabilities) obj;
        return this.invite == sessionUserCapabilities.invite && this.removeParticipants == sessionUserCapabilities.removeParticipants && this.manageParticipantSettings == sessionUserCapabilities.manageParticipantSettings && this.askToUpgrade == sessionUserCapabilities.askToUpgrade;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.askToUpgrade) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.invite) * 31, 31, this.removeParticipants), 31, this.manageParticipantSettings);
    }

    public /* synthetic */ SessionUserCapabilities(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
