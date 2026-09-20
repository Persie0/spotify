package p204p;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class av3 {

    /* JADX INFO: renamed from: a */
    public final Executor f20079a;

    /* JADX INFO: renamed from: b */
    public final er70 f20080b;

    /* JADX INFO: renamed from: c */
    public final er70 f20081c;

    /* JADX INFO: renamed from: e */
    public boolean f20083e;

    /* JADX INFO: renamed from: d */
    public final CountDownLatch f20082d = new CountDownLatch(1);

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList f20084f = new CopyOnWriteArrayList();

    public av3(Executor executor, er70 er70Var, er70 er70Var2) {
        this.f20079a = executor;
        this.f20080b = er70Var;
        this.f20081c = er70Var2;
    }
}
