package p204p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class h9f1 {

    /* JADX INFO: renamed from: a */
    public final long f88935a;

    /* JADX INFO: renamed from: b */
    public long f88936b;

    /* JADX INFO: renamed from: c */
    public long f88937c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f88938d;

    /* JADX INFO: renamed from: e */
    public final int f88939e;

    public h9f1(xhy0 xhy0Var) {
        this.f88939e = xhy0Var.f261731a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f88935a = jCurrentTimeMillis;
        this.f88936b = jCurrentTimeMillis;
        this.f88938d = new AtomicInteger(1);
    }
}
