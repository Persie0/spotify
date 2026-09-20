package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ksh0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f125956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f125957c;

    public /* synthetic */ ksh0(int i, Object obj, Object obj2) {
        this.f125955a = i;
        this.f125956b = obj;
        this.f125957c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x055d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x055f A[LOOP:2: B:186:0x0528->B:196:0x055f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0567 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        sb71 sb71VarMo88504b;
        sb71 sb71VarMo88504b2;
        sb71 sb71VarMo88504b3;
        db71 db71Var;
        uk4 uk4VarM35540k;
        switch (this.f125955a) {
            case 0:
                String str = (String) this.f125956b;
                eh00 eh00Var = (eh00) this.f125957c;
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m53986D(mpz0Var, 1.0f);
                jpz0.m54000n(mpz0Var, str);
                jpz0.m53993g(mpz0Var, null, new mfq(3, eh00Var));
                return w2a1.f247311a;
            case 1:
                wf11 wf11Var = (wf11) this.f125956b;
                gw4 gw4Var = (gw4) this.f125957c;
                fdx0 fdx0Var = (fdx0) obj;
                float fM84031v = ((uum0) wf11Var.f250668e.f286295X).m84031v();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fdx0Var.f68596P0 & 4294967295L));
                if (!Float.isNaN(fM84031v) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) gw4Var.m45912e()).floatValue();
                    fdx0Var.m41390m(rsh0.m76344d(fdx0Var, fFloatValue));
                    fdx0Var.m41391o(rsh0.m76345e(fdx0Var, fFloatValue));
                    fdx0Var.m41395u(b9m.m28515o(0.5f, (fM84031v + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return w2a1.f247311a;
            case 2:
                ((z8i0) this.f125956b).m95606F1(obj, (bqz0) this.f125957c);
                return w2a1.f247311a;
            case 3:
                Set set = (Set) this.f125956b;
                z8i0 z8i0Var = (z8i0) this.f125957c;
                if (set.contains(obj)) {
                    cqi0 cqi0Var = z8i0Var.f280484c;
                    dqi0 dqi0Var = z8i0Var.f280486e;
                    Object objM33623g = cqi0Var.m33623g(obj);
                    if (objM33623g != null) {
                        if (objM33623g instanceof dqi0) {
                            dqi0 dqi0Var2 = (dqi0) objM33623g;
                            Object[] objArr = dqi0Var2.f52019b;
                            long[] jArr = dqi0Var2.f52018a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        for (int i3 = 0; i3 < i2; i3++) {
                                            if ((255 & j) < 128) {
                                                dqi0Var.m36642a((bqz0) objArr[(i << 3) + i3]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i2 == 8) {
                                            if (i != length) {
                                                i++;
                                            }
                                        }
                                    } else if (i != length) {
                                        i++;
                                    }
                                }
                            }
                        } else {
                            dqi0Var.m36642a((bqz0) objM33623g);
                        }
                    }
                }
                return w2a1.f247311a;
            case 4:
                h4l0 h4l0Var = (h4l0) this.f125956b;
                t5o0 t5o0Var = (t5o0) this.f125957c;
                s5o0 s5o0Var = (s5o0) obj;
                if (h4l0Var.f87561O0) {
                    s5o0Var.m77294i(t5o0Var, s5o0Var.mo35990l0(h4l0Var.f87559M0), s5o0Var.mo35990l0(h4l0Var.f87560N0), 0.0f);
                } else {
                    s5o0Var.m77293f(t5o0Var, s5o0Var.mo35990l0(h4l0Var.f87559M0), s5o0Var.mo35990l0(h4l0Var.f87560N0), 0.0f);
                }
                return w2a1.f247311a;
            case 5:
                k4l0 k4l0Var = (k4l0) this.f125956b;
                t5o0 t5o0Var2 = (t5o0) this.f125957c;
                s5o0 s5o0Var2 = (s5o0) obj;
                long j2 = ((y350) k4l0Var.f119246M0.invoke(s5o0Var2)).f268755a;
                if (k4l0Var.f119247N0) {
                    s5o0.m77288l(s5o0Var2, t5o0Var2, (int) (j2 >> 32), (int) (4294967295L & j2), null, 12);
                } else {
                    s5o0.m77291r(s5o0Var2, t5o0Var2, (int) (j2 >> 32), (int) (4294967295L & j2), null, 12);
                }
                return w2a1.f247311a;
            case 6:
                c4m0 c4m0Var = (c4m0) this.f125956b;
                t5o0 t5o0Var3 = (t5o0) this.f125957c;
                s5o0 s5o0Var3 = (s5o0) obj;
                if (c4m0Var.f33974Q0) {
                    s5o0Var3.m77294i(t5o0Var3, s5o0Var3.mo35990l0(c4m0Var.f33970M0), s5o0Var3.mo35990l0(c4m0Var.f33971N0), 0.0f);
                } else {
                    s5o0Var3.m77293f(t5o0Var3, s5o0Var3.mo35990l0(c4m0Var.f33970M0), s5o0Var3.mo35990l0(c4m0Var.f33971N0), 0.0f);
                }
                return w2a1.f247311a;
            case 7:
                ((th00) this.f125956b).invoke(Integer.valueOf(((qhq0) obj).f188823a), Integer.valueOf(((dii0) this.f125957c).m36114s().f135460b));
                return w2a1.f247311a;
            case 8:
                kqi0 kqi0Var = (kqi0) this.f125956b;
                s5o0 s5o0Var4 = (s5o0) obj;
                m15 m15Var = new m15(1, (ArrayList) this.f125957c);
                s5o0Var4.f205868a = true;
                m15Var.invoke(s5o0Var4);
                s5o0Var4.f205868a = false;
                kqi0Var.getValue();
                return w2a1.f247311a;
            case 9:
                rv41 rv41Var = (rv41) this.f125956b;
                rv41 rv41Var2 = (rv41) this.f125957c;
                DrawScope drawScope = (DrawScope) obj;
                float fMo35989Z0 = drawScope.mo35989Z0(q3u0.f184966c);
                float f = 2;
                float f2 = fMo35989Z0 / f;
                DrawScope.m275e0(drawScope, ((n6f) rv41Var.getValue()).f150873a, drawScope.mo35989Z0(r3u0.f195575a / f) - f2, 0L, 0.0f, new em51(fMo35989Z0, 0.0f, 0, 0, null, 30), 108);
                if (ybs.m93300a(((ybs) rv41Var2.getValue()).f271238a, 0) > 0) {
                    DrawScope.m275e0(drawScope, ((n6f) rv41Var.getValue()).f150873a, drawScope.mo35989Z0(((ybs) rv41Var2.getValue()).f271238a) - f2, 0L, 0.0f, qxy.f193763a, 108);
                }
                return w2a1.f247311a;
            case 10:
                msh mshVar = (msh) this.f125956b;
                dqi0 dqi0Var3 = (dqi0) this.f125957c;
                mshVar.m62769z(obj);
                if (dqi0Var3 != null) {
                    dqi0Var3.m36642a(obj);
                }
                return w2a1.f247311a;
            case 11:
                wgv0 wgv0Var = (wgv0) this.f125956b;
                Throwable th = (Throwable) this.f125957c;
                Throwable th2 = (Throwable) obj;
                synchronized (wgv0Var.f251168d) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                y85.m93061f(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    wgv0Var.f251170f = th;
                    zv41 zv41Var = wgv0Var.f251186v;
                    tgv0 tgv0Var = tgv0.f220266a;
                    zv41Var.getClass();
                    zv41Var.m97091m(null, tgv0Var);
                }
                return w2a1.f247311a;
            case 12:
                ((vqi0) this.f125956b).f243954a.setValue(new jgx((tvd1) this.f125957c, (tvd1) obj));
                return w2a1.f247311a;
            case 13:
                ((uqi0) this.f125956b).f233060a.setValue(new jgx((fez) this.f125957c, (tvd1) obj));
                return w2a1.f247311a;
            case 14:
                mny0 mny0Var = (mny0) this.f125956b;
                nny0 nny0Var = (nny0) this.f125957c;
                ucs ucsVar = (ucs) obj;
                float f3 = ucsVar.f229100b ? -1.0f : 1.0f;
                long j3 = ucsVar.f229099a;
                mny0Var.m62372a(1, Offset.m258h(nny0Var.f156522d == vvl0.f245249b ? Offset.m251a(0.0f, 1, j3) : Offset.m251a(0.0f, 2, j3), f3));
                return w2a1.f247311a;
            case 15:
                ((s5o0) obj).m77293f((t5o0) this.f125956b, 0, 0, ((Number) ((rv41) this.f125957c).getValue()).floatValue());
                return w2a1.f247311a;
            case 16:
                rv41 rv41Var3 = (rv41) this.f125956b;
                kqi0 kqi0Var2 = (kqi0) this.f125957c;
                Size size = (Size) obj;
                float fFloatValue2 = ((Number) rv41Var3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size.f494a >> 32)) * fFloatValue2;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (size.f494a & 4294967295L)) * fFloatValue2;
                if (Float.intBitsToFloat((int) (((Size) kqi0Var2.getValue()).f494a >> 32)) != fIntBitsToFloat2 || Float.intBitsToFloat((int) (((Size) kqi0Var2.getValue()).f494a & 4294967295L)) != fIntBitsToFloat3) {
                    kqi0Var2.setValue(new Size((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L)));
                }
                return w2a1.f247311a;
            case 17:
                l3b l3bVar = (l3b) obj;
                return l3bVar.m57995a(new ksh0(18, ((ch01) this.f125956b).mo29107a(l3bVar.f129254a.mo39635n(), l3bVar.f129254a.getLayoutDirection(), l3bVar), (fz30) this.f125957c));
            case 18:
                scg1.m77788j((DrawScope) obj, (ncg1) this.f125956b, ((fz30) this.f125957c).mo43136a(), null, 60);
                return w2a1.f247311a;
            case 19:
                return new qlt0(9, (kqi0) this.f125956b, (voi0) this.f125957c);
            case 20:
                eh00 eh00Var2 = (eh00) this.f125957c;
                eh00 eh00Var3 = (eh00) this.f125956b;
                c571 c571Var = (c571) obj;
                eh00Var2.invoke();
                if (eh00Var3 != null ? ((Boolean) eh00Var3.invoke()).booleanValue() : true) {
                    c571Var.close();
                }
                return w2a1.f247311a;
            case 21:
                i15 i15Var = (i15) this.f125956b;
                vum0 vum0Var = ((dn80) this.f125957c).f50705b;
                o171 o171Var = (o171) obj;
                yl80 yl80Var = (yl80) i15Var.f97388a;
                sb71 sb71VarMo88504b4 = yl80Var.mo88504b();
                ew31 ew31VarM40131d = null;
                ew31 ew31Var = sb71VarMo88504b4 != null ? sb71VarMo88504b4.f207373a : null;
                ew31 ew31VarM40131d2 = ((vum0Var.m86437v() & 1) == 0 || (sb71VarMo88504b3 = yl80Var.mo88504b()) == null) ? null : sb71VarMo88504b3.f207374b;
                if (ew31Var != null) {
                    ew31VarM40131d2 = ew31Var.m40131d(ew31VarM40131d2);
                }
                ew31 ew31VarM40131d3 = ((vum0Var.m86437v() & 2) == 0 || (sb71VarMo88504b2 = yl80Var.mo88504b()) == null) ? null : sb71VarMo88504b2.f207375c;
                if (ew31VarM40131d2 != null) {
                    ew31VarM40131d3 = ew31VarM40131d2.m40131d(ew31VarM40131d3);
                }
                if ((vum0Var.m86437v() & 4) != 0 && (sb71VarMo88504b = yl80Var.mo88504b()) != null) {
                    ew31VarM40131d = sb71VarMo88504b.f207376d;
                }
                if (ew31VarM40131d3 != null) {
                    ew31VarM40131d = ew31VarM40131d3.m40131d(ew31VarM40131d);
                }
                nlv0 nlv0Var = new nlv0();
                j15 j15Var = o171Var.f160638a;
                C2611yf c2611yf = new C2611yf(nlv0Var, i15Var, ew31VarM40131d, 20);
                j15Var.getClass();
                g15 g15Var = new g15(j15Var);
                g15Var.m43333i(c2611yf);
                o171Var.f160639b = g15Var.m43339o();
                return w2a1.f247311a;
            case 22:
                rb71 rb71Var = (rb71) this.f125956b;
                i15 i15Var2 = (i15) this.f125957c;
                fdx0 fdx0Var2 = (fdx0) obj;
                j15 j15Var2 = rb71Var.f197521b;
                yum0 yum0Var = rb71Var.f197520a;
                db71 db71Var2 = (db71) yum0Var.getValue();
                if (wj50.m88271j(j15Var2, db71Var2 != null ? db71Var2.f47230a.f36033a : null) && (db71Var = (db71) yum0Var.getValue()) != null) {
                    z6i0 z6i0Var = db71Var.f47231b;
                    i15 i15VarM75165c = rb71.m75165c(i15Var2, db71Var);
                    if (i15VarM75165c == null) {
                        uk4VarM35540k = null;
                    } else {
                        int i4 = i15VarM75165c.f97390c;
                        int i5 = i15VarM75165c.f97389b;
                        uk4VarM35540k = db71Var.m35540k(i5, i4);
                        tiv0 tiv0VarM35531b = db71Var.m35531b(i5);
                        int i6 = i4 - 1;
                        uk4VarM35540k.m83311p(((((long) Float.floatToRawIntBits(tiv0VarM35531b.f220752b)) & 4294967295L) | (((long) Float.floatToRawIntBits(z6i0Var.m95497d(i5) == z6i0Var.m95497d(i6) ? Math.min(db71Var.m35531b(i6).f220751a, tiv0VarM35531b.f220751a) : 0.0f)) << 32)) ^ (-9223372034707292160L));
                    }
                } else {
                    uk4VarM35540k = null;
                }
                qb71 qb71Var = uk4VarM35540k != null ? new qb71(uk4VarM35540k) : null;
                if (qb71Var != null) {
                    fdx0Var2.m41393r(qb71Var);
                    fdx0Var2.m41384f(true);
                }
                return w2a1.f247311a;
            case 23:
                List list = (List) this.f125956b;
                List list2 = (List) this.f125957c;
                s5o0 s5o0Var5 = (s5o0) obj;
                if (list != null) {
                    int size2 = list.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        pqm0 pqm0Var = (pqm0) list.get(i7);
                        s5o0.m77286h(s5o0Var5, (t5o0) pqm0Var.f180350a, ((y350) pqm0Var.f180351b).f268755a);
                    }
                }
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        pqm0 pqm0Var2 = (pqm0) list2.get(i8);
                        t5o0 t5o0Var4 = (t5o0) pqm0Var2.f180350a;
                        eh00 eh00Var4 = (eh00) pqm0Var2.f180351b;
                        s5o0.m77286h(s5o0Var5, t5o0Var4, eh00Var4 != null ? ((y350) eh00Var4.invoke()).f268755a : 0L);
                    }
                }
                return w2a1.f247311a;
            case 24:
                x0h1.m89578u((xuk) this.f125956b, null, 4, new ey4((c791) this.f125957c, null), 1);
                return new nm4(12);
            case 25:
                c791 c791Var = (c791) this.f125956b;
                c791 c791Var2 = (c791) this.f125957c;
                c791Var.f34836j.add(c791Var2);
                return new qlt0(12, c791Var, c791Var2);
            case 26:
                return new qlt0(13, (c791) this.f125956b, (q691) this.f125957c);
            case 27:
                c791 c791Var3 = (c791) this.f125956b;
                w691 w691Var = (w691) this.f125957c;
                c791Var3.f34835i.add(w691Var);
                return new qlt0(14, c791Var3, w691Var);
            case 28:
                Object obj2 = this.f125956b;
                xuk xukVar = (xuk) this.f125957c;
                eh00 eh00Var5 = (eh00) obj;
                if (obj2 == Thread.currentThread()) {
                    eh00Var5.invoke();
                } else {
                    x0h1.m89578u(xukVar, null, 0, new uo5(eh00Var5, null, 15), 3);
                }
                return w2a1.f247311a;
            default:
                AbstractC1806e9 abstractC1806e9 = (AbstractC1806e9) this.f125956b;
                ((jez0) abstractC1806e9).m53143P1(new mb31(new ksh0(28, Thread.currentThread(), (xuk) this.f125957c)));
                return new mgq0(abstractC1806e9, 14);
        }
    }

    public /* synthetic */ ksh0(Object obj, Object obj2, Object obj3, int i) {
        this.f125955a = i;
        this.f125956b = obj2;
        this.f125957c = obj3;
    }

    public /* synthetic */ ksh0(eh00 eh00Var, eh00 eh00Var2) {
        this.f125955a = 20;
        this.f125957c = eh00Var;
        this.f125956b = eh00Var2;
    }
}
