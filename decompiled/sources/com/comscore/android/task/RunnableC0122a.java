package com.comscore.android.task;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.comscore.android.task.a */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC0122a implements Runnable {

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f1551a;

    /* JADX INFO: renamed from: b */
    private AtomicBoolean f1552b;

    /* JADX INFO: renamed from: c */
    private Runnable f1553c;

    /* JADX INFO: renamed from: d */
    private long f1554d;

    /* JADX INFO: renamed from: e */
    private long f1555e;

    /* JADX INFO: renamed from: f */
    private long f1556f;

    /* JADX INFO: renamed from: g */
    private boolean f1557g;

    /* JADX INFO: renamed from: h */
    private boolean f1558h;

    /* JADX INFO: renamed from: i */
    private Exception f1559i;

    public RunnableC0122a(Runnable runnable) {
        this(runnable, 0L);
    }

    /* JADX INFO: renamed from: a */
    public long m1222a() {
        return this.f1555e;
    }

    /* JADX INFO: renamed from: b */
    public Exception m1223b() {
        return this.f1559i;
    }

    /* JADX INFO: renamed from: c */
    public long m1224c() {
        return this.f1554d;
    }

    /* JADX INFO: renamed from: d */
    public long m1225d() {
        long jCurrentTimeMillis = this.f1554d - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            return jCurrentTimeMillis;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public long m1226e() {
        return this.f1556f;
    }

    /* JADX INFO: renamed from: f */
    public Runnable m1227f() {
        return this.f1553c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1228g() {
        return this.f1558h;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1229h() {
        return this.f1557g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1230i() {
        return this.f1552b.get();
    }

    /* JADX INFO: renamed from: j */
    public boolean m1231j() {
        return this.f1556f > 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1232k() {
        return this.f1551a.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1551a.set(true);
        try {
            this.f1553c.run();
        } catch (Exception e) {
            this.f1559i = e;
        }
        this.f1551a.set(false);
        this.f1552b.set(true);
    }

    public RunnableC0122a(Runnable runnable, long j) {
        this(runnable, j, 0L);
    }

    public RunnableC0122a(Runnable runnable, long j, long j2) {
        this(runnable, j, j2, true);
    }

    public RunnableC0122a(Runnable runnable, long j, long j2, boolean z) {
        this.f1553c = runnable;
        this.f1554d = System.currentTimeMillis() + (j <= 0 ? 0L : j);
        this.f1557g = j > 0;
        this.f1555e = System.currentTimeMillis();
        this.f1556f = j2;
        this.f1551a = new AtomicBoolean();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f1552b = atomicBoolean;
        atomicBoolean.set(false);
        this.f1551a.set(false);
        this.f1559i = null;
        this.f1558h = z;
    }
}
