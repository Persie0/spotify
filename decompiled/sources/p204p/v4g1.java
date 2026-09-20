package p204p;

import com.spotify.allboarding.model.p019v1.proto.Item;
import com.spotify.allboarding.model.p019v1.proto.MoreResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.esperanto.proto.EsQueue$Queue;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class v4g1 implements Function, Init, BiFunction, Predicate, guz0, Function6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237177a;

    /* JADX INFO: renamed from: b */
    public static final v4g1 f237167b = new v4g1(1);

    /* JADX INFO: renamed from: c */
    public static final v4g1 f237169c = new v4g1(2);

    /* JADX INFO: renamed from: d */
    public static final v4g1 f237170d = new v4g1(3);

    /* JADX INFO: renamed from: e */
    public static final v4g1 f237171e = new v4g1(4);

    /* JADX INFO: renamed from: f */
    public static final v4g1 f237172f = new v4g1(5);

    /* JADX INFO: renamed from: g */
    public static final v4g1 f237173g = new v4g1(6);

    /* JADX INFO: renamed from: h */
    public static final v4g1 f237174h = new v4g1(7);

    /* JADX INFO: renamed from: i */
    public static final v4g1 f237175i = new v4g1(8);

    /* JADX INFO: renamed from: t */
    public static final v4g1 f237176t = new v4g1(9);

    /* JADX INFO: renamed from: X */
    public static final v4g1 f237160X = new v4g1(10);

    /* JADX INFO: renamed from: Y */
    public static final v4g1 f237162Y = new v4g1(11);

    /* JADX INFO: renamed from: Z */
    public static final v4g1 f237164Z = new v4g1(12);

    /* JADX INFO: renamed from: L0 */
    public static final v4g1 f237148L0 = new v4g1(13);

    /* JADX INFO: renamed from: M0 */
    public static final v4g1 f237149M0 = new v4g1(14);

    /* JADX INFO: renamed from: N0 */
    public static final v4g1 f237150N0 = new v4g1(15);

    /* JADX INFO: renamed from: O0 */
    public static final v4g1 f237151O0 = new v4g1(16);

    /* JADX INFO: renamed from: P0 */
    public static final v4g1 f237152P0 = new v4g1(17);

    /* JADX INFO: renamed from: Q0 */
    public static final v4g1 f237153Q0 = new v4g1(18);

    /* JADX INFO: renamed from: R0 */
    public static final v4g1 f237154R0 = new v4g1(19);

    /* JADX INFO: renamed from: S0 */
    public static final v4g1 f237155S0 = new v4g1(20);

    /* JADX INFO: renamed from: T0 */
    public static final v4g1 f237156T0 = new v4g1(21);

    /* JADX INFO: renamed from: U0 */
    public static final v4g1 f237157U0 = new v4g1(22);

    /* JADX INFO: renamed from: V0 */
    public static final v4g1 f237158V0 = new v4g1(23);

    /* JADX INFO: renamed from: W0 */
    public static final v4g1 f237159W0 = new v4g1(24);

    /* JADX INFO: renamed from: X0 */
    public static final v4g1 f237161X0 = new v4g1(25);

    /* JADX INFO: renamed from: Y0 */
    public static final v4g1 f237163Y0 = new v4g1(26);

    /* JADX INFO: renamed from: Z0 */
    public static final v4g1 f237165Z0 = new v4g1(27);

    /* JADX INFO: renamed from: a1 */
    public static final v4g1 f237166a1 = new v4g1(28);

    /* JADX INFO: renamed from: b1 */
    public static final v4g1 f237168b1 = new v4g1(29);

    public /* synthetic */ v4g1(int i) {
        this.f237177a = i;
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo30659a() {
        return gbu.f78413a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List arrayList;
        switch (this.f237177a) {
            case 2:
                pta0 pta0Var = (pta0) obj;
                if (pta0Var instanceof ota0) {
                    return ((ota0) pta0Var).f169021a;
                }
                if (pta0Var.equals(nta0.f158033a) || pta0Var.equals(nta0.f158034b) || pta0Var.equals(nta0.f158035c)) {
                    throw new IllegalStateException("Failed to retrieve child credential");
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                return eho0.f59629a;
            case 4:
                List<Item> itemsList = ((MoreResponse) obj).getItemsList();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(itemsList, 10));
                for (Item item : itemsList) {
                    wj50.m88279p(item);
                    arrayList2.add(xzg1.m92477v(item));
                }
                return new s6x0(arrayList2);
            case 5:
                return new jzk((ixk) obj, true);
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
            case 22:
            case 24:
            case 25:
            default:
                EsQueue$Queue esQueue$Queue = (EsQueue$Queue) obj;
                PlayerQueue.Builder builder = PlayerQueue.builder();
                builder.revision(String.valueOf(esQueue$Queue.m17858s()));
                if (esQueue$Queue.m17860u()) {
                    builder.track(n9k.m63926a(esQueue$Queue.m17859t()));
                }
                if (esQueue$Queue.m17854o() > 0) {
                    ae50 ae50VarM17855p = esQueue$Queue.m17855p();
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM17855p, 10));
                    Iterator<E> it = ae50VarM17855p.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(n9k.m63926a((EsProvidedTrack$ProvidedTrack) it.next()));
                    }
                    builder.nextTracks(pf40.m69791p(arrayList3));
                }
                if (esQueue$Queue.m17856q() > 0) {
                    ae50 ae50VarM17857r = esQueue$Queue.m17857r();
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(ae50VarM17857r, 10));
                    Iterator<E> it2 = ae50VarM17857r.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(n9k.m63926a((EsProvidedTrack$ProvidedTrack) it2.next()));
                    }
                    builder.prevTracks(pf40.m69791p(arrayList4));
                }
                return builder.build();
            case 7:
                return Boolean.valueOf(((List) obj).size() > 1);
            case 8:
                return new sua0((hn7) obj);
            case 9:
                return (v3a0) ((xul0) obj).mo49278b();
            case 10:
                return xul0.m92200a(((gv31) obj).f84602a);
            case 11:
                wy9 wy9Var = ((qy9) obj).f193854b;
                wj50.m88279p(wy9Var);
                return wy9Var;
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsResponseWithReasons$ResponseWithReasons.m17861p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 19:
                return new s6x0(w2a1.f247311a);
            case 20:
                return vb7.f239428a;
            case 23:
                List listMo45450b = ((gqx) obj).mo45450b(d73.class);
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = listMo45450b.iterator();
                while (it3.hasNext()) {
                    d73 d73Var = (d73) ((fqx) it3.next()).f72301b;
                    if (d73Var != null) {
                        ArrayList arrayList6 = d73Var.f45977g;
                        arrayList = new ArrayList();
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            j6f.m52564V(((c73) it4.next()).f34730a, arrayList);
                        }
                    } else {
                        arrayList = lau.f131415a;
                    }
                    j6f.m52564V(arrayList, arrayList5);
                }
                return arrayList5;
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return new f0m0(zBooleanValue ? g0m0.f75397c : g0m0.f75396b, zBooleanValue);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function6
    /* JADX INFO: renamed from: c */
    public Object mo23411c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean z = ((fuq) obj4).f73548a;
        Map map = (Map) obj5;
        x72 x72Var = (x72) obj6;
        boolean zM37224M = dxf1.m37224M(map);
        String str = (String) map.get("should-assure-age-content-playback");
        return new l2y(zBooleanValue, zBooleanValue2, zBooleanValue3, z, new c92(zM37224M, str != null ? Integer.parseInt(str) : 0), x72Var.f258790a, x72Var.f258791b);
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: d */
    public Object mo30660d(FileInputStream fileInputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, vuc.f244913a), 8192);
        try {
            Set setM30498V = btz0.m30498V(btz0.m30480D(r2r.f195187P0, btz0.m30478B(new tl80(bufferedReader))));
            bufferedReader.close();
            return setM30498V;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(bufferedReader, th);
                throw th2;
            }
        }
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: e */
    public void mo30661e(Object obj, pg21 pg21Var) throws IOException {
        Set set = (Set) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(pg21Var, vuc.f244913a), 8192);
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bufferedWriter.write((String) it.next());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(bufferedWriter, th);
                throw th2;
            }
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f237177a) {
            case 6:
                return First.m15574b((tv5) obj);
            default:
                return First.m15574b((bmi) obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f237177a) {
            case 14:
                return !((iqx) ((gqx) obj)).f104863f;
            case 17:
                return !((iqx) ((gqx) obj)).f104863f;
            case 22:
                return ((xul0) obj).mo49279c();
            default:
                return !((YourLibraryResponse) obj).m98199q().m98204q();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f237177a) {
            case 12:
                return new pqm0((rza) obj, (String) obj2);
            case 13:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue());
            case 15:
                return kkc0.m56700m0((Map) obj, (Map) obj2);
            case 21:
                return new pqm0((Boolean) obj, (Boolean) obj2);
            default:
                qu80 qu80Var = (qu80) obj;
                Boolean bool = (Boolean) obj2;
                boolean zM88271j = wj50.m88271j(qu80Var.f192599e.f271272q.get(Context.Metadata.KEY_IS_AUDIOBOOK), "true");
                List list = qu80Var.f192598d;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (wj50.m88271j(((nw80) obj3).f159053g.get("is_trailer"), "true")) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((nw80) it.next()).f159049c);
                }
                return new pxx(arrayList2, zM88271j, zM88271j && bool.booleanValue());
        }
    }
}
