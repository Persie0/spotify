package com.spotify.kidsview.p091v1.proto;

import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes7.dex */
public interface PlanMembershipOrBuilder extends sre0 {
    AddToPlanAction getAddAction();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getPlanLabel();

    gva getPlanLabelBytes();

    RemoveFromPlanAction getRemoveAction();

    boolean hasAddAction();

    boolean hasRemoveAction();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
