package com.spotify.mobius.runners;

/* JADX INFO: loaded from: classes2.dex */
public class ImmediateWorkRunner implements WorkRunner {

    /* JADX INFO: renamed from: a */
    public boolean f5770a;

    @Override // com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        this.f5770a = true;
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final synchronized void post(Runnable runnable) {
        if (this.f5770a) {
            return;
        }
        runnable.run();
    }
}
