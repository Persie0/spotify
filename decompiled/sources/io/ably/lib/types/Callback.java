package io.ably.lib.types;

/* JADX INFO: loaded from: classes15.dex */
public interface Callback<T> {

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Map<T, U> implements Callback<T> {
        private final Callback<U> callback;

        public Map(Callback<U> callback) {
            this.callback = callback;
        }

        public abstract U map(T t);

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(T t) {
            this.callback.onSuccess(map(t));
        }
    }

    void onError(ErrorInfo errorInfo);

    void onSuccess(T t);
}
