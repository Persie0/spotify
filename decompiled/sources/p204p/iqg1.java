package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.compose.p002ui.graphics.Shadow;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.io.File;
import java.util.Collections;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iqg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f104762a;

    /* JADX INFO: renamed from: b */
    public static sd40 f104763b;

    /* JADX INFO: renamed from: a */
    public static final void m51361a(s3l0 s3l0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(316113516);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(s3l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(s3l0Var == null);
            fyf fyfVarM75772x = rkk.m75772x(1173514957, new s8b1(s3l0Var, 20), xq00Var);
            int i4 = (i3 & ContentType.LONG_FORM_ON_DEMAND) | 24576;
            cxh0 cxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            zn91.m96541b(boolValueOf, cxh0Var, null, null, fyfVarM75772x, xq00Var2, i4, 12);
            fxh0Var = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rdb1(s3l0Var, fxh0Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m51362b(ibr ibrVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-407741209);
        int i2 = (xq00Var.m91770i(ibrVar) ? 4 : 2) | i | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            boolean zM91770i = xq00Var.m91770i(yqqVar);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == obj) {
                objM91750T = new C1707bj(yqqVar, 2);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(yqqVar);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == obj) {
                objM91750T2 = new C1707bj(yqqVar, 3);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var2 = (eh00) objM91750T2;
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T3 = xq00Var.m91750T();
            if (z || objM91750T3 == obj) {
                objM91750T3 = new ycq(22, gh00Var);
                xq00Var.m91793t0(objM91750T3);
            }
            y0v.m92603a(2, rkk.m75772x(434065627, new frp(qxg1.m74138v(new wf11(eh00Var, eh00Var2, (gh00) objM91750T3), null, xq00Var, 0, 2), ibrVar, gh00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new frp((Object) ibrVar, gh00Var, fxh0Var2, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m51363c(eh00 eh00Var, fxh0 fxh0Var, th00 th00Var, xq00 xq00Var, int i, int i2) {
        th00 th00Var2;
        boolean z;
        fxh0 fxh0Var2;
        th00 th00Var3;
        pgv0 pgv0VarM91796v;
        Object objM91750T;
        Object obj;
        aqz aqzVar;
        cxh0 cxh0Var;
        Object objM91750T2;
        m6d0 m6d0VarM36007d;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        eh00 eh00Var2;
        fbk fbkVar;
        boolean zM91770i;
        Object objM91750T3;
        xq00Var.m91775k0(1036652965);
        int i3 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                th00Var2 = th00Var;
                i4 |= xq00Var.m91770i(th00Var2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                if (i5 != 0) {
                    th00Var2 = tch.f219085a;
                }
                objM91750T = xq00Var.m91750T();
                obj = t6x0.f217647t;
                if (objM91750T == obj) {
                    objM91750T = ydj.m93452k(xq00Var);
                }
                aqzVar = (aqz) objM91750T;
                cxh0Var = cxh0.f43038a;
                fxh0 fxh0VarM69835p = pft0.m69835p(mi21.m61820d(1.0f, cxh0Var), aqzVar);
                objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    objM91750T2 = tfe.m80656n(xq00Var);
                }
                fxh0 fxh0VarM47245v = hdi.m47245v(fxh0VarM69835p, (voi0) objM91750T2, null, false, null, null, eh00Var, 28);
                m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47245v);
                soh.f211194A.getClass();
                eh00Var2 = roh.f201257b;
                fbkVar = null;
                if (xq00Var.f264811a != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var2);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                z0k0.m95074k((i4 >> 6) & 14, th00Var2, xq00Var, true);
                zM91770i = xq00Var.m91770i(aqzVar);
                objM91750T3 = xq00Var.m91750T();
                if (zM91770i || objM91750T3 == obj) {
                    objM91750T3 = new ht1(aqzVar, fbkVar, 10);
                    xq00Var.m91793t0(objM91750T3);
                }
                hz40.m49237i(w2a1.f247311a, (th00) objM91750T3, xq00Var);
                fxh0Var2 = cxh0Var;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
            }
            th00Var3 = th00Var2;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new a4j0(eh00Var, fxh0Var2, th00Var3, i, i2, 15);
            }
        }
        i4 = i3 | 432;
        th00Var2 = th00Var;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            if (i5 != 0) {
                th00Var2 = tch.f219085a;
            }
            objM91750T = xq00Var.m91750T();
            obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = ydj.m93452k(xq00Var);
            }
            aqzVar = (aqz) objM91750T;
            cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM69835p2 = pft0.m69835p(mi21.m61820d(1.0f, cxh0Var), aqzVar);
            objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = tfe.m80656n(xq00Var);
            }
            fxh0 fxh0VarM47245v2 = hdi.m47245v(fxh0VarM69835p2, (voi0) objM91750T2, null, false, null, null, eh00Var, 28);
            m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47245v2);
            soh.f211194A.getClass();
            eh00Var2 = roh.f201257b;
            fbkVar = null;
            if (xq00Var.f264811a != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            z0k0.m95074k((i4 >> 6) & 14, th00Var2, xq00Var, true);
            zM91770i = xq00Var.m91770i(aqzVar);
            objM91750T3 = xq00Var.m91750T();
            if (zM91770i) {
                objM91750T3 = new ht1(aqzVar, fbkVar, 10);
                xq00Var.m91793t0(objM91750T3);
            } else {
                objM91750T3 = new ht1(aqzVar, fbkVar, 10);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T3, xq00Var);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        th00Var3 = th00Var2;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a4j0(eh00Var, fxh0Var2, th00Var3, i, i2, 15);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m51364d(ibr ibrVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(606123778);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? xq00Var.m91766g(ibrVar) : xq00Var.m91770i(ibrVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            p4b1 p4b1Var = zfg1.f282319g;
            cxh0 cxh0Var = cxh0.f43038a;
            float f = 0;
            zn91.m96545d(mi21.m61842z(mi21.m61822f(1.0f, zfg1.m96028q(cxh0Var, p4b1Var)), null, 3), null, null, null, new j4m0(f, f, f, f), null, false, null, null, null, null, rkk.m75772x(1062269419, new jbr(ibrVar, gh00Var, 0), xq00Var), xq00Var, 0, 48, 2030);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gek((Object) ibrVar, gh00Var, fxh0Var2, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m51365e(int i, int i2, String str, String str2, wwu wwuVar, eh00 eh00Var, xq00 xq00Var, boolean z) {
        int i3;
        String str3;
        boolean z2;
        String str4;
        pgv0 pgv0VarM91796v;
        String str5;
        wju wjuVar;
        int i4;
        xq00Var.m91775k0(-51332375);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? xq00Var.m91766g(wwuVar) : xq00Var.m91770i(wwuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= xq00Var.m91766g(str3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (xq00Var.m91770i(eh00Var)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                fxh0 fxh0VarM39673I = epv0.m39673I("connectionItem", mi21.m61822f(1.0f, cxh0.f43038a));
                if (z) {
                    wjuVar = vju.f242057e;
                } else {
                    wjuVar = tju.f221017e;
                }
                p711.m69222a(fxh0VarM39673I, new kyu(0, wjuVar, 3, null, zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 2), null, null, 0, null, 489), null, false, null, null, new peu(u40.f226523c, eh00Var), null, rkk.m75772x(1668627871, new c60(wwuVar, 2), xq00Var), null, null, null, rkk.m75772x(337812514, new C1919h2(str5, eh00Var, 1), xq00Var), null, null, rkk.m75772x(1886036517, new dug(str, 15), xq00Var), xq00Var, 100663360, 196992, 28348);
                str4 = str5;
            } else {
                xq00Var.m91757b0();
                str4 = str3;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new kbr(z, wwuVar, str, str4, eh00Var, i, i2);
            }
        }
        i3 |= 3072;
        str3 = str2;
        if ((i & 24576) == 0) {
            if (xq00Var.m91770i(eh00Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z2)) {
            if (i5 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            fxh0 fxh0VarM39673I2 = epv0.m39673I("connectionItem", mi21.m61822f(1.0f, cxh0.f43038a));
            if (z) {
                wjuVar = vju.f242057e;
            } else {
                wjuVar = tju.f221017e;
            }
            p711.m69222a(fxh0VarM39673I2, new kyu(0, wjuVar, 3, null, zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 2), null, null, 0, null, 489), null, false, null, null, new peu(u40.f226523c, eh00Var), null, rkk.m75772x(1668627871, new c60(wwuVar, 2), xq00Var), null, null, null, rkk.m75772x(337812514, new C1919h2(str5, eh00Var, 1), xq00Var), null, null, rkk.m75772x(1886036517, new dug(str, 15), xq00Var), xq00Var, 100663360, 196992, 28348);
            str4 = str5;
        } else {
            xq00Var.m91757b0();
            str4 = str3;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kbr(z, wwuVar, str, str4, eh00Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m51366f(int i, String str, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(1911422066);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            ahf1.m25932d(str, epv0.m39673I("messageTitle", zsf1.m96831B(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224766i, leu.m58816b(xq00Var).f117230b.f224758a, leu.m58816b(xq00Var).f117230b.f224766i, leu.m58816b(xq00Var).f117230b.f224762e)), leu.m58818d(xq00Var).f64969e, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2024);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hd0(str, i, 8);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m51367g(float f, s3l0 s3l0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        int i3;
        xq00 xq00Var2;
        xq00Var.m91775k0(2026599593);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(s3l0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        int i4 = i2;
        if (xq00Var.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            leu.m58817c(xq00Var).f235364c.getClass();
            rv41 rv41VarM79506b = sw4.m79506b(f, jg31.m53286y(tw41.m81639m(120, 2, 30.0f), 120.0f, null, 4), "download-progress", null, xq00Var, (i4 & 14) | 3072, 20);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            float f2 = leu.m58816b(xq00Var).f117230b.f224762e;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, AbstractC0000a.m17p(cxh0Var, f2, xq00Var, xq00Var).f117230b.f224763f, 0.0f, 2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96830A);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            ol80 ol80Var = new ol80(1);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            i3 = i;
            ahf1.m25932d("Downloading", new cr70(1.0f, true), if71Var, 0L, null, null, 2, false, ol80Var, 0, null, xq00Var, 6, 0, 1720);
            riw0.m75615i(xq00Var, mi21.m61838v(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
            m51361a(s3l0Var, null, xq00Var, (i4 >> 3) & 14);
            xq00Var.m91788r(true);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var));
            ja61.m52782d(((Number) rv41VarM79506b.getValue()).floatValue(), 0, 12, 0L, 0L, xq00Var, zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2));
            xq00Var2 = xq00Var;
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224762e, cxh0Var));
            ysj0.m94486a(0, 1, xq00Var2, null);
            AbstractC0000a.m22u(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224762e, xq00Var2, true);
        } else {
            i3 = i;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gml(f, s3l0Var, fxh0Var, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final LayerDrawable m51368h(Context context, Drawable drawable) {
        Drawable drawable2 = context.getDrawable(R.drawable.encore_selected_icon_indicator_dot);
        wj50.m88279p(drawable2);
        drawable2.setTintList(lzj.m60387w(context, R.color.encore_accessory_green));
        int intrinsicWidth = (drawable.getIntrinsicWidth() - drawable2.getIntrinsicWidth()) / 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_action_button_default_dot_indicator_top_margin) + drawable.getIntrinsicHeight();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerGravity(0, 16);
        layerDrawable.setLayerInset(1, intrinsicWidth, dimensionPixelSize, intrinsicWidth, 0);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static o6k m51369i() {
        return new o6k(null);
    }

    /* JADX INFO: renamed from: j */
    public static o6k m51370j(Object[] objArr, Object obj) {
        return new o6k(s601.m77309l0(Collections.singleton(obj), bk5.m29624m1(objArr)));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m51371l(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m51371l(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public static void m51372m(Context context, tpn0 tpn0Var) {
        if (m51371l(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            tpn0Var.mo49038a(14, null);
        } else {
            tpn0Var.mo49038a(15, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final j510 m51373n(h510 h510Var) {
        return new j510(h510Var);
    }

    /* JADX INFO: renamed from: p */
    public static int m51374p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: q */
    public static final tc41 m51375q(int i, Context context, vc41 vc41Var) {
        return m51376r(context, vc41Var, i, context.getResources().getDimensionPixelSize(R.dimen.encore_action_button_icon_size_small));
    }

    /* JADX INFO: renamed from: r */
    public static final tc41 m51376r(Context context, vc41 vc41Var, int i, int i2) {
        tc41 tc41Var = new tc41(context, vc41Var, i2);
        tc41Var.m80418c(lzj.m60387w(context, i));
        return tc41Var;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [p.h510, p.xlq] */
    /* JADX INFO: renamed from: s */
    public static final h510 m51377s(xlq xlqVar) {
        ce91 ce91VarM85737s = vj50.m85737s(xlqVar, j510.f108836N0);
        j510 j510Var = ce91VarM85737s instanceof j510 ? (j510) ce91VarM85737s : null;
        if (j510Var != null) {
            return j510Var.f108837M0;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final Shadow m51378t(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(wj50.m88249I(shadow.f499c, shadow2.f499c, f), rfg1.m75456z(f, shadow.f497a, shadow2.f497a), c95.m31817I(f, shadow.f498b, shadow2.f498b));
    }

    /* JADX INFO: renamed from: u */
    public static final erh m51379u(rio rioVar, rio rioVar2) {
        boolean z = rioVar instanceof erh;
        if (z && (rioVar2 instanceof erh)) {
            return new erh(g6f.m43700N0(((erh) rioVar2).f62134a, ((erh) rioVar).f62134a));
        }
        if (z) {
            return new erh(g6f.m43701O0(rioVar2.mo24859a(), ((erh) rioVar).f62134a));
        }
        return rioVar2 instanceof erh ? new erh(g6f.m43700N0(((erh) rioVar2).f62134a, Collections.singletonList(rioVar.mo24859a()))) : new erh(rioVar.mo24859a(), rioVar2.mo24859a());
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo51380k();

    /* JADX INFO: renamed from: o */
    public abstract int mo25807o();
}
