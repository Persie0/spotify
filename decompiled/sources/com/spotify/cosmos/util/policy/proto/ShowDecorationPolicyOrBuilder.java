package com.spotify.cosmos.util.policy.proto;

import java.util.List;
import p204p.ntx;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface ShowDecorationPolicyOrBuilder extends sre0 {
    boolean getConsumptionOrder();

    boolean getCopyrights();

    boolean getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getDescription();

    ntx getExtension(int i);

    int getExtensionCount();

    List<ntx> getExtensionList();

    int getExtensionValue(int i);

    List<Integer> getExtensionValueList();

    boolean getFormatListAttributes();

    boolean getIsBook();

    boolean getIsCreatorChannel();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getLanguage();

    boolean getLink();

    boolean getMediaTypeEnum();

    boolean getName();

    boolean getNumEpisodes();

    boolean getPopularity();

    boolean getPublisher();

    boolean getTrailerUri();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
