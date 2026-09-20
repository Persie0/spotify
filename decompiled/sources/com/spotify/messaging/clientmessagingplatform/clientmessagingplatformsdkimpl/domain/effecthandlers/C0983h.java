package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.ixa;
import p204p.tza;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0983h {

    /* JADX INFO: renamed from: a */
    public final tza f5487a;

    public C0983h(tza tzaVar) {
        this.f5487a = tzaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15309a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DispatchMessageResponseEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(ixa ixaVar) {
                tza tzaVar = this.this$0.f5487a;
                tzaVar.f225200a.onNext(ixaVar.f106632b);
            }
        };
    }
}
