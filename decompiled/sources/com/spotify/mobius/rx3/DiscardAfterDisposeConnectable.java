package com.spotify.mobius.rx3;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.disposables.CompositeDisposable;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
class DiscardAfterDisposeConnectable<I, O> implements Connectable<I, O> {

    /* JADX INFO: renamed from: a */
    public final Connectable f5773a;

    public DiscardAfterDisposeConnectable(Connectable connectable) {
        this.f5773a = connectable;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        Preconditions.m15649b(consumer);
        DiscardAfterDisposeWrapper discardAfterDisposeWrapper = new DiscardAfterDisposeWrapper(consumer, null);
        Connection connectionMo3269P = ((RxConnectables.C10511) this.f5773a).mo3269P(discardAfterDisposeWrapper);
        Preconditions.m15649b(connectionMo3269P);
        final DiscardAfterDisposeWrapper discardAfterDisposeWrapper2 = new DiscardAfterDisposeWrapper(connectionMo3269P, connectionMo3269P);
        final CompositeDisposable compositeDisposable = new CompositeDisposable(new Disposable[]{discardAfterDisposeWrapper2, discardAfterDisposeWrapper});
        return new Connection<Object>() { // from class: com.spotify.mobius.rx3.DiscardAfterDisposeConnectable.1
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final void accept(Object obj) {
                discardAfterDisposeWrapper2.accept(obj);
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                compositeDisposable.dispose();
            }
        };
    }
}
