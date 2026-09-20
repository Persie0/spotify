package com.spotify.offline;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.Metadata;
import p204p.qmx;
import p204p.qwi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/offline/NativeForegroundProvider;", "", "Lio/reactivex/rxjava3/core/Observable;", "", "foreground", "<init>", "(Lio/reactivex/rxjava3/core/Observable;)V", "Lcom/spotify/offline/NativeForegroundObserver;", "observer", "Lp/w2a1;", "observe", "(Lcom/spotify/offline/NativeForegroundObserver;)V", ContextTrack.TrackAction.STOP, "()V", "Lio/reactivex/rxjava3/core/Observable;", "getForeground", "()Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/disposables/Disposable;", "subscription", "Lio/reactivex/rxjava3/disposables/Disposable;", "Companion", "p/qwi0", "src_main_java_com_spotify_offline_offline-offline"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeForegroundProvider {
    public static final qwi0 Companion = new qwi0();
    private final Observable<Boolean> foreground;
    private Disposable subscription = EmptyDisposable.f7220a;

    public NativeForegroundProvider(Observable<Boolean> observable) {
        this.foreground = observable;
    }

    public static final NativeForegroundProvider noop() {
        Companion.getClass();
        return new NativeForegroundProvider(Observable.empty());
    }

    public final Observable<Boolean> getForeground() {
        return this.foreground;
    }

    public final void observe(NativeForegroundObserver observer) {
        this.subscription = this.foreground.subscribe(new qmx(observer, 16));
    }

    public final void stop() {
        this.subscription.dispose();
    }
}
