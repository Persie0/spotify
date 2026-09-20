package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;
import com.spotify.playlistmixing.proto.BackendTransition;
import com.spotify.playlistmixing.proto.ExplicitFeedback;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase_Impl;
import com.spotify.search.historyroom.p147db.HistoryDatabase_Impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class si20 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f209346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si20(Object obj, int i) {
        super(0);
        this.f209345a = i;
        this.f209346b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0240  */
    /* JADX WARN: Code duplicated, block: B:170:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:173:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:182:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:185:0x0402  */
    /* JADX WARN: Code duplicated, block: B:187:0x0408  */
    /* JADX WARN: Code duplicated, block: B:190:0x0415  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0237  */
    @Override // p204p.eh00
    public final Object invoke() {
        b791 b791Var;
        String str;
        b791 b791VarM75016a;
        b791 b791VarM28366c;
        b791 b791Var2;
        String str2;
        List list;
        mky mkyVar;
        boolean z;
        String str3;
        Float fValueOf;
        String str4;
        Float fValueOf2;
        Float fM29806q0;
        float fFloatValue;
        noa1 noa1Var;
        b791 b791Var3;
        Map map;
        noa1 noa1Var2;
        int i = this.f209345a;
        int i2 = 3;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f209346b;
        switch (i) {
            case 0:
                lqi0 lqi0Var = ((ui20) obj).f230579g;
                Boolean bool = Boolean.TRUE;
                zv41 zv41Var = (zv41) lqi0Var;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                return w2a1Var;
            case 1:
                sf20 sf20Var = (sf20) obj;
                if (sf20Var != null) {
                    zv41 zv41Var2 = (zv41) sf20Var.f208451h;
                    Boolean bool2 = Boolean.TRUE;
                    zv41Var2.getClass();
                    zv41Var2.m97091m(null, bool2);
                }
                return w2a1Var;
            case 2:
                wk20 wk20Var = (wk20) obj;
                vml vmlVar = wk20Var.f252103a;
                s44 s44Var = wk20Var.f252110h;
                int iM38547C = edb.m38547C(vmlVar.f242869b);
                w811 w811Var = w811.f248822a;
                gbu gbuVar = gbu.f78413a;
                w811 w811Var2 = w811.f248823b;
                if (iM38547C != 0) {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z2 = wk20Var.f252109g;
                    a7f0 a7f0Var = new a7f0(w811Var2, gbuVar);
                    pg20 pg20Var = new pg20(new a7f0(w811Var, gbuVar), new a7f0(kn7.f124318a, gbuVar), z2 ? null : a7f0Var, null, 24);
                    if (!z2) {
                        a7f0Var = null;
                    }
                    return new fi20(new wg20(pg20Var, null, a7f0Var), null, null, null);
                }
                boolean z3 = wk20Var.f252108f;
                boolean zM77164f = s44Var.m77164f();
                boolean zM77182x = s44Var.m77182x();
                boolean zM77177s = s44Var.m77177s();
                a7f0 a7f0Var2 = new a7f0(w811Var2, gbuVar);
                a7f0 a7f0Var3 = new a7f0(dq5.f51819d, gbuVar);
                x401 x401Var = new x401();
                x401Var.add(new eww0(jcl0.class));
                if (zM77182x) {
                    x401Var.add(new eww0(bd00.class));
                }
                if (zM77164f) {
                    x401Var.add(new eww0(wil.class));
                }
                x401 x401VarM63425d = n0e1.m63425d(x401Var);
                pg20 pg20Var2 = new pg20(new a7f0(dq5.f51816a, ms2.m62685j(pad1.class)), new a7f0(w811Var, gbuVar), zM77177s ? a7f0Var3 : z3 ? null : a7f0Var2, (!zM77177s || z3) ? null : a7f0Var2, 16);
                ug20 ug20Var = new ug20(new a7f0(dq5.f51817b, gbuVar), new a7f0(dq5.f51818c, gbuVar));
                if (!z3) {
                    a7f0Var2 = null;
                }
                return new fi20(new wg20(pg20Var2, ug20Var, a7f0Var2), new a7f0(pv8.f181637a, ms2.m62685j(hy5.class)), new a7f0(sdb1.f207973a, x401VarM63425d), new a7f0(x8f0.f259141a, ms2.m62685j(jcl0.class)));
            case 3:
                cl20 cl20Var = (cl20) obj;
                g0n g0nVar = cl20Var.f39165j;
                String str5 = cl20Var.f39157b;
                hc80 hc80Var = cl20Var.f39156a;
                cbh0 cbh0Var = cl20Var.f39167l;
                switch (g0nVar.f75400a) {
                    case 0:
                        ijm ijmVar = (ijm) ((ezm) g0nVar.f75401b).f64417c;
                        kv91 kv91VarM47449B = hgi0.m47449B((dcm0) ijmVar.f102835a);
                        u190 u190Var = (u190) ijmVar.f102837c.get();
                        luk lukVar = (luk) ((bc00) ijmVar.f102838d).f25717X.get();
                        jg31.m53271i(lukVar);
                        return new fk81(kv91VarM47449B, u190Var, str5, hc80Var, lukVar, cbh0Var);
                    default:
                        d23 d23Var = (d23) ((s7o) g0nVar.f75401b).f206441c;
                        return new fk81((kv91) ((h4t0) d23Var.f44444d).get(), (u190) ((h4t0) d23Var.f44449i).get(), str5, hc80Var, ysr.m94576x(), cbh0Var);
                }
            case 4:
                bo20 bo20Var = (bo20) obj;
                return new om91(new cju(bo20Var.f28988a.f60297e, i2), bo20Var.f28989b, bo20Var.f28990c, bo20Var.f28991d);
            case 5:
                return new n0a((HeadphoneFilterStateDatabase_Impl) obj);
            case 6:
                return new bi1((mx20) obj, 19);
            case 7:
                return new vx20((HistoryDatabase_Impl) obj);
            case 8:
                v430 v430Var = (v430) obj;
                String string = v430Var.f237032a.getString(R.string.offline_playable_cache_title);
                v430Var.f237034c.getClass();
                tc5 tc5Var = gn80.f82152a;
                return new ouo0(string, i091.m49351w(), 3, ewk0.m40145a());
            case 9:
                return new m630((ao20) ((i4t0) ((mqr) obj).f146344c).get());
            case 10:
                return (w930) ((p930) obj).f175137a.get();
            case 11:
                ab30 ab30Var = (ab30) obj;
                return Integer.valueOf(ab30.m25317d(ab30Var, ab30.m25316c(ab30Var), null));
            case 12:
                ((xnd1) ((clb) obj).f39232c).mo26583f();
                return w2a1Var;
            case 13:
                return Integer.valueOf(Objects.hash(((ar30) obj).impl));
            case 14:
                or30 or30Var = (or30) obj;
                return Integer.valueOf(Objects.hash(or30Var.f168432id, or30Var.category));
            case 15:
                return Integer.valueOf(Objects.hash(((sr30) obj).impl));
            case 16:
                return Integer.valueOf(Objects.hash(((wr30) obj).impl));
            case 17:
                return Integer.valueOf(Objects.hash(((zr30) obj).impl));
            case 18:
                return Integer.valueOf(Objects.hash(((gs30) obj).impl));
            case 19:
                return Integer.valueOf(Objects.hash(((ks30) obj).impl));
            case 20:
                return ((j040) obj).f82904d.f39905f;
            case 21:
                w740 w740Var = (w740) obj;
                return new l740(w740Var.mo24649e(), new a740(), w740Var.f248554b, w740Var.f248555c, w740Var.f248556d, w740Var.f248562t, w740Var.f248541L0, w740Var.f248550X);
            case 22:
                return (FrameLayout) mec1.m61562n((View) ((asp) obj).f19486h, R.id.heading_container);
            case 23:
                kk1 kk1Var = (kk1) obj;
                wmm wmmVar = (wmm) kk1Var.f123475f;
                pgo pgoVar = (pgo) kk1Var.f123471b;
                jnm jnmVar = (jnm) wmmVar.f252929a.f210441c;
                z9j0 z9j0VarM64811d = ((nma) jnmVar.f114147X0).m64811d();
                jg31.m53271i(z9j0VarM64811d);
                e940 e940VarMo25691b = ((nma) jnmVar.f114147X0).mo25691b();
                jg31.m53271i(e940VarMo25691b);
                return new d2r(pgoVar, e940VarMo25691b, z9j0VarM64811d);
            case 24:
                C2636z3 c2636z3 = (C2636z3) obj;
                rxt rxtVarM87517y = w9h1.m87517y((q0y) c2636z3.f278724c, null, null, 3);
                up60 up60Var = hxt.f96286w;
                vxx vxxVar = (vxx) c2636z3.f278723b;
                hxt hxtVarM50021n = ia7.m50021n(((FrameLayout) vxxVar.f245855h).getContext(), (FrameLayout) vxxVar.f245855h, rxtVarM87517y, null, 24);
                ((FrameLayout) vxxVar.f245855h).addView(hxtVarM50021n.f96307t);
                return hxtVarM50021n;
            case 25:
                return (qu91) ((pg40) obj).f177221b.get();
            case 26:
                u010 u010Var = (u010) obj;
                Context context = (Context) u010Var.f225345b;
                return PendingIntent.getActivity(context, 0, ((g550) ((f550) u010Var.f225346c)).m43588a(context), 67108864);
            case 27:
                dj40 dj40Var = (dj40) obj;
                nps npsVar = dj40Var.f49555g;
                if (npsVar != null) {
                    dj40Var.f49549a.m26886e(npsVar);
                    dj40Var.f49555g = null;
                    dj40Var.f49556h = 1;
                }
                return w2a1Var;
            case 28:
                HashMap map2 = ((fl40) obj).f70686a;
                if (map2.isEmpty()) {
                    return fbu.f67898a;
                }
                Collection collectionValues = map2.values();
                ArrayList arrayList = new ArrayList();
                long j = 0;
                for (Object obj2 : collectionValues) {
                    x1x x1xVar = (x1x) obj2;
                    if (j <= 102400) {
                        long length = j + ((long) 4) + ((long) x1xVar.f257294b.length()) + ((long) x1xVar.f257295c.size()) + ((long) 8);
                        int size = 0;
                        for (pqm0 pqm0Var : x1xVar.f257297e) {
                            size += ((gva) pqm0Var.f180351b).size() + ((String) pqm0Var.f180350a).length();
                        }
                        j = length + ((long) size);
                    }
                    if (j <= 102400) {
                        arrayList.add(obj2);
                    }
                }
                return new ek5(arrayList, 1);
            default:
                qyy0 qyy0Var = (qyy0) obj;
                pgo pgoVar2 = (pgo) qyy0Var.f194059b;
                tjo tjoVar = (tjo) qyy0Var.f194067t;
                tjo tjoVar2 = (tjo) qyy0Var.f194056Y;
                tjo tjoVar3 = (tjo) qyy0Var.f194055X;
                tjo tjoVar4 = (tjo) qyy0Var.f194065h;
                pvf0 pvf0Var = (pvf0) qyy0Var.f194060c;
                aox0 aox0Var = pvf0Var.f181736b;
                String str6 = aox0Var.f17787a;
                aox0 aox0Var2 = pvf0Var.f181737c;
                v791 v791Var = (v791) vie1.m85619a(pgoVar2.mo25866b(tjoVar4.mo28634a(new gtx0(str6, aox0Var2.f17787a, aox0Var.f17789c, aox0Var2.f17789c))));
                b791 b791Var4 = v791Var.f238106a;
                b791 b791VarM28366c2 = b791.m28366c(b791Var4, null, rzl0.m76819c(b791Var4.f24196b, null, null, null, null, null, pvf0Var.f181736b.f17788b, pvf0Var.f181737c.f17788b, 0, 0, 0, null, null, 0.0f, 0.0f, 0.0d, 0.0d, 524095), false, false, 13);
                rzl0 rzl0Var = b791VarM28366c2.f24196b;
                String str7 = pvf0Var.f181738d;
                Map map3 = nau.f152117a;
                if (str7 != null) {
                    b791 b791Var5 = pvf0Var.f181741g;
                    if (b791Var5 == null || !qyy0Var.m74271t(b791Var5, b791VarM28366c2)) {
                        b791Var5 = null;
                    }
                    boolean z4 = pvf0Var.f181742h;
                    b791 b791Var6 = z4 ? null : b791Var5;
                    b791 b791Var7 = z4 ? null : pvf0Var.f181741g;
                    b791 b791Var8 = z4 ? b791Var5 : null;
                    if (z4) {
                        pvf0Var.f181740f = str7;
                    } else {
                        pvf0Var.f181739e = str7;
                    }
                    if (!pvf0Var.f181743i) {
                        return qyy0.m74232f(qyy0Var, v791Var, b791VarM28366c2, b791Var6, b791Var7, null, b791Var8, true, false, null, null, null, false, null, null, null, 118272);
                    }
                    b791 b791Var9 = b791Var7;
                    dx80 dx80Var = (dx80) vie1.m85619a(pgoVar2.mo25866b(tjoVar3.mo28634a(pvf0Var.f181736b.f17788b)));
                    boolean zM88859c = dx80Var != null ? wrf0.m88859c(dx80Var.f53901e) : true;
                    hz80 hz80Var = (hz80) vie1.m85619a(pgoVar2.mo25866b(tjoVar2.mo28634a(pvf0Var.f181735a)));
                    boolean z5 = (hz80Var == null || (noa1Var2 = hz80Var.f96834t) == null) ? false : noa1Var2.f156638b;
                    qho qhoVarMo25866b = pgoVar2.mo25866b(tjoVar.mo28634a(pvf0Var.f181736b.f17788b));
                    boolean z6 = qhoVarMo25866b instanceof oho;
                    oho ohoVar = z6 ? (oho) qhoVarMo25866b : null;
                    if (ohoVar == null || (map = (Map) ohoVar.f165512a) == null) {
                        b791Var3 = null;
                    } else {
                        b791 b791VarM75017b = r991.m75017b(map);
                        b791Var3 = (b791VarM75017b == null || !qyy0Var.m74271t(b791VarM75017b, b791VarM28366c2)) ? null : b791VarM75017b;
                    }
                    return qyy0.m74232f(qyy0Var, v791Var, b791VarM28366c2, b791Var6, b791Var9, null, b791Var8, zM88859c, z5, null, null, null, (zM88859c || !z6 || wj50.m88271j(b791Var6, b791Var3)) ? false : true, null, qyy0Var.m74258e(map3, b791VarM28366c2, b791Var8), null, 91648);
                }
                Map map4 = (Map) vie1.m85619a(pgoVar2.mo25866b(tjoVar.mo28634a(pvf0Var.f181736b.f17788b)));
                String str8 = (String) map4.get("automix.transition_uri");
                b791 b791VarM75017b2 = r991.m75017b(map4);
                if (str8 == null || b791VarM75017b2 == null) {
                    str8 = null;
                } else {
                    rzl0 rzl0Var2 = b791VarM75017b2.f24196b;
                    if (!wj50.m88271j(rzl0Var2.f204180g, pvf0Var.f181736b.f17788b) || !wj50.m88271j(rzl0Var2.f204181h, pvf0Var.f181737c.f17788b) || !wj50.m88271j(rzl0Var2.f204174a, pvf0Var.f181736b.f17787a) || !wj50.m88271j(rzl0Var2.f204175b, pvf0Var.f181737c.f17787a) || !qyy0Var.m74271t(b791VarM75017b2, b791VarM28366c2)) {
                        str8 = null;
                    }
                }
                pvf0Var.f181739e = str8;
                dx80 dx80Var2 = (dx80) vie1.m85619a(pgoVar2.mo25866b(tjoVar3.mo28634a(pvf0Var.f181736b.f17788b)));
                dx80 dx80Var3 = (dx80) vie1.m85619a(pgoVar2.mo25866b(tjoVar3.mo28634a(pvf0Var.f181737c.f17788b)));
                Map map5 = dx80Var2 != null ? dx80Var2.f53902f : null;
                if (map5 == null) {
                    map5 = map3;
                }
                Map map6 = dx80Var3 != null ? dx80Var3.f53902f : null;
                if (map6 != null) {
                    map3 = map6;
                }
                boolean zM88859c2 = dx80Var2 != null ? wrf0.m88859c(dx80Var2.f53901e) : true;
                hz80 hz80Var2 = (hz80) vie1.m85619a(pgoVar2.mo25866b(tjoVar2.mo28634a(pvf0Var.f181735a)));
                if (b791VarM75017b2 == null || !qyy0Var.m74271t(b791VarM75017b2, b791VarM28366c2)) {
                    b791Var = null;
                } else {
                    rzl0 rzl0Var3 = b791VarM75017b2.f24196b;
                    if (!rzl0Var3.f204166M0 || q3d0.m72074E(rzl0Var3, map5, map3)) {
                        b791Var = b791VarM75017b2;
                    } else {
                        b791Var = null;
                    }
                }
                if (!((fjf0) qyy0Var.f194061d).f70221H || (str = (String) map4.get("automix.backend_auto_transition")) == null || (b791VarM75016a = r991.m75016a(str)) == null) {
                    b791VarM28366c = null;
                } else {
                    rzl0 rzl0Var4 = b791VarM75016a.f24196b;
                    if (r991.m75019d(pvf0Var.f181737c.f17787a, pvf0Var.f181736b.f17787a, b791VarM75016a) && (!rzl0Var4.f204166M0 || q3d0.m72074E(rzl0Var4, map5, map3))) {
                        rzl0 rzl0Var5 = b791VarM75016a.f24196b;
                        String str9 = pvf0Var.f181736b.f17788b;
                        String str10 = pvf0Var.f181737c.f17788b;
                        String str11 = rzl0Var.f204176c;
                        String str12 = rzl0Var.f204177d;
                        String str13 = rzl0Var.f204178e;
                        if (str13.length() == 0) {
                            str13 = rzl0Var4.f204178e;
                        }
                        String str14 = str13;
                        String str15 = rzl0Var.f204179f;
                        if (str15.length() == 0) {
                            str15 = rzl0Var4.f204179f;
                        }
                        b791VarM28366c = b791.m28366c(b791VarM75016a, null, rzl0.m76819c(rzl0Var5, null, str11, str12, str14, str15, str9, str10, 0, 0, 0, null, null, 0.0f, 0.0f, 0.0d, 0.0d, 524035), false, false, 1);
                    } else {
                        b791VarM28366c = null;
                    }
                }
                String str16 = b791VarM28366c != null ? (String) map4.get("automix.arm_id") : null;
                String str17 = (String) map4.get("automix.explicit_feedback");
                List listM44491D = lau.f131415a;
                if (str17 != null) {
                    try {
                        ExplicitFeedback explicitFeedbackM19385p = ExplicitFeedback.m19385p(sx8.m79586b(sx8.f214837e, str17.getBytes(vuc.f244913a)));
                        ro80 ro80VarM44508o = geg1.m44508o();
                        if (explicitFeedbackM19385p.m19386n()) {
                            b791Var2 = b791VarM28366c;
                            str2 = str16;
                            try {
                                ro80VarM44508o.add(new mky("Core", "core", b791VarM28366c2, false));
                            } catch (Exception unused) {
                                listM44491D = listM44491D;
                                list = listM44491D;
                                ro80 ro80VarM74258e = qyy0Var.m74258e(map4, b791VarM28366c2, null);
                                if (hz80Var2 != null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                str3 = (String) map5.get("item.speed");
                                if (str3 != null) {
                                    fM29806q0 = bm51.m29806q0(str3);
                                    if (fM29806q0 != null) {
                                        fFloatValue = fM29806q0.floatValue();
                                    } else {
                                        fFloatValue = 1.0f;
                                    }
                                    fValueOf = Float.valueOf(fFloatValue);
                                } else {
                                    fValueOf = null;
                                }
                                str4 = (String) map3.get("item.speed");
                                if (str4 != null) {
                                    Float fM29806q1 = bm51.m29806q0(str4);
                                    fValueOf2 = Float.valueOf(fM29806q1 != null ? fM29806q1.floatValue() : 1.0f);
                                } else {
                                    fValueOf2 = null;
                                }
                                return qyy0.m74232f(qyy0Var, v791Var, b791VarM28366c2, b791Var, b791VarM75017b2, b791Var2, null, zM88859c2, z, str2, fValueOf, fValueOf2, false, list, ro80VarM74258e, list, 14336);
                            }
                        } else {
                            b791Var2 = b791VarM28366c;
                            str2 = str16;
                        }
                        ae50 ae50VarM19387o = explicitFeedbackM19385p.m19387o();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : ae50VarM19387o) {
                            if (((BackendTransition) obj3).m19373p()) {
                                arrayList2.add(obj3);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            BackendTransition backendTransition = (BackendTransition) it.next();
                            b791 b791VarM75016a2 = r991.m75016a(backendTransition.m19374q());
                            if (b791VarM75016a2 == null) {
                                it = it;
                                listM44491D = listM44491D;
                                mkyVar = null;
                            } else {
                                String strM19372o = backendTransition.m19372o();
                                if (strM19372o.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((Object) String.valueOf(strM19372o.charAt(0)).toUpperCase(Locale.ROOT));
                                    sb.append(strM19372o.substring(1));
                                    strM19372o = sb.toString();
                                }
                                mkyVar = new mky(strM19372o, backendTransition.m19372o(), b791VarM75016a2, false);
                            }
                            if (mkyVar != null) {
                                try {
                                    ro80VarM44508o.add(mkyVar);
                                } catch (Exception unused2) {
                                    list = listM44491D;
                                    ro80 ro80VarM74258e2 = qyy0Var.m74258e(map4, b791VarM28366c2, null);
                                    if (hz80Var2 != null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    str3 = (String) map5.get("item.speed");
                                    if (str3 != null) {
                                        fM29806q0 = bm51.m29806q0(str3);
                                        if (fM29806q0 != null) {
                                            fFloatValue = fM29806q0.floatValue();
                                        } else {
                                            fFloatValue = 1.0f;
                                        }
                                        fValueOf = Float.valueOf(fFloatValue);
                                    } else {
                                        fValueOf = null;
                                    }
                                    str4 = (String) map3.get("item.speed");
                                    if (str4 != null) {
                                        Float fM29806q2 = bm51.m29806q0(str4);
                                        fValueOf2 = Float.valueOf(fM29806q2 != null ? fM29806q2.floatValue() : 1.0f);
                                    } else {
                                        fValueOf2 = null;
                                    }
                                    return qyy0.m74232f(qyy0Var, v791Var, b791VarM28366c2, b791Var, b791VarM75017b2, b791Var2, null, zM88859c2, z, str2, fValueOf, fValueOf2, false, list, ro80VarM74258e2, list, 14336);
                                }
                            }
                            it = it;
                            listM44491D = listM44491D;
                            break;
                        }
                        listM44491D = listM44491D;
                        listM44491D = geg1.m44491D(geg1.m44506m(ro80VarM44508o));
                    } catch (Exception unused3) {
                        b791Var2 = b791VarM28366c;
                        str2 = str16;
                    }
                    break;
                } else {
                    b791Var2 = b791VarM28366c;
                    str2 = str16;
                }
                list = listM44491D;
                ro80 ro80VarM74258e3 = qyy0Var.m74258e(map4, b791VarM28366c2, null);
                if (hz80Var2 != null || (noa1Var = hz80Var2.f96834t) == null) {
                    z = false;
                } else {
                    z = noa1Var.f156638b;
                }
                str3 = (String) map5.get("item.speed");
                if (str3 != null) {
                    fM29806q0 = bm51.m29806q0(str3);
                    if (fM29806q0 != null) {
                        fFloatValue = fM29806q0.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    fValueOf = Float.valueOf(fFloatValue);
                } else {
                    fValueOf = null;
                }
                str4 = (String) map3.get("item.speed");
                if (str4 != null) {
                    Float fM29806q3 = bm51.m29806q0(str4);
                    fValueOf2 = Float.valueOf(fM29806q3 != null ? fM29806q3.floatValue() : 1.0f);
                } else {
                    fValueOf2 = null;
                }
                return qyy0.m74232f(qyy0Var, v791Var, b791VarM28366c2, b791Var, b791VarM75017b2, b791Var2, null, zM88859c2, z, str2, fValueOf, fValueOf2, false, list, ro80VarM74258e3, list, 14336);
        }
    }
}
