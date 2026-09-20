package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;
import p204p.cxa;
import p204p.hwa;
import p204p.qte0;
import p204p.v2a1;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0977b {

    /* JADX INFO: renamed from: a */
    public final hwa f5479a;

    public C0977b(hwa hwaVar) {
        this.f5479a = hwaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15303a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CleanupPresenterRegistryEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(cxa cxaVar) {
                v2a1 v2a1Var = cxaVar.f42959b;
                if (cxaVar.f42960c != null) {
                    WeakReference weakReference = (WeakReference) this.this$0.f5479a.f95894a.get(v2a1Var.f236592a);
                    qte0 qte0Var = weakReference != null ? (qte0) weakReference.get() : null;
                    if (qte0Var != null) {
                        qte0Var.dismiss();
                    }
                }
                this.this$0.f5479a.f95894a.remove(v2a1Var.f236592a);
            }
        };
    }
}
