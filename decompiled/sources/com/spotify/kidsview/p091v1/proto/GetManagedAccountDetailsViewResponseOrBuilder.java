package com.spotify.kidsview.p091v1.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface GetManagedAccountDetailsViewResponseOrBuilder extends sre0 {
    AccountType getAccountType();

    int getAccountTypeValue();

    String getChildId();

    gva getChildIdBytes();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    DeleteAction getDeleteAction();

    GraduationBanner getGraduationBanner();

    boolean getHasAudiobooksAvailable();

    ParentalControls getParentalControls();

    PlanMembership getPlanMembership();

    ManagedAccountProfile getProfile();

    boolean hasDeleteAction();

    boolean hasGraduationBanner();

    boolean hasParentalControls();

    boolean hasPlanMembership();

    boolean hasProfile();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
