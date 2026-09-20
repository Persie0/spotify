package p204p;

import coil3.request.NullRequestDataException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class hvu0 implements f940 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f95794f = 0;

    /* JADX INFO: renamed from: a */
    public final fvu0 f95795a;

    /* JADX INFO: renamed from: b */
    public final c9k f95796b = hug1.m48657b();

    /* JADX INFO: renamed from: c */
    public final r0e1 f95797c;

    /* JADX INFO: renamed from: d */
    public final cxf f95798d;

    /* JADX INFO: renamed from: e */
    public volatile /* synthetic */ int f95799e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(hvu0.class, "e");
    }

    public hvu0(fvu0 fvu0Var) {
        this.f95795a = fvu0Var;
        qp4 qp4VarM85961i = vlg1.m85961i(this);
        r0e1 r0e1VarM41457e = fem.m41457e(this);
        this.f95797c = r0e1VarM41457e;
        azp0 azp0Var = new azp0(fvu0Var.f73872f);
        hug1.m48661f(azp0Var, fvu0Var);
        iug1.m51685n(azp0Var, fvu0Var);
        lug1.m60014x(azp0Var);
        hug1.m48660e(azp0Var);
        azp0Var.m27653l(new g9v(this, qp4VarM85961i, r0e1VarM41457e));
        this.f95798d = azp0Var.m27661t();
    }

    /* JADX INFO: renamed from: a */
    public final cwr m48896a(vb40 vb40Var) {
        return iug1.m51691t(vb40Var, x0h1.m89574q(this.f95796b, (juk) this.f95795a.f73869c.getValue(), 0, new o8t0(this, vb40Var, null, 1), 2));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135 A[Catch: all -> 0x003f, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012f, B:73:0x0135, B:74:0x013e, B:76:0x0142, B:79:0x014e, B:80:0x0153), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x013e A[Catch: all -> 0x003f, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012f, B:73:0x0135, B:74:0x013e, B:76:0x0142, B:79:0x014e, B:80:0x0153), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0142 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012f, B:73:0x0135, B:74:0x013e, B:76:0x0142, B:79:0x014e, B:80:0x0153), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014e A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #7 {all -> 0x003f, blocks: (B:15:0x003a, B:71:0x012f, B:73:0x0135, B:74:0x013e, B:76:0x0142, B:79:0x014e, B:80:0x0153), top: B:113:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166 A[Catch: all -> 0x0171, TryCatch #1 {all -> 0x0171, blocks: (B:88:0x0162, B:90:0x0166, B:92:0x016d, B:93:0x0170, B:96:0x0173), top: B:103:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x016d A[Catch: all -> 0x0171, TryCatch #1 {all -> 0x0171, blocks: (B:88:0x0162, B:90:0x0166, B:92:0x016d, B:93:0x0170, B:96:0x0173), top: B:103:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0173 A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #1 {all -> 0x0171, blocks: (B:88:0x0162, B:90:0x0166, B:92:0x016d, B:93:0x0170, B:96:0x0173), top: B:103:0x0162 }] */
    /* JADX INFO: renamed from: b */
    public final Object m48897b(vb40 vb40Var, int i, ibk ibkVar) {
        gvu0 gvu0Var;
        suw0 suw0VarM74382m;
        vb40 vb40VarM74389t;
        suw0 suw0Var;
        v5x v5xVar;
        int i2;
        suw0 suw0Var2;
        suw0 suw0Var3;
        p340 p340Var;
        v5x v5xVar2;
        vb40 vb40Var2;
        Object objM89557A;
        ub40 ub40Var;
        ec40 ec40Var;
        if (ibkVar instanceof gvu0) {
            gvu0Var = (gvu0) ibkVar;
            int i3 = gvu0Var.f84839h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gvu0Var.f84839h = i3 - Integer.MIN_VALUE;
            } else {
                gvu0Var = new gvu0(this, ibkVar);
            }
        } else {
            gvu0Var = new gvu0(this, ibkVar);
        }
        gvu0 gvu0Var2 = gvu0Var;
        Object obj = gvu0Var2.f84837f;
        int i4 = gvu0Var2.f84839h;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = gvu0Var2.f84836e;
                    v5xVar = gvu0Var2.f84834c;
                    vb40VarM74389t = gvu0Var2.f84833b;
                    suw0Var2 = gvu0Var2.f84832a;
                    try {
                        bga.m29073P(obj);
                        suw0VarM74382m = suw0Var2;
                    } catch (Throwable th) {
                        th = th;
                        suw0Var = suw0Var2;
                    }
                } else if (i4 == 2) {
                    i2 = gvu0Var2.f84836e;
                    p340 p340Var2 = gvu0Var2.f84835d;
                    v5x v5xVar3 = gvu0Var2.f84834c;
                    vb40 vb40Var3 = gvu0Var2.f84833b;
                    suw0Var2 = gvu0Var2.f84832a;
                    try {
                        bga.m29073P(obj);
                        v5xVar2 = v5xVar3;
                        vb40VarM74389t = vb40Var3;
                        suw0Var3 = suw0Var2;
                        p340Var = p340Var2;
                        int i5 = i2;
                        try {
                            ci21 ci21Var = (ci21) obj;
                            v5xVar2.getClass();
                            juk jukVar = vb40VarM74389t.f239405g;
                            vb40Var2 = vb40VarM74389t;
                            try {
                                yh9 yh9Var = new yh9(1, vb40Var2, this, ci21Var, v5xVar2, p340Var, null);
                                gvu0Var2.f84832a = suw0Var3;
                                gvu0Var2.f84833b = vb40Var2;
                                gvu0Var2.f84834c = v5xVar2;
                                gvu0Var2.f84835d = null;
                                gvu0Var2.f84836e = i5;
                                gvu0Var2.f84839h = 3;
                                objM89557A = x0h1.m89557A(jukVar, yh9Var, gvu0Var2);
                                if (objM89557A != yukVar) {
                                    vb40VarM74389t = vb40Var2;
                                    v5xVar = v5xVar2;
                                    suw0Var = suw0Var3;
                                    obj = objM89557A;
                                    ec40Var = (ec40) obj;
                                    if (ec40Var instanceof ny51) {
                                        m48901f((ny51) ec40Var, vb40VarM74389t.f239401c, v5xVar);
                                    } else {
                                        if (!(ec40Var instanceof fgw)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m48900e((fgw) ec40Var, vb40VarM74389t.f239401c, v5xVar);
                                    }
                                    suw0Var.mo79417b();
                                    return ec40Var;
                                }
                                return yukVar;
                            } catch (Throwable th2) {
                                th = th2;
                                vb40VarM74389t = vb40Var2;
                                v5xVar = v5xVar2;
                                suw0Var = suw0Var3;
                                if (th instanceof CancellationException) {
                                    fgw fgwVarM92082c = xtm0.m92082c(vb40VarM74389t, th);
                                    m48900e(fgwVarM92082c, vb40VarM74389t.f239401c, v5xVar);
                                    suw0Var.mo79417b();
                                    return fgwVarM92082c;
                                }
                                v5xVar.getClass();
                                ub40Var = vb40VarM74389t.f239402d;
                                if (ub40Var != null) {
                                    ub40Var.mo37210d(vb40VarM74389t);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        v5xVar = v5xVar3;
                        vb40VarM74389t = vb40Var3;
                        suw0Var = suw0Var2;
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v5xVar = gvu0Var2.f84834c;
                    vb40VarM74389t = gvu0Var2.f84833b;
                    suw0Var = gvu0Var2.f84832a;
                    try {
                        bga.m29073P(obj);
                        ec40Var = (ec40) obj;
                        if (ec40Var instanceof ny51) {
                            m48901f((ny51) ec40Var, vb40VarM74389t.f239401c, v5xVar);
                        } else {
                            if (!(ec40Var instanceof fgw)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            m48900e((fgw) ec40Var, vb40VarM74389t.f239401c, v5xVar);
                        }
                        suw0Var.mo79417b();
                        return ec40Var;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                suw0Var = suw0Var2;
                try {
                    if (th instanceof CancellationException) {
                        fgw fgwVarM92082c2 = xtm0.m92082c(vb40VarM74389t, th);
                        m48900e(fgwVarM92082c2, vb40VarM74389t.f239401c, v5xVar);
                        suw0Var.mo79417b();
                        return fgwVarM92082c2;
                    }
                    v5xVar.getClass();
                    ub40Var = vb40VarM74389t.f239402d;
                    if (ub40Var != null) {
                        ub40Var.mo37210d(vb40VarM74389t);
                    }
                    throw th;
                } catch (Throwable th6) {
                    suw0Var.mo79417b();
                    throw th6;
                }
            }
            bga.m29073P(obj);
            tf60 tf60VarM73186B = qlg1.m73186B(gvu0Var2.getContext());
            boolean z = i == 0;
            r0e1 r0e1Var = this.f95797c;
            suw0VarM74382m = r0e1Var.m74382m(vb40Var, tf60VarM73186B, z);
            suw0VarM74382m.mo79418c();
            vb40VarM74389t = r0e1Var.m74389t(vb40Var);
            v5x v5xVar4 = v5x.f237678a;
            try {
                if (vb40VarM74389t.f239400b.equals(flk0.f70785a)) {
                    throw new NullRequestDataException();
                }
                suw0VarM74382m.start();
                if (i == 0) {
                    gvu0Var2.f84832a = suw0VarM74382m;
                    gvu0Var2.f84833b = vb40VarM74389t;
                    gvu0Var2.f84834c = v5xVar4;
                    gvu0Var2.f84836e = i;
                    gvu0Var2.f84839h = 1;
                    if (suw0VarM74382m.mo79416a(gvu0Var2) != yukVar) {
                        i2 = i;
                        suw0Var2 = suw0VarM74382m;
                        v5xVar = v5xVar4;
                        suw0VarM74382m = suw0Var2;
                    }
                } else {
                    i2 = i;
                    v5xVar = v5xVar4;
                }
                return yukVar;
            } catch (Throwable th7) {
                th = th7;
                suw0Var = suw0VarM74382m;
                v5xVar = v5xVar4;
            }
            vb40VarM74389t.getClass();
            iu61 iu61Var = vb40VarM74389t.f239401c;
            if (iu61Var != null) {
                p340 p340Var3 = (p340) vb40VarM74389t.f239411m.invoke(vb40VarM74389t);
                if (p340Var3 == null) {
                    p340Var3 = (p340) vb40VarM74389t.f239419u.f207342h.invoke(vb40VarM74389t);
                }
                iu61Var.mo47849b(p340Var3);
            }
            v5xVar.getClass();
            ub40 ub40Var2 = vb40VarM74389t.f239402d;
            if (ub40Var2 != null) {
                ub40Var2.mo37208b();
            }
            ri21 ri21Var = vb40VarM74389t.f239414p;
            gvu0Var2.f84832a = suw0VarM74382m;
            gvu0Var2.f84833b = vb40VarM74389t;
            gvu0Var2.f84834c = v5xVar;
            gvu0Var2.f84835d = null;
            gvu0Var2.f84836e = i2;
            gvu0Var2.f84839h = 2;
            Object objMo40114b = ri21Var.mo40114b(gvu0Var2);
            if (objMo40114b != yukVar) {
                suw0Var3 = suw0VarM74382m;
                obj = objMo40114b;
                p340Var = null;
                v5xVar2 = v5xVar;
                int i6 = i2;
                ci21 ci21Var2 = (ci21) obj;
                v5xVar2.getClass();
                juk jukVar2 = vb40VarM74389t.f239405g;
                vb40Var2 = vb40VarM74389t;
                yh9 yh9Var2 = new yh9(1, vb40Var2, this, ci21Var2, v5xVar2, p340Var, null);
                gvu0Var2.f84832a = suw0Var3;
                gvu0Var2.f84833b = vb40Var2;
                gvu0Var2.f84834c = v5xVar2;
                gvu0Var2.f84835d = null;
                gvu0Var2.f84836e = i6;
                gvu0Var2.f84839h = 3;
                objM89557A = x0h1.m89557A(jukVar2, yh9Var2, gvu0Var2);
                if (objM89557A != yukVar) {
                    vb40VarM74389t = vb40Var2;
                    v5xVar = v5xVar2;
                    suw0Var = suw0Var3;
                    obj = objM89557A;
                    ec40Var = (ec40) obj;
                    if (ec40Var instanceof ny51) {
                        m48901f((ny51) ec40Var, vb40VarM74389t.f239401c, v5xVar);
                    } else {
                        if (!(ec40Var instanceof fgw)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m48900e((fgw) ec40Var, vb40VarM74389t.f239401c, v5xVar);
                    }
                    suw0Var.mo79417b();
                    return ec40Var;
                }
            }
            return yukVar;
        } catch (Throwable th8) {
            th = th8;
            suw0Var = suw0VarM74382m;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m48898c(vb40 vb40Var, ibk ibkVar) {
        return !iug1.m51696y(vb40Var) ? m48897b(vb40Var, 1, ibkVar) : kk40.m56684z(new dnc(this, vb40Var, null, 12), ibkVar);
    }

    /* JADX INFO: renamed from: d */
    public final mvu0 m48899d() {
        return (mvu0) this.f95795a.f73870d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: e */
    public final void m48900e(fgw fgwVar, iu61 iu61Var, v5x v5xVar) {
        vb40 vb40Var = fgwVar.f69411b;
        p340 p340Var = fgwVar.f69410a;
        if (iu61Var instanceof ob91) {
            a791 a791VarMo62406a = ((r691) zuj0.m97054q(vb40Var, zb40.f281236a)).mo62406a((ob91) iu61Var, fgwVar);
            if (a791VarMo62406a instanceof noj0) {
                iu61Var.mo48984a(p340Var);
            } else {
                v5xVar.getClass();
                a791VarMo62406a.mo24930a();
            }
        } else if (iu61Var != null) {
            iu61Var.mo48984a(p340Var);
        }
        v5xVar.getClass();
        ub40 ub40Var = vb40Var.f239402d;
        if (ub40Var != null) {
            ub40Var.mo37209c(vb40Var, fgwVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: f */
    public final void m48901f(ny51 ny51Var, iu61 iu61Var, v5x v5xVar) {
        vb40 vb40Var = ny51Var.f159719b;
        p340 p340Var = ny51Var.f159718a;
        if (iu61Var instanceof ob91) {
            a791 a791VarMo62406a = ((r691) zuj0.m97054q(vb40Var, zb40.f281236a)).mo62406a((ob91) iu61Var, ny51Var);
            if (a791VarMo62406a instanceof noj0) {
                iu61Var.mo48985d(p340Var);
            } else {
                v5xVar.getClass();
                a791VarMo62406a.mo24930a();
            }
        } else if (iu61Var != null) {
            iu61Var.mo48985d(p340Var);
        }
        v5xVar.getClass();
        ub40 ub40Var = vb40Var.f239402d;
        if (ub40Var != null) {
            ub40Var.mo37207a(vb40Var, ny51Var);
        }
    }
}
