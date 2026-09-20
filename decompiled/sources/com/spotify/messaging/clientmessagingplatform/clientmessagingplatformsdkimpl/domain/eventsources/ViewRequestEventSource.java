package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p204p.axa;
import p204p.bxa;
import p204p.m8x;
import p204p.nya;
import p204p.qve0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/ViewRequestEventSource;", "Lp/m8x;", "Lp/nya;", "Lp/axa;", "viewRequestDelegate", "<init>", "(Lp/axa;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/axa;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ViewRequestEventSource implements m8x {
    public static final int $stable = 8;
    private final axa viewRequestDelegate;

    public ViewRequestEventSource(axa axaVar) {
        this.viewRequestDelegate = axaVar;
    }

    @Override // p204p.m8x
    public Observable<nya> eventSource() {
        return ((bxa) this.viewRequestDelegate).f31809a.hide().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ViewRequestEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final nya mo98394apply(qve0 qve0Var) {
                return new nya(qve0Var.m73990a(), qve0Var.m73995f(), qve0Var.m73994e(), qve0Var.m73992c(), qve0Var.m73991b(), qve0Var.m73993d());
            }
        });
    }
}
