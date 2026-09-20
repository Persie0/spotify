package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p204p.a99;
import p204p.fza;
import p204p.gd8;
import p204p.h2h1;
import p204p.hza;
import p204p.iza;
import p204p.kya;
import p204p.m8x;
import p204p.mwa;
import p204p.o5h1;
import p204p.opg1;
import p204p.owa;
import p204p.oza;
import p204p.rza;
import p204p.v4g1;
import p204p.xya;
import p204p.yya;
import p204p.z9h1;
import p204p.zp7;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/MessageRequestEventSource;", "Lp/m8x;", "Lp/kya;", "Lp/mwa;", "customClientRequestDelegate", "Lp/xya;", "navigationChangedRequestDelegate", "Lp/hza;", "playbackStartedRequestDelegate", "<init>", "(Lp/mwa;Lp/xya;Lp/hza;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/mwa;", "Lp/xya;", "Lp/hza;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MessageRequestEventSource implements m8x {
    public static final int $stable = 0;
    private final mwa customClientRequestDelegate;
    private final xya navigationChangedRequestDelegate;
    private final hza playbackStartedRequestDelegate;

    public MessageRequestEventSource(mwa mwaVar, xya xyaVar, hza hzaVar) {
        this.customClientRequestDelegate = mwaVar;
        this.navigationChangedRequestDelegate = xyaVar;
        this.playbackStartedRequestDelegate = hzaVar;
    }

    @Override // p204p.m8x
    public Observable<kya> eventSource() {
        owa owaVar = (owa) this.customClientRequestDelegate;
        Observable map = owaVar.f170680d.hide().withLatestFrom(((fza) owaVar.f170679c).f74956e.hide().distinctUntilChanged(), v4g1.f237164Z).map(opg1.f167903L0);
        yya yyaVar = (yya) this.navigationChangedRequestDelegate;
        Observable map2 = ((fza) yyaVar.f277449b).f74955d.hide().distinctUntilChanged().filter(h2h1.f86980L0).distinctUntilChanged().map(new a99(yyaVar, 6));
        iza izaVar = (iza) this.playbackStartedRequestDelegate;
        return Observable.merge(map, map2, ((oza) izaVar.f107181b).m68634a().filter(z9h1.f280796Y).map(zp7.f284966M0).withLatestFrom(((fza) izaVar.f107182c).f74956e.hide().distinctUntilChanged(), o5h1.f161973L0).map(new gd8(izaVar, 8))).map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.MessageRequestEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final kya mo98394apply(rza rzaVar) {
                return new kya(rzaVar);
            }
        });
    }
}
