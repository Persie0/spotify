package com.spotify.esperanto.esperantoimpl;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u000e\u0010\u0005J\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/esperanto/esperantoimpl/NativeSingleObserver;", "", "T", "Lio/reactivex/rxjava3/core/SingleObserver;", "<init>", "()V", "data", "Lp/w2a1;", "handleOnSuccess", "(Ljava/lang/Object;)V", "", "error", "handleOnError", "(Ljava/lang/Throwable;)V", "destroy", "invalidate", "Lio/reactivex/rxjava3/disposables/Disposable;", "disposable", "onSubscribe", "(Lio/reactivex/rxjava3/disposables/Disposable;)V", "onSuccess", "onError", "", "nThis", "J", "getNThis$annotations", "lock", "Ljava/lang/Object;", "", "isInvalidated", "Z", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeSingleObserver<T> implements SingleObserver<T> {
    private boolean isInvalidated;
    private final Object lock = new Object();
    private final long nThis;

    private final native void destroy();

    private static /* synthetic */ void getNThis$annotations() {
    }

    private final native void handleOnError(Throwable error);

    private final native void handleOnSuccess(T data);

    public final void invalidate() {
        synchronized (this.lock) {
            this.isInvalidated = true;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onError(Throwable error) {
        synchronized (this.lock) {
            if (this.isInvalidated) {
                return;
            }
            handleOnError(error);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public native void onSubscribe(Disposable disposable);

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T data) {
        synchronized (this.lock) {
            if (this.isInvalidated) {
                return;
            }
            handleOnSuccess(data);
        }
    }
}
