package p204p;

import java.util.Objects;

/* JADX INFO: renamed from: p.ka */
/* JADX INFO: loaded from: classes3.dex */
public final class C2045ka implements wxt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120734a;

    /* JADX INFO: renamed from: b */
    public final ohc f120735b;

    /* JADX INFO: renamed from: c */
    public final l2n0 f120736c;

    /* JADX INFO: renamed from: d */
    public final String f120737d;

    /* JADX INFO: renamed from: e */
    public final int f120738e;

    /* JADX INFO: renamed from: f */
    public final String f120739f;

    /* JADX INFO: renamed from: g */
    public String f120740g;

    /* JADX INFO: renamed from: h */
    public ck81 f120741h;

    /* JADX INFO: renamed from: i */
    public int f120742i;

    /* JADX INFO: renamed from: j */
    public int f120743j;

    /* JADX INFO: renamed from: k */
    public boolean f120744k;

    /* JADX INFO: renamed from: l */
    public long f120745l;

    /* JADX INFO: renamed from: m */
    public r300 f120746m;

    /* JADX INFO: renamed from: n */
    public int f120747n;

    /* JADX INFO: renamed from: o */
    public long f120748o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2045ka(String str) {
        this(0, null, 0, str);
        this.f120734a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.wxt
    /* JADX INFO: renamed from: a */
    public final void mo32139a(l2n0 l2n0Var) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int iM66954g;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f120734a) {
            case 0:
                this.f120741h.getClass();
                while (l2n0Var.m57932a() > 0) {
                    int i17 = this.f120742i;
                    l2n0 l2n0Var2 = this.f120736c;
                    if (i17 == 0) {
                        while (l2n0Var.m57932a() > 0) {
                            if (this.f120744k) {
                                int iM57917E = l2n0Var.m57917E();
                                if (iM57917E == 119) {
                                    this.f120744k = false;
                                    this.f120742i = 1;
                                    byte[] bArr = l2n0Var2.f129054a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f120743j = 2;
                                }
                                this.f120744k = iM57917E == 11;
                            } else {
                                this.f120744k = l2n0Var.m57917E() == 11;
                            }
                            break;
                        }
                    } else if (i17 == 1) {
                        byte[] bArr2 = l2n0Var2.f129054a;
                        int iMin = Math.min(l2n0Var.m57932a(), 128 - this.f120743j);
                        l2n0Var.m57943o(this.f120743j, bArr2, iMin);
                        int i18 = this.f120743j + iMin;
                        this.f120743j = i18;
                        if (i18 == 128) {
                            ohc ohcVar = this.f120735b;
                            ohcVar.m66960m(0);
                            int iM66952e = ohcVar.m66952e();
                            ohcVar.m66962o(40);
                            Object[] objArr = ohcVar.m66954g(5) > 10;
                            ohcVar.m66960m(iM66952e);
                            int[] iArr = th1.f220303d;
                            int[] iArr2 = th1.f220301b;
                            if (objArr == true) {
                                ohcVar.m66962o(16);
                                int iM66954g2 = ohcVar.m66954g(2);
                                if (iM66954g2 == 0) {
                                    b = 0;
                                } else if (iM66954g2 != 1) {
                                    b = iM66954g2 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b = 1;
                                }
                                ohcVar.m66962o(3);
                                iM66954g = (ohcVar.m66954g(11) + 1) * 2;
                                int iM66954g3 = ohcVar.m66954g(2);
                                if (iM66954g3 == 3) {
                                    i5 = th1.f220302c[ohcVar.m66954g(2)];
                                    i6 = 3;
                                    i7 = 6;
                                } else {
                                    int iM66954g4 = ohcVar.m66954g(2);
                                    int i19 = th1.f220300a[iM66954g4];
                                    i5 = iArr2[iM66954g3];
                                    i6 = iM66954g4;
                                    i7 = i19;
                                }
                                i3 = i7 * 256;
                                int i20 = (iM66954g * i5) / (i7 * 32);
                                int iM66954g5 = ohcVar.m66954g(3);
                                boolean zM66953f = ohcVar.m66953f();
                                i2 = iArr[iM66954g5] + (zM66953f ? 1 : 0);
                                ohcVar.m66962o(10);
                                if (ohcVar.m66953f()) {
                                    ohcVar.m66962o(8);
                                }
                                if (iM66954g5 == 0) {
                                    ohcVar.m66962o(5);
                                    if (ohcVar.m66953f()) {
                                        ohcVar.m66962o(8);
                                    }
                                }
                                if (b == 1 && ohcVar.m66953f()) {
                                    ohcVar.m66962o(16);
                                }
                                if (ohcVar.m66953f()) {
                                    if (iM66954g5 > 2) {
                                        ohcVar.m66962o(2);
                                    }
                                    if ((iM66954g5 & 1) == 0 || iM66954g5 <= 2) {
                                        i12 = 6;
                                    } else {
                                        i12 = 6;
                                        ohcVar.m66962o(6);
                                    }
                                    if ((iM66954g5 & 4) != 0) {
                                        ohcVar.m66962o(i12);
                                    }
                                    if (zM66953f && ohcVar.m66953f()) {
                                        ohcVar.m66962o(5);
                                    }
                                    if (b != 0) {
                                        i8 = i6;
                                    } else {
                                        if (ohcVar.m66953f()) {
                                            i13 = 6;
                                            ohcVar.m66962o(6);
                                        } else {
                                            i13 = 6;
                                        }
                                        if (iM66954g5 == 0 && ohcVar.m66953f()) {
                                            ohcVar.m66962o(i13);
                                        }
                                        if (ohcVar.m66953f()) {
                                            ohcVar.m66962o(i13);
                                        }
                                        int iM66954g6 = ohcVar.m66954g(2);
                                        if (iM66954g6 == 1) {
                                            ohcVar.m66962o(5);
                                            i15 = 2;
                                        } else {
                                            if (iM66954g6 == 2) {
                                                ohcVar.m66962o(12);
                                            } else if (iM66954g6 == 3) {
                                                int iM66954g7 = ohcVar.m66954g(5);
                                                if (ohcVar.m66953f()) {
                                                    ohcVar.m66962o(5);
                                                    if (ohcVar.m66953f()) {
                                                        i16 = 4;
                                                        ohcVar.m66962o(4);
                                                    } else {
                                                        i16 = 4;
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(i16);
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(i16);
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(i16);
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(i16);
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(i16);
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(i16);
                                                    }
                                                    if (ohcVar.m66953f()) {
                                                        if (ohcVar.m66953f()) {
                                                            ohcVar.m66962o(i16);
                                                        }
                                                        if (ohcVar.m66953f()) {
                                                            ohcVar.m66962o(i16);
                                                        }
                                                    }
                                                }
                                                if (ohcVar.m66953f()) {
                                                    ohcVar.m66962o(5);
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(7);
                                                        if (ohcVar.m66953f()) {
                                                            i14 = 8;
                                                            ohcVar.m66962o(8);
                                                        } else {
                                                            i14 = 8;
                                                        }
                                                    } else {
                                                        i14 = 8;
                                                    }
                                                } else {
                                                    i14 = 8;
                                                }
                                                i15 = 2;
                                                ohcVar.m66962o((iM66954g7 + 2) * i14);
                                                ohcVar.m66950c();
                                            }
                                            i15 = 2;
                                        }
                                        if (iM66954g5 < i15) {
                                            if (ohcVar.m66953f()) {
                                                ohcVar.m66962o(14);
                                            }
                                            if (iM66954g5 == 0 && ohcVar.m66953f()) {
                                                ohcVar.m66962o(14);
                                            }
                                        }
                                        if (ohcVar.m66953f()) {
                                            i8 = i6;
                                            if (i8 == 0) {
                                                ohcVar.m66962o(5);
                                            } else {
                                                for (int i21 = 0; i21 < i7; i21++) {
                                                    if (ohcVar.m66953f()) {
                                                        ohcVar.m66962o(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i8 = i6;
                                        }
                                    }
                                } else {
                                    i8 = i6;
                                }
                                if (ohcVar.m66953f()) {
                                    ohcVar.m66962o(5);
                                    if (iM66954g5 == 2) {
                                        ohcVar.m66962o(4);
                                    }
                                    if (iM66954g5 >= 6) {
                                        ohcVar.m66962o(2);
                                    }
                                    if (ohcVar.m66953f()) {
                                        i11 = 8;
                                        ohcVar.m66962o(8);
                                    } else {
                                        i11 = 8;
                                    }
                                    if (iM66954g5 == 0 && ohcVar.m66953f()) {
                                        ohcVar.m66962o(i11);
                                    }
                                    i9 = 3;
                                    if (iM66954g3 < 3) {
                                        ohcVar.m66961n();
                                    }
                                } else {
                                    i9 = 3;
                                }
                                if (b == 0 && i8 != i9) {
                                    ohcVar.m66961n();
                                }
                                if (b == 2 && (i8 == i9 || ohcVar.m66953f())) {
                                    i10 = 6;
                                    ohcVar.m66962o(6);
                                } else {
                                    i10 = 6;
                                }
                                str = (ohcVar.m66953f() && ohcVar.m66954g(i10) == 1 && ohcVar.m66954g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i4 = i20;
                            } else {
                                ohcVar.m66962o(32);
                                int iM66954g8 = ohcVar.m66954g(2);
                                String str2 = iM66954g8 == 3 ? null : "audio/ac3";
                                int iM66954g9 = ohcVar.m66954g(6);
                                int i22 = th1.f220304e[iM66954g9 / 2] * 1000;
                                int iM80807i = th1.m80807i(iM66954g8, iM66954g9);
                                ohcVar.m66962o(8);
                                int iM66954g10 = ohcVar.m66954g(3);
                                if ((iM66954g10 & 1) == 0 || iM66954g10 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    ohcVar.m66962o(2);
                                }
                                if ((iM66954g10 & 4) != 0) {
                                    ohcVar.m66962o(i);
                                }
                                if (iM66954g10 == i) {
                                    ohcVar.m66962o(i);
                                }
                                int i23 = iM66954g8 < 3 ? iArr2[iM66954g8] : -1;
                                i2 = iArr[iM66954g10] + (ohcVar.m66953f() ? 1 : 0);
                                i3 = 1536;
                                str = str2;
                                i4 = i22;
                                iM66954g = iM80807i;
                                i5 = i23;
                            }
                            r300 r300Var = this.f120746m;
                            if (r300Var == null || i2 != r300Var.f195360J || i5 != r300Var.f195362L || !Objects.equals(str, r300Var.f195387p)) {
                                p300 p300Var = new p300();
                                p300Var.f173513a = this.f120740g;
                                p300Var.f173526n = def0.m35799p(this.f120739f);
                                p300Var.f173527o = def0.m35799p(str);
                                p300Var.f173502I = i2;
                                p300Var.f173504K = i5;
                                p300Var.f173516d = this.f120737d;
                                p300Var.f173518f = this.f120738e;
                                p300Var.f173522j = i4;
                                if ("audio/ac3".equals(str)) {
                                    p300Var.f173521i = i4;
                                }
                                r300 r300Var2 = new r300(p300Var);
                                this.f120746m = r300Var2;
                                this.f120741h.mo33087a(r300Var2);
                            }
                            this.f120747n = iM66954g;
                            this.f120745l = (((long) i3) * 1000000) / ((long) this.f120746m.f195362L);
                            l2n0Var2.m57930R(0);
                            this.f120741h.mo33092f(128, l2n0Var2);
                            this.f120742i = 2;
                        }
                    } else if (i17 == 2) {
                        int iMin2 = Math.min(l2n0Var.m57932a(), this.f120747n - this.f120743j);
                        this.f120741h.mo33092f(iMin2, l2n0Var);
                        int i24 = this.f120743j + iMin2;
                        this.f120743j = i24;
                        if (i24 == this.f120747n) {
                            c95.m31855u(this.f120748o != -9223372036854775807L);
                            this.f120741h.mo33088b(this.f120748o, 1, this.f120747n, 0, null);
                            this.f120748o += this.f120745l;
                            this.f120742i = 0;
                        }
                    }
                }
                break;
            default:
                this.f120741h.getClass();
                while (l2n0Var.m57932a() > 0) {
                    int i25 = this.f120742i;
                    l2n0 l2n0Var3 = this.f120736c;
                    if (i25 == 0) {
                        while (l2n0Var.m57932a() > 0) {
                            if (this.f120744k) {
                                int iM57917E2 = l2n0Var.m57917E();
                                this.f120744k = iM57917E2 == 172;
                                if (iM57917E2 == 64 || iM57917E2 == 65) {
                                    Object[] objArr2 = iM57917E2 == 65;
                                    this.f120742i = 1;
                                    byte[] bArr3 = l2n0Var3.f129054a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f120743j = 2;
                                }
                            } else {
                                this.f120744k = l2n0Var.m57917E() == 172;
                            }
                            break;
                        }
                    } else if (i25 == 1) {
                        byte[] bArr4 = l2n0Var3.f129054a;
                        int iMin3 = Math.min(l2n0Var.m57932a(), 16 - this.f120743j);
                        l2n0Var.m57943o(this.f120743j, bArr4, iMin3);
                        int i26 = this.f120743j + iMin3;
                        this.f120743j = i26;
                        if (i26 == 16) {
                            ohc ohcVar2 = this.f120735b;
                            ohcVar2.m66960m(0);
                            C2157na c2157naM42185n = fn1.m42185n(ohcVar2);
                            int i27 = c2157naM42185n.f151897a;
                            r300 r300Var3 = this.f120746m;
                            if (r300Var3 == null || 2 != r300Var3.f195360J || i27 != r300Var3.f195362L || !"audio/ac4".equals(r300Var3.f195387p)) {
                                p300 p300Var2 = new p300();
                                p300Var2.f173513a = this.f120740g;
                                p300Var2.f173526n = def0.m35799p(this.f120739f);
                                p300Var2.f173527o = def0.m35799p("audio/ac4");
                                p300Var2.f173502I = 2;
                                p300Var2.f173504K = i27;
                                p300Var2.f173516d = this.f120737d;
                                p300Var2.f173518f = this.f120738e;
                                r300 r300Var4 = new r300(p300Var2);
                                this.f120746m = r300Var4;
                                this.f120741h.mo33087a(r300Var4);
                            }
                            this.f120747n = c2157naM42185n.f151898b;
                            this.f120745l = (((long) c2157naM42185n.f151899c) * 1000000) / ((long) this.f120746m.f195362L);
                            l2n0Var3.m57930R(0);
                            this.f120741h.mo33092f(16, l2n0Var3);
                            this.f120742i = 2;
                        }
                    } else if (i25 == 2) {
                        int iMin4 = Math.min(l2n0Var.m57932a(), this.f120747n - this.f120743j);
                        this.f120741h.mo33092f(iMin4, l2n0Var);
                        int i28 = this.f120743j + iMin4;
                        this.f120743j = i28;
                        if (i28 == this.f120747n) {
                            c95.m31855u(this.f120748o != -9223372036854775807L);
                            this.f120741h.mo33088b(this.f120748o, 1, this.f120747n, 0, null);
                            this.f120748o += this.f120745l;
                            this.f120742i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p204p.wxt
    /* JADX INFO: renamed from: c */
    public final void mo32141c() {
        switch (this.f120734a) {
            case 0:
                this.f120742i = 0;
                this.f120743j = 0;
                this.f120744k = false;
                this.f120748o = -9223372036854775807L;
                break;
            default:
                this.f120742i = 0;
                this.f120743j = 0;
                this.f120744k = false;
                this.f120748o = -9223372036854775807L;
                break;
        }
    }

    @Override // p204p.wxt
    /* JADX INFO: renamed from: f */
    public final void mo32143f(e5y e5yVar, zmx0 zmx0Var) {
        switch (this.f120734a) {
            case 0:
                zmx0Var.m96497d();
                zmx0Var.m96502i();
                this.f120740g = (String) zmx0Var.f284359e;
                zmx0Var.m96502i();
                this.f120741h = e5yVar.mo37837x(zmx0Var.f284357c, 1);
                break;
            default:
                zmx0Var.m96497d();
                zmx0Var.m96502i();
                this.f120740g = (String) zmx0Var.f284359e;
                zmx0Var.m96502i();
                this.f120741h = e5yVar.mo37837x(zmx0Var.f284357c, 1);
                break;
        }
    }

    @Override // p204p.wxt
    /* JADX INFO: renamed from: g */
    public final void mo32144g(int i, long j) {
        switch (this.f120734a) {
            case 0:
                this.f120748o = j;
                break;
            default:
                this.f120748o = j;
                break;
        }
    }

    public C2045ka(int i, String str, int i2, String str2) {
        this.f120734a = i2;
        switch (i2) {
            case 1:
                ohc ohcVar = new ohc(new byte[16], 16);
                this.f120735b = ohcVar;
                this.f120736c = new l2n0(ohcVar.f165389b);
                this.f120742i = 0;
                this.f120743j = 0;
                this.f120744k = false;
                this.f120748o = -9223372036854775807L;
                this.f120737d = str;
                this.f120738e = i;
                this.f120739f = str2;
                break;
            default:
                ohc ohcVar2 = new ohc(new byte[128], 128);
                this.f120735b = ohcVar2;
                this.f120736c = new l2n0(ohcVar2.f165389b);
                this.f120742i = 0;
                this.f120748o = -9223372036854775807L;
                this.f120737d = str;
                this.f120738e = i;
                this.f120739f = str2;
                break;
        }
    }
}
