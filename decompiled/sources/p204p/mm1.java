package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mm1 extends d6a0 implements w3x0 {

    /* JADX INFO: renamed from: L0 */
    public final ya3 f145000L0;

    /* JADX INFO: renamed from: M0 */
    public final am1 f145001M0;

    /* JADX INFO: renamed from: N0 */
    public final d5q f145002N0;

    /* JADX INFO: renamed from: O0 */
    public final String f145003O0;

    /* JADX INFO: renamed from: P0 */
    public List f145004P0;

    /* JADX INFO: renamed from: Q0 */
    public j891 f145005Q0;

    /* JADX INFO: renamed from: R0 */
    public final zv41 f145006R0;

    /* JADX INFO: renamed from: S0 */
    public final zv41 f145007S0;

    /* JADX INFO: renamed from: T0 */
    public final zv41 f145008T0;

    /* JADX INFO: renamed from: U0 */
    public final zv41 f145009U0;

    /* JADX INFO: renamed from: V0 */
    public final c9k f145010V0;

    /* JADX INFO: renamed from: W0 */
    public di41 f145011W0;

    /* JADX INFO: renamed from: X */
    public final ehm f145012X;

    /* JADX INFO: renamed from: X0 */
    public final is31 f145013X0;

    /* JADX INFO: renamed from: Y */
    public final abk f145014Y;

    /* JADX INFO: renamed from: Y0 */
    public Set f145015Y0;

    /* JADX INFO: renamed from: Z */
    public final bzo f145016Z;

    /* JADX INFO: renamed from: Z0 */
    public Object f145017Z0;

    /* JADX INFO: renamed from: a1 */
    public Set f145018a1;

    /* JADX INFO: renamed from: b1 */
    public Set f145019b1;

    /* JADX INFO: renamed from: d */
    public final ks31 f145020d;

    /* JADX INFO: renamed from: e */
    public final mcu0 f145021e;

    /* JADX INFO: renamed from: f */
    public final qr1 f145022f;

    /* JADX INFO: renamed from: g */
    public final kfq f145023g;

    /* JADX INFO: renamed from: h */
    public final cdn f145024h;

    /* JADX INFO: renamed from: i */
    public final eu1 f145025i;

    /* JADX INFO: renamed from: t */
    public final zre1 f145026t;

    public mm1(ks31 ks31Var, mcu0 mcu0Var, qr1 qr1Var, kfq kfqVar, cdn cdnVar, eu1 eu1Var, zre1 zre1Var, ehm ehmVar, abk abkVar, luk lukVar, bzo bzoVar, ya3 ya3Var, am1 am1Var, d5q d5qVar) {
        this.f145020d = ks31Var;
        this.f145021e = mcu0Var;
        this.f145022f = qr1Var;
        this.f145023g = kfqVar;
        this.f145024h = cdnVar;
        this.f145025i = eu1Var;
        this.f145026t = zre1Var;
        this.f145012X = ehmVar;
        this.f145014Y = abkVar;
        this.f145016Z = bzoVar;
        this.f145000L0 = ya3Var;
        this.f145001M0 = am1Var;
        this.f145002N0 = d5qVar;
        String username = qr1Var.getUsername();
        this.f145003O0 = username;
        this.f145004P0 = lau.f131415a;
        du1 du1VarM73586k = qr1Var.m73586k();
        cu1 cu1Var = du1VarM73586k instanceof cu1 ? (cu1) du1VarM73586k : null;
        this.f145005Q0 = cu1Var != null ? cu1Var.m33855c() : null;
        this.f145006R0 = jag1.m52819d("");
        this.f145007S0 = jag1.m52819d(null);
        this.f145008T0 = jag1.m52819d(ks31Var.m57187a(username));
        pr1 pr1VarM73582c = qr1Var.m73582c();
        this.f145009U0 = jag1.m52819d(pr1VarM73582c != null ? pr1VarM73582c.getUri() : null);
        this.f145010V0 = kk40.m56661c(lukVar);
        this.f145013X0 = ks31Var.m57187a(username);
        gbu gbuVar = gbu.f78413a;
        this.f145017Z0 = gbuVar;
        this.f145018a1 = gbuVar;
        this.f145019b1 = gbuVar;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: k */
    public static final la6 m62258k(mm1 mm1Var, boolean z, dm1 dm1Var) {
        qr1 qr1Var = mm1Var.f145022f;
        is31 is31VarM57187a = mm1Var.f145020d.m57187a(mm1Var.f145003O0);
        boolean z2 = !wl51.m88460J0((CharSequence) mm1Var.f145006R0.getValue());
        boolean z3 = mm1Var.f145008T0.getValue() != mm1Var.f145013X0;
        String str = (String) mm1Var.f145009U0.getValue();
        boolean z4 = qr1Var.m73586k() instanceof cu1;
        List list = mm1Var.f145004P0;
        tc5 tc5Var = gn80.f82152a;
        boolean zM62262o = m62262o(list);
        du1 du1VarM73586k = qr1Var.m73586k();
        xt1 xt1Var = du1VarM73586k instanceof xt1 ? (xt1) du1VarM73586k : null;
        boolean z5 = (xt1Var != null ? xt1Var.m92001c() : null) == x93.f259266c;
        bm1 bm1Var = dm1Var instanceof bm1 ? (bm1) dm1Var : null;
        Boolean boolValueOf = bm1Var != null ? Boolean.valueOf(bm1Var.m29790a()) : null;
        List list2 = mm1Var.f145004P0;
        ?? r14 = mm1Var.f145017Z0;
        Set set = mm1Var.f145015Y0;
        if (set == null) {
            set = gbu.f78413a;
        }
        return new la6(z, is31VarM57187a, z2, z3, str, z4, zM62262o, z5, boolValueOf, list2, r14, set, mm1Var.f145018a1, qr1Var.m73586k(), mm1Var.f145019b1);
    }

    /* JADX INFO: renamed from: l */
    public static final fiz m62259l(mm1 mm1Var, List list) {
        qr1 qr1Var = mm1Var.f145022f;
        du1 du1VarM73586k = qr1Var.m73586k();
        boolean z = du1VarM73586k instanceof xt1;
        Object bm1Var = cm1.f39439a;
        if (z) {
            if (((xt1) du1VarM73586k).m92001c() == x93.f259266c) {
                bm1Var = new bm1(false);
            }
            return nxf1.m65834m(bm1Var);
        }
        List listM73584h = qr1Var.m73584h();
        tc5 tc5Var = gn80.f82152a;
        return m62262o(listM73584h) ? new C2373se(k0e1.m54985d(mm1Var.f145012X.m38979a(Single.just(list)).m60499N()), 5) : nxf1.m65834m(bm1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: m */
    public static final Object m62260m(mm1 mm1Var, zl1 zl1Var, ibk ibkVar) {
        im1 im1Var;
        j891 j891Var;
        String strM52702c;
        Set set;
        am1 am1Var = mm1Var.f145001M0;
        if (ibkVar instanceof im1) {
            im1Var = (im1) ibkVar;
            int i = im1Var.f103572d;
            if ((i & Integer.MIN_VALUE) != 0) {
                im1Var.f103572d = i - Integer.MIN_VALUE;
            } else {
                im1Var = new im1(mm1Var, ibkVar);
            }
        } else {
            im1Var = new im1(mm1Var, ibkVar);
        }
        Object objM31049e = im1Var.f103570b;
        int i2 = im1Var.f103572d;
        if (i2 == 0) {
            bga.m29073P(objM31049e);
            if (!(mm1Var.f145022f.m73586k() instanceof cu1) || (j891Var = mm1Var.f145005Q0) == null || (strM52702c = j891Var.m52702c()) == null) {
                return zl1Var;
            }
            Set set2 = mm1Var.f145015Y0;
            bzo bzoVar = mm1Var.f145016Z;
            im1Var.f103569a = set2;
            im1Var.f103572d = 1;
            objM31049e = bzoVar.m31049e(zl1Var, strM52702c, set2, im1Var);
            yuk yukVar = yuk.f276404a;
            if (objM31049e == yukVar) {
                return yukVar;
            }
            set = set2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = im1Var.f103569a;
            bga.m29073P(objM31049e);
        }
        l791 l791Var = (l791) objM31049e;
        if (set == null) {
            mm1Var.f145015Y0 = l791Var.m58409a();
            if (!l791Var.m58409a().isEmpty()) {
                Set setM26376b = am1Var.m26376b();
                if (setM26376b == null) {
                    setM26376b = gbu.f78413a;
                }
                am1Var.m26380f(s601.m77309l0(setM26376b, l791Var.m58409a()));
                am1Var.m26379e(l791Var.m58410b());
            }
        }
        return l791Var.m58410b();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: n */
    public static final Object m62261n(mm1 mm1Var, fbk fbkVar) {
        jm1 jm1Var;
        List list;
        List list2;
        Object objM25361h;
        List list3;
        List list4;
        x6m x6mVar;
        x401 x401Var;
        Serializable serializableM35032a;
        List list5;
        x6m x6mVar2;
        mm1 mm1Var2;
        qr1 qr1Var = mm1Var.f145022f;
        if (fbkVar instanceof jm1) {
            jm1Var = (jm1) fbkVar;
            int i = jm1Var.f113729g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jm1Var.f113729g = i - Integer.MIN_VALUE;
            } else {
                jm1Var = new jm1(mm1Var, fbkVar);
            }
        } else {
            jm1Var = new jm1(mm1Var, fbkVar);
        }
        Object objM62264p = jm1Var.f113727e;
        int i2 = jm1Var.f113729g;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM62264p);
            if (qr1Var.m73586k() instanceof xt1) {
                return lau.f131415a;
            }
            List listM73584h = qr1Var.m73584h();
            jm1Var.f113729g = 1;
            objM62264p = mm1Var.m62264p(listM73584h, jm1Var);
            if (objM62264p != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM62264p);
        } else {
            if (i2 == 2) {
                list = jm1Var.f113723a;
                bga.m29073P(objM62264p);
                list2 = (List) objM62264p;
                mm1Var.f145004P0 = list2;
                abk abkVar = mm1Var.f145014Y;
                jm1Var.f113723a = list;
                jm1Var.f113724b = list2;
                jm1Var.f113729g = 3;
                objM25361h = abkVar.m25361h(list, jm1Var);
                if (objM25361h != yukVar) {
                    List list6 = list;
                    list3 = list2;
                    objM62264p = objM25361h;
                    list4 = list6;
                    x6mVar = (x6m) objM62264p;
                    x401Var = new x401();
                    x401Var.addAll(x6mVar.m90101b());
                    if (qr1Var.m73586k() instanceof cu1) {
                        x401Var.add(qr1Var.m73585j());
                    }
                    mm1Var.f145017Z0 = n0e1.m63425d(x401Var);
                    d5q d5qVar = mm1Var.f145002N0;
                    du1 du1VarM73586k = qr1Var.m73586k();
                    n4m n4mVarM90102c = x6mVar.m90102c();
                    jm1Var.f113723a = null;
                    jm1Var.f113724b = list3;
                    jm1Var.f113725c = x6mVar;
                    jm1Var.f113726d = mm1Var;
                    jm1Var.f113729g = 4;
                    serializableM35032a = d5qVar.m35032a(du1VarM73586k, list4, n4mVarM90102c, jm1Var);
                    if (serializableM35032a != yukVar) {
                        list5 = list3;
                        x6mVar2 = x6mVar;
                        objM62264p = serializableM35032a;
                        mm1Var2 = mm1Var;
                    }
                }
                return yukVar;
            }
            if (i2 == 3) {
                list3 = jm1Var.f113724b;
                list4 = jm1Var.f113723a;
                bga.m29073P(objM62264p);
                x6mVar = (x6m) objM62264p;
                x401Var = new x401();
                x401Var.addAll(x6mVar.m90101b());
                if (qr1Var.m73586k() instanceof cu1) {
                    x401Var.add(qr1Var.m73585j());
                }
                mm1Var.f145017Z0 = n0e1.m63425d(x401Var);
                d5q d5qVar2 = mm1Var.f145002N0;
                du1 du1VarM73586k2 = qr1Var.m73586k();
                n4m n4mVarM90102c2 = x6mVar.m90102c();
                jm1Var.f113723a = null;
                jm1Var.f113724b = list3;
                jm1Var.f113725c = x6mVar;
                jm1Var.f113726d = mm1Var;
                jm1Var.f113729g = 4;
                serializableM35032a = d5qVar2.m35032a(du1VarM73586k2, list4, n4mVarM90102c2, jm1Var);
                if (serializableM35032a != yukVar) {
                    list5 = list3;
                    x6mVar2 = x6mVar;
                    objM62264p = serializableM35032a;
                    mm1Var2 = mm1Var;
                }
                return yukVar;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mm1Var2 = jm1Var.f113726d;
            x6mVar2 = jm1Var.f113725c;
            list5 = jm1Var.f113724b;
            bga.m29073P(objM62264p);
        }
        mm1Var2.f145019b1 = (Set) objM62264p;
        Set setM90100a = x6mVar2.m90100a();
        mm1Var.f145025i.m40014e(setM90100a.isEmpty() ? null : setM90100a);
        return list5;
        List list7 = (List) objM62264p;
        cdn cdnVar = mm1Var.f145024h;
        jm1Var.f113723a = list7;
        jm1Var.f113729g = 2;
        Object objM32452o = cdnVar.m32452o(list7, jm1Var);
        if (objM32452o != yukVar) {
            list = list7;
            objM62264p = objM32452o;
            list2 = (List) objM62264p;
            mm1Var.f145004P0 = list2;
            abk abkVar2 = mm1Var.f145014Y;
            jm1Var.f113723a = list;
            jm1Var.f113724b = list2;
            jm1Var.f113729g = 3;
            objM25361h = abkVar2.m25361h(list, jm1Var);
            if (objM25361h != yukVar) {
                List list8 = list;
                list3 = list2;
                objM62264p = objM25361h;
                list4 = list8;
                x6mVar = (x6m) objM62264p;
                x401Var = new x401();
                x401Var.addAll(x6mVar.m90101b());
                if (qr1Var.m73586k() instanceof cu1) {
                    x401Var.add(qr1Var.m73585j());
                }
                mm1Var.f145017Z0 = n0e1.m63425d(x401Var);
                d5q d5qVar3 = mm1Var.f145002N0;
                du1 du1VarM73586k3 = qr1Var.m73586k();
                n4m n4mVarM90102c3 = x6mVar.m90102c();
                jm1Var.f113723a = null;
                jm1Var.f113724b = list3;
                jm1Var.f113725c = x6mVar;
                jm1Var.f113726d = mm1Var;
                jm1Var.f113729g = 4;
                serializableM35032a = d5qVar3.m35032a(du1VarM73586k3, list4, n4mVarM90102c3, jm1Var);
                if (serializableM35032a != yukVar) {
                    list5 = list3;
                    x6mVar2 = x6mVar;
                    objM62264p = serializableM35032a;
                    mm1Var2 = mm1Var;
                    mm1Var2.f145019b1 = (Set) objM62264p;
                    Set setM90100a2 = x6mVar2.m90100a();
                    if (setM90100a2.isEmpty()) {
                    }
                    mm1Var.f145025i.m40014e(setM90100a2.isEmpty() ? null : setM90100a2);
                    return list5;
                }
            }
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m62262o(List list) {
        gn80 gn80Var = gn80.SHOW_SHOW;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set set = dd41.f47702f;
            if (!r46.m74708A(str, gn80Var)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static s4a0 m62263q(mm1 mm1Var) {
        Scheduler scheduler = AndroidSchedulers.f7175a;
        RxAndroidPlugins.m23280b(scheduler);
        mm1Var.getClass();
        return sw41.m79512d(mm1Var, scheduler);
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        String string = bundle.getString("TEXT_FILTER_BUNDLE_KEY");
        if (string == null) {
            string = "";
        }
        zv41 zv41Var = this.f145006R0;
        zv41Var.getClass();
        zv41Var.m97091m(null, string);
        String[] stringArray = bundle.getStringArray("INITIAL_CURATED_CONTENT_KEY");
        this.f145001M0.m26380f(stringArray != null ? bk5.m29624m1(stringArray) : null);
        if (bundle.containsKey("FOLDER_URI_BUNDLE_KEY")) {
            this.f145009U0.m97090l(bundle.getString("FOLDER_URI_BUNDLE_KEY"));
        }
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        fiz c2481v3;
        if (this.f145007S0.getValue() != null) {
            m35106i();
        } else {
            m35107j();
        }
        ysk yskVarM65826e = nxf1.m65826e(new C2401t5(this));
        du1 du1VarM73586k = this.f145022f.m73586k();
        if (du1VarM73586k instanceof xt1) {
            c2481v3 = new C2481v3(this.f145000L0.m93179n(((xt1) du1VarM73586k).m92001c()), 12);
        } else {
            c2481v3 = nxf1.m65834m(gbu.f78413a);
        }
        fbk fbkVar = null;
        int i = 7;
        this.f145011W0 = wxf1.m89255l(this.f145010V0, oyf1.m68486s(b0g1.m27776L(new C2417tj(i, xtm0.m92074U(g0g1.m43300e(this.f145008T0, this.f145006R0, this.f145009U0, yskVarM65826e, c2481v3, new fm1(this, null)), new C2102lt(fbkVar, this, 4)), this), new C2241p2(this, fbkVar, i)), new C2278q2(this, fbkVar, 2)));
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f145011W0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m62264p(List list, ibk ibkVar) {
        km1 km1Var;
        List list2;
        if (ibkVar instanceof km1) {
            km1Var = (km1) ibkVar;
            int i = km1Var.f124027d;
            if ((i & Integer.MIN_VALUE) != 0) {
                km1Var.f124027d = i - Integer.MIN_VALUE;
            } else {
                km1Var = new km1(this, ibkVar);
            }
        } else {
            km1Var = new km1(this, ibkVar);
        }
        Object objM56303a = km1Var.f124025b;
        int i2 = km1Var.f124027d;
        if (i2 == 0) {
            bga.m29073P(objM56303a);
            if (this.f145005Q0 == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (yl1.m94142b((String) obj)) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String str = (String) g6f.m43741q0(arrayList);
                    km1Var.f124024a = arrayList2;
                    km1Var.f124027d = 1;
                    objM56303a = this.f145023g.m56303a(str, km1Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM56303a == yukVar) {
                        return yukVar;
                    }
                    list2 = arrayList2;
                }
            }
            return list;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = km1Var.f124024a;
        bga.m29073P(objM56303a);
        aa91 aa91Var = (aa91) objM56303a;
        if (aa91Var == null) {
            return list2;
        }
        this.f145005Q0 = aa91Var.m25212b();
        return g6f.m43700N0(list2, aa91Var.m25211a());
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        pqm0 pqm0VarM69840u = pft0.m69840u("TEXT_FILTER_BUNDLE_KEY", this.f145006R0.getValue());
        Set setM26376b = this.f145001M0.m26376b();
        return pp91.m70529j(pqm0VarM69840u, pft0.m69840u("INITIAL_CURATED_CONTENT_KEY", setM26376b != null ? (String[]) setM26376b.toArray(new String[0]) : null), pft0.m69840u("FOLDER_URI_BUNDLE_KEY", this.f145009U0.getValue()));
    }
}
