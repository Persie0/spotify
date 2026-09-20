package com.spotify.kidsview.p091v1.proto;

import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface GetDeleteManagedAccountViewResponseOrBuilder extends sre0 {
    AccountType getAccountType();

    int getAccountTypeValue();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    DeletePlanDetails getPlanDetails();

    boolean hasPlanDetails();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
