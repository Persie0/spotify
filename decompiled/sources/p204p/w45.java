package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w45 {

    /* JADX INFO: renamed from: a */
    public static final bns f247705a = new bns(new w73(2));

    /* JADX INFO: renamed from: b */
    public static final bns f247706b = new bns(new w73(3));

    /* JADX INFO: renamed from: c */
    public static final yzl f247707c = new yzl(0.8f, 0.0f, 0.8f, 0.15f);

    /* JADX INFO: renamed from: d */
    public static final float f247708d = 24;

    /* JADX INFO: renamed from: e */
    public static final float f247709e;

    /* JADX INFO: renamed from: f */
    public static final float f247710f;

    static {
        float f = 4;
        f247709e = f;
        f247710f = 16 - f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0171  */
    /* JADX WARN: Code duplicated, block: B:111:0x0180  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0106  */
    /* JADX INFO: renamed from: a */
    public static final void m87125a(th00 th00Var, fxh0 fxh0Var, th00 th00Var2, vh00 vh00Var, float f, tvd1 tvd1Var, x481 x481Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        int i4;
        th00 th00Var3;
        int i5;
        int i6;
        vh00 vh00Var2;
        int i7;
        int i8;
        tvd1 tvd1VarM92796d;
        x481 x481VarM92795c;
        int i9;
        boolean z;
        fxh0 fxh0Var3;
        th00 th00Var4;
        vh00 vh00Var3;
        float f2;
        tvd1 tvd1Var2;
        x481 x481Var2;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var4;
        th00 th00Var5;
        int i10;
        fxh0 fxh0Var5;
        float f3;
        float f4;
        xq00Var.m91775k0(-302230691);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(th00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91766g(fxh0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    th00Var3 = th00Var2;
                    if (xq00Var.m91770i(th00Var3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        vh00Var2 = vh00Var;
                        if (xq00Var.m91770i(vh00Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            tvd1VarM92796d = tvd1Var;
                            int i12 = xq00Var.m91766g(tvd1VarM92796d) ? 131072 : 65536;
                            i8 |= i12;
                        } else {
                            tvd1VarM92796d = tvd1Var;
                        }
                        i8 |= i12;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            x481VarM92795c = x481Var;
                            int i13 = xq00Var.m91766g(x481VarM92795c) ? 1048576 : 524288;
                            i8 |= i13;
                        } else {
                            x481VarM92795c = x481Var;
                        }
                        i8 |= i13;
                    } else {
                        x481VarM92795c = x481Var;
                    }
                    i9 = i8 | 12582912;
                    if ((4793491 & i9) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i9 & 1, z)) {
                        xq00Var.m91761d0();
                        if ((i & 1) != 0 || xq00Var.m91735E()) {
                            if (i11 != 0) {
                                fxh0Var4 = cxh0.f43038a;
                            } else {
                                fxh0Var4 = fxh0Var2;
                            }
                            if (i4 != 0) {
                                th00Var5 = b2g.f22592c;
                            } else {
                                th00Var5 = th00Var3;
                            }
                            if (i6 != 0) {
                                vh00Var2 = b2g.f22593d;
                            }
                            float f5 = y481.f269099a;
                            if ((i2 & 32) != 0) {
                                i9 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                                x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                            }
                            fxh0 fxh0Var6 = fxh0Var4;
                            i10 = i9;
                            fxh0Var5 = fxh0Var6;
                            th00Var3 = th00Var5;
                            f3 = f5;
                        } else {
                            xq00Var.m91757b0();
                            if ((i2 & 32) != 0) {
                                i9 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                            }
                            f3 = f;
                            i10 = i9;
                            fxh0Var5 = fxh0Var2;
                        }
                        vh00 vh00Var4 = vh00Var2;
                        xq00Var.m91790s();
                        float f6 = g55.f76589a;
                        if71 if71VarM83651a = up91.m83651a(13, xq00Var);
                        int i14 = i10;
                        if71 if71Var = if71.f101703d;
                        ub9 ub9Var = d7f0.f46145P0;
                        if (!ybs.m93301b(f3, Float.NaN) || ybs.m93301b(f3, Float.POSITIVE_INFINITY)) {
                            f4 = y481.f269099a;
                        } else {
                            f4 = f3;
                        }
                        int i15 = i14 << 12;
                        m87127c(fxh0Var5, th00Var, if71VarM83651a, if71Var, ub9Var, th00Var3, vh00Var4, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i14 >> 3) & 14) | 224256 | ((i14 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 1879048192), (i14 >> 18) & 126);
                        fxh0Var3 = fxh0Var5;
                        th00Var4 = th00Var3;
                        vh00Var3 = vh00Var4;
                        f2 = f3;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var3 = fxh0Var2;
                        th00Var4 = th00Var3;
                        vh00Var3 = vh00Var2;
                        f2 = f;
                    }
                    tvd1Var2 = tvd1VarM92796d;
                    x481Var2 = x481VarM92795c;
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
                    }
                }
                i3 |= 3072;
                vh00Var2 = vh00Var;
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tvd1VarM92796d = tvd1Var;
                        if (xq00Var.m91766g(tvd1VarM92796d)) {
                        }
                        i8 |= i12;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    i8 |= i12;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x481VarM92795c = x481Var;
                        if (xq00Var.m91766g(x481VarM92795c)) {
                        }
                        i8 |= i13;
                    } else {
                        x481VarM92795c = x481Var;
                    }
                    i8 |= i13;
                } else {
                    x481VarM92795c = x481Var;
                }
                i9 = i8 | 12582912;
                if ((4793491 & i9) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i9 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            th00Var5 = b2g.f22592c;
                        } else {
                            th00Var5 = th00Var3;
                        }
                        if (i6 != 0) {
                            vh00Var2 = b2g.f22593d;
                        }
                        float f7 = y481.f269099a;
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                        }
                        fxh0 fxh0Var7 = fxh0Var4;
                        i10 = i9;
                        fxh0Var5 = fxh0Var7;
                        th00Var3 = th00Var5;
                        f3 = f7;
                    } else {
                        if (i11 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            th00Var5 = b2g.f22592c;
                        } else {
                            th00Var5 = th00Var3;
                        }
                        if (i6 != 0) {
                            vh00Var2 = b2g.f22593d;
                        }
                        float f8 = y481.f269099a;
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                        }
                        fxh0 fxh0Var8 = fxh0Var4;
                        i10 = i9;
                        fxh0Var5 = fxh0Var8;
                        th00Var3 = th00Var5;
                        f3 = f8;
                    }
                    vh00 vh00Var5 = vh00Var2;
                    xq00Var.m91790s();
                    float f9 = g55.f76589a;
                    if71 if71VarM83651a2 = up91.m83651a(13, xq00Var);
                    int i16 = i10;
                    if71 if71Var2 = if71.f101703d;
                    ub9 ub9Var2 = d7f0.f46145P0;
                    if (ybs.m93301b(f3, Float.NaN)) {
                        f4 = y481.f269099a;
                    } else {
                        f4 = y481.f269099a;
                    }
                    int i17 = i16 << 12;
                    m87127c(fxh0Var5, th00Var, if71VarM83651a2, if71Var2, ub9Var2, th00Var3, vh00Var5, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i16 >> 3) & 14) | 224256 | ((i16 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 1879048192), (i16 >> 18) & 126);
                    fxh0Var3 = fxh0Var5;
                    th00Var4 = th00Var3;
                    vh00Var3 = vh00Var5;
                    f2 = f3;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    th00Var4 = th00Var3;
                    vh00Var3 = vh00Var2;
                    f2 = f;
                }
                tvd1Var2 = tvd1VarM92796d;
                x481Var2 = x481VarM92795c;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
                }
            }
            i3 |= 384;
            th00Var3 = th00Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    vh00Var2 = vh00Var;
                    if (xq00Var.m91770i(vh00Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tvd1VarM92796d = tvd1Var;
                        if (xq00Var.m91766g(tvd1VarM92796d)) {
                        }
                        i8 |= i12;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    i8 |= i12;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x481VarM92795c = x481Var;
                        if (xq00Var.m91766g(x481VarM92795c)) {
                        }
                        i8 |= i13;
                    } else {
                        x481VarM92795c = x481Var;
                    }
                    i8 |= i13;
                } else {
                    x481VarM92795c = x481Var;
                }
                i9 = i8 | 12582912;
                if ((4793491 & i9) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i9 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            th00Var5 = b2g.f22592c;
                        } else {
                            th00Var5 = th00Var3;
                        }
                        if (i6 != 0) {
                            vh00Var2 = b2g.f22593d;
                        }
                        float f10 = y481.f269099a;
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                        }
                        fxh0 fxh0Var9 = fxh0Var4;
                        i10 = i9;
                        fxh0Var5 = fxh0Var9;
                        th00Var3 = th00Var5;
                        f3 = f10;
                    } else {
                        if (i11 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            th00Var5 = b2g.f22592c;
                        } else {
                            th00Var5 = th00Var3;
                        }
                        if (i6 != 0) {
                            vh00Var2 = b2g.f22593d;
                        }
                        float f11 = y481.f269099a;
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                        }
                        fxh0 fxh0Var10 = fxh0Var4;
                        i10 = i9;
                        fxh0Var5 = fxh0Var10;
                        th00Var3 = th00Var5;
                        f3 = f11;
                    }
                    vh00 vh00Var6 = vh00Var2;
                    xq00Var.m91790s();
                    float f12 = g55.f76589a;
                    if71 if71VarM83651a3 = up91.m83651a(13, xq00Var);
                    int i18 = i10;
                    if71 if71Var3 = if71.f101703d;
                    ub9 ub9Var3 = d7f0.f46145P0;
                    if (ybs.m93301b(f3, Float.NaN)) {
                        f4 = y481.f269099a;
                    } else {
                        f4 = y481.f269099a;
                    }
                    int i19 = i18 << 12;
                    m87127c(fxh0Var5, th00Var, if71VarM83651a3, if71Var3, ub9Var3, th00Var3, vh00Var6, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i18 >> 3) & 14) | 224256 | ((i18 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 1879048192), (i18 >> 18) & 126);
                    fxh0Var3 = fxh0Var5;
                    th00Var4 = th00Var3;
                    vh00Var3 = vh00Var6;
                    f2 = f3;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    th00Var4 = th00Var3;
                    vh00Var3 = vh00Var2;
                    f2 = f;
                }
                tvd1Var2 = tvd1VarM92796d;
                x481Var2 = x481VarM92795c;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
                }
            }
            i3 |= 3072;
            vh00Var2 = vh00Var;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tvd1VarM92796d = tvd1Var;
                    if (xq00Var.m91766g(tvd1VarM92796d)) {
                    }
                    i8 |= i12;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                i8 |= i12;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x481VarM92795c = x481Var;
                    if (xq00Var.m91766g(x481VarM92795c)) {
                    }
                    i8 |= i13;
                } else {
                    x481VarM92795c = x481Var;
                }
                i8 |= i13;
            } else {
                x481VarM92795c = x481Var;
            }
            i9 = i8 | 12582912;
            if ((4793491 & i9) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i9 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        th00Var5 = b2g.f22592c;
                    } else {
                        th00Var5 = th00Var3;
                    }
                    if (i6 != 0) {
                        vh00Var2 = b2g.f22593d;
                    }
                    float f13 = y481.f269099a;
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                    }
                    fxh0 fxh0Var11 = fxh0Var4;
                    i10 = i9;
                    fxh0Var5 = fxh0Var11;
                    th00Var3 = th00Var5;
                    f3 = f13;
                } else {
                    if (i11 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        th00Var5 = b2g.f22592c;
                    } else {
                        th00Var5 = th00Var3;
                    }
                    if (i6 != 0) {
                        vh00Var2 = b2g.f22593d;
                    }
                    float f14 = y481.f269099a;
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                    }
                    fxh0 fxh0Var12 = fxh0Var4;
                    i10 = i9;
                    fxh0Var5 = fxh0Var12;
                    th00Var3 = th00Var5;
                    f3 = f14;
                }
                vh00 vh00Var7 = vh00Var2;
                xq00Var.m91790s();
                float f15 = g55.f76589a;
                if71 if71VarM83651a4 = up91.m83651a(13, xq00Var);
                int i110 = i10;
                if71 if71Var4 = if71.f101703d;
                ub9 ub9Var4 = d7f0.f46145P0;
                if (ybs.m93301b(f3, Float.NaN)) {
                    f4 = y481.f269099a;
                } else {
                    f4 = y481.f269099a;
                }
                int i111 = i110 << 12;
                m87127c(fxh0Var5, th00Var, if71VarM83651a4, if71Var4, ub9Var4, th00Var3, vh00Var7, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i110 >> 3) & 14) | 224256 | ((i110 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i111 & 3670016) | (i111 & 29360128) | (i111 & 1879048192), (i110 >> 18) & 126);
                fxh0Var3 = fxh0Var5;
                th00Var4 = th00Var3;
                vh00Var3 = vh00Var7;
                f2 = f3;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                th00Var4 = th00Var3;
                vh00Var3 = vh00Var2;
                f2 = f;
            }
            tvd1Var2 = tvd1VarM92796d;
            x481Var2 = x481VarM92795c;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
            }
        }
        i3 |= 48;
        fxh0Var2 = fxh0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                th00Var3 = th00Var2;
                if (xq00Var.m91770i(th00Var3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    vh00Var2 = vh00Var;
                    if (xq00Var.m91770i(vh00Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tvd1VarM92796d = tvd1Var;
                        if (xq00Var.m91766g(tvd1VarM92796d)) {
                        }
                        i8 |= i12;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    i8 |= i12;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x481VarM92795c = x481Var;
                        if (xq00Var.m91766g(x481VarM92795c)) {
                        }
                        i8 |= i13;
                    } else {
                        x481VarM92795c = x481Var;
                    }
                    i8 |= i13;
                } else {
                    x481VarM92795c = x481Var;
                }
                i9 = i8 | 12582912;
                if ((4793491 & i9) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i9 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            th00Var5 = b2g.f22592c;
                        } else {
                            th00Var5 = th00Var3;
                        }
                        if (i6 != 0) {
                            vh00Var2 = b2g.f22593d;
                        }
                        float f16 = y481.f269099a;
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                        }
                        fxh0 fxh0Var13 = fxh0Var4;
                        i10 = i9;
                        fxh0Var5 = fxh0Var13;
                        th00Var3 = th00Var5;
                        f3 = f16;
                    } else {
                        if (i11 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            th00Var5 = b2g.f22592c;
                        } else {
                            th00Var5 = th00Var3;
                        }
                        if (i6 != 0) {
                            vh00Var2 = b2g.f22593d;
                        }
                        float f17 = y481.f269099a;
                        if ((i2 & 32) != 0) {
                            i9 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        if ((i2 & 64) != 0) {
                            i9 &= -3670017;
                            x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                        }
                        fxh0 fxh0Var14 = fxh0Var4;
                        i10 = i9;
                        fxh0Var5 = fxh0Var14;
                        th00Var3 = th00Var5;
                        f3 = f17;
                    }
                    vh00 vh00Var8 = vh00Var2;
                    xq00Var.m91790s();
                    float f18 = g55.f76589a;
                    if71 if71VarM83651a5 = up91.m83651a(13, xq00Var);
                    int i112 = i10;
                    if71 if71Var5 = if71.f101703d;
                    ub9 ub9Var5 = d7f0.f46145P0;
                    if (ybs.m93301b(f3, Float.NaN)) {
                        f4 = y481.f269099a;
                    } else {
                        f4 = y481.f269099a;
                    }
                    int i113 = i112 << 12;
                    m87127c(fxh0Var5, th00Var, if71VarM83651a5, if71Var5, ub9Var5, th00Var3, vh00Var8, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i112 >> 3) & 14) | 224256 | ((i112 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i113 & 3670016) | (i113 & 29360128) | (i113 & 1879048192), (i112 >> 18) & 126);
                    fxh0Var3 = fxh0Var5;
                    th00Var4 = th00Var3;
                    vh00Var3 = vh00Var8;
                    f2 = f3;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    th00Var4 = th00Var3;
                    vh00Var3 = vh00Var2;
                    f2 = f;
                }
                tvd1Var2 = tvd1VarM92796d;
                x481Var2 = x481VarM92795c;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
                }
            }
            i3 |= 3072;
            vh00Var2 = vh00Var;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tvd1VarM92796d = tvd1Var;
                    if (xq00Var.m91766g(tvd1VarM92796d)) {
                    }
                    i8 |= i12;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                i8 |= i12;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x481VarM92795c = x481Var;
                    if (xq00Var.m91766g(x481VarM92795c)) {
                    }
                    i8 |= i13;
                } else {
                    x481VarM92795c = x481Var;
                }
                i8 |= i13;
            } else {
                x481VarM92795c = x481Var;
            }
            i9 = i8 | 12582912;
            if ((4793491 & i9) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i9 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        th00Var5 = b2g.f22592c;
                    } else {
                        th00Var5 = th00Var3;
                    }
                    if (i6 != 0) {
                        vh00Var2 = b2g.f22593d;
                    }
                    float f19 = y481.f269099a;
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                    }
                    fxh0 fxh0Var15 = fxh0Var4;
                    i10 = i9;
                    fxh0Var5 = fxh0Var15;
                    th00Var3 = th00Var5;
                    f3 = f19;
                } else {
                    if (i11 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        th00Var5 = b2g.f22592c;
                    } else {
                        th00Var5 = th00Var3;
                    }
                    if (i6 != 0) {
                        vh00Var2 = b2g.f22593d;
                    }
                    float f110 = y481.f269099a;
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                    }
                    fxh0 fxh0Var16 = fxh0Var4;
                    i10 = i9;
                    fxh0Var5 = fxh0Var16;
                    th00Var3 = th00Var5;
                    f3 = f110;
                }
                vh00 vh00Var9 = vh00Var2;
                xq00Var.m91790s();
                float f111 = g55.f76589a;
                if71 if71VarM83651a6 = up91.m83651a(13, xq00Var);
                int i114 = i10;
                if71 if71Var6 = if71.f101703d;
                ub9 ub9Var6 = d7f0.f46145P0;
                if (ybs.m93301b(f3, Float.NaN)) {
                    f4 = y481.f269099a;
                } else {
                    f4 = y481.f269099a;
                }
                int i115 = i114 << 12;
                m87127c(fxh0Var5, th00Var, if71VarM83651a6, if71Var6, ub9Var6, th00Var3, vh00Var9, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i114 >> 3) & 14) | 224256 | ((i114 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i115 & 3670016) | (i115 & 29360128) | (i115 & 1879048192), (i114 >> 18) & 126);
                fxh0Var3 = fxh0Var5;
                th00Var4 = th00Var3;
                vh00Var3 = vh00Var9;
                f2 = f3;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                th00Var4 = th00Var3;
                vh00Var3 = vh00Var2;
                f2 = f;
            }
            tvd1Var2 = tvd1VarM92796d;
            x481Var2 = x481VarM92795c;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
            }
        }
        i3 |= 384;
        th00Var3 = th00Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                vh00Var2 = vh00Var;
                if (xq00Var.m91770i(vh00Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tvd1VarM92796d = tvd1Var;
                    if (xq00Var.m91766g(tvd1VarM92796d)) {
                    }
                    i8 |= i12;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                i8 |= i12;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x481VarM92795c = x481Var;
                    if (xq00Var.m91766g(x481VarM92795c)) {
                    }
                    i8 |= i13;
                } else {
                    x481VarM92795c = x481Var;
                }
                i8 |= i13;
            } else {
                x481VarM92795c = x481Var;
            }
            i9 = i8 | 12582912;
            if ((4793491 & i9) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i9 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        th00Var5 = b2g.f22592c;
                    } else {
                        th00Var5 = th00Var3;
                    }
                    if (i6 != 0) {
                        vh00Var2 = b2g.f22593d;
                    }
                    float f112 = y481.f269099a;
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                    }
                    fxh0 fxh0Var17 = fxh0Var4;
                    i10 = i9;
                    fxh0Var5 = fxh0Var17;
                    th00Var3 = th00Var5;
                    f3 = f112;
                } else {
                    if (i11 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        th00Var5 = b2g.f22592c;
                    } else {
                        th00Var5 = th00Var3;
                    }
                    if (i6 != 0) {
                        vh00Var2 = b2g.f22593d;
                    }
                    float f113 = y481.f269099a;
                    if ((i2 & 32) != 0) {
                        i9 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    if ((i2 & 64) != 0) {
                        i9 &= -3670017;
                        x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                    }
                    fxh0 fxh0Var18 = fxh0Var4;
                    i10 = i9;
                    fxh0Var5 = fxh0Var18;
                    th00Var3 = th00Var5;
                    f3 = f113;
                }
                vh00 vh00Var10 = vh00Var2;
                xq00Var.m91790s();
                float f114 = g55.f76589a;
                if71 if71VarM83651a7 = up91.m83651a(13, xq00Var);
                int i116 = i10;
                if71 if71Var7 = if71.f101703d;
                ub9 ub9Var7 = d7f0.f46145P0;
                if (ybs.m93301b(f3, Float.NaN)) {
                    f4 = y481.f269099a;
                } else {
                    f4 = y481.f269099a;
                }
                int i117 = i116 << 12;
                m87127c(fxh0Var5, th00Var, if71VarM83651a7, if71Var7, ub9Var7, th00Var3, vh00Var10, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i116 >> 3) & 14) | 224256 | ((i116 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i117 & 3670016) | (i117 & 29360128) | (i117 & 1879048192), (i116 >> 18) & 126);
                fxh0Var3 = fxh0Var5;
                th00Var4 = th00Var3;
                vh00Var3 = vh00Var10;
                f2 = f3;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                th00Var4 = th00Var3;
                vh00Var3 = vh00Var2;
                f2 = f;
            }
            tvd1Var2 = tvd1VarM92796d;
            x481Var2 = x481VarM92795c;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
            }
        }
        i3 |= 3072;
        vh00Var2 = vh00Var;
        i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                tvd1VarM92796d = tvd1Var;
                if (xq00Var.m91766g(tvd1VarM92796d)) {
                }
                i8 |= i12;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            i8 |= i12;
        } else {
            tvd1VarM92796d = tvd1Var;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                x481VarM92795c = x481Var;
                if (xq00Var.m91766g(x481VarM92795c)) {
                }
                i8 |= i13;
            } else {
                x481VarM92795c = x481Var;
            }
            i8 |= i13;
        } else {
            x481VarM92795c = x481Var;
        }
        i9 = i8 | 12582912;
        if ((4793491 & i9) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i9 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if (i4 != 0) {
                    th00Var5 = b2g.f22592c;
                } else {
                    th00Var5 = th00Var3;
                }
                if (i6 != 0) {
                    vh00Var2 = b2g.f22593d;
                }
                float f115 = y481.f269099a;
                if ((i2 & 32) != 0) {
                    i9 &= -458753;
                    tvd1VarM92796d = y481.m92796d(xq00Var);
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                    x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                }
                fxh0 fxh0Var19 = fxh0Var4;
                i10 = i9;
                fxh0Var5 = fxh0Var19;
                th00Var3 = th00Var5;
                f3 = f115;
            } else {
                if (i11 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if (i4 != 0) {
                    th00Var5 = b2g.f22592c;
                } else {
                    th00Var5 = th00Var3;
                }
                if (i6 != 0) {
                    vh00Var2 = b2g.f22593d;
                }
                float f116 = y481.f269099a;
                if ((i2 & 32) != 0) {
                    i9 &= -458753;
                    tvd1VarM92796d = y481.m92796d(xq00Var);
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                    x481VarM92795c = y481.m92795c((v8f) xq00Var.m91774k(w8f.f248921a));
                }
                fxh0 fxh0Var110 = fxh0Var4;
                i10 = i9;
                fxh0Var5 = fxh0Var110;
                th00Var3 = th00Var5;
                f3 = f116;
            }
            vh00 vh00Var11 = vh00Var2;
            xq00Var.m91790s();
            float f117 = g55.f76589a;
            if71 if71VarM83651a8 = up91.m83651a(13, xq00Var);
            int i118 = i10;
            if71 if71Var8 = if71.f101703d;
            ub9 ub9Var8 = d7f0.f46145P0;
            if (ybs.m93301b(f3, Float.NaN)) {
                f4 = y481.f269099a;
            } else {
                f4 = y481.f269099a;
            }
            int i119 = i118 << 12;
            m87127c(fxh0Var5, th00Var, if71VarM83651a8, if71Var8, ub9Var8, th00Var3, vh00Var11, f4, tvd1VarM92796d, x481VarM92795c, null, xq00Var, ((i118 >> 3) & 14) | 224256 | ((i118 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i119 & 3670016) | (i119 & 29360128) | (i119 & 1879048192), (i118 >> 18) & 126);
            fxh0Var3 = fxh0Var5;
            th00Var4 = th00Var3;
            vh00Var3 = vh00Var11;
            f2 = f3;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            th00Var4 = th00Var3;
            vh00Var3 = vh00Var2;
            f2 = f;
        }
        tvd1Var2 = tvd1VarM92796d;
        x481Var2 = x481VarM92795c;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new p45(th00Var, fxh0Var3, th00Var4, vh00Var3, f2, tvd1Var2, x481Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m87126b(final fyf fyfVar, final fxh0 fxh0Var, final fyf fyfVar2, final fyf fyfVar3, float f, float f2, tvd1 tvd1Var, final x481 x481Var, final b581 b581Var, xq00 xq00Var, final int i) {
        int i2;
        final float f3;
        final float f4;
        final tvd1 tvd1Var2;
        float f5;
        int i3;
        float f6;
        tvd1 tvd1VarM92796d;
        xq00Var.m91775k0(-1378129383);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fyfVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fyfVar3) ? 2048 : 1024;
        }
        int i4 = 221184 | i2;
        if ((1572864 & i) == 0) {
            i4 = 745472 | i2;
        }
        if ((12582912 & i) == 0) {
            i4 |= xq00Var.m91766g(x481Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= xq00Var.m91766g(b581Var) ? 67108864 : 33554432;
        }
        if (xq00Var.m91752Y(i4 & 1, (38347923 & i4) != 38347922)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                f5 = y481.f269100b;
                i3 = i4 & (-3670017);
                f6 = y481.f269101c;
                tvd1VarM92796d = y481.m92796d(xq00Var);
            } else {
                xq00Var.m91757b0();
                int i5 = i4 & (-3670017);
                f6 = f2;
                tvd1VarM92796d = tvd1Var;
                i3 = i5;
                f5 = f;
            }
            xq00Var.m91790s();
            float f7 = f55.f65940a;
            if71 if71VarM83651a = up91.m83651a(9, xq00Var);
            float f8 = g55.f76589a;
            if71 if71VarM83651a2 = up91.m83651a(13, xq00Var);
            if71 if71Var = if71.f101703d;
            int i6 = i3 >> 3;
            m87130f(fxh0Var, fyfVar, if71VarM83651a, f247708d, fyfVar, if71VarM83651a2, if71Var, if71Var, fyfVar2, fyfVar3, (ybs.m93301b(f5, Float.NaN) || ybs.m93301b(f5, Float.POSITIVE_INFINITY)) ? y481.f269100b : f5, (ybs.m93301b(f6, Float.NaN) || ybs.m93301b(f6, Float.POSITIVE_INFINITY)) ? y481.f269101c : f6, tvd1VarM92796d, x481Var, b581Var, xq00Var, (i6 & 14) | 920128512 | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 12) & 57344), (i6 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i6 & 896) | (i6 & 3670016) | (i6 & 29360128));
            tvd1Var2 = tvd1VarM92796d;
            f3 = f5;
            f4 = f6;
        } else {
            xq00Var.m91757b0();
            f3 = f;
            f4 = f2;
            tvd1Var2 = tvd1Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.n45
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w45.m87126b(fyfVar, fxh0Var, fyfVar2, fyfVar3, f3, f4, tvd1Var2, x481Var, b581Var, (xq00) obj, fyg1.m43076B(i | 1));
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87127c(final fxh0 fxh0Var, final th00 th00Var, final if71 if71Var, final if71 if71Var2, final ub9 ub9Var, final th00 th00Var2, final vh00 vh00Var, final float f, final tvd1 tvd1Var, final x481 x481Var, final b581 b581Var, xq00 xq00Var, final int i, final int i2) {
        int i3;
        if71 if71Var3;
        if71 if71Var4;
        ub9 ub9Var2;
        th00 th00Var3;
        vh00 vh00Var2;
        float f2;
        int i4;
        xq00Var.m91775k0(-2033800111);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(th00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if71Var3 = if71Var;
            i3 |= xq00Var.m91766g(if71Var3) ? 256 : 128;
        } else {
            if71Var3 = if71Var;
        }
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91770i(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if71Var4 = if71Var2;
            i3 |= xq00Var.m91766g(if71Var4) ? 16384 : 8192;
        } else {
            if71Var4 = if71Var2;
        }
        if ((196608 & i) == 0) {
            ub9Var2 = ub9Var;
            i3 |= xq00Var.m91766g(ub9Var2) ? 131072 : 65536;
        } else {
            ub9Var2 = ub9Var;
        }
        if ((1572864 & i) == 0) {
            th00Var3 = th00Var2;
            i3 |= xq00Var.m91770i(th00Var3) ? 1048576 : 524288;
        } else {
            th00Var3 = th00Var2;
        }
        if ((12582912 & i) == 0) {
            vh00Var2 = vh00Var;
            i3 |= xq00Var.m91770i(vh00Var2) ? 8388608 : 4194304;
        } else {
            vh00Var2 = vh00Var;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= xq00Var.m91760d(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= xq00Var.m91766g(tvd1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (xq00Var.m91766g(x481Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91766g(b581Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((e7q) xq00Var.m91774k(f247705a)).m38070a(new ch21(fxh0Var, th00Var, if71Var3, if71Var4, ub9Var2, th00Var3, vh00Var2, f2, tvd1Var, x481Var, b581Var), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.q45
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w45.m87127c(fxh0Var, th00Var, if71Var, if71Var2, ub9Var, th00Var2, vh00Var, f, tvd1Var, x481Var, b581Var, (xq00) obj, fyg1.m43076B(i | 1), fyg1.m43076B(i2));
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0193  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    /* JADX INFO: renamed from: d */
    public static final void m87128d(final fyf fyfVar, fxh0 fxh0Var, th00 th00Var, vh00 vh00Var, float f, tvd1 tvd1Var, final x481 x481Var, b581 b581Var, xq00 xq00Var, final int i, final int i2) {
        int i3;
        int i4;
        vh00 vh00Var2;
        int i5;
        int i6;
        float f2;
        int i7;
        tvd1 tvd1VarM92796d;
        x481 x481Var2;
        int i8;
        b581 b581Var2;
        int i9;
        boolean z;
        final fxh0 fxh0Var2;
        final th00 th00Var2;
        final vh00 vh00Var3;
        final float f3;
        final tvd1 tvd1Var2;
        final b581 b581Var3;
        pgv0 pgv0VarM91796v;
        th00 th00Var3;
        b581 b581Var4;
        th00 th00Var4;
        fxh0 fxh0Var3;
        int i10;
        float f4;
        float f5;
        int i11;
        xq00Var.m91775k0(1784421840);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i3 | 48;
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                i12 |= xq00Var.m91770i(th00Var) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    vh00Var2 = vh00Var;
                    if (xq00Var.m91770i(vh00Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i12 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (xq00Var.m91760d(f2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i12 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            tvd1VarM92796d = tvd1Var;
                            int i14 = xq00Var.m91766g(tvd1VarM92796d) ? 131072 : 65536;
                            i12 |= i14;
                        } else {
                            tvd1VarM92796d = tvd1Var;
                        }
                        i12 |= i14;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    if ((1572864 & i) == 0) {
                        x481Var2 = x481Var;
                        if (xq00Var.m91766g(x481Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i12 |= i11;
                    } else {
                        x481Var2 = x481Var;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        if ((12582912 & i) == 0) {
                            b581Var2 = b581Var;
                            if (xq00Var.m91766g(b581Var2)) {
                                i9 = 8388608;
                            } else {
                                i9 = 4194304;
                            }
                            i12 |= i9;
                        }
                        if ((4793491 & i12) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (xq00Var.m91752Y(i12 & 1, z)) {
                            xq00Var.m91761d0();
                            if ((i & 1) != 0 || xq00Var.m91735E()) {
                                if (i13 != 0) {
                                    th00Var3 = b2g.f22590a;
                                } else {
                                    th00Var3 = th00Var;
                                }
                                if (i4 != 0) {
                                    vh00Var2 = b2g.f22591b;
                                }
                                if (i6 != 0) {
                                    f2 = y481.f269099a;
                                }
                                if ((i2 & 32) != 0) {
                                    i12 &= -458753;
                                    tvd1VarM92796d = y481.m92796d(xq00Var);
                                }
                                cxh0 cxh0Var = cxh0.f43038a;
                                if (i8 != 0) {
                                    b581Var4 = null;
                                } else {
                                    b581Var4 = b581Var2;
                                }
                                th00Var4 = th00Var3;
                                fxh0Var3 = cxh0Var;
                                i10 = i12;
                                f4 = f2;
                            } else {
                                xq00Var.m91757b0();
                                if ((i2 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                fxh0Var3 = fxh0Var;
                                i10 = i12;
                                vh00Var2 = vh00Var2;
                                f4 = f2;
                                b581Var4 = b581Var2;
                                th00Var4 = th00Var;
                            }
                            xq00Var.m91790s();
                            float f6 = g55.f76589a;
                            if71 if71VarM83651a = up91.m83651a(13, xq00Var);
                            int i15 = i10;
                            if71 if71Var = if71.f101703d;
                            ub9 ub9Var = d7f0.f46144O0;
                            if (!ybs.m93301b(f4, Float.NaN) || ybs.m93301b(f4, Float.POSITIVE_INFINITY)) {
                                f5 = y481.f269099a;
                            } else {
                                f5 = f4;
                            }
                            int i16 = i15 << 12;
                            float f7 = f4;
                            m87127c(fxh0Var3, fyfVar, if71VarM83651a, if71Var, ub9Var, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i15 >> 3) & 14) | 224256 | ((i15 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 1879048192), (i15 >> 18) & 126);
                            fxh0Var2 = fxh0Var3;
                            th00Var2 = th00Var4;
                            vh00Var3 = vh00Var2;
                            tvd1Var2 = tvd1VarM92796d;
                            b581Var3 = b581Var4;
                            f3 = f7;
                        } else {
                            xq00Var.m91757b0();
                            fxh0Var2 = fxh0Var;
                            th00Var2 = th00Var;
                            vh00Var3 = vh00Var2;
                            f3 = f2;
                            tvd1Var2 = tvd1VarM92796d;
                            b581Var3 = b581Var2;
                        }
                        pgv0VarM91796v = xq00Var.m91796v();
                        if (pgv0VarM91796v != null) {
                            pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                                @Override // p204p.th00
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                                    return w2a1.f247311a;
                                }
                            };
                        }
                    }
                    i12 |= 12582912;
                    b581Var2 = b581Var;
                    if ((4793491 & i12) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i12 & 1, z)) {
                        xq00Var.m91761d0();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var2 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var2;
                            i10 = i12;
                            f4 = f2;
                        } else {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var3 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var3;
                            i10 = i12;
                            f4 = f2;
                        }
                        xq00Var.m91790s();
                        float f8 = g55.f76589a;
                        if71 if71VarM83651a2 = up91.m83651a(13, xq00Var);
                        int i17 = i10;
                        if71 if71Var2 = if71.f101703d;
                        ub9 ub9Var2 = d7f0.f46144O0;
                        if (ybs.m93301b(f4, Float.NaN)) {
                            f5 = y481.f269099a;
                        } else {
                            f5 = y481.f269099a;
                        }
                        int i18 = i17 << 12;
                        float f9 = f4;
                        m87127c(fxh0Var3, fyfVar, if71VarM83651a2, if71Var2, ub9Var2, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i17 >> 3) & 14) | 224256 | ((i17 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 1879048192), (i17 >> 18) & 126);
                        fxh0Var2 = fxh0Var3;
                        th00Var2 = th00Var4;
                        vh00Var3 = vh00Var2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var4;
                        f3 = f9;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var2 = fxh0Var;
                        th00Var2 = th00Var;
                        vh00Var3 = vh00Var2;
                        f3 = f2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var2;
                    }
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                            @Override // p204p.th00
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                                return w2a1.f247311a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                f2 = f;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tvd1VarM92796d = tvd1Var;
                        if (xq00Var.m91766g(tvd1VarM92796d)) {
                        }
                        i12 |= i14;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    i12 |= i14;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                if ((1572864 & i) == 0) {
                    x481Var2 = x481Var;
                    if (xq00Var.m91766g(x481Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i12 |= i11;
                } else {
                    x481Var2 = x481Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        b581Var2 = b581Var;
                        if (xq00Var.m91766g(b581Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i12 |= i9;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i12 & 1, z)) {
                        xq00Var.m91761d0();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var4 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var4;
                            i10 = i12;
                            f4 = f2;
                        } else {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var5 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var5;
                            i10 = i12;
                            f4 = f2;
                        }
                        xq00Var.m91790s();
                        float f10 = g55.f76589a;
                        if71 if71VarM83651a3 = up91.m83651a(13, xq00Var);
                        int i19 = i10;
                        if71 if71Var3 = if71.f101703d;
                        ub9 ub9Var3 = d7f0.f46144O0;
                        if (ybs.m93301b(f4, Float.NaN)) {
                            f5 = y481.f269099a;
                        } else {
                            f5 = y481.f269099a;
                        }
                        int i110 = i19 << 12;
                        float f11 = f4;
                        m87127c(fxh0Var3, fyfVar, if71VarM83651a3, if71Var3, ub9Var3, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i19 >> 3) & 14) | 224256 | ((i19 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i110 & 3670016) | (i110 & 29360128) | (i110 & 1879048192), (i19 >> 18) & 126);
                        fxh0Var2 = fxh0Var3;
                        th00Var2 = th00Var4;
                        vh00Var3 = vh00Var2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var4;
                        f3 = f11;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var2 = fxh0Var;
                        th00Var2 = th00Var;
                        vh00Var3 = vh00Var2;
                        f3 = f2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var2;
                    }
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                            @Override // p204p.th00
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                                return w2a1.f247311a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                b581Var2 = b581Var;
                if ((4793491 & i12) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i12 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var6 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var6;
                        i10 = i12;
                        f4 = f2;
                    } else {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var7 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var7;
                        i10 = i12;
                        f4 = f2;
                    }
                    xq00Var.m91790s();
                    float f12 = g55.f76589a;
                    if71 if71VarM83651a4 = up91.m83651a(13, xq00Var);
                    int i111 = i10;
                    if71 if71Var4 = if71.f101703d;
                    ub9 ub9Var4 = d7f0.f46144O0;
                    if (ybs.m93301b(f4, Float.NaN)) {
                        f5 = y481.f269099a;
                    } else {
                        f5 = y481.f269099a;
                    }
                    int i112 = i111 << 12;
                    float f13 = f4;
                    m87127c(fxh0Var3, fyfVar, if71VarM83651a4, if71Var4, ub9Var4, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i111 >> 3) & 14) | 224256 | ((i111 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 1879048192), (i111 >> 18) & 126);
                    fxh0Var2 = fxh0Var3;
                    th00Var2 = th00Var4;
                    vh00Var3 = vh00Var2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var4;
                    f3 = f13;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    th00Var2 = th00Var;
                    vh00Var3 = vh00Var2;
                    f3 = f2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i12 |= 3072;
            vh00Var2 = vh00Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (xq00Var.m91760d(f2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i12 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tvd1VarM92796d = tvd1Var;
                        if (xq00Var.m91766g(tvd1VarM92796d)) {
                        }
                        i12 |= i14;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    i12 |= i14;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                if ((1572864 & i) == 0) {
                    x481Var2 = x481Var;
                    if (xq00Var.m91766g(x481Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i12 |= i11;
                } else {
                    x481Var2 = x481Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        b581Var2 = b581Var;
                        if (xq00Var.m91766g(b581Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i12 |= i9;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i12 & 1, z)) {
                        xq00Var.m91761d0();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var8 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var8;
                            i10 = i12;
                            f4 = f2;
                        } else {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var9 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var9;
                            i10 = i12;
                            f4 = f2;
                        }
                        xq00Var.m91790s();
                        float f14 = g55.f76589a;
                        if71 if71VarM83651a5 = up91.m83651a(13, xq00Var);
                        int i113 = i10;
                        if71 if71Var5 = if71.f101703d;
                        ub9 ub9Var5 = d7f0.f46144O0;
                        if (ybs.m93301b(f4, Float.NaN)) {
                            f5 = y481.f269099a;
                        } else {
                            f5 = y481.f269099a;
                        }
                        int i114 = i113 << 12;
                        float f15 = f4;
                        m87127c(fxh0Var3, fyfVar, if71VarM83651a5, if71Var5, ub9Var5, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i113 >> 3) & 14) | 224256 | ((i113 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i114 & 3670016) | (i114 & 29360128) | (i114 & 1879048192), (i113 >> 18) & 126);
                        fxh0Var2 = fxh0Var3;
                        th00Var2 = th00Var4;
                        vh00Var3 = vh00Var2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var4;
                        f3 = f15;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var2 = fxh0Var;
                        th00Var2 = th00Var;
                        vh00Var3 = vh00Var2;
                        f3 = f2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var2;
                    }
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                            @Override // p204p.th00
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                                return w2a1.f247311a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                b581Var2 = b581Var;
                if ((4793491 & i12) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i12 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var10 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var10;
                        i10 = i12;
                        f4 = f2;
                    } else {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var11 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var11;
                        i10 = i12;
                        f4 = f2;
                    }
                    xq00Var.m91790s();
                    float f16 = g55.f76589a;
                    if71 if71VarM83651a6 = up91.m83651a(13, xq00Var);
                    int i115 = i10;
                    if71 if71Var6 = if71.f101703d;
                    ub9 ub9Var6 = d7f0.f46144O0;
                    if (ybs.m93301b(f4, Float.NaN)) {
                        f5 = y481.f269099a;
                    } else {
                        f5 = y481.f269099a;
                    }
                    int i116 = i115 << 12;
                    float f17 = f4;
                    m87127c(fxh0Var3, fyfVar, if71VarM83651a6, if71Var6, ub9Var6, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i115 >> 3) & 14) | 224256 | ((i115 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i116 & 3670016) | (i116 & 29360128) | (i116 & 1879048192), (i115 >> 18) & 126);
                    fxh0Var2 = fxh0Var3;
                    th00Var2 = th00Var4;
                    vh00Var3 = vh00Var2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var4;
                    f3 = f17;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    th00Var2 = th00Var;
                    vh00Var3 = vh00Var2;
                    f3 = f2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i12 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tvd1VarM92796d = tvd1Var;
                    if (xq00Var.m91766g(tvd1VarM92796d)) {
                    }
                    i12 |= i14;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                i12 |= i14;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            if ((1572864 & i) == 0) {
                x481Var2 = x481Var;
                if (xq00Var.m91766g(x481Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 |= i11;
            } else {
                x481Var2 = x481Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    b581Var2 = b581Var;
                    if (xq00Var.m91766g(b581Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i12 |= i9;
                }
                if ((4793491 & i12) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i12 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var12 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var12;
                        i10 = i12;
                        f4 = f2;
                    } else {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var13 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var13;
                        i10 = i12;
                        f4 = f2;
                    }
                    xq00Var.m91790s();
                    float f18 = g55.f76589a;
                    if71 if71VarM83651a7 = up91.m83651a(13, xq00Var);
                    int i117 = i10;
                    if71 if71Var7 = if71.f101703d;
                    ub9 ub9Var7 = d7f0.f46144O0;
                    if (ybs.m93301b(f4, Float.NaN)) {
                        f5 = y481.f269099a;
                    } else {
                        f5 = y481.f269099a;
                    }
                    int i118 = i117 << 12;
                    float f19 = f4;
                    m87127c(fxh0Var3, fyfVar, if71VarM83651a7, if71Var7, ub9Var7, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i117 >> 3) & 14) | 224256 | ((i117 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i118 & 3670016) | (i118 & 29360128) | (i118 & 1879048192), (i117 >> 18) & 126);
                    fxh0Var2 = fxh0Var3;
                    th00Var2 = th00Var4;
                    vh00Var3 = vh00Var2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var4;
                    f3 = f19;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    th00Var2 = th00Var;
                    vh00Var3 = vh00Var2;
                    f3 = f2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            b581Var2 = b581Var;
            if ((4793491 & i12) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i12 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var14 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var14;
                    i10 = i12;
                    f4 = f2;
                } else {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var15 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var15;
                    i10 = i12;
                    f4 = f2;
                }
                xq00Var.m91790s();
                float f110 = g55.f76589a;
                if71 if71VarM83651a8 = up91.m83651a(13, xq00Var);
                int i119 = i10;
                if71 if71Var8 = if71.f101703d;
                ub9 ub9Var8 = d7f0.f46144O0;
                if (ybs.m93301b(f4, Float.NaN)) {
                    f5 = y481.f269099a;
                } else {
                    f5 = y481.f269099a;
                }
                int i1110 = i119 << 12;
                float f111 = f4;
                m87127c(fxh0Var3, fyfVar, if71VarM83651a8, if71Var8, ub9Var8, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i119 >> 3) & 14) | 224256 | ((i119 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i1110 & 3670016) | (i1110 & 29360128) | (i1110 & 1879048192), (i119 >> 18) & 126);
                fxh0Var2 = fxh0Var3;
                th00Var2 = th00Var4;
                vh00Var3 = vh00Var2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var4;
                f3 = f111;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                th00Var2 = th00Var;
                vh00Var3 = vh00Var2;
                f3 = f2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                        return w2a1.f247311a;
                    }
                };
            }
        }
        i12 = i3 | 432;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                vh00Var2 = vh00Var;
                if (xq00Var.m91770i(vh00Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i12 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (xq00Var.m91760d(f2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i12 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        tvd1VarM92796d = tvd1Var;
                        if (xq00Var.m91766g(tvd1VarM92796d)) {
                        }
                        i12 |= i14;
                    } else {
                        tvd1VarM92796d = tvd1Var;
                    }
                    i12 |= i14;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                if ((1572864 & i) == 0) {
                    x481Var2 = x481Var;
                    if (xq00Var.m91766g(x481Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i12 |= i11;
                } else {
                    x481Var2 = x481Var;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        b581Var2 = b581Var;
                        if (xq00Var.m91766g(b581Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i12 |= i9;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i12 & 1, z)) {
                        xq00Var.m91761d0();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var16 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var16;
                            i10 = i12;
                            f4 = f2;
                        } else {
                            if (i13 != 0) {
                                th00Var3 = b2g.f22590a;
                            } else {
                                th00Var3 = th00Var;
                            }
                            if (i4 != 0) {
                                vh00Var2 = b2g.f22591b;
                            }
                            if (i6 != 0) {
                                f2 = y481.f269099a;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                tvd1VarM92796d = y481.m92796d(xq00Var);
                            }
                            cxh0 cxh0Var17 = cxh0.f43038a;
                            if (i8 != 0) {
                                b581Var4 = null;
                            } else {
                                b581Var4 = b581Var2;
                            }
                            th00Var4 = th00Var3;
                            fxh0Var3 = cxh0Var17;
                            i10 = i12;
                            f4 = f2;
                        }
                        xq00Var.m91790s();
                        float f112 = g55.f76589a;
                        if71 if71VarM83651a9 = up91.m83651a(13, xq00Var);
                        int i1111 = i10;
                        if71 if71Var9 = if71.f101703d;
                        ub9 ub9Var9 = d7f0.f46144O0;
                        if (ybs.m93301b(f4, Float.NaN)) {
                            f5 = y481.f269099a;
                        } else {
                            f5 = y481.f269099a;
                        }
                        int i1112 = i1111 << 12;
                        float f113 = f4;
                        m87127c(fxh0Var3, fyfVar, if71VarM83651a9, if71Var9, ub9Var9, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i1111 >> 3) & 14) | 224256 | ((i1111 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i1112 & 3670016) | (i1112 & 29360128) | (i1112 & 1879048192), (i1111 >> 18) & 126);
                        fxh0Var2 = fxh0Var3;
                        th00Var2 = th00Var4;
                        vh00Var3 = vh00Var2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var4;
                        f3 = f113;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var2 = fxh0Var;
                        th00Var2 = th00Var;
                        vh00Var3 = vh00Var2;
                        f3 = f2;
                        tvd1Var2 = tvd1VarM92796d;
                        b581Var3 = b581Var2;
                    }
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                            @Override // p204p.th00
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                                return w2a1.f247311a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                b581Var2 = b581Var;
                if ((4793491 & i12) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i12 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var18 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var18;
                        i10 = i12;
                        f4 = f2;
                    } else {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var19 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var19;
                        i10 = i12;
                        f4 = f2;
                    }
                    xq00Var.m91790s();
                    float f114 = g55.f76589a;
                    if71 if71VarM83651a10 = up91.m83651a(13, xq00Var);
                    int i1113 = i10;
                    if71 if71Var10 = if71.f101703d;
                    ub9 ub9Var10 = d7f0.f46144O0;
                    if (ybs.m93301b(f4, Float.NaN)) {
                        f5 = y481.f269099a;
                    } else {
                        f5 = y481.f269099a;
                    }
                    int i1114 = i1113 << 12;
                    float f115 = f4;
                    m87127c(fxh0Var3, fyfVar, if71VarM83651a10, if71Var10, ub9Var10, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i1113 >> 3) & 14) | 224256 | ((i1113 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i1114 & 3670016) | (i1114 & 29360128) | (i1114 & 1879048192), (i1113 >> 18) & 126);
                    fxh0Var2 = fxh0Var3;
                    th00Var2 = th00Var4;
                    vh00Var3 = vh00Var2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var4;
                    f3 = f115;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    th00Var2 = th00Var;
                    vh00Var3 = vh00Var2;
                    f3 = f2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i12 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tvd1VarM92796d = tvd1Var;
                    if (xq00Var.m91766g(tvd1VarM92796d)) {
                    }
                    i12 |= i14;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                i12 |= i14;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            if ((1572864 & i) == 0) {
                x481Var2 = x481Var;
                if (xq00Var.m91766g(x481Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 |= i11;
            } else {
                x481Var2 = x481Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    b581Var2 = b581Var;
                    if (xq00Var.m91766g(b581Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i12 |= i9;
                }
                if ((4793491 & i12) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i12 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var110 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var110;
                        i10 = i12;
                        f4 = f2;
                    } else {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var111 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var111;
                        i10 = i12;
                        f4 = f2;
                    }
                    xq00Var.m91790s();
                    float f116 = g55.f76589a;
                    if71 if71VarM83651a11 = up91.m83651a(13, xq00Var);
                    int i1115 = i10;
                    if71 if71Var11 = if71.f101703d;
                    ub9 ub9Var11 = d7f0.f46144O0;
                    if (ybs.m93301b(f4, Float.NaN)) {
                        f5 = y481.f269099a;
                    } else {
                        f5 = y481.f269099a;
                    }
                    int i1116 = i1115 << 12;
                    float f117 = f4;
                    m87127c(fxh0Var3, fyfVar, if71VarM83651a11, if71Var11, ub9Var11, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i1115 >> 3) & 14) | 224256 | ((i1115 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i1116 & 3670016) | (i1116 & 29360128) | (i1116 & 1879048192), (i1115 >> 18) & 126);
                    fxh0Var2 = fxh0Var3;
                    th00Var2 = th00Var4;
                    vh00Var3 = vh00Var2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var4;
                    f3 = f117;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    th00Var2 = th00Var;
                    vh00Var3 = vh00Var2;
                    f3 = f2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            b581Var2 = b581Var;
            if ((4793491 & i12) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i12 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var112 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var112;
                    i10 = i12;
                    f4 = f2;
                } else {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var113 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var113;
                    i10 = i12;
                    f4 = f2;
                }
                xq00Var.m91790s();
                float f118 = g55.f76589a;
                if71 if71VarM83651a12 = up91.m83651a(13, xq00Var);
                int i1117 = i10;
                if71 if71Var12 = if71.f101703d;
                ub9 ub9Var12 = d7f0.f46144O0;
                if (ybs.m93301b(f4, Float.NaN)) {
                    f5 = y481.f269099a;
                } else {
                    f5 = y481.f269099a;
                }
                int i1118 = i1117 << 12;
                float f119 = f4;
                m87127c(fxh0Var3, fyfVar, if71VarM83651a12, if71Var12, ub9Var12, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i1117 >> 3) & 14) | 224256 | ((i1117 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i1118 & 3670016) | (i1118 & 29360128) | (i1118 & 1879048192), (i1117 >> 18) & 126);
                fxh0Var2 = fxh0Var3;
                th00Var2 = th00Var4;
                vh00Var3 = vh00Var2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var4;
                f3 = f119;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                th00Var2 = th00Var;
                vh00Var3 = vh00Var2;
                f3 = f2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                        return w2a1.f247311a;
                    }
                };
            }
        }
        i12 |= 3072;
        vh00Var2 = vh00Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (xq00Var.m91760d(f2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i12 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    tvd1VarM92796d = tvd1Var;
                    if (xq00Var.m91766g(tvd1VarM92796d)) {
                    }
                    i12 |= i14;
                } else {
                    tvd1VarM92796d = tvd1Var;
                }
                i12 |= i14;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            if ((1572864 & i) == 0) {
                x481Var2 = x481Var;
                if (xq00Var.m91766g(x481Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 |= i11;
            } else {
                x481Var2 = x481Var;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    b581Var2 = b581Var;
                    if (xq00Var.m91766g(b581Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i12 |= i9;
                }
                if ((4793491 & i12) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i12 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var114 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var114;
                        i10 = i12;
                        f4 = f2;
                    } else {
                        if (i13 != 0) {
                            th00Var3 = b2g.f22590a;
                        } else {
                            th00Var3 = th00Var;
                        }
                        if (i4 != 0) {
                            vh00Var2 = b2g.f22591b;
                        }
                        if (i6 != 0) {
                            f2 = y481.f269099a;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            tvd1VarM92796d = y481.m92796d(xq00Var);
                        }
                        cxh0 cxh0Var115 = cxh0.f43038a;
                        if (i8 != 0) {
                            b581Var4 = null;
                        } else {
                            b581Var4 = b581Var2;
                        }
                        th00Var4 = th00Var3;
                        fxh0Var3 = cxh0Var115;
                        i10 = i12;
                        f4 = f2;
                    }
                    xq00Var.m91790s();
                    float f1110 = g55.f76589a;
                    if71 if71VarM83651a13 = up91.m83651a(13, xq00Var);
                    int i1119 = i10;
                    if71 if71Var13 = if71.f101703d;
                    ub9 ub9Var13 = d7f0.f46144O0;
                    if (ybs.m93301b(f4, Float.NaN)) {
                        f5 = y481.f269099a;
                    } else {
                        f5 = y481.f269099a;
                    }
                    int i11110 = i1119 << 12;
                    float f1111 = f4;
                    m87127c(fxh0Var3, fyfVar, if71VarM83651a13, if71Var13, ub9Var13, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i1119 >> 3) & 14) | 224256 | ((i1119 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i11110 & 3670016) | (i11110 & 29360128) | (i11110 & 1879048192), (i1119 >> 18) & 126);
                    fxh0Var2 = fxh0Var3;
                    th00Var2 = th00Var4;
                    vh00Var3 = vh00Var2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var4;
                    f3 = f1111;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var2 = fxh0Var;
                    th00Var2 = th00Var;
                    vh00Var3 = vh00Var2;
                    f3 = f2;
                    tvd1Var2 = tvd1VarM92796d;
                    b581Var3 = b581Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                        @Override // p204p.th00
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                            return w2a1.f247311a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            b581Var2 = b581Var;
            if ((4793491 & i12) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i12 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var116 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var116;
                    i10 = i12;
                    f4 = f2;
                } else {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var117 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var117;
                    i10 = i12;
                    f4 = f2;
                }
                xq00Var.m91790s();
                float f1112 = g55.f76589a;
                if71 if71VarM83651a14 = up91.m83651a(13, xq00Var);
                int i11111 = i10;
                if71 if71Var14 = if71.f101703d;
                ub9 ub9Var14 = d7f0.f46144O0;
                if (ybs.m93301b(f4, Float.NaN)) {
                    f5 = y481.f269099a;
                } else {
                    f5 = y481.f269099a;
                }
                int i11112 = i11111 << 12;
                float f1113 = f4;
                m87127c(fxh0Var3, fyfVar, if71VarM83651a14, if71Var14, ub9Var14, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i11111 >> 3) & 14) | 224256 | ((i11111 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i11112 & 3670016) | (i11112 & 29360128) | (i11112 & 1879048192), (i11111 >> 18) & 126);
                fxh0Var2 = fxh0Var3;
                th00Var2 = th00Var4;
                vh00Var3 = vh00Var2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var4;
                f3 = f1113;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                th00Var2 = th00Var;
                vh00Var3 = vh00Var2;
                f3 = f2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                        return w2a1.f247311a;
                    }
                };
            }
        }
        i12 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                tvd1VarM92796d = tvd1Var;
                if (xq00Var.m91766g(tvd1VarM92796d)) {
                }
                i12 |= i14;
            } else {
                tvd1VarM92796d = tvd1Var;
            }
            i12 |= i14;
        } else {
            tvd1VarM92796d = tvd1Var;
        }
        if ((1572864 & i) == 0) {
            x481Var2 = x481Var;
            if (xq00Var.m91766g(x481Var2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i12 |= i11;
        } else {
            x481Var2 = x481Var;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((12582912 & i) == 0) {
                b581Var2 = b581Var;
                if (xq00Var.m91766g(b581Var2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i12 |= i9;
            }
            if ((4793491 & i12) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i12 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var118 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var118;
                    i10 = i12;
                    f4 = f2;
                } else {
                    if (i13 != 0) {
                        th00Var3 = b2g.f22590a;
                    } else {
                        th00Var3 = th00Var;
                    }
                    if (i4 != 0) {
                        vh00Var2 = b2g.f22591b;
                    }
                    if (i6 != 0) {
                        f2 = y481.f269099a;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        tvd1VarM92796d = y481.m92796d(xq00Var);
                    }
                    cxh0 cxh0Var119 = cxh0.f43038a;
                    if (i8 != 0) {
                        b581Var4 = null;
                    } else {
                        b581Var4 = b581Var2;
                    }
                    th00Var4 = th00Var3;
                    fxh0Var3 = cxh0Var119;
                    i10 = i12;
                    f4 = f2;
                }
                xq00Var.m91790s();
                float f1114 = g55.f76589a;
                if71 if71VarM83651a15 = up91.m83651a(13, xq00Var);
                int i11113 = i10;
                if71 if71Var15 = if71.f101703d;
                ub9 ub9Var15 = d7f0.f46144O0;
                if (ybs.m93301b(f4, Float.NaN)) {
                    f5 = y481.f269099a;
                } else {
                    f5 = y481.f269099a;
                }
                int i11114 = i11113 << 12;
                float f1115 = f4;
                m87127c(fxh0Var3, fyfVar, if71VarM83651a15, if71Var15, ub9Var15, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i11113 >> 3) & 14) | 224256 | ((i11113 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i11114 & 3670016) | (i11114 & 29360128) | (i11114 & 1879048192), (i11113 >> 18) & 126);
                fxh0Var2 = fxh0Var3;
                th00Var2 = th00Var4;
                vh00Var3 = vh00Var2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var4;
                f3 = f1115;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                th00Var2 = th00Var;
                vh00Var3 = vh00Var2;
                f3 = f2;
                tvd1Var2 = tvd1VarM92796d;
                b581Var3 = b581Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                    @Override // p204p.th00
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                        return w2a1.f247311a;
                    }
                };
            }
        }
        i12 |= 12582912;
        b581Var2 = b581Var;
        if ((4793491 & i12) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i12 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    th00Var3 = b2g.f22590a;
                } else {
                    th00Var3 = th00Var;
                }
                if (i4 != 0) {
                    vh00Var2 = b2g.f22591b;
                }
                if (i6 != 0) {
                    f2 = y481.f269099a;
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                    tvd1VarM92796d = y481.m92796d(xq00Var);
                }
                cxh0 cxh0Var1110 = cxh0.f43038a;
                if (i8 != 0) {
                    b581Var4 = null;
                } else {
                    b581Var4 = b581Var2;
                }
                th00Var4 = th00Var3;
                fxh0Var3 = cxh0Var1110;
                i10 = i12;
                f4 = f2;
            } else {
                if (i13 != 0) {
                    th00Var3 = b2g.f22590a;
                } else {
                    th00Var3 = th00Var;
                }
                if (i4 != 0) {
                    vh00Var2 = b2g.f22591b;
                }
                if (i6 != 0) {
                    f2 = y481.f269099a;
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                    tvd1VarM92796d = y481.m92796d(xq00Var);
                }
                cxh0 cxh0Var1111 = cxh0.f43038a;
                if (i8 != 0) {
                    b581Var4 = null;
                } else {
                    b581Var4 = b581Var2;
                }
                th00Var4 = th00Var3;
                fxh0Var3 = cxh0Var1111;
                i10 = i12;
                f4 = f2;
            }
            xq00Var.m91790s();
            float f1116 = g55.f76589a;
            if71 if71VarM83651a16 = up91.m83651a(13, xq00Var);
            int i11115 = i10;
            if71 if71Var16 = if71.f101703d;
            ub9 ub9Var16 = d7f0.f46144O0;
            if (ybs.m93301b(f4, Float.NaN)) {
                f5 = y481.f269099a;
            } else {
                f5 = y481.f269099a;
            }
            int i11116 = i11115 << 12;
            float f1117 = f4;
            m87127c(fxh0Var3, fyfVar, if71VarM83651a16, if71Var16, ub9Var16, th00Var4, vh00Var2, f5, tvd1VarM92796d, x481Var2, b581Var4, xq00Var, ((i11115 >> 3) & 14) | 224256 | ((i11115 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i11116 & 3670016) | (i11116 & 29360128) | (i11116 & 1879048192), (i11115 >> 18) & 126);
            fxh0Var2 = fxh0Var3;
            th00Var2 = th00Var4;
            vh00Var3 = vh00Var2;
            tvd1Var2 = tvd1VarM92796d;
            b581Var3 = b581Var4;
            f3 = f1117;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            th00Var2 = th00Var;
            vh00Var3 = vh00Var2;
            f3 = f2;
            tvd1Var2 = tvd1VarM92796d;
            b581Var3 = b581Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.o45
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w45.m87128d(fyfVar, fxh0Var2, th00Var2, vh00Var3, f3, tvd1Var2, x481Var, b581Var3, (xq00) obj, fyg1.m43076B(i | 1), i2);
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m87129e(final fxh0 fxh0Var, final xhz xhzVar, final long j, final long j2, final long j3, long j4, final th00 th00Var, final if71 if71Var, final if71 if71Var2, eh00 eh00Var, final aj5 aj5Var, final ub9 ub9Var, final int i, final boolean z, final th00 th00Var2, fyf fyfVar, final float f, xq00 xq00Var, final int i2, final int i3) {
        int i4;
        fyf fyfVar2;
        final long j5;
        eh00 eh00Var2;
        ia7 ia7Var;
        fxh0 fxh0VarM96643a;
        ia7 ia7Var2 = t6x0.f217647t;
        xq00Var.m91775k0(126395868);
        ug5 ug5Var = xq00Var.f264811a;
        int i5 = i2 | (xq00Var.m91766g(fxh0Var) ? 4 : 2) | (xq00Var.m91766g(xhzVar) ? 32 : 16) | (xq00Var.m91764f(j) ? 256 : 128) | (xq00Var.m91764f(j2) ? 2048 : 1024) | (xq00Var.m91764f(j3) ? 16384 : 8192) | (xq00Var.m91764f(j4) ? 131072 : 65536) | (xq00Var.m91770i(th00Var) ? 1048576 : 524288) | (xq00Var.m91766g(if71Var) ? 8388608 : 4194304) | (xq00Var.m91770i(null) ? 67108864 : 33554432) | (xq00Var.m91766g(if71Var2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (xq00Var.m91770i(eh00Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i6 = i4 | (xq00Var.m91766g(ub9Var) ? 256 : 128);
        if ((i3 & 3072) == 0) {
            i6 |= xq00Var.m91762e(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= xq00Var.m91768h(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= xq00Var.m91770i(th00Var2) ? 131072 : 65536;
        }
        int i7 = i6 | (xq00Var.m91760d(f) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i5 & 1, ((i5 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true)) {
            boolean z2 = ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((29360128 & i7) == 8388608);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var2) {
                a581 a581Var = new a581(xhzVar, aj5Var, ub9Var, i, f);
                xq00Var.m91793t0(a581Var);
                objM91750T = a581Var;
            }
            a581 a581Var2 = (a581) objM91750T;
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(a581Var2, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            yhh yhhVar3 = roh.f201265j;
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iHashCode))) {
                pi9.m70087l(iHashCode, xq00Var, iHashCode, yhhVar3);
            }
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM89448x = wze1.m89448x(cxh0Var, "navigationIcon");
            float f2 = f247709e;
            fxh0 fxh0VarM96832C = zsf1.m96832C(fxh0VarM89448x, f2, 0.0f, 0.0f, 0.0f, 14);
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iHashCode2))) {
                pi9.m70087l(iHashCode2, xq00Var, iHashCode2, yhhVar3);
            }
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            bns bnsVar = egj.f59351a;
            qqg1.m73532b(lq51.m59706l(j, bnsVar), th00Var2, xq00Var, ((i7 >> 12) & ContentType.LONG_FORM_ON_DEMAND) | 8);
            xq00Var.m91788r(true);
            xq00Var.m91771i0(-1359701523);
            fxh0 fxh0VarM96830A = zsf1.m96830A(wze1.m89448x(cxh0Var, ContextTrack.Metadata.KEY_TITLE), f2, 0.0f, 2);
            if (z) {
                xq00Var.m91771i0(510338172);
                Object objM91750T2 = xq00Var.m91750T();
                ia7Var = ia7Var2;
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = new C2126mg(7);
                    xq00Var.m91793t0(objM91750T2);
                }
                fxh0VarM96643a = zoz0.m96643a(cxh0Var, (gh00) objM91750T2);
                xq00Var.m91788r(false);
            } else {
                ia7Var = ia7Var2;
                xq00Var.m91771i0(510340109);
                xq00Var.m91788r(false);
                fxh0VarM96643a = cxh0Var;
            }
            fxh0 fxh0VarMo34315F = fxh0VarM96830A.mo34315F(fxh0VarM96643a);
            boolean z3 = (i7 & 14) == 4;
            Object objM91750T3 = xq00Var.m91750T();
            if (z3 || objM91750T3 == ia7Var) {
                eh00Var2 = eh00Var;
                objM91750T3 = new t45(0, eh00Var2);
                xq00Var.m91793t0(objM91750T3);
            } else {
                eh00Var2 = eh00Var;
            }
            fxh0 fxh0VarM57831m = l0y0.m57831m(fxh0VarMo34315F, (gh00) objM91750T3);
            m6d0 m6d0VarM36007d2 = dha.m36007d(wb9Var, false);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM57831m);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iHashCode3))) {
                pi9.m70087l(iHashCode3, xq00Var, iHashCode3, yhhVar3);
            }
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            xig1.m91127f(j2, if71Var, th00Var, xq00Var, ((i5 >> 9) & 14) | ((i5 >> 18) & ContentType.LONG_FORM_ON_DEMAND) | ((i5 >> 12) & 896));
            xq00Var.m91788r(true);
            xq00Var.m91788r(false);
            fxh0 fxh0VarM96832C2 = zsf1.m96832C(wze1.m89448x(cxh0Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            m6d0 m6d0VarM36007d3 = dha.m36007d(wb9Var, false);
            int iHashCode4 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m4 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var, fxh0VarM96832C2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d3, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var);
            if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iHashCode4))) {
                pi9.m70087l(iHashCode4, xq00Var, iHashCode4, yhhVar3);
            }
            zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var);
            j5 = j4;
            fyfVar2 = fyfVar;
            qqg1.m73532b(bnsVar.mo30068a(new n6f(j5)), fyfVar2, xq00Var, 56);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
        } else {
            fyfVar2 = fyfVar;
            j5 = j4;
            eh00Var2 = eh00Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            final fyf fyfVar3 = fyfVar2;
            final eh00 eh00Var3 = eh00Var2;
            pgv0VarM91796v.f177419d = new th00(xhzVar, j, j2, j3, j5, th00Var, if71Var, if71Var2, eh00Var3, aj5Var, ub9Var, i, z, th00Var2, fyfVar3, f, i2, i3) { // from class: p.u45

                /* JADX INFO: renamed from: L0 */
                public final /* synthetic */ boolean f226580L0;

                /* JADX INFO: renamed from: M0 */
                public final /* synthetic */ th00 f226581M0;

                /* JADX INFO: renamed from: N0 */
                public final /* synthetic */ fyf f226582N0;

                /* JADX INFO: renamed from: O0 */
                public final /* synthetic */ float f226583O0;

                /* JADX INFO: renamed from: P0 */
                public final /* synthetic */ int f226584P0;

                /* JADX INFO: renamed from: X */
                public final /* synthetic */ aj5 f226585X;

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ ub9 f226586Y;

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ int f226587Z;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ xhz f226589b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f226590c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f226591d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f226592e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f226593f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ th00 f226594g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ if71 f226595h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ if71 f226596i;

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ eh00 f226597t;

                {
                    this.f226584P0 = i3;
                }

                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM43076B = fyg1.m43076B(1);
                    int iM43076B2 = fyg1.m43076B(this.f226584P0);
                    w45.m87129e(this.f226588a, this.f226589b, this.f226590c, this.f226591d, this.f226592e, this.f226593f, this.f226594g, this.f226595h, this.f226596i, this.f226597t, this.f226585X, this.f226586Y, this.f226587Z, this.f226580L0, this.f226581M0, this.f226582N0, this.f226583O0, (xq00) obj, iM43076B, iM43076B2);
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m87130f(final fxh0 fxh0Var, final fyf fyfVar, final if71 if71Var, final float f, final fyf fyfVar2, final if71 if71Var2, final if71 if71Var3, final if71 if71Var4, final fyf fyfVar3, final fyf fyfVar4, final float f2, final float f3, final tvd1 tvd1Var, final x481 x481Var, final b581 b581Var, xq00 xq00Var, final int i, final int i2) {
        int i3;
        if71 if71Var5;
        float f4;
        fyf fyfVar5;
        if71 if71Var6;
        int i4;
        fyf fyfVar6;
        float f5;
        ub9 ub9Var = d7f0.f46144O0;
        xq00Var.m91775k0(1092180406);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if71Var5 = if71Var;
            i3 |= xq00Var.m91766g(if71Var5) ? 256 : 128;
        } else {
            if71Var5 = if71Var;
        }
        if ((i & 3072) == 0) {
            f4 = f;
            i3 |= xq00Var.m91760d(f4) ? 2048 : 1024;
        } else {
            f4 = f;
        }
        if ((i & 24576) == 0) {
            fyfVar5 = fyfVar2;
            i3 |= xq00Var.m91770i(fyfVar5) ? 16384 : 8192;
        } else {
            fyfVar5 = fyfVar2;
        }
        if ((i & 196608) == 0) {
            i3 |= xq00Var.m91766g(if71Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= xq00Var.m91770i(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= xq00Var.m91766g(if71Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= xq00Var.m91770i(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            if71Var6 = if71Var4;
            i3 |= xq00Var.m91766g(if71Var6) ? 536870912 : 268435456;
        } else {
            if71Var6 = if71Var4;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (xq00Var.m91766g(ub9Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91770i(fyfVar3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            fyfVar6 = fyfVar4;
            i4 |= xq00Var.m91770i(fyfVar6) ? 256 : 128;
        } else {
            fyfVar6 = fyfVar4;
        }
        if ((i2 & 3072) == 0) {
            f5 = f2;
            i4 |= xq00Var.m91760d(f5) ? 2048 : 1024;
        } else {
            f5 = f2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= xq00Var.m91760d(f3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= xq00Var.m91766g(tvd1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= xq00Var.m91766g(x481Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= xq00Var.m91766g(b581Var) ? 8388608 : 4194304;
        }
        if (xq00Var.m91752Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ((ofq) xq00Var.m91774k(f247706b)).m66859a(new sm91(fxh0Var, fyfVar, if71Var5, f4, fyfVar5, if71Var2, if71Var3, if71Var6, fyfVar3, fyfVar6, f5, f3, tvd1Var, x481Var, b581Var), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.s45
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM43076B = fyg1.m43076B(i | 1);
                    int iM43076B2 = fyg1.m43076B(i2);
                    w45.m87130f(fxh0Var, fyfVar, if71Var, f, fyfVar2, if71Var2, if71Var3, if71Var4, fyfVar3, fyfVar4, f2, f3, tvd1Var, x481Var, b581Var, (xq00) obj, iM43076B, iM43076B2);
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final Object m87131g(c581 c581Var, float f, ypo ypoVar, n05 n05Var, ibk ibkVar) {
        v45 v45Var;
        olv0 olv0Var;
        olv0 olv0Var2;
        if (ibkVar instanceof v45) {
            v45Var = (v45) ibkVar;
            int i = v45Var.f237047e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v45Var.f237047e = i - Integer.MIN_VALUE;
            } else {
                v45Var = new v45(ibkVar);
            }
        } else {
            v45Var = new v45(ibkVar);
        }
        v45 v45Var2 = v45Var;
        Object obj = v45Var2.f237046d;
        int i2 = v45Var2.f237047e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                olv0 olv0Var3 = v45Var2.f237045c;
                n05Var = v45Var2.f237044b;
                c581 c581Var2 = (c581) v45Var2.f237043a;
                bga.m29073P(obj);
                olv0Var = olv0Var3;
                c581Var = c581Var2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                olv0Var2 = (olv0) v45Var2.f237043a;
                bga.m29073P(obj);
            }
            olv0Var = olv0Var2;
            return new m5b1(pp91.m70524e(0.0f, olv0Var.f166933a));
        }
        bga.m29073P(obj);
        if (c581Var.m31457a() < 0.01f || c581Var.m31457a() == 1.0f) {
            return new m5b1(0L);
        }
        olv0Var = new olv0();
        olv0Var.f166933a = f;
        if (ypoVar != null && Math.abs(f) > 1.0f) {
            olv0 olv0Var4 = new olv0();
            q05 q05VarM39331a = el51.m39331a(0.0f, f, 28);
            C2611yf c2611yf = new C2611yf(olv0Var4, c581Var, olv0Var, 1);
            v45Var2.f237043a = c581Var;
            v45Var2.f237044b = n05Var;
            v45Var2.f237045c = olv0Var;
            v45Var2.f237047e = 1;
            if (mkg1.m62152n(q05VarM39331a, ypoVar, false, c2611yf, v45Var2) != yukVar) {
            }
            return yukVar;
        }
        return new m5b1(pp91.m70524e(0.0f, olv0Var.f166933a));
        n05 n05Var2 = n05Var;
        if (n05Var2 != null) {
            uum0 uum0Var = c581Var.f34107c;
            uum0 uum0Var2 = c581Var.f34107c;
            if (uum0Var.m84031v() < 0.0f && uum0Var2.m84031v() > c581Var.f34105a) {
                q05 q05VarM39331a2 = el51.m39331a(uum0Var2.m84031v(), 0.0f, 30);
                Float f2 = new Float(c581Var.m31457a() < 0.5f ? 0.0f : c581Var.f34105a);
                r45 r45Var = new r45(c581Var, 0);
                v45Var2.f237043a = olv0Var;
                v45Var2.f237044b = null;
                v45Var2.f237045c = null;
                v45Var2.f237047e = 2;
                if (mkg1.m62154p(q05VarM39331a2, f2, n05Var2, false, r45Var, v45Var2, 4) != yukVar) {
                    olv0Var2 = olv0Var;
                    olv0Var = olv0Var2;
                }
                return yukVar;
            }
        }
        return new m5b1(pp91.m70524e(0.0f, olv0Var.f166933a));
    }

    /* JADX INFO: renamed from: h */
    public static final c581 m87132h(xq00 xq00Var) {
        Object[] objArr = new Object[0];
        t9y0 t9y0Var = c581.f34104d;
        boolean zM91760d = xq00Var.m91760d(-3.4028235E38f) | xq00Var.m91760d(0.0f) | xq00Var.m91760d(0.0f);
        Object objM91750T = xq00Var.m91750T();
        if (zM91760d || objM91750T == t6x0.f217647t) {
            objM91750T = new w73(1);
            xq00Var.m91793t0(objM91750T);
        }
        return (c581) dul.m37020w(objArr, t9y0Var, (eh00) objM91750T, xq00Var, 0);
    }
}
