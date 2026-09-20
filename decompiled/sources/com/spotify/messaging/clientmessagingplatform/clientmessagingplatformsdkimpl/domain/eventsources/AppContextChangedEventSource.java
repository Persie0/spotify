package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p204p.bya;
import p204p.bza;
import p204p.cza;
import p204p.fza;
import p204p.i85;
import p204p.m8x;
import p204p.mza;
import p204p.nza;
import p204p.oza;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/AppContextChangedEventSource;", "Lp/m8x;", "Lp/bya;", "Lp/cza;", "navigationChangedDelegate", "Lp/nza;", "playbackStartedDelegate", "<init>", "(Lp/cza;Lp/nza;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/cza;", "Lp/nza;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppContextChangedEventSource implements m8x {
    public static final int $stable = 0;
    private final cza navigationChangedDelegate;
    private final nza playbackStartedDelegate;

    public AppContextChangedEventSource(cza czaVar, nza nzaVar) {
        this.navigationChangedDelegate = czaVar;
        this.playbackStartedDelegate = nzaVar;
    }

    @Override // p204p.m8x
    public Observable<bya> eventSource() {
        return Observable.combineLatest(((fza) this.navigationChangedDelegate).f74955d.hide().distinctUntilChanged(), ((oza) this.playbackStartedDelegate).m68634a(), new BiFunction() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AppContextChangedEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final i85 apply(bza bzaVar, mza mzaVar) {
                return new i85(bzaVar, mzaVar);
            }
        }).distinctUntilChanged().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AppContextChangedEventSource.eventSource.2
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final bya mo98394apply(i85 i85Var) {
                return new bya(i85Var);
            }
        });
    }
}
