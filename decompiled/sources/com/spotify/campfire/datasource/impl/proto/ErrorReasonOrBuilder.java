package com.spotify.campfire.datasource.impl.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface ErrorReasonOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDescription();

    gva getDescriptionBytes();

    ErrorReason.ECase getECase();

    ErrorReason.UserRole getFailedUser();

    int getFailedUserValue();

    ErrorReason.GroupsNotEnabled getGroupsNotEnabled();

    ErrorReason.JoinLimitExceeded getJoinLimitExceeded();

    ErrorReason.LinkExpired getLinkExpired();

    ErrorReason.MemberLimitExceeded getMemberLimitExceeded();

    ErrorReason.NotAnAdmin getNotAnAdmin();

    ErrorReason.NotTrusted getNotTrusted();

    ErrorReason.OptOut getOptOut();

    ErrorReason.ChatParticipationStatus getParticipationStatus();

    ErrorReason.RestrictedFromMessaging getRestrictedFromMessaging();

    ErrorReason.ShouldAssureAge getShouldAssureAge();

    ErrorReason.TooYoung getTooYoung();

    ErrorReason.UnreleasedMarket getUnreleasedMarket();

    ErrorReason.Unspecified getUnspecified();

    ErrorReason.UserBlocked getUserBlocked();

    ErrorReason.ViolativeContent getViolativeContent();

    boolean hasGroupsNotEnabled();

    boolean hasJoinLimitExceeded();

    boolean hasLinkExpired();

    boolean hasMemberLimitExceeded();

    boolean hasNotAnAdmin();

    boolean hasNotTrusted();

    boolean hasOptOut();

    boolean hasParticipationStatus();

    boolean hasRestrictedFromMessaging();

    boolean hasShouldAssureAge();

    boolean hasTooYoung();

    boolean hasUnreleasedMarket();

    boolean hasUnspecified();

    boolean hasUserBlocked();

    boolean hasViolativeContent();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
