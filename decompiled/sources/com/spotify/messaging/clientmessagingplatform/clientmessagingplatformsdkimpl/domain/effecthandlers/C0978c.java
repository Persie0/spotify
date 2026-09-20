package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.dxa;
import p204p.ln9;
import p204p.m6z;
import p204p.nsf1;
import p204p.zwa;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0978c {

    /* JADX INFO: renamed from: a */
    public final zwa f5480a;

    /* JADX INFO: renamed from: b */
    public final ln9 f5481b;

    public C0978c(zwa zwaVar, ln9 ln9Var) {
        this.f5480a = zwaVar;
        this.f5481b = ln9Var;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15304a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteCacheEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(dxa dxaVar) {
                nsf1.m65528n(this.this$0.f5480a.f286953a.f245221a, false, true, new m6z());
                this.this$0.f5481b.m59475d();
            }
        };
    }
}
