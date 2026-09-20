package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import android.content.Context;
import android.view.OrientationEventListener;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Cancellable;
import kotlin.Metadata;
import p204p.m8x;
import p204p.oya;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/OrientationChangedEventSource;", "Lp/m8x;", "Lp/oya;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Landroid/content/Context;", "getContext$annotations", "()V", "", "prevOrientationState", "Ljava/lang/Integer;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OrientationChangedEventSource implements m8x {
    public static final int $stable = 8;
    private final Context context;
    private Integer prevOrientationState;

    public OrientationChangedEventSource(Context context) {
        this.context = context;
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    @Override // p204p.m8x
    public Observable<oya> eventSource() {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.OrientationChangedEventSource.eventSource.1
            /* JADX WARN: Type inference failed for: r1v0, types: [android.view.OrientationEventListener, com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.OrientationChangedEventSource$eventSource$1$orientationListener$1] */
            @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<oya> observableEmitter) {
                final Context context = OrientationChangedEventSource.this.context;
                final OrientationChangedEventSource orientationChangedEventSource = OrientationChangedEventSource.this;
                final ?? r1 = new OrientationEventListener(context) { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.OrientationChangedEventSource$eventSource$1$orientationListener$1
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int orientation) {
                        int i = 2;
                        if ((45 > orientation || orientation >= 135) && ((135 <= orientation && orientation < 225) || 225 > orientation || orientation >= 315)) {
                            i = 1;
                        }
                        Integer num = orientationChangedEventSource.prevOrientationState;
                        if (num != null && i == num.intValue()) {
                            return;
                        }
                        orientationChangedEventSource.prevOrientationState = Integer.valueOf(i);
                        observableEmitter.onNext(oya.f171715a);
                    }
                };
                r1.enable();
                observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.OrientationChangedEventSource.eventSource.1.1
                    @Override // io.reactivex.rxjava3.functions.Cancellable
                    public final void cancel() {
                        disable();
                    }
                });
            }
        });
    }
}
