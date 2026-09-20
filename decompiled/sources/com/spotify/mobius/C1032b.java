package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: renamed from: com.spotify.mobius.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1032b implements Connectable {
    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        C1032b c1032b = Mobius.f5572a;
        return new Connection<Object>() { // from class: com.spotify.mobius.Mobius.1
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final void accept(Object obj) {
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final void dispose() {
            }
        };
    }
}
