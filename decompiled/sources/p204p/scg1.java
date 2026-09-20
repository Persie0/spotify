package p204p;

import android.content.Context;
import android.text.Annotation;
import android.text.Spanned;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class scg1 {

    /* JADX INFO: renamed from: b */
    public static final x8x f207740b = new x8x(2);

    /* JADX INFO: renamed from: c */
    public static sd40 f207741c;

    /* JADX INFO: renamed from: d */
    public static sd40 f207742d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207743a;

    public /* synthetic */ scg1(int i) {
        this.f207743a = i;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m77767A(yk4 yk4Var) {
        return yk4Var.m93960b();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m77768B(iv3 iv3Var) {
        return iv3Var.m51722l();
    }

    /* JADX INFO: renamed from: C */
    public static boolean m77769C(iv3 iv3Var) {
        return iv3Var.m51723m();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m77770D(iv3 iv3Var) {
        return iv3Var.m51726p();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m77771E(iv3 iv3Var) {
        return iv3Var.m51728r();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m77772F(iv3 iv3Var) {
        return iv3Var.m51730t();
    }

    /* JADX INFO: renamed from: G */
    public static boolean m77773G(iv3 iv3Var) {
        return iv3Var.m51731u();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m77774H(iv3 iv3Var) {
        return iv3Var.m51732v();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m77775I(iv3 iv3Var) {
        return iv3Var.m51733w();
    }

    /* JADX INFO: renamed from: J */
    public static final long m77776J(tiv0 tiv0Var) {
        float f = tiv0Var.f220753c - tiv0Var.f220751a;
        return (((long) Float.floatToRawIntBits(tiv0Var.f220754d - tiv0Var.f220752b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: K */
    public static final int m77777K(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 1;
        }
        if (iM38547C == 1) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: L */
    public static final cph m77778L(e940 e940Var, n1k n1kVar, ofo0 ofo0Var) {
        fyf fyfVar = new fyf(new ki0(e940Var, n1kVar, ofo0Var, 7), true, 2001137657);
        wpi0 wpi0Var = xwt.f266743a;
        return new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m77779a(z7b0 z7b0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1246405655);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(z7b0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            y0v.m92603a(2, rkk.m75772x(-1689495133, new ca70(z7b0Var, gh00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fya0(z7b0Var, gh00Var, fxh0Var2, i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m77780b(int i, fyf fyfVar, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        xq00 xq00Var2;
        boolean z2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1382444799);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            bpu bpuVar = bpu.f29605c;
            boolean z3 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == t6x0.f217647t) {
                objM91750T = new rzt0(29, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            wc61 wc61Var = new wc61(3, (eh00) objM91750T, bpuVar);
            cxh0 cxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            z2 = z;
            ufc1.m82963a(mi21.m61822f(1.0f, cxh0Var), null, wc61Var, z2, rkk.m75772x(-450497621, new lh70(fyfVar, 23), xq00Var), xq00Var2, 24576 | ((i2 << 9) & 7168), 2);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            z2 = z;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eb50(z2, eh00Var, fxh0Var2, fyfVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0392  */
    /* JADX WARN: Code duplicated, block: B:107:0x0396  */
    /* JADX WARN: Code duplicated, block: B:110:0x039f  */
    /* JADX WARN: Code duplicated, block: B:112:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:116:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:131:0x042f  */
    /* JADX INFO: renamed from: c */
    public static final void m77781c(qwt qwtVar, v000 v000Var, gh00 gh00Var, wfx wfxVar, xq00 xq00Var, int i) {
        int i2;
        wfx wfxVar2;
        ia7 ia7Var;
        vb9 vb9Var;
        boolean z;
        cxh0 cxh0Var;
        ia7 ia7Var2;
        Object obj;
        boolean z2;
        Object objM91750T;
        sgu sguVar;
        fxh0 fxh0VarM39673I;
        String str;
        boolean z3;
        Object objM91750T2;
        eh00 eh00Var;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var3 = t6x0.f217647t;
        xq00Var2.m91775k0(283879519);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? xq00Var2.m91766g(v000Var) : xq00Var2.m91770i(v000Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? xq00Var2.m91766g(wfxVar) : xq00Var2.m91770i(wfxVar) ? 2048 : 1024;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1169) != 1168)) {
            qly0 qly0VarM68467i0 = oyf1.m68467i0(0, 0, 1, xq00Var2);
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var2);
            ui5 ui5Var = bj5.f27613d;
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(ui5Var, ub9Var, xq00Var2, 6);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61820d);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            boolean z4 = v000Var.f235871e;
            int i3 = i2;
            qf40 qf40Var = v000Var.f235870d;
            a100 a100Var = v000Var.f235869c;
            if (z4) {
                xq00Var2.m91771i0(-889433901);
                o2z0.m66145b(qf40Var, mi21.m61824h(120, mi21.m61822f(1.0f, cxh0Var2)), xq00Var2, 48);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-889341459);
                xq00Var2.m91788r(false);
            }
            fxh0 fxh0VarM61842z = mi21.m61842z(mi21.m61822f(1.0f, zsf1.m96832C(nec.m64246i(cxh0Var2, ((n6f) qf40Var.get(1)).f150873a, kxf1.f127485a), 0.0f, 20, 0.0f, 0.0f, 13)), null, 3);
            zhi0 zhi0Var = bj5.f27612c;
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM61842z);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            if (!(((double) 1.0f) > 0.0d)) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(new cr70(1.0f, false), qly0VarM68467i0, false, 14);
            aaf aafVarM87496a3 = w9f.m87496a(zhi0Var, ub9Var, xq00Var2, 0);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM68493v0);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a3, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var2);
            String str2 = a100Var.f11218a;
            String str3 = a100Var.f11224g;
            if (str2.length() > 0) {
                xq00Var2.m91771i0(-1517734335);
                vb9Var = null;
                fxh0 fxh0VarM61814B = mi21.m61814B(zsf1.m96832C(cxh0Var2, 0.0f, 0.0f, 0.0f, 16, 7), null, 3);
                irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(4), d7f0.f46142M0, xq00Var2, 54);
                int iHashCode4 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m4 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var2, fxh0VarM61814B);
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var2);
                AbstractC0000a.m20s(iHashCode4, xq00Var2, yhhVar3, xq00Var2, vlhVar);
                zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var2);
                if (a100Var.f11219b != null) {
                    xq00Var2.m91771i0(364845440);
                    wwu wwuVar = a100Var.f11219b;
                    fxh0 fxh0VarM61834r = mi21.m61834r(17, epv0.m39673I("ICON", cxh0Var2));
                    long j = a100Var.f11222e;
                    cxh0Var = cxh0Var2;
                    z = false;
                    y85.m93057b(wwuVar, qgj.f188480a, fxh0VarM61834r, j, 0L, false, xq00Var2, 56, 48);
                    xq00Var2.m91788r(false);
                } else {
                    cxh0Var = cxh0Var2;
                    z = false;
                    xq00Var2.m91771i0(365107266);
                    xq00Var2.m91788r(false);
                }
                fxh0 fxh0VarM61842z2 = mi21.m61842z(epv0.m39673I("TAG", cxh0Var), vb9Var, 3);
                Object objM91750T3 = xq00Var2.m91750T();
                if (objM91750T3 == ia7Var3) {
                    objM91750T3 = ttz.f223721b1;
                    xq00Var2.m91793t0(objM91750T3);
                }
                ia7Var = ia7Var3;
                ahf1.m25932d(a100Var.f11218a, zoz0.m96644b(fxh0VarM61842z2, z, (gh00) objM91750T3), leu.m58818d(xq00Var2).f64975k, a100Var.f11222e, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(z);
            } else {
                i3 = i3;
                ia7Var = ia7Var3;
                vb9Var = null;
                z = false;
                cxh0Var = cxh0Var2;
                xq00Var2.m91771i0(-1516842527);
                xq00Var2.m91788r(false);
            }
            if (a100Var.f11220c.length() > 0 ? true : z) {
                xq00Var2.m91771i0(-1516776838);
                ahf1.m25932d(a100Var.f11220c, zsf1.m96832C(mi21.m61842z(epv0.m39673I("TITLE", cxh0Var), vb9Var, 3), 0.0f, 0.0f, 0.0f, 8, 7), leu.m58818d(xq00Var2).f64967c, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(z);
            } else {
                xq00Var2.m91771i0(-1516544927);
                xq00Var2.m91788r(z);
            }
            if (a100Var.f11221d.length() > 0 ? true : z) {
                xq00Var2.m91771i0(-1516472511);
                ahf1.m25932d(a100Var.f11221d, mi21.m61842z(epv0.m39673I("DESCRIPTION", cxh0Var), vb9Var, 3), leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(z);
            } else {
                xq00Var2.m91771i0(-1516216575);
                xq00Var2.m91788r(z);
            }
            xq00Var2.m91788r(true);
            z000 z000Var = a100Var.f11223f;
            long j2 = leu.m58815a(xq00Var2).f112823a.f229876c;
            if (z000Var != null) {
                xq00Var2.m91771i0(-576507077);
                riw0.m75615i(xq00Var2, mi21.m61834r(24, cxh0Var));
                boolean zM91764f = xq00Var2.m91764f(j2);
                Object objM91750T4 = xq00Var2.m91750T();
                if (zM91764f) {
                    ia7Var2 = ia7Var;
                } else {
                    ia7Var2 = ia7Var;
                    if (objM91750T4 == ia7Var2) {
                    }
                    th00 th00Var = (th00) objM91750T4;
                    if ((i3 & ContentType.LONG_FORM_ON_DEMAND) != 32) {
                        if ((i3 & 64) != 0) {
                            obj = v000Var;
                            if (xq00Var2.m91770i(obj)) {
                            }
                            objM91750T = xq00Var2.m91750T();
                            if (z2 || objM91750T == ia7Var2) {
                                objM91750T = new myy(obj, 11);
                                xq00Var2.m91793t0(objM91750T);
                            }
                            sguVar = new sgu(0, th00Var, (th00) objM91750T, null, null, 25);
                            fxh0VarM39673I = epv0.m39673I("BUTTON", cxh0Var);
                            str = z000Var.f277931a;
                            if ((i3 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            objM91750T2 = xq00Var2.m91750T();
                            if (z3 || objM91750T2 == ia7Var2) {
                                objM91750T2 = new yyy(26, gh00Var);
                                xq00Var2.m91793t0(objM91750T2);
                            }
                            eh00Var = (eh00) objM91750T2;
                            if (!wl51.m88460J0(str)) {
                                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            }
                            dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM39673I, null, vvx.m86516q(xq00Var2), null, null, null, null, null, rkk.m75772x(431512997, new myy(z000Var, 12), xq00Var2), xq00Var, 0, 48, 2008);
                            xq00Var2 = xq00Var;
                            xq00Var2.m91788r(z);
                        } else {
                            obj = v000Var;
                        }
                        z2 = z;
                        objM91750T = xq00Var2.m91750T();
                        if (z2) {
                            objM91750T = new myy(obj, 11);
                            xq00Var2.m91793t0(objM91750T);
                        } else {
                            objM91750T = new myy(obj, 11);
                            xq00Var2.m91793t0(objM91750T);
                        }
                        sguVar = new sgu(0, th00Var, (th00) objM91750T, null, null, 25);
                        fxh0VarM39673I = epv0.m39673I("BUTTON", cxh0Var);
                        str = z000Var.f277931a;
                        if ((i3 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        objM91750T2 = xq00Var2.m91750T();
                        if (z3) {
                            objM91750T2 = new yyy(26, gh00Var);
                            xq00Var2.m91793t0(objM91750T2);
                        } else {
                            objM91750T2 = new yyy(26, gh00Var);
                            xq00Var2.m91793t0(objM91750T2);
                        }
                        eh00Var = (eh00) objM91750T2;
                        if (!wl51.m88460J0(str)) {
                            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        }
                        dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM39673I, null, vvx.m86516q(xq00Var2), null, null, null, null, null, rkk.m75772x(431512997, new myy(z000Var, 12), xq00Var2), xq00Var, 0, 48, 2008);
                        xq00Var2 = xq00Var;
                        xq00Var2.m91788r(z);
                    } else {
                        obj = v000Var;
                    }
                    z2 = true;
                    objM91750T = xq00Var2.m91750T();
                    if (z2) {
                        objM91750T = new myy(obj, 11);
                        xq00Var2.m91793t0(objM91750T);
                    } else {
                        objM91750T = new myy(obj, 11);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    sguVar = new sgu(0, th00Var, (th00) objM91750T, null, null, 25);
                    fxh0VarM39673I = epv0.m39673I("BUTTON", cxh0Var);
                    str = z000Var.f277931a;
                    if ((i3 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    objM91750T2 = xq00Var2.m91750T();
                    if (z3) {
                        objM91750T2 = new yyy(26, gh00Var);
                        xq00Var2.m91793t0(objM91750T2);
                    } else {
                        objM91750T2 = new yyy(26, gh00Var);
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    eh00Var = (eh00) objM91750T2;
                    if (!wl51.m88460J0(str)) {
                        throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                    dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM39673I, null, vvx.m86516q(xq00Var2), null, null, null, null, null, rkk.m75772x(431512997, new myy(z000Var, 12), xq00Var2), xq00Var, 0, 48, 2008);
                    xq00Var2 = xq00Var;
                    xq00Var2.m91788r(z);
                }
                objM91750T4 = new uqf(j2, 16, (byte) 0);
                xq00Var2.m91793t0(objM91750T4);
                th00 th00Var2 = (th00) objM91750T4;
                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) != 32) {
                    if ((i3 & 64) != 0) {
                        obj = v000Var;
                        if (xq00Var2.m91770i(obj)) {
                        }
                        objM91750T = xq00Var2.m91750T();
                        if (z2) {
                            objM91750T = new myy(obj, 11);
                            xq00Var2.m91793t0(objM91750T);
                        } else {
                            objM91750T = new myy(obj, 11);
                            xq00Var2.m91793t0(objM91750T);
                        }
                        sguVar = new sgu(0, th00Var2, (th00) objM91750T, null, null, 25);
                        fxh0VarM39673I = epv0.m39673I("BUTTON", cxh0Var);
                        str = z000Var.f277931a;
                        if ((i3 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        objM91750T2 = xq00Var2.m91750T();
                        if (z3) {
                            objM91750T2 = new yyy(26, gh00Var);
                            xq00Var2.m91793t0(objM91750T2);
                        } else {
                            objM91750T2 = new yyy(26, gh00Var);
                            xq00Var2.m91793t0(objM91750T2);
                        }
                        eh00Var = (eh00) objM91750T2;
                        if (!wl51.m88460J0(str)) {
                            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        }
                        dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM39673I, null, vvx.m86516q(xq00Var2), null, null, null, null, null, rkk.m75772x(431512997, new myy(z000Var, 12), xq00Var2), xq00Var, 0, 48, 2008);
                        xq00Var2 = xq00Var;
                        xq00Var2.m91788r(z);
                    } else {
                        obj = v000Var;
                    }
                    z2 = z;
                    objM91750T = xq00Var2.m91750T();
                    if (z2) {
                        objM91750T = new myy(obj, 11);
                        xq00Var2.m91793t0(objM91750T);
                    } else {
                        objM91750T = new myy(obj, 11);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    sguVar = new sgu(0, th00Var2, (th00) objM91750T, null, null, 25);
                    fxh0VarM39673I = epv0.m39673I("BUTTON", cxh0Var);
                    str = z000Var.f277931a;
                    if ((i3 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    objM91750T2 = xq00Var2.m91750T();
                    if (z3) {
                        objM91750T2 = new yyy(26, gh00Var);
                        xq00Var2.m91793t0(objM91750T2);
                    } else {
                        objM91750T2 = new yyy(26, gh00Var);
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    eh00Var = (eh00) objM91750T2;
                    if (!wl51.m88460J0(str)) {
                        throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                    dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM39673I, null, vvx.m86516q(xq00Var2), null, null, null, null, null, rkk.m75772x(431512997, new myy(z000Var, 12), xq00Var2), xq00Var, 0, 48, 2008);
                    xq00Var2 = xq00Var;
                    xq00Var2.m91788r(z);
                } else {
                    obj = v000Var;
                }
                z2 = true;
                objM91750T = xq00Var2.m91750T();
                if (z2) {
                    objM91750T = new myy(obj, 11);
                    xq00Var2.m91793t0(objM91750T);
                } else {
                    objM91750T = new myy(obj, 11);
                    xq00Var2.m91793t0(objM91750T);
                }
                sguVar = new sgu(0, th00Var2, (th00) objM91750T, null, null, 25);
                fxh0VarM39673I = epv0.m39673I("BUTTON", cxh0Var);
                str = z000Var.f277931a;
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                objM91750T2 = xq00Var2.m91750T();
                if (z3) {
                    objM91750T2 = new yyy(26, gh00Var);
                    xq00Var2.m91793t0(objM91750T2);
                } else {
                    objM91750T2 = new yyy(26, gh00Var);
                    xq00Var2.m91793t0(objM91750T2);
                }
                eh00Var = (eh00) objM91750T2;
                if (!wl51.m88460J0(str)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM39673I, null, vvx.m86516q(xq00Var2), null, null, null, null, null, rkk.m75772x(431512997, new myy(z000Var, 12), xq00Var2), xq00Var, 0, 48, 2008);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(z);
            } else {
                ia7Var2 = ia7Var;
                xq00Var2.m91771i0(-575988137);
                xq00Var2.m91788r(z);
            }
            if (str3.length() > 0 ? true : z) {
                xq00Var2.m91771i0(-575928772);
                Object objM91750T5 = xq00Var2.m91750T();
                if (objM91750T5 == ia7Var2) {
                    wfxVar2 = wfxVar;
                    objM91750T5 = new d100((v0y) wfxVar2.f250920b);
                    xq00Var2.m91793t0(objM91750T5);
                } else {
                    wfxVar2 = wfxVar;
                }
                mif1.m61869b((d100) objM91750T5, new c100(v000Var.f235867a, v000Var.f235868b, str3), null, null, xq00Var2, 0, 12);
                xq00Var2.m91788r(z);
            } else {
                wfxVar2 = wfxVar;
                xq00Var2.m91771i0(-575626057);
                xq00Var2.m91788r(z);
            }
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            wfxVar2 = wfxVar;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new chr(qwtVar, v000Var, gh00Var, wfxVar2, i, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x027a  */
    /* JADX INFO: renamed from: d */
    public static final void m77782d(al91 al91Var, gh00 gh00Var, xq00 xq00Var, int i) {
        boolean z;
        gh00 gh00Var2;
        Spanned spanned;
        boolean z2;
        Object objM91750T;
        gh00Var = gh00Var;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1961242109);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = (i & 6) == 0 ? i | (xq00Var2.m91762e(al91Var.ordinal()) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            float f = leu.m58816b(xq00Var2).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var2).f117235g.f159604b;
            float f3 = leu.m58816b(xq00Var2).f117230b.f224760c;
            vb9 vb9Var = d7f0.f46142M0;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, zsf1.m96832C(cxh0Var, f, 0.0f, f, 0.0f, 10));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            y85.m93057b(dru.f52389c, qgj.f188480a, mi21.m61834r(f2, cxh0Var), 0L, 0L, false, xq00Var2, dru.f52390d | 48, 56);
            riw0.m75615i(xq00Var2, mi21.m61838v(f3, cxh0Var));
            int i4 = al91Var.f16820a;
            int i5 = al91Var.f16821b;
            String strM54977L = k0e1.m54977L(i4, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64974j;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            xq00Var2 = xq00Var;
            ahf1.m25932d(strM54977L, null, if71Var, j, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            xq00Var2.m91788r(true);
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, f + f2 + f3, leu.m58816b(xq00Var2).f117230b.f224758a, f, 0.0f, 8);
            if71 if71Var2 = leu.m58818d(xq00Var2).f64974j;
            long j2 = leu.m58815a(xq00Var2).f112824b.f138758b;
            wy41 wy41Var = AndroidCompositionLocals_androidKt.f502b;
            CharSequence text = ((Context) xq00Var2.m91774k(wy41Var)).getResources().getText(i5);
            if (text instanceof Spanned) {
                boolean z3 = false;
                if (((Spanned) text).getSpans(0, text.length(), Annotation.class).length == 0) {
                    z = false;
                } else {
                    xq00Var2.m91771i0(341464726);
                    Spanned spanned2 = (Spanned) ((Context) xq00Var2.m91774k(wy41Var)).getResources().getText(i5);
                    int i6 = i3 << 3;
                    g15 g15Var = new g15(spanned2.toString());
                    xq00Var2.m91771i0(-1188476179);
                    Object[] spans = spanned2.getSpans(0, spanned2.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : spans) {
                        if (wj50.m88271j(((Annotation) obj).getKey(), "link")) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Annotation annotation = (Annotation) it.next();
                        int spanStart = spanned2.getSpanStart(annotation);
                        int spanEnd = spanned2.getSpanEnd(annotation);
                        g15Var.m43327c(spanStart, "link", spanEnd, annotation.getValue());
                        String value = annotation.getValue();
                        boolean zM91770i = xq00Var2.m91770i(annotation);
                        Iterator it2 = it;
                        if (((i6 & 896) ^ 384) > 256) {
                            gh00Var2 = gh00Var;
                            if (xq00Var2.m91766g(gh00Var2)) {
                                spanned = spanned2;
                            }
                            z2 = z | zM91770i | ((((i6 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var2.m91762e(al91Var.ordinal())) || (i6 & 48) == 32);
                            objM91750T = xq00Var2.m91750T();
                            if (z2 || objM91750T == t6x0.f217647t) {
                                objM91750T = new tr2(annotation, gh00Var2, al91Var);
                                xq00Var2.m91793t0(objM91750T);
                            }
                            g15Var.m43325a(new wl80(value, null, (gm80) objM91750T), spanStart, spanEnd);
                            g15Var.m43328d(new ew31(leu.m58815a(xq00Var2).f112824b.f138759c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), spanStart, spanEnd);
                            i6 = i6;
                            it = it2;
                            spanned2 = spanned;
                            z3 = false;
                        } else {
                            gh00Var2 = gh00Var;
                        }
                        spanned = spanned2;
                        boolean z4 = (i6 & 384) == 256;
                        z2 = z4 | zM91770i | ((((i6 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 && xq00Var2.m91762e(al91Var.ordinal())) || (i6 & 48) == 32);
                        objM91750T = xq00Var2.m91750T();
                        if (z2) {
                            objM91750T = new tr2(annotation, gh00Var2, al91Var);
                            xq00Var2.m91793t0(objM91750T);
                        } else {
                            objM91750T = new tr2(annotation, gh00Var2, al91Var);
                            xq00Var2.m91793t0(objM91750T);
                        }
                        g15Var.m43325a(new wl80(value, null, (gm80) objM91750T), spanStart, spanEnd);
                        g15Var.m43328d(new ew31(leu.m58815a(xq00Var2).f112824b.f138759c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), spanStart, spanEnd);
                        i6 = i6;
                        it = it2;
                        spanned2 = spanned;
                        z3 = false;
                    }
                    boolean z5 = z3;
                    xq00Var2.m91788r(z5);
                    ahf1.m25933e(g15Var.m43339o(), fxh0VarM96832C, if71Var2, j2, null, null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4080);
                    xq00Var2 = xq00Var;
                    xq00Var2.m91788r(z5);
                }
                xq00Var2.m91788r(true);
            } else {
                z = false;
            }
            xq00Var2.m91771i0(341821939);
            ahf1.m25932d(k0e1.m54977L(i5, xq00Var2), fxh0VarM96832C, if71Var2, j2, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            xq00Var2.m91788r(z);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rla0(al91Var, gh00Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m77783e(tvi0 tvi0Var) {
        return tvi0Var.f224172a.length() == 0;
    }

    /* JADX INFO: renamed from: f */
    public static final String m77784f(gkk gkkVar, xq00 xq00Var) {
        int i;
        int iOrdinal = gkkVar.ordinal();
        if (iOrdinal == 0) {
            i = R.string.contributor_sheet_relationship_collaborator;
        } else if (iOrdinal == 1) {
            i = R.string.contributor_sheet_relationship_band_member;
        } else if (iOrdinal == 2) {
            i = R.string.contributor_sheet_relationship_member_of;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.contributor_sheet_relationship_alias;
        }
        return k0e1.m54977L(i, xq00Var);
    }

    /* JADX INFO: renamed from: g */
    public static final void m77785g(wqb wqbVar, ncg1 ncg1Var, lk4 lk4Var) {
        if (ncg1Var instanceof lyl0) {
            tiv0 tiv0Var = ((lyl0) ncg1Var).f138074d;
            wqbVar.mo25274c(tiv0Var.f220751a, tiv0Var.f220752b, tiv0Var.f220753c, tiv0Var.f220754d, lk4Var);
            return;
        }
        if (!(ncg1Var instanceof myl0)) {
            if (!(ncg1Var instanceof kyl0)) {
                throw new NoWhenBranchMatchedException();
            }
            wqbVar.mo25291t(((kyl0) ncg1Var).f127886d, lk4Var);
            return;
        }
        myl0 myl0Var = (myl0) ncg1Var;
        zlx0 zlx0Var = myl0Var.f148481d;
        long j = zlx0Var.f284102h;
        uk4 uk4Var = myl0Var.f148482e;
        if (uk4Var != null) {
            wqbVar.mo25291t(uk4Var, lk4Var);
        } else {
            wqbVar.mo25282k(zlx0Var.f284095a, zlx0Var.f284096b, zlx0Var.f284097c, zlx0Var.f284098d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), lk4Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m77786h(tgj tgjVar, ncg1 ncg1Var, Brush brush, float f, int i, int i2) {
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        int i3 = (i2 & 32) != 0 ? 3 : i;
        boolean z = ncg1Var instanceof lyl0;
        qxy qxyVar = qxy.f193763a;
        if (z) {
            tiv0 tiv0Var = ((lyl0) ncg1Var).f138074d;
            float f3 = tiv0Var.f220751a;
            tgjVar.mo283C0(brush, (((long) Float.floatToRawIntBits(tiv0Var.f220752b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), m77776J(tiv0Var), f2, qxyVar, null, i3);
            return;
        }
        if (!(ncg1Var instanceof myl0)) {
            if (!(ncg1Var instanceof kyl0)) {
                throw new NoWhenBranchMatchedException();
            }
            tgjVar.mo298q0(((kyl0) ncg1Var).f127886d, brush, f2, qxyVar, i3);
            return;
        }
        myl0 myl0Var = (myl0) ncg1Var;
        uk4 uk4Var = myl0Var.f148482e;
        if (uk4Var != null) {
            tgjVar.mo298q0(uk4Var, brush, f2, qxyVar, i3);
            return;
        }
        zlx0 zlx0Var = myl0Var.f148481d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (zlx0Var.f284102h >> 32));
        float f4 = zlx0Var.f284095a;
        float f5 = f2;
        tgjVar.mo297p0(brush, (((long) Float.floatToRawIntBits(zlx0Var.f284096b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(zlx0Var.m96393b())) << 32) | (((long) Float.floatToRawIntBits(zlx0Var.m96392a())) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f5, qxyVar, i3);
    }

    /* JADX INFO: renamed from: i */
    public static final void m77787i(DrawScope drawScope, ncg1 ncg1Var, long j, DrawStyle drawStyle, int i) {
        if (ncg1Var instanceof lyl0) {
            tiv0 tiv0Var = ((lyl0) ncg1Var).f138074d;
            drawScope.mo284F0(j, (((long) Float.floatToRawIntBits(tiv0Var.f220751a)) << 32) | (((long) Float.floatToRawIntBits(tiv0Var.f220752b)) & 4294967295L), m77776J(tiv0Var), 1.0f, drawStyle, null, i);
            return;
        }
        if (!(ncg1Var instanceof myl0)) {
            if (!(ncg1Var instanceof kyl0)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo287K0(((kyl0) ncg1Var).f127886d, j, drawStyle, i);
            return;
        }
        myl0 myl0Var = (myl0) ncg1Var;
        uk4 uk4Var = myl0Var.f148482e;
        if (uk4Var != null) {
            drawScope.mo287K0(uk4Var, j, drawStyle, i);
            return;
        }
        zlx0 zlx0Var = myl0Var.f148481d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (zlx0Var.f284102h >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(zlx0Var.f284095a)) << 32) | (((long) Float.floatToRawIntBits(zlx0Var.f284096b)) & 4294967295L);
        float fM96393b = zlx0Var.m96393b();
        drawScope.mo286J(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(zlx0Var.m96392a())) & 4294967295L) | (Float.floatToRawIntBits(fM96393b) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), drawStyle, 1.0f, i);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m77788j(DrawScope drawScope, ncg1 ncg1Var, long j, em51 em51Var, int i) {
        DrawStyle drawStyle = em51Var;
        if ((i & 8) != 0) {
            drawStyle = qxy.f193763a;
        }
        m77787i(drawScope, ncg1Var, j, drawStyle, 3);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m77789k(iv3 iv3Var) {
        return iv3Var.m51711a();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m77790l(iv3 iv3Var) {
        return iv3Var.m51712b();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m77791m(iv3 iv3Var) {
        return iv3Var.m51713c();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m77792n(iv3 iv3Var) {
        return iv3Var.m51714d();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m77793o(iv3 iv3Var) {
        return iv3Var.m51716f();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m77794p(iv3 iv3Var) {
        return iv3Var.m51717g();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m77795q(w04 w04Var) {
        return w04Var.m86918a();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m77796r(iv3 iv3Var) {
        return iv3Var.m51718h();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m77797s(iv3 iv3Var) {
        return iv3Var.m51719i();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m77798t(iv3 iv3Var) {
        return iv3Var.m51720j();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m77799u(iv3 iv3Var) {
        return iv3Var.m51721k();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m77800v(iv3 iv3Var) {
        return iv3Var.m51734x();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m77801w(iv3 iv3Var) {
        return iv3Var.m51735y();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m77802x(iv3 iv3Var) {
        return iv3Var.m51736z();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m77803y(iv3 iv3Var) {
        return iv3Var.m51710A();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m77804z(iv3 iv3Var) {
        return iv3Var.m51724n();
    }

    public String toString() {
        switch (this.f207743a) {
            case 8:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }
}
