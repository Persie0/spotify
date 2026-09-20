package p204p;

import android.content.Intent;
import android.view.View;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yjg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f273365a;

    /* JADX INFO: renamed from: b */
    public static sd40 f273366b;

    /* JADX INFO: renamed from: a */
    public static final void m93909a(kw8 kw8Var, jt8 jt8Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1609383338);
        int i2 = (xq00Var.m91766g(kw8Var) ? 4 : 2) | i | (xq00Var.m91766g(jt8Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(fxh0Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            qiu.m72876b(15, rkk.m75772x(-1220840245, new xpf(fxh0Var, kw8Var, jt8Var, eh00Var), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xpf(kw8Var, jt8Var, eh00Var, fxh0Var, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:76:0x010e  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m93910b(final fxh0 fxh0Var, ch01 ch01Var, final long j, final long j2, float f, final fyf fyfVar, xq00 xq00Var, final int i, final int i2) {
        int i3;
        ch01 ch01Var2;
        int i4;
        int i5;
        float f2;
        int i6;
        fyf fyfVar2;
        boolean z;
        final float f3;
        final ch01 ch01Var3;
        pgv0 pgv0VarM91796v;
        ch01 ch01Var4;
        final float f4;
        final ch01 ch01Var5;
        int i7;
        int i8;
        int i9;
        xq00Var.m91775k0(174096871);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                ch01Var2 = ch01Var;
                i3 |= xq00Var.m91766g(ch01Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (xq00Var.m91764f(j)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            }
            if ((i & 3072) == 0) {
                if (xq00Var.m91764f(j2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            i4 = i3 | 24576;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (xq00Var.m91760d(f2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    fyfVar2 = fyfVar;
                    if (xq00Var.m91770i(fyfVar2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i4 |= i7;
                } else {
                    fyfVar2 = fyfVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i4 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0 || xq00Var.m91735E()) {
                        if (i10 != 0) {
                            ch01Var4 = kxf1.f127485a;
                        } else {
                            ch01Var4 = ch01Var2;
                        }
                        if (i5 != 0) {
                            f2 = 0;
                        }
                        f4 = f2;
                        ch01Var5 = ch01Var4;
                    } else {
                        xq00Var.m91757b0();
                        f4 = f2;
                        ch01Var5 = ch01Var2;
                    }
                    xq00Var.m91790s();
                    bns bnsVar = dyt.f54441b;
                    final float f5 = ((ybs) xq00Var.m91774k(bnsVar)).f271238a + f4;
                    final fyf fyfVar3 = fyfVar2;
                    qqg1.m73533c(new c4t0[]{lq51.m59706l(j2, fgj.f69332a), bnsVar.mo30068a(new ybs(f5))}, rkk.m75772x(-2004281689, new th00() { // from class: p.x761
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            xq00 xq00Var2 = (xq00) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            boolean zM91752Y = xq00Var2.m91752Y(iIntValue & 1, (iIntValue & 3) != 2);
                            w2a1 w2a1Var = w2a1.f247311a;
                            if (!zM91752Y) {
                                xq00Var2.m91757b0();
                                return w2a1Var;
                            }
                            fxh0 fxh0VarM93928t = yjg1.m93928t(f4, yjg1.m93929u(j, (vep) xq00Var2.m91774k(dyt.f54440a), f5, xq00Var2), fxh0Var, ch01Var5);
                            Object objM91750T = xq00Var2.m91750T();
                            ia7 ia7Var = t6x0.f217647t;
                            if (objM91750T == ia7Var) {
                                objM91750T = new q5s0(25);
                                xq00Var2.m91793t0(objM91750T);
                            }
                            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM93928t, false, (gh00) objM91750T);
                            Object objM91750T2 = xq00Var2.m91750T();
                            if (objM91750T2 == ia7Var) {
                                objM91750T2 = h69.f88043l;
                                xq00Var2.m91793t0(objM91750T2);
                            }
                            fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM96644b, w2a1Var, (PointerInputEventHandler) objM91750T2);
                            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, true);
                            int iM70356o = pmg1.m70356o(xq00Var2);
                            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
                            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a);
                            soh.f211194A.getClass();
                            C2087le c2087le = roh.f201257b;
                            if (xq00Var2.f264811a == null) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var2.m91779m0();
                            if (xq00Var2.f264808S) {
                                xq00Var2.m91776l(c2087le);
                            } else {
                                xq00Var2.m91799w0();
                            }
                            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
                            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                            yhh yhhVar = roh.f201265j;
                            if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o))) {
                                pi9.m70087l(iM70356o, xq00Var2, iM70356o, yhhVar);
                            }
                            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                            ms2.m62690o(0, fyfVar3, xq00Var2, xq00Var2, true);
                            return w2a1Var;
                        }
                    }, xq00Var), xq00Var, 56);
                    ch01Var3 = ch01Var5;
                    f3 = f4;
                } else {
                    xq00Var.m91757b0();
                    f3 = f2;
                    ch01Var3 = ch01Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.y761
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            yjg1.m93910b(fxh0Var, ch01Var3, j, j2, f3, fyfVar, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i4 = 221184 | i3;
            f2 = f;
            if ((1572864 & i) == 0) {
                fyfVar2 = fyfVar;
                if (xq00Var.m91770i(fyfVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            } else {
                fyfVar2 = fyfVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ch01Var4 = kxf1.f127485a;
                    } else {
                        ch01Var4 = ch01Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0;
                    }
                    f4 = f2;
                    ch01Var5 = ch01Var4;
                } else {
                    if (i10 != 0) {
                        ch01Var4 = kxf1.f127485a;
                    } else {
                        ch01Var4 = ch01Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0;
                    }
                    f4 = f2;
                    ch01Var5 = ch01Var4;
                }
                xq00Var.m91790s();
                bns bnsVar2 = dyt.f54441b;
                final float f6 = ((ybs) xq00Var.m91774k(bnsVar2)).f271238a + f4;
                final fyf fyfVar4 = fyfVar2;
                qqg1.m73533c(new c4t0[]{lq51.m59706l(j2, fgj.f69332a), bnsVar2.mo30068a(new ybs(f6))}, rkk.m75772x(-2004281689, new th00() { // from class: p.x761
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        xq00 xq00Var2 = (xq00) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        boolean zM91752Y = xq00Var2.m91752Y(iIntValue & 1, (iIntValue & 3) != 2);
                        w2a1 w2a1Var = w2a1.f247311a;
                        if (!zM91752Y) {
                            xq00Var2.m91757b0();
                            return w2a1Var;
                        }
                        fxh0 fxh0VarM93928t = yjg1.m93928t(f4, yjg1.m93929u(j, (vep) xq00Var2.m91774k(dyt.f54440a), f6, xq00Var2), fxh0Var, ch01Var5);
                        Object objM91750T = xq00Var2.m91750T();
                        ia7 ia7Var = t6x0.f217647t;
                        if (objM91750T == ia7Var) {
                            objM91750T = new q5s0(25);
                            xq00Var2.m91793t0(objM91750T);
                        }
                        fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM93928t, false, (gh00) objM91750T);
                        Object objM91750T2 = xq00Var2.m91750T();
                        if (objM91750T2 == ia7Var) {
                            objM91750T2 = h69.f88043l;
                            xq00Var2.m91793t0(objM91750T2);
                        }
                        fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM96644b, w2a1Var, (PointerInputEventHandler) objM91750T2);
                        m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, true);
                        int iM70356o = pmg1.m70356o(xq00Var2);
                        wpn0 wpn0VarM91778m = xq00Var2.m91778m();
                        fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a);
                        soh.f211194A.getClass();
                        C2087le c2087le = roh.f201257b;
                        if (xq00Var2.f264811a == null) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var2.m91779m0();
                        if (xq00Var2.f264808S) {
                            xq00Var2.m91776l(c2087le);
                        } else {
                            xq00Var2.m91799w0();
                        }
                        zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
                        zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                        yhh yhhVar = roh.f201265j;
                        if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o))) {
                            pi9.m70087l(iM70356o, xq00Var2, iM70356o, yhhVar);
                        }
                        zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                        ms2.m62690o(0, fyfVar4, xq00Var2, xq00Var2, true);
                        return w2a1Var;
                    }
                }, xq00Var), xq00Var, 56);
                ch01Var3 = ch01Var5;
                f3 = f4;
            } else {
                xq00Var.m91757b0();
                f3 = f2;
                ch01Var3 = ch01Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new th00() { // from class: p.y761
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yjg1.m93910b(fxh0Var, ch01Var3, j, j2, f3, fyfVar, (xq00) obj, fyg1.m43076B(i | 1), i2);
                        return w2a1.f247311a;
                    }
                };
            }
        }
        i3 |= 48;
        ch01Var2 = ch01Var;
        if ((i & 384) == 0) {
            if (xq00Var.m91764f(j)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i & 3072) == 0) {
            if (xq00Var.m91764f(j2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        i4 = i3 | 24576;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (xq00Var.m91760d(f2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                fyfVar2 = fyfVar;
                if (xq00Var.m91770i(fyfVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            } else {
                fyfVar2 = fyfVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ch01Var4 = kxf1.f127485a;
                    } else {
                        ch01Var4 = ch01Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0;
                    }
                    f4 = f2;
                    ch01Var5 = ch01Var4;
                } else {
                    if (i10 != 0) {
                        ch01Var4 = kxf1.f127485a;
                    } else {
                        ch01Var4 = ch01Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0;
                    }
                    f4 = f2;
                    ch01Var5 = ch01Var4;
                }
                xq00Var.m91790s();
                bns bnsVar3 = dyt.f54441b;
                final float f7 = ((ybs) xq00Var.m91774k(bnsVar3)).f271238a + f4;
                final fyf fyfVar5 = fyfVar2;
                qqg1.m73533c(new c4t0[]{lq51.m59706l(j2, fgj.f69332a), bnsVar3.mo30068a(new ybs(f7))}, rkk.m75772x(-2004281689, new th00() { // from class: p.x761
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        xq00 xq00Var2 = (xq00) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        boolean zM91752Y = xq00Var2.m91752Y(iIntValue & 1, (iIntValue & 3) != 2);
                        w2a1 w2a1Var = w2a1.f247311a;
                        if (!zM91752Y) {
                            xq00Var2.m91757b0();
                            return w2a1Var;
                        }
                        fxh0 fxh0VarM93928t = yjg1.m93928t(f4, yjg1.m93929u(j, (vep) xq00Var2.m91774k(dyt.f54440a), f7, xq00Var2), fxh0Var, ch01Var5);
                        Object objM91750T = xq00Var2.m91750T();
                        ia7 ia7Var = t6x0.f217647t;
                        if (objM91750T == ia7Var) {
                            objM91750T = new q5s0(25);
                            xq00Var2.m91793t0(objM91750T);
                        }
                        fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM93928t, false, (gh00) objM91750T);
                        Object objM91750T2 = xq00Var2.m91750T();
                        if (objM91750T2 == ia7Var) {
                            objM91750T2 = h69.f88043l;
                            xq00Var2.m91793t0(objM91750T2);
                        }
                        fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM96644b, w2a1Var, (PointerInputEventHandler) objM91750T2);
                        m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, true);
                        int iM70356o = pmg1.m70356o(xq00Var2);
                        wpn0 wpn0VarM91778m = xq00Var2.m91778m();
                        fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a);
                        soh.f211194A.getClass();
                        C2087le c2087le = roh.f201257b;
                        if (xq00Var2.f264811a == null) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var2.m91779m0();
                        if (xq00Var2.f264808S) {
                            xq00Var2.m91776l(c2087le);
                        } else {
                            xq00Var2.m91799w0();
                        }
                        zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
                        zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                        yhh yhhVar = roh.f201265j;
                        if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o))) {
                            pi9.m70087l(iM70356o, xq00Var2, iM70356o, yhhVar);
                        }
                        zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                        ms2.m62690o(0, fyfVar5, xq00Var2, xq00Var2, true);
                        return w2a1Var;
                    }
                }, xq00Var), xq00Var, 56);
                ch01Var3 = ch01Var5;
                f3 = f4;
            } else {
                xq00Var.m91757b0();
                f3 = f2;
                ch01Var3 = ch01Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new th00() { // from class: p.y761
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yjg1.m93910b(fxh0Var, ch01Var3, j, j2, f3, fyfVar, (xq00) obj, fyg1.m43076B(i | 1), i2);
                        return w2a1.f247311a;
                    }
                };
            }
        }
        i4 = 221184 | i3;
        f2 = f;
        if ((1572864 & i) == 0) {
            fyfVar2 = fyfVar;
            if (xq00Var.m91770i(fyfVar2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        } else {
            fyfVar2 = fyfVar;
        }
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    ch01Var4 = kxf1.f127485a;
                } else {
                    ch01Var4 = ch01Var2;
                }
                if (i5 != 0) {
                    f2 = 0;
                }
                f4 = f2;
                ch01Var5 = ch01Var4;
            } else {
                if (i10 != 0) {
                    ch01Var4 = kxf1.f127485a;
                } else {
                    ch01Var4 = ch01Var2;
                }
                if (i5 != 0) {
                    f2 = 0;
                }
                f4 = f2;
                ch01Var5 = ch01Var4;
            }
            xq00Var.m91790s();
            bns bnsVar4 = dyt.f54441b;
            final float f8 = ((ybs) xq00Var.m91774k(bnsVar4)).f271238a + f4;
            final fyf fyfVar6 = fyfVar2;
            qqg1.m73533c(new c4t0[]{lq51.m59706l(j2, fgj.f69332a), bnsVar4.mo30068a(new ybs(f8))}, rkk.m75772x(-2004281689, new th00() { // from class: p.x761
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    xq00 xq00Var2 = (xq00) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean zM91752Y = xq00Var2.m91752Y(iIntValue & 1, (iIntValue & 3) != 2);
                    w2a1 w2a1Var = w2a1.f247311a;
                    if (!zM91752Y) {
                        xq00Var2.m91757b0();
                        return w2a1Var;
                    }
                    fxh0 fxh0VarM93928t = yjg1.m93928t(f4, yjg1.m93929u(j, (vep) xq00Var2.m91774k(dyt.f54440a), f8, xq00Var2), fxh0Var, ch01Var5);
                    Object objM91750T = xq00Var2.m91750T();
                    ia7 ia7Var = t6x0.f217647t;
                    if (objM91750T == ia7Var) {
                        objM91750T = new q5s0(25);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM93928t, false, (gh00) objM91750T);
                    Object objM91750T2 = xq00Var2.m91750T();
                    if (objM91750T2 == ia7Var) {
                        objM91750T2 = h69.f88043l;
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM96644b, w2a1Var, (PointerInputEventHandler) objM91750T2);
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, true);
                    int iM70356o = pmg1.m70356o(xq00Var2);
                    wpn0 wpn0VarM91778m = xq00Var2.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (xq00Var2.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var2.m91779m0();
                    if (xq00Var2.f264808S) {
                        xq00Var2.m91776l(c2087le);
                    } else {
                        xq00Var2.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                    yhh yhhVar = roh.f201265j;
                    if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o))) {
                        pi9.m70087l(iM70356o, xq00Var2, iM70356o, yhhVar);
                    }
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                    ms2.m62690o(0, fyfVar6, xq00Var2, xq00Var2, true);
                    return w2a1Var;
                }
            }, xq00Var), xq00Var, 56);
            ch01Var3 = ch01Var5;
            f3 = f4;
        } else {
            xq00Var.m91757b0();
            f3 = f2;
            ch01Var3 = ch01Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.y761
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yjg1.m93910b(fxh0Var, ch01Var3, j, j2, f3, fyfVar, (xq00) obj, fyg1.m43076B(i | 1), i2);
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m93911c(final eh00 eh00Var, final fxh0 fxh0Var, final ch01 ch01Var, final long j, final long j2, final float f, final voi0 voi0Var, final fyf fyfVar, xq00 xq00Var, final int i) {
        eh00 eh00Var2;
        int i2;
        fyf fyfVar2;
        xq00Var.m91775k0(2141308794);
        if ((i & 6) == 0) {
            eh00Var2 = eh00Var;
            i2 = (xq00Var.m91770i(eh00Var2) ? 4 : 2) | i;
        } else {
            eh00Var2 = eh00Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(ch01Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91764f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91764f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91766g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= xq00Var.m91760d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= xq00Var.m91766g(voi0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            fyfVar2 = fyfVar;
            i2 |= xq00Var.m91770i(fyfVar2) ? 536870912 : 268435456;
        } else {
            fyfVar2 = fyfVar;
        }
        if (xq00Var.m91752Y(i2 & 1, (306783379 & i2) != 306783378)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            bns bnsVar = dyt.f54441b;
            final float f2 = ((ybs) xq00Var.m91774k(bnsVar)).f271238a + f;
            final eh00 eh00Var3 = eh00Var2;
            final fyf fyfVar3 = fyfVar2;
            qqg1.m73533c(new c4t0[]{lq51.m59706l(j2, fgj.f69332a), bnsVar.mo30068a(new ybs(f2))}, rkk.m75772x(-1766606150, new th00() { // from class: p.z761
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    xq00 xq00Var2 = (xq00) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (xq00Var2.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                        wy41 wy41Var = t850.f217972a;
                        fxh0 fxh0VarM93928t = yjg1.m93928t(f, yjg1.m93929u(j, (vep) xq00Var2.m91774k(dyt.f54440a), f2, xq00Var2), fxh0Var.mo34315F(yef0.f271990a), ch01Var);
                        bns bnsVar2 = wgx0.f251195a;
                        long j3 = n6f.f150871k;
                        fxh0 fxh0VarM47245v = hdi.m47245v(fxh0VarM93928t, voi0Var, (ybs.m93301b(Float.NaN, Float.NaN) && as91.m27074b(j3, j3)) ? wgx0.f251196b : new ygx0(true, j3), true, null, null, eh00Var3, 24);
                        m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, true);
                        int iM70356o = pmg1.m70356o(xq00Var2);
                        wpn0 wpn0VarM91778m = xq00Var2.m91778m();
                        fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM47245v);
                        soh.f211194A.getClass();
                        C2087le c2087le = roh.f201257b;
                        if (xq00Var2.f264811a == null) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var2.m91779m0();
                        if (xq00Var2.f264808S) {
                            xq00Var2.m91776l(c2087le);
                        } else {
                            xq00Var2.m91799w0();
                        }
                        zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
                        zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                        yhh yhhVar = roh.f201265j;
                        if (xq00Var2.f264808S || !wj50.m88271j(xq00Var2.m91750T(), Integer.valueOf(iM70356o))) {
                            pi9.m70087l(iM70356o, xq00Var2, iM70356o, yhhVar);
                        }
                        zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                        ms2.m62690o(0, fyfVar3, xq00Var2, xq00Var2, true);
                    } else {
                        xq00Var2.m91757b0();
                    }
                    return w2a1.f247311a;
                }
            }, xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.a861
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yjg1.m93911c(eh00Var, fxh0Var, ch01Var, j, j2, f, voi0Var, fyfVar, (xq00) obj, fyg1.m43076B(i | 1));
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX INFO: renamed from: d */
    public static final boolean m93912d(ga60 ga60Var, ga60 ga60Var2) {
        boolean zEquals;
        ddy0 ddy0Var = ga60Var2.f77982a;
        boolean z = ddy0Var.f47917d != null && ga60Var2.f77983b.contains(r860.f196719b.f196723a);
        boolean z2 = ga60Var.f77982a.f47917d != null && ga60Var.f77983b.contains(r860.f196719b.f196723a);
        String str = ga60Var.f77982a.f47917d;
        String str2 = ddy0Var.f47917d;
        if (str == null) {
            if (str2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str2 == null) {
            zEquals = false;
        } else {
            zEquals = str.equals(str2);
        }
        return z && !(z2 && zEquals);
    }

    /* JADX INFO: renamed from: e */
    public static final wjg1 m93913e(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("extra_pop_current_fragment", false);
        String stringExtra = intent.getStringExtra("extra_fragment_tag");
        boolean booleanExtra2 = intent.getBooleanExtra("extra_clear_backstack", false);
        if (booleanExtra) {
            return ti8.f220569c;
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            return booleanExtra2 ? ri8.f199452c : qi8.f188956c;
        }
        return new si8(stringExtra);
    }

    /* JADX INFO: renamed from: f */
    public static final m05 m93914f(Intent intent) {
        return new m05(intent.getIntExtra("extra_animation_in", 0), intent.getIntExtra("extra_animation_out", 0), intent.getBooleanExtra("extra_crossfade", false));
    }

    /* JADX INFO: renamed from: g */
    public static final Set m93915g(ga60 ga60Var) {
        s960 s960Var;
        boolean z = ga60Var.f77984c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean zM93927s = m93927s(ga60Var);
        Set set = ga60Var.f77983b;
        oc8 oc8Var = r860.f196719b.f196723a;
        u960 u960Var = null;
        v960 u960Var2 = (!zM93927s || set.contains(oc8Var)) ? (zM93927s || !set.contains(oc8Var)) ? null : new u960(Collections.singleton(oc8Var)) : new s960(Collections.singleton(oc8Var));
        if (u960Var2 != null) {
            linkedHashSet.add(u960Var2);
        }
        boolean zM93927s2 = m93927s(ga60Var);
        oc8 oc8Var2 = r860.f196720c.f196723a;
        v960 u960Var3 = (!zM93927s2 || set.contains(oc8Var2)) ? (zM93927s2 || !set.contains(oc8Var2)) ? null : new u960(Collections.singleton(oc8Var2)) : new s960(Collections.singleton(oc8Var2));
        if (u960Var3 != null) {
            linkedHashSet.add(u960Var3);
        }
        boolean z2 = z && m93927s(ga60Var);
        mc8 mc8Var = new mc8(h2a1.JAM_CLOSE);
        v960 u960Var4 = (!z2 || set.contains(mc8Var)) ? (z2 || !set.contains(mc8Var)) ? null : new u960(Collections.singleton(mc8Var)) : new s960(Collections.singleton(mc8Var));
        if (u960Var4 != null) {
            linkedHashSet.add(u960Var4);
        }
        boolean z3 = z && m93927s(ga60Var);
        mc8 mc8Var2 = new mc8(h2a1.JAM_FAR);
        v960 u960Var5 = (!z3 || set.contains(mc8Var2)) ? (z3 || !set.contains(mc8Var2)) ? null : new u960(Collections.singleton(mc8Var2)) : new s960(Collections.singleton(mc8Var2));
        if (u960Var5 != null) {
            linkedHashSet.add(u960Var5);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof s960) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j6f.m52564V(((s960) it.next()).f206867a, arrayList2);
            }
            s960Var = new s960(g6f.m43736n1(arrayList2));
        } else {
            s960Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (obj2 instanceof u960) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                j6f.m52564V(((u960) it2.next()).f228083a, arrayList4);
            }
            u960Var = new u960(g6f.m43736n1(arrayList4));
        }
        return s601.m77312o0(s960Var, u960Var);
    }

    /* JADX INFO: renamed from: h */
    public static final s8t0 m93916h(cbt0 cbt0Var) {
        e60 e60Var = new e60(cbt0Var);
        oyn oynVar = (oyn) e60Var.f56507d;
        oyn oynVar2 = (oyn) e60Var.f56508e;
        qwx0 qwx0Var = cbt0Var.f36223q;
        jg31.m53271i(qwx0Var);
        bji bjiVar = cbt0Var.f36207a;
        jg31.m53271i(bjiVar);
        eg30 eg30Var = new eg30(2, qwx0Var, new a8t0(true, bjiVar));
        oyn oynVar3 = (oyn) e60Var.f56506c;
        oyn oynVar4 = (oyn) e60Var.f56509f;
        oyn oynVar5 = (oyn) e60Var.f56510g;
        oyn oynVar6 = (oyn) e60Var.f56511h;
        oyn oynVar7 = (oyn) e60Var.f56512i;
        oyn oynVar8 = (oyn) e60Var.f56513t;
        luk lukVar = cbt0Var.f36221o;
        jg31.m53271i(lukVar);
        luk lukVar2 = cbt0Var.f36222p;
        jg31.m53271i(lukVar2);
        return new s8t0(oynVar, oynVar2, eg30Var, oynVar3, oynVar4, oynVar5, oynVar6, oynVar7, oynVar8, lukVar, lukVar2);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m93917i(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: j */
    public static final String m93918j() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{p8y.f175098s}, 1));
    }

    /* JADX INFO: renamed from: k */
    public static final String m93919k(mlm0 mlm0Var) {
        int iOrdinal = mlm0Var.ordinal();
        if (iOrdinal == 0) {
            return "prompted_playlists";
        }
        if (iOrdinal == 1) {
            return "bluejay_start";
        }
        if (iOrdinal == 2) {
            return "prompted_playlists";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final String m93920l() {
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{p8y.f175098s}, 1));
    }

    /* JADX INFO: renamed from: m */
    public static final String m93921m() {
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{p8y.m69347e()}, 1));
    }

    /* JADX INFO: renamed from: n */
    public static final String m93922n(String str) {
        return String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: o */
    public static final String m93923o() {
        return String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{p8y.m69347e()}, 1));
    }

    /* JADX INFO: renamed from: p */
    public static final String m93924p() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{p8y.f175097r}, 1));
    }

    /* JADX INFO: renamed from: q */
    public static final View m93925q(jlq jlqVar) {
        if (!((exh0) jlqVar).f63770a.f63766L0) {
            mt40.m62791c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) op70.m67517a(wjg1.m88319I(jlqVar));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m93926r(AbstractC2285q9 abstractC2285q9, Set set) {
        if (abstractC2285q9.mo33075a() != set.size()) {
            return false;
        }
        return abstractC2285q9.containsAll(set);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m93927s(ga60 ga60Var) {
        ddy0 ddy0Var = ga60Var.f77982a;
        if (!ddy0Var.f47914a || ddy0Var.f47917d == null) {
            return false;
        }
        return !ddy0Var.f47915b || ddy0Var.f47916c;
    }

    /* JADX INFO: renamed from: t */
    public static final fxh0 m93928t(float f, long j, fxh0 fxh0Var, ch01 ch01Var) {
        return r9g1.m75068p(nec.m64246i(lqg1.m59734B(fxh0Var, f, ch01Var, false, 0L, 0L, 24).mo34315F(cxh0.f43038a), j, ch01Var), ch01Var);
    }

    /* JADX INFO: renamed from: u */
    public static final long m93929u(long j, vep vepVar, float f, xq00 xq00Var) {
        wy41 wy41Var = t9f.f218282a;
        if (!as91.m27074b(j, ((s9f) xq00Var.m91774k(wy41Var)).m77575c()) || vepVar == null) {
            xq00Var.m91771i0(-1124546347);
            xq00Var.m91788r(false);
            return j;
        }
        xq00Var.m91771i0(-1124614454);
        xq00Var.m91771i0(-1687113661);
        s9f s9fVar = (s9f) xq00Var.m91774k(wy41Var);
        if (ybs.m93300a(f, 0) <= 0 || s9fVar.m77576d()) {
            xq00Var.m91771i0(-1095489470);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1095627978);
            wy41 wy41Var2 = dyt.f54440a;
            j = rfg1.m75452v(n6f.m63765b(t9f.m80281a(j, xq00Var), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j);
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        xq00Var.m91788r(false);
        return j;
    }

    /* JADX INFO: renamed from: v */
    public static int m93930v(AbstractC2285q9 abstractC2285q9) {
        Iterator<E> it = abstractC2285q9.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: w */
    public static final fxh0 m93931w(fxh0 fxh0Var, qly0 qly0Var, float f) {
        return z520.m95414A(l0y0.m57833o(fxh0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, null, 458751), new ufb1(f, qly0Var));
    }
}
