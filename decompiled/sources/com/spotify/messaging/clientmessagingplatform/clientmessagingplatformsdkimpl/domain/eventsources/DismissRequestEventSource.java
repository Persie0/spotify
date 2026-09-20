package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import p204p.fsr;
import p204p.m8x;
import p204p.mya;
import p204p.qwa;
import p204p.rwa;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/DismissRequestEventSource;", "Lp/m8x;", "Lp/mya;", "Lp/qwa;", "delegate", "<init>", "(Lp/qwa;)V", "Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/jvm/internal/EnhancedNullability;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/qwa;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DismissRequestEventSource implements m8x {
    public static final int $stable = 8;
    private final qwa delegate;

    public DismissRequestEventSource(qwa qwaVar) {
        this.delegate = qwaVar;
    }

    @Override // p204p.m8x
    public Observable<mya> eventSource() {
        return ((rwa) this.delegate).f203312a.hide().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.DismissRequestEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final mya mo98394apply(fsr fsrVar) {
                return new mya(fsrVar.m42571b(), fsrVar.m42570a());
            }
        });
    }
}
