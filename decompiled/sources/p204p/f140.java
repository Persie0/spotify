package p204p;

import com.spotify.offline.offlineplugin_proto.C1079e;
import com.spotify.offline.offlineplugin_proto.C1080f;
import com.spotify.offline.offlineplugin_proto.EnumC1081g;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;
import com.spotify.offline_esperanto.proto.C1091c;
import com.spotify.offline_esperanto.proto.C1092d;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Item;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f140 {

    /* JADX INFO: renamed from: a */
    public static final PlaylistRequestDecorationPolicy f64785a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29496H();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        f64785a = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0138, code lost:
    
        if (r2 == r12) goto L48;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m40518a(ArrayList arrayList, fwk0 fwk0Var, wt80 wt80Var, kr00 kr00Var, ibk ibkVar) {
        v040 v040Var;
        wt80 wt80Var2;
        List list;
        kr00 kr00Var2;
        List list2;
        List list3;
        fwk0 fwk0Var2 = fwk0Var;
        if (ibkVar instanceof v040) {
            v040Var = (v040) ibkVar;
            int i = v040Var.f235912f;
            if ((i & Integer.MIN_VALUE) != 0) {
                v040Var.f235912f = i - Integer.MIN_VALUE;
            } else {
                v040Var = new v040(ibkVar);
            }
        } else {
            v040Var = new v040(ibkVar);
        }
        Object objM96567o = v040Var.f235911e;
        int i2 = v040Var.f235912f;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        bga.m29073P(objM96567o);
                        C1091c c1091cM16137t = EsOffline$GetContextsRequest.m16137t();
                        xlw xlwVarM16098o = EsOffline$ContextInfoPolicy.m16098o();
                        xlwVarM16098o.m91443m(false);
                        c1091cM16137t.m16217t(xlwVarM16098o);
                        C1092d c1092dM16141q = EsOffline$GetContextsRequest.Filtering.m16141q();
                        c1092dM16141q.m16218m(arrayList);
                        c1091cM16137t.m16216s(c1092dM16141q);
                        EsOffline$GetContextsRequest esOffline$GetContextsRequest = (EsOffline$GetContextsRequest) c1091cM16137t.build();
                        wj50.m88279p(esOffline$GetContextsRequest);
                        Single singleM42968b = fwk0Var2.m42968b(esOffline$GetContextsRequest);
                        v040Var.f235907a = arrayList;
                        v040Var.f235908b = fwk0Var2;
                        wt80Var2 = wt80Var;
                        v040Var.f235909c = wt80Var2;
                        v040Var.f235910d = kr00Var;
                        v040Var.f235912f = 1;
                        objM96567o = zn91.m96567o(singleM42968b, v040Var);
                        if (objM96567o != yukVar) {
                            list = arrayList;
                            kr00Var2 = kr00Var;
                        }
                        return yukVar;
                    }
                    if (i2 == 1) {
                        kr00Var2 = v040Var.f235910d;
                        wt80 wt80Var3 = v040Var.f235909c;
                        fwk0 fwk0Var3 = v040Var.f235908b;
                        list = v040Var.f235907a;
                        bga.m29073P(objM96567o);
                        wt80Var2 = wt80Var3;
                        fwk0Var2 = fwk0Var3;
                    } else {
                        if (i2 == 2) {
                            fwk0 fwk0Var4 = v040Var.f235908b;
                            List list4 = v040Var.f235907a;
                            bga.m29073P(objM96567o);
                            fwk0Var2 = fwk0Var4;
                            list2 = list4;
                            list3 = (List) objM96567o;
                            if (!list3.isEmpty()) {
                                C1091c c1091cM16137t2 = EsOffline$GetContextsRequest.m16137t();
                                c1091cM16137t2.m16213m(list3);
                                C1092d c1092dM16141q2 = EsOffline$GetContextsRequest.Filtering.m16141q();
                                c1092dM16141q2.m16218m(list2);
                                c1091cM16137t2.m16216s(c1092dM16141q2);
                                xlw xlwVarM16098o2 = EsOffline$ContextInfoPolicy.m16098o();
                                xlwVarM16098o2.m91443m(true);
                                c1091cM16137t2.m16217t(xlwVarM16098o2);
                                EsOffline$GetContextsRequest esOffline$GetContextsRequest2 = (EsOffline$GetContextsRequest) c1091cM16137t2.build();
                                wj50.m88279p(esOffline$GetContextsRequest2);
                                Single singleM42968b2 = fwk0Var2.m42968b(esOffline$GetContextsRequest2);
                                v040Var.f235907a = list2;
                                v040Var.f235908b = null;
                                v040Var.f235909c = null;
                                v040Var.f235910d = null;
                                v040Var.f235912f = 3;
                                objM96567o = zn91.m96567o(singleM42968b2, v040Var);
                            }
                            return gbu.f78413a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = v040Var.f235907a;
                        bga.m29073P(objM96567o);
                    }
                    EsOffline$GetContextsResponse esOffline$GetContextsResponse = (EsOffline$GetContextsResponse) objM96567o;
                    wj50.m88279p(esOffline$GetContextsResponse);
                    if (esOffline$GetContextsResponse.m16146q() == 0) {
                        Set setM43736n1 = g6f.m43736n1(list2);
                        ae50 ae50VarM16145p = esOffline$GetContextsResponse.m16145p();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<E> it = ae50VarM16145p.iterator();
                        while (it.hasNext()) {
                            j6f.m52564V(((EsOffline$ContextInfo) it.next()).getItemsList(), arrayList2);
                        }
                        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((EsOffline$Item) it2.next()).getUri());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : arrayList3) {
                            if (setM43736n1.contains((String) obj)) {
                                arrayList4.add(obj);
                            }
                        }
                        return g6f.m43736n1(arrayList4);
                    }
                    return gbu.f78413a;
                    EsOffline$GetContextsResponse esOffline$GetContextsResponse2 = (EsOffline$GetContextsResponse) objM96567o;
                    wj50.m88279p(esOffline$GetContextsResponse2);
                    if (esOffline$GetContextsResponse2.m16146q() == 0) {
                        ae50 ae50VarM16145p2 = esOffline$GetContextsResponse2.m16145p();
                        ArrayList arrayList5 = new ArrayList(i6f.m49804T(ae50VarM16145p2, 10));
                        Iterator<E> it3 = ae50VarM16145p2.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((EsOffline$ContextInfo) it3.next()).m16096o().getUri());
                        }
                        if (!arrayList5.isEmpty()) {
                            v040Var.f235907a = list;
                            v040Var.f235908b = fwk0Var2;
                            v040Var.f235909c = null;
                            v040Var.f235910d = null;
                            v040Var.f235912f = 2;
                            objM96567o = m40520c(arrayList5, wt80Var2, kr00Var2, v040Var);
                            if (objM96567o != yukVar) {
                                list2 = list;
                                list3 = (List) objM96567o;
                                if (!list3.isEmpty()) {
                                    C1091c c1091cM16137t3 = EsOffline$GetContextsRequest.m16137t();
                                    c1091cM16137t3.m16213m(list3);
                                    C1092d c1092dM16141q3 = EsOffline$GetContextsRequest.Filtering.m16141q();
                                    c1092dM16141q3.m16218m(list2);
                                    c1091cM16137t3.m16216s(c1092dM16141q3);
                                    xlw xlwVarM16098o3 = EsOffline$ContextInfoPolicy.m16098o();
                                    xlwVarM16098o3.m91443m(true);
                                    c1091cM16137t3.m16217t(xlwVarM16098o3);
                                    EsOffline$GetContextsRequest esOffline$GetContextsRequest3 = (EsOffline$GetContextsRequest) c1091cM16137t3.build();
                                    wj50.m88279p(esOffline$GetContextsRequest3);
                                    Single singleM42968b3 = fwk0Var2.m42968b(esOffline$GetContextsRequest3);
                                    v040Var.f235907a = list2;
                                    v040Var.f235908b = null;
                                    v040Var.f235909c = null;
                                    v040Var.f235910d = null;
                                    v040Var.f235912f = 3;
                                    objM96567o = zn91.m96567o(singleM42968b3, v040Var);
                                }
                            }
                            return yukVar;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Exception unused) {
            }
            return gbu.f78413a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m40519b(EsOfflinePlugin$IdentifyCommand esOfflinePlugin$IdentifyCommand, fwk0 fwk0Var, wt80 wt80Var, n95 n95Var, kr00 kr00Var, ibk ibkVar) {
        c140 c140Var;
        ArrayList<String> arrayList;
        Set set;
        EnumC1081g enumC1081g;
        if (ibkVar instanceof c140) {
            c140Var = (c140) ibkVar;
            int i = c140Var.f32976d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c140Var.f32976d = i - Integer.MIN_VALUE;
            } else {
                c140Var = new c140(ibkVar);
            }
        } else {
            c140Var = new c140(ibkVar);
        }
        Object objM76980u = c140Var.f32975c;
        int i2 = c140Var.f32976d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                ae50 ae50VarM16050n = esOfflinePlugin$IdentifyCommand.m16050n();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM16050n, 10));
                Iterator<E> it = ae50VarM16050n.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((EsOfflinePlugin$IdentifyCommand.Query) it.next()).getLink());
                }
                try {
                    m320 m320Var = new m320(4, arrayList2, fwk0Var, wt80Var, kr00Var, null);
                    c140Var.f32973a = n95Var;
                    c140Var.f32974b = arrayList2;
                    c140Var.f32976d = 1;
                    objM76980u = s1h1.m76980u(15000L, m320Var, c140Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM76980u == yukVar) {
                        return yukVar;
                    }
                    arrayList = arrayList2;
                } catch (Exception unused) {
                    arrayList = arrayList2;
                    set = null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = c140Var.f32974b;
                n95Var = c140Var.f32973a;
                try {
                    bga.m29073P(objM76980u);
                } catch (Exception unused2) {
                    set = null;
                }
            }
            set = (Set) objM76980u;
            C1079e c1079eM16052o = EsOfflinePlugin$IdentifyResponse.m16052o();
            for (String str : arrayList) {
                if (set == null || !set.contains(str)) {
                    enumC1081g = EnumC1081g.NOT_APPLICABLE;
                } else {
                    wj50.m88279p(str);
                    n95Var.getClass();
                    if (new File(n95Var.m63899H(str), ".cue-manifest").exists()) {
                        File file = new File(n95Var.m63899H(str), ".cue-manifest");
                        if (file.exists()) {
                            String string = wl51.m88491o1(pxy.m71564X(file)).toString();
                            if (string.length() != 0) {
                                List listM88465O0 = wl51.m88465O0(string);
                                if (!listM88465O0.isEmpty()) {
                                    Iterator it2 = listM88465O0.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!n95Var.m63900k(str, (String) it2.next()).exists()) {
                                                enumC1081g = EnumC1081g.MISSING;
                                            }
                                        }
                                    }
                                }
                            }
                            enumC1081g = EnumC1081g.COMPLETE;
                        } else {
                            enumC1081g = EnumC1081g.MISSING;
                        }
                    } else {
                        enumC1081g = EnumC1081g.MISSING;
                    }
                }
                C1080f c1080fM16056q = EsOfflinePlugin$IdentifyResponse.Result.m16056q();
                c1080fM16056q.m16071q(enumC1081g);
                c1079eM16052o.m16069m(str, (EsOfflinePlugin$IdentifyResponse.Result) c1080fM16056q.build());
            }
            return c1079eM16052o.build();
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public static final Object m40520c(ArrayList arrayList, wt80 wt80Var, kr00 kr00Var, ibk ibkVar) {
        d140 d140Var;
        ArrayList arrayListM93485o;
        Object objM62842g;
        kr00 kr00Var2 = kr00Var;
        if (ibkVar instanceof d140) {
            d140Var = (d140) ibkVar;
            int i = d140Var.f44162d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d140Var.f44162d = i - Integer.MIN_VALUE;
            } else {
                d140Var = new d140(ibkVar);
            }
        } else {
            d140Var = new d140(ibkVar);
        }
        Object obj = d140Var.f44161c;
        int i2 = d140Var.f44162d;
        try {
            if (i2 == 0) {
                arrayListM93485o = yds.m93485o(obj);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Boolean bool = (Boolean) kr00Var2.f125486a.get(str);
                    if (bool == null) {
                        arrayList2.add(str);
                    } else if (bool.booleanValue()) {
                        arrayListM93485o.add(str);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return arrayListM93485o;
                }
                int iM31820L = c95.m31820L(i6f.m49804T(arrayList2, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : arrayList2) {
                    linkedHashMap.put(obj2, new vt80((String) obj2, new st80(f64785a, null, null, false, null, c5u0.f34291a, null, 0, null, 478)));
                }
                try {
                    d140Var.f44159a = kr00Var2;
                    d140Var.f44160b = arrayListM93485o;
                    d140Var.f44162d = 1;
                    objM62842g = ((mu80) wt80Var).m62842g(linkedHashMap, null, d140Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM62842g == yukVar) {
                        return yukVar;
                    }
                } catch (Exception unused) {
                    return arrayListM93485o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ArrayList arrayList3 = d140Var.f44160b;
                kr00 kr00Var3 = d140Var.f44159a;
                try {
                    bga.m29073P(obj);
                    arrayListM93485o = arrayList3;
                    kr00Var2 = kr00Var3;
                    objM62842g = obj;
                } catch (Exception unused2) {
                    return arrayList3;
                }
            }
            Map map = (Map) objM62842g;
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                p2x0 p2x0Var = (p2x0) entry.getValue();
                if (p2x0Var instanceof m2x0) {
                    boolean z = ((qu80) ((m2x0) p2x0Var).f139474a).f192599e.f271272q.get("workout.type") != null;
                    kr00Var2.f125486a.put(str2, Boolean.valueOf(z));
                    if (z) {
                        arrayList4.add(str2);
                    }
                }
            }
            return g6f.m43700N0(arrayList4, arrayListM93485o);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
