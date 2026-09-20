package p204p;

import android.net.Uri;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class fqv {

    /* JADX INFO: renamed from: A */
    public final w5v f72262A;

    /* JADX INFO: renamed from: B */
    public final fin f72263B;

    /* JADX INFO: renamed from: a */
    public final dt01 f72264a;

    /* JADX INFO: renamed from: b */
    public final dsw0 f72265b;

    /* JADX INFO: renamed from: c */
    public final joa f72266c;

    /* JADX INFO: renamed from: d */
    public final c06 f72267d;

    /* JADX INFO: renamed from: e */
    public final z5f f72268e;

    /* JADX INFO: renamed from: f */
    public final pgq0 f72269f;

    /* JADX INFO: renamed from: g */
    public final C2557x2 f72270g;

    /* JADX INFO: renamed from: h */
    public final ya3 f72271h;

    /* JADX INFO: renamed from: i */
    public final lqv f72272i;

    /* JADX INFO: renamed from: j */
    public final u7q f72273j;

    /* JADX INFO: renamed from: k */
    public final u010 f72274k;

    /* JADX INFO: renamed from: l */
    public final iqp0 f72275l;

    /* JADX INFO: renamed from: m */
    public final oge0 f72276m;

    /* JADX INFO: renamed from: n */
    public final bmx f72277n;

    /* JADX INFO: renamed from: o */
    public final x1p0 f72278o;

    /* JADX INFO: renamed from: p */
    public final kkn f72279p;

    /* JADX INFO: renamed from: q */
    public final pla f72280q;

    /* JADX INFO: renamed from: r */
    public final mi80 f72281r;

    /* JADX INFO: renamed from: s */
    public final px0 f72282s;

    /* JADX INFO: renamed from: t */
    public final brc f72283t;

    /* JADX INFO: renamed from: u */
    public final C2529wd f72284u;

    /* JADX INFO: renamed from: v */
    public final ltx0 f72285v;

    /* JADX INFO: renamed from: w */
    public final e3p0 f72286w;

    /* JADX INFO: renamed from: x */
    public final ola f72287x;

    /* JADX INFO: renamed from: y */
    public final pla f72288y;

    /* JADX INFO: renamed from: z */
    public final np7 f72289z;

    public fqv(dt01 dt01Var, dsw0 dsw0Var, joa joaVar, c06 c06Var, z5f z5fVar, pgq0 pgq0Var, C2557x2 c2557x2, ya3 ya3Var, lqv lqvVar, u7q u7qVar, u010 u010Var, iqp0 iqp0Var, oge0 oge0Var, bmx bmxVar, x1p0 x1p0Var, kkn kknVar, pla plaVar, mi80 mi80Var, px0 px0Var, brc brcVar, C2529wd c2529wd, ltx0 ltx0Var, e3p0 e3p0Var, ola olaVar, pla plaVar2, np7 np7Var, w5v w5vVar, fin finVar) {
        this.f72264a = dt01Var;
        this.f72265b = dsw0Var;
        this.f72266c = joaVar;
        this.f72267d = c06Var;
        this.f72268e = z5fVar;
        this.f72269f = pgq0Var;
        this.f72270g = c2557x2;
        this.f72271h = ya3Var;
        this.f72272i = lqvVar;
        this.f72273j = u7qVar;
        this.f72274k = u010Var;
        this.f72275l = iqp0Var;
        this.f72276m = oge0Var;
        this.f72277n = bmxVar;
        this.f72278o = x1p0Var;
        this.f72279p = kknVar;
        this.f72280q = plaVar;
        this.f72281r = mi80Var;
        this.f72282s = px0Var;
        this.f72283t = brcVar;
        this.f72284u = c2529wd;
        this.f72285v = ltx0Var;
        this.f72286w = e3p0Var;
        this.f72287x = olaVar;
        this.f72288y = plaVar2;
        this.f72289z = np7Var;
        this.f72262A = w5vVar;
        this.f72263B = finVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0212  */
    /* JADX WARN: Code duplicated, block: B:109:0x0230  */
    /* JADX WARN: Code duplicated, block: B:111:0x0236  */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:159:0x030c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0321  */
    /* JADX WARN: Code duplicated, block: B:165:0x033b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0342  */
    /* JADX WARN: Code duplicated, block: B:170:0x0357 A[LOOP:0: B:168:0x0351->B:170:0x0357, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x037d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0391  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:204:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:207:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:211:0x040d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final Object m42441a(voc1 voc1Var, String str, cqv cqvVar, ibk ibkVar) {
        eqv eqvVar;
        yuk yukVar;
        Object obj;
        cqv cqvVar2;
        String str2;
        Object objM96567o;
        voc1 voc1Var2;
        cqv cqvVar3;
        String str3;
        gqv gqvVar;
        ha3 ha3Var;
        Object objM96567o2;
        cqv cqvVar4;
        ha3 ha3Var2;
        Map map;
        String str4;
        ?? r8;
        String str5;
        String str6;
        Uri uri;
        int i;
        int i2;
        ?? r12;
        String strM43753y0;
        ro80 ro80VarM44508o;
        boolean z;
        String str7;
        drj0 drj0Var;
        String str8;
        int iM38547C;
        int i3;
        gn80 gn80Var;
        gn80 gn80Var2;
        waz0 waz0Var;
        cqj0 cqj0Var;
        mr20 mr20Var;
        ArrayList arrayList;
        Iterator it;
        String str9;
        ArrayList arrayList2;
        fdk fdkVar;
        y5f y5fVar;
        boolean z2;
        String str10;
        uhw0 uhw0Var;
        f5k f5kVarM27662u;
        String str11;
        ?? r13;
        voc1 voc1Var3 = voc1Var;
        if (ibkVar instanceof eqv) {
            eqvVar = (eqv) ibkVar;
            int i4 = eqvVar.f61960h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eqvVar.f61960h = i4 - Integer.MIN_VALUE;
            } else {
                eqvVar = new eqv(this, ibkVar);
            }
        } else {
            eqvVar = new eqv(this, ibkVar);
        }
        eqv eqvVar2 = eqvVar;
        Object obj2 = eqvVar2.f61958f;
        int i5 = eqvVar2.f61960h;
        yuk yukVar2 = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(obj2);
            String str12 = voc1Var3.f243453a;
            String str13 = cqvVar.f40998a;
            String str14 = cqvVar.f41009l;
            eqvVar2.f61953a = voc1Var3;
            eqvVar2.f61954b = str;
            eqvVar2.f61955c = cqvVar;
            eqvVar2.f61960h = 1;
            yukVar = yukVar2;
            Object objM59773c = this.f72272i.m59773c(str, str12, str13, str14, eqvVar2);
            if (objM59773c != yukVar) {
                obj = objM59773c;
                cqvVar2 = cqvVar;
                str2 = str;
            }
            return yukVar;
        }
        if (i5 == 1) {
            cqv cqvVar5 = eqvVar2.f61955c;
            str2 = eqvVar2.f61954b;
            voc1 voc1Var4 = eqvVar2.f61953a;
            bga.m29073P(obj2);
            cqvVar2 = cqvVar5;
            voc1Var3 = voc1Var4;
            obj = obj2;
            yukVar = yukVar2;
        } else {
            if (i5 == 2) {
                gqv gqvVar2 = eqvVar2.f61956d;
                cqv cqvVar6 = eqvVar2.f61955c;
                str3 = eqvVar2.f61954b;
                voc1 voc1Var5 = eqvVar2.f61953a;
                bga.m29073P(obj2);
                gqvVar = gqvVar2;
                cqvVar3 = cqvVar6;
                objM96567o = obj2;
                yukVar = yukVar2;
                voc1Var2 = voc1Var5;
                ha3Var = (ha3) objM96567o;
                Single singleM95458a = this.f72268e.m95458a(voc1Var2.f243453a, Collections.singletonList(str3), false);
                eqvVar2.f61953a = voc1Var2;
                eqvVar2.f61954b = null;
                eqvVar2.f61955c = cqvVar3;
                eqvVar2.f61956d = gqvVar;
                eqvVar2.f61957e = ha3Var;
                eqvVar2.f61960h = 3;
                objM96567o2 = zn91.m96567o(singleM95458a, eqvVar2);
                if (objM96567o2 != yukVar) {
                    obj2 = objM96567o2;
                    cqvVar4 = cqvVar3;
                    ha3Var2 = ha3Var;
                }
                return yukVar;
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ha3Var2 = eqvVar2.f61957e;
            gqvVar = eqvVar2.f61956d;
            cqvVar4 = eqvVar2.f61955c;
            voc1Var2 = eqvVar2.f61953a;
            bga.m29073P(obj2);
        }
        map = (Map) obj2;
        boolean z3 = gqvVar.f83549p;
        str4 = gqvVar.f83537d;
        r8 = gqvVar.f83551r;
        str5 = gqvVar.f83545l;
        str6 = gqvVar.f83534a;
        String str15 = gqvVar.f83540g;
        uri = (z3 && !wl51.m88460J0(str15)) ? Uri.parse(str15) : Uri.EMPTY;
        i = gqvVar.f83552s;
        if (i == 0) {
            i2 = -1;
        } else {
            i2 = dqv.f52090a[edb.m38547C(i)];
        }
        if (i2 == -1) {
            r12 = r8;
            strM43753y0 = str5;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r12 = r8;
            strM43753y0 = str5;
        } else {
            strM43753y0 = g6f.m43753y0(r8, ", ", null, null, qov.f191050U0, 30);
            r13 = r8;
            if (strM43753y0.length() == 0) {
                r12 = r13;
                strM43753y0 = null;
                r12 = r13;
            }
        }
        r12 = r13;
        String str16 = gqvVar.f83539f;
        wj50.m88279p(uri);
        f4k f4kVar = new f4k(str16, new t3k(uri, y3k.f268958b), strM43753y0);
        ro80VarM44508o = geg1.m44508o();
        z = cqvVar4.f40999b;
        str7 = cqvVar4.f40998a;
        if (z && !gqvVar.f83549p && (str11 = gqvVar.f83543j) != null) {
            ro80VarM44508o.add(this.f72264a.m36792a(str11, str6));
        }
        if (cqvVar4.f41002e) {
            y5fVar = (y5f) map.get(str4);
            if (y5fVar != null) {
                z2 = y5fVar.f269419c;
            } else {
                z2 = false;
            }
            azp0 azp0VarM56737a = this.f72279p.m56737a(voc1Var2);
            if (!z2 && (f5kVarM27662u = azp0VarM56737a.m27662u(str4, str6, ha3Var2)) != null) {
                ro80VarM44508o.add(f5kVarM27662u);
            }
            f5k f5kVarM69908g = this.f72269f.m69908g(str4, str6, voc1Var2);
            str10 = voc1Var2.f243453a;
            ro80VarM44508o.add(f5kVarM69908g);
            Set set = dd41.f47702f;
            if (r46.m74710C(str10, dd41.f47703g) && !r46.m74708A(str10, gn80.PLAYLIST_RADIO)) {
                this.f72281r.getClass();
                if (str10.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str10.equals("spotify:collection:tracks") || str10.equals("spotify:internal:collection:tracks") || (bm51.m29803n0(str10, "spotify:user:", false) && bm51.m29796g0(str10, ":collection", false))) {
                    if (!str10.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                        uhw0Var = cqvVar4.f41008k;
                        if (uhw0Var instanceof shw0) {
                            ro80VarM44508o.add(this.f72275l.m51400n(((shw0) uhw0Var).f209283a, str4, str7, null));
                        }
                    }
                }
            } else if (!str10.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                uhw0Var = cqvVar4.f41008k;
                if ((uhw0Var instanceof shw0) && str7 != null) {
                    ro80VarM44508o.add(this.f72275l.m51400n(((shw0) uhw0Var).f209283a, str4, str7, null));
                }
            }
            if (wj50.m88271j(str10, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                ro80VarM44508o.add(this.f72278o.m89678p(str4));
            }
        }
        drj0Var = gqvVar.f83550q;
        str8 = gqvVar.f83544k;
        int i6 = gqvVar.f83548o;
        if (drj0Var != null) {
            str9 = drj0Var.f52344b;
            arrayList2 = drj0Var.f52345c;
            if (str9 != null) {
                ro80VarM44508o.add(this.f72283t.m30295a(voc1Var2.f243453a, str9, str4, cqvVar4.f40998a, !arrayList2.isEmpty()));
            } else if (arrayList2.isEmpty()) {
                fdkVar = drj0Var.f52347e;
                if (fdkVar != null && fdkVar.f68516a && drj0Var.f52346d && drj0Var.f52348f) {
                    ro80VarM44508o.add(this.f72282s.m71322d(voc1Var2.f243453a, str4, str7));
                }
            } else {
                ro80VarM44508o.add(this.f72284u.m87804v(voc1Var2.f243453a, str4, str7, arrayList2));
            }
        }
        Set set2 = dd41.f47702f;
        if (r46.m74708A(str4, gn80.CLIP) && gqvVar.f83547n) {
            ro80VarM44508o.add(new f5k("title_and_details", (wwu) wpu.f253840c, (c5k) null, Integer.valueOf(R.string.context_menu_title_and_details), (String) null, false, (p221) null, new e5k(x4k.f258140b, 1, new d5k(tl71.f221381h, new e151(str4, 20)), new zd61(21, str4, this.f72280q)), 244));
        }
        iM38547C = edb.m38547C(i6);
        int i7 = 4;
        if (iM38547C != 0) {
            i3 = 4;
        } else if (iM38547C != 1) {
            i3 = 1;
        } else {
            if (iM38547C == 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 0;
        }
        if (i3 != 0 && cqvVar4.f41003f && str8 != null && str5 != null) {
            ro80VarM44508o.add(this.f72266c.m53873a(i3, str8, str5));
        }
        if (cqvVar4.f41001d && i6 == 2 && !wj50.m88271j(voc1Var2.f243453a, str6)) {
            ro80VarM44508o.add(this.f72270g.m89693a(str6, gqvVar.f83535b, false));
        }
        if (r46.m74709B(str6, gn80.TRACK, gn80.TRACK_AUTOPLAY)) {
            if (str8 != null && str5 != null) {
                ro80VarM44508o.add(this.f72287x.m67284a(str8, str5, false));
            }
            if (r12.size() == 1) {
                ro80VarM44508o.add(this.f72288y.m70259a(((hqv) g6f.m43741q0(r12)).f94254a, ((hqv) g6f.m43741q0(r12)).f94255b));
            } else if (r12.size() > 1) {
                arrayList = new ArrayList(i6f.m49804T(r12, 10));
                it = r12.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hqv) it.next()).f94254a);
                }
                ro80VarM44508o.add(this.f72289z.m65286c(arrayList));
            }
        }
        Set set3 = dd41.f47702f;
        gn80Var = gn80.TRACK;
        gn80Var2 = gn80.TRACK_AUTOPLAY;
        if (r46.m74709B(str6, gn80Var, gn80Var2)) {
            ro80VarM44508o.add(this.f72262A.m87262a(str6));
        }
        if (r46.m74709B(str6, gn80Var, gn80Var2)) {
            ro80VarM44508o.add(this.f72263B.m41756e(str6));
        }
        ro80VarM44508o.add(this.f72267d.m31103q());
        if (cqvVar4.f41011n) {
            ro80VarM44508o.add(this.f72286w.m37692b());
        }
        waz0Var = cqvVar4.f41010m;
        if (waz0Var != null) {
            ro80VarM44508o.add(this.f72285v.m59913d(waz0Var));
        }
        if (cqvVar4.f41000c) {
            if (!r46.m74708A(str4, gn80.CLIP) && !r46.m74708A(str4, gn80.PODCAST_CHAPTER)) {
                str4 = str6;
            }
            ro80VarM44508o.add(this.f72265b.m36786c(str4, voc1Var2, nau.f152117a));
        }
        if (cqvVar4.f41005h) {
            ro80VarM44508o.add(this.f72273j.m82532d());
        }
        cqj0Var = cqvVar4.f41007j;
        if (cqj0Var != null) {
            if (cqj0Var.f40903a) {
                ro80VarM44508o.add(this.f72276m.m66887h(cqj0Var));
            } else {
                ro80VarM44508o.add(this.f72277n.m29908k(cqj0Var));
            }
        }
        mr20Var = cqvVar4.f41006i;
        if (mr20Var != null) {
            ro80VarM44508o.add(this.f72274k.m82094i(mr20Var));
        }
        return new g7k(f4kVar, geg1.m44506m(ro80VarM44508o), i7);
        gqv gqvVar3 = (gqv) obj;
        Single singleM93175i = this.f72271h.m93175i(str2);
        eqvVar2.f61953a = voc1Var3;
        eqvVar2.f61954b = str2;
        eqvVar2.f61955c = cqvVar2;
        eqvVar2.f61956d = gqvVar3;
        eqvVar2.f61960h = 2;
        objM96567o = zn91.m96567o(singleM93175i, eqvVar2);
        if (objM96567o != yukVar) {
            voc1Var2 = voc1Var3;
            cqvVar3 = cqvVar2;
            str3 = str2;
            gqvVar = gqvVar3;
            ha3Var = (ha3) objM96567o;
            Single singleM95458a2 = this.f72268e.m95458a(voc1Var2.f243453a, Collections.singletonList(str3), false);
            eqvVar2.f61953a = voc1Var2;
            eqvVar2.f61954b = null;
            eqvVar2.f61955c = cqvVar3;
            eqvVar2.f61956d = gqvVar;
            eqvVar2.f61957e = ha3Var;
            eqvVar2.f61960h = 3;
            objM96567o2 = zn91.m96567o(singleM95458a2, eqvVar2);
            if (objM96567o2 != yukVar) {
                obj2 = objM96567o2;
                cqvVar4 = cqvVar3;
                ha3Var2 = ha3Var;
                map = (Map) obj2;
                boolean z4 = gqvVar.f83549p;
                str4 = gqvVar.f83537d;
                r8 = gqvVar.f83551r;
                str5 = gqvVar.f83545l;
                str6 = gqvVar.f83534a;
                String str17 = gqvVar.f83540g;
                if (z4) {
                    uri = Uri.EMPTY;
                }
                i = gqvVar.f83552s;
                if (i == 0) {
                    i2 = -1;
                } else {
                    i2 = dqv.f52090a[edb.m38547C(i)];
                }
                if (i2 == -1) {
                    r12 = r8;
                    strM43753y0 = str5;
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r12 = r8;
                    strM43753y0 = str5;
                } else {
                    strM43753y0 = g6f.m43753y0(r8, ", ", null, null, qov.f191050U0, 30);
                    r13 = r8;
                    if (strM43753y0.length() == 0) {
                        r12 = r13;
                        strM43753y0 = null;
                        r12 = r13;
                    }
                }
                r12 = r13;
                String str18 = gqvVar.f83539f;
                wj50.m88279p(uri);
                f4k f4kVar2 = new f4k(str18, new t3k(uri, y3k.f268958b), strM43753y0);
                ro80VarM44508o = geg1.m44508o();
                z = cqvVar4.f40999b;
                str7 = cqvVar4.f40998a;
                if (z) {
                    ro80VarM44508o.add(this.f72264a.m36792a(str11, str6));
                }
                if (cqvVar4.f41002e) {
                    y5fVar = (y5f) map.get(str4);
                    if (y5fVar != null) {
                        z2 = y5fVar.f269419c;
                    } else {
                        z2 = false;
                    }
                    azp0 azp0VarM56737a2 = this.f72279p.m56737a(voc1Var2);
                    if (!z2) {
                        ro80VarM44508o.add(f5kVarM27662u);
                    }
                    f5k f5kVarM69908g2 = this.f72269f.m69908g(str4, str6, voc1Var2);
                    str10 = voc1Var2.f243453a;
                    ro80VarM44508o.add(f5kVarM69908g2);
                    Set set4 = dd41.f47702f;
                    if (r46.m74710C(str10, dd41.f47703g)) {
                        if (!str10.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                            uhw0Var = cqvVar4.f41008k;
                            if (uhw0Var instanceof shw0) {
                                ro80VarM44508o.add(this.f72275l.m51400n(((shw0) uhw0Var).f209283a, str4, str7, null));
                            }
                        }
                    } else if (!str10.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                        uhw0Var = cqvVar4.f41008k;
                        if (uhw0Var instanceof shw0) {
                            ro80VarM44508o.add(this.f72275l.m51400n(((shw0) uhw0Var).f209283a, str4, str7, null));
                        }
                    }
                    if (wj50.m88271j(str10, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
                        ro80VarM44508o.add(this.f72278o.m89678p(str4));
                    }
                }
                drj0Var = gqvVar.f83550q;
                str8 = gqvVar.f83544k;
                int i8 = gqvVar.f83548o;
                if (drj0Var != null) {
                    str9 = drj0Var.f52344b;
                    arrayList2 = drj0Var.f52345c;
                    if (str9 != null) {
                        ro80VarM44508o.add(this.f72283t.m30295a(voc1Var2.f243453a, str9, str4, cqvVar4.f40998a, !arrayList2.isEmpty()));
                    } else if (arrayList2.isEmpty()) {
                        ro80VarM44508o.add(this.f72284u.m87804v(voc1Var2.f243453a, str4, str7, arrayList2));
                    } else {
                        fdkVar = drj0Var.f52347e;
                        if (fdkVar != null) {
                            ro80VarM44508o.add(this.f72282s.m71322d(voc1Var2.f243453a, str4, str7));
                        }
                    }
                }
                Set set5 = dd41.f47702f;
                if (r46.m74708A(str4, gn80.CLIP)) {
                    ro80VarM44508o.add(new f5k("title_and_details", (wwu) wpu.f253840c, (c5k) null, Integer.valueOf(R.string.context_menu_title_and_details), (String) null, false, (p221) null, new e5k(x4k.f258140b, 1, new d5k(tl71.f221381h, new e151(str4, 20)), new zd61(21, str4, this.f72280q)), 244));
                }
                iM38547C = edb.m38547C(i8);
                int i9 = 4;
                if (iM38547C != 0) {
                    i3 = 4;
                } else if (iM38547C != 1) {
                    i3 = 1;
                } else {
                    if (iM38547C == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 0;
                }
                if (i3 != 0) {
                    ro80VarM44508o.add(this.f72266c.m53873a(i3, str8, str5));
                }
                if (cqvVar4.f41001d) {
                    ro80VarM44508o.add(this.f72270g.m89693a(str6, gqvVar.f83535b, false));
                }
                if (r46.m74709B(str6, gn80.TRACK, gn80.TRACK_AUTOPLAY)) {
                    if (str8 != null) {
                        ro80VarM44508o.add(this.f72287x.m67284a(str8, str5, false));
                    }
                    if (r12.size() == 1) {
                        ro80VarM44508o.add(this.f72288y.m70259a(((hqv) g6f.m43741q0(r12)).f94254a, ((hqv) g6f.m43741q0(r12)).f94255b));
                    } else if (r12.size() > 1) {
                        arrayList = new ArrayList(i6f.m49804T(r12, 10));
                        it = r12.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((hqv) it.next()).f94254a);
                        }
                        ro80VarM44508o.add(this.f72289z.m65286c(arrayList));
                    }
                }
                Set set6 = dd41.f47702f;
                gn80Var = gn80.TRACK;
                gn80Var2 = gn80.TRACK_AUTOPLAY;
                if (r46.m74709B(str6, gn80Var, gn80Var2)) {
                    ro80VarM44508o.add(this.f72262A.m87262a(str6));
                }
                if (r46.m74709B(str6, gn80Var, gn80Var2)) {
                    ro80VarM44508o.add(this.f72263B.m41756e(str6));
                }
                ro80VarM44508o.add(this.f72267d.m31103q());
                if (cqvVar4.f41011n) {
                    ro80VarM44508o.add(this.f72286w.m37692b());
                }
                waz0Var = cqvVar4.f41010m;
                if (waz0Var != null) {
                    ro80VarM44508o.add(this.f72285v.m59913d(waz0Var));
                }
                if (cqvVar4.f41000c) {
                    if (!r46.m74708A(str4, gn80.CLIP)) {
                        str4 = str6;
                    }
                    ro80VarM44508o.add(this.f72265b.m36786c(str4, voc1Var2, nau.f152117a));
                }
                if (cqvVar4.f41005h) {
                    ro80VarM44508o.add(this.f72273j.m82532d());
                }
                cqj0Var = cqvVar4.f41007j;
                if (cqj0Var != null) {
                    if (cqj0Var.f40903a) {
                        ro80VarM44508o.add(this.f72276m.m66887h(cqj0Var));
                    } else {
                        ro80VarM44508o.add(this.f72277n.m29908k(cqj0Var));
                    }
                }
                mr20Var = cqvVar4.f41006i;
                if (mr20Var != null) {
                    ro80VarM44508o.add(this.f72274k.m82094i(mr20Var));
                }
                return new g7k(f4kVar2, geg1.m44506m(ro80VarM44508o), i9);
            }
        }
        return yukVar;
    }
}
