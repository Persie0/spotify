package p204p;

import androidx.car.app.model.Alert;
import com.spotify.gander.p072v2.proto.ResetLatestCursorResponse;
import com.spotify.jam.internal.socialconnect.models.Session;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.puffin_esperanto.proto.PuffinErrorOuterClass$PuffinError;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class wvq0 implements Function, yh00, Predicate, r241, vja1, BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255578a;

    /* JADX INFO: renamed from: b */
    public static final wvq0 f255569b = new wvq0(0);

    /* JADX INFO: renamed from: c */
    public static final wvq0 f255570c = new wvq0(1);

    /* JADX INFO: renamed from: d */
    public static final wvq0 f255571d = new wvq0(2);

    /* JADX INFO: renamed from: e */
    public static final wvq0 f255572e = new wvq0(4);

    /* JADX INFO: renamed from: f */
    public static final wvq0 f255573f = new wvq0(5);

    /* JADX INFO: renamed from: g */
    public static final wvq0 f255574g = new wvq0(6);

    /* JADX INFO: renamed from: h */
    public static final wvq0 f255575h = new wvq0(7);

    /* JADX INFO: renamed from: i */
    public static final wvq0 f255576i = new wvq0(8);

    /* JADX INFO: renamed from: t */
    public static final wvq0 f255577t = new wvq0(9);

    /* JADX INFO: renamed from: X */
    public static final wvq0 f255562X = new wvq0(10);

    /* JADX INFO: renamed from: Y */
    public static final wvq0 f255564Y = new wvq0(11);

    /* JADX INFO: renamed from: Z */
    public static final wvq0 f255566Z = new wvq0(12);

    /* JADX INFO: renamed from: L0 */
    public static final wvq0 f255550L0 = new wvq0(13);

    /* JADX INFO: renamed from: M0 */
    public static final wvq0 f255551M0 = new wvq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final wvq0 f255552N0 = new wvq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final wvq0 f255553O0 = new wvq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final wvq0 f255554P0 = new wvq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final wvq0 f255555Q0 = new wvq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final wvq0 f255556R0 = new wvq0(19);

    /* JADX INFO: renamed from: S0 */
    public static final wvq0 f255557S0 = new wvq0(20);

    /* JADX INFO: renamed from: T0 */
    public static final wvq0 f255558T0 = new wvq0(21);

    /* JADX INFO: renamed from: U0 */
    public static final wvq0 f255559U0 = new wvq0(22);

    /* JADX INFO: renamed from: V0 */
    public static final wvq0 f255560V0 = new wvq0(23);

    /* JADX INFO: renamed from: W0 */
    public static final wvq0 f255561W0 = new wvq0(24);

    /* JADX INFO: renamed from: X0 */
    public static final wvq0 f255563X0 = new wvq0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final wvq0 f255565Y0 = new wvq0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final wvq0 f255567Z0 = new wvq0(27);

    /* JADX INFO: renamed from: a1 */
    public static final wvq0 f255568a1 = new wvq0(28);

    public /* synthetic */ wvq0(int i) {
        this.f255578a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m89136a(wst0 wst0Var, Set set) {
        if (wst0Var.f254727A) {
            ArrayList arrayListM43700N0 = g6f.m43700N0(wst0Var.f254738d, g6f.m43700N0(wst0Var.f254737c, h6f.m46716M(wst0Var.f254735a)));
            ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListM43700N0, 10));
            Iterator it = arrayListM43700N0.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContextTrack) it.next()).uri());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!wst0Var.f254728B.containsKey((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                set.add(new fmt0(arrayList2));
            }
            m89137b(wst0Var, set);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m89137b(wst0 wst0Var, Set set) {
        List listM62207C = mlg1.m62207C(wst0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM62207C.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ContextTrack) it.next()).uri());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!wst0Var.f254729C.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        set.add(new jmt0(arrayList));
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m89138c(wst0 wst0Var) {
        ArrayList arrayListM43700N0 = g6f.m43700N0(wst0Var.f254738d, wst0Var.f254737c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM43700N0) {
            if (wst0Var.f254739e.containsKey(e72.m38008h0((ContextTrack) obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static Map m89139d(Map map, ArrayList arrayList) {
        if (map.isEmpty()) {
            return nau.f152117a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(e72.m38008h0((ContextTrack) it.next()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (linkedHashSet.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024d A[LOOP:9: B:99:0x0247->B:101:0x024d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x0272  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0320  */
    /* JADX WARN: Code duplicated, block: B:128:0x0334  */
    /* JADX WARN: Code duplicated, block: B:130:0x0339  */
    /* JADX WARN: Code duplicated, block: B:135:0x0346  */
    /* JADX WARN: Code duplicated, block: B:148:0x03da  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:158:0x0405  */
    /* JADX WARN: Code duplicated, block: B:159:0x040e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    /* JADX WARN: Code duplicated, block: B:402:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:? A[LOOP:7: B:69:0x019b->B:404:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0208  */
    /* JADX WARN: Code duplicated, block: B:92:0x0214  */
    /* JADX WARN: Code duplicated, block: B:95:0x0227  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public static Next m89140e(wst0 wst0Var, vpt0 vpt0Var) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        boolean z3;
        List listM43728j1;
        Map map;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        ContextTrack contextTrack;
        vst0 vst0Var;
        String str3;
        String str4;
        wst0 wst0VarM88900a;
        ContextTrack contextTrack2;
        ljr0 ljr0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        LinkedHashMap linkedHashMap4;
        List listM43728j2;
        Iterator it2;
        Map map2 = wst0Var.f254759y;
        Map map3 = wst0Var.f254758x;
        Set setM43750v0 = wst0Var.f254731E;
        vst0 vst0Var2 = wst0Var.f254755u;
        Map map4 = wst0Var.f254739e;
        List list = wst0Var.f254738d;
        List list2 = wst0Var.f254737c;
        boolean z4 = vpt0Var instanceof uot0;
        nau nauVar = nau.f152117a;
        if (!z4) {
            if (vpt0Var instanceof vot0) {
                vot0 vot0Var = (vot0) vpt0Var;
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, null, vot0Var.f243533a, vot0Var.f243534b, vot0Var.f243535c, vot0Var.f243536d, null, vot0Var.f243539g, 0, false, false, null, false, false, vot0Var.f243540h, vot0Var.f243538f, false, null, false, null, null, false, null, null, false, null, null, -1575393, 7));
            }
            if (vpt0Var instanceof wot0) {
                wot0 wot0Var = (wot0) vpt0Var;
                ContextTrack contextTrack3 = wst0Var.f254736b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ljr0 ljr0Var2 = wot0Var.f253570a;
                if (ljr0Var2 instanceof ijr0) {
                    boolean z5 = wst0Var.f254745k.mo50827i() == 2;
                    ijr0 ijr0Var = (ijr0) ljr0Var2;
                    boolean z6 = ijr0Var.f102875l == 1;
                    if (ijr0Var.f102884u) {
                        if (!ijr0Var.f102882s) {
                            linkedHashSet.add(new wmt0(contextTrack3, list));
                        }
                    } else if (m3l.m60716w(wst0Var)) {
                        linkedHashSet.add(new wmt0(contextTrack3, list));
                    }
                    if (z6) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list2) {
                            if (fn1.m42184m((ContextTrack) obj)) {
                                arrayList4.add(obj);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            linkedHashSet.add(new pmt0(arrayList4));
                            if (z5) {
                                linkedHashSet.add(new vmt0());
                            }
                        }
                    }
                }
                Set setM43734m1 = g6f.m43734m1(linkedHashSet);
                ljr0 ljr0Var3 = wot0Var.f253570a;
                wst0 wst0VarM88900a2 = wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, ljr0Var3, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, wst0Var.f254760z && ljr0Var3.mo50829k(), null, null, false, null, null, -536871937, 7);
                m89136a(wst0VarM88900a2, setM43734m1);
                return Next.m15607i(wst0VarM88900a2, setM43734m1);
            }
            if (vpt0Var instanceof pot0) {
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, ((pot0) vpt0Var).f179784a, null, false, null, null, false, null, null, false, null, null, -2097153, 7));
            }
            if (vpt0Var instanceof lot0) {
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, ((lot0) vpt0Var).f135545a, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -9, 7));
            }
            if (vpt0Var instanceof ipt0) {
                return wst0Var.f254730D ? Next.m15605a(Collections.singleton(qmt0.f190399c)) : Next.m15605a(Collections.singleton(new omt0(((ipt0) vpt0Var).f104555a)));
            }
            if (vpt0Var instanceof fpt0) {
                fpt0 fpt0Var = (fpt0) vpt0Var;
                return Next.m15605a(Collections.singleton(new tmt0(fpt0Var.f72001c, fpt0Var.f71999a, fpt0Var.f72000b.uri())));
            }
            if (vpt0Var instanceof jpt0) {
                jpt0 jpt0Var = (jpt0) vpt0Var;
                return Next.m15605a(Collections.singleton(new ymt0(jpt0Var.f114717a, jpt0Var.f114718b, jpt0Var.f114719c, jpt0Var.f114720d, wst0Var.f254749o, wst0Var.f254750p, map2)));
            }
            if (vpt0Var instanceof eot0) {
                return Next.m15605a(Collections.singleton(bmt0.f28616c));
            }
            if (vpt0Var instanceof yot0) {
                return Next.m15605a(Collections.singleton(new zlt0(2, Collections.singletonList(((yot0) vpt0Var).f274733b))));
            }
            if (vpt0Var instanceof cpt0) {
                ContextTrack contextTrack4 = ((cpt0) vpt0Var).f40643b;
                return Next.m15607i(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, s601.m77308k0(e72.m38008h0(contextTrack4), setM43750v0), null, -1, 5), Collections.singleton(new pmt0(Collections.singletonList(contextTrack4))));
            }
            if (vpt0Var instanceof bpt0) {
                vst0 vst0Var3 = new vst0(list2, list, map4);
                ArrayList arrayListM89138c = m89138c(wst0Var);
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayListM89138c, 10));
                Iterator it3 = arrayListM89138c.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(e72.m38008h0((ContextTrack) it3.next()));
                }
                return Next.m15607i(wst0.m88900a(wst0Var, null, null, null, null, nauVar, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, vst0Var3, true, null, null, false, null, null, false, s601.m77309l0(setM43750v0, arrayList5), null, -25165841, 5), Collections.singleton(new pmt0(arrayListM89138c)));
            }
            Map map5 = nauVar;
            if (vpt0Var instanceof rot0) {
                return Next.m15605a(Collections.singleton(nmt0.f156267c));
            }
            if (vpt0Var instanceof mot0) {
                mot0 mot0Var = (mot0) vpt0Var;
                boolean z7 = mot0Var.f145740a;
                boolean z8 = mot0Var.f145742c;
                ?? r0 = mot0Var.f145741b;
                int i = z8 ? 1 : wst0Var.f254734H;
                if (!z8) {
                    map5 = map4;
                }
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, map5, false, false, null, null, null, 0, i, z7, z8, r0, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -61457, 7));
            }
            if (vpt0Var instanceof qot0) {
                return Next.m15605a(Collections.singleton(mmt0.f145249c));
            }
            if (vpt0Var instanceof apt0) {
                return Next.m15608j();
            }
            if (vpt0Var instanceof cot0) {
                return Next.m15607i(wst0.m88900a(wst0Var, null, null, null, null, map5, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -17, 7), Collections.singleton(new zlt0(1, m89138c(wst0Var))));
            }
            if (vpt0Var instanceof ept0) {
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, map5, false, false, null, null, null, 0, ((ept0) vpt0Var).f61708a, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -4113, 7));
            }
            if (vpt0Var instanceof kpt0) {
                kpt0 kpt0Var = (kpt0) vpt0Var;
                ContextTrack contextTrack5 = kpt0Var.f125124a;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(map4);
                String strM38008h0 = e72.m38008h0(contextTrack5);
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, linkedHashMap5, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -17, 7));
            }
            if (vpt0Var instanceof iot0) {
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, map5, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -17, 7));
            }
            if (vpt0Var instanceof ppt0) {
                return vst0Var2 == null ? Next.m15606h(wst0Var) : Next.m15607i(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, true, null, null, false, null, null, false, null, null, -16777217, 7), Collections.singleton(new rmt0(vst0Var2)));
            }
            if (vpt0Var instanceof rpt0) {
                if (vst0Var2 == null) {
                    return Next.m15606h(wst0Var);
                }
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, m89139d(vst0Var2.f244493c, g6f.m43700N0(list, list2)), false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, null, null, -25165841, 7));
            }
            if (vpt0Var instanceof dot0) {
                LinkedHashMap linkedHashMap6 = ((dot0) vpt0Var).f51114a;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(map3);
                for (Map.Entry entry : linkedHashMap6.entrySet()) {
                    String str5 = (String) entry.getKey();
                    Object value = entry.getValue();
                    t0x0 t0x0Var = (t0x0) linkedHashMap7.get(str5);
                    if (t0x0Var == null) {
                        str2 = null;
                        t0x0Var = new t0x0(null, false, null, false);
                    } else {
                        str2 = null;
                    }
                    linkedHashMap7.put(str5, t0x0.m79851a(t0x0Var, (String) value, str2, 12));
                }
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, linkedHashMap7, null, false, null, null, false, null, null, -67108865, 7));
            }
            if (vpt0Var instanceof hpt0) {
                Map map6 = ((hpt0) vpt0Var).f93848a;
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(map3);
                for (Map.Entry entry2 : map6.entrySet()) {
                    String str6 = (String) entry2.getKey();
                    Object value2 = entry2.getValue();
                    t0x0 t0x0Var2 = (t0x0) linkedHashMap8.get(str6);
                    if (t0x0Var2 == null) {
                        str = null;
                        t0x0Var2 = new t0x0(null, false, null, false);
                    } else {
                        str = null;
                    }
                    linkedHashMap8.put(str6, t0x0.m79851a(t0x0Var2, str, (String) value2, 3));
                }
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, linkedHashMap8, null, false, null, null, false, null, null, -67108865, 7));
            }
            if (vpt0Var instanceof kot0) {
                ?? r1 = ((kot0) vpt0Var).f124910a;
                if (r1.isEmpty()) {
                    return Next.m15608j();
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(map2);
                linkedHashMap9.putAll(r1);
                wst0 wst0VarM88900a3 = wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, linkedHashMap9, false, null, null, false, null, null, -134217729, 7);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                m89137b(wst0VarM88900a3, linkedHashSet2);
                return Next.m15607i(wst0VarM88900a3, linkedHashSet2);
            }
            if (vpt0Var instanceof hot0) {
                hot0 hot0Var = (hot0) vpt0Var;
                if (hot0Var.f93606a.isEmpty()) {
                    return Next.m15608j();
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap(wst0Var.f254728B);
                linkedHashMap10.putAll(hot0Var.f93606a);
                wst0 wst0VarM88900a4 = wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, linkedHashMap10, null, false, null, null, -1073741825, 7);
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                m89137b(wst0VarM88900a4, linkedHashSet3);
                return Next.m15607i(wst0VarM88900a4, linkedHashSet3);
            }
            if (vpt0Var instanceof tpt0) {
                tpt0 tpt0Var = (tpt0) vpt0Var;
                if (tpt0Var.f222600a.isEmpty()) {
                    return Next.m15608j();
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap(wst0Var.f254729C);
                linkedHashMap11.putAll(tpt0Var.f222600a);
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, linkedHashMap11, false, null, null, Alert.DURATION_SHOW_INDEFINITELY, 7));
            }
            if (vpt0Var instanceof dpt0) {
                return Next.m15606h(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, ((dpt0) vpt0Var).f51744a, null, null, -1, 6));
            }
            if (!(vpt0Var instanceof opt0)) {
                return ((vpt0Var instanceof npt0) || (vpt0Var instanceof lpt0) || (vpt0Var instanceof qpt0)) ? Next.m15607i(wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, gbu.f78413a, null, -25165825, 5), Collections.singleton(smt0.f210727c)) : Next.m15608j();
            }
            ov50 o70Var = vpt0Var instanceof mpt0 ? new o70(((mpt0) vpt0Var).f146092a) : vpt0Var instanceof opt0 ? new p70(((opt0) vpt0Var).f168020a) : q70.f185971e;
            wst0 wst0VarM88900a5 = wst0.m88900a(wst0Var, null, null, null, null, null, false, false, null, null, null, 0, 0, false, false, null, false, false, false, false, false, null, false, null, null, false, null, null, false, gbu.f78413a, null, -1, 5);
            return wst0VarM88900a5.f254755u != null ? Next.m15607i(wst0VarM88900a5, Collections.singleton(new umt0(o70Var))) : Next.m15606h(wst0VarM88900a5);
        }
        uot0 uot0Var = (uot0) vpt0Var;
        ArrayList arrayList6 = uot0Var.f232521c;
        ArrayList arrayList7 = uot0Var.f232520b;
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        String str7 = uot0Var.f232524f;
        ContextTrack contextTrack6 = uot0Var.f232519a;
        boolean zM88271j = wj50.m88271j(str7, wst0Var.f254732F);
        if (vst0Var2 == null || wst0Var.f254756v || zM88271j) {
            z = false;
        } else {
            ArrayList arrayListM43700N0 = g6f.m43700N0(list, list2);
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            Iterator it4 = arrayListM43700N0.iterator();
            while (it4.hasNext()) {
                linkedHashSet5.add(e72.m38008h0((ContextTrack) it4.next()));
            }
            ArrayList arrayListM43700N1 = g6f.m43700N0(arrayList6, arrayList7);
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            Iterator it5 = arrayListM43700N1.iterator();
            while (it5.hasNext()) {
                linkedHashSet6.add(e72.m38008h0((ContextTrack) it5.next()));
            }
            if (linkedHashSet5.equals(linkedHashSet6)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            linkedHashSet4.add(dmt0.f50610c);
        }
        x401 x401Var = new x401();
        if (contextTrack6 != null) {
            x401Var.add(contextTrack6.uri());
        }
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            x401Var.add(((ContextTrack) it6.next()).uri());
        }
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            x401Var.add(((ContextTrack) it7.next()).uri());
        }
        x401 x401VarM63425d = n0e1.m63425d(x401Var);
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        Iterator it8 = map3.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it8.next();
            Iterator it9 = it8;
            boolean z9 = z;
            if (x401VarM63425d.f257925a.containsKey((String) entry3.getKey())) {
                linkedHashMap12.put(entry3.getKey(), entry3.getValue());
            }
            it8 = it9;
            z = z9;
        }
        boolean z10 = z;
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        Iterator it10 = linkedHashMap12.entrySet().iterator();
        while (it10.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it10.next();
            Iterator it11 = it10;
            if (((t0x0) entry4.getValue()).f216021b) {
                linkedHashMap13.put(entry4.getKey(), entry4.getValue());
            }
            it10 = it11;
        }
        Set setM77305h0 = s601.m77305h0(x401VarM63425d, linkedHashMap13.keySet());
        mec0 mec0Var = x401VarM63425d.f257925a;
        List listM43728j3 = g6f.m43728j1(setM77305h0);
        if (!listM43728j3.isEmpty()) {
            linkedHashSet4.add(new emt0(listM43728j3));
        }
        if (contextTrack6 != null) {
            boolean zM29803n0 = bm51.m29803n0(contextTrack6.uri(), "spotify:kallax:", false);
            z2 = true;
            boolean z11 = zM29803n0 ? z2 : false;
            if (!wst0Var.f254757w || z11) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry5 : linkedHashMap12.entrySet()) {
                    if (((t0x0) entry5.getValue()).f216023d) {
                        linkedHashMap.put(entry5.getKey(), entry5.getValue());
                        zM88271j = zM88271j;
                    }
                }
                z3 = zM88271j;
                listM43728j1 = g6f.m43728j1(s601.m77305h0(x401VarM63425d, linkedHashMap.keySet()));
                if (!listM43728j1.isEmpty()) {
                    linkedHashSet4.add(new imt0(listM43728j1));
                }
            } else {
                z3 = zM88271j;
            }
            map = nauVar;
            if (uot0Var.f232522d) {
                ArrayList arrayListM43700N2 = g6f.m43700N0(arrayList6, arrayList7);
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayListM43700N2) {
                    if (e72.m37982P((ContextTrack) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ContextTrack) it.next()).uri());
                }
                Set setM43736n1 = g6f.m43736n1(arrayList3);
                linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry6 : map2.entrySet()) {
                    if (mec0Var.containsKey((String) entry6.getKey())) {
                        linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                    }
                }
                listM43728j2 = g6f.m43728j1(s601.m77305h0(setM43736n1, linkedHashMap4.keySet()));
                map = linkedHashMap4;
                if (!listM43728j2.isEmpty()) {
                    linkedHashSet4.add(new amt0(listM43728j2));
                    map = linkedHashMap4;
                }
            }
            Map map7 = map;
            Map map8 = wst0Var.f254728B;
            linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry7 : map8.entrySet()) {
                if (mec0Var.containsKey((String) entry7.getKey())) {
                    linkedHashMap2.put(entry7.getKey(), entry7.getValue());
                }
            }
            Map map9 = wst0Var.f254729C;
            linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry8 : map9.entrySet()) {
                if (mec0Var.containsKey((String) entry8.getKey())) {
                    linkedHashMap3.put(entry8.getKey(), entry8.getValue());
                }
            }
            ContextTrack contextTrack7 = uot0Var.f232519a;
            contextTrack = (ContextTrack) g6f.m43745s0(arrayList7);
            if (contextTrack == null) {
                contextTrack = (ContextTrack) g6f.m43745s0(arrayList6);
            }
            Map mapM89139d = m89139d(map4, g6f.m43700N0(arrayList6, arrayList7));
            boolean z12 = uot0Var.f232522d;
            boolean z13 = uot0Var.f232523e;
            if (z10) {
                vst0Var = null;
            } else {
                vst0Var = vst0Var2;
            }
            str3 = uot0Var.f232524f;
            if (!z3 || setM43750v0.isEmpty()) {
                str4 = str3;
            } else {
                ArrayList arrayListM43700N3 = g6f.m43700N0(arrayList6, arrayList7);
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                Iterator it12 = arrayListM43700N3.iterator();
                while (it12.hasNext()) {
                    linkedHashSet7.add(e72.m38008h0((ContextTrack) it12.next()));
                    str3 = str3;
                }
                str4 = str3;
                setM43750v0 = g6f.m43750v0(setM43750v0, linkedHashSet7);
            }
            wst0VarM88900a = wst0.m88900a(wst0Var, contextTrack7, contextTrack, arrayList7, arrayList6, mapM89139d, false, false, null, null, null, 0, 0, false, false, null, z12, z13, false, false, false, vst0Var, false, linkedHashMap12, map7, false, linkedHashMap2, linkedHashMap3, false, setM43750v0, str4, 842661856, 1);
            contextTrack2 = wst0VarM88900a.f254736b;
            ljr0Var = wst0VarM88900a.f254745k;
            m89136a(wst0VarM88900a, linkedHashSet4);
            if ((ljr0Var instanceof ijr0) && ((ijr0) ljr0Var).f102875l == 1) {
                List list3 = wst0VarM88900a.f254737c;
                arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (fn1.m42184m((ContextTrack) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    linkedHashSet4.add(new pmt0(arrayList));
                }
            }
            if (ljr0Var.mo50828j()) {
                if (!ljr0Var.mo50826h()) {
                    linkedHashSet4.add(new wmt0(contextTrack2, arrayList6));
                }
            } else if ((ljr0Var instanceof ijr0) && m3l.m60716w(wst0VarM88900a)) {
                linkedHashSet4.add(new wmt0(contextTrack2, arrayList6));
            }
            return Next.m15607i(wst0VarM88900a, linkedHashSet4);
        }
        z2 = true;
        if (!arrayList7.isEmpty()) {
            Iterator it13 = arrayList7.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    if (!arrayList6.isEmpty()) {
                        it2 = arrayList6.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (e72.m37983Q((ContextTrack) it2.next())) {
                                }
                            }
                        }
                    }
                } else if (e72.m37983Q((ContextTrack) it13.next())) {
                }
            }
        } else if (!arrayList6.isEmpty()) {
            it2 = arrayList6.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (e72.m37983Q((ContextTrack) it2.next())) {
                    }
                }
            }
        }
        if (wst0Var.f254757w) {
            linkedHashMap = new LinkedHashMap();
            while (r13.hasNext()) {
                if (((t0x0) entry5.getValue()).f216023d) {
                    linkedHashMap.put(entry5.getKey(), entry5.getValue());
                    zM88271j = zM88271j;
                }
            }
            z3 = zM88271j;
            listM43728j1 = g6f.m43728j1(s601.m77305h0(x401VarM63425d, linkedHashMap.keySet()));
            if (!listM43728j1.isEmpty()) {
                linkedHashSet4.add(new imt0(listM43728j1));
            }
        } else {
            linkedHashMap = new LinkedHashMap();
            while (r13.hasNext()) {
                if (((t0x0) entry5.getValue()).f216023d) {
                    linkedHashMap.put(entry5.getKey(), entry5.getValue());
                    zM88271j = zM88271j;
                }
            }
            z3 = zM88271j;
            listM43728j1 = g6f.m43728j1(s601.m77305h0(x401VarM63425d, linkedHashMap.keySet()));
            if (!listM43728j1.isEmpty()) {
                linkedHashSet4.add(new imt0(listM43728j1));
            }
        }
        map = nauVar;
        if (uot0Var.f232522d) {
            ArrayList arrayListM43700N4 = g6f.m43700N0(arrayList6, arrayList7);
            arrayList2 = new ArrayList();
            while (r2.hasNext()) {
                if (e72.m37982P((ContextTrack) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ContextTrack) it.next()).uri());
            }
            Set setM43736n2 = g6f.m43736n1(arrayList3);
            linkedHashMap4 = new LinkedHashMap();
            while (r8.hasNext()) {
                if (mec0Var.containsKey((String) entry6.getKey())) {
                    linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                }
            }
            listM43728j2 = g6f.m43728j1(s601.m77305h0(setM43736n2, linkedHashMap4.keySet()));
            map = linkedHashMap4;
            if (!listM43728j2.isEmpty()) {
                linkedHashSet4.add(new amt0(listM43728j2));
                map = linkedHashMap4;
            }
        }
        Map map10 = map;
        Map map11 = wst0Var.f254728B;
        linkedHashMap2 = new LinkedHashMap();
        while (r2.hasNext()) {
            if (mec0Var.containsKey((String) entry7.getKey())) {
                linkedHashMap2.put(entry7.getKey(), entry7.getValue());
            }
        }
        Map map12 = wst0Var.f254729C;
        linkedHashMap3 = new LinkedHashMap();
        while (r2.hasNext()) {
            if (mec0Var.containsKey((String) entry8.getKey())) {
                linkedHashMap3.put(entry8.getKey(), entry8.getValue());
            }
        }
        ContextTrack contextTrack8 = uot0Var.f232519a;
        contextTrack = (ContextTrack) g6f.m43745s0(arrayList7);
        if (contextTrack == null) {
            contextTrack = (ContextTrack) g6f.m43745s0(arrayList6);
        }
        Map mapM89139d2 = m89139d(map4, g6f.m43700N0(arrayList6, arrayList7));
        boolean z14 = uot0Var.f232522d;
        boolean z15 = uot0Var.f232523e;
        if (z10) {
            vst0Var = null;
        } else {
            vst0Var = vst0Var2;
        }
        str3 = uot0Var.f232524f;
        if (z3) {
            str4 = str3;
        } else {
            str4 = str3;
        }
        wst0VarM88900a = wst0.m88900a(wst0Var, contextTrack8, contextTrack, arrayList7, arrayList6, mapM89139d2, false, false, null, null, null, 0, 0, false, false, null, z14, z15, false, false, false, vst0Var, false, linkedHashMap12, map10, false, linkedHashMap2, linkedHashMap3, false, setM43750v0, str4, 842661856, 1);
        contextTrack2 = wst0VarM88900a.f254736b;
        ljr0Var = wst0VarM88900a.f254745k;
        m89136a(wst0VarM88900a, linkedHashSet4);
        if (ljr0Var instanceof ijr0) {
            List list4 = wst0VarM88900a.f254737c;
            arrayList = new ArrayList();
            while (r4.hasNext()) {
                if (fn1.m42184m((ContextTrack) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashSet4.add(new pmt0(arrayList));
            }
        }
        if (ljr0Var.mo50828j()) {
            if (!ljr0Var.mo50826h()) {
                linkedHashSet4.add(new wmt0(contextTrack2, arrayList6));
            }
        } else if (ljr0Var instanceof ijr0) {
            linkedHashSet4.add(new wmt0(contextTrack2, arrayList6));
        }
        return Next.m15607i(wst0VarM88900a, linkedHashSet4);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01da  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        int i2;
        switch (this.f255578a) {
            case 0:
                return new nvq0(((Boolean) obj).booleanValue());
            case 1:
                return new tsr0((String) obj);
            case 2:
                int i3 = g8t0.f77586a[((PuffinErrorOuterClass$PuffinError) obj).m20006n().ordinal()];
                if (i3 != 1) {
                    return i3 != 2 ? e8t0.f57262b : e8t0.f57264d;
                }
                return e8t0.f57263c;
            case 3:
            case 5:
            case 6:
            case 17:
            case 22:
            case 23:
            default:
                xul0 xul0Var = (xul0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(-15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (xul0Var.mo49279c()) {
                    builder2.onlyForPlaybackId((String) xul0Var.mo49278b());
                }
                return new a8p0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
            case 4:
                you0 you0Var = (you0) obj;
                wj50.m88279p(you0Var);
                int i4 = you0Var.f274746k;
                int iM38547C = edb.m38547C(i4);
                if (iM38547C != 0) {
                    i = iM38547C != 3 ? 2 : 4;
                } else {
                    i = 3;
                }
                String str = you0Var.f274736a;
                String str2 = you0Var.f274739d;
                String str3 = you0Var.f274740e;
                ArrayList arrayListM41546o = ffg1.m41546o(you0Var.f274741f, you0Var.f274742g, str3, str, you0Var.f274744i, false);
                int i5 = you0Var.f274741f;
                int i6 = you0Var.f274742g;
                boolean z = you0Var.f274748m;
                int iM38547C2 = edb.m38547C(i4);
                if (iM38547C2 == 0) {
                    if (z) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                } else if (iM38547C2 == 1 || iM38547C2 == 2) {
                    i2 = z ? 4 : 5;
                } else {
                    if (iM38547C2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (z) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                }
                return new f191(str, str2, str3, arrayListM41546o, i5, i6, true, i2, zzg1.m97300D(i));
            case 7:
                return Boolean.valueOf(((ResetLatestCursorResponse) obj).m11119n());
            case 8:
                return (qu80) ((p2x0) obj).m68971d();
            case 9:
                return ((w4m) obj).mo41414c();
            case 10:
                return new m340(7, null);
            case 11:
                return new p901((ua01) obj);
            case 12:
                ContextTrack contextTrack = (ContextTrack) obj;
                if (e72.m37975I(contextTrack)) {
                    return osj.f168825a;
                }
                return e72.m37982P(contextTrack) ? osj.f168826b : osj.f168827c;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return Observable.just(new n521(new y0u(zBooleanValue)), new s521(zBooleanValue));
            case 14:
                return ((Restrictions) obj).disallowSkippingNextReasons();
            case 15:
                List list = (List) obj;
                return list.isEmpty() ? MaybeEmpty.f8264a : Maybe.m23363f(list);
            case 16:
                return new vh31((Session) obj);
            case 18:
                iva1 iva1Var = (iva1) obj;
                wj50.m88279p(iva1Var);
                return new rf51(iva1Var);
            case 19:
                return ((my71) obj).mo63160c();
            case 20:
                return ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
            case 21:
                C2316qw c2316qw = (C2316qw) obj;
                String str4 = c2316qw.f193141a;
                hpg1 hpg1Var = c2316qw.f193142b;
                if (hpg1Var instanceof C2430tw) {
                    return Single.just(new cb91(str4, ((C2430tw) hpg1Var).f224285c));
                }
                return hpg1Var instanceof C2473uw ? Single.just(new xa91(str4)) : Single.never();
            case 24:
                lz71 lz71Var = (lz71) obj;
                if (lz71Var instanceof kz71) {
                    ky71 ky71Var = ((kz71) lz71Var).f128043a;
                    return ky71Var.f127714a.length() == 0 ? Single.error(new IllegalStateException("STT Success received with missing token.")) : Single.just(ky71Var);
                }
                if (!(lz71Var instanceof jz71)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Single.error(new RuntimeException("Failure received during STT exchange . Response: " + lz71Var));
            case 25:
                return Boolean.valueOf(((pe01) obj).f176584a);
            case 26:
                return Boolean.valueOf(((PinResponse) obj).m98136p() == e3o0.NOT_PINNED);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !igg1.m50541t(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new jya1(str4, str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f255578a) {
            case 5:
                return ((xul0) obj).mo49279c();
            default:
                return !wl51.m88460J0((String) obj);
        }
    }

    public wvq0(qu0 qu0Var) {
        this.f255578a = 29;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((Set) obj, ((ContextTrack) obj2).uri());
    }
}
