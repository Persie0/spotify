package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.gxa;
import p204p.nsf1;
import p204p.q22;
import p204p.zwa;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0981f {

    /* JADX INFO: renamed from: a */
    public final zwa f5484a;

    public C0981f(zwa zwaVar) {
        this.f5484a = zwaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15307a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteMessageFromCacheEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(gxa gxaVar) {
                zwa zwaVar = this.this$0.f5484a;
                long j = gxaVar.f85236b;
                if (j != -1) {
                    nsf1.m65528n(zwaVar.f286953a.f245221a, false, true, new q22(11, j));
                }
            }
        };
    }
}
