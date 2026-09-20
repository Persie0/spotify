package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: classes.dex */
public final class ya3 {

    /* JADX INFO: renamed from: a */
    public final Context f270741a;

    /* JADX INFO: renamed from: b */
    public final wt80 f270742b;

    /* JADX INFO: renamed from: c */
    public final ure f270743c;

    /* JADX INFO: renamed from: d */
    public final z6m f270744d;

    /* JADX INFO: renamed from: e */
    public final mi80 f270745e;

    /* JADX INFO: renamed from: f */
    public final epx f270746f;

    /* JADX INFO: renamed from: g */
    public final luk f270747g;

    /* JADX INFO: renamed from: h */
    public final wb11 f270748h;

    /* JADX INFO: renamed from: i */
    public final zre1 f270749i;

    /* JADX INFO: renamed from: j */
    public final tw81 f270750j;

    /* JADX INFO: renamed from: k */
    public final pne1 f270751k;

    /* JADX INFO: renamed from: l */
    public final vmz f270752l;

    /* JADX INFO: renamed from: m */
    public final twx0 f270753m;

    /* JADX INFO: renamed from: n */
    public final Single f270754n;

    /* JADX INFO: renamed from: q */
    public final c9k f270757q;

    /* JADX INFO: renamed from: o */
    public final lsi0 f270755o = msi0.m62770a();

    /* JADX INFO: renamed from: p */
    public final zv41 f270756p = jag1.m52819d(nau.f152117a);

    /* JADX INFO: renamed from: r */
    public final wg61 f270758r = new wg61(new w62(this, 15));

    /* JADX INFO: renamed from: s */
    public final wg61 f270759s = new wg61(new f30(this, 5));

