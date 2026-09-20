package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
class FireAtLeastOnceObserver<V> implements Consumer<V> {

    /* JADX INFO: renamed from: a */
    public final Consumer f5558a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f5559b = false;

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedQueue f5560c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f5561d = new AtomicReference(null);

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f5562e = new AtomicBoolean(false);

    public FireAtLeastOnceObserver(Consumer consumer) {
        this.f5558a = consumer;
    }

    /* JADX INFO: renamed from: a */
    public final void m15573a() {
        if (!this.f5562e.compareAndSet(false, true)) {
            return;
        }
        if (!this.f5559b) {
            this.f5559b = true;
            AtomicReference atomicReference = (AtomicReference) this.f5561d.get();
            if (atomicReference != null) {
                this.f5558a.accept(atomicReference.get());
            }
        }
        while (true) {
            try {
                Object objPoll = this.f5560c.poll();
                if (objPoll != null) {
                    this.f5558a.accept(objPoll);
                } else {
                    this.f5562e.set(false);
                    if (this.f5560c.isEmpty() || !this.f5562e.compareAndSet(false, true)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f5562e.set(false);
                if (!this.f5560c.isEmpty()) {
                    this.f5562e.compareAndSet(false, true);
                }
                throw th;
            }
        }
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f5560c.add(obj);
        m15573a();
    }
}
