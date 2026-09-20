package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q350 {

    /* JADX INFO: renamed from: a */
    public static final af40 f184795a = new af40(false);

    /* JADX INFO: renamed from: b */
    public static sd40 f184796b;

    /* JADX INFO: renamed from: a */
    public static final void m72046a(s5c s5cVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        gh00 gh00Var2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-392874039);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(s5cVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            List list = s5cVar.f205769a;
            boolean zM91766g = xq00Var.m91766g(list);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = new o8c(0, list);
                xq00Var.m91793t0(objM91750T);
            }
            dxp dxpVarM96630b = zom0.m96630b(0, 0, 3, (eh00) objM91750T, xq00Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = j4x.m52407e(-1, xq00Var);
            }
            Object obj2 = (vum0) objM91750T2;
            boolean zM91770i = xq00Var.m91770i(dxpVarM96630b) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(obj2);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj) {
                Object xhaVar = new xha(dxpVarM96630b, gh00Var, obj2, null, 9);
                dxpVarM96630b = dxpVarM96630b;
                gh00Var2 = gh00Var;
                xq00Var.m91793t0(xhaVar);
                objM91750T3 = xhaVar;
            } else {
                gh00Var2 = gh00Var;
            }
            hz40.m49237i(dxpVarM96630b, (th00) objM91750T3, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean zM91766g2 = xq00Var.m91766g(list);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T4 == obj) {
                objM91750T4 = new C2602y6(8, list);
                xq00Var.m91793t0(objM91750T4);
            }
            zn91.m96549f(dxpVarM96630b, zoz0.m96644b(fxh0VarM61822f, false, (gh00) objM91750T4), null, null, 0, 0.0f, null, null, false, null, null, null, rkk.m75772x(-1748636696, new cj0(list, dxpVarM96630b, gh00Var2, 4), xq00Var), xq00Var, 0, 16380);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ot6(s5cVar, gh00Var, fxh0Var2, i, 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m72047b(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, jba0 jba0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i2, int i3) {
        int i4;
        String str5;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        nhu nhuVar;
        xq00Var.m91775k0(461353398);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91766g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= xq00Var.m91766g(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            str5 = str4;
            i4 |= xq00Var.m91766g(str5) ? 16384 : 8192;
        } else {
            str5 = str4;
        }
        if ((196608 & i2) == 0) {
            z5 = z;
            i4 |= xq00Var.m91768h(z5) ? 131072 : 65536;
        } else {
            z5 = z;
        }
        if ((1572864 & i2) == 0) {
            i4 |= xq00Var.m91768h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z6 = z3;
            i4 |= xq00Var.m91768h(z6) ? 8388608 : 4194304;
        } else {
            z6 = z3;
        }
        if ((100663296 & i2) == 0) {
            z7 = z4;
            i4 |= xq00Var.m91768h(z7) ? 67108864 : 33554432;
        } else {
            z7 = z4;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 2;
            i4 |= xq00Var.m91770i(jba0Var) ? 536870912 : 268435456;
        } else {
            i5 = 2;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (xq00Var.m91770i(gh00Var) ? 4 : i5);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i4 & 1, ((306783379 & i4) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            boolean z8 = (i6 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z8 || objM91750T == t6x0.f217647t) {
                objM91750T = new vd90(6, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0Var, false, null, null, null, (eh00) objM91750T, 15);
            if (z2) {
                xq00Var.m91771i0(978999906);
                float f = leu.m58816b(xq00Var).f117230b.f224759b;
                float f2 = leu.m58816b(xq00Var).f117230b.f224762e;
                float f3 = leu.m58816b(xq00Var).f117230b.f224761d;
                float f4 = leu.m58816b(xq00Var).f117230b.f224762e;
                float f5 = 0;
                nhuVar = new nhu((23 & 1) != 0 ? f : 0.0f, (23 & 2) != 0 ? f2 : 0.0f, (23 & 4) != 0 ? f3 : 0.0f, (23 & 8) != 0 ? new j4m0(f4, f4, f4, f4) : new j4m0(f5, f5, f5, f5), khu.f122729a);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(979002300);
                float f6 = leu.m58816b(xq00Var).f117230b.f224759b;
                float f7 = leu.m58816b(xq00Var).f117230b.f224762e;
                float f8 = leu.m58816b(xq00Var).f117230b.f224761d;
                float f9 = leu.m58816b(xq00Var).f117230b.f224762e;
                nhu nhuVar2 = new nhu(f6, f7, f8, new j4m0(f9, f9, f9, f9));
                xq00Var.m91788r(false);
                nhuVar = nhuVar2;
            }
            s800.m77433g(fxh0VarM47247x, null, nhuVar, null, null, null, null, null, null, null, null, null, null, null, null, null, rkk.m75772x(-1999624543, new jh90(i, str, jba0Var, z6, str2, str3, str5, z7, z5, gh00Var), xq00Var), xq00Var, 512, 1572864, 65530);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kh90(i, str, str2, str3, str4, z, z2, z3, z4, jba0Var, gh00Var, fxh0Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m72048c(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        String str4;
        String str5;
        String str6;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-442590062);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str;
            i3 |= xq00Var.m91766g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i2 & 384) == 0) {
            str5 = str2;
            i3 |= xq00Var.m91766g(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91768h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= xq00Var.m91768h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= xq00Var.m91768h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            str6 = str3;
            i3 |= xq00Var.m91766g(str6) ? 8388608 : 4194304;
        } else {
            str6 = str3;
        }
        if ((100663296 & i2) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 67108864 : 33554432;
        }
        int i4 = i3 | 805306368;
        if (xq00Var.m91752Y(i4 & 1, (306783379 & i4) != 306783378)) {
            z050 z050VarM95042r6 = z050.m95042r6(str6);
            gze1 gze1VarM46199p = gze1.m46199p();
            z050VarM95042r6.getClass();
            pze1 pze1VarM71734n6 = pze1.m71734n6(z050VarM95042r6, gze1VarM46199p);
            jba0 jba0Var = pze1VarM71734n6.f183683d.f131611d;
            int i5 = i4 << 6;
            cxh0 cxh0Var = cxh0.f43038a;
            m72047b(i, str4, str5, pze1VarM71734n6.m71736m6(bno.m30056b(b400.f23157b)), pze1VarM71734n6.m71736m6(bno.m30057c()), z, z2, z3, z4, jba0Var, gh00Var, cxh0Var, xq00Var, (i4 & 1022) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024), (i4 >> 24) & 126);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new o820(i, str, str2, z, z2, z3, z4, str3, gh00Var, fxh0Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m72049d(fxh0 fxh0Var, f4m0 f4m0Var, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        f4m0 f4m0VarM96848h;
        int i4;
        boolean z;
        f4m0 f4m0Var2;
        pgv0 pgv0VarM91796v;
        int i5;
        cxh0 cxh0Var;
        fxh0 fxh0Var3;
        Object objM91750T;
        irx0 irx0VarM36744a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(966721380);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            fxh0Var2 = fxh0Var;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i | (xq00Var2.m91770i(fxh0Var2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            f4m0VarM96848h = f4m0Var;
            int i7 = xq00Var2.m91770i(f4m0VarM96848h) ? 32 : 16;
            i4 = i3 | i7;
            if ((i4 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var2.m91752Y(i4 & 1, z)) {
                xq00Var2.m91761d0();
                i5 = i & 1;
                cxh0Var = cxh0.f43038a;
                if (i5 != 0 || xq00Var2.m91735E()) {
                    if (i6 != 0) {
                        fxh0Var2 = cxh0Var;
                    }
                    if ((i2 & 2) != 0) {
                        f4m0VarM96848h = zsf1.m96848h(0.0f, 0.0f, 3);
                    }
                } else {
                    xq00Var2.m91757b0();
                }
                fxh0Var3 = fxh0Var2;
                xq00Var2.m91790s();
                objM91750T = xq00Var2.m91750T();
                if (objM91750T == t6x0.f217647t) {
                    objM91750T = wl31.f252377e;
                    xq00Var2.m91793t0(objM91750T);
                }
                fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0Var3, true, (gh00) objM91750T);
                vb9 vb9Var = d7f0.f46142M0;
                zi5 zi5Var = bj5.f27610a;
                irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224758a), vb9Var, xq00Var2, 0);
                iHashCode = Long.hashCode(xq00Var2.f264809T);
                wpn0VarM91778m = xq00Var2.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96644b);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (xq00Var2.f264811a != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
                zsf1.m96833D(roh.f201266k, xq00Var2);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                f4m0Var2 = f4m0VarM96848h;
                l0y0.m57823e(fgg1.m41584D(R.drawable.songdna_logo, xq00Var2), mi21.m61814B(cxh0Var, null, 3), null, null, null, null, null, null, xq00Var, 199728, 464);
                xq00Var2 = xq00Var;
                v3d1.m84544e(k0e1.m54977L(R.string.song_dna_beta_label, xq00Var2), 4, zsf1.m96864x(mi21.m61814B(cxh0Var, null, 3), f4m0Var2), 2, xq00Var2, 24624, 8);
                xq00Var2.m91788r(true);
                fxh0Var2 = fxh0Var3;
            } else {
                xq00Var2.m91757b0();
                f4m0Var2 = f4m0VarM96848h;
            }
            pgv0VarM91796v = xq00Var2.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new iaa0(fxh0Var2, f4m0Var2, i, i2);
            }
        }
        f4m0VarM96848h = f4m0Var;
        i4 = i3 | i7;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var2.m91752Y(i4 & 1, z)) {
            xq00Var2.m91761d0();
            i5 = i & 1;
            cxh0Var = cxh0.f43038a;
            if (i5 != 0) {
                if (i6 != 0) {
                    fxh0Var2 = cxh0Var;
                }
                if ((i2 & 2) != 0) {
                    f4m0VarM96848h = zsf1.m96848h(0.0f, 0.0f, 3);
                }
            } else {
                if (i6 != 0) {
                    fxh0Var2 = cxh0Var;
                }
                if ((i2 & 2) != 0) {
                    f4m0VarM96848h = zsf1.m96848h(0.0f, 0.0f, 3);
                }
            }
            fxh0Var3 = fxh0Var2;
            xq00Var2.m91790s();
            objM91750T = xq00Var2.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = wl31.f252377e;
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b2 = zoz0.m96644b(fxh0Var3, true, (gh00) objM91750T);
            vb9 vb9Var2 = d7f0.f46142M0;
            zi5 zi5Var2 = bj5.f27610a;
            irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224758a), vb9Var2, xq00Var2, 0);
            iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0VarM91778m = xq00Var2.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96644b2);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (xq00Var2.f264811a != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            f4m0Var2 = f4m0VarM96848h;
            l0y0.m57823e(fgg1.m41584D(R.drawable.songdna_logo, xq00Var2), mi21.m61814B(cxh0Var, null, 3), null, null, null, null, null, null, xq00Var, 199728, 464);
            xq00Var2 = xq00Var;
            v3d1.m84544e(k0e1.m54977L(R.string.song_dna_beta_label, xq00Var2), 4, zsf1.m96864x(mi21.m61814B(cxh0Var, null, 3), f4m0Var2), 2, xq00Var2, 24624, 8);
            xq00Var2.m91788r(true);
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var2.m91757b0();
            f4m0Var2 = f4m0VarM96848h;
        }
        pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iaa0(fxh0Var2, f4m0Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Context m72050e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: f */
    public static final ocl0 m72051f(wdj wdjVar) {
        String str = wdjVar.f250294c;
        String str2 = wdjVar.f250292a;
        nsk0 nsk0Var = wdjVar.f250296e;
        wcl0 scl0Var = null;
        String str3 = nsk0Var != null ? nsk0Var.f157834b : null;
        vdj vdjVar = wdjVar.f250295d;
        if (vdjVar != null) {
            if (vdjVar instanceof qdj) {
                qdj qdjVar = (qdj) vdjVar;
                scl0Var = new rcl0(qdjVar.f187698a, qdjVar.f187699b);
            } else if (vdjVar instanceof sdj) {
                sdj sdjVar = (sdj) vdjVar;
                scl0Var = new tcl0(sdjVar.f208018a, sdjVar.f208019b, sdjVar.f208020c, sdjVar.f208021d);
            } else if (vdjVar instanceof udj) {
                udj udjVar = (udj) vdjVar;
                scl0Var = new vcl0(udjVar.f229257a, udjVar.f229258b, udjVar.f229259c);
            } else if (vdjVar instanceof tdj) {
                scl0Var = new ucl0(((tdj) vdjVar).f219312a);
            } else {
                if (!(vdjVar instanceof rdj)) {
                    throw new NoWhenBranchMatchedException();
                }
                scl0Var = new scl0(((rdj) vdjVar).f198154a);
            }
        }
        return new ocl0(str2, str3, str, wdjVar.f250298g, scl0Var, 96);
    }

    /* JADX INFO: renamed from: g */
    public static hl4 m72052g() {
        if (hl4.f92609e) {
            return new hl4();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static xhu m72053h(xq00 xq00Var) {
        float f = leu.m58816b(xq00Var).f117230b.f224759b;
        float f2 = leu.m58816b(xq00Var).f117230b.f224759b;
        return new xhu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58818d(xq00Var).f64974j);
    }

    /* JADX INFO: renamed from: i */
    public static void m72054i() {
        boolean z = hl4.f92609e;
    }

    /* JADX INFO: renamed from: j */
    public static final t050 m72055j(z8k z8kVar, qjk0 qjk0Var, qjk0 qjk0Var2, qjk0 qjk0Var3, qjk0 qjk0Var4, qjk0 qjk0Var5) {
        return ((b9k) z8kVar).m28489g("WearDataLayerDaemon", new vjk0(qjk0Var, qjk0Var2, qjk0Var3, qjk0Var4, qjk0Var5, 9));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m72056k(b5q0 b5q0Var) {
        return (b5q0Var == null || !b5q0Var.f23641a || b5q0Var.f23642b) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m72057l() {
        return hl4.f92609e;
    }

    /* JADX INFO: renamed from: m */
    public static final void m72058m(cxe cxeVar, o2d0 o2d0Var, String str, vh00 vh00Var) {
        cxeVar.m34272F(o2d0Var, str, new qq8(vh00Var));
    }

    /* JADX INFO: renamed from: n */
    public static final void m72059n(cxe cxeVar, o2d0 o2d0Var, String str, vh00 vh00Var) {
        cxeVar.m34279M(o2d0Var, str, new qq8(vh00Var));
    }

    /* JADX INFO: renamed from: o */
    public static final int m72060o(qea qeaVar, qea qeaVar2, boolean z) {
        if (qeaVar2 instanceof oea) {
            return 1;
        }
        if (!(qeaVar2 instanceof iea) || z) {
            return qeaVar.equals(qeaVar2) ? 2 : 3;
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public static final dnk0 m72061p(yau0 yau0Var, Collection collection) {
        if (collection.isEmpty() || yau0Var.f271017b.isEmpty()) {
            gbu gbuVar = gbu.f78413a;
            return new dnk0(gbuVar, gbuVar);
        }
        HashSet hashSetM43724h1 = g6f.m43724h1(collection);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (lb6 lb6Var : yau0Var.f271016a.f126989c) {
            long j = lb6Var.f131574f;
            if (!linkedHashSet.contains(Long.valueOf(j))) {
                String strM56834f = klh.m56834f(lb6Var.f131570b, ".", lb6Var.f131569a);
                if (hashSetM43724h1.contains(strM56834f)) {
                    Long lValueOf = Long.valueOf(j);
                    Object linkedHashSet2 = linkedHashMap.get(lValueOf);
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = new LinkedHashSet();
                        linkedHashMap.put(lValueOf, linkedHashSet2);
                    }
                    ((Set) linkedHashSet2).add(strM56834f);
                } else {
                    linkedHashSet.add(Long.valueOf(j));
                    linkedHashMap.remove(Long.valueOf(j));
                }
            }
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            linkedHashSet3.addAll((Set) entry.getValue());
            linkedHashSet4.add(Integer.valueOf((int) jLongValue));
        }
        return new dnk0(linkedHashSet3, linkedHashSet4);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m72062q(int i, xq00 xq00Var) {
        float f = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).screenWidthDp;
        float fMo35987O0 = 110 + leu.m58816b(xq00Var).f117230b.f224758a + ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35987O0((int) (yb71.m93234a(nug1.m65706r(0, 1, xq00Var), k0e1.m54977L(R.string.song_dna_beta_label, xq00Var), leu.m58818d(xq00Var).f64978n, 0, false, 0, 0L, null, null, 1020).f47232c >> 32));
        float f2 = leu.m58816b(xq00Var).f117235g.f159608f;
        float f3 = 8;
        return ybs.m93300a(f - ((((((float) 0) * f3) + (((float) 1) * f2)) + ((f3 * ((float) (i - 1))) + (f2 * ((float) i)))) + (leu.m58816b(xq00Var).f117230b.f224763f * ((float) 2))), fMo35987O0 + leu.m58816b(xq00Var).f117230b.f224764g) >= 0;
    }

    /* JADX INFO: renamed from: r */
    public static final iys0 m72063r(yau0 yau0Var, sys0 sys0Var) {
        return sys0Var.create(new jvx0(yau0Var.f271017b));
    }

    /* JADX INFO: renamed from: s */
    public static void m72064s(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
