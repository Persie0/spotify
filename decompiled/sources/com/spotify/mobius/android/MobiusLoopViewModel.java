package com.spotify.mobius.android;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import java.util.concurrent.atomic.AtomicBoolean;
import p204p.ajz;
import p204p.mic1;
import p204p.zca0;

/* JADX INFO: loaded from: classes2.dex */
public class MobiusLoopViewModel<M, E, F, V> extends mic1 {

    /* JADX INFO: renamed from: b */
    public final ObservableMutableLiveData f5622b;

    /* JADX INFO: renamed from: c */
    public final MutableLiveQueue f5623c;

    /* JADX INFO: renamed from: d */
    public final MobiusLoop f5624d;

    /* JADX INFO: renamed from: e */
    public final Object f5625e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f5626f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.spotify.mobius.android.a] */
    public MobiusLoopViewModel(Function function, Object obj, Init init, MainThreadWorkRunner mainThreadWorkRunner) {
        zca0 zca0Var = new zca0(function, 28);
        this.f5622b = new ObservableMutableLiveData();
        this.f5626f = new AtomicBoolean(true);
        this.f5623c = new MutableLiveQueue(mainThreadWorkRunner);
        MobiusLoop.Factory factoryM95903j = zca0Var.m95903j(new Consumer() { // from class: com.spotify.mobius.android.a
            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                MutableLiveQueue mutableLiveQueue = this.f5636a.f5623c;
                synchronized (mutableLiveQueue.f5627a) {
                    try {
                        if (!mutableLiveQueue.f5632f) {
                            mutableLiveQueue.f5628b.post(new RunnableC1030b(mutableLiveQueue, obj2, 0));
                        } else if (!mutableLiveQueue.f5629c.offer(obj2)) {
                            throw new IllegalStateException("Maximum effect queue size (" + mutableLiveQueue.f5629c.size() + ") exceeded when posting: " + obj2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        First firstMo15576f0 = init.mo15576f0(obj);
        MobiusLoop mobiusLoopMo15589a = factoryM95903j.mo15589a(firstMo15576f0.mo15560d(), firstMo15576f0.mo15559a());
        this.f5624d = mobiusLoopMo15589a;
        this.f5625e = firstMo15576f0.mo15560d();
        mobiusLoopMo15589a.m15601b(new ajz(this, 1));
    }

    /* JADX INFO: renamed from: e */
    public static MobiusLoopViewModel m15619e(Function function, Object obj, Init init) {
        return new MobiusLoopViewModel(function, obj, init, MainThreadWorkRunner.m15627a());
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        mo15623h();
        this.f5626f.set(false);
        this.f5624d.dispose();
    }

    /* JADX INFO: renamed from: f */
    public final void m15621f(Object obj) {
        if (this.f5626f.get()) {
            this.f5624d.m15600a(obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m15622g() {
        Object obj = this.f5624d.f5591i;
        return obj != null ? obj : this.f5625e;
    }

    /* JADX INFO: renamed from: h */
    public void mo15623h() {
    }
}
