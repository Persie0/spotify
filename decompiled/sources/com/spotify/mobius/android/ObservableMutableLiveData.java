package com.spotify.mobius.android;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p204p.xoi0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class ObservableMutableLiveData<T> extends xoi0 implements EventSource<Boolean> {

    /* JADX INFO: renamed from: Y */
    public final CopyOnWriteArrayList f5635Y = new CopyOnWriteArrayList();

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(final Consumer consumer) {
        Preconditions.m15649b(consumer);
        this.f5635Y.add(consumer);
        return new Disposable() { // from class: com.spotify.mobius.android.c
            @Override // com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                this.f5640a.f5635Y.remove(consumer);
            }
        };
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        Iterator it = this.f5635Y.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(Boolean.TRUE);
        }
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        Iterator it = this.f5635Y.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(Boolean.FALSE);
        }
    }
}
