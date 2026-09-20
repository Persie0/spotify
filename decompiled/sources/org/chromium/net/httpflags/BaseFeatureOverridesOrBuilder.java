package org.chromium.net.httpflags;

import java.util.Map;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes11.dex */
public interface BaseFeatureOverridesOrBuilder extends sre0 {
    boolean containsFeatureStates(String str);

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    @Deprecated
    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStates();

    int getFeatureStatesCount();

    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStatesMap();

    BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(String str, BaseFeatureOverrides.FeatureState featureState);

    BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(String str);

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
