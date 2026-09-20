package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface HierarchyRequestOrBuilder extends sre0 {
    AddMembers getAddMembers();

    HierarchyRequest.ChrCase getChrCase();

    CreateNew getCreateNew();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    DeleteChannel getDeleteChannel();

    SetParticipationStatus getParticipationStatus();

    RemoveMember getRemoveMember();

    RenameGroup getRenameGroup();

    SetUserRole getUserRole();

    boolean hasAddMembers();

    boolean hasCreateNew();

    boolean hasDeleteChannel();

    boolean hasParticipationStatus();

    boolean hasRemoveMember();

    boolean hasRenameGroup();

    boolean hasUserRole();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
