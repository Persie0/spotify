package org.chromium.net.httpflags;

import java.util.Map;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes11.dex */
public interface FlagsOrBuilder extends sre0 {
    boolean containsFlags(String str);

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    @Deprecated
    Map<String, FlagValue> getFlags();

    int getFlagsCount();

    Map<String, FlagValue> getFlagsMap();

    FlagValue getFlagsOrDefault(String str, FlagValue flagValue);

    FlagValue getFlagsOrThrow(String str);

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
