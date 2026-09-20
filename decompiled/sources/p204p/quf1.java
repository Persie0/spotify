package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.highlightsstats.Person;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.PositionChangeLabel;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.SocialStatsItem;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.Stats;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.StatsItem;
import com.spotify.lockstate.lockedscreen.data.LockStateResolutionException;
import com.spotify.lockstate.p104v1.proto.Action;
import com.spotify.lockstate.p104v1.proto.ActionableButton;
import com.spotify.lockstate.p104v1.proto.Callback;
import com.spotify.lockstate.p104v1.proto.ColumnLayout;
import com.spotify.lockstate.p104v1.proto.Lock;
import com.spotify.lockstate.p104v1.proto.LockLayout;
import com.spotify.lockstate.p104v1.proto.LockSection;
import com.spotify.lockstate.p104v1.proto.NavigateTo;
import com.spotify.lockstate.p104v1.proto.SectionedLayout;
import com.spotify.lockstate.p104v1.proto.ShowBottomSheet;
import com.spotify.lockstate.p104v1.proto.ShowDialog;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class quf1 {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f192702a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public static sd40 f192703b;

    /* JADX INFO: renamed from: c */
    public static sd40 f192704c;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static final void m73909a(v16 v16Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1529214236);
        int i2 = i | (xq00Var.m91766g(v16Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = v16Var.f236261a;
            String strM54977L = k0e1.m54977L(R.string.artist_picker_bottom_sheet_title, xq00Var);
            ?? r10 = v16Var.f236262b;
            ArrayList arrayList = new ArrayList(i6f.m49804T(r10, 10));
            for (q16 q16Var : r10) {
                arrayList.add(new b26(q16Var.f184218c, q16Var.f184216a, q16Var.f184217b));
            }
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z2 = i3 == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new ew5(5, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            boolean z3 = i3 == 32;
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == ia7Var) {
                objM91750T2 = new C1902gm(10, gh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            kuf1.m57391a(z, strM54977L, arrayList, eh00Var, (th00) objM91750T2, cxh0Var, xq00Var, 196608, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz4(v16Var, gh00Var, fxh0Var2, i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m73910b(int i, int i2, wwu wwuVar, xq00 xq00Var) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(571631559);
        int i3 = ((i2 & 8) == 0 ? xq00Var2.m91766g(wwuVar) : xq00Var2.m91770i(wwuVar) ? 4 : 2) | i2 | (xq00Var2.m91762e(i) ? 32 : 16);
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224763f), d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            y85.m93057b(wwuVar, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159605c, cxh0Var), 0L, 0L, false, xq00Var2, 56 | (i3 & 14), 56);
            String strM54977L = k0e1.m54977L(i, xq00Var2);
            if71 if71Var = leu.m58818d(xq00Var2).f64974j;
            if (!(((double) 1.0f) > 0.0d)) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            xq00Var2 = xq00Var;
            ahf1.m25932d(strM54977L, new cr70(1.0f, true), if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2040);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new obd(wwuVar, i, i2, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m73911c(jy40 jy40Var, my40 my40Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-143712012);
        int i2 = 2;
        int i3 = i | (xq00Var2.m91766g(jy40Var) ? 4 : 2) | (xq00Var2.m91766g(my40Var) ? 32 : 16) | (xq00Var2.m91770i(fxh0Var) ? 256 : 128);
        int i4 = 0;
        int i5 = 1;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            fxh0 fxh0VarM39673I = epv0.m39673I(jy40Var.f117291d, fxh0Var);
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224764g), d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            ky40 ky40Var = jy40Var.f117288a;
            gy40 gy40Var = jy40Var.f117289b;
            int i6 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z = i6 == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new cy40(my40Var, i4);
                xq00Var2.m91793t0(objM91750T);
            }
            uuf1.m83986f(ky40Var, gy40Var, (th00) objM91750T, null, xq00Var2, 0);
            ky40 ky40Var2 = jy40Var.f117288a;
            iy40 iy40Var = jy40Var.f117290c;
            boolean z2 = i6 == 32;
            Object objM91750T2 = xq00Var2.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new cy40(my40Var, i5);
                xq00Var2.m91793t0(objM91750T2);
            }
            th00 th00Var = (th00) objM91750T2;
            i4 = i6 == 32 ? 1 : 0;
            Object objM91750T3 = xq00Var2.m91750T();
            if (i4 != 0 || objM91750T3 == ia7Var) {
                objM91750T3 = new cy40(my40Var, i2);
                xq00Var2.m91793t0(objM91750T3);
            }
            cvf1.m34040c(ky40Var2, iy40Var, th00Var, (th00) objM91750T3, mi21.m61820d(1.0f, zsf1.m96866z(cxh0.f43038a, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224761d)), xq00Var2, 0);
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts00(jy40Var, my40Var, fxh0Var, i, 27);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m73912d(int i, xq00 xq00Var) {
        xq00Var.m91775k0(-158009989);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0.f43038a), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1);
            ub9 ub9Var = d7f0.f46145P0;
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224765h), ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A);
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
            m73910b(R.string.settings_private_session_explainer_bullet_1, you.f274735d, you.f274734c, xq00Var);
            m73910b(R.string.settings_private_session_explainer_bullet_2, juu.f116173d, juu.f116172c, xq00Var);
            m73910b(R.string.settings_private_session_explainer_bullet_3, ypu.f275031d, ypu.f275030c, xq00Var);
            m73910b(R.string.settings_private_session_explainer_bullet_4, svu.f214510d, svu.f214509c, xq00Var);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zej0(i, 26);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final tz41 m73913e(k051 k051Var) {
        switch (k051Var.ordinal()) {
            case 1:
                return tz41.f225143d;
            case 2:
                return tz41.f225145f;
            case 3:
                return tz41.f225144e;
            case 4:
                return tz41.f225146g;
            case 5:
                return tz41.f225147h;
            case 6:
                return tz41.f225148i;
            default:
                return tz41.f225142c;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final LinkedHashMap m73914f(Stats stats) {
        ae50<StatsItem> ae50VarM11425s = stats.m11425s();
        int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM11425s, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (StatsItem statsItem : ae50VarM11425s) {
            tz41 tz41VarM73913e = m73913e(statsItem.m11450r());
            tz41 tz41VarM73913e2 = m73913e(statsItem.m11450r());
            String strM11448p = statsItem.m11448p();
            fuz0 fuz0VarM40079a = euz0.m40079a(statsItem.m11449q());
            String imageUrl = statsItem.getImageUrl();
            wj50.m88279p(imageUrl);
            if (wl51.m88460J0(imageUrl)) {
                imageUrl = null;
            }
            linkedHashMap.put(tz41VarM73913e, new vz41(tz41VarM73913e2, strM11448p, fuz0VarM40079a, imageUrl, m73922n(statsItem.m11447o()), statsItem.m11446n(), stats.m11424r().m11428p() != b051.STATS_AVAILABLE ? 2 : 1));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    public static void m73915g(bb41 bb41Var, zsr zsrVar) {
        bb41Var.f134101a = zsrVar;
    }

    /* JADX INFO: renamed from: h */
    public static String m73916h(xxd xxdVar, nd60 nd60Var) {
        if (xxdVar.mo28860a(nd60Var)) {
            return null;
        }
        return xxdVar.getDescription();
    }

    /* JADX INFO: renamed from: i */
    public static final qz41 m73917i(Stats stats, String str, int i, String str2, boolean z) {
        Map mapM73914f;
        cmn0 cmn0Var = new cmn0(i);
        int i2 = z ? 2 : 1;
        if (z) {
            mec0 mec0Var = new mec0();
            mec0Var.putAll(m73914f(stats));
            ae50 ae50VarM11423q = stats.m11423q();
            int i3 = 10;
            int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM11423q, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            Iterator it = ae50VarM11423q.iterator();
            while (it.hasNext()) {
                SocialStatsItem socialStatsItem = (SocialStatsItem) it.next();
                tz41 tz41VarM73913e = m73913e(socialStatsItem.m11416u());
                tz41 tz41VarM73913e2 = m73913e(socialStatsItem.m11416u());
                String strM11412q = socialStatsItem.m11412q();
                fuz0 fuz0VarM40079a = euz0.m40079a(socialStatsItem.m11415t());
                if (!socialStatsItem.m11419x()) {
                    fuz0VarM40079a = null;
                }
                ae50 ae50VarM11413r = socialStatsItem.m11413r();
                ArrayList arrayList = new ArrayList();
                for (Object obj : ae50VarM11413r) {
                    String str3 = (String) obj;
                    wj50.m88279p(str3);
                    if (!wl51.m88460J0(str3)) {
                        arrayList.add(obj);
                    }
                }
                String strM11411p = socialStatsItem.m11411p();
                duf dufVarM73922n = m73922n(socialStatsItem.m11410o());
                if (!socialStatsItem.m11417v()) {
                    dufVarM73922n = null;
                }
                if (dufVarM73922n == null) {
                    dufVarM73922n = buf.f31129a;
                }
                duf dufVar = dufVarM73922n;
                String strM11409n = socialStatsItem.m11409n();
                String strM11409n2 = socialStatsItem.m11409n();
                fuz0 fuz0VarM40079a2 = (socialStatsItem.m11418w() && socialStatsItem.m11414s().m11408q()) ? euz0.m40079a(socialStatsItem.m11414s().m11407p()) : null;
                ae50<Person> ae50VarM11406o = socialStatsItem.m11414s().m11406o();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM11406o, i3));
                for (Person person : ae50VarM11406o) {
                    arrayList2.add(new yz41(person.m11289q(), person.getName()));
                    it = it;
                }
                linkedHashMap.put(tz41VarM73913e, new wz41(tz41VarM73913e2, strM11412q, fuz0VarM40079a, arrayList, dufVar, strM11409n, strM11409n2, fuz0VarM40079a2, arrayList2, strM11411p, false, 1024));
                it = it;
                i3 = 10;
            }
            mec0Var.putAll(linkedHashMap);
            mapM73914f = mec0Var.m61540b();
        } else {
            mapM73914f = m73914f(stats);
        }
        return new qz41(str, cmn0Var, mapM73914f, str2, i2);
    }

    /* JADX INFO: renamed from: j */
    public static final vf21 m73918j(pqm0 pqm0Var) {
        Object obj = pqm0Var.f180350a;
        vf21 vf21Var = new vf21((w3t0) obj);
        vf21Var.m85340R((w3t0) obj, pqm0Var.f180351b);
        return vf21Var;
    }

    /* JADX INFO: renamed from: k */
    public static j6f0 m73919k(d5y d5yVar, boolean z, boolean z2) {
        abz abzVar;
        if (z) {
            abzVar = z2 ? rz30.f204049d : null;
        } else {
            abzVar = rz30.f204048c;
        }
        j6f0 j6f0VarM95387D = new z4y().m95387D(d5yVar, abzVar, 0);
        if (j6f0VarM95387D == null || j6f0VarM95387D.f109303a.length == 0) {
            return null;
        }
        return j6f0VarM95387D;
    }

    /* JADX INFO: renamed from: l */
    public static tey m73920l(l2n0 l2n0Var) {
        l2n0Var.m57931S(1);
        int iM57920H = l2n0Var.m57920H();
        long j = ((long) l2n0Var.f129055b) + ((long) iM57920H);
        int i = iM57920H / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM57953y = l2n0Var.m57953y();
            if (jM57953y == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM57953y;
            jArrCopyOf2[i2] = l2n0Var.m57953y();
            l2n0Var.m57931S(2);
        }
        l2n0Var.m57931S((int) (j - ((long) l2n0Var.f129055b)));
        return new tey(3, jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: m */
    public static final ArrayList m73921m(List list) {
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    /* JADX INFO: renamed from: n */
    public static final duf m73922n(PositionChangeLabel positionChangeLabel) {
        int i = a051.f10996a[positionChangeLabel.m11399n().ordinal()];
        if (i == 1) {
            return new cuf(positionChangeLabel.m11400p());
        }
        if (i == 2) {
            return new ztf(positionChangeLabel.m11400p());
        }
        if (i == 3) {
            return auf.f19927a;
        }
        buf bufVar = buf.f31129a;
        if (i != 4) {
            na6.m63971s("Unknown change type, defaulting to None. ChangeType: " + positionChangeLabel.m11399n());
        }
        return bufVar;
    }

    /* JADX INFO: renamed from: o */
    public static final rma0 m73923o(Action action) throws LockStateResolutionException {
        whg1 u8j0Var;
        if (action.m13204u()) {
            return lma0.f134840a;
        }
        if (action.m13205v()) {
            NavigateTo navigateToM13199p = action.m13199p();
            if (navigateToM13199p.m13255p().m13278q()) {
                u8j0Var = new t8j0(navigateToM13199p.m13255p().m13276o());
            } else {
                if (!navigateToM13199p.m13255p().m13279r()) {
                    throw new LockStateResolutionException(2);
                }
                u8j0Var = new u8j0(navigateToM13199p.m13255p().m13277p());
            }
            return new oma0(u8j0Var, navigateToM13199p.m13254n());
        }
        if (action.m13202s()) {
            Callback callbackM13198n = action.m13198n();
            return new jma0(callbackM13198n.getPath(), callbackM13198n.m13221s() ? m73923o(callbackM13198n.m13219q()) : null, callbackM13198n.m13220r() ? m73923o(callbackM13198n.m13218p()) : null, callbackM13198n.m13217n());
        }
        if (action.m13207x()) {
            ShowDialog showDialogM13201r = action.m13201r();
            return new qma0(showDialogM13201r.getTitle(), showDialogM13201r.getMessage(), showDialogM13201r.m13273q() ? m73924p(showDialogM13201r.m13271n()) : new cna0(), showDialogM13201r.m13274r() ? m73924p(showDialogM13201r.m13272p()) : new cna0());
        }
        if (!action.m13206w()) {
            return action.m13203t() ? kma0.f124095a : nma0.f155391a;
        }
        ShowBottomSheet showBottomSheetM13200q = action.m13200q();
        String strM13263n = showBottomSheetM13200q.m13266r() ? showBottomSheetM13200q.m13263n() : null;
        String strM13265q = showBottomSheetM13200q.m13267s() ? showBottomSheetM13200q.m13265q() : null;
        String title = showBottomSheetM13200q.m13269u() ? showBottomSheetM13200q.getTitle() : null;
        String subtitle = showBottomSheetM13200q.m13268t() ? showBottomSheetM13200q.getSubtitle() : null;
        ae50<ActionableButton> ae50VarM13264o = showBottomSheetM13200q.m13264o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM13264o, 10));
        for (ActionableButton actionableButton : ae50VarM13264o) {
            wj50.m88279p(actionableButton);
            arrayList.add(m73924p(actionableButton));
        }
        return new pma0(strM13263n, strM13265q, title, subtitle, arrayList);
    }

    /* JADX INFO: renamed from: p */
    public static final cna0 m73924p(ActionableButton actionableButton) {
        return new cna0(actionableButton.m13212r(), actionableButton.m13213s() ? m73923o(actionableButton.m13209n()) : nma0.f155391a, actionableButton.m13214t() ? actionableButton.m13210p() : null, actionableButton.m13215u() ? actionableButton.m13211q() : null);
    }

    /* JADX INFO: renamed from: q */
    public static final dna0 m73925q(Lock lock) throws LockStateResolutionException {
        ina0 baz0Var;
        if (!lock.m13244s()) {
            throw new LockStateResolutionException(2);
        }
        String strM13242q = lock.m13242q();
        LockLayout lockLayoutM13241p = lock.m13241p();
        if (lockLayoutM13241p.m13248q()) {
            ColumnLayout columnLayoutM13246n = lockLayoutM13241p.m13246n();
            baz0Var = new x9f(columnLayoutM13246n.m13229u() ? columnLayoutM13246n.m13223n() : null, columnLayoutM13246n.m13231w() ? columnLayoutM13246n.m13225q() : null, columnLayoutM13246n.getTitle(), columnLayoutM13246n.getSubtitle(), m73924p(columnLayoutM13246n.m13226r()), columnLayoutM13246n.m13232x() ? m73924p(columnLayoutM13246n.m13227s()) : null, columnLayoutM13246n.m13233y() ? m73924p(columnLayoutM13246n.m13228t()) : null, columnLayoutM13246n.m13230v() ? m73924p(columnLayoutM13246n.m13224p()) : null);
        } else {
            if (!lockLayoutM13241p.m13249r()) {
                throw new LockStateResolutionException(2);
            }
            SectionedLayout sectionedLayoutM13247p = lockLayoutM13241p.m13247p();
            String strM13257n = sectionedLayoutM13247p.m13260r() ? sectionedLayoutM13247p.m13257n() : null;
            String title = sectionedLayoutM13247p.getTitle();
            String strM13259q = sectionedLayoutM13247p.m13261s() ? sectionedLayoutM13247p.m13259q() : null;
            ae50<LockSection> ae50VarM13258p = sectionedLayoutM13247p.m13258p();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM13258p, 10));
            for (LockSection lockSection : ae50VarM13258p) {
                wj50.m88279p(lockSection);
                String strM13252p = lockSection.m13252p();
                String strM13250n = lockSection.m13250n();
                ae50<ActionableButton> ae50VarM13251o = lockSection.m13251o();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM13251o, 10));
                for (ActionableButton actionableButton : ae50VarM13251o) {
                    wj50.m88279p(actionableButton);
                    arrayList2.add(m73924p(actionableButton));
                }
                arrayList.add(new toa0(strM13252p, strM13250n, arrayList2));
            }
            baz0Var = new baz0(strM13257n, title, strM13259q, arrayList);
        }
        return new dna0(strM13242q, baz0Var, lock.m13243r() ? m73923o(lock.m13240n()) : nma0.f155391a);
    }

    /* JADX INFO: renamed from: r */
    public static Next m73926r(yuf0 yuf0Var, jof0 jof0Var) {
        int iM38547C = edb.m38547C(jof0Var.f114418a);
        ash0 ash0Var = ash0.f19458a;
        if (iM38547C == 0) {
            return Next.m15606h(yuf0.m94655c(yuf0Var, ash0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -9, AudioDriver.SPOTIFY_MAX_VOLUME));
        }
        if (iM38547C == 1) {
            return fem.m41467p(yuf0Var) ? Next.m15607i(yuf0.m94655c(yuf0Var, ash0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -9, AudioDriver.SPOTIFY_MAX_VOLUME), Collections.singleton(new lmf0(new vhr(1)))) : Next.m15607i(yuf0.m94655c(yuf0Var, ash0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -9, AudioDriver.SPOTIFY_MAX_VOLUME), Collections.singleton(new slf0(jof0Var.f114419b)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: s */
    public static void m73927s(int i, int i2) {
        String strM62931q;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM62931q = mvf1.m62931q("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
                }
                strM62931q = mvf1.m62931q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM62931q);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m73928t(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m73930v(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m73929u(int i, int i2, int i3) {
        String strM73930v;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM73930v = m73930v(i, i3, "start index");
            } else {
                strM73930v = (i2 < 0 || i2 > i3) ? m73930v(i2, i3, "end index") : mvf1.m62931q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM73930v);
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m73930v(int i, int i2, String str) {
        if (i < 0) {
            return mvf1.m62931q("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return mvf1.m62931q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
    }
}
