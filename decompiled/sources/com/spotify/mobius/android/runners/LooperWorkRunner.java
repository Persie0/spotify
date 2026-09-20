package com.spotify.mobius.android.runners;

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobius.runners.WorkRunner;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LooperWorkRunner implements WorkRunner {

    /* JADX INFO: renamed from: a */
    public final Handler f5642a;

    /* JADX INFO: renamed from: b */
    public boolean f5643b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f5644c = new ReentrantLock();

    public LooperWorkRunner(Looper looper) {
        this.f5642a = new Handler(looper);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ReentrantLock reentrantLock = this.f5644c;
        reentrantLock.lock();
        try {
            this.f5642a.removeCallbacksAndMessages(null);
            this.f5643b = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        ReentrantLock reentrantLock = this.f5644c;
        reentrantLock.lock();
        try {
            if (this.f5643b) {
                return;
            }
            this.f5642a.post(runnable);
        } finally {
            reentrantLock.unlock();
        }
    }
}
