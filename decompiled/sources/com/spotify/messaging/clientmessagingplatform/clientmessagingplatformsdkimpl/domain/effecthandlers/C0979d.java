package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.exa;
import p204p.ln9;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0979d {

    /* JADX INFO: renamed from: a */
    public final ln9 f5482a;

    public C0979d(ln9 ln9Var) {
        this.f5482a = ln9Var;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15305a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteCappingEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(exa exaVar) {
                this.this$0.f5482a.m59476f(exaVar.f63724b);
            }
        };
    }
}
