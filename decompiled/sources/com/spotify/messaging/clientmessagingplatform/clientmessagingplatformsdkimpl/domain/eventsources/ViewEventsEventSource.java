package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.ahc1;
import p204p.gte0;
import p204p.hte0;
import p204p.ite0;
import p204p.iya;
import p204p.jya;
import p204p.m8x;
import p204p.vya;
import p204p.wgc1;
import p204p.xgc1;
import p204p.ygc1;
import p204p.yza;
import p204p.zgc1;
import p204p.zza;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/eventsources/ViewEventsEventSource;", "Lp/m8x;", "Lp/vya;", "Lp/yza;", "viewEventsDelegate", "<init>", "(Lp/yza;)V", "Lio/reactivex/rxjava3/core/Observable;", "eventSource", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/yza;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ViewEventsEventSource implements m8x {
    public static final int $stable = 8;
    private final yza viewEventsDelegate;

    public ViewEventsEventSource(yza yzaVar) {
        this.viewEventsDelegate = yzaVar;
    }

    @Override // p204p.m8x
    public Observable<vya> eventSource() {
        return ((zza) this.viewEventsDelegate).f287929a.hide().map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ViewEventsEventSource.eventSource.1
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final vya mo98394apply(ahc1 ahc1Var) {
                if (ahc1Var instanceof wgc1) {
                    wgc1 wgc1Var = (wgc1) ahc1Var;
                    return new iya(wgc1Var.m88022c(), wgc1Var.m88021b(), wgc1Var.m88020a());
                }
                if (ahc1Var instanceof xgc1) {
                    xgc1 xgc1Var = (xgc1) ahc1Var;
                    DiscardReason discardReasonM90564a = xgc1Var.m90564a();
                    return new jya(new gte0(xgc1Var.m90566c(), xgc1Var.m90565b(), discardReasonM90564a));
                }
                if (ahc1Var instanceof ygc1) {
                    ygc1 ygc1Var = (ygc1) ahc1Var;
                    DismissReason dismissReasonM93592a = ygc1Var.m93592a();
                    return new jya(new hte0(ygc1Var.m93594c(), ygc1Var.m93593b(), dismissReasonM93592a));
                }
                if (!(ahc1Var instanceof zgc1)) {
                    throw new NoWhenBranchMatchedException();
                }
                zgc1 zgc1Var = (zgc1) ahc1Var;
                return new jya(new ite0(zgc1Var.m96059b(), zgc1Var.m96058a()));
            }
        });
    }
}
