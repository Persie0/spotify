package p204p;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p002ui.geometry.Offset;
import com.google.android.gms.cast.CastDevice;
import com.spotify.music.R;
import java.net.InetAddress;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ex60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public static final int[] f63679a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: b */
    public static sd40 f63680b;

    /* JADX INFO: renamed from: A */
    public static final Object m40164A(fk60 fk60Var, String str, nl60 nl60Var, rr60 rr60Var) {
        return new bm60(fk60Var, nl60Var, str, rr60Var.getDescriptor()).mo42504Y(rr60Var);
    }

    /* JADX INFO: renamed from: B */
    public static dh9 m40165B(dh9 dh9Var, int i) {
        dh9 dh9Var2 = new dh9();
        int i2 = dh9Var.f49021b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || dh9Var.m36002e(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                dh9Var2.m36000c(i8, i);
            } else {
                if (i8 == 0) {
                    dh9Var2.m36000c(i5 | 1, i);
                } else {
                    dh9Var2.m36000c(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return dh9Var2;
    }

    /* JADX INFO: renamed from: C */
    public static final rac m40166C(CastDevice castDevice) {
        xhy0 xhy0Var = castDevice.f1779i;
        String strM1482k = castDevice.m1482k();
        String str = castDevice.f1774d;
        String str2 = castDevice.f1775e;
        InetAddress inetAddress = castDevice.f1773c;
        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
        if (hostAddress == null) {
            hostAddress = "";
        }
        return new rac(strM1482k, str, str2, hostAddress, castDevice.f1776f, xhy0Var.m91069c(4), xhy0Var.m91069c(1), xhy0Var.m91069c(32), xhy0Var.m91069c(65536));
    }

    /* JADX INFO: renamed from: a */
    public static final void m40167a(int i, String str, jba0 jba0Var, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(2104715390);
        int i3 = i2 | (xq00Var2.m91762e(edb.m38547C(i)) ? 4 : 2) | (xq00Var2.m91766g(str) ? 32 : 16) | (xq00Var2.m91770i(jba0Var) ? 256 : 128) | (xq00Var2.m91768h(z) ? 2048 : 1024) | 24576;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM75068p = r9g1.m75068p(mi21.m61822f(1.0f, cxh0Var), hmx0.m47995d(leu.m58816b(xq00Var2).f117234f.f148189e, leu.m58816b(xq00Var2).f117234f.f148189e, 0.0f, 0.0f, 12));
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM75068p);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            Uri uri = Uri.parse(str == null ? "" : str);
            i450 i450Var = r101.f194644L0;
            leu.f132721a.getClass();
            ofu ofuVar = (ofu) gfp.f79421c.getValue();
            xyu xyuVarM55216r = k2z0.m55216r(aru.f19145c, 0L, leu.m58815a(xq00Var2).f112823a.f229877d, xq00Var2, aru.f19146d, 22);
            l0y0.m57821c(uri, qgj.f188480a, fxh0VarM61822f, null, null, ofuVar, i450Var, null, null, new cxu(xyuVarM55216r, xyuVarM55216r), false, false, xq00Var, 1073766448, 0, 3464);
            xq00Var2 = xq00Var;
            pha phaVar = pha.f177517a;
            dha.m36004a(nec.m64245h(phaVar.mo66946b(cxh0Var), tm4.m81087E(new pqm0[]{new pqm0(Float.valueOf(0.0f), new n6f(n6f.m63765b(n6f.f150862b, 0.5f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(0.5f), new n6f(n6f.f150870j))}, 0.0f, 0.0f, 14), null, 0.0f, 6), xq00Var2, 0);
            vj50.m85722d(jba0Var, zsf1.m96832C(phaVar.mo66945a(cxh0Var, d7f0.f46153X), leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 6), xq00Var2, (i3 >> 6) & 14);
            if (z) {
                xq00Var2.m91771i0(1007785818);
                ahf1.m25932d(k0e1.m54977L(vh90.f241446a[edb.m38547C(i)] == 1 ? R.string.listening_party_card_upcoming_header_text : R.string.listening_party_card_live_header_text, xq00Var2), zsf1.m96832C(phaVar.mo66945a(cxh0Var, wb9Var), leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, 12), leu.m58818d(xq00Var2).f64972h, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(1008329930);
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v20(i, str, jba0Var, z, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m40168b(b791 b791Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        int iIntValue;
        long j;
        boolean z;
        f4m0 f4m0VarM42520e;
        float fM42530o;
        boolean z2;
        i0r0 i0r0Var;
        v1r0 v1r0Var;
        i0r0 i0r0Var2;
        i0r0 i0r0Var3;
        xq00Var.m91775k0(-1803708696);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(b791Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = leu.m58816b(xq00Var).f117235g.f159604b;
            fxh0 fxh0VarM61818b = mi21.m61818b(mi21.m61822f(1.0f, fxh0Var), 0.0f, f, 1);
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61818b);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            Integer numValueOf = null;
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
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf2, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            xq00Var.m91771i0(1708255838);
            if (((b791Var == null || (i0r0Var3 = b791Var.f24195a) == null) ? null : i0r0Var3.f97302a) == v1r0.None) {
                xq00Var.m91788r(false);
                z2 = true;
            } else {
                boolean z3 = b791Var != null && b791Var.f24198d;
                boolean z4 = (b791Var == null || (i0r0Var2 = b791Var.f24195a) == null || !q3d0.m72075F(i0r0Var2)) ? false : true;
                boolean z5 = z4 || !(z3 || b791Var == null || !b791Var.f24197c);
                if (b791Var != null && (i0r0Var = b791Var.f24195a) != null && (v1r0Var = i0r0Var.f97302a) != null) {
                    if (v1r0Var == v1r0.Unknown) {
                        v1r0Var = null;
                    }
                    if (v1r0Var != null) {
                        numValueOf = Integer.valueOf(yjf1.m93882b0(v1r0Var));
                    }
                }
                boolean z6 = (!z3 || z4 || numValueOf == null) ? false : true;
                boolean z7 = (z5 || z6) ? false : true;
                if (z5) {
                    iIntValue = R.string.mixing_transition_custom;
                } else if (!z6) {
                    iIntValue = R.string.mixing_transition_auto;
                } else {
                    if (numValueOf == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    iIntValue = numValueOf.intValue();
                }
                String strM54977L = k0e1.m54977L(iIntValue, xq00Var);
                float f2 = leu.m58816b(xq00Var).f117231c.f127593b;
                boolean z8 = z5;
                float f3 = leu.m58816b(xq00Var).f117230b.f224760c;
                boolean z9 = z6;
                float f4 = leu.m58816b(xq00Var).f117235g.f159603a;
                boolean z10 = z7;
                long j2 = leu.m58815a(xq00Var).f112824b.f138758b;
                if (z10) {
                    xq00Var.m91771i0(-2023073626);
                    j = leu.m58815a(xq00Var).f112823a.f229875b.f123093a;
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-2023073107);
                    xq00Var.m91788r(false);
                    j = n6f.f150870j;
                }
                kyu kyuVar = (kyu) xq00Var.m91774k(lyu.f138115a);
                f4m0 f4m0Var = kyuVar.f127917e;
                long j3 = j;
                int i3 = kyuVar.f127915c;
                int i4 = kyuVar.f127913a;
                wy41 wy41Var = wsh.f254623n;
                float fM96858r = zsf1.m96858r(f4m0Var, (ko70) xq00Var.m91774k(wy41Var));
                f4m0 f4m0Var2 = kyuVar.f127916d;
                if (f4m0Var2 == null) {
                    xq00Var.m91771i0(-2023064808);
                    f4m0VarM42520e = frz0.m42520e(i4, i3, xq00Var);
                    z = false;
                    xq00Var.m91788r(false);
                } else {
                    z = false;
                    xq00Var.m91771i0(-2023067071);
                    xq00Var.m91788r(false);
                    f4m0VarM42520e = f4m0Var2;
                }
                float fM96858r2 = zsf1.m96858r(f4m0VarM42520e, (ko70) xq00Var.m91774k(wy41Var)) + fM96858r;
                ybs ybsVar = kyuVar.f127921i;
                if (ybsVar == null) {
                    xq00Var.m91771i0(-2023058605);
                    fM42530o = frz0.m42530o(i4, i3, xq00Var);
                    xq00Var.m91788r(z);
                } else {
                    xq00Var.m91771i0(-2023060589);
                    xq00Var.m91788r(z);
                    fM42530o = ybsVar.f271238a;
                }
                float f5 = 2;
                float f6 = (fM42530o / f5) + fM96858r2;
                pha phaVar = pha.f177517a;
                cxh0 cxh0Var = cxh0.f43038a;
                float f7 = f6 - (f2 / f5);
                fxh0 fxh0VarM61824h = mi21.m61824h(f3, mi21.m61838v(f2, bga.m29071N(zsf1.m96832C(phaVar.mo66945a(cxh0Var, wb9Var), f7, 0.0f, 0.0f, 0.0f, 14), 0.0f, -f3, 1)));
                long j4 = leu.m58815a(xq00Var).f112823a.f229875b.f123093a;
                bgb1 bgb1Var = kxf1.f127485a;
                dha.m36004a(nec.m64246i(fxh0VarM61824h, j4, bgb1Var), xq00Var, 0);
                fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61818b(mi21.m61822f(1.0f, cxh0Var), 0.0f, f, 1), f6 - (f4 / f5), 0.0f, 0.0f, 0.0f, 14);
                irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96832C);
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
                fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61834r(f4, cxh0Var), j3, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148185a));
                m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46174i, false);
                int iHashCode3 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM64246i);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
                y85.m93057b((z8 || z9) ? gvu.f84830c : zpu.f285228c, qgj.f188480a, mi21.m61834r(f4, cxh0Var), j2, 0L, false, xq00Var, 56, 48);
                xq00Var.m91788r(true);
                z2 = true;
                ahf1.m25932d(strM54977L, zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 0.0f, 0.0f, 14), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 2, false, new ol80(1), 0, null, xq00Var, 0, 0, 1712);
                xq00Var.m91788r(true);
                dha.m36004a(nec.m64246i(mi21.m61824h(f3, mi21.m61838v(f2, bga.m29071N(zsf1.m96832C(phaVar.mo66945a(cxh0Var, d7f0.f46153X), f7, 0.0f, 0.0f, 0.0f, 14), 0.0f, f3, 1))), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, bgb1Var), xq00Var, 0);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(z2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rla0(b791Var, fxh0Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m40169c(int i, int i2) {
        String strM45867j;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM45867j = gv90.m45867j("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
                }
                strM45867j = gv90.m45867j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM45867j);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C2098lp m40170d(dju djuVar) {
        return new C2098lp(djuVar, 5);
    }

    /* JADX INFO: renamed from: e */
    public static Object m40171e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final n6f m40172f(erc1 erc1Var) {
        m340 m340Var;
        w240 w240Var;
        jiu jiuVar;
        ufu ufuVar;
        if (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (w240Var = m340Var.f139525b) == null || (jiuVar = w240Var.f247224c) == null || (ufuVar = jiuVar.f112823a) == null) {
            return null;
        }
        return new n6f(ufuVar.f229875b.f123093a);
    }

    /* JADX INFO: renamed from: g */
    public static final void m40173g(Throwable th) {
        na6.m63972t("Failed to handle player command: " + th.getMessage(), th);
    }

    /* JADX INFO: renamed from: h */
    public static void m40174h(int i, int i2, int i3) {
        String strM40181o;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM40181o = m40181o(i, i3, "start index");
            } else {
                strM40181o = (i2 < 0 || i2 > i3) ? m40181o(i2, i3, "end index") : gv90.m45867j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM40181o);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m40175i(k6q0 k6q0Var) {
        return (k6q0Var.m55612l() || k6q0Var.f119817h || !k6q0Var.f119813d) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m40176j(k6q0 k6q0Var) {
        return !k6q0Var.f119817h && k6q0Var.f119813d;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m40177k(k6q0 k6q0Var) {
        return (k6q0Var.m55612l() || !k6q0Var.f119817h || k6q0Var.f119813d) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m40178l(k6q0 k6q0Var) {
        return k6q0Var.f119817h && !k6q0Var.f119813d;
    }

    /* JADX INFO: renamed from: m */
    public static void m40179m(Context context) {
        context.getClass();
        c95.m31844j(context instanceof Application, "Not an application context.");
    }

    /* JADX INFO: renamed from: n */
    public static void m40180n() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not called on main looper");
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m40181o(int i, int i2, String str) {
        if (i < 0) {
            return gv90.m45867j("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return gv90.m45867j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: p */
    public static void m40182p(fh9 fh9Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    fh9Var.m41651c(i5, i4);
                    fh9Var.m41651c(i5, i6);
                    fh9Var.m41651c(i4, i5);
                    fh9Var.m41651c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        fh9Var.m41651c(i7, i7);
        int i8 = i7 + 1;
        fh9Var.m41651c(i8, i7);
        fh9Var.m41651c(i7, i8);
        int i9 = i + i2;
        fh9Var.m41651c(i9, i7);
        fh9Var.m41651c(i9, i8);
        fh9Var.m41651c(i9, i9 - 1);
    }

    /* JADX INFO: renamed from: q */
    public static dh9 m40183q(dh9 dh9Var, int i, int i2) {
        x310 x310Var;
        int i3 = dh9Var.f49021b / i2;
        if (i2 == 4) {
            x310Var = x310.f257656j;
        } else if (i2 == 6) {
            x310Var = x310.f257655i;
        } else if (i2 == 8) {
            x310Var = x310.f257658l;
        } else if (i2 == 10) {
            x310Var = x310.f257654h;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            x310Var = x310.f257653g;
        }
        w8q0 w8q0Var = new w8q0(x310Var);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = dh9Var.f49021b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= dh9Var.m36002e((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        w8q0Var.m87472g(iArr, i4 - i3);
        dh9 dh9Var2 = new dh9();
        dh9Var2.m36000c(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            dh9Var2.m36000c(iArr[i9], i2);
        }
        return dh9Var2;
    }

    /* JADX INFO: renamed from: r */
    public static Drawable m40184r(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: s */
    public static final t050 m40185s(z8k z8kVar, jkk0 jkk0Var) {
        return ((b9k) z8kVar).m28489g("WhereToPlaySuggestionObserverPluginDaemon", new wjk0(jkk0Var, 21));
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m40186t(long j, k6q0 k6q0Var) {
        long j2 = k6q0Var.f119812c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat > ((float) i)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 > ((float) i2));
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m40187u(k6q0 k6q0Var, long j, long j2) {
        int i = k6q0Var.f119818i == 1 ? 1 : 0;
        long j3 = k6q0Var.f119812c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: v */
    public static final long m40188v(k6q0 k6q0Var) {
        return m40190x(k6q0Var, false);
    }

    /* JADX INFO: renamed from: w */
    public static final long m40189w(k6q0 k6q0Var) {
        return m40190x(k6q0Var, true);
    }

    /* JADX INFO: renamed from: x */
    public static final long m40190x(k6q0 k6q0Var, boolean z) {
        long jM256f = Offset.m256f(k6q0Var.f119812c, k6q0Var.f119816g);
        if (z || !k6q0Var.m55612l()) {
            return jM256f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m40191y(k6q0 k6q0Var) {
        return !Offset.m253c(m40190x(k6q0Var, false), 0L);
    }

    /* JADX INFO: renamed from: z */
    public static final Object m40192z(fk60 fk60Var, yk60 yk60Var, rr60 rr60Var) {
        fro tl60Var;
        String str = null;
        if (yk60Var instanceof nl60) {
            tl60Var = new bm60(fk60Var, (nl60) yk60Var, str, 12);
        } else if (yk60Var instanceof jk60) {
            tl60Var = new cm60(fk60Var, (jk60) yk60Var);
        } else {
            if (!(yk60Var instanceof hl60) && !yk60Var.equals(kl60.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            tl60Var = new tl60(fk60Var, (sl60) yk60Var, null);
        }
        return tl60Var.mo42504Y(rr60Var);
    }
}
