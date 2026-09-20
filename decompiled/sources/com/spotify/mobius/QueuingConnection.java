package com.spotify.mobius;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
class QueuingConnection<I> implements Connection<I> {

    /* JADX INFO: renamed from: c */
    public static final Connection f5615c = new Connection<Object>() { // from class: com.spotify.mobius.QueuingConnection.1
        @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
        public final void accept(Object obj) {
        }

        @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
        public final void dispose() {
        }
    };

    /* JADX INFO: renamed from: a */
    public final QueuingDelegate f5616a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f5617b;

    public class QueuingDelegate implements Connection<I> {

        /* JADX INFO: renamed from: a */
        public final LinkedBlockingQueue f5618a = new LinkedBlockingQueue();

        public QueuingDelegate() {
        }

        @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
        public final void accept(Object obj) {
            LinkedBlockingQueue linkedBlockingQueue = this.f5618a;
            linkedBlockingQueue.add(obj);
            QueuingConnection queuingConnection = QueuingConnection.this;
            Connection connection = (Connection) queuingConnection.f5617b.get();
            if (connection == queuingConnection.f5616a) {
                return;
            }
            while (true) {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    return;
                } else {
                    connection.accept(objPoll);
                }
            }
        }

        @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
        public final void dispose() {
            this.f5618a.clear();
        }
    }

    public QueuingConnection() {
        QueuingDelegate queuingDelegate = new QueuingDelegate();
        this.f5616a = queuingDelegate;
        this.f5617b = new AtomicReference(queuingDelegate);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        ((Connection) this.f5617b.get()).accept(obj);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ((Connection) this.f5617b.getAndSet(f5615c)).dispose();
    }
}
