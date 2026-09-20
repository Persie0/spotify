package com.spotify.mobius;

import com.spotify.mobius.internal_util.ImmutableUtil;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class First<M, F> {
    /* JADX INFO: renamed from: b */
    public static First m15574b(Object obj) {
        ImmutableUtil.m15646a();
        return new AutoValue_First(obj, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: c */
    public static First m15575c(Object obj, Set set) {
        return new AutoValue_First(obj, set);
    }

    /* JADX INFO: renamed from: a */
    public abstract Set mo15559a();

    /* JADX INFO: renamed from: d */
    public abstract Object mo15560d();
}
