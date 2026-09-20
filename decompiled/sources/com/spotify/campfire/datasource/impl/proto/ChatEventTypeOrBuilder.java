package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ChatEventTypeOrBuilder extends sre0 {
    ChatEventType.CetCase getCetCase();

    CreateEvent getCreateEvent();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    InviteLinkEvent getInviteLink();

    JoinEvent getJoinEvent();

    LeaveEvent getLeaveEvent();

    NameChangeEvent getNameChange();

    NewAdminEvent getNewAdminEvent();

    PhotoChangeEvent getPhotoChange();

    RemoveUserEvent getRemoveUser();

    ReportChatEvent getReportChatEvent();

    InviteEvent getUserInvite();

    boolean hasCreateEvent();

    boolean hasInviteLink();

    boolean hasJoinEvent();

    boolean hasLeaveEvent();

    boolean hasNameChange();

    boolean hasNewAdminEvent();

    boolean hasPhotoChange();

    boolean hasRemoveUser();

    boolean hasReportChatEvent();

    boolean hasUserInvite();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
