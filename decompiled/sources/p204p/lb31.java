package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lb31 {

    /* JADX INFO: renamed from: a */
    public final gh00 f131542a;

    /* JADX INFO: renamed from: b */
    public Object f131543b;

    /* JADX INFO: renamed from: c */
    public fpi0 f131544c;

    /* JADX INFO: renamed from: j */
    public boolean f131551j;

    /* JADX INFO: renamed from: k */
    public int f131552k;

    /* JADX INFO: renamed from: d */
    public int f131545d = -1;

    /* JADX INFO: renamed from: e */
    public final cqi0 f131546e = y85.m93063h();

    /* JADX INFO: renamed from: f */
    public final cqi0 f131547f = new cqi0();

    /* JADX INFO: renamed from: g */
    public final dqi0 f131548g = new dqi0();

    /* JADX INFO: renamed from: h */
    public final qqi0 f131549h = new qqi0(0, new rtq[16]);

    /* JADX INFO: renamed from: i */
    public final kb31 f131550i = new kb31(this);

    /* JADX INFO: renamed from: l */
    public final cqi0 f131553l = y85.m93063h();

    /* JADX INFO: renamed from: m */
    public final HashMap f131554m = new HashMap();

    public lb31(gh00 gh00Var) {
        this.f131542a = gh00Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m58596a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.lb31.m58596a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m58597b(Object obj, int i, Object obj2, fpi0 fpi0Var) {
        int i2;
        if (this.f131552k > 0) {
            return;
        }
        int iM42374c = fpi0Var.m42374c(obj);
        if (iM42374c < 0) {
            iM42374c = ~iM42374c;
            i2 = -1;
        } else {
            i2 = fpi0Var.f71879c[iM42374c];
        }
        fpi0Var.f71878b[iM42374c] = obj;
        fpi0Var.f71879c[iM42374c] = i;
        if ((obj instanceof rtq) && i2 != i) {
            qtq qtqVarM76400w = ((rtq) obj).m76400w();
            this.f131554m.put(obj, qtqVarM76400w.f192441f);
            fpi0 fpi0Var2 = qtqVarM76400w.f192440e;
            cqi0 cqi0Var = this.f131553l;
            y85.m93045B(cqi0Var, obj);
            Object[] objArr = fpi0Var2.f71878b;
            long[] jArr = fpi0Var2.f71877a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                vw41 vw41Var = (vw41) objArr[(i3 << 3) + i5];
                                if (vw41Var instanceof ww41) {
                                    ((ww41) vw41Var).m89171m(2);
                                }
                                y85.m93060e(cqi0Var, vw41Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof ww41) {
                ((ww41) obj).m89171m(2);
            }
            y85.m93060e(this.f131546e, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58598c(Object obj, Object obj2) {
        cqi0 cqi0Var = this.f131546e;
        y85.m93044A(cqi0Var, obj2, obj);
        if (!(obj2 instanceof rtq) || cqi0Var.m33619c(obj2)) {
            return;
        }
        y85.m93045B(this.f131553l, obj2);
        this.f131554m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3 A[LOOP:2: B:16:0x0068->B:28:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4 A[EDGE_INSN: B:50:0x00b4->B:31:0x00b4 BREAK  A[LOOP:2: B:16:0x0068->B:28:0x00a3], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m58599d() {
        iel0 iel0Var;
        long[] jArr;
        iel0 iel0Var2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        Boolean bool;
        iel0 iel0Var3 = iel0.f101452a1;
        cqi0 cqi0Var = this.f131547f;
        long[] jArr3 = cqi0Var.f40896a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = cqi0Var.f40897b[i6];
                        j2 = j4;
                        fpi0 fpi0Var = (fpi0) cqi0Var.f40898c[i6];
                        Boolean bool2 = (Boolean) iel0Var3.invoke(obj);
                        if (bool2.booleanValue()) {
                            Object[] objArr = fpi0Var.f71878b;
                            int i7 = i3;
                            int[] iArr = fpi0Var.f71879c;
                            long[] jArr4 = fpi0Var.f71877a;
                            iel0Var2 = iel0Var3;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            j = j3;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    bool = bool2;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        bool2 = bool;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                m58598c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        bool2 = bool;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            }
                            if (bool.booleanValue()) {
                                cqi0Var.m33628l(i6);
                            }
                            i = 8;
                        } else {
                            iel0Var2 = iel0Var3;
                            jArr2 = jArr3;
                            j = j3;
                        }
                        bool = bool2;
                        if (bool.booleanValue()) {
                            cqi0Var.m33628l(i6);
                        }
                        i = 8;
                    } else {
                        iel0Var2 = iel0Var3;
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    iel0Var3 = iel0Var2;
                    jArr3 = jArr2;
                }
                iel0Var = iel0Var3;
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                iel0Var = iel0Var3;
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            iel0Var3 = iel0Var;
            jArr3 = jArr;
        }
    }
}
