package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface GroupOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    GroupMember getGroupMember(int i);

    int getGroupMemberCount();

    List<GroupMember> getGroupMemberList();

    InviteToken getInviteToken(int i);

    int getInviteTokenCount();

    List<InviteToken> getInviteTokenList();

    String getName();

    gva getNameBytes();

    boolean hasName();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
