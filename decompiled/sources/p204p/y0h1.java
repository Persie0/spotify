package p204p;

import android.content.Intent;
import android.net.Uri;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.podcastexperience.showpreferencesimpl.DefaultShowSortOrderPreferences$SortOrderJsonModel;
import java.text.MessageFormat;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y0h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f267987a;

    /* JADX INFO: renamed from: b */
    public static final void m92564b(int i, String str, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(1339929230);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g("19") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            float f = 12;
            fxh0 fxh0VarM61837u = mi21.m61837u(fxh0Var, f, f, 0.0f, 0.0f, 12);
            boolean z = (((i2 & 896) ^ 384) > 256 && xq00Var.m91766g(str)) || (i2 & 384) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ivg(str, 20);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM63030j = mwg1.m63030j((float) 0.9d, leu.m58815a(xq00Var).f112824b.f138760d, zoz0.m96644b(fxh0VarM61837u, false, (gh00) objM91750T), hmx0.f93097a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM63030j);
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
            ahf1.m25932d("19", pha.f177517a.mo66945a(zsf1.m96830A(cxh0.f43038a, (float) 2.1d, 0.0f, 2), d7f0.f46174i), if71.m50418a(leu.m58818d(xq00Var).f64978n, 0L, epv0.m39702v(9), null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777213), leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2016);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1780dj(fxh0Var, str, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m92565c(int i, int i2, int i3, xq00 xq00Var, fxh0 fxh0Var) {
        int i4;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1004670929);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i4 & 1, (i4 & 19) != 18)) {
            fxh0Var2 = i5 != 0 ? cxh0.f43038a : fxh0Var;
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                xq00Var.m91771i0(1475617772);
                m92564b((i4 & ContentType.LONG_FORM_ON_DEMAND) | 6, k0e1.m54977L(R.string.over_19_badge_content_description, xq00Var), xq00Var, fxh0Var2);
                xq00Var.m91788r(false);
            } else if (iM38547C == 1) {
                xq00Var.m91771i0(1475827363);
                v3d1.m84546g(i4 & ContentType.LONG_FORM_ON_DEMAND, 0, k0e1.m54977L(R.string.explicit_badge_text_short, xq00Var), k0e1.m54977L(R.string.explicit_badge_content_description, xq00Var), xq00Var, fxh0Var2);
                xq00Var.m91788r(false);
            } else {
                if (iM38547C != 2) {
                    throw lq51.m59703i(878882874, xq00Var, false);
                }
                xq00Var.m91771i0(1476080292);
                v3d1.m84546g(i4 & ContentType.LONG_FORM_ON_DEMAND, 0, k0e1.m54977L(R.string.explicit_badge_text_long, xq00Var), k0e1.m54977L(R.string.explicit_badge_content_description, xq00Var), xq00Var, fxh0Var2);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rsj(i, fxh0Var2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m92566d(tbo0 tbo0Var, gh00 gh00Var, ajq0 ajq0Var, eju ejuVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-868806476);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(tbo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(ajq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(ejuVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            xq00Var2 = xq00Var;
            vig1.m85649d(null, b0h.f21918a, null, null, rkk.m75772x(-776993811, new j640(tbo0Var, gh00Var, ajq0Var, ejuVar), xq00Var), xq00Var2, 24624, 13);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vy40(tbo0Var, gh00Var, ajq0Var, ejuVar, fxh0Var2, i, 26);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m92567e(tbo0 tbo0Var, gh00 gh00Var, ajq0 ajq0Var, eju ejuVar, f4m0 f4m0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1446174491);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(tbo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(ajq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(ejuVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(cxh0.f43038a) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(f4m0Var) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            if (ajq0Var.f16338b.m43659l()) {
                xq00Var.m91771i0(-166988122);
                x0h1.m89566i(tbo0Var, gh00Var, ajq0Var, ejuVar, f4m0Var, xq00Var, i2 & 524286);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-166768890);
                c0h1.m31151e(tbo0Var, gh00Var, ajq0Var, ejuVar, f4m0Var, xq00Var, i2 & 524286);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qbo0(tbo0Var, gh00Var, ajq0Var, ejuVar, f4m0Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m92568f(run runVar, float f, k69 k69Var, float f2, int i, int i2, lb81 lb81Var, float f3, float f4, int i3, boolean z, float f5, float f6, o690 o690Var, th00 th00Var, gh00 gh00Var, gh00 gh00Var2, sb91 sb91Var, fxh0 fxh0Var, gh71 gh71Var, eh00 eh00Var, boolean z2, boolean z3, int i4, int i5, Integer num, float f7, Integer num2, List list, xq00 xq00Var, int i6, int i7, int i8) {
        int i9;
        lb81 lb81Var2;
        fxh0 fxh0Var2;
        List list2;
        rv41 rv41Var;
        int size;
        int size2;
        int i10;
        float f8;
        boolean z4;
        int i11;
        Object obj = t6x0.f217647t;
        List list3 = o690Var.f162290c;
        xq00Var.m91775k0(-794710198);
        int i12 = i6 | (xq00Var.m91770i(runVar) ? 4 : 2) | (xq00Var.m91760d(f) ? 32 : 16) | (xq00Var.m91770i(k69Var) ? 256 : 128) | (xq00Var.m91760d(f2) ? 2048 : 1024) | (xq00Var.m91762e(i) ? 16384 : 8192) | (xq00Var.m91762e(i2) ? 131072 : 65536) | (xq00Var.m91760d(f3) ? 8388608 : 4194304) | (xq00Var.m91760d(f4) ? 67108864 : 33554432) | (xq00Var.m91762e(i3) ? 536870912 : 268435456);
        int i13 = 0 | (xq00Var.m91768h(z) ? (char) 4 : (char) 2) | (xq00Var.m91760d(f5) ? 32 : 16) | (xq00Var.m91760d(f6) ? 256 : 128) | (xq00Var.m91770i(o690Var) ? 2048 : 1024) | (xq00Var.m91770i(th00Var) ? 16384 : 8192) | (xq00Var.m91770i(gh00Var2) ? 1048576 : 524288) | (xq00Var.m91766g(sb91Var) ? 8388608 : 4194304) | 100663296 | (xq00Var.m91770i(gh71Var) ? (char) 0 : (char) 0);
        int i14 = i7 | (xq00Var.m91770i(eh00Var) ? 4 : 2) | (xq00Var.m91768h(z2) ? 32 : 16) | (xq00Var.m91768h(z3) ? 256 : 128) | (xq00Var.m91762e(i4) ? 2048 : 1024) | (xq00Var.m91762e(i5) ? 16384 : 8192);
        if ((i7 & 196608) == 0) {
            i14 |= xq00Var.m91766g(num) ? 131072 : 65536;
        }
        int i15 = i14 | (xq00Var.m91760d(f7) ? 1048576 : 524288) | (xq00Var.m91766g(num2) ? 8388608 : 4194304);
        int i16 = i8 & 268435456;
        if (i16 != 0) {
            i9 = i15 | 100663296;
        } else {
            i9 = i15 | (xq00Var.m91770i(list) ? 67108864 : 33554432);
        }
        int i17 = i9;
        if (xq00Var.m91752Y(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i17 & 38347923) == 38347922) ? false : true)) {
            List list4 = i16 != 0 ? lau.f131415a : list;
            rv41 rv41VarM79507c = sw4.m79507c(i3, jg31.m53259E(300, 0, iqs.f104839a, 2), "transitionDurationAnimation", null, xq00Var, ((i12 >> 27) & 14) | 384, 8);
            if (gh71Var != null) {
                size = gh71Var.f79849c.size();
                int iM24444m = a1h1.m24444m(f7, i2);
                rv41Var = rv41VarM79507c;
                if (iM24444m > 1) {
                    size = ((size + iM24444m) - 1) / iM24444m;
                }
            } else {
                rv41Var = rv41VarM79507c;
                size = list3.size();
            }
            if (gh71Var != null) {
                size2 = gh71Var.f79849c.size();
                i10 = gh71Var.f79848b;
            } else {
                size2 = list3.size();
                i10 = o690Var.f162289b;
            }
            float f9 = size > 0 ? (size2 * i10) / size : 0.0f;
            boolean zM91762e = ((i17 & 3670016) == 1048576) | xq00Var.m91762e(((Number) rv41Var.getValue()).intValue()) | xq00Var.m91760d(f9) | ((i12 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (zM91762e || objM91750T == obj) {
                if (f9 != 0.0f && ((Number) rv41Var.getValue()).intValue() > 0) {
                    float fIntValue = (f5 / ((Number) rv41Var.getValue()).intValue()) * f9;
                    int iOrdinal = lb81Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fIntValue = f == 0.0f ? 0.0f : fIntValue / f;
                    }
                    f8 = fIntValue * f7;
                } else {
                    f8 = 0.0f;
                }
                objM91750T = Float.valueOf(f8);
                xq00Var.m91793t0(objM91750T);
            }
            float fFloatValue = ((Number) objM91750T).floatValue();
            int i18 = 29360128 & i13;
            boolean zM91762e2 = ((i12 & 7168) == 2048) | xq00Var.m91762e(size) | xq00Var.m91760d(fFloatValue) | xq00Var.m91760d(f9) | ((i13 & 896) == 256) | (i18 == 8388608);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91762e2 || objM91750T2 == obj) {
                float f10 = fFloatValue * f2;
                float f11 = f6 / 2;
                float f12 = 0.8f * f11 * f2;
                float f13 = sb91Var.f207395h;
                float f14 = sb91Var.f207389b;
                float f15 = ((size * f10) - f13) - f14;
                float f16 = f10 > 0.0f ? ((sb91Var.f207394g + f13) + f13) / f10 : 0.0f;
                objM91750T2 = new fid1(sb91Var.f207388a, f9, f16 * fFloatValue, f11, -f13, f15, f10, f14, f12, f13, f16);
                xq00Var.m91793t0(objM91750T2);
            }
            fid1 fid1Var = (fid1) objM91750T2;
            int iOrdinal2 = lb81Var.ordinal();
            if (iOrdinal2 != 0) {
                z4 = true;
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = 1;
            } else {
                z4 = true;
                i11 = 2;
            }
            yhe0 yhe0Var = new yhe0(lb81Var, z2, z3, i4, i5, num, num2, th00Var, gh00Var, gh00Var2, eh00Var);
            boolean z5 = i18 == 8388608 ? z4 : false;
            if ((i13 & 14) != 4) {
                z4 = false;
            }
            boolean zM91766g = z5 | z4 | xq00Var.m91766g(fid1Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g || objM91750T3 == obj) {
                lb81Var2 = lb81Var;
                Object phd1Var = new phd1((xre) runVar.f202880a.f182075b.f211251B1.get(), new k8c1(15, lb81Var2, sb91Var), new ihk0(z, fid1Var, 17));
                xq00Var.m91793t0(phd1Var);
                objM91750T3 = phd1Var;
            } else {
                lb81Var2 = lb81Var;
            }
            ohd1 ohd1Var = new ohd1(k69Var, i2, f3, o690Var, i, fid1Var, yhe0Var, i11, gh71Var, z, f4, f7, list4, sb91Var.f207392e);
            cxh0 cxh0Var = cxh0.f43038a;
            mif1.m61869b((phd1) objM91750T3, ohd1Var, cxh0Var, null, xq00Var, 448, 8);
            fxh0Var2 = cxh0Var;
            list2 = list4;
        } else {
            lb81Var2 = lb81Var;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            list2 = list;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new whd1(runVar, f, k69Var, f2, i, i2, lb81Var2, f3, f4, i3, z, f5, f6, o690Var, th00Var, gh00Var, gh00Var2, sb91Var, fxh0Var2, gh71Var, eh00Var, z2, z3, i4, i5, num, f7, num2, list2, i6, i7, i8);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m92569g(dil dilVar, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        peu peuVar;
        xq00Var.m91775k0(-213810520);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? xq00Var.m91766g(dilVar) : xq00Var.m91770i(dilVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            if (dilVar.f49409a.length() > 0) {
                xq00Var.m91771i0(686524771);
                boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                Object objM91750T = xq00Var.m91750T();
                if (z || objM91750T == t6x0.f217647t) {
                    objM91750T = new evq(16, eh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                peuVar = new peu(u40.f226523c, (eh00) objM91750T);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-192536555);
                xq00Var.m91788r(false);
                peuVar = null;
            }
            p711.m69222a(null, null, null, false, null, null, peuVar, null, rkk.m75772x(111586398, new pct(dilVar, 0), xq00Var), null, null, null, dilVar.f49409a.length() > 0 ? seg.f208290a : null, null, null, rkk.m75772x(1249525732, new pct(dilVar, 1), xq00Var), xq00Var, 100663296, 196608, 28351);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvj(dilVar, eh00Var, i, 27);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m92570h(String str, fro froVar) {
        StringBuilder sbM38572u = edb.m38572u("Cannot deserialize ", str, " with '");
        sbM38572u.append(qpv0.f191387a.mo54112b(froVar.getClass()).mo29111F());
        sbM38572u.append("'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.");
        return sbM38572u.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final String m92571i(String str, deu deuVar) {
        StringBuilder sbM38572u = edb.m38572u("Cannot serialize ", str, " with '");
        sbM38572u.append(qpv0.f191387a.mo54112b(deuVar.getClass()).mo29111F());
        sbM38572u.append("'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.");
        return sbM38572u.toString();
    }

    /* JADX INFO: renamed from: j */
    public static final String m92572j(uhf uhfVar) {
        if (uhfVar instanceof jhf) {
            return ((jhf) uhfVar).f112430b.m22147u();
        }
        if (uhfVar instanceof mhf) {
            return ((mhf) uhfVar).f143779b.m22249u();
        }
        if (uhfVar instanceof nhf) {
            return ((nhf) uhfVar).f153997b;
        }
        if ((uhfVar instanceof thf) || (uhfVar instanceof phf) || (uhfVar instanceof shf) || uhfVar.equals(lhf.f133555b) || uhfVar.equals(ohf.f165421b) || uhfVar.equals(qhf.f188769b) || uhfVar.equals(rhf.f199215b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static final int m92573k(uhf uhfVar) {
        if (uhfVar instanceof jhf) {
            return ((jhf) uhfVar).f112431c;
        }
        if (uhfVar instanceof mhf) {
            return ((mhf) uhfVar).f143780c;
        }
        if ((uhfVar instanceof nhf) || (uhfVar instanceof phf) || (uhfVar instanceof shf) || (uhfVar instanceof thf) || uhfVar.equals(lhf.f133555b) || uhfVar.equals(ohf.f165421b) || uhfVar.equals(qhf.f188769b) || uhfVar.equals(rhf.f199215b)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final int m92574l(sw70 sw70Var) {
        return (int) (sw70Var.f214610p == vvl0.f245248a ? sw70Var.m79529g() & 4294967295L : sw70Var.m79529g() >> 32);
    }

    /* JADX INFO: renamed from: m */
    public static final dq31 m92575m(y6q y6qVar, String str) {
        cq31 cq31Var = cq31.f40720a;
        cq31 cq31Var2 = cq31.f40721b;
        cq31 cq31Var3 = cq31.f40722c;
        List listM46715L = h6f.m46715L(cq31Var, cq31Var2, cq31Var3);
        b080 b080VarM95814a = y6qVar.f269891a.m95814a();
        DefaultShowSortOrderPreferences$SortOrderJsonModel defaultShowSortOrderPreferences$SortOrderJsonModel = (DefaultShowSortOrderPreferences$SortOrderJsonModel) (b080VarM95814a != null ? b080VarM95814a.get(str) : null);
        if (defaultShowSortOrderPreferences$SortOrderJsonModel != null) {
            int i = x6q.f258723a[defaultShowSortOrderPreferences$SortOrderJsonModel.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    cq31Var2 = cq31Var3;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cq31Var2 = cq31Var;
                }
            }
        } else {
            cq31Var2 = null;
        }
        cq31 cq31Var4 = g6f.m43725i0(listM46715L, cq31Var2) ? cq31Var2 : null;
        return cq31Var4 == null ? cq31Var : cq31Var4;
    }

    /* JADX INFO: renamed from: n */
    public static final String m92576n(un20 un20Var) {
        if (un20Var instanceof rzd1) {
            return ((rzd1) un20Var).f204133a;
        }
        if (un20Var instanceof dbv) {
            dbv dbvVar = (dbv) un20Var;
            return MessageFormat.format(dbvVar.getFormat(), dbvVar.mo35608a().f36234a);
        }
        if (un20Var instanceof ho20) {
            ho20 ho20Var = (ho20) un20Var;
            return klh.m56834f(ho20Var.f93432a, "\n", ho20Var.f93433b);
        }
        if (un20Var instanceof ky41) {
            return ((ky41) un20Var).f127651a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    public static voc1 m92577o() {
        return x92.f259259b;
    }

    /* JADX INFO: renamed from: p */
    public static final t050 m92578p(z8k z8kVar, hkk0 hkk0Var) {
        return ((b9k) z8kVar).m28489g("GoogleDeviceSuggestionsEngineDaemon", new ajk0(hkk0Var, 12));
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m92579q(p8e0 p8e0Var) {
        return (p8e0Var instanceof n8e0) && ((n8e0) p8e0Var).f151510a;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m92580r(Intent intent) {
        String path;
        Uri data = intent.getData();
        if (data == null || (path = data.getPath()) == null) {
            return false;
        }
        return bm51.m29796g0(wl51.m88494r1(path, '/'), "/account/parental-consent", false);
    }

    /* JADX INFO: renamed from: s */
    public static final fnc m92581s(fiz fizVar, long j) {
        return nxf1.m65828g(new C2004j6(fizVar, j, (fbk) null, 21));
    }
}
