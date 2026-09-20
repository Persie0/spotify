package com.spotify.campfire.datasource.impl.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes5.dex */
public interface MessageRequestOrBuilder extends sre0 {
    AddActivity getAddActivity();

    AddContribution getAddContribution();

    AddContributionForGroup getAddContributionForGroup();

    MessageRequest.CmrCase getCmrCase();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    DeleteActivity getDeleteActivity();

    DeleteContribution getDeleteContribution();

    ModifyContribution getModifyContribution();

    boolean hasAddActivity();

    boolean hasAddContribution();

    boolean hasAddContributionForGroup();

    boolean hasDeleteActivity();

    boolean hasDeleteContribution();

    boolean hasModifyContribution();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
