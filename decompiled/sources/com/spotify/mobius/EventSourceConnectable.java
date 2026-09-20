package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
class EventSourceConnectable<M, E> implements Connectable<M, E> {

    /* JADX INFO: renamed from: a */
    public final EventSource f5556a;

    public EventSourceConnectable(EventSource eventSource) {
        this.f5556a = eventSource;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        final Disposable disposableMo15572a = this.f5556a.mo15572a(consumer);
        return new Connection<Object>() { // from class: com.spotify.mobius.EventSourceConnectable.1
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final synchronized void accept(Object obj) {
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final synchronized void dispose() {
                disposableMo15572a.dispose();
            }
        };
    }
}
