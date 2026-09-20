package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import p204p.eve0;
import p204p.fxa;
import p204p.klh;
import p204p.nsf1;
import p204p.zwa;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0980e {

    /* JADX INFO: renamed from: a */
    public final zwa f5483a;

    public C0980e(zwa zwaVar) {
        this.f5483a = zwaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15306a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DeleteJitTriggerFromCacheEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(fxa fxaVar) {
                List list = fxaVar.f74303b;
                C0980e c0980e = this.this$0;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    nsf1.m65528n(c0980e.f5483a.f286953a.f245221a, false, true, new eve0(klh.m56834f((String) it.next(), "#", fxaVar.f74304c.name()), 1));
                }
            }
        };
    }
}
