package p204p;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class bqk0 {

    /* JADX INFO: renamed from: b */
    public final long[] f29845b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f29846c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f29847d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f29849f;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f29844a = new ReentrantLock();

    /* JADX INFO: renamed from: e */
    public final ReentrantLock f29848e = new ReentrantLock();

    public bqk0(int i) {
        this.f29845b = new long[i];
        this.f29846c = new boolean[i];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30265a(int[] iArr) {
        ReentrantLock reentrantLock = this.f29844a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.f29845b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    this.f29847d = true;
                    z = true;
                }
            }
            return z || this.f29847d || this.f29849f;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30266b(int[] iArr) {
        ReentrantLock reentrantLock = this.f29844a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.f29845b;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    this.f29847d = true;
                    z = true;
                }
            }
            return z || this.f29847d || this.f29849f;
        } finally {
            reentrantLock.unlock();
        }
    }
}
