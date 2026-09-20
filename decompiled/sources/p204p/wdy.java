package p204p;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class wdy implements ggx {

    /* JADX INFO: renamed from: a */
    public final pvu0 f250377a;

    /* JADX INFO: renamed from: b */
    public final lv61 f250378b;

    /* JADX INFO: renamed from: c */
    public final long f250379c = TimeUnit.MILLISECONDS.toNanos(250);

    /* JADX INFO: renamed from: d */
    public long f250380d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f250381e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public final LinkedBlockingDeque f250382f;

    public wdy(pvu0 pvu0Var, lv61 lv61Var) {
        this.f250377a = pvu0Var;
        this.f250378b = lv61Var;
        utu0 utu0Var = lv61Var.f137240a;
        this.f250382f = new LinkedBlockingDeque();
    }

    /* JADX INFO: renamed from: a */
    public final void m87852a() {
        CopyOnWriteArrayList<gnx0> copyOnWriteArrayList = this.f250381e;
        for (gnx0 gnx0Var : copyOnWriteArrayList) {
            gnx0Var.cancel();
            gnx0 gnx0VarMo28599m = gnx0Var.mo28599m();
            if (gnx0VarMo28599m != null) {
                this.f250377a.f181850q.addLast(gnx0VarMo28599m);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: b */
    public final fnx0 m87853b() {
        gnx0 bayVar;
        pvu0 pvu0Var = this.f250377a;
        if (pvu0Var.m71198a(null)) {
            try {
                bayVar = pvu0Var.m71199b();
            } catch (Throwable th) {
                bayVar = new bay(th);
            }
            if (bayVar.isReady()) {
                return new fnx0(bayVar, (Throwable) null, 6);
            }
            if (bayVar instanceof bay) {
                return ((bay) bayVar).f25360a;
            }
            this.f250381e.add(bayVar);
            this.f250378b.m60068d().m57443d(new vdy(c0f1.f32775b + " connect " + pvu0Var.f181843j.f276529h.m69944h(), bayVar, this), 0L);
        }
        return null;
    }

    @Override // p204p.ggx
    /* JADX INFO: renamed from: e */
    public final avu0 mo44704e() throws IOException {
        fnx0 fnx0VarM87853b;
        long j;
        fnx0 fnx0Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f250381e.isEmpty() && !this.f250377a.m71198a(null)) {
                    m87852a();
                    wj50.m88279p(iOException);
                    throw iOException;
                }
                if (this.f250377a.f181845l.f286524P0) {
                    throw new IOException("Canceled");
                }
                utu0 utu0Var = this.f250378b.f137240a;
                long jNanoTime = System.nanoTime();
                long j2 = this.f250380d - jNanoTime;
                if (this.f250381e.isEmpty() || j2 <= 0) {
                    fnx0VarM87853b = m87853b();
                    j = this.f250379c;
                    this.f250380d = jNanoTime + j;
                } else {
                    j = j2;
                    fnx0VarM87853b = null;
                }
                if (fnx0VarM87853b == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f250381e;
                    if (copyOnWriteArrayList.isEmpty() || (fnx0Var = (fnx0) this.f250382f.poll(j, timeUnit)) == null) {
                        fnx0VarM87853b = null;
                    } else {
                        copyOnWriteArrayList.remove(fnx0Var.f71371a);
                        fnx0VarM87853b = fnx0Var;
                    }
                    if (fnx0VarM87853b == null) {
                    }
                }
                boolean z = false;
                if (fnx0VarM87853b.f71372b == null && fnx0VarM87853b.f71373c == null) {
                    m87852a();
                    if (!fnx0VarM87853b.f71371a.isReady()) {
                        fnx0VarM87853b = fnx0VarM87853b.f71371a.mo28597c();
                    }
                    if (fnx0VarM87853b.f71372b == null && fnx0VarM87853b.f71373c == null) {
                        z = true;
                    }
                    if (z) {
                        avu0 avu0VarMo28596a = fnx0VarM87853b.f71371a.mo28596a();
                        m87852a();
                        return avu0VarMo28596a;
                    }
                }
                Throwable th = fnx0VarM87853b.f71373c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        y85.m93061f(iOException, th);
                    }
                }
                gnx0 gnx0Var = fnx0VarM87853b.f71372b;
                if (gnx0Var != null) {
                    this.f250377a.f181850q.addFirst(gnx0Var);
                }
            } catch (Throwable th2) {
                m87852a();
                throw th2;
            }
        }
    }

    @Override // p204p.ggx
    /* JADX INFO: renamed from: j */
    public final pvu0 mo44705j() {
        return this.f250377a;
    }
}
