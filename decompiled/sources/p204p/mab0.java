package p204p;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ravelin.core.model.RavelinError;
import com.spotify.mobius.functions.Producer;
import com.spotify.offline_esperanto.proto.EsOffline$Device;
import com.spotify.offline_esperanto.proto.EsOffline$GetDevicesResponse;
import com.spotify.pses.p134v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class mab0 implements hab, Function, gkc0, Producer, cwr, knx0, BiFunction, tpk, yvy, orq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141549a;

    /* JADX INFO: renamed from: b */
    public Object f141550b;

    public /* synthetic */ mab0(Object obj, int i) {
        this.f141549a = i;
        this.f141550b = obj;
    }

    /* JADX INFO: renamed from: s */
    public static cva m61277s(byte[] bArr) {
        cva cvaVar = gva.f84678b;
        return gva.m45886d(0, bArr, bArr.length);
    }

    @Override // p204p.orq0
    /* JADX INFO: renamed from: a */
    public pfm0 mo61278a() {
        return ((zu0) this.f141550b).m96959A();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f141549a) {
            case 1:
                qqm0 qqm0Var = (qqm0) obj;
                nt30 nt30Var = (nt30) qqm0Var.f191621b;
                Boolean bool = (Boolean) qqm0Var.f191620a;
                bool.getClass();
                return (bool.booleanValue() || !s2o.m77053D(nt30Var)) ? nt30Var : ((s2o) this.f141550b).m77089s();
            case 11:
                ae50<EsOffline$Device> ae50VarM16148n = ((EsOffline$GetDevicesResponse) obj).m16148n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16148n, 10));
                for (EsOffline$Device esOffline$Device : ae50VarM16148n) {
                    wj50.m88279p(esOffline$Device);
                    arrayList.add(tjc0.m80979a(esOffline$Device));
                }
                List listM29620k1 = bk5.m29620k1((b5r[]) this.f141550b);
                if (listM29620k1.isEmpty()) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (listM29620k1.contains(((f5r) obj2).m40774h())) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 18:
                qko0 qko0Var = (qko0) obj;
                pvo0 pvo0Var = (pvo0) this.f141550b;
                return pvo0Var.f181804a.m45730d(w9h1.m87509k(qko0Var)).m23292c(new CompletableDefer(new ovo0(pvo0Var, qko0Var))).m23293d(Observable.empty());
            case 21:
                cwq0 cwq0Var = (cwq0) obj;
                owq0 owq0VarM34149a = cwq0Var.m34149a();
                iwq0 iwq0Var = (iwq0) this.f141550b;
                boolean zMo37646j = iwq0Var.f106498e.mo37646j();
                boolean zM34150b = cwq0Var.m34150b();
                czj czjVar = iwq0Var.f106499f;
                return fjf1.m41835y(owq0VarM34149a, zMo37646j, zM34150b, czjVar.m34453a(), cwq0Var.m34151c(), iwq0Var.f106500g.m55581d(), czjVar.m34454b());
            default:
                return Boolean.valueOf(dxf1.m37218G((Map) obj) && ((a8t0) ((eg30) this.f141550b).f59207c).m25050a());
        }
    }

    @Override // p204p.gkc0
    /* JADX INFO: renamed from: b */
    public Object mo24366b(Object obj, Object obj2) {
        return ((qh00) this.f141550b).apply(obj2);
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
        lau0 lau0Var = (lau0) this.f141550b;
        n2x0 n2x0Var = o2x0Var.f161171a;
        if (n2x0Var.f149852O0) {
            if (lau0Var != null) {
                lau0Var.mo46941b();
            }
        } else if (lau0Var != null) {
            lau0Var.mo46940a(new RavelinError(n2x0Var.f149859c, null, 2, null));
        }
    }

    @Override // p204p.cwr
    /* JADX INFO: renamed from: d */
    public ojq mo34152d() {
        return (pjq) this.f141550b;
    }

    @Override // p204p.cwr
    public void dispose() {
        pjq pjqVar = (pjq) this.f141550b;
        if (pjqVar.isActive()) {
            pjqVar.mo26601e(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public c5t0 m61279e() {
        boolean z = !m61284p(9);
        boolean zM61284p = m61284p(8);
        boolean zM61284p2 = m61284p(2);
        boolean z2 = !m61284p(10);
        boolean zM61284p3 = m61284p(3);
        boolean zM61284p4 = m61284p(4);
        boolean zM61284p5 = m61284p(5);
        boolean zM61284p6 = m61284p(1);
        boolean zM61284p7 = m61284p(11);
        boolean zM61284p8 = m61284p(13);
        boolean zM61284p9 = m61284p(12);
        ConfigurationResponse configurationResponse = (ConfigurationResponse) this.f141550b;
        ky9 ky9Var = new ky9(configurationResponse, m61284p(1), m61284p(2), m61284p(3), !m61284p(9), !m61284p(10), m61284p(4), m61284p(5));
        int iM19966r = configurationResponse.m19966r();
        return new c5t0(z, z2, zM61284p2, zM61284p3, zM61284p4, zM61284p5, zM61284p6, zM61284p, zM61284p7, zM61284p8, zM61284p9, (iM19966r == 0 ? -1 : jy9.f117330a[edb.m38547C(iM19966r)]) == 1 ? ky9Var.m57648b(configurationResponse.m19965q()) : ky9Var.m57648b(null));
    }

    /* JADX INFO: renamed from: f */
    public void m61280f(h6v0 h6v0Var) {
        ((g8v0) ((e8v0) this.f141550b)).m43966a(h6v0Var);
    }

    /* JADX INFO: renamed from: g */
    public Object m61281g(String str) {
        z4l0 z4l0Var = (z4l0) this.f141550b;
        ztw0 ztw0Var = new ztw0();
        ztw0Var.m96954g(str);
        ztw0Var.m96949b();
        return fyg1.m43102z(z4l0Var.m95348b(new auw0(ztw0Var)).m97071g(), h5l0.f87866a);
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return ((jph0) this.f141550b).f114657b.m27679l();
    }

    @Override // p204p.yvy
    /* JADX INFO: renamed from: h */
    public kwy mo28558h(ovy ovyVar) {
        return ((m12) this.f141550b).mo28558h(ovyVar);
    }

    @Override // p204p.knx0
    /* JADX INFO: renamed from: i */
    public Intent mo28051i(Intent intent) {
        nbq0 nbq0Var = (nbq0) this.f141550b;
        Uri data = intent.getData();
        Uri uriBuild = !wj50.m88271j(data != null ? data.getAuthority() : null, "open.spotify.com") ? null : data.buildUpon().authority("www.spotify.com").build();
        if (uriBuild == null) {
            return null;
        }
        return nbq0Var.f152337b.m51410a(nbq0Var.f152336a, new hqq0(y0e.f267970b, uriBuild));
    }

    @Override // p204p.yvy
    /* JADX INFO: renamed from: j */
    public fwy mo28559j(ovy ovyVar) {
        return ((m12) this.f141550b).mo28559j(ovyVar);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        p3x0 p3x0Var = (p3x0) obj;
        try {
            try {
                AbstractC0269h abstractC0269hM74432b = ((r110) ((r2n0) this.f141550b)).m74432b(p3x0Var.m69091a(), r110.f194681b);
                p3x0Var.close();
                return abstractC0269hM74432b;
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            p3x0Var.close();
            throw th;
        }
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public void mo25646l(x8b x8bVar, Throwable th) {
        lau0 lau0Var = (lau0) this.f141550b;
        if (lau0Var != null) {
            lau0Var.mo46940a(new RavelinError(th.getMessage(), null, 2, null));
        }
    }

    @Override // p204p.orq0
    /* JADX INFO: renamed from: m */
    public r4m0 mo61282m() {
        return ((zu0) this.f141550b).m96977h();
    }

    @Override // p204p.yvy
    /* JADX INFO: renamed from: n */
    public ovy mo28560n(String str) {
        return ((m12) this.f141550b).mo28560n(str);
    }

    /* JADX INFO: renamed from: o */
    public qge0 m61283o(vb40 vb40Var, pge0 pge0Var, ci21 ci21Var, ray0 ray0Var) {
        qge0 qge0Var;
        int iAbs;
        h4b h4bVar = vb40Var.f239408j;
        int i = vb40Var.f239416r;
        if (h4bVar.f87483a) {
            mvu0 mvu0VarM48899d = ((hvu0) this.f141550b).m48899d();
            if (mvu0VarM48899d != null) {
                synchronized (mvu0VarM48899d.f147653c) {
                    try {
                        rvu0 rvu0Var = (rvu0) mvu0VarM48899d.f147651a.f224244c.f214511a.get(pge0Var);
                        qge0 qge0Var2 = null;
                        qge0Var = rvu0Var != null ? new qge0(rvu0Var.f203131a, rvu0Var.f203132b) : null;
                        if (qge0Var == null) {
                            sgz sgzVar = mvu0VarM48899d.f147652b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) sgzVar.f208959c).get(pge0Var);
                            if (arrayList != null) {
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    vvu0 vvu0Var = (vvu0) arrayList.get(i2);
                                    p340 p340Var = (p340) vvu0Var.m86493b().get();
                                    qge0 qge0Var3 = p340Var != null ? new qge0(p340Var, vvu0Var.m86492a()) : null;
                                    if (qge0Var3 != null) {
                                        qge0Var2 = qge0Var3;
                                        break;
                                    }
                                }
                                sgzVar.m78115b();
                            }
                            qge0Var = qge0Var2;
                        }
                        if (qge0Var != null && !qge0Var.f188454a.mo68989e()) {
                            mvu0VarM48899d.m62968b(pge0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                qge0Var = null;
            }
            if (qge0Var != null && r0e1.m74374j(vb40Var, qge0Var)) {
                String str = (String) pge0Var.f177296b.get("coil#size");
                if (str == null) {
                    Object obj = qge0Var.f188455b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    p340 p340Var2 = qge0Var.f188454a;
                    if (zBooleanValue || (!wj50.m88271j(ci21Var, ci21.f38193c) && i != 2)) {
                        int iMo68988d = p340Var2.mo68988d();
                        int iMo68986b = p340Var2.mo68986b();
                        ci21 ci21Var2 = p340Var2 instanceof rh9 ? (ci21) zuj0.m97054q(vb40Var, yb40.f271072b) : ci21.f38193c;
                        tjr tjrVar = ci21Var.f38194a;
                        int i3 = tjrVar instanceof njr ? ((njr) tjrVar).f154650a : Integer.MAX_VALUE;
                        tjr tjrVar2 = ci21Var2.f38194a;
                        int iMin = Math.min(i3, tjrVar2 instanceof njr ? ((njr) tjrVar2).f154650a : Integer.MAX_VALUE);
                        tjr tjrVar3 = ci21Var.f38195b;
                        int i4 = tjrVar3 instanceof njr ? ((njr) tjrVar3).f154650a : Integer.MAX_VALUE;
                        tjr tjrVar4 = ci21Var2.f38195b;
                        int iMin2 = Math.min(i4, tjrVar4 instanceof njr ? ((njr) tjrVar4).f154650a : Integer.MAX_VALUE);
                        double d = ((double) iMin) / ((double) iMo68988d);
                        double d2 = ((double) iMin2) / ((double) iMo68986b);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? ray0.f197408b : ray0Var).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (d < d2) {
                                iAbs = Math.abs(iMin - iMo68988d);
                            } else {
                                iAbs = Math.abs(iMin2 - iMo68986b);
                                d = d2;
                            }
                        } else if (d > d2) {
                            iAbs = Math.abs(iMin - iMo68988d);
                        } else {
                            iAbs = Math.abs(iMin2 - iMo68986b);
                            d = d2;
                        }
                        if (iAbs > 1) {
                            int iM38547C = edb.m38547C(i);
                            if (iM38547C != 0) {
                                if (iM38547C != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (d <= 1.0d) {
                                }
                            } else if (d == 1.0d) {
                            }
                        }
                    }
                    return qge0Var;
                }
                if (str.equals(ci21Var.toString())) {
                    return qge0Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m61284p(int i) {
        ae50 ae50VarM19964p = ((ConfigurationResponse) this.f141550b).m19964p();
        if (ae50VarM19964p.isEmpty()) {
            return false;
        }
        Iterator<E> it = ae50VarM19964p.iterator();
        while (it.hasNext()) {
            if (bm51.m29797h0((String) it.next(), rbz.m75188f(i), true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public pge0 m61285q(vb40 vb40Var, Object obj, ivl0 ivl0Var, v5x v5xVar) {
        String strMo59521a;
        h4b h4bVar = vb40Var.f239408j;
        Map map = vb40Var.f239403e;
        if (h4bVar != h4b.DISABLED) {
            List list = ((hvu0) this.f141550b).f95798d.f43020c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    strMo59521a = null;
                    break;
                }
                pqm0 pqm0Var = (pqm0) list.get(i);
                vz60 vz60Var = (vz60) pqm0Var.f180350a;
                if (((up60) pqm0Var.f180351b).mo29118z(obj) && (strMo59521a = vz60Var.mo59521a(obj, ivl0Var)) != null) {
                    break;
                }
                i++;
            }
            if (strMo59521a != null) {
                if (((List) zuj0.m97054q(vb40Var, yb40.f271071a)).isEmpty()) {
                    return new pge0(strMo59521a, map);
                }
                LinkedHashMap linkedHashMapM56709v0 = kkc0.m56709v0(map);
                linkedHashMapM56709v0.put("coil#size", ivl0Var.f106233b.toString());
                return new pge0(strMo59521a, linkedHashMapM56709v0);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public Serializable m61286r(List list, ibk ibkVar) {
        wce0 wce0Var;
        List list2;
        List<efe0> list3;
        if (ibkVar instanceof wce0) {
            wce0Var = (wce0) ibkVar;
            int i = wce0Var.f250030e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wce0Var.f250030e = i - Integer.MIN_VALUE;
            } else {
                wce0Var = new wce0(this, ibkVar);
            }
        } else {
            wce0Var = new wce0(this, ibkVar);
        }
        Object obj = wce0Var.f250028c;
        int i2 = wce0Var.f250030e;
        if (i2 == 0) {
            ArrayList arrayListM93485o = yds.m93485o(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((efe0) obj2).m38729b()) {
                    arrayListM93485o.add(obj2);
                } else {
                    arrayList.add(obj2);
                }
            }
            vsk vskVar = (vsk) this.f141550b;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((efe0) it.next()).m38728a());
            }
            wce0Var.f250026a = arrayListM93485o;
            wce0Var.f250027b = arrayList;
            wce0Var.f250030e = 1;
            Object objM30568t = bul.m30568t(vskVar, arrayList2, wce0Var);
            yuk yukVar = yuk.f276404a;
            if (objM30568t == yukVar) {
                return yukVar;
            }
            list2 = arrayListM93485o;
            obj = objM30568t;
            list3 = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = wce0Var.f250027b;
            list2 = wce0Var.f250026a;
            bga.m29073P(obj);
        }
        Map map = (Map) obj;
        mec0 mec0Var = new mec0();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            mec0Var.put(((efe0) it2.next()).m38728a(), xzw0.f267817a);
        }
        for (efe0 efe0Var : list3) {
            String strM38728a = efe0Var.m38728a();
            gmr0 gmr0Var = (gmr0) map.get(efe0Var.m38728a());
            mec0Var.put(strM38728a, gmr0Var == null ? zzw0.f288123a : new yzw0(gmr0Var.f81451b, gmr0Var.f81455f));
        }
        return mec0Var.m61540b();
    }

    public mab0(Application application, Optional optional) {
        String str;
        this.f141549a = 28;
        this.f141550b = mlg1.m62210c();
        String str2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        int iOrdinal = ((fnf) hbg1.m47041l(optional)).ordinal();
        if (iOrdinal == 0) {
            str = "publishable_key_live_JN8NYwOVNhe3fvZCqyudlG2VZCJ7Dy43";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "publishable_key_test_uNNoxKSSQBHgLDtYFrQxjo12PEDdzoPO";
        }
        r46 r46Var = wau0.f249610n;
        x74 x74Var = new x74(4);
        x74Var.m90127r();
        x74Var.m90128s();
        r46.m74715H(application, str, str2, x74.m90117p(), new iau0(this));
    }

    public mab0(hvu0 hvu0Var, r0e1 r0e1Var) {
        this.f141549a = 6;
        this.f141550b = hvu0Var;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return yjr0.m93938a((yjr0) this.f141550b, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
