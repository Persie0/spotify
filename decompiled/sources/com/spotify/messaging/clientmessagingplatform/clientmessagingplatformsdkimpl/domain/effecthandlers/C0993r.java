package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.ln9;
import p204p.zxa;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C0993r {

    /* JADX INFO: renamed from: a */
    public final ln9 f5509a;

    public C0993r(ln9 ln9Var) {
        this.f5509a = ln9Var;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15320a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.UpdateCappingEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(zxa zxaVar) {
                this.this$0.f5509a.m59489u(zxaVar.f287260b, zxaVar.f287261c);
            }
        };
    }
}
