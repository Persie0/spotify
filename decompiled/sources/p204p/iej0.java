package p204p;

import android.os.Build;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class iej0 {

    /* JADX INFO: renamed from: a */
    public final cej0 f101422a;

    /* JADX INFO: renamed from: b */
    public final dii0 f101423b;

    /* JADX INFO: renamed from: c */
    public final x4j0 f101424c;

    /* JADX INFO: renamed from: d */
    public final pbj0 f101425d;

    /* JADX INFO: renamed from: e */
    public final luk f101426e;

    /* JADX INFO: renamed from: f */
    public final luk f101427f;

    /* JADX INFO: renamed from: g */
    public final fiz f101428g;

    public iej0(cej0 cej0Var, dii0 dii0Var, x4j0 x4j0Var, pbj0 pbj0Var, luk lukVar, luk lukVar2) {
        fiz fizVarM92074U;
        this.f101422a = cej0Var;
        this.f101423b = dii0Var;
        this.f101424c = x4j0Var;
        this.f101425d = pbj0Var;
        this.f101426e = lukVar;
        this.f101427f = lukVar2;
        if (Build.VERSION.SDK_INT < 31) {
            fizVarM92074U = nxf1.m65834m(zdj0.f281731a);
        } else {
            fbk fbkVar = null;
            fizVarM92074U = xtm0.m92074U(kyf1.m57709n(k0e1.m54985d(cej0Var.f37142d.distinctUntilChanged()), new rph0(this, fbkVar, 20)), new g3c0(fbkVar, this, 13));
        }
        this.f101428g = mvl0.m62953p(fizVarM92074U);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m50387a(iej0 iej0Var, ibk ibkVar) {
        eej0 eej0Var;
        if (ibkVar instanceof eej0) {
            eej0Var = (eej0) ibkVar;
            int i = eej0Var.f58806c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eej0Var.f58806c = i - Integer.MIN_VALUE;
            } else {
                eej0Var = new eej0(iej0Var, ibkVar);
            }
        } else {
            eej0Var = new eej0(iej0Var, ibkVar);
        }
        Object obj = eej0Var.f58804a;
        int i2 = eej0Var.f58806c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        cej0 cej0Var = iej0Var.f101422a;
        vcj0 vcj0Var = cej0Var.f37140b;
        Single map = vcj0Var.m85191c().map(new mj70(vcj0Var, 29)).map(new s780(cej0Var, 26));
        eej0Var.f58806c = 1;
        Object objM96567o = zn91.m96567o(map, eej0Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc A[PHI: r1 r11
      0x00dc: PHI (r1v6 p.uaj0) = (r1v4 p.uaj0), (r1v8 p.uaj0) binds: [B:43:0x00d8, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r11v18 int) = (r11v16 int), (r11v24 int) binds: [B:43:0x00d8, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[PHI: r1 r11
      0x013f: PHI (r1v11 p.uaj0) = (r1v9 p.uaj0), (r1v13 p.uaj0) binds: [B:62:0x013c, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r11v27 int) = (r11v25 int), (r11v33 int) binds: [B:62:0x013c, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ae  */
    /* JADX INFO: renamed from: b */
    public final Object m50388b(bej0 bej0Var, fbk fbkVar) {
        fej0 fej0Var;
        aej0 aej0Var;
        uaj0 uaj0VarM28940b;
        boolean z;
        x4j0 x4j0Var;
        gej0 gej0Var;
        uaj0 uaj0Var;
        int i;
        uaj0 uaj0Var2;
        int i2;
        Object objM89557A;
        Object objM89557A2;
        if (fbkVar instanceof fej0) {
            fej0Var = (fej0) fbkVar;
            int i3 = fej0Var.f68783g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fej0Var.f68783g = i3 - Integer.MIN_VALUE;
            } else {
                fej0Var = new fej0(this, fbkVar);
            }
        } else {
            fej0Var = new fej0(this, fbkVar);
        }
        Object objM86755t = fej0Var.f68781e;
        int i4 = fej0Var.f68783g;
        luk lukVar = this.f101427f;
        w2a1 w2a1Var = w2a1.f247311a;
        dii0 dii0Var = this.f101423b;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(objM86755t);
                fej0Var.f68777a = bej0Var;
                fej0Var.f68783g = 1;
                objM86755t = vyf1.m86755t(this.f101428g, fej0Var);
                if (objM86755t != yukVar) {
                    aej0Var = (aej0) objM86755t;
                    if (aej0Var instanceof zdj0) {
                        uaj0VarM28940b = null;
                    } else if (aej0Var instanceof vdj0) {
                        uaj0VarM28940b = bej0Var.m28939a();
                    } else if (aej0Var instanceof wdj0) {
                        uaj0VarM28940b = bej0Var.m28941c();
                    } else {
                        if (aej0Var instanceof xdj0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uaj0VarM28940b = bej0Var.m28940b();
                    }
                    if (uaj0VarM28940b != null) {
                        z = uaj0VarM28940b instanceof maj0;
                        x4j0Var = this.f101424c;
                        if (z) {
                            boolean zM61311a = ((maj0) uaj0VarM28940b).m61311a();
                            fej0Var.f68777a = null;
                            fej0Var.f68778b = aej0Var;
                            fej0Var.f68779c = uaj0VarM28940b;
                            fej0Var.f68780d = 0;
                            fej0Var.f68783g = 2;
                            objM86755t = x4j0Var.m89893i(zM61311a, fej0Var);
                            if (objM86755t != yukVar) {
                                uaj0Var2 = uaj0VarM28940b;
                                i2 = 0;
                                if (((Boolean) objM86755t).booleanValue()) {
                                    fej0Var.f68777a = null;
                                    fej0Var.f68778b = null;
                                    fej0Var.f68779c = uaj0Var2;
                                    fej0Var.f68780d = i2;
                                    fej0Var.f68783g = 3;
                                    if (dii0Var.m36092G((maj0) uaj0Var2, aej0Var instanceof wdj0, fej0Var) != yukVar) {
                                        if (((maj0) uaj0Var2).m61311a()) {
                                            fej0Var.f68777a = null;
                                            fej0Var.f68778b = null;
                                            fej0Var.f68779c = null;
                                            fej0Var.f68780d = i2;
                                            fej0Var.f68783g = 4;
                                            objM89557A = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                                            if (objM89557A != yukVar) {
                                                objM89557A = w2a1Var;
                                            }
                                            if (objM89557A == yukVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (uaj0VarM28940b instanceof kaj0) {
                            boolean zM55907a = ((kaj0) uaj0VarM28940b).m55907a();
                            fej0Var.f68777a = null;
                            fej0Var.f68778b = aej0Var;
                            fej0Var.f68779c = uaj0VarM28940b;
                            fej0Var.f68780d = 0;
                            fej0Var.f68783g = 5;
                            objM86755t = x4j0Var.m89893i(zM55907a, fej0Var);
                            if (objM86755t != yukVar) {
                                uaj0Var = uaj0VarM28940b;
                                i = 0;
                                if (((Boolean) objM86755t).booleanValue()) {
                                    fej0Var.f68777a = null;
                                    fej0Var.f68778b = null;
                                    fej0Var.f68779c = uaj0Var;
                                    fej0Var.f68780d = i;
                                    fej0Var.f68783g = 6;
                                    dii0Var.m36091F((kaj0) uaj0Var, aej0Var instanceof wdj0, fej0Var);
                                    if (w2a1Var != yukVar) {
                                        if (((kaj0) uaj0Var).m55907a()) {
                                            fej0Var.f68777a = null;
                                            fej0Var.f68778b = null;
                                            fej0Var.f68779c = null;
                                            fej0Var.f68780d = i;
                                            fej0Var.f68783g = 7;
                                            objM89557A2 = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                                            if (objM89557A2 != yukVar) {
                                                objM89557A2 = w2a1Var;
                                            }
                                            if (objM89557A2 == yukVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (uaj0VarM28940b instanceof iaj0) {
                            fej0Var.f68777a = null;
                            fej0Var.f68778b = null;
                            fej0Var.f68779c = null;
                            fej0Var.f68780d = 0;
                            fej0Var.f68783g = 8;
                            dii0Var.m36090E((iaj0) uaj0VarM28940b, fej0Var);
                            if (w2a1Var == yukVar) {
                            }
                        } else if (uaj0VarM28940b instanceof jaj0) {
                            gej0Var = new gej0(this, fbkVar2, 0);
                            fej0Var.f68777a = null;
                            fej0Var.f68778b = null;
                            fej0Var.f68779c = null;
                            fej0Var.f68780d = 0;
                            fej0Var.f68783g = 9;
                            if (x0h1.m89557A(this.f101426e, gej0Var, fej0Var) == yukVar) {
                            }
                        } else if (uaj0VarM28940b instanceof haj0) {
                            dii0Var.m36093H();
                        } else if (!(uaj0VarM28940b instanceof gaj0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return w2a1Var;
                }
                return yukVar;
            case 1:
                bej0Var = fej0Var.f68777a;
                bga.m29073P(objM86755t);
                aej0Var = (aej0) objM86755t;
                if (aej0Var instanceof zdj0) {
                    uaj0VarM28940b = null;
                } else if (aej0Var instanceof vdj0) {
                    uaj0VarM28940b = bej0Var.m28939a();
                } else if (aej0Var instanceof wdj0) {
                    uaj0VarM28940b = bej0Var.m28941c();
                } else {
                    if (aej0Var instanceof xdj0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uaj0VarM28940b = bej0Var.m28940b();
                }
                if (uaj0VarM28940b != null) {
                    z = uaj0VarM28940b instanceof maj0;
                    x4j0Var = this.f101424c;
                    if (z) {
                        boolean zM61311a2 = ((maj0) uaj0VarM28940b).m61311a();
                        fej0Var.f68777a = null;
                        fej0Var.f68778b = aej0Var;
                        fej0Var.f68779c = uaj0VarM28940b;
                        fej0Var.f68780d = 0;
                        fej0Var.f68783g = 2;
                        objM86755t = x4j0Var.m89893i(zM61311a2, fej0Var);
                        if (objM86755t != yukVar) {
                            uaj0Var2 = uaj0VarM28940b;
                            i2 = 0;
                            if (((Boolean) objM86755t).booleanValue()) {
                                fej0Var.f68777a = null;
                                fej0Var.f68778b = null;
                                fej0Var.f68779c = uaj0Var2;
                                fej0Var.f68780d = i2;
                                fej0Var.f68783g = 3;
                                if (dii0Var.m36092G((maj0) uaj0Var2, aej0Var instanceof wdj0, fej0Var) != yukVar) {
                                    if (((maj0) uaj0Var2).m61311a()) {
                                        fej0Var.f68777a = null;
                                        fej0Var.f68778b = null;
                                        fej0Var.f68779c = null;
                                        fej0Var.f68780d = i2;
                                        fej0Var.f68783g = 4;
                                        objM89557A = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                                        if (objM89557A != yukVar) {
                                            objM89557A = w2a1Var;
                                        }
                                        if (objM89557A == yukVar) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (uaj0VarM28940b instanceof kaj0) {
                        boolean zM55907a2 = ((kaj0) uaj0VarM28940b).m55907a();
                        fej0Var.f68777a = null;
                        fej0Var.f68778b = aej0Var;
                        fej0Var.f68779c = uaj0VarM28940b;
                        fej0Var.f68780d = 0;
                        fej0Var.f68783g = 5;
                        objM86755t = x4j0Var.m89893i(zM55907a2, fej0Var);
                        if (objM86755t != yukVar) {
                            uaj0Var = uaj0VarM28940b;
                            i = 0;
                            if (((Boolean) objM86755t).booleanValue()) {
                                fej0Var.f68777a = null;
                                fej0Var.f68778b = null;
                                fej0Var.f68779c = uaj0Var;
                                fej0Var.f68780d = i;
                                fej0Var.f68783g = 6;
                                dii0Var.m36091F((kaj0) uaj0Var, aej0Var instanceof wdj0, fej0Var);
                                if (w2a1Var != yukVar) {
                                    if (((kaj0) uaj0Var).m55907a()) {
                                        fej0Var.f68777a = null;
                                        fej0Var.f68778b = null;
                                        fej0Var.f68779c = null;
                                        fej0Var.f68780d = i;
                                        fej0Var.f68783g = 7;
                                        objM89557A2 = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                                        if (objM89557A2 != yukVar) {
                                            objM89557A2 = w2a1Var;
                                        }
                                        if (objM89557A2 == yukVar) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (uaj0VarM28940b instanceof iaj0) {
                        fej0Var.f68777a = null;
                        fej0Var.f68778b = null;
                        fej0Var.f68779c = null;
                        fej0Var.f68780d = 0;
                        fej0Var.f68783g = 8;
                        dii0Var.m36090E((iaj0) uaj0VarM28940b, fej0Var);
                        if (w2a1Var == yukVar) {
                        }
                    } else if (uaj0VarM28940b instanceof jaj0) {
                        gej0Var = new gej0(this, fbkVar2, 0);
                        fej0Var.f68777a = null;
                        fej0Var.f68778b = null;
                        fej0Var.f68779c = null;
                        fej0Var.f68780d = 0;
                        fej0Var.f68783g = 9;
                        if (x0h1.m89557A(this.f101426e, gej0Var, fej0Var) == yukVar) {
                        }
                    } else if (uaj0VarM28940b instanceof haj0) {
                        dii0Var.m36093H();
                    } else if (!(uaj0VarM28940b instanceof gaj0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return yukVar;
                }
                return w2a1Var;
            case 2:
                i2 = fej0Var.f68780d;
                uaj0Var2 = fej0Var.f68779c;
                aej0Var = fej0Var.f68778b;
                bga.m29073P(objM86755t);
                if (((Boolean) objM86755t).booleanValue()) {
                    fej0Var.f68777a = null;
                    fej0Var.f68778b = null;
                    fej0Var.f68779c = uaj0Var2;
                    fej0Var.f68780d = i2;
                    fej0Var.f68783g = 3;
                    if (dii0Var.m36092G((maj0) uaj0Var2, aej0Var instanceof wdj0, fej0Var) != yukVar) {
                        if (((maj0) uaj0Var2).m61311a()) {
                            fej0Var.f68777a = null;
                            fej0Var.f68778b = null;
                            fej0Var.f68779c = null;
                            fej0Var.f68780d = i2;
                            fej0Var.f68783g = 4;
                            objM89557A = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                            if (objM89557A != yukVar) {
                                objM89557A = w2a1Var;
                            }
                            if (objM89557A == yukVar) {
                            }
                        }
                    }
                    return yukVar;
                }
                return w2a1Var;
            case 3:
                i2 = fej0Var.f68780d;
                uaj0Var2 = fej0Var.f68779c;
                bga.m29073P(objM86755t);
                if (((maj0) uaj0Var2).m61311a()) {
                    fej0Var.f68777a = null;
                    fej0Var.f68778b = null;
                    fej0Var.f68779c = null;
                    fej0Var.f68780d = i2;
                    fej0Var.f68783g = 4;
                    objM89557A = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            case 4:
            case 7:
            case 8:
            case 9:
                bga.m29073P(objM86755t);
                return w2a1Var;
            case 5:
                i = fej0Var.f68780d;
                uaj0Var = fej0Var.f68779c;
                aej0Var = fej0Var.f68778b;
                bga.m29073P(objM86755t);
                if (((Boolean) objM86755t).booleanValue()) {
                    fej0Var.f68777a = null;
                    fej0Var.f68778b = null;
                    fej0Var.f68779c = uaj0Var;
                    fej0Var.f68780d = i;
                    fej0Var.f68783g = 6;
                    dii0Var.m36091F((kaj0) uaj0Var, aej0Var instanceof wdj0, fej0Var);
                    if (w2a1Var != yukVar) {
                        if (((kaj0) uaj0Var).m55907a()) {
                            fej0Var.f68777a = null;
                            fej0Var.f68778b = null;
                            fej0Var.f68779c = null;
                            fej0Var.f68780d = i;
                            fej0Var.f68783g = 7;
                            objM89557A2 = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                            if (objM89557A2 != yukVar) {
                                objM89557A2 = w2a1Var;
                            }
                            if (objM89557A2 == yukVar) {
                            }
                        }
                    }
                    return yukVar;
                }
                return w2a1Var;
            case 6:
                i = fej0Var.f68780d;
                uaj0Var = fej0Var.f68779c;
                bga.m29073P(objM86755t);
                if (((kaj0) uaj0Var).m55907a()) {
                    fej0Var.f68777a = null;
                    fej0Var.f68778b = null;
                    fej0Var.f68779c = null;
                    fej0Var.f68780d = i;
                    fej0Var.f68783g = 7;
                    objM89557A2 = x0h1.m89557A(lukVar, new gej0(this, fbkVar2, 1), fej0Var);
                    if (objM89557A2 != yukVar) {
                        objM89557A2 = w2a1Var;
                    }
                    if (objM89557A2 == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
