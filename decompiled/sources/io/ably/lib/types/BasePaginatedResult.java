package io.ably.lib.types;

import p204p.nf30;

/* JADX INFO: loaded from: classes16.dex */
public interface BasePaginatedResult<T> {
    nf30 current();

    nf30 first();

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    boolean isLast();

    T[] items();

    nf30 next();
}
