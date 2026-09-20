package io.ably.lib.types;

/* JADX INFO: loaded from: classes16.dex */
public interface PaginatedResult<T> {
    PaginatedResult<T> current();

    PaginatedResult<T> first();

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    boolean isLast();

    T[] items();

    PaginatedResult<T> next();
}
