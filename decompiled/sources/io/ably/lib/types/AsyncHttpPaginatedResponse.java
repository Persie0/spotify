package io.ably.lib.types;

import com.google.gson.JsonElement;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AsyncHttpPaginatedResponse {
    public int errorCode;
    public String errorMessage;
    public Param[] headers;
    public int statusCode;
    public boolean success;

    public interface Callback {
        void onError(ErrorInfo errorInfo);

        void onResponse(AsyncHttpPaginatedResponse asyncHttpPaginatedResponse);
    }

    public abstract void current(Callback callback);

    public abstract void first(Callback callback);

    public abstract boolean hasCurrent();

    public abstract boolean hasFirst();

    public abstract boolean hasNext();

    public abstract JsonElement[] items();

    public abstract void next(Callback callback);
}
