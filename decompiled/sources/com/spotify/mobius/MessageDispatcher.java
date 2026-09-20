package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.runners.WorkRunner;
import p204p.klh;
import p204p.xra0;

/* JADX INFO: loaded from: classes2.dex */
class MessageDispatcher<M> implements Consumer<M>, Disposable {

    /* JADX INFO: renamed from: a */
    public final WorkRunner f5569a;

    /* JADX INFO: renamed from: b */
    public final Consumer f5570b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f5571c = false;

    public MessageDispatcher(WorkRunner workRunner, Consumer consumer) {
        this.f5569a = workRunner;
        this.f5570b = consumer;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(final Object obj) {
        if (this.f5571c) {
            return;
        }
        this.f5569a.post(new Runnable() { // from class: com.spotify.mobius.a
            @Override // java.lang.Runnable
            public final void run() {
                MessageDispatcher messageDispatcher = this.f5620a;
                Object obj2 = obj;
                try {
                    ((DiscardAfterDisposeWrapper) messageDispatcher.f5570b).accept(obj2);
                } catch (Throwable th) {
                    RuntimeException runtimeException = new RuntimeException(klh.m56833e(obj2, "Consumer threw an exception when accepting message: "), th);
                    xra0 xra0Var = MobiusHooks.f5581a;
                    synchronized (MobiusHooks.class) {
                        MobiusHooks.f5582b.mo15599a(runtimeException);
                    }
                }
            }
        });
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f5571c = true;
        this.f5569a.dispose();
    }
}
