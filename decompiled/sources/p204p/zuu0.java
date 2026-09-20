package p204p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zuu0 implements y8b, Cloneable {

    /* JADX INFO: renamed from: L0 */
    public boolean f286520L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f286521M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f286522N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f286523O0;

    /* JADX INFO: renamed from: P0 */
    public volatile boolean f286524P0;

    /* JADX INFO: renamed from: Q0 */
    public volatile qp4 f286525Q0;

    /* JADX INFO: renamed from: R0 */
    public final CopyOnWriteArrayList f286526R0;

    /* JADX INFO: renamed from: X */
    public boolean f286527X;

    /* JADX INFO: renamed from: Y */
    public qp4 f286528Y;

    /* JADX INFO: renamed from: Z */
    public boolean f286529Z;

    /* JADX INFO: renamed from: a */
    public final z4l0 f286530a;

    /* JADX INFO: renamed from: b */
    public final auw0 f286531b;

    /* JADX INFO: renamed from: c */
    public final boolean f286532c;

    /* JADX INFO: renamed from: d */
    public final lfs f286533d;

    /* JADX INFO: renamed from: e */
    public final x5x f286534e;

    /* JADX INFO: renamed from: f */
    public final yuu0 f286535f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f286536g;

    /* JADX INFO: renamed from: h */
    public Object f286537h;

    /* JADX INFO: renamed from: i */
    public ggx f286538i;

    /* JADX INFO: renamed from: t */
    public avu0 f286539t;

    public zuu0(z4l0 z4l0Var, auw0 auw0Var, boolean z) {
        this.f286530a = z4l0Var;
        this.f286531b = auw0Var;
        this.f286532c = z;
        this.f286533d = z4l0Var.f279269F.f267316a;
        this.f286534e = z4l0Var.f279273d.mo49779f(this);
        yuu0 yuu0Var = new yuu0(this);
        yuu0Var.mo27167g(z4l0Var.f279292w, TimeUnit.MILLISECONDS);
        this.f286535f = yuu0Var;
        this.f286536g = new AtomicBoolean();
        this.f286523O0 = true;
        this.f286526R0 = new CopyOnWriteArrayList();
        new AtomicReference(auw0Var.f20041e);
    }

    /* JADX INFO: renamed from: b */
    public static final String m97067b(zuu0 zuu0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(zuu0Var.f286524P0 ? "canceled " : "");
        sb.append(zuu0Var.f286532c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(zuu0Var.f286531b.f20037a.m69944h());
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final void m97068c(avu0 avu0Var) {
        TimeZone timeZone = c0f1.f32774a;
        if (this.f286539t != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f286539t = avu0Var;
        avu0Var.f20278q.add(new xuu0(this, this.f286537h));
    }

    public final void cancel() {
        if (this.f286524P0) {
            return;
        }
        this.f286524P0 = true;
        qp4 qp4Var = this.f286525Q0;
        if (qp4Var != null) {
            ((fgx) qp4Var.f191127e).cancel();
        }
        Iterator it = this.f286526R0.iterator();
        while (it.hasNext()) {
            ((gnx0) it.next()).cancel();
        }
        this.f286534e.mo55530g(this);
    }

    public final Object clone() {
        return new zuu0(this.f286530a, this.f286531b, this.f286532c);
    }

    /* JADX INFO: renamed from: d */
    public final IOException m97069d(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM97076l;
        TimeZone timeZone = c0f1.f32774a;
        avu0 avu0Var = this.f286539t;
        if (avu0Var != null) {
            synchronized (avu0Var) {
                socketM97076l = m97076l();
            }
            if (this.f286539t == null) {
                if (socketM97076l != null) {
                    c0f1.m31132c(socketM97076l);
                }
                this.f286534e.mo80138l(this, avu0Var);
            } else if (socketM97076l != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f286527X && this.f286535f.m59474j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f286534e.mo55527d(this);
            return interruptedIOException;
        }
        x5x x5xVar = this.f286534e;
        wj50.m88279p(interruptedIOException);
        x5xVar.mo55528e(this, interruptedIOException);
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: e */
    public final void m97070e(iab iabVar) {
        if (!this.f286536g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        wco0 wco0Var = wco0.f250081a;
        this.f286537h = wco0.f250081a.mo57291h();
        this.f286534e.mo55529f(this);
        osr osrVar = this.f286530a.f279270a;
        wuu0 wuu0Var = new wuu0(this, iabVar);
        osrVar.getClass();
        osr.m67749d(osrVar, wuu0Var, null, null, 6);
    }

    /* JADX INFO: renamed from: g */
    public final n2x0 m97071g() {
        if (!this.f286536g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f286535f.m59473i();
        wco0 wco0Var = wco0.f250081a;
        this.f286537h = wco0.f250081a.mo57291h();
        this.f286534e.mo55529f(this);
        try {
            osr osrVar = this.f286530a.f279270a;
            synchronized (osrVar) {
                ((ArrayDeque) osrVar.f168867f).add(this);
            }
            n2x0 n2x0VarM97073i = m97073i();
            osr osrVar2 = this.f286530a.f279270a;
            osrVar2.getClass();
            osr.m67749d(osrVar2, null, this, null, 5);
            return n2x0VarM97073i;
        } catch (Throwable th) {
            osr osrVar3 = this.f286530a.f279270a;
            osrVar3.getClass();
            osr.m67749d(osrVar3, null, this, null, 5);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m97072h(boolean z) {
        qp4 qp4Var;
        synchronized (this) {
            if (!this.f286523O0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (qp4Var = this.f286525Q0) != null) {
            ((fgx) qp4Var.f191127e).cancel();
            ((zuu0) qp4Var.f191124b).m97074j(qp4Var, true, true, true, true, null);
        }
        this.f286528Y = null;
    }

    /* JADX INFO: renamed from: i */
    public final n2x0 m97073i() {
        ArrayList arrayList = new ArrayList();
        j6f.m52564V(this.f286530a.f279271b, arrayList);
        arrayList.add(new xja(this.f286530a, 4));
        arrayList.add(new xja(this.f286530a.f279279j, 0));
        arrayList.add(new xja(this.f286530a.f279280k, 2));
        arrayList.add(i9b.f99969c);
        if (!this.f286532c) {
            j6f.m52564V(this.f286530a.f279272c, arrayList);
        }
        arrayList.add(i9b.f99968b);
        auw0 auw0Var = this.f286531b;
        z4l0 z4l0Var = this.f286530a;
        try {
            try {
                n2x0 n2x0VarM57489b = new kvu0(this, arrayList, 0, null, auw0Var, z4l0Var.f279293x, z4l0Var.f279294y, z4l0Var.f279295z).m57489b(auw0Var);
                if (this.f286524P0) {
                    a0f1.m24341b(n2x0VarM57489b);
                    throw new IOException("Canceled");
                }
                m97075k(null);
                return n2x0VarM57489b;
            } catch (IOException e) {
                throw m97075k(e);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m97075k(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0032 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0036 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x000f, B:23:0x002a, B:25:0x002e, B:27:0x0032, B:29:0x0036, B:30:0x0038, B:32:0x003c, B:34:0x0040, B:36:0x0044, B:41:0x004d, B:14:0x0018, B:17:0x001e, B:20:0x0024), top: B:63:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004a  */
    /* JADX INFO: renamed from: j */
    public final IOException m97074j(qp4 qp4Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (qp4Var.equals(this.f286525Q0)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.f286529Z) {
                            if (z) {
                                this.f286529Z = false;
                            }
                            if (z2) {
                                this.f286520L0 = false;
                            }
                            if (z4) {
                                this.f286521M0 = false;
                            }
                            if (z3) {
                                this.f286522N0 = false;
                            }
                            if (this.f286529Z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.f286520L0) || ((z4 && this.f286521M0) || (z3 && this.f286522N0))) {
                            if (z) {
                                this.f286529Z = false;
                            }
                            if (z2) {
                                this.f286520L0 = false;
                            }
                            if (z4) {
                                this.f286521M0 = false;
                            }
                            if (z3) {
                                this.f286522N0 = false;
                            }
                            if (this.f286529Z || this.f286520L0 || this.f286521M0 || this.f286522N0) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.f286523O0) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.f286525Q0 = null;
                avu0 avu0Var = this.f286539t;
                if (avu0Var != null) {
                    synchronized (avu0Var) {
                        avu0Var.f20275n++;
                    }
                }
            }
            if (z6) {
                return m97069d(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: k */
    public final IOException m97075k(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f286523O0) {
                this.f286523O0 = false;
                if (!this.f286529Z && !this.f286520L0 && !this.f286521M0 && !this.f286522N0) {
                    z = true;
                }
            }
        }
        return z ? m97069d(iOException) : iOException;
    }

    /* JADX INFO: renamed from: l */
    public final Socket m97076l() {
        avu0 avu0Var = this.f286539t;
        wj50.m88279p(avu0Var);
        TimeZone timeZone = c0f1.f32774a;
        ArrayList arrayList = avu0Var.f20278q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (wj50.m88271j(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f286539t = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        avu0Var.f20279r = System.nanoTime();
        lfs lfsVar = this.f286533d;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lfsVar.f133007e;
        kv61 kv61Var = (kv61) lfsVar.f133005c;
        TimeZone timeZone2 = c0f1.f32774a;
        if (!avu0Var.f20272k && lfsVar.f133003a != 0) {
            kv61Var.m57443d((tqr) lfsVar.f133006d, 0L);
            return null;
        }
        avu0Var.f20272k = true;
        concurrentLinkedQueue.remove(avu0Var);
        if (concurrentLinkedQueue.isEmpty()) {
            kv61Var.m57441a();
        }
        return avu0Var.f20266e;
    }
}
