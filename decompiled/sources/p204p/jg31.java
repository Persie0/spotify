package p204p;

import android.os.Bundle;
import com.comscore.streaming.ContentType;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public static final abz f112021a = new abz(15);

    /* JADX INFO: renamed from: b */
    public static sd40 f112022b;

    /* JADX INFO: renamed from: A */
    public static final j4z m53255A(ulu uluVar) {
        return new j4z(uluVar.f231642a, uluVar.f231643b, uluVar.f231644c);
    }

    /* JADX INFO: renamed from: B */
    public static final tlu m53256B(i4z i4zVar) {
        String str = i4zVar.f98661a;
        String str2 = i4zVar.f98662b;
        AbstractC2524w8<j4z> abstractC2524w8 = i4zVar.f98663c;
        ArrayList arrayList = new ArrayList(i6f.m49804T(abstractC2524w8, 10));
        for (j4z j4zVar : abstractC2524w8) {
            arrayList.add(new ulu(j4zVar.f108812a, j4zVar.f108813b, j4zVar.f108814c));
        }
        return new tlu(str, opo.m67546C(arrayList), str2, i4zVar.f98664d);
    }

    /* JADX INFO: renamed from: C */
    public static final z5a0 m53257C(bmm0 bmm0Var, Bundle bundle) {
        return new z5a0(bmm0Var, bundle);
    }

    /* JADX INFO: renamed from: D */
    public static final im91 m53258D(int i, int i2, yzl yzlVar) {
        return new im91(i, i2, yzlVar);
    }

    /* JADX INFO: renamed from: E */
    public static im91 m53259E(int i, int i2, bqs bqsVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bqsVar = iqs.f104839a;
        }
        return new im91(i, i2, bqsVar);
    }

    /* JADX INFO: renamed from: F */
    public static void m53260F(int i, int i2) {
        String strM81646t;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM81646t = tw41.m81646t("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
                }
                strM81646t = tw41.m81646t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM81646t);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m53261G(int i, int i2, int i3) {
        String strM53262H;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM53262H = m53262H(i, i3, "start index");
            } else {
                strM53262H = (i2 < 0 || i2 > i3) ? m53262H(i2, i3, "end index") : tw41.m81646t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM53262H);
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m53262H(int i, int i2, String str) {
        if (i < 0) {
            return tw41.m81646t("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return tw41.m81646t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: a */
    public static final void m53263a(bml bmlVar, boolean z, gh00 gh00Var, gh00 gh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1173235096);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(bmlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new glk(4, gh00Var2, bmlVar);
                xq00Var.m91793t0(objM91750T);
            }
            zn91.m96545d(fxh0Var, null, null, null, null, null, false, null, null, new peu(u40.f226523c, (eh00) objM91750T), null, rkk.m75772x(481101151, new ks1(bmlVar, z, gh00Var, 9), xq00Var), xq00Var, (i2 >> 12) & 14, 48, 1534);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2666zx(bmlVar, z, gh00Var, gh00Var2, fxh0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m53264b(int i, xq00 xq00Var, boolean z) {
        xq00Var.m91775k0(1490571587);
        int i2 = i | (xq00Var.m91768h(z) ? 4 : 2);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            ahf1.m25932d(k0e1.m54977L(R.string.age_assurance_parental_consent_changes_subheading, xq00Var), null, leu.m58818d(xq00Var).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            z520.m95435o(mru.f146615c, k0e1.m54977L(R.string.age_assurance_parental_consent_parental_controls, xq00Var), null, xq00Var, mru.f146616d);
            z520.m95435o(ytu.f276219c, k0e1.m54977L(R.string.age_assurance_parental_consent_music, xq00Var), null, xq00Var, ytu.f276220d);
            z520.m95435o(yqu.f275297c, k0e1.m54977L(R.string.age_assurance_parental_consent_social, xq00Var), null, xq00Var, yqu.f275298d);
            z520.m95435o(znu.f284555c, k0e1.m54977L(R.string.age_assurance_parental_consent_login, xq00Var), null, xq00Var, znu.f284556d);
            z520.m95435o(qmu.f190400c, k0e1.m54977L(R.string.age_assurance_parental_consent_free, xq00Var), null, xq00Var, qmu.f190401d);
            if (z) {
                xq00Var.m91771i0(-2009144964);
                z520.m95435o(vwu.f245554c, k0e1.m54977L(R.string.age_assurance_parental_consent_addons, xq00Var), null, xq00Var, vwu.f245555d);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-2009009463);
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(tfe.m80651i(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, xq00Var, R.string.age_assurance_parental_consent_same_subheading, xq00Var), null, leu.m58818d(xq00Var).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            z520.m95435o(wqu.f254172c, k0e1.m54977L(R.string.age_assurance_parental_consent_playlists, xq00Var), null, xq00Var, wqu.f254173d);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new op0(i, 24, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m53265c(bxb bxbVar, aum aumVar, vwf vwfVar, jxf jxfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        bxb bxbVar2;
        int i2;
        vwf vwfVar2 = vwfVar;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(46419795);
        if ((i & 6) == 0) {
            bxbVar2 = bxbVar;
            i2 = (xq00Var.m91770i(bxbVar2) ? 4 : 2) | i;
        } else {
            bxbVar2 = bxbVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(aumVar) : xq00Var.m91770i(aumVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(vwfVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91762e(jxfVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == obj) {
                switch (aumVar.f19983a) {
                    case 0:
                        dum dumVar = (dum) ((xrm) aumVar.f19984b).f265375c;
                        objM91750T = new uwf((bum) dumVar.f53111H1.get(), new c730((idd1) dumVar.f53174g.get(), 4));
                        break;
                    default:
                        ccn ccnVar = (ccn) ((zbn) aumVar.f19984b).f281351c;
                        objM91750T = new uwf((bum) ccnVar.f36458H1.get(), new c730((idd1) ccnVar.f36524g.get(), 4));
                        break;
                }
                xq00Var.m91793t0(objM91750T);
            }
            uwf uwfVar = (uwf) objM91750T;
            LinkedHashMap linkedHashMap = uwfVar.f234647c;
            Object objM30575a = linkedHashMap.get(vwfVar2);
            fbk fbkVar = null;
            if (objM30575a == null) {
                objM30575a = uwfVar.f234645a.m30575a(uwfVar.f234646b, null, null);
                linkedHashMap.put(vwfVar2, objM30575a);
            }
            bxbVar2.m30791e(((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 8 | ((i3 >> 6) & 896) | ((i3 << 9) & 7168), ((jv50) objM30575a).f116265d, vwfVar2, xq00Var, fxh0Var);
            vwfVar2 = vwfVar2;
            LinkedHashMap linkedHashMap2 = uwfVar.f234647c;
            for (vwf vwfVar3 : s601.m77304g0(vwfVar2, linkedHashMap2.keySet())) {
                jv50 jv50Var = (jv50) linkedHashMap2.get(vwfVar3);
                if (jv50Var != null) {
                    jv50Var.m54371a(jxf.f117122a);
                }
                zn91.m96561l(linkedHashMap2).remove(vwfVar3);
            }
            uwfVar.f234648d = vwfVar2;
            jxf jxfVar2 = uwfVar.f234649e;
            LinkedHashMap linkedHashMap3 = uwfVar.f234647c;
            Object objM30575a2 = linkedHashMap3.get(vwfVar2);
            if (objM30575a2 == null) {
                objM30575a2 = uwfVar.f234645a.m30575a(uwfVar.f234646b, null, null);
                linkedHashMap3.put(vwfVar2, objM30575a2);
            }
            ((jv50) objM30575a2).m54371a(jxfVar2);
            boolean zM91770i = xq00Var.m91770i(uwfVar) | ((i3 & 7168) == 2048);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new eqv0(uwfVar, jxfVar, fbkVar, 4);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(jxfVar, (th00) objM91750T2, xq00Var);
            boolean zM91770i2 = xq00Var.m91770i(uwfVar) | xq00Var.m91770i(vwfVar2);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                objM91750T3 = new y3w0(21, uwfVar, vwfVar2);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49233e(vwfVar2, (gh00) objM91750T3, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r0r0(bxbVar, aumVar, vwfVar2, jxfVar, fxh0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final w05 m53266d(tm91 tm91Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (w05) tm91Var.f221637a.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static final jd21 m53267e(gd70 gd70Var) {
        d6a1 d6a1VarMo35108F0 = gd70Var.mo35108F0();
        jd21 jd21Var = d6a1VarMo35108F0 instanceof jd21 ? (jd21) d6a1VarMo35108F0 : null;
        if (jd21Var != null) {
            return jd21Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + gd70Var).toString());
    }

    /* JADX INFO: renamed from: f */
    public static void m53268f(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: g */
    public static void m53269g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m53270h(v94 v94Var, String str, Class cls) {
        if (v94Var == null) {
            if (!str.contains("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
            }
            if (str.indexOf("%s") != str.lastIndexOf("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            throw new NullPointerException(str.replace("%s", String.valueOf(cls.getCanonicalName())));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m53271i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m53272j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX INFO: renamed from: k */
    public static ys30 m53273k(ys30 ys30Var, ys30 ys30Var2) {
        ys30Var.getClass();
        ys30Var2.getClass();
        abz abzVar = f112021a;
        if (ys30Var == abzVar) {
            return ys30Var2;
        }
        return ys30Var2 == abzVar ? ys30Var : new us30(0, ys30Var, ys30Var2);
    }

    /* JADX INFO: renamed from: l */
    public static final ep41 m53274l(w9z w9zVar, long j) {
        return new ep41(w9zVar, j);
    }

    /* JADX INFO: renamed from: n */
    public static cp40 m53275n(tks tksVar, int i, long j, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return new cp40(tksVar, i, j);
    }

    /* JADX INFO: renamed from: o */
    public static final c070 m53276o(gh00 gh00Var) {
        b070 b070Var = new b070();
        gh00Var.invoke(b070Var);
        return new c070(b070Var);
    }

    /* JADX INFO: renamed from: p */
    public static xlg0 m53277p() {
        return new xlg0(13, (byte) 0);
    }

    /* JADX INFO: renamed from: q */
    public static final EventSource m53278q(voi voiVar, q5l0 q5l0Var, mcu0 mcu0Var, r7p r7pVar, ObservableFromPublisher observableFromPublisher, mb80 mb80Var) {
        s5p s5pVar = (s5p) voiVar;
        return RxEventSources.m15655a(s5pVar.m77299i().distinctUntilChanged().map(zzx.f288129Q0), Observable.combineLatest(s5pVar.m77297d(), k0e1.m54988g(new b7g0(mb80Var.f141817b.current(), 28), dau.f47107a), dzx.f54772R0), q5l0Var.f185563a.map(mzx.f148810R0), mcu0Var.m61496c().distinctUntilChanged().map(a0y.f11189S0), r7pVar.f196629e.distinctUntilChanged().map(b0y.f22129S0), observableFromPublisher.map(a7j0.f13076c));
    }

    /* JADX INFO: renamed from: r */
    public static final f9f m53279r(ArtworkView artworkView, mu61 mu61Var) {
        f9f f9fVar = (f9f) artworkView.getTag(R.id.encore_spotify_picasso_target);
        if (f9fVar == null) {
            f9fVar = new f9f(artworkView);
            artworkView.setTag(R.id.encore_spotify_picasso_target, f9fVar);
        }
        f9fVar.f67264b = mu61Var;
        return f9fVar;
    }

    /* JADX INFO: renamed from: s */
    public static ys30 m53280s(ys30 ys30Var) {
        abz abzVar = f112021a;
        if (ys30Var == abzVar) {
            return abzVar;
        }
        return ys30Var instanceof xs30 ? ys30Var : new xs30(ys30Var);
    }

    /* JADX INFO: renamed from: t */
    public static final jd21 m53281t(jd21 jd21Var, List list, gn91 gn91Var) {
        if (list.isEmpty() && gn91Var == jd21Var.mo36062B0()) {
            return jd21Var;
        }
        if (list.isEmpty()) {
            return jd21Var.mo35111I0(gn91Var);
        }
        if (!(jd21Var instanceof zgw)) {
            return pug1.m71084p(list, gn91Var, jd21Var.mo36063C0(), jd21Var.mo36064D0());
        }
        zgw zgwVar = (zgw) jd21Var;
        jn91 jn91Var = zgwVar.f282719b;
        ggw ggwVar = zgwVar.f282720c;
        chw chwVar = zgwVar.f282721d;
        boolean z = zgwVar.f282723f;
        String[] strArr = zgwVar.f282724g;
        return new zgw(jn91Var, ggwVar, chwVar, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: u */
    public static gd70 m53282u(gd70 gd70Var, List list, l25 l25Var, int i) {
        if ((i & 2) != 0) {
            l25Var = gd70Var.getAnnotations();
        }
        if ((list.isEmpty() || list == gd70Var.mo36061A0()) && l25Var == gd70Var.getAnnotations()) {
            return gd70Var;
        }
        gn91 gn91VarMo36062B0 = gd70Var.mo36062B0();
        if ((l25Var instanceof y6z) && ((y6z) l25Var).isEmpty()) {
            l25Var = e370.f55667h;
        }
        gn91 gn91VarM62005I = mjx0.m62005I(gn91VarMo36062B0, l25Var);
        d6a1 d6a1VarMo35108F0 = gd70Var.mo35108F0();
        if (d6a1VarMo35108F0 instanceof dhz) {
            dhz dhzVar = (dhz) d6a1VarMo35108F0;
            return pug1.m71080k(m53281t(dhzVar.f49189b, list, gn91VarM62005I), m53281t(dhzVar.f49190c, list, gn91VarM62005I));
        }
        if (d6a1VarMo35108F0 instanceof jd21) {
            return m53281t((jd21) d6a1VarMo35108F0, list, gn91VarM62005I);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ jd21 m53283v(jd21 jd21Var, List list, gn91 gn91Var, int i) {
        if ((i & 1) != 0) {
            list = jd21Var.mo36061A0();
        }
        if ((i & 2) != 0) {
            gn91Var = jd21Var.mo36062B0();
        }
        return m53281t(jd21Var, list, gn91Var);
    }

    /* JADX INFO: renamed from: w */
    public static ha31 m53284w() {
        return new ha31(0);
    }

    /* JADX INFO: renamed from: x */
    public static final pg41 m53285x(float f, float f2, Object obj) {
        return new pg41(f, f2, obj);
    }

    /* JADX INFO: renamed from: y */
    public static pg41 m53286y(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new pg41(f, f2, obj);
    }

    /* JADX INFO: renamed from: z */
    public static final i4z m53287z(tlu tluVar) {
        String str = tluVar.f221523a;
        String str2 = tluVar.f221524b;
        List list = tluVar.f221525c;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m53255A((ulu) it.next()));
        }
        return new i4z(str, str2, opo.m67546C(arrayList), tluVar.f221526d);
    }

    /* JADX INFO: renamed from: m */
    public abstract String mo51879m();
}
