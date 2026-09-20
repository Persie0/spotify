package p204p;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class d22 implements wxt {

    /* JADX INFO: renamed from: x */
    public static final byte[] f44407x = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f44408a;

    /* JADX INFO: renamed from: d */
    public final String f44411d;

    /* JADX INFO: renamed from: e */
    public final int f44412e;

    /* JADX INFO: renamed from: f */
    public final String f44413f;

    /* JADX INFO: renamed from: g */
    public String f44414g;

    /* JADX INFO: renamed from: h */
    public ck81 f44415h;

    /* JADX INFO: renamed from: i */
    public ck81 f44416i;

    /* JADX INFO: renamed from: m */
    public boolean f44420m;

    /* JADX INFO: renamed from: n */
    public boolean f44421n;

    /* JADX INFO: renamed from: q */
    public int f44424q;

    /* JADX INFO: renamed from: r */
    public boolean f44425r;

    /* JADX INFO: renamed from: t */
    public int f44427t;

    /* JADX INFO: renamed from: v */
    public ck81 f44429v;

    /* JADX INFO: renamed from: w */
    public long f44430w;

    /* JADX INFO: renamed from: b */
    public final ohc f44409b = new ohc(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final l2n0 f44410c = new l2n0(Arrays.copyOf(f44407x, 10));

    /* JADX INFO: renamed from: o */
    public int f44422o = -1;

    /* JADX INFO: renamed from: p */
    public int f44423p = -1;

    /* JADX INFO: renamed from: s */
    public long f44426s = -9223372036854775807L;

    /* JADX INFO: renamed from: u */
    public long f44428u = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public int f44417j = 0;

    /* JADX INFO: renamed from: k */
    public int f44418k = 0;

    /* JADX INFO: renamed from: l */
    public int f44419l = 256;

    public d22(String str, int i, String str2, boolean z) {
        this.f44408a = z;
        this.f44411d = str;
        this.f44412e = i;
        this.f44413f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.wxt
    /* JADX INFO: renamed from: a */
    public final void mo32139a(l2n0 l2n0Var) {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.f44415h.getClass();
        String str = h0b1.f86200a;
        while (l2n0Var.m57932a() > 0) {
            int i7 = this.f44417j;
            byte b2 = -1;
            l2n0 l2n0Var2 = this.f44410c;
            int i8 = 3;
            ohc ohcVar = this.f44409b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = l2n0Var.f129054a;
                int i12 = l2n0Var.f129055b;
                int i13 = l2n0Var.f129056c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        byte b3 = bArr[i12];
                        int i16 = b3 & 255;
                        if (this.f44419l == 512 && ((65280 | (((byte) i16) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f44421n) {
                                int i17 = i12 - 1;
                                l2n0Var.m57930R(i12);
                                byte[] bArr2 = ohcVar.f165389b;
                                if (l2n0Var.m57932a() < i11) {
                                    b = -1;
                                } else {
                                    l2n0Var.m57943o(i9, bArr2, i11);
                                    ohcVar.m66960m(i10);
                                    int iM66954g = ohcVar.m66954g(i11);
                                    int i18 = this.f44422o;
                                    if (i18 == -1 || iM66954g == i18) {
                                        if (this.f44423p != -1) {
                                            byte[] bArr3 = ohcVar.f165389b;
                                            if (l2n0Var.m57932a() >= i11) {
                                                l2n0Var.m57943o(i9, bArr3, i11);
                                                ohcVar.m66960m(2);
                                                i4 = 4;
                                                if (ohcVar.m66954g(4) != this.f44423p) {
                                                    b = -1;
                                                } else {
                                                    l2n0Var.m57930R(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = ohcVar.f165389b;
                                        if (l2n0Var.m57932a() >= i4) {
                                            l2n0Var.m57943o(i9, bArr4, i4);
                                            ohcVar.m66960m(14);
                                            int iM66954g2 = ohcVar.m66954g(13);
                                            if (iM66954g2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = l2n0Var.f129054a;
                                                int i19 = l2n0Var.f129056c;
                                                int i20 = i17 + iM66954g2;
                                                if (i20 < i19) {
                                                    byte b4 = bArr5[i20];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 != i19) {
                                                            byte b5 = bArr5[i21];
                                                            if (((65280 | (b5 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == iM66954g) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i5 = i20 + 1) == i19 || (bArr5[i5] == 68 && ((i6 = i20 + 2) == i19 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.f44424q = (b3 & 8) >> 3;
                            this.f44420m = (b3 & 1) == 0;
                            if (this.f44421n) {
                                this.f44417j = i15;
                                this.f44418k = 0;
                            } else {
                                this.f44417j = 1;
                                this.f44418k = 0;
                            }
                            l2n0Var.m57930R(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i22 = this.f44419l;
                        int i23 = i16 | i22;
                        if (i23 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f44419l = 768;
                        } else if (i23 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f44419l = 512;
                        } else if (i23 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f44419l = 1024;
                        } else if (i23 != 1075) {
                            c = 256;
                            if (i22 != 256) {
                                this.f44419l = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.f44417j = 2;
                            this.f44418k = 3;
                            this.f44427t = 0;
                            l2n0Var2.m57930R(0);
                            l2n0Var.m57930R(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        l2n0Var.m57930R(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = l2n0Var2.f129054a;
                    int iMin = Math.min(l2n0Var.m57932a(), 10 - this.f44418k);
                    l2n0Var.m57943o(this.f44418k, bArr6, iMin);
                    int i24 = this.f44418k + iMin;
                    this.f44418k = i24;
                    if (i24 == 10) {
                        this.f44416i.mo33092f(10, l2n0Var2);
                        l2n0Var2.m57930R(6);
                        ck81 ck81Var = this.f44416i;
                        int iM57916D = l2n0Var2.m57916D() + 10;
                        this.f44417j = 4;
                        this.f44418k = 10;
                        this.f44429v = ck81Var;
                        this.f44430w = 0L;
                        this.f44427t = iM57916D;
                    }
                } else if (i7 == 3) {
                    int i25 = this.f44420m ? 7 : 5;
                    byte[] bArr7 = ohcVar.f165389b;
                    int iMin2 = Math.min(l2n0Var.m57932a(), i25 - this.f44418k);
                    l2n0Var.m57943o(this.f44418k, bArr7, iMin2);
                    int i26 = this.f44418k + iMin2;
                    this.f44418k = i26;
                    if (i26 == i25) {
                        ohcVar.m66960m(0);
                        if (this.f44425r) {
                            ohcVar.m66962o(10);
                        } else {
                            int iM66954g3 = ohcVar.m66954g(2) + 1;
                            if (iM66954g3 != 2) {
                                yif1.m93819w0("Detected audio object type: " + iM66954g3 + ", but assuming AAC LC.");
                                iM66954g3 = 2;
                            }
                            ohcVar.m66962o(5);
                            int iM66954g4 = ohcVar.m66954g(3);
                            int i27 = this.f44423p;
                            byte[] bArr8 = {(byte) (((iM66954g3 << 3) & 248) | ((i27 >> 1) & 7)), (byte) (((iM66954g4 << 3) & 120) | ((i27 << 7) & 128))};
                            C2477v c2477vM44263y = gbm.m44263y(new ohc(bArr8, 2), false);
                            p300 p300Var = new p300();
                            p300Var.f173513a = this.f44414g;
                            p300Var.f173526n = def0.m35799p(this.f44413f);
                            p300Var.f173527o = def0.m35799p("audio/mp4a-latm");
                            p300Var.f173523k = c2477vM44263y.f235861c;
                            p300Var.f173502I = c2477vM44263y.f235860b;
                            p300Var.f173504K = c2477vM44263y.f235859a;
                            p300Var.f173530r = Collections.singletonList(bArr8);
                            p300Var.f173516d = this.f44411d;
                            p300Var.f173518f = this.f44412e;
                            r300 r300Var = new r300(p300Var);
                            this.f44426s = 1024000000 / ((long) r300Var.f195362L);
                            this.f44415h.mo33087a(r300Var);
                            this.f44425r = true;
                        }
                        ohcVar.m66962o(4);
                        int iM66954g5 = ohcVar.m66954g(13);
                        int i28 = iM66954g5 - 7;
                        if (this.f44420m) {
                            i28 = iM66954g5 - 9;
                        }
                        ck81 ck81Var2 = this.f44415h;
                        long j = this.f44426s;
                        this.f44417j = 4;
                        this.f44418k = 0;
                        this.f44429v = ck81Var2;
                        this.f44430w = j;
                        this.f44427t = i28;
                    }
                } else {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(l2n0Var.m57932a(), this.f44427t - this.f44418k);
                    this.f44429v.mo33092f(iMin3, l2n0Var);
                    int i29 = this.f44418k + iMin3;
                    this.f44418k = i29;
                    if (i29 == this.f44427t) {
                        c95.m31855u(this.f44428u != -9223372036854775807L);
                        this.f44429v.mo33088b(this.f44428u, 1, this.f44427t, 0, null);
                        this.f44428u += this.f44430w;
                        this.f44417j = 0;
                        this.f44418k = 0;
                        this.f44419l = 256;
                    }
                }
            } else if (l2n0Var.m57932a() != 0) {
                ohcVar.f165389b[0] = l2n0Var.f129054a[l2n0Var.f129055b];
                ohcVar.m66960m(2);
                int iM66954g6 = ohcVar.m66954g(4);
                int i30 = this.f44423p;
                if (i30 == -1 || iM66954g6 == i30) {
                    if (!this.f44421n) {
                        this.f44421n = true;
                        this.f44422o = this.f44424q;
                        this.f44423p = iM66954g6;
                    }
                    this.f44417j = 3;
                    this.f44418k = 0;
                } else {
                    this.f44421n = false;
                    this.f44417j = 0;
                    this.f44418k = 0;
                    this.f44419l = 256;
                }
            }
        }
    }

    @Override // p204p.wxt
    /* JADX INFO: renamed from: c */
    public final void mo32141c() {
        this.f44428u = -9223372036854775807L;
        this.f44421n = false;
        this.f44417j = 0;
        this.f44418k = 0;
        this.f44419l = 256;
    }

    @Override // p204p.wxt
    /* JADX INFO: renamed from: f */
    public final void mo32143f(e5y e5yVar, zmx0 zmx0Var) {
        zmx0Var.m96497d();
        zmx0Var.m96502i();
        this.f44414g = (String) zmx0Var.f284359e;
        zmx0Var.m96502i();
        ck81 ck81VarMo37837x = e5yVar.mo37837x(zmx0Var.f284357c, 1);
        this.f44415h = ck81VarMo37837x;
        this.f44429v = ck81VarMo37837x;
        if (!this.f44408a) {
            this.f44416i = new nlr();
            return;
        }
        zmx0Var.m96497d();
        zmx0Var.m96502i();
        ck81 ck81VarMo37837x2 = e5yVar.mo37837x(zmx0Var.f284357c, 5);
        this.f44416i = ck81VarMo37837x2;
        p300 p300Var = new p300();
        zmx0Var.m96502i();
        p300Var.f173513a = (String) zmx0Var.f284359e;
        p300Var.f173526n = def0.m35799p(this.f44413f);
        p300Var.f173527o = def0.m35799p("application/id3");
        t3d1.m80000o(p300Var, ck81VarMo37837x2);
    }

    @Override // p204p.wxt
    /* JADX INFO: renamed from: g */
    public final void mo32144g(int i, long j) {
        this.f44428u = j;
    }
}
