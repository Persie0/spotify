package com.spotify.mobius.disposables;

/* JADX INFO: loaded from: classes2.dex */
public class CompositeDisposable implements Disposable {

    /* JADX INFO: renamed from: a */
    public final Disposable[] f5738a;

    public CompositeDisposable(Disposable[] disposableArr) {
        Disposable[] disposableArr2 = new Disposable[disposableArr.length];
        this.f5738a = disposableArr2;
        System.arraycopy(disposableArr, 0, disposableArr2, 0, disposableArr.length);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        for (Disposable disposable : this.f5738a) {
            disposable.dispose();
        }
    }
}
