package io.ably.lib.types;

/* JADX INFO: loaded from: classes16.dex */
public interface AsyncPaginatedResult<T> {
    void current(Callback<AsyncPaginatedResult<T>> callback);

    void first(Callback<AsyncPaginatedResult<T>> callback);

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    T[] items();

    void next(Callback<AsyncPaginatedResult<T>> callback);
}
