package p204p;

import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.music.R;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wag1 {

    /* JADX INFO: renamed from: a */
    public static final q5s0 f249525a = new q5s0(29);

    /* JADX INFO: renamed from: b */
    public static sd40 f249526b;

    /* JADX INFO: renamed from: c */
    public static sd40 f249527c;

    /* JADX INFO: renamed from: a */
    public static final void m87598a(long j, x37 x37Var, b37 b37Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1922111490);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91764f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91762e(x37Var == null ? -1 : x37Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(b37Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            hc80 hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            Object[] objArr = {Long.valueOf(j), x37Var, gh00Var, hc80Var};
            boolean zM91770i = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | xq00Var.m91770i(b37Var) | xq00Var.m91770i(hc80Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                d37 d37Var = new d37(x37Var, gh00Var, j, b37Var, hc80Var, null, 0);
                xq00Var.m91793t0(d37Var);
                objM91750T = d37Var;
            }
            hz40.m49238j(objArr, (th00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e37(j, x37Var, b37Var, gh00Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x0133 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: b */
    public static final void m87599b(qf40 qf40Var, fxh0 fxh0Var, jb3 jb3Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        jb3 jb3Var2;
        pgv0 pgv0VarM91796v;
        d1b0 d1b0Var;
        fxh0 fxh0Var3;
        jb3 jb3Var3;
        float f;
        e940 e940Var;
        boolean zM91770i;
        Object objM91750T;
        fbk fbkVar;
        kqi0 kqi0VarM77648E;
        jb3 jb3Var4;
        wb9 wb9Var;
        xq00Var.m91775k0(-1575952119);
        int i4 = i | (xq00Var.m91766g(qf40Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        }
        int i6 = i3 | (((i2 & 4) == 0 && xq00Var.m91770i(jb3Var)) ? 256 : 128);
        if (xq00Var.m91752Y(i6 & 1, (i6 & 147) != 146)) {
            xq00Var.m91761d0();
            int i7 = i & 1;
            cxh0 cxh0Var = cxh0.f43038a;
            if (i7 == 0 || xq00Var.m91735E()) {
                fxh0Var3 = i5 != 0 ? cxh0Var : fxh0Var;
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    jb3Var3 = d7f0.f46144O0;
                }
                xq00Var.m91790s();
                f = 24;
                e940Var = (e940) xq00Var.m91774k(vm6.f242710a);
                zM91770i = xq00Var.m91770i(e940Var) | ((i6 & 14) == 4);
                objM91750T = xq00Var.m91750T();
                fbkVar = null;
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    objM91750T = new q0a0(qf40Var, e940Var, fbkVar, 6);
                    xq00Var.m91793t0(objM91750T);
                }
                kqi0VarM77648E = sam.m77648E(null, qf40Var, (th00) objM91750T, xq00Var, ((i6 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                if (((List) kqi0VarM77648E.getValue()) == null) {
                    xq00Var.m91771i0(-901133125);
                    riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
                    xq00Var.m91788r(false);
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        return;
                    } else {
                        d1b0Var = new d1b0(qf40Var, fxh0Var3, jb3Var3, i, i2, 0);
                    }
                } else {
                    jb3Var4 = jb3Var3;
                    fxh0 fxh0Var4 = fxh0Var3;
                    xq00Var.m91771i0(-901073543);
                    xq00Var.m91788r(false);
                    fxh0 fxh0VarM61824h = mi21.m61824h(f, fxh0Var4);
                    if (wj50.m88271j(jb3Var4, d7f0.f46145P0)) {
                        wb9Var = d7f0.f46174i;
                    } else if (wj50.m88271j(jb3Var4, d7f0.f46146Q0)) {
                        wb9Var = d7f0.f46184t;
                    } else {
                        wb9Var = d7f0.f46172h;
                    }
                    iyg1.m51914a(fxh0VarM61824h, wb9Var, rkk.m75772x(-1888837153, new uv20(f, jb3Var4, kqi0VarM77648E, 3), xq00Var), xq00Var, 3072, 4);
                    fxh0Var2 = fxh0Var4;
                    jb3Var2 = jb3Var4;
                }
                pgv0VarM91796v.f177419d = d1b0Var;
            }
            xq00Var.m91757b0();
            if ((i2 & 4) != 0) {
                i6 &= -897;
            }
            fxh0Var3 = fxh0Var;
            jb3Var3 = jb3Var;
            xq00Var.m91790s();
            f = 24;
            e940Var = (e940) xq00Var.m91774k(vm6.f242710a);
            zM91770i = xq00Var.m91770i(e940Var) | ((i6 & 14) == 4);
            objM91750T = xq00Var.m91750T();
            fbkVar = null;
            if (zM91770i) {
                objM91750T = new q0a0(qf40Var, e940Var, fbkVar, 6);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = new q0a0(qf40Var, e940Var, fbkVar, 6);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0VarM77648E = sam.m77648E(null, qf40Var, (th00) objM91750T, xq00Var, ((i6 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 6);
            if (((List) kqi0VarM77648E.getValue()) == null) {
                xq00Var.m91771i0(-901133125);
                riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
                xq00Var.m91788r(false);
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    return;
                } else {
                    d1b0Var = new d1b0(qf40Var, fxh0Var3, jb3Var3, i, i2, 0);
                }
            } else {
                jb3Var4 = jb3Var3;
                fxh0 fxh0Var5 = fxh0Var3;
                xq00Var.m91771i0(-901073543);
                xq00Var.m91788r(false);
                fxh0 fxh0VarM61824h2 = mi21.m61824h(f, fxh0Var5);
                if (wj50.m88271j(jb3Var4, d7f0.f46145P0)) {
                    wb9Var = d7f0.f46174i;
                } else if (wj50.m88271j(jb3Var4, d7f0.f46146Q0)) {
                    wb9Var = d7f0.f46184t;
                } else {
                    wb9Var = d7f0.f46172h;
                }
                iyg1.m51914a(fxh0VarM61824h2, wb9Var, rkk.m75772x(-1888837153, new uv20(f, jb3Var4, kqi0VarM77648E, 3), xq00Var), xq00Var, 3072, 4);
                fxh0Var2 = fxh0Var5;
                jb3Var2 = jb3Var4;
            }
            pgv0VarM91796v.f177419d = d1b0Var;
        }
        xq00Var.m91757b0();
        fxh0Var2 = fxh0Var;
        jb3Var2 = jb3Var;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            d1b0Var = new d1b0(qf40Var, fxh0Var2, jb3Var2, i, i2, 1);
            pgv0VarM91796v.f177419d = d1b0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87600c(String str, String str2, long j, eh00 eh00Var, fxh0 fxh0Var, boolean z, boolean z2, boolean z3, xq00 xq00Var, int i) {
        String str3;
        int i2;
        String str4;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1265226758);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (xq00Var.m91766g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= xq00Var.m91766g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= xq00Var.m91764f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            z4 = z;
            i3 |= xq00Var.m91768h(z4) ? 131072 : 65536;
        } else {
            z4 = z;
        }
        if ((1572864 & i) == 0) {
            z5 = z2;
            i3 |= xq00Var.m91768h(z5) ? 1048576 : 524288;
        } else {
            z5 = z2;
        }
        if ((12582912 & i) == 0) {
            z6 = z3;
            i3 |= xq00Var.m91768h(z6) ? 8388608 : 4194304;
        } else {
            z6 = z3;
        }
        if (xq00Var.m91752Y(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z7 = z6;
            y0v.m92603a(2, rkk.m75772x(-1015874170, new bul0(z7, z4, z5, eh00Var, (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f), str3, j2, str4), xq00Var), xq00Var, 390, 2);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cul0(str, str2, j, eh00Var, fxh0Var2, z, z2, z3, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m87601d(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1794614229);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            String strM54977L = k0e1.m54977L(R.string.clips_grid_keep_watching_title, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64968d;
            float f = 16;
            fxh0 fxh0VarM96831B = zsf1.m96831B(cxh0.f43038a, f, 8, f, f);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = x2e.f257445b1;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(strM54977L, zoz0.m96644b(fxh0VarM96831B, false, (gh00) objM91750T), if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new va1((byte) 0, i, 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m87602e(String str, long j, String str2, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-2010351121);
        ug5 ug5Var = xq00Var2.f264811a;
        int i3 = i & 6;
        prx0 prx0Var = prx0.f180692a;
        if (i3 == 0) {
            i2 = (xq00Var2.m91770i(prx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91764f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91766g(str2) ? 2048 : 1024;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarMo65493a = prx0Var.mo65493a(1.0f, cxh0Var, true);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarMo65493a);
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
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int i4 = i2;
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0Var);
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
            ahf1.m25932d(str, null, leu.m58818d(xq00Var2).f64971g, j, null, null, 0, false, null, 0, null, xq00Var2, ((i4 >> 3) & 14) | ((i4 << 3) & 7168), 0, 2034);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224760c, cxh0Var));
            rqg1.m76230a(null, 1, 1, xq00Var2, 432, 1);
            xq00Var2.m91788r(true);
            if71 if71Var = leu.m58818d(xq00Var2).f64974j;
            long j2 = leu.m58815a(xq00Var2).f112824b.f138758b;
            xq00Var2 = xq00Var;
            ahf1.m25932d(str2, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 11), if71Var, j2, null, null, 0, false, null, 0, null, xq00Var2, (i4 >> 9) & 14, 0, 2032);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r43(str, j, str2, i, 8);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m87603f(hbs0 hbs0Var, cvt cvtVar, z9j0 z9j0Var) {
        xfg1.m90500v(z9j0Var, hbs0Var.f89587d, cvtVar, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m87604g(hbs0 hbs0Var, cvt cvtVar, s4k s4kVar) {
        if (!hbs0Var.f89604u || cvtVar == null) {
            return;
        }
        String str = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        s4k.m77200a(s4kVar, hbs0Var.f89587d, null, m3h1.m60683w(cvtVar), new q4k(str, z, z2, z3, z4, z5, z6, bcg1.m28717B(hbs0Var), z7, z8, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741553), 2);
    }

    /* JADX INFO: renamed from: h */
    public static final void m87605h(gbs0 gbs0Var, hbs0 hbs0Var, n2x n2xVar, abs0 abs0Var) {
        InterfaceC2631yz interfaceC2631yz;
        if (wj50.m88271j(n2xVar, osw.f168906a)) {
            f5u f5uVar = gbs0Var.f78379d;
            abs0Var.m25381i(new C2232oy(g95.m43999x(f5uVar), jh3.m53318i(f5uVar)));
            return;
        }
        if (n2xVar instanceof tsw) {
            f5u f5uVar2 = gbs0Var.f78379d;
            abs0Var.m25381i(new v00(jh3.m53319j(f5uVar2), g95.m43999x(f5uVar2), ((tsw) n2xVar).f223438a));
            return;
        }
        if (n2xVar instanceof oxw) {
            f5u f5uVar3 = gbs0Var.f78379d;
            if (hbs0Var.f89598o) {
                interfaceC2631yz = C2514vz.f246354a;
            } else {
                interfaceC2631yz = hbs0Var.f89599p ? C2594xz.f267487a : C2553wz.f256423a;
            }
            abs0Var.m25381i(new C2668zz(g95.m43999x(f5uVar3), jh3.m53318i(f5uVar3), interfaceC2631yz));
            return;
        }
        if (wj50.m88271j(n2xVar, yww.f277069a)) {
            abs0Var.m25381i(new C1685az(g95.m43999x(gbs0Var.f78379d), jh3.m53318i(gbs0Var.f78379d), hbs0Var.f89600q ? C2630yy.f277371a : C2593xy.f267167a));
        } else if (wj50.m88271j(n2xVar, uww.f234743a)) {
            abs0Var.m25381i(new C2475uy(g95.m43999x(gbs0Var.f78379d)));
        } else if (n2xVar instanceof qxw) {
            abs0Var.m25381i(new a00(jh3.m53318i(gbs0Var.f78379d), g95.m43999x(gbs0Var.f78379d), ((qxw) n2xVar).f193756a));
        }
    }

    /* JADX INFO: renamed from: i */
    public static final xiz m87606i(abt abtVar, p0r0 p0r0Var, z9j0 z9j0Var, abs0 abs0Var, s4k s4kVar) {
        return axf1.m27398m(p0r0Var, j1l0.f107787Z, or40.f168440N0, null, new dcq0(z9j0Var, s4kVar, abs0Var, 6), 8);
    }

    /* JADX INFO: renamed from: k */
    public static String m87607k(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = byteBuffer.get(i8);
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (mag1.m61297g(b2)) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.m1951c();
                }
                i += 2;
                mag1.m61294d(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (mag1.m61296f(b2)) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.m1951c();
                }
                int i9 = i + 2;
                i += 3;
                mag1.m61293c(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.m1951c();
                }
                byte b4 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                mag1.m61291a(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: p */
    public static final String m87608p(String str) {
        String strM43753y0 = g6f.m43753y0(wl51.m88477a1(str, new String[]{"_"}, 0, 6), "", null, null, k351.f118776W0, 30);
        if (strM43753y0.length() <= 0) {
            return strM43753y0;
        }
        return ((Object) String.valueOf(strM43753y0.charAt(0)).toLowerCase(Locale.ROOT)) + strM43753y0.substring(1);
    }

    /* JADX INFO: renamed from: q */
    public static final List m87609q(wvz wvzVar, Context context, boolean z, int i) {
        String str = wvzVar.f255642b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String string = z ? context.getString(R.string.follow_feed_empty_view_no_matching_filters) : context.getString(R.string.follow_feed_empty_view_no_episodes);
        wj50.m88279p(string);
        xdx0 xdx0Var = new xdx0(new jex0("empty-view", str2, string, "", context.getString(R.string.follow_feed_empty_state_onboarding_call_to_action), 2, false, "empty-view"), "empty-view", new rq91(i));
        return Collections.singletonList(new sec1(xdx0Var, xdx0Var));
    }

    /* JADX INFO: renamed from: r */
    public static final tiv0 m87610r(ypi0 ypi0Var) {
        return new tiv0(ypi0Var.f274974a, ypi0Var.f274975b, ypi0Var.f274976c, ypi0Var.f274977d);
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo65954j(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: l */
    public abstract String mo65955l(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract int mo65956m(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: n */
    public boolean m87611n(int i, byte[] bArr, int i2) {
        return mo65957o(i, bArr, i2) == 0;
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo65957o(int i, byte[] bArr, int i2);
}
