package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class eiz {

    /* JADX INFO: renamed from: a */
    public int f60067a;

    /* JADX INFO: renamed from: d */
    public c6j f60070d;

    /* JADX INFO: renamed from: e */
    public c6j f60071e;

    /* JADX INFO: renamed from: f */
    public c6j f60072f;

    /* JADX INFO: renamed from: g */
    public c6j f60073g;

    /* JADX INFO: renamed from: h */
    public int f60074h;

    /* JADX INFO: renamed from: i */
    public int f60075i;

    /* JADX INFO: renamed from: j */
    public int f60076j;

    /* JADX INFO: renamed from: k */
    public int f60077k;

    /* JADX INFO: renamed from: q */
    public int f60083q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ giz f60084r;

    /* JADX INFO: renamed from: b */
    public v7j f60068b = null;

    /* JADX INFO: renamed from: c */
    public int f60069c = 0;

    /* JADX INFO: renamed from: l */
    public int f60078l = 0;

    /* JADX INFO: renamed from: m */
    public int f60079m = 0;

    /* JADX INFO: renamed from: n */
    public int f60080n = 0;

    /* JADX INFO: renamed from: o */
    public int f60081o = 0;

    /* JADX INFO: renamed from: p */
    public int f60082p = 0;

    public eiz(giz gizVar, int i, c6j c6jVar, c6j c6jVar2, c6j c6jVar3, c6j c6jVar4, int i2) {
        this.f60084r = gizVar;
        this.f60067a = i;
        this.f60070d = c6jVar;
        this.f60071e = c6jVar2;
        this.f60072f = c6jVar3;
        this.f60073g = c6jVar4;
        this.f60074h = gizVar.f243659A0;
        this.f60075i = gizVar.f243666w0;
        this.f60076j = gizVar.f243660B0;
        this.f60077k = gizVar.f243667x0;
        this.f60083q = i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m39150b(v7j v7jVar) {
        int i = this.f60067a;
        u7j u7jVar = u7j.f227712c;
        giz gizVar = this.f60084r;
        if (i == 0) {
            int iM44860c0 = gizVar.m44860c0(v7jVar, this.f60083q);
            if (v7jVar.f238220U[0] == u7jVar) {
                this.f60082p++;
                iM44860c0 = 0;
            }
            this.f60078l = iM44860c0 + (v7jVar.f238243i0 != 8 ? gizVar.f80288T0 : 0) + this.f60078l;
            int iM44859b0 = gizVar.m44859b0(v7jVar, this.f60083q);
            if (this.f60068b == null || this.f60069c < iM44859b0) {
                this.f60068b = v7jVar;
                this.f60069c = iM44859b0;
                this.f60079m = iM44859b0;
            }
        } else {
            int iM44860c1 = gizVar.m44860c0(v7jVar, this.f60083q);
            int iM44859b1 = gizVar.m44859b0(v7jVar, this.f60083q);
            if (v7jVar.f238220U[1] == u7jVar) {
                this.f60082p++;
                iM44859b1 = 0;
            }
            this.f60079m = iM44859b1 + (v7jVar.f238243i0 != 8 ? gizVar.f80289U0 : 0) + this.f60079m;
            if (this.f60068b == null || this.f60069c < iM44860c1) {
                this.f60068b = v7jVar;
                this.f60069c = iM44860c1;
                this.f60078l = iM44860c1;
            }
        }
        this.f60081o++;
    }

    /* JADX INFO: renamed from: c */
    public final void m39151c() {
        this.f60069c = 0;
        this.f60068b = null;
        this.f60078l = 0;
        this.f60079m = 0;
        this.f60080n = 0;
        this.f60081o = 0;
        this.f60082p = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m39152d(int i, boolean z, boolean z2) {
        giz gizVar;
        int i2;
        int i3;
        v7j v7jVar;
        boolean z3;
        char c;
        float f;
        float f2;
        int i4;
        float f3;
        float f4;
        int i5;
        int i6 = this.f60081o;
        int i7 = 0;
        while (true) {
            gizVar = this.f60084r;
            if (i7 >= i6 || (i5 = this.f60080n + i7) >= gizVar.f80300f1) {
                break;
            }
            v7j v7jVar2 = gizVar.f80299e1[i5];
            if (v7jVar2 != null) {
                v7jVar2.m84860F();
            }
            i7++;
        }
        if (i6 == 0 || this.f60068b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f60080n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= gizVar.f80300f1) {
                break;
            }
            v7j v7jVar3 = gizVar.f80299e1[i11];
            if (v7jVar3 != null && v7jVar3.f238243i0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (this.f60067a == 0) {
            v7j v7jVar4 = this.f60068b;
            v7jVar4.f238251m0 = gizVar.f80277I0;
            c6j c6jVar = v7jVar4.f238212M;
            c6j c6jVar2 = v7jVar4.f238210K;
            int i12 = this.f60075i;
            if (i > 0) {
                i12 += gizVar.f80289U0;
            }
            c6jVar2.m31567a(this.f60071e, i12);
            if (z2) {
                c6jVar.m31567a(this.f60073g, this.f60077k);
            }
            if (i > 0) {
                this.f60071e.f34549d.f238212M.m31567a(c6jVar2, 0);
            }
            if (gizVar.f80291W0 != 3 || v7jVar4.f238205F) {
                v7jVar = v7jVar4;
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 < i6) {
                    int i14 = this.f60080n + (z ? (i6 - 1) - i13 : i13);
                    if (i14 < gizVar.f80300f1) {
                        v7jVar = gizVar.f80299e1[i14];
                        if (v7jVar.f238205F) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                v7jVar = v7jVar4;
                break;
            }
            int i15 = 0;
            v7j v7jVar5 = null;
            while (i15 < i6) {
                int i16 = z ? (i6 - 1) - i15 : i15;
                int i17 = this.f60080n + i16;
                if (i17 >= gizVar.f80300f1) {
                    return;
                }
                v7j v7jVar6 = gizVar.f80299e1[i17];
                if (v7jVar6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    c6j c6jVar3 = v7jVar6.f238212M;
                    c6j c6jVar4 = v7jVar6.f238210K;
                    c6j c6jVar5 = v7jVar6.f238209J;
                    z3 = z4;
                    if (i15 == 0) {
                        v7jVar6.m84878g(c6jVar5, this.f60070d, this.f60074h);
                    }
                    if (i16 == 0) {
                        int i18 = gizVar.f80276H0;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - gizVar.f80282N0;
                        } else {
                            f = 1.0f;
                            f2 = gizVar.f80282N0;
                        }
                        if (this.f60080n != 0 || (i4 = gizVar.f80278J0) == -1) {
                            if (!z2 || (i4 = gizVar.f80280L0) == -1) {
                                i4 = i18;
                                f3 = f2;
                            } else if (z) {
                                f4 = gizVar.f80286R0;
                                f3 = f - f4;
                            } else {
                                f3 = gizVar.f80286R0;
                            }
                        } else if (z) {
                            f4 = gizVar.f80284P0;
                            f3 = f - f4;
                        } else {
                            f3 = gizVar.f80284P0;
                        }
                        v7jVar6.f238249l0 = i4;
                        v7jVar6.f238237f0 = f3;
                    }
                    if (i15 == i6 - 1) {
                        v7jVar6.m84878g(v7jVar6.f238211L, this.f60072f, this.f60076j);
                    }
                    if (v7jVar5 != null) {
                        c6j c6jVar6 = v7jVar5.f238211L;
                        c6jVar5.m31567a(c6jVar6, gizVar.f80288T0);
                        if (i15 == i8) {
                            int i19 = this.f60074h;
                            if (c6jVar5.m31574h()) {
                                c6jVar5.f34553h = i19;
                            }
                        }
                        c6jVar6.m31567a(c6jVar5, 0);
                        if (i15 == i9 + 1) {
                            int i20 = this.f60076j;
                            if (c6jVar6.m31574h()) {
                                c6jVar6.f34553h = i20;
                            }
                        }
                    }
                    if (v7jVar6 != v7jVar4) {
                        int i21 = gizVar.f80291W0;
                        c = 3;
                        if (i21 == 3 && v7jVar.f238205F && v7jVar6 != v7jVar && v7jVar6.f238205F) {
                            v7jVar6.f238213N.m31567a(v7jVar.f238213N, 0);
                        } else if (i21 == 0) {
                            c6jVar4.m31567a(c6jVar2, 0);
                        } else if (i21 == 1) {
                            c6jVar3.m31567a(c6jVar, 0);
                        } else if (z3) {
                            c6jVar4.m31567a(this.f60071e, this.f60075i);
                            c6jVar3.m31567a(this.f60073g, this.f60077k);
                        } else {
                            c6jVar4.m31567a(c6jVar2, 0);
                            c6jVar3.m31567a(c6jVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    v7jVar5 = v7jVar6;
                }
                i15++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i22 = i6;
        boolean z5 = z4;
        int i23 = i9;
        v7j v7jVar7 = this.f60068b;
        v7jVar7.f238249l0 = gizVar.f80276H0;
        c6j c6jVar7 = v7jVar7.f238209J;
        c6j c6jVar8 = v7jVar7.f238211L;
        int i24 = this.f60074h;
        if (i > 0) {
            i24 += gizVar.f80288T0;
        }
        if (z) {
            c6jVar8.m31567a(this.f60072f, i24);
            if (z2) {
                c6jVar7.m31567a(this.f60070d, this.f60076j);
            }
            if (i > 0) {
                this.f60072f.f34549d.f238209J.m31567a(c6jVar8, 0);
            }
        } else {
            c6jVar7.m31567a(this.f60070d, i24);
            if (z2) {
                c6jVar8.m31567a(this.f60072f, this.f60076j);
            }
            if (i > 0) {
                this.f60070d.f34549d.f238211L.m31567a(c6jVar7, 0);
            }
        }
        int i25 = 0;
        v7j v7jVar8 = null;
        while (true) {
            int i26 = i22;
            if (i25 >= i26 || (i2 = this.f60080n + i25) >= gizVar.f80300f1) {
                return;
            }
            v7j v7jVar9 = gizVar.f80299e1[i2];
            if (v7jVar9 == null) {
                i22 = i26;
            } else {
                c6j c6jVar9 = v7jVar9.f238210K;
                c6j c6jVar10 = v7jVar9.f238211L;
                c6j c6jVar11 = v7jVar9.f238209J;
                if (i25 == 0) {
                    v7jVar9.m84878g(c6jVar9, this.f60071e, this.f60075i);
                    int i27 = gizVar.f80277I0;
                    float f5 = gizVar.f80283O0;
                    if (this.f60080n == 0) {
                        int i28 = gizVar.f80279K0;
                        i22 = i26;
                        i3 = -1;
                        if (i28 != -1) {
                            f5 = gizVar.f80285Q0;
                        }
                        i27 = i28;
                        v7jVar9.f238251m0 = i27;
                        v7jVar9.f238239g0 = f5;
                    } else {
                        i22 = i26;
                        i3 = -1;
                    }
                    if (z2 && (i28 = gizVar.f80281M0) != i3) {
                        f5 = gizVar.f80287S0;
                        i27 = i28;
                    }
                    v7jVar9.f238251m0 = i27;
                    v7jVar9.f238239g0 = f5;
                } else {
                    i22 = i26;
                }
                if (i25 == i22 - 1) {
                    v7jVar9.m84878g(v7jVar9.f238212M, this.f60073g, this.f60077k);
                }
                if (v7jVar8 != null) {
                    c6j c6jVar12 = v7jVar8.f238212M;
                    c6jVar9.m31567a(c6jVar12, gizVar.f80289U0);
                    if (i25 == i8) {
                        int i29 = this.f60075i;
                        if (c6jVar9.m31574h()) {
                            c6jVar9.f34553h = i29;
                        }
                    }
                    c6jVar12.m31567a(c6jVar9, 0);
                    if (i25 == i23 + 1) {
                        int i30 = this.f60077k;
                        if (c6jVar12.m31574h()) {
                            c6jVar12.f34553h = i30;
                        }
                    }
                }
                if (v7jVar9 != v7jVar7) {
                    if (z) {
                        int i31 = gizVar.f80290V0;
                        if (i31 == 0) {
                            c6jVar10.m31567a(c6jVar8, 0);
                        } else if (i31 == 1) {
                            c6jVar11.m31567a(c6jVar7, 0);
                        } else if (i31 == 2) {
                            c6jVar11.m31567a(c6jVar7, 0);
                            c6jVar10.m31567a(c6jVar8, 0);
                        }
                    } else {
                        int i32 = gizVar.f80290V0;
                        if (i32 == 0) {
                            c6jVar11.m31567a(c6jVar7, 0);
                        } else if (i32 == 1) {
                            c6jVar10.m31567a(c6jVar8, 0);
                        } else if (i32 == 2) {
                            if (z5) {
                                c6jVar11.m31567a(this.f60070d, this.f60074h);
                                c6jVar10.m31567a(this.f60072f, this.f60076j);
                            } else {
                                c6jVar11.m31567a(c6jVar7, 0);
                                c6jVar10.m31567a(c6jVar8, 0);
                            }
                        }
                    }
                }
                v7jVar8 = v7jVar9;
            }
            i25++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m39153e() {
        return this.f60067a == 1 ? this.f60079m - this.f60084r.f80289U0 : this.f60079m;
    }

    /* JADX INFO: renamed from: f */
    public final int m39154f() {
        return this.f60067a == 0 ? this.f60078l - this.f60084r.f80288T0 : this.f60078l;
    }

    /* JADX INFO: renamed from: g */
    public final void m39155g(int i) {
        int i2 = this.f60082p;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f60081o;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.f60080n;
            int i7 = i6 + i5;
            giz gizVar = this.f60084r;
            if (i7 >= gizVar.f80300f1) {
                break;
            }
            v7j v7jVar = gizVar.f80299e1[i6 + i5];
            int i8 = this.f60067a;
            u7j u7jVar = u7j.f227710a;
            u7j u7jVar2 = u7j.f227712c;
            if (i8 == 0) {
                if (v7jVar != null) {
                    u7j[] u7jVarArr = v7jVar.f238220U;
                    if (u7jVarArr[0] == u7jVar2 && v7jVar.f238262s == 0) {
                        gizVar.m86121a0(v7jVar, u7jVar, i4, u7jVarArr[1], v7jVar.m84882m());
                    }
                }
            } else if (v7jVar != null) {
                u7j[] u7jVarArr2 = v7jVar.f238220U;
                if (u7jVarArr2[1] == u7jVar2 && v7jVar.f238264t == 0) {
                    int i9 = i4;
                    gizVar.m86121a0(v7jVar, u7jVarArr2[0], v7jVar.m84886s(), u7jVar, i9);
                    i4 = i9;
                }
            }
        }
        this.f60078l = 0;
        this.f60079m = 0;
        this.f60068b = null;
        this.f60069c = 0;
        int i10 = this.f60081o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f60080n + i11;
            giz gizVar2 = this.f60084r;
            if (i12 >= gizVar2.f80300f1) {
                return;
            }
            v7j v7jVar2 = gizVar2.f80299e1[i12];
            if (this.f60067a == 0) {
                int iM84886s = v7jVar2.m84886s();
                int i13 = gizVar2.f80288T0;
                if (v7jVar2.f238243i0 == 8) {
                    i13 = 0;
                }
                this.f60078l = iM84886s + i13 + this.f60078l;
                int iM44859b0 = gizVar2.m44859b0(v7jVar2, this.f60083q);
                if (this.f60068b == null || this.f60069c < iM44859b0) {
                    this.f60068b = v7jVar2;
                    this.f60069c = iM44859b0;
                    this.f60079m = iM44859b0;
                }
            } else {
                int iM44860c0 = gizVar2.m44860c0(v7jVar2, this.f60083q);
                int iM44859b1 = gizVar2.m44859b0(v7jVar2, this.f60083q);
                int i14 = gizVar2.f80289U0;
                if (v7jVar2.f238243i0 == 8) {
                    i14 = 0;
                }
                this.f60079m = iM44859b1 + i14 + this.f60079m;
                if (this.f60068b == null || this.f60069c < iM44860c0) {
                    this.f60068b = v7jVar2;
                    this.f60069c = iM44860c0;
                    this.f60078l = iM44860c0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39156h(int i) {
        this.f60080n = i;
    }

    /* JADX INFO: renamed from: i */
    public final void m39157i(int i, c6j c6jVar, c6j c6jVar2, c6j c6jVar3, c6j c6jVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f60067a = i;
        this.f60070d = c6jVar;
        this.f60071e = c6jVar2;
        this.f60072f = c6jVar3;
        this.f60073g = c6jVar4;
        this.f60074h = i2;
        this.f60075i = i3;
        this.f60076j = i4;
        this.f60077k = i5;
        this.f60083q = i6;
    }
}
