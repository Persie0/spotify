package com.spotify.esperanto.esperantoimpl;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086 ¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u0005R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/esperanto/esperantoimpl/NativeObserver;", "", "T", "Lio/reactivex/rxjava3/core/Observer;", "<init>", "()V", "Lp/w2a1;", "invalidate", "Lio/reactivex/rxjava3/disposables/Disposable;", "disposable", "onSubscribe", "(Lio/reactivex/rxjava3/disposables/Disposable;)V", "data", "onNext", "(Ljava/lang/Object;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "handleOnNext", "destroy", "", "nThis", "J", "getNThis$annotations", "", "isInvalidated", "Z", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeObserver<T> implements Observer<T> {
    private boolean isInvalidated;
    private final long nThis;

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();

    public final native void handleOnNext(T data);

    public final void invalidate() {
        this.isInvalidated = true;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable error) {
        throw new RuntimeException("Calling onError into NativeObserver is not supported, as esperanto does not know how to translate this error into something it can return. Please catch this error and return an appropriate error signal instead.");
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T data) {
        if (this.isInvalidated) {
            throw new RuntimeException("onNext was called after invalidation, ensure the invalidation/destruction happens on the same thread as onNext is being called - typically regulated via 'observeOn'");
        }
        handleOnNext(data);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public native void onSubscribe(Disposable disposable);
}
