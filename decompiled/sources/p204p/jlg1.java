package p204p;

import android.os.Build;
import com.comscore.streaming.ContentType;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jlg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f113620a;

    /* JADX INFO: renamed from: b */
    public static sd40 f113621b;

    /* JADX INFO: renamed from: A */
    public static long m53682A(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder sbM77254m = s571.m77254m(j, "Addition overflows a long: ", " + ");
        sbM77254m.append(j2);
        throw new ArithmeticException(sbM77254m.toString());
    }

    /* JADX INFO: renamed from: B */
    public static long m53683B(int i, long j) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j;
        }
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
    }

    /* JADX INFO: renamed from: C */
    public static long m53684C(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        StringBuilder sbM77254m = s571.m77254m(j, "Multiplication overflows a long: ", " * ");
        sbM77254m.append(j2);
        throw new ArithmeticException(sbM77254m.toString());
    }

    /* JADX INFO: renamed from: D */
    public static int m53685D(int i) {
        int i2 = i - 1;
        if ((i ^ i2) >= 0 || (i ^ 1) >= 0) {
            return i2;
        }
        throw new ArithmeticException(edb.m38563l("Subtraction overflows an int: ", i, " - 1"));
    }

    /* JADX INFO: renamed from: E */
    public static long m53686E(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder sbM77254m = s571.m77254m(j, "Subtraction overflows a long: ", " - ");
        sbM77254m.append(j2);
        throw new ArithmeticException(sbM77254m.toString());
    }

    /* JADX INFO: renamed from: F */
    public static int m53687F(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new ArithmeticException(edb.m38561j(j, "Calculation overflows an int: "));
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: G */
    public static String m53688G(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        HashMap map = new HashMap();
        map.put("app_identifier", str);
        map.put("version_code", str2);
        map.put("version_name", str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", Integer.valueOf(i));
        if (str5 == null) {
            str5 = "";
        }
        map.put("development_platform", str5);
        if (str6 == null) {
            str6 = "";
        }
        map.put("development_platform_version", str6);
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: H */
    public static String m53689H(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(i));
        map.put("build_model", str);
        map.put("available_processors", Integer.valueOf(i2));
        map.put("total_ram", Long.valueOf(j));
        map.put("disk_space", Long.valueOf(j2));
        map.put("is_emulator", Boolean.valueOf(z));
        map.put("state", Integer.valueOf(i3));
        map.put("build_manufacturer", str2);
        map.put("build_product", str3);
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: I */
    public static final void m53690I(rlv0 rlv0Var, nlv0 nlv0Var, fxb0 fxb0Var, noa0 noa0Var, ces cesVar, float f) {
        rlv0Var.f200373a = null;
        nlv0Var.f155174a = true;
        float f2 = cesVar.f37172b;
        int i = cesVar.f37171a;
        float fM63436m = ((f / 4.0f) / i) + n0e1.m63436m(f2 / i, 0.0f, 1.0f);
        uek0 uek0Var = uek0.f229554b;
        uek0 uek0Var2 = fM63436m > 0.5f ? uek0Var : uek0.f229553a;
        fxb0Var.f74328e = true;
        fxb0Var.m43003f(new axb0(uek0Var2, true));
        fxb0Var.f74328e = false;
        for (zvb0 zvb0Var : zvb0.f286676h) {
            if (zvb0Var.f286677a == uek0Var2 && !zvb0Var.f286678b) {
                fxb0.m42998a(fxb0Var, zvb0Var, Float.valueOf(f), false, 4);
                if (uek0Var2 == uek0Var) {
                    noa0Var.invoke(uek0Var);
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: a */
    public static final void m53691a(awv awvVar, sef0 sef0Var, f7l0 f7l0Var, f7l0 f7l0Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        int i3;
        xq00Var.m91775k0(-1117797089);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(awvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(sef0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(f7l0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(f7l0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            gcr0 gcr0VarM27347j = awvVar.m27347j();
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = sef0.m77890o(sef0Var, f7l0Var, 1);
                xq00Var.m91793t0(objM91750T);
            }
            au01 au01Var = (au01) objM91750T;
            icr0 icr0Var = awvVar.f20712f;
            int iM38547C = edb.m38547C(awvVar.f20708b);
            if (iM38547C == 0) {
                i3 = 2;
            } else if (iM38547C == 1) {
                i3 = 1;
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 3;
            }
            vt01 vt01Var = new vt01(icr0Var, i3, gcr0VarM27347j != null ? 1 : 2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
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
            mif1.m61869b(au01Var, vt01Var, null, null, xq00Var, 0, 12);
            if (gcr0VarM27347j == null) {
                xq00Var.m91771i0(1492505913);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1492505914);
                wvb.m89080a(f7l0Var2, null, 0.0f, rkk.m75772x(-1405551458, new un8(gcr0VarM27347j, 1), xq00Var), xq00Var, ((i2 >> 9) & 14) | 3072, 6);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z41(awvVar, sef0Var, f7l0Var, f7l0Var2, fxh0Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m53692b(z9j0 z9j0Var, nqq nqqVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1720390137);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(z9j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(nqqVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var2 = xq00Var;
            vig1.m85649d(null, ycg.f271484a, null, null, rkk.m75772x(-1150849664, new d9j(nqqVar, z9j0Var), xq00Var), xq00Var2, 24624, 13);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gek(z9j0Var, nqqVar, fxh0Var2, i, 17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m53693c(glg1 glg1Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        wju wjuVar;
        xq00Var.m91775k0(931287354);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(glg1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fmx0 fmx0Var = hmx0.f93097a;
            boolean z = glg1Var instanceof njj0;
            if (z) {
                wjuVar = tju.f221017e;
            } else {
                if (!glg1Var.equals(ojj0.f166094c)) {
                    throw new NoWhenBranchMatchedException();
                }
                wjuVar = vju.f242057e;
            }
            wb9 wb9Var = d7f0.f46174i;
            float f = leu.m58816b(xq00Var).f117230b.f224762e;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new rni0(11, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T);
            if (!z) {
                peuVar = null;
            }
            zn91.m96545d(null, wb9Var, fmx0Var, wjuVar, j4m0Var, null, false, null, null, peuVar, null, rkk.m75772x(-2008832669, new w7i0(glg1Var, 13), xq00Var), xq00Var, 0, 48, 1505);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rjj0(glg1Var, gh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m53694d(glg1 glg1Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(983167797);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(glg1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        if (!xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            xq00Var2.m91757b0();
        } else if (glg1Var instanceof njj0) {
            xq00Var2.m91771i0(-68546536);
            m53693c(glg1Var, gh00Var, xq00Var2, i2 & 126);
            xq00Var2.m91788r(false);
        } else {
            if (!glg1Var.equals(ojj0.f166094c)) {
                throw lq51.m59703i(-68547836, xq00Var2, false);
            }
            xq00Var2.m91771i0(-2124844654);
            kyu kyuVarM57724b = kyu.m57724b((kyu) xq00Var2.m91774k(lyu.f138115a), 0, null, 30);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new rni0(12, gh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            p711.m69222a(null, kyuVarM57724b, null, false, null, null, new peu(u40.f226523c, (eh00) objM91750T), null, rkk.m75772x(-60094806, new f6c0(23, glg1Var, gh00Var), xq00Var2), null, null, null, null, null, null, ewg.f63544a, xq00Var, 100663360, 196608, 32445);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rjj0(glg1Var, gh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m53695e(xom0 xom0Var, fxh0 fxh0Var, float f, float f2, float f3, float f4, long j, long j2, xq00 xq00Var, int i) {
        int i2;
        long j3;
        long j4;
        int i3;
        long j5;
        xq00Var.m91775k0(1690318810);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(xom0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91760d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91760d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91760d(f3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= xq00Var.m91760d(f4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= xq00Var.m91764f(j2) ? 8388608 : 4194304;
        }
        boolean z = true;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                j4 = leu.m58815a(xq00Var).f112824b.f138757a;
                i3 = i2 & (-3670017);
            } else {
                xq00Var.m91757b0();
                i3 = i2 & (-3670017);
                j4 = j;
            }
            xq00Var.m91790s();
            fxh0 fxh0VarM75069q = r9g1.m75069q(mi21.m61824h(f2, mi21.m61838v(((f2 + f) * (Math.min(xom0Var.mo37269m(), 4) - 1)) + f3, fxh0Var)));
            boolean zM91770i = ((((i3 & 7168) ^ 3072) > 2048 && xq00Var.m91760d(f2)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && xq00Var.m91760d(f3)) || (i3 & 24576) == 16384) | ((((i3 & 896) ^ 384) > 256 && xq00Var.m91760d(f)) || (i3 & 384) == 256) | xq00Var.m91770i(xom0Var) | ((((458752 & i3) ^ 196608) > 131072 && xq00Var.m91760d(f4)) || (i3 & 196608) == 131072) | xq00Var.m91764f(j4);
            if ((((29360128 & i3) ^ 12582912) <= 8388608 || !xq00Var.m91764f(j2)) && (i3 & 12582912) != 8388608) {
                z = false;
            }
            boolean z2 = zM91770i | z;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                j5 = j4;
                fbm0 fbm0Var = new fbm0(f3, f2, f, xom0Var, f4, j5, j2, 1);
                xq00Var.m91793t0(fbm0Var);
                objM91750T = fbm0Var;
            } else {
                j5 = j4;
            }
            xud.m92135b(0, (gh00) objM91750T, xq00Var, fxh0VarM75069q);
            j3 = j5;
        } else {
            xq00Var.m91757b0();
            j3 = j;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ynm0(xom0Var, fxh0Var, f, f2, f3, f4, j3, j2, i, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m53696f(ws11 ws11Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1566013383);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ws11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            p2h1.m68943i(((i2 << 3) & 896) | 6, "Video Carousel", ws11Var.f254481b + " · " + ws11Var.f254483d.size() + " video(s)", xq00Var, fxh0Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rdb1(ws11Var, fxh0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final float m53697g(xom0 xom0Var, int i, float f, float f2) {
        Float fValueOf = Float.valueOf(0.0f);
        int iMo37269m = xom0Var.mo37269m();
        Float[] fArr = new Float[iMo37269m];
        for (int i2 = 0; i2 < iMo37269m; i2++) {
            fArr[i2] = Float.valueOf(1.0f);
        }
        if (xom0Var.mo37269m() >= 4) {
            pqm0 pqm0VarM53712v = m53712v(xom0Var);
            float fFloatValue = ((Number) pqm0VarM53712v.f180350a).floatValue();
            float fFloatValue2 = ((Number) pqm0VarM53712v.f180351b).floatValue();
            double d = fFloatValue;
            int iCeil = (int) Math.ceil(d);
            int iFloor = (int) Math.floor(d);
            for (int i3 = 0; i3 < iFloor; i3++) {
                fArr[i3] = fValueOf;
            }
            if (iCeil != iFloor) {
                float f3 = fFloatValue - iFloor;
                if (iFloor > 0 || iCeil > 0) {
                    float f4 = 1.0f - f3;
                    fArr[iFloor] = Float.valueOf(f4);
                    fArr[iCeil] = Float.valueOf(f4);
                }
            } else if (iCeil > 0) {
                fArr[iCeil] = fValueOf;
            }
            double d2 = fFloatValue2;
            int iFloor2 = (int) Math.floor(d2);
            int iCeil2 = (int) Math.ceil(d2);
            int iMo37269m2 = xom0Var.mo37269m();
            for (int i4 = iCeil2 + 1; i4 < iMo37269m2; i4++) {
                fArr[i4] = fValueOf;
            }
            if (iFloor2 != iCeil2) {
                float f5 = iCeil2 - fFloatValue2;
                if (iCeil2 < xom0Var.mo37269m() - 1 || iFloor2 < xom0Var.mo37269m() - 1) {
                    float f6 = 1.0f - f5;
                    fArr[iCeil2] = Float.valueOf(f6);
                    fArr[iFloor2] = Float.valueOf(f6);
                }
            } else if (iFloor2 < xom0Var.mo37269m() - 1) {
                fArr[iFloor2] = fValueOf;
            }
        }
        float fFloatValue3 = fArr[i].floatValue();
        float fFloatValue4 = ((Number) m53712v(xom0Var).f180350a).floatValue();
        float fFloatValue5 = ((Number) m53712v(xom0Var).f180351b).floatValue();
        float f7 = i;
        if (fFloatValue4 > f7 || f7 > fFloatValue5) {
            return (i == 0 || i == xom0Var.mo37269m() + (-1)) ? fFloatValue3 * f2 : fFloatValue3 * f;
        }
        return edb.m38555d(f2, f, fFloatValue3, f);
    }

    /* JADX INFO: renamed from: h */
    public static final fxh0 m53698h(String str, List list) {
        boolean zIsEmpty = list.isEmpty();
        cxh0 cxh0Var = cxh0.f43038a;
        return zIsEmpty ? cxh0Var : hqg1.m48273f(cxh0Var, new C1702bf(list, str));
    }

    /* JADX INFO: renamed from: i */
    public static de61 m53699i(long j, long j2, long j3, long j4, long j5, xq00 xq00Var, int i) {
        long j6 = n6f.f150870j;
        float f = ff61.f68921a;
        long jM87460e = w8f.m87460e(11, xq00Var);
        long jM87460e2 = (i & 64) != 0 ? w8f.m87460e(24, xq00Var) : j5;
        long jM87460e3 = w8f.m87460e(39, xq00Var);
        long jM63765b = n6f.m63765b(w8f.m87460e(35, xq00Var), 1.0f, 0.0f, 0.0f, 0.0f, 14);
        wy41 wy41Var = w8f.f248921a;
        return new de61(j, j2, j6, jM87460e, j3, j4, jM87460e2, jM87460e3, rfg1.m75452v(jM63765b, ((v8f) xq00Var.m91774k(wy41Var)).f238560p), rfg1.m75452v(n6f.m63765b(w8f.m87460e(18, xq00Var), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((v8f) xq00Var.m91774k(wy41Var)).f238560p), j6, rfg1.m75452v(n6f.m63765b(w8f.m87460e(18, xq00Var), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((v8f) xq00Var.m91774k(wy41Var)).f238560p), rfg1.m75452v(n6f.m63765b(w8f.m87460e(18, xq00Var), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((v8f) xq00Var.m91774k(wy41Var)).f238560p), rfg1.m75452v(n6f.m63765b(w8f.m87460e(39, xq00Var), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((v8f) xq00Var.m91774k(wy41Var)).f238560p), rfg1.m75452v(n6f.m63765b(w8f.m87460e(18, xq00Var), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((v8f) xq00Var.m91774k(wy41Var)).f238560p), rfg1.m75452v(n6f.m63765b(w8f.m87460e(39, xq00Var), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((v8f) xq00Var.m91774k(wy41Var)).f238560p));
    }

    /* JADX INFO: renamed from: j */
    public static euf m53700j(gh00... gh00VarArr) {
        if (gh00VarArr.length > 0) {
            return new euf(gh00VarArr, 0);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: k */
    public static int m53701k(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: l */
    public static int m53702l(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: m */
    public static int m53703m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m53704n(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m53705o(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: p */
    public static int m53706p(int i) {
        return i >= 0 ? i / 86400 : ((i + 1) / 86400) - 1;
    }

    /* JADX INFO: renamed from: q */
    public static long m53707q(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    /* JADX INFO: renamed from: r */
    public static int m53708r(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    /* JADX INFO: renamed from: s */
    public static int m53709s(int i, long j) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    /* JADX INFO: renamed from: t */
    public static long m53710t(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    /* JADX INFO: renamed from: u */
    public static final float m53711u(xom0 xom0Var) {
        return ((uum0) xom0Var.f264315d.f99668d).m84031v() + ((vum0) xom0Var.f264315d.f99667c).m86437v();
    }

    /* JADX INFO: renamed from: v */
    public static final pqm0 m53712v(xom0 xom0Var) {
        Float fValueOf = Float.valueOf(0.0f);
        if (xom0Var.mo37269m() <= 4) {
            return new pqm0(fValueOf, Float.valueOf(xom0Var.mo37269m() - 1.0f));
        }
        float f = 1;
        float fM53711u = m53711u(xom0Var) - f;
        if (fM53711u < 0.0f) {
            return new pqm0(fValueOf, Float.valueOf(3.0f));
        }
        float fMo37269m = xom0Var.mo37269m() - 4;
        if (fM53711u > fMo37269m) {
            fM53711u = fMo37269m;
        }
        return new pqm0(Float.valueOf(fM53711u), Float.valueOf((fM53711u + 4) - f));
    }

    /* JADX INFO: renamed from: w */
    public static int m53713w(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: x */
    public static Comparable m53714x(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    /* JADX INFO: renamed from: y */
    public static Comparable m53715y(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }

    /* JADX INFO: renamed from: z */
    public static void m53716z(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }
}
