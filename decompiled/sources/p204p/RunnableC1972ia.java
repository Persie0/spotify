package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: p.ia */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC1972ia implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f100112a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xld1 f100113b;

    public RunnableC1972ia(xld1 xld1Var) {
        this.f100113b = xld1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jNanoTime;
        this.f100112a.clear();
        try {
            this.f100112a.addAll(Collections.singletonList(this.f100113b.f263131h));
            synchronized (this.f100113b.f263129f) {
                jNanoTime = (long) (System.nanoTime() - (this.f100113b.f263128e * 1.5d));
            }
            Iterator it = this.f100112a.iterator();
            while (it.hasNext()) {
                xld1.m91421a(this.f100113b, (nld1) it.next(), jNanoTime);
            }
        } catch (Exception unused) {
        }
        this.f100112a.clear();
    }
}