    public ya3(Context context, wt80 wt80Var, ure ureVar, z6m z6mVar, FlowableElementAtSingle flowableElementAtSingle, mi80 mi80Var, epx epxVar, luk lukVar, wb11 wb11Var, zre1 zre1Var, tw81 tw81Var, pne1 pne1Var, vmz vmzVar, twx0 twx0Var) {
        this.f270741a = context;
        this.f270742b = wt80Var;
        this.f270743c = ureVar;
        this.f270744d = z6mVar;
        this.f270745e = mi80Var;
        this.f270746f = epxVar;
        this.f270747g = lukVar;
        this.f270748h = wb11Var;
        this.f270749i = zre1Var;
        this.f270750j = tw81Var;
        this.f270751k = pne1Var;
        this.f270752l = vmzVar;
        this.f270753m = twx0Var;
        this.f270754n = flowableElementAtSingle.map(new ac5(this, 10));
        this.f270757q = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m93166a(ya3 ya3Var, List list, x93 x93Var, ibk ibkVar) throws Throwable {
        qa3 qa3Var;
        Set setM77310m0;
        Object objM96761b;
        Throwable th;
        Object c6x0Var;
        lsi0 lsi0Var;
        x93 x93Var2;
        List list2;
        ya3Var.getClass();
        if (ibkVar instanceof qa3) {
            qa3Var = (qa3) ibkVar;
            int i = qa3Var.f186730h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa3Var.f186730h = i - Integer.MIN_VALUE;
            } else {
                qa3Var = new qa3(ya3Var, ibkVar);
            }
        } else {
            qa3Var = new qa3(ya3Var, ibkVar);
        }
        Object obj = qa3Var.f186728f;
        int i2 = qa3Var.f186730h;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                Set set = qa3Var.f186725c;
                x93Var = qa3Var.f186724b;
                List list3 = qa3Var.f186723a;
                try {
                    bga.m29073P(obj);
                    setM77310m0 = set;
                    list = list3;
                    objM96761b = obj;
                } catch (Throwable th2) {
                    setM77310m0 = set;
                    list = list3;
                    th = th2;
                    c6x0Var = new c6x0(th);
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lsi0Var = qa3Var.f186727e;
                list2 = qa3Var.f186726d;
                x93Var2 = qa3Var.f186724b;
                bga.m29073P(obj);
            }
            try {
                ya3Var.m93172e(m93169l(x93Var2), list2);
                return list2;
            } finally {
                lsi0Var.mo54249c(null);
            }
        }
        bga.m29073P(obj);
        ya3Var.f270745e.getClass();
        ya3Var.f270751k.getClass();
        setM77310m0 = s601.m77310m0("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof z93) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((z93) it.next()).m95617a());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!setM77310m0.contains((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.isEmpty()) {
            return list;
        }
        try {
            zre1 zre1Var = ya3Var.f270749i;
            ioe1 ioe1VarM98149q = YourLibraryContainsRequest.m98149q();
            ioe1VarM98149q.m51177m(arrayList3);
            YourLibraryContainsRequest yourLibraryContainsRequest = (YourLibraryContainsRequest) ioe1VarM98149q.build();
            qa3Var.f186723a = list;
            qa3Var.f186724b = x93Var;
            qa3Var.f186725c = setM77310m0;
            qa3Var.f186730h = 1;
            objM96761b = zre1Var.m96761b(yourLibraryContainsRequest, qa3Var);
            if (objM96761b == yukVar) {
                return yukVar;
            }
        } catch (Throwable th3) {
            th = th3;
            c6x0Var = new c6x0(th);
        }
        c6x0Var = (YourLibraryContainsResponse) objM96761b;
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        YourLibraryContainsResponse yourLibraryContainsResponse = (YourLibraryContainsResponse) c6x0Var;
        if (yourLibraryContainsResponse != null && yourLibraryContainsResponse.m98154p().length() <= 0) {
            ae50 ae50VarM98153o = yourLibraryContainsResponse.m98153o();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : ae50VarM98153o) {
                if (((YourLibraryContainsResponseEntity) obj4).m98156o()) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((YourLibraryContainsResponseEntity) it2.next()).getUri());
            }
            Set setM43736n1 = g6f.m43736n1(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : list) {
                aa3 aa3Var = (aa3) obj5;
                if (!(aa3Var instanceof y93)) {
                    if (!(aa3Var instanceof z93)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z93 z93Var = (z93) aa3Var;
                    if (setM77310m0.contains(z93Var.m95617a()) || setM43736n1.contains(z93Var.m95617a())) {
                    }
                }
                arrayList6.add(obj5);
            }
            if (arrayList6.size() != list.size()) {
                if (arrayList6.isEmpty()) {
                    return arrayList6;
                }
                lsi0Var = ya3Var.f270755o;
                qa3Var.f186723a = null;
                qa3Var.f186724b = x93Var;
                qa3Var.f186725c = null;
                qa3Var.f186726d = arrayList6;
                qa3Var.f186727e = lsi0Var;
                qa3Var.f186730h = 2;
                if (lsi0Var.mo54248a(qa3Var) == yukVar) {
                    return yukVar;
                }
                x93Var2 = x93Var;
                list2 = arrayList6;
                ya3Var.m93172e(m93169l(x93Var2), list2);
                return list2;
            }
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: b */
    public static final Object m93167b(ya3 ya3Var, ka3 ka3Var, String str, ibk ibkVar) {
        sa3 sa3Var;
        ka3 ka3Var2;
        ka3 ka3Var3;
        Object obj;
        ya3 ya3Var2;
        Object c6x0Var;
        String str2 = str;
        ya3Var.getClass();
        if (ibkVar instanceof sa3) {
            sa3Var = (sa3) ibkVar;
            int i = sa3Var.f207120f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa3Var.f207120f = i - Integer.MIN_VALUE;
            } else {
                sa3Var = new sa3(ya3Var, ibkVar);
            }
        } else {
            sa3Var = new sa3(ya3Var, ibkVar);
        }
        Object obj2 = sa3Var.f207118d;
        int i2 = sa3Var.f207120f;
        if (i2 == 0) {
            bga.m29073P(obj2);
            try {
                wt80 wt80Var = ya3Var.f270742b;
                st80 st80Var = new st80(za3.f280974k, null, null, false, null, c5u0.f34291a, null, 0, null, 478);
                ka3Var2 = ka3Var;
                try {
                    sa3Var.f207115a = ka3Var2;
                    sa3Var.f207116b = str2;
                    sa3Var.f207117c = ya3Var;
                    sa3Var.f207120f = 1;
                    Object objM62841f = ((mu80) wt80Var).m62841f(str2, st80Var, sa3Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM62841f == yukVar) {
                        return yukVar;
                    }
                    ka3Var3 = ka3Var2;
                    obj = objM62841f;
                    ya3Var2 = ya3Var;
                } catch (Throwable th) {
                    th = th;
                    c6x0Var = new c6x0(th);
                    ka3Var3 = ka3Var2;
                }
            } catch (Throwable th2) {
                th = th2;
                ka3Var2 = ka3Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ya3 ya3Var3 = sa3Var.f207117c;
            String str3 = sa3Var.f207116b;
            ka3Var3 = sa3Var.f207115a;
            try {
                bga.m29073P(obj2);
                ya3Var2 = ya3Var3;
                str2 = str3;
                obj = obj2;
            } catch (Throwable th3) {
                th = th3;
                ka3Var2 = ka3Var3;
                c6x0Var = new c6x0(th);
                ka3Var3 = ka3Var2;
            }
        }
        c6x0Var = (ha3) ((p2x0) obj).m68969b(new n62(10, ya3Var2, ka3Var3), new C2639z6(ya3Var2, ka3Var3, str2, 22));
        return c6x0Var instanceof c6x0 ? ya3Var.m93174g(ka3Var3) : c6x0Var;
    }

    /* JADX INFO: renamed from: h */
    public static List m93168h(String str) {
        if (str.length() == 0) {
            return lau.f131415a;
        }
        List<String> listM88477a1 = wl51.m88477a1(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a1, 10));
        for (String str2 : listM88477a1) {
            arrayList.add(wj50.m88271j(str2, "spotify:collection") ? y93.f270477a : new z93(str2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static String m93169l(x93 x93Var) {
        int iOrdinal = x93Var.ordinal();
        if (iOrdinal == 0) {
            return "yl-settings-preferred-save-location-songs";
        }
        if (iOrdinal == 1) {
            return "yl-settings-preferred-save-location-talk";
        }
        if (iOrdinal == 2) {
            return "yl-settings-preferred-save-location-audiobooks";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007e, B:29:0x0086, B:30:0x008c, B:32:0x0094, B:33:0x009a), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007e, B:29:0x0086, B:30:0x008c, B:32:0x0094, B:33:0x009a), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007e, B:29:0x0086, B:30:0x008c, B:32:0x0094, B:33:0x009a), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x007e, B:29:0x0086, B:30:0x008c, B:32:0x0094, B:33:0x009a), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m93170c(x93 x93Var, aa3 aa3Var, ibk ibkVar) {
        la3 la3Var;
        jsi0 jsi0Var;
        int i;
        jsi0 jsi0Var2;
        String strM93169l;
        aa3 aa3Var2;
        List list;
        Object u93Var;
        if (ibkVar instanceof la3) {
            la3Var = (la3) ibkVar;
            int i2 = la3Var.f131235h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                la3Var.f131235h = i2 - Integer.MIN_VALUE;
            } else {
                la3Var = new la3(this, ibkVar);
            }
        } else {
            la3Var = new la3(this, ibkVar);
        }
        Object obj = la3Var.f131233f;
        int i3 = la3Var.f131235h;
        Object obj2 = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                la3Var.f131228a = x93Var;
                la3Var.f131229b = aa3Var;
                jsi0Var = this.f270755o;
                la3Var.f131230c = jsi0Var;
                i = 0;
                la3Var.f131232e = 0;
                la3Var.f131235h = 1;
                if (jsi0Var.mo54248a(la3Var) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strM93169l = la3Var.f131231d;
                jsi0Var2 = la3Var.f131230c;
                aa3Var2 = la3Var.f131229b;
                try {
                    bga.m29073P(obj);
                    list = (List) obj;
                    if (list.contains(aa3Var2)) {
                        u93Var = new u93(1);
                    } else if (list.size() >= 10) {
                        u93Var = new u93(2);
                    } else {
                        m93172e(strM93169l, g6f.m43701O0(aa3Var2, list));
                        u93Var = v93.f238832a;
                    }
                    jsi0Var2.mo54249c(null);
                    return u93Var;
                } catch (Throwable th) {
                    th = th;
                    jsi0Var2.mo54249c(null);
                    throw th;
                }
            }
            int i4 = la3Var.f131232e;
            jsi0 jsi0Var3 = la3Var.f131230c;
            aa3 aa3Var3 = la3Var.f131229b;
            x93 x93Var2 = la3Var.f131228a;
            bga.m29073P(obj);
            jsi0Var = jsi0Var3;
            aa3Var = aa3Var3;
            i = i4;
            x93Var = x93Var2;
            strM93169l = m93169l(x93Var);
            la3Var.f131228a = null;
            la3Var.f131229b = aa3Var;
            la3Var.f131230c = jsi0Var;
            la3Var.f131231d = strM93169l;
            la3Var.f131232e = i;
            la3Var.f131235h = 2;
            Object objM93173f = m93173f(strM93169l, la3Var);
            if (objM93173f != obj2) {
                aa3Var2 = aa3Var;
                jsi0Var2 = jsi0Var;
                obj = objM93173f;
                list = (List) obj;
                if (list.contains(aa3Var2)) {
                    u93Var = new u93(1);
                } else if (list.size() >= 10) {
                    u93Var = new u93(2);
                } else {
                    m93172e(strM93169l, g6f.m43701O0(aa3Var2, list));
                    u93Var = v93.f238832a;
                }
                jsi0Var2.mo54249c(null);
                return u93Var;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            jsi0Var2 = jsi0Var;
            jsi0Var2.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final aa3 m93171d(x93 x93Var) {
        int iOrdinal = x93Var.ordinal();
        if (iOrdinal == 0) {
            this.f270745e.getClass();
            return new z93("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
        }
        if (iOrdinal == 1) {
            this.f270751k.getClass();
            return new z93("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt");
        }
        if (iOrdinal == 2) {
            return y93.f270477a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public final void m93172e(String str, List list) {
        zv41 zv41Var;
        Object value;
        do {
            zv41Var = this.f270756p;
            value = zv41Var.getValue();
        } while (!zv41Var.m97089k(value, kkc0.m56701n0((Map) value, pft0.m69840u(str, list))));
        x0h1.m89578u(this.f270757q, null, 0, new C1968i6(this, str, list, null, 21), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m93173f(String str, ibk ibkVar) {
        ma3 ma3Var;
        ya3 ya3Var;
        if (ibkVar instanceof ma3) {
            ma3Var = (ma3) ibkVar;
            int i = ma3Var.f141443d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ma3Var.f141443d = i - Integer.MIN_VALUE;
            } else {
                ma3Var = new ma3(this, ibkVar);
            }
        } else {
            ma3Var = new ma3(this, ibkVar);
        }
        Object objM86755t = ma3Var.f141441b;
        int i2 = ma3Var.f141443d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            List list = (List) ((Map) this.f270756p.getValue()).get(str);
            if (list != null) {
                return list;
            }
            fiz fizVarM86026c = this.f270752l.m86026c(str, "");
            ma3Var.f141440a = this;
            ma3Var.f141443d = 1;
            objM86755t = vyf1.m86755t(fizVarM86026c, ma3Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
            ya3Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ya3Var = ma3Var.f141440a;
            bga.m29073P(objM86755t);
        }
        ya3Var.getClass();
        return m93168h((String) objM86755t);
    }

    /* JADX INFO: renamed from: g */
    public final ha3 m93174g(ka3 ka3Var) {
        int iOrdinal = ka3Var.ordinal();
        if (iOrdinal == 0) {
            return (ba3) this.f270758r.getValue();
        }
        if (iOrdinal == 1) {
            return za3.f280973j;
        }
        if (iOrdinal == 2) {
            return za3.f280971h;
        }
        if (iOrdinal == 3) {
            return za3.f280972i;
        }
        if (iOrdinal != 4) {
            return iOrdinal != 6 ? da3.f46966a : za3.f280973j;
        }
        return (ea3) this.f270759s.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX INFO: renamed from: i */
    public final Single m93175i(String str) {
        Single singleJust;
        Set set = dd41.f47702f;
        int iOrdinal = r46.m74726U(str).f47709c.ordinal();
        if (iOrdinal == 169) {
            singleJust = Single.just(ka3.f120771e);
        } else if (iOrdinal == 422) {
            singleJust = Single.just(ka3.f120767a);
        } else if (iOrdinal == 656) {
            singleJust = Single.just(ka3.f120773g);
        } else if (iOrdinal != 845) {
            ka3 ka3Var = ka3.f120772f;
            if (iOrdinal == 861) {
                singleJust = ((jpx) this.f270746f).m53978b(new C1668ai("aligned_curation", new C2597y1(str, 25))).map(new vah1(str, 1)).filter(gk40.f80721d).map(y5i0.f269465d).timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(njy0.f154698e).onErrorReturnItem(ka3Var);
            } else if (iOrdinal != 925) {
                singleJust = Single.just(ka3Var);
            } else {
                singleJust = Single.just(ka3.f120767a);
            }
        } else {
            singleJust = Single.just(ka3.f120768b);
        }
        return singleJust.flatMap(new lh51(16, this, str));
    }

    /* JADX INFO: renamed from: j */
    public final Single m93176j(ka3 ka3Var, fv31 fv31Var) {
        return this.f270754n.flatMap(new ood0(this, ka3Var, fv31Var, 22));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m93177k(x93 x93Var, ibk ibkVar) {
        pa3 pa3Var;
        jsi0 jsi0Var;
        int i;
        Throwable th;
        jsi0 jsi0Var2;
        if (ibkVar instanceof pa3) {
            pa3Var = (pa3) ibkVar;
            int i2 = pa3Var.f175376f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pa3Var.f175376f = i2 - Integer.MIN_VALUE;
            } else {
                pa3Var = new pa3(this, ibkVar);
            }
        } else {
            pa3Var = new pa3(this, ibkVar);
        }
        Object obj = pa3Var.f175374d;
        int i3 = pa3Var.f175376f;
        Object obj2 = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                pa3Var.f175371a = x93Var;
                jsi0Var = this.f270755o;
                pa3Var.f175372b = jsi0Var;
                pa3Var.f175373c = 0;
                pa3Var.f175376f = 1;
                if (jsi0Var.mo54248a(pa3Var) != obj2) {
                    i = 0;
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsi0Var2 = pa3Var.f175372b;
                try {
                    bga.m29073P(obj);
                    Boolean boolM74178H = qyg1.m74178H(((List) obj).size() >= 10);
                    jsi0Var2.mo54249c(null);
                    return boolM74178H;
                } catch (Throwable th2) {
                    th = th2;
                    jsi0Var2.mo54249c(null);
                    throw th;
                }
            }
            int i4 = pa3Var.f175373c;
            jsi0 jsi0Var3 = pa3Var.f175372b;
            x93 x93Var2 = pa3Var.f175371a;
            bga.m29073P(obj);
            jsi0Var = jsi0Var3;
            i = i4;
            x93Var = x93Var2;
            String strM93169l = m93169l(x93Var);
            pa3Var.f175371a = null;
            pa3Var.f175372b = jsi0Var;
            pa3Var.f175373c = i;
            pa3Var.f175376f = 2;
            Object objM93173f = m93173f(strM93169l, pa3Var);
            if (objM93173f != obj2) {
                jsi0 jsi0Var4 = jsi0Var;
                obj = objM93173f;
                jsi0Var2 = jsi0Var4;
                Boolean boolM74178H2 = qyg1.m74178H(((List) obj).size() >= 10);
                jsi0Var2.mo54249c(null);
                return boolM74178H2;
            }
            return obj2;
        } catch (Throwable th3) {
            jsi0 jsi0Var5 = jsi0Var;
            th = th3;
            jsi0Var2 = jsi0Var5;
            jsi0Var2.mo54249c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x0081, B:29:0x0089, B:30:0x0091, B:35:0x009f, B:37:0x00a9, B:38:0x00b1), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x0081, B:29:0x0089, B:30:0x0091, B:35:0x009f, B:37:0x00a9, B:38:0x00b1), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002f, B:27:0x0081, B:29:0x0089, B:30:0x0091, B:35:0x009f, B:37:0x00a9, B:38:0x00b1), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m93178m(x93 x93Var, aa3 aa3Var, ibk ibkVar) throws Throwable {
        ra3 ra3Var;
        jsi0 jsi0Var;
        int i;
        jsi0 jsi0Var2;
        aa3 aa3Var2;
        x93 x93Var2;
        String str;
        Collection collectionM44518y;
        List list;
        boolean zContains;
        w2a1 w2a1Var;
        ArrayList arrayListM43696J0;
        List listM44518y;
        if (ibkVar instanceof ra3) {
            ra3Var = (ra3) ibkVar;
            int i2 = ra3Var.f197177h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ra3Var.f197177h = i2 - Integer.MIN_VALUE;
            } else {
                ra3Var = new ra3(this, ibkVar);
            }
        } else {
            ra3Var = new ra3(this, ibkVar);
        }
        Object obj = ra3Var.f197175f;
        int i3 = ra3Var.f197177h;
        Object obj2 = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                ra3Var.f197170a = x93Var;
                ra3Var.f197171b = aa3Var;
                jsi0Var = this.f270755o;
                ra3Var.f197172c = jsi0Var;
                i = 0;
                ra3Var.f197174e = 0;
                ra3Var.f197177h = 1;
                if (jsi0Var.mo54248a(ra3Var) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = ra3Var.f197173d;
                jsi0Var2 = ra3Var.f197172c;
                aa3Var2 = ra3Var.f197171b;
                x93Var2 = ra3Var.f197170a;
                try {
                    bga.m29073P(obj);
                    collectionM44518y = (Collection) obj;
                    if (collectionM44518y.isEmpty()) {
                        collectionM44518y = geg1.m44518y(m93171d(x93Var2));
                    }
                    list = (List) collectionM44518y;
                    zContains = list.contains(aa3Var2);
                    w2a1Var = w2a1.f247311a;
                    if (!zContains) {
                        jsi0Var2.mo54249c(null);
                        return w2a1Var;
                    }
                    arrayListM43696J0 = g6f.m43696J0(list, aa3Var2);
                    if (arrayListM43696J0.isEmpty()) {
                        listM44518y = arrayListM43696J0;
                        listM44518y = geg1.m44518y(m93171d(x93Var2));
                    }
                    listM44518y = arrayListM43696J0;
                    m93172e(str, listM44518y);
                    jsi0Var2.mo54249c(null);
                    return w2a1Var;
                } catch (Throwable th) {
                    th = th;
                    jsi0Var2.mo54249c(null);
                    throw th;
                }
            }
            int i4 = ra3Var.f197174e;
            jsi0 jsi0Var3 = ra3Var.f197172c;
            aa3 aa3Var3 = ra3Var.f197171b;
            x93 x93Var3 = ra3Var.f197170a;
            bga.m29073P(obj);
            jsi0Var = jsi0Var3;
            aa3Var = aa3Var3;
            i = i4;
            x93Var = x93Var3;
            String strM93169l = m93169l(x93Var);
            ra3Var.f197170a = x93Var;
            ra3Var.f197171b = aa3Var;
            ra3Var.f197172c = jsi0Var;
            ra3Var.f197173d = strM93169l;
            ra3Var.f197174e = i;
            ra3Var.f197177h = 2;
            Object objM93173f = m93173f(strM93169l, ra3Var);
            if (objM93173f != obj2) {
                aa3Var2 = aa3Var;
                jsi0Var2 = jsi0Var;
                obj = objM93173f;
                x93Var2 = x93Var;
                str = strM93169l;
                collectionM44518y = (Collection) obj;
                if (collectionM44518y.isEmpty()) {
                    collectionM44518y = geg1.m44518y(m93171d(x93Var2));
                }
                list = (List) collectionM44518y;
                zContains = list.contains(aa3Var2);
                w2a1Var = w2a1.f247311a;
                if (!zContains) {
                    jsi0Var2.mo54249c(null);
                    return w2a1Var;
                }
                arrayListM43696J0 = g6f.m43696J0(list, aa3Var2);
                if (arrayListM43696J0.isEmpty()) {
                    listM44518y = arrayListM43696J0;
                    listM44518y = geg1.m44518y(m93171d(x93Var2));
                }
                listM44518y = arrayListM43696J0;
                m93172e(str, listM44518y);
                jsi0Var2.mo54249c(null);
                return w2a1Var;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            jsi0Var2 = jsi0Var;
            jsi0Var2.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final fiz m93179n(x93 x93Var) {
        String strM93169l = m93169l(x93Var);
        return mvl0.m62953p(new bq0(g0g1.m43299d(new C2417tj(21, this.f270752l.m86026c(strM93169l, ""), this), new va3(this.f270756p, strM93169l, 0), new xa3()), this, x93Var, strM93169l, 4));
    }
}
