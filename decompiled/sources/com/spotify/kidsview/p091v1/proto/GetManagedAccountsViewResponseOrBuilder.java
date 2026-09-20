package com.spotify.kidsview.p091v1.proto;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface GetManagedAccountsViewResponseOrBuilder extends sre0 {
    CreateNewManagedAccountAction getCreateNewManagedAccountAction();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    ManagedAccount getManagedAccounts(int i);

    int getManagedAccountsCount();

    List<ManagedAccount> getManagedAccountsList();

    int getMaxManagedAccountAge();

    boolean hasCreateNewManagedAccountAction();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
