package p204p;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class zx81 {

    /* JADX INFO: renamed from: a */
    public final z1e1 f287242a;

    /* JADX INFO: renamed from: b */
    public final gh00 f287243b;

    /* JADX INFO: renamed from: c */
    public final long f287244c;

    /* JADX INFO: renamed from: d */
    public final juk f287245d;

    /* JADX INFO: renamed from: e */
    public final uf60 f287246e;

    /* JADX INFO: renamed from: f */
    public final c9k f287247f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentLinkedQueue f287248g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f287249h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f287250i;

    /* JADX INFO: renamed from: j */
    public volatile long f287251j;

    public zx81(luk lukVar, long j, juk jukVar) {
        z1e1 z1e1Var = new z1e1();
        qx81 qx81Var = qx81.f193576g;
        this.f287242a = z1e1Var;
        this.f287243b = qx81Var;
        this.f287244c = j;
        this.f287245d = jukVar;
        gk40 gk40Var = gk40.f80712X0;
        lukVar.getClass();
        uf60 uf60Var = new uf60((tf60) g95.m43987l(lukVar, gk40Var));
        this.f287246e = uf60Var;
        this.f287247f = kk40.m56661c(cct.m32296A(lukVar, uf60Var));
        this.f287248g = new ConcurrentLinkedQueue();
        this.f287249h = new AtomicReference(null);
        if (m97171e() <= 0) {
            throw new IllegalArgumentException("Worker interval must be positive");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r6v5, types: [p.eh00, p.qe70] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final void m97167a(p204p.zx81 r8, p204p.ibk r9) {
        /*
            p.yuk r0 = p204p.yuk.f276404a
            boolean r1 = r9 instanceof p204p.yx81
            if (r1 == 0) goto L15
            r1 = r9
            p.yx81 r1 = (p204p.yx81) r1
            int r2 = r1.f277178c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f277178c = r2
            goto L1a
        L15:
            p.yx81 r1 = new p.yx81
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f277176a
            int r2 = r1.f277178c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p204p.bga.m29073P(r9)
            goto L3f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            p204p.bga.m29073P(r9)
        L32:
            long r4 = r8.m97171e()
            r1.f277178c = r3
            java.lang.Object r9 = p204p.njg1.m64619l(r4, r1)
            if (r9 != r0) goto L3f
            return
        L3f:
            long r4 = r8.f287251j
            r6 = 1
            long r4 = r4 + r6
            r8.f287251j = r4
            long r4 = r8.f287251j
            java.util.concurrent.ConcurrentLinkedQueue r9 = r8.f287248g
            java.util.Iterator r9 = r9.iterator()
        L4e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r9.next()
            p.xx81 r2 = (p204p.xx81) r2
            p.wx81 r6 = r2.f266903b
            boolean r6 = r6.f255968a
            if (r6 == 0) goto L64
            r9.remove()
            goto L4e
        L64:
            long r6 = r2.f266902a
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L4e
            r9.remove()
            p.qe70 r6 = r2.f266904c
            java.lang.Object r6 = r6.invoke()
            p.tf60 r6 = (p204p.tf60) r6
            p.wx81 r2 = r2.f266903b
            r2.f255969b = r6
            boolean r2 = r2.f255968a
            if (r2 == 0) goto L4e
            r2 = 0
            r6.mo26601e(r2)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zx81.m97167a(p.zx81, p.ibk):void");
    }

    /* JADX INFO: renamed from: b */
    public final long m97168b(long j) {
        hvi0 hvi0Var = cks.f39079b;
        if (cks.m33185d(j, 0L)) {
            return 0L;
        }
        long jM97171e = m97171e() == Long.MAX_VALUE ? 16L : m97171e();
        return ((cks.m33187f(j) + jM97171e) - 1) / jM97171e;
    }

    /* JADX INFO: renamed from: c */
    public final void m97169c() {
        AtomicReference atomicReference = this.f287249h;
        tf60 tf60Var = (tf60) atomicReference.get();
        if (tf60Var == null || !tf60Var.isActive()) {
            di41 di41VarM89578u = x0h1.m89578u(this.f287247f, null, 2, new wm81(this, null, 4), 1);
            while (!atomicReference.compareAndSet(tf60Var, di41VarM89578u)) {
                if (atomicReference.get() != tf60Var) {
                    di41VarM89578u.mo26601e(null);
                    return;
                }
            }
            di41VarM89578u.start();
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m97170d() {
        return this.f287244c;
    }

    /* JADX INFO: renamed from: e */
    public final long m97171e() {
        if (this.f287242a != null) {
            return ((long) 1) * 16;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public final wx81 m97172f(long j, jmh0 jmh0Var) {
        if (this.f287250i) {
            throw new IllegalStateException("TrampolineScope is cancelled");
        }
        wx81 wx81Var = new wx81();
        this.f287248g.add(new xx81(m97168b(j) + this.f287251j, wx81Var, new qv31(this, wx81Var, jmh0Var, 18)));
        m97169c();
        return wx81Var;
    }
}
