package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.kxa;
import p204p.qza;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0985j {

    /* JADX INFO: renamed from: a */
    public final qza f5492a;

    public C0985j(qza qzaVar) {
        this.f5492a = qzaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15311a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DispatchProcessingStatusEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(kxa kxaVar) {
                qza qzaVar = this.this$0.f5492a;
                qzaVar.f194156a.onNext(kxaVar.f127366b);
            }
        };
    }
}
