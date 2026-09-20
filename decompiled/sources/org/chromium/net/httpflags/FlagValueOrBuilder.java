package org.chromium.net.httpflags;

import java.util.List;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes11.dex */
public interface FlagValueOrBuilder extends sre0 {
    FlagValue.ConstrainedValue getConstrainedValues(int i);

    int getConstrainedValuesCount();

    List<FlagValue.ConstrainedValue> getConstrainedValuesList();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
