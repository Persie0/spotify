package com.spotify.mobius.android;

import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import p204p.dqk0;
import p204p.fb80;
import p204p.gc80;
import p204p.hc80;
import p204p.ta80;
import p204p.zal0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class MutableLiveQueue<T> implements LiveQueue<T> {

    /* JADX INFO: renamed from: b */
    public final MainThreadWorkRunner f5628b;

    /* JADX INFO: renamed from: a */
    public final Object f5627a = new Object();

    /* JADX INFO: renamed from: d */
    public dqk0 f5630d = null;

    /* JADX INFO: renamed from: e */
    public dqk0 f5631e = null;

    /* JADX INFO: renamed from: f */
    public boolean f5632f = true;

    /* JADX INFO: renamed from: c */
    public final ArrayBlockingQueue f5629c = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: com.spotify.mobius.android.MutableLiveQueue$1 */
    /* JADX INFO: loaded from: classes8.dex */
    public static /* synthetic */ class C10281 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5633a;

        static {
            int[] iArr = new int[ta80.values().length];
            f5633a = iArr;
            try {
                iArr[ta80.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5633a[ta80.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5633a[ta80.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public class LifecycleObserverHelper implements gc80 {
        public LifecycleObserverHelper() {
        }

        @zal0(ta80.ON_ANY)
        public void onAny(hc80 hc80Var, ta80 ta80Var) {
            MutableLiveQueue mutableLiveQueue = MutableLiveQueue.this;
            int i = C10281.f5633a[ta80Var.ordinal()];
            if (i == 1) {
                synchronized (mutableLiveQueue.f5627a) {
                    mutableLiveQueue.f5632f = false;
                    mutableLiveQueue.m15624d();
                }
                return;
            }
            if (i == 2) {
                synchronized (mutableLiveQueue.f5627a) {
                    mutableLiveQueue.f5632f = true;
                }
            } else {
                if (i != 3) {
                    return;
                }
                synchronized (mutableLiveQueue.f5627a) {
                    mutableLiveQueue.mo15615b();
                }
            }
        }
    }

    public MutableLiveQueue(MainThreadWorkRunner mainThreadWorkRunner) {
        this.f5628b = mainThreadWorkRunner;
    }

    @Override // com.spotify.mobius.android.LiveQueue
    /* JADX INFO: renamed from: a */
    public final void mo15614a(hc80 hc80Var, dqk0 dqk0Var, dqk0 dqk0Var2) {
        if (hc80Var.getLifecycle().mo31987b() == fb80.f67750a) {
            return;
        }
        synchronized (this.f5627a) {
            this.f5630d = dqk0Var;
            this.f5631e = dqk0Var2;
            this.f5632f = true;
            hc80Var.getLifecycle().mo31986a(new LifecycleObserverHelper());
        }
    }

    @Override // com.spotify.mobius.android.LiveQueue
    /* JADX INFO: renamed from: b */
    public final void mo15615b() {
        synchronized (this.f5627a) {
            this.f5630d = null;
            this.f5631e = null;
            this.f5632f = true;
            this.f5629c.clear();
        }
    }

    @Override // com.spotify.mobius.android.LiveQueue
    /* JADX INFO: renamed from: c */
    public final void mo15616c(hc80 hc80Var, dqk0 dqk0Var) {
        mo15614a(hc80Var, dqk0Var, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m15624d() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.f5627a) {
            if (!this.f5632f && this.f5631e != null && !this.f5629c.isEmpty()) {
                this.f5629c.drainTo(linkedList);
                this.f5628b.post(new RunnableC1030b(this, linkedList, 1));
            }
        }
    }
}
