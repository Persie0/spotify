package com.spotify.mobius.internal_util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ImmutableUtil {
    /* JADX INFO: renamed from: a */
    public static void m15646a() {
        Set set = Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: b */
    public static Set m15647b(Set set) {
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return Collections.unmodifiableSet(new HashSet(set));
    }
}
