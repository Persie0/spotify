package p204p;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ldn0 {

    /* JADX INFO: renamed from: a */
    public final msh f132301a;

    /* JADX INFO: renamed from: b */
    public final hsh f132302b;

    /* JADX INFO: renamed from: c */
    public final xq00 f132303c;

    /* JADX INFO: renamed from: d */
    public final th00 f132304d;

    /* JADX INFO: renamed from: e */
    public final boolean f132305e;

    /* JADX INFO: renamed from: f */
    public final ug5 f132306f;

    /* JADX INFO: renamed from: g */
    public final Object f132307g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f132308h = new AtomicReference(ndn0.f152807c);

    /* JADX INFO: renamed from: i */
    public long f132309i = exg1.m40252u();

    /* JADX INFO: renamed from: j */
    public dqi0 f132310j = sdy0.f208112a;

    /* JADX INFO: renamed from: k */
    public final u12 f132311k;

    /* JADX INFO: renamed from: l */
    public final w9r0 f132312l;

    public ldn0(msh mshVar, hsh hshVar, xq00 xq00Var, fqi0 fqi0Var, th00 th00Var, boolean z, ug5 ug5Var, Object obj) {
        this.f132301a = mshVar;
        this.f132302b = hshVar;
        this.f132303c = xq00Var;
        this.f132304d = th00Var;
        this.f132305e = z;
        this.f132306f = ug5Var;
        this.f132307g = obj;
        u12 u12Var = new u12();
        u12Var.m82162J(fqi0Var, xq00Var.m91736F());
        this.f132311k = u12Var;
        this.f132312l = new w9r0(ug5Var.mo67761a());
    }

    /* JADX INFO: renamed from: a */
    public final void m58747a() throws Exception {
        AtomicReference atomicReference = this.f132308h;
        try {
            switch (((ndn0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m58748b();
                    ndn0 ndn0Var = ndn0.f152810f;
                    ndn0 ndn0Var2 = ndn0.f152811g;
                    while (!atomicReference.compareAndSet(ndn0Var, ndn0Var2)) {
                        if (atomicReference.get() != ndn0Var) {
                            lfq0.m58914b("Unexpected state change from: " + ndn0Var + " to: " + ndn0Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(ndn0.f152805a);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58748b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f132307g) {
                try {
                    this.f132312l.m87549Q(this.f132306f, this.f132311k);
                    this.f132311k.m82183r();
                    this.f132311k.m82184s();
                    this.f132311k.m82182q();
                    this.f132301a.f146781O0 = null;
                } catch (Throwable th) {
                    this.f132311k.m82182q();
                    this.f132301a.f146781O0 = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58749c() {
        dqi0 dqi0Var;
        this.f132308h.set(ndn0.f152806b);
        u12 u12Var = this.f132311k;
        if (((dqi0) u12Var.f225652f).m36649h()) {
            dqi0Var = (dqi0) u12Var.f225652f;
            dqi0 dqi0Var2 = sdy0.f208112a;
            u12Var.f225652f = new dqi0();
            ((qqi0) u12Var.f225648b).m73561g();
        } else {
            dqi0Var = null;
        }
        u12Var.m82182q();
        msh mshVar = this.f132301a;
        mshVar.f146781O0 = null;
        if (dqi0Var != null) {
            mshVar.f146785S0.f225646Y = dqi0Var;
            mshVar.f146787U0 = 2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final w9r0 m58750d() {
        return this.f132312l;
    }

    /* JADX INFO: renamed from: e */
    public final u12 m58751e() {
        return this.f132311k;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58752f() {
        return ((ndn0) this.f132308h.get()).compareTo(ndn0.f152810f) >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58753g() {
        return this.f132308h.get() == ndn0.f152809e && this.f132309i == exg1.m40252u();
    }

    /* JADX INFO: renamed from: h */
    public final void m58754h() {
        ndn0 ndn0Var;
        ndn0 ndn0Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.f132308h;
            ndn0Var = ndn0.f152808d;
            ndn0Var2 = ndn0.f152810f;
            if (atomicReference.compareAndSet(ndn0Var, ndn0Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != ndn0Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        lfq0.m58914b("Unexpected state change from: " + ndn0Var + " to: " + ndn0Var2 + '.');
    }

    /* JADX INFO: renamed from: i */
    public final void m58755i() {
        AtomicReference atomicReference;
        ndn0 ndn0Var;
        do {
            atomicReference = this.f132308h;
            ndn0Var = ndn0.f152810f;
            if (atomicReference.compareAndSet(ndn0Var, ndn0.f152808d)) {
                return;
            }
        } while (atomicReference.get() == ndn0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0127 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:25:0x007b->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public final boolean m58756j(ej11 ej11Var) throws Exception {
        long j;
        ndn0 ndn0Var = ndn0.f152809e;
        AtomicReference atomicReference = this.f132308h;
        try {
            int iOrdinal = ((ndn0) atomicReference.get()).ordinal();
            msh mshVar = this.f132301a;
            hsh hshVar = this.f132302b;
            ndn0 ndn0Var2 = ndn0.f152808d;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    xq00 xq00Var = this.f132303c;
                    boolean z = this.f132305e;
                    if (z) {
                        xq00Var.f264836z = 0;
                        xq00Var.f264835y = true;
                    }
                    try {
                        this.f132310j = hshVar.mo48460b(mshVar, ej11Var, this.f132304d);
                        if (z) {
                            xq00Var.m91798w();
                        }
                        ndn0 ndn0Var3 = ndn0.f152807c;
                        while (!atomicReference.compareAndSet(ndn0Var3, ndn0Var2)) {
                            if (atomicReference.get() != ndn0Var3) {
                                lfq0.m58914b("Unexpected state change from: " + ndn0Var3 + " to: " + ndn0Var2 + '.');
                                if (this.f132310j.m36648g()) {
                                    m58754h();
                                }
                                return m58752f();
                            }
                        }
                        if (this.f132310j.m36648g()) {
                            m58754h();
                        }
                        return m58752f();
                    } catch (Throwable th) {
                        if (z) {
                            xq00Var.m91798w();
                        }
                        throw th;
                    }
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(ndn0Var2, ndn0Var)) {
                            if (atomicReference.get() != ndn0Var2) {
                                lfq0.m58914b("Unexpected state change from: " + ndn0Var2 + " to: " + ndn0Var + '.');
                                j = this.f132309i;
                                this.f132309i = exg1.m40252u();
                                this.f132310j = hshVar.mo48476r(mshVar, ej11Var, this.f132310j);
                                this.f132309i = j;
                                while (!atomicReference.compareAndSet(ndn0Var, ndn0Var2)) {
                                    if (atomicReference.get() != ndn0Var) {
                                        lfq0.m58914b("Unexpected state change from: " + ndn0Var + " to: " + ndn0Var2 + '.');
                                        if (this.f132310j.m36648g()) {
                                            m58754h();
                                        }
                                        return m58752f();
                                    }
                                }
                                if (this.f132310j.m36648g()) {
                                    m58754h();
                                }
                                return m58752f();
                            }
                        }
                        this.f132309i = exg1.m40252u();
                        this.f132310j = hshVar.mo48476r(mshVar, ej11Var, this.f132310j);
                        this.f132309i = j;
                        while (!atomicReference.compareAndSet(ndn0Var, ndn0Var2)) {
                            if (atomicReference.get() != ndn0Var) {
                                lfq0.m58914b("Unexpected state change from: " + ndn0Var + " to: " + ndn0Var2 + '.');
                                if (this.f132310j.m36648g()) {
                                    m58754h();
                                }
                                return m58752f();
                            }
                        }
                        if (this.f132310j.m36648g()) {
                            m58754h();
                        }
                        return m58752f();
                    } catch (Throwable th2) {
                        this.f132309i = j;
                        while (!atomicReference.compareAndSet(ndn0Var, ndn0Var2)) {
                            if (atomicReference.get() != ndn0Var) {
                                lfq0.m58914b("Unexpected state change from: " + ndn0Var + " to: " + ndn0Var2 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.f132309i;
                case 4:
                    vph.m86125b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(ndn0.f152805a);
            throw e;
        }
    }
}
