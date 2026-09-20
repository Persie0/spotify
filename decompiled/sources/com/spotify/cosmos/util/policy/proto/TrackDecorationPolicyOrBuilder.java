package com.spotify.cosmos.util.policy.proto;

import java.util.List;
import p204p.ntx;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes.dex */
public interface TrackDecorationPolicyOrBuilder extends sre0 {
    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    boolean getDiscNumber();

    ntx getExtension(int i);

    int getExtensionCount();

    List<ntx> getExtensionList();

    int getExtensionValue(int i);

    List<Integer> getExtensionValueList();

    boolean getHasLyrics();

    boolean getIs19PlusOnly();

    boolean getIsAvailableInMetadataCatalogue();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsLocal();

    boolean getIsPremiumOnly();

    boolean getLength();

    boolean getLink();

    boolean getLocallyPlayable();

    boolean getName();

    boolean getPlayable();

    boolean getPlayableLocalTrack();

    boolean getPlayableTrackLink();

    boolean getPopularity();

    boolean getPreviewId();

    boolean getToBeObfuscated();

    boolean getTrackDescriptors();

    boolean getTrackNumber();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
