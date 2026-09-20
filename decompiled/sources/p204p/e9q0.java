package p204p;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class e9q0 {

    /* JADX INFO: renamed from: a */
    public final int f57502a;

    /* JADX INFO: renamed from: b */
    public final eh00 f57503b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f57504c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public int f57505d;

    /* JADX INFO: renamed from: e */
    public boolean f57506e;

    /* JADX INFO: renamed from: f */
    public final n0j[] f57507f;

    /* JADX INFO: renamed from: g */
    public final tpz0 f57508g;

    /* JADX INFO: renamed from: h */
    public final hj5 f57509h;

    public e9q0(int i, eh00 eh00Var) {
        this.f57502a = i;
        this.f57503b = eh00Var;
        this.f57507f = new n0j[i];
        this.f57508g = upz0.m83743a(i);
        this.f57509h = new hj5(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m38252a(ibk ibkVar) {
        c9q0 c9q0Var;
        hj5 hj5Var = this.f57509h;
        if (ibkVar instanceof c9q0) {
            c9q0Var = (c9q0) ibkVar;
            int i = c9q0Var.f35616c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9q0Var.f35616c = i - Integer.MIN_VALUE;
            } else {
                c9q0Var = new c9q0(this, ibkVar);
            }
        } else {
            c9q0Var = new c9q0(this, ibkVar);
        }
        Object obj = c9q0Var.f35614a;
        int i2 = c9q0Var.f35616c;
        tpz0 tpz0Var = this.f57508g;
        if (i2 == 0) {
            bga.m29073P(obj);
            c9q0Var.f35616c = 1;
            Object objM78928b = tpz0Var.m78928b(c9q0Var);
            yuk yukVar = yuk.f276404a;
            if (objM78928b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f57504c;
            reentrantLock.lock();
            try {
                if (this.f57506e) {
                    mif1.m61859L(21, "Connection pool is closed");
                    throw null;
                }
                if (hj5Var.isEmpty() && this.f57505d < this.f57502a) {
                    n0j n0jVar = new n0j((yyx0) this.f57503b.invoke());
                    n0j[] n0jVarArr = this.f57507f;
                    int i3 = this.f57505d;
                    this.f57505d = i3 + 1;
                    n0jVarArr[i3] = n0jVar;
                    hj5Var.addLast(n0jVar);
                }
                n0j n0jVar2 = (n0j) hj5Var.removeLast();
                reentrantLock.unlock();
                return n0jVar2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            tpz0Var.m78930e();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:29:0x0067, B:31:0x006b, B:35:0x0073, B:39:0x007a), top: B:48:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073 A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:29:0x0067, B:31:0x006b, B:35:0x0073, B:39:0x007a), top: B:48:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:29:0x0067, B:31:0x006b, B:35:0x0073, B:39:0x007a), top: B:48:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:25:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0056
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m38253b(long r7, p204p.t29 r9, p204p.ibk r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p204p.d9q0
            if (r0 == 0) goto L13
            r0 = r10
            p.d9q0 r0 = (p204p.d9q0) r0
            int r1 = r0.f46882f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46882f = r1
            goto L18
        L13:
            p.d9q0 r0 = new p.d9q0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f46880d
            int r1 = r0.f46882f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r7 = r0.f46877a
            p.rlv0 r9 = r0.f46879c
            p.eh00 r1 = r0.f46878b
            p204p.bga.m29073P(r10)     // Catch: java.lang.Throwable -> L2c
            goto L58
        L2c:
            r10 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p204p.bga.m29073P(r10)
        L39:
            p.rlv0 r10 = new p.rlv0
            r10.<init>()
            p.iso0 r1 = new p.iso0     // Catch: java.lang.Throwable -> L5d
            r4 = 12
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5d
            r0.f46878b = r9     // Catch: java.lang.Throwable -> L5d
            r0.f46879c = r10     // Catch: java.lang.Throwable -> L5d
            r0.f46877a = r7     // Catch: java.lang.Throwable -> L5d
            r0.f46882f = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = p204p.s1h1.m76979t(r7, r1, r0)     // Catch: java.lang.Throwable -> L5d
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 != r4) goto L56
            return r4
        L56:
            r1 = r9
            r9 = r10
        L58:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L67
        L5d:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L62:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L67:
            boolean r4 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L71
            r9.invoke()     // Catch: java.lang.Throwable -> L6f
            goto L78
        L6f:
            r7 = move-exception
            goto L7b
        L71:
            if (r0 != 0) goto L7a
            java.lang.Object r10 = r10.f200373a     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L78
            return r10
        L78:
            r0 = r1
            goto L39
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L6f
        L7b:
            java.lang.Object r8 = r10.f200373a
            p.n0j r8 = (p204p.n0j) r8
            if (r8 == 0) goto L84
            r6.m38256e(r8)
        L84:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.e9q0.m38253b(long, p.t29, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m38254c() {
        ReentrantLock reentrantLock = this.f57504c;
        reentrantLock.lock();
        try {
            this.f57506e = true;
            for (n0j n0jVar : this.f57507f) {
                if (n0jVar != null) {
                    n0jVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38255d(StringBuilder sb) {
        hj5 hj5Var = this.f57509h;
        ReentrantLock reentrantLock = this.f57504c;
        reentrantLock.lock();
        try {
            ro80 ro80VarM44508o = geg1.m44508o();
            int i = hj5Var.f91964c;
            for (int i2 = 0; i2 < i; i2++) {
                ro80VarM44508o.add(hj5Var.get(i2));
            }
            ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f57502a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            tpz0 tpz0Var = this.f57508g;
            tpz0Var.getClass();
            sb2.append(Math.max(spz0.f212973g.get(tpz0Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + ro80VarM44506m.mo47661a() + ")[" + g6f.m43753y0(ro80VarM44506m, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            n0j[] n0jVarArr = this.f57507f;
            int length = n0jVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                n0j n0jVar = n0jVarArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(n0jVar != null ? n0jVar.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (n0jVar != null) {
                    n0jVar.m63455e(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m38256e(n0j n0jVar) {
        ReentrantLock reentrantLock = this.f57504c;
        reentrantLock.lock();
        try {
            this.f57509h.addLast(n0jVar);
            reentrantLock.unlock();
            this.f57508g.m78930e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
