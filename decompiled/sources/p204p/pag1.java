package p204p;

import android.content.ClipData;
import android.os.StrictMode;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.comscore.streaming.ContentType;
import com.spotify.trending.p166v1.TnyLocationSuggestion;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import p000.C1398e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pag1 {

    /* JADX INFO: renamed from: a */
    public static final t36 f175528a = new t36(27);

    /* JADX INFO: renamed from: b */
    public static final Object f175529b = new Object();

    /* JADX INFO: renamed from: c */
    public static sd40 f175530c;

    /* JADX INFO: renamed from: d */
    public static sd40 f175531d;

    /* JADX INFO: renamed from: A */
    public static final qfa0 m69462A(TnyLocationSuggestion tnyLocationSuggestion) {
        String strM21852q = tnyLocationSuggestion.m21852q();
        wj50.m88279p(strM21852q);
        if (strM21852q.length() == 0 || bm51.m29807r0(strM21852q) != null) {
            strM21852q = null;
        }
        if (strM21852q == null) {
            String strM21850o = tnyLocationSuggestion.m21850o();
            strM21852q = strM21850o.length() != 0 ? strM21850o : null;
        }
        return new qfa0(Integer.valueOf(tnyLocationSuggestion.m21851p()), tnyLocationSuggestion.m21849n(), strM21852q);
    }

    /* JADX INFO: renamed from: B */
    public static void m69463B(Runnable runnable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            runnable.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final y6s0 m69464C(y6s0 y6s0Var, Long l) {
        if (l != null) {
            if (l.longValue() <= 0) {
                l = null;
            }
            if (l != null) {
                long jLongValue = l.longValue();
                if (y6s0Var == null) {
                    return new x6s0(false, jLongValue);
                }
                if (y6s0Var instanceof x6s0) {
                    x6s0 x6s0Var = (x6s0) y6s0Var;
                    return x6s0Var.f258746b > 0 ? x6s0Var : new x6s0(x6s0Var.f258745a, jLongValue);
                }
                if (!(y6s0Var instanceof w6s0)) {
                    throw new NoWhenBranchMatchedException();
                }
                w6s0 w6s0Var = (w6s0) y6s0Var;
                if (w6s0Var.f248465b > 0) {
                    return w6s0Var;
                }
                return new w6s0(jLongValue, w6s0Var.f248466c, w6s0Var.f248464a);
            }
        }
        return y6s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX INFO: renamed from: a */
    public static final void m69465a(qyy0 qyy0Var, lwf lwfVar, o07 o07Var, eh00 eh00Var, xq00 xq00Var, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z;
        boolean z2;
        Object obj2;
        pgv0 pgv0VarM91796v;
        fbk fbkVar;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objM91750T;
        boolean z7;
        int i6;
        boolean z8;
        Object objM91750T2;
        qyy0 qyy0Var2 = qyy0Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1405282170);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? xq00Var.m91766g(qyy0Var2) : xq00Var.m91770i(qyy0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? xq00Var.m91766g(lwfVar) : xq00Var.m91770i(lwfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? xq00Var.m91766g(o07Var) : xq00Var.m91770i(o07Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                obj = eh00Var;
                i3 |= xq00Var.m91770i(obj) ? 2048 : 1024;
            }
            i4 = i3;
            z = false;
            if ((i4 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z2)) {
                fbkVar = null;
                if (i7 != 0) {
                    obj = null;
                }
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i5 = i4 & 14;
                if (i5 != 4 || ((i4 & 8) != 0 && xq00Var.m91770i(qyy0Var2))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = z3 | z4;
                if ((i4 & 896) != 256 || ((i4 & 512) != 0 && xq00Var.m91770i(o07Var))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z9 | z5;
                objM91750T = xq00Var.m91750T();
                if (z6 || objM91750T == ia7Var) {
                    f81 f81Var = new f81(obj, qyy0Var2, o07Var, fbkVar, 15);
                    qyy0Var2 = qyy0Var2;
                    xq00Var.m91793t0(f81Var);
                    objM91750T = f81Var;
                }
                hz40.m49235g(o07Var, qyy0Var2, obj, (th00) objM91750T, xq00Var);
                tt60 tt60Var = new tt60(o07Var, qyy0Var2);
                if (i5 != 4 || ((i4 & 8) != 0 && xq00Var.m91770i(qyy0Var2))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i6 = i4 & ContentType.LONG_FORM_ON_DEMAND;
                if (i6 != 32 || ((i4 & 64) != 0 && xq00Var.m91770i(lwfVar))) {
                    z = true;
                }
                z8 = z7 | z;
                objM91750T2 = xq00Var.m91750T();
                if (z8 || objM91750T2 == ia7Var) {
                    objM91750T2 = new ys5(13, qyy0Var2, lwfVar);
                    xq00Var.m91793t0(objM91750T2);
                }
                gbm.m44243e(tt60Var, lwfVar, (gh00) objM91750T2, xq00Var, 64 | i6);
            } else {
                xq00Var.m91757b0();
            }
            obj2 = obj;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new gj0(qyy0Var2, lwfVar, o07Var, obj2, i, i2, 7);
            }
        }
        i3 |= 3072;
        obj = eh00Var;
        i4 = i3;
        z = false;
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z2)) {
            fbkVar = null;
            if (i7 != 0) {
                obj = null;
            }
            if ((i4 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            i5 = i4 & 14;
            if (i5 != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            boolean z10 = z3 | z4;
            if ((i4 & 896) != 256) {
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = z10 | z5;
            objM91750T = xq00Var.m91750T();
            if (z6) {
                f81 f81Var2 = new f81(obj, qyy0Var2, o07Var, fbkVar, 15);
                qyy0Var2 = qyy0Var2;
                xq00Var.m91793t0(f81Var2);
                objM91750T = f81Var2;
            } else {
                f81 f81Var3 = new f81(obj, qyy0Var2, o07Var, fbkVar, 15);
                qyy0Var2 = qyy0Var2;
                xq00Var.m91793t0(f81Var3);
                objM91750T = f81Var3;
            }
            hz40.m49235g(o07Var, qyy0Var2, obj, (th00) objM91750T, xq00Var);
            tt60 tt60Var2 = new tt60(o07Var, qyy0Var2);
            if (i5 != 4) {
                z7 = true;
            } else {
                z7 = true;
            }
            i6 = i4 & ContentType.LONG_FORM_ON_DEMAND;
            if (i6 != 32) {
                z = true;
            } else {
                z = true;
            }
            z8 = z7 | z;
            objM91750T2 = xq00Var.m91750T();
            if (z8) {
                objM91750T2 = new ys5(13, qyy0Var2, lwfVar);
                xq00Var.m91793t0(objM91750T2);
            } else {
                objM91750T2 = new ys5(13, qyy0Var2, lwfVar);
                xq00Var.m91793t0(objM91750T2);
            }
            gbm.m44243e(tt60Var2, lwfVar, (gh00) objM91750T2, xq00Var, 64 | i6);
        } else {
            xq00Var.m91757b0();
        }
        obj2 = obj;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gj0(qyy0Var2, lwfVar, o07Var, obj2, i, i2, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m69466b(int i, String str, String str2, String str3, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00 xq00Var2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-256229284);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(str3) ? 256 : 128) | (xq00Var.m91770i(gh00Var) ? 2048 : 1024) | 24576;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mwg1.m63030j(1, leu.m58815a(xq00Var).f112825c.f221218a, mi21.m61840x(mi21.m61826j(cxh0Var, 32, 0.0f, 2), 71, 0.0f, 2), hmx0.m47993b(46)), 16, 0.0f, 2);
            boolean z = (i2 & 896) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new lpx(str3, 19);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM96830A, false, (gh00) objM91750T);
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new myc(gh00Var, str, 6);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM96644b, false, null, null, null, (eh00) objM91750T2, 15);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47247x);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fxh0Var2 = cxh0Var;
            ahf1.m25932d(str2, null, if71.m50418a(leu.m58818d(xq00Var).f64969e, 0L, epv0.m39702v(13), null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777213), leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, (i2 >> 3) & 14, 0, 2018);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new w5k(str, str2, str3, gh00Var, fxh0Var2, i, 17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m69467c(om01 om01Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1514156603);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(om01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var, 54);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            mhf1.m61766j(mi21.m61816D(mi21.m61824h(leu.m58816b(xq00Var).f117235g.f159604b, fxh0Var2), null, 3), 0L, xq00Var, 0, 2);
            drg1.m36720h(om01Var, null, xq00Var, i3 & 14);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new x0b0(om01Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m69468d(int i, xq00 xq00Var) {
        xq00Var.m91775k0(896685100);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            xq00Var.m91771i0(-1574043369);
            wy41 wy41Var = wsh.f254617h;
            float fMo26962D = ((yqq) xq00Var.m91774k(wy41Var)).mo26962D(leu.m58818d(xq00Var).f64971g.f101704a.f63411b);
            xq00Var.m91788r(false);
            xq00Var.m91771i0(-1574040202);
            float fMo26962D2 = ((yqq) xq00Var.m91774k(wy41Var)).mo26962D(leu.m58818d(xq00Var).f64974j.f101704a.f63411b);
            xq00Var.m91788r(false);
            p711.m69222a(mi21.m61822f(1.0f, cxh0.f43038a), new kyu(0, null, 0, null, null, null, null, 2, null, 383), null, false, null, null, null, null, null, qvg.f193012a, null, rkk.m75772x(-202471068, new l86(fMo26962D2, 11), xq00Var), null, null, null, rkk.m75772x(-1604276632, new l86(fMo26962D, 12), xq00Var), xq00Var, 805306432, 196656, 30204);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pn40(i, 27);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m69469e(fxh0 fxh0Var, th00 th00Var, xq00 xq00Var, int i, int i2) {
        int i3;
        xq00Var.m91775k0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(th00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                fxh0Var = cxh0.f43038a;
            }
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = new yr51(maz.f141724O0);
                xq00Var.m91793t0(objM91750T);
            }
            m69470f((yr51) objM91750T, fxh0Var, th00Var, xq00Var, (i3 << 3) & 1008);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a80(fxh0Var, th00Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m69470f(yr51 yr51Var, fxh0 fxh0Var, th00 th00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-511989831);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(yr51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(th00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            vq00 vq00VarM70361t = pmg1.m70361t(xq00Var);
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            C2087le c2087le = C2087le.f132392V0;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(yr51Var, yr51Var.f275404c, xq00Var);
            zsf1.m96835F(vq00VarM70361t, yr51Var.f275405d, xq00Var);
            zsf1.m96835F(th00Var, yr51Var.f275406e, xq00Var);
            soh.f211194A.getClass();
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            xq00Var.m91788r(true);
            if (xq00Var.m91738H()) {
                xq00Var.m91771i0(-1259187287);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1259245908);
                boolean zM91770i = xq00Var.m91770i(yr51Var);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    objM91750T = new i941(yr51Var, 27);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49245q((eh00) objM91750T, xq00Var);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lz11((Object) yr51Var, fxh0Var, (ai00) th00Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m69471g(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!m69488x(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m69488x(b3) && !m69488x(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.m419a();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m69472h(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: i */
    public static void m69473i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m69474j(byte b) {
        return b < -32;
    }

    /* JADX INFO: renamed from: k */
    public static void m69475k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b < -62 || m69488x(b2)) {
            throw InvalidProtocolBufferException.m419a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m69476l(byte b) {
        return b < -16;
    }

    /* JADX INFO: renamed from: m */
    public static void m69477m(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (m69488x(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m69488x(b3)))) {
            throw InvalidProtocolBufferException.m419a();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: n */
    public static final void m69478n(float f, float f2, float f3, xq00 xq00Var, int i, int i2) {
        int i3;
        float f4;
        float f5;
        xq00Var.m91775k0(-323157430);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f4 = f3;
                int i4 = xq00Var.m91760d(f4) ? 256 : 128;
                i3 |= i4;
            } else {
                f4 = f3;
            }
            i3 |= i4;
        } else {
            f4 = f3;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                if ((i2 & 4) != 0) {
                    f5 = 0;
                }
                xq00Var.m91790s();
                dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f5, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
                f4 = f5;
            } else {
                xq00Var.m91757b0();
                int i5 = i2 & 4;
            }
            f5 = f4;
            xq00Var.m91790s();
            dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f5, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
            f4 = f5;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tsx(f, f2, f4, i, i2, 3);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final tjo m69479o(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4, rko rkoVar5, rko rkoVar6, rko rkoVar7, rko rkoVar8, rko rkoVar9, rko rkoVar10, rko rkoVar11, hh00 hh00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8, rkoVar9, rkoVar10, rkoVar11), new bko(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8, rkoVar9, rkoVar10, rkoVar11, hh00Var));
    }

    /* JADX INFO: renamed from: p */
    public static final tjo m69480p(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4, rko rkoVar5, rko rkoVar6, rko rkoVar7, rko rkoVar8, rko rkoVar9, rko rkoVar10, fh00 fh00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8, rkoVar9, rkoVar10), new ako(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8, rkoVar9, rkoVar10, fh00Var));
    }

    /* JADX INFO: renamed from: q */
    public static final tjo m69481q(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4, rko rkoVar5, rko rkoVar6, rko rkoVar7, rko rkoVar8, di00 di00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8), new fw5(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8, di00Var));
    }

    /* JADX INFO: renamed from: r */
    public static final tjo m69482r(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4, rko rkoVar5, rko rkoVar6, bi00 bi00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6), new C1726c2(bi00Var, rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, 7));
    }

    /* JADX INFO: renamed from: s */
    public static final tjo m69483s(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4, rko rkoVar5, zh00 zh00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5), new ro5(zh00Var, rkoVar, rkoVar2, rkoVar3, rkoVar4, rkoVar5, 4));
    }

    /* JADX INFO: renamed from: t */
    public static final tjo m69484t(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4, xh00 xh00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3, rkoVar4), new rg0(xh00Var, rkoVar, rkoVar2, rkoVar3, rkoVar4, 15));
    }

    /* JADX INFO: renamed from: u */
    public static final tjo m69485u(rko rkoVar, rko rkoVar2, rko rkoVar3, vh00 vh00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2, rkoVar3), new pek(vh00Var, rkoVar, rkoVar2, rkoVar3, 6));
    }

    /* JADX INFO: renamed from: v */
    public static final tjo m69486v(rko rkoVar, rko rkoVar2, th00 th00Var) {
        return new tjo(h6f.m46715L(rkoVar, rkoVar2), new oqe(th00Var, rkoVar, rkoVar2, 22));
    }

    /* JADX INFO: renamed from: w */
    public static final tjo m69487w(rko rkoVar, gh00 gh00Var) {
        return new tjo(Collections.singletonList(rkoVar), new C1398e(6, gh00Var, rkoVar));
    }

    /* JADX INFO: renamed from: x */
    public static boolean m69488x(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: y */
    public static final String m69489y(gne gneVar) {
        CharSequence text;
        ClipData.Item itemAt = gneVar.f82697a.getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    /* JADX INFO: renamed from: z */
    public static final p204p.gne m69490z(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
