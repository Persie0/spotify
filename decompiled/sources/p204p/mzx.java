package p204p;

import android.content.Context;
import android.view.View;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.p046v1.RestrictedIntegrationsResponse;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.offline_playable_cache_esperanto.proto.EsOfflinePlayableCache$RemoveTrackResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class mzx implements Function, InterfaceC1667ah, iuk, Init, tn61, BiFunction, Predicate, vja1 {

    /* JADX INFO: renamed from: Y */
    public static vya0 f148818Y;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148833a;

    /* JADX INFO: renamed from: b */
    public static final mzx f148823b = new mzx(0);

    /* JADX INFO: renamed from: c */
    public static final mzx f148825c = new mzx(1);

    /* JADX INFO: renamed from: d */
    public static final mzx f148826d = new mzx(3);

    /* JADX INFO: renamed from: e */
    public static final mzx f148827e = new mzx(4);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ mzx f148828f = new mzx(5);

    /* JADX INFO: renamed from: g */
    public static final mzx f148829g = new mzx(6);

    /* JADX INFO: renamed from: h */
    public static final mzx f148830h = new mzx(7);

    /* JADX INFO: renamed from: i */
    public static final mzx f148831i = new mzx(8);

    /* JADX INFO: renamed from: t */
    public static final mzx f148832t = new mzx(10);

    /* JADX INFO: renamed from: X */
    public static final mzx f148816X = new mzx(11);

    /* JADX INFO: renamed from: Z */
    public static final mzx f148820Z = new mzx(12);

    /* JADX INFO: renamed from: L0 */
    public static final mzx f148804L0 = new mzx(13);

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ mzx f148805M0 = new mzx(14);

    /* JADX INFO: renamed from: N0 */
    public static final mzx f148806N0 = new mzx(15);

    /* JADX INFO: renamed from: O0 */
    public static final mzx f148807O0 = new mzx(16);

    /* JADX INFO: renamed from: P0 */
    public static final mzx f148808P0 = new mzx(17);

    /* JADX INFO: renamed from: Q0 */
    public static final mzx f148809Q0 = new mzx(18);

    /* JADX INFO: renamed from: R0 */
    public static final mzx f148810R0 = new mzx(19);

    /* JADX INFO: renamed from: S0 */
    public static final mzx f148811S0 = new mzx(20);

    /* JADX INFO: renamed from: T0 */
    public static final mzx f148812T0 = new mzx(21);

    /* JADX INFO: renamed from: U0 */
    public static final mzx f148813U0 = new mzx(22);

    /* JADX INFO: renamed from: V0 */
    public static final mzx f148814V0 = new mzx(23);

    /* JADX INFO: renamed from: W0 */
    public static final mzx f148815W0 = new mzx(24);

    /* JADX INFO: renamed from: X0 */
    public static final mzx f148817X0 = new mzx(25);

    /* JADX INFO: renamed from: Y0 */
    public static final mzx f148819Y0 = new mzx(26);

    /* JADX INFO: renamed from: Z0 */
    public static final mzx f148821Z0 = new mzx(27);

    /* JADX INFO: renamed from: a1 */
    public static final mzx f148822a1 = new mzx(28);

    /* JADX INFO: renamed from: b1 */
    public static final mzx f148824b1 = new mzx(29);

    public /* synthetic */ mzx(int i) {
        this.f148833a = i;
    }

    /* JADX INFO: renamed from: b */
    public static Next m63262b(av41 av41Var, String str) {
        Object obj;
        String str2;
        List list = av41Var.f20093a.f278259b;
        if (wj50.m88271j(av41Var.f20102j.f62025a, str) || str.length() == 0) {
            str = ((w181) g6f.m43741q0(list)).f247021a;
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            w181 w181Var = (w181) it.next();
            arrayList.add(w181.m86978a(w181Var, wj50.m88271j(w181Var.f247021a, str), null, ContentMediaFormat.PARTIAL_CONTENT_PODCAST));
        }
        z181 z181VarM95093a = z181.m95093a(av41Var.f20093a, arrayList);
        for (Object obj2 : arrayList) {
            if (((w181) obj2).f247024d) {
                obj = obj2;
                break;
            }
        }
        w181 w181Var2 = (w181) obj;
        if (w181Var2 == null || (str2 = w181Var2.f247023c) == null) {
            str2 = "default";
        }
        String str3 = str2;
        return Next.m15607i(av41.m27223a(av41Var, z181VarM95093a, str3, false, false, null, 508), Effects.m15571a(new ijt(str3)));
    }

    /* JADX INFO: renamed from: c */
    public static Next m63263c(f690 f690Var) {
        Set set = f690Var.f66327e;
        Set setM43736n1 = g6f.m43736n1(g6f.m43714b1(set, f690Var.f66328f));
        f690 f690VarM40838a = f690.m40838a(f690Var, true, true, null, s601.m77305h0(set, setM43736n1), 105);
        n590 n590Var = new n590(f690Var.f66323a, setM43736n1);
        long j = f690Var.f66329g.f101902a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Next.m15607i(f690VarM40838a, Effects.m15571a(n590Var, new m590(j)));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static pqm0 m63264d(xj00 xj00Var, bq4 bq4Var) {
        String str = xj00Var.f261981a;
        z181 z181Var = new z181(new a281("profile", str, "spotify:activitycenter", "", str), Collections.singletonList(new w181("client-native:default", new x181(R.string.client_native_home_all), "default", true, null, null, false, null, null, null, 944)), false, 28);
        er51 er51Var = new er51("client-native:default", "default", 1);
        v181 v181Var = (v181) iaw0.f100357a.get(bq4Var.m30179f());
        String str2 = xj00Var.f261982b;
        return new pqm0(new av41(z181Var, str2 != null ? str2 : "default", null, v181Var, er51Var, 124), Effects.m15571a(new yjt(str2)));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:0x0266  */
    /* JADX WARN: Code duplicated, block: B:108:0x026e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX INFO: renamed from: e */
    public static Next m63265e(av41 av41Var, o2x o2xVar) {
        Object obj;
        w181 w181Var;
        ArrayList arrayList;
        String str;
        Object next;
        String str2;
        Object next2;
        String str3 = av41Var.f20094b;
        er51 er51Var = av41Var.f20102j;
        z181 z181Var = av41Var.f20093a;
        boolean z = av41Var.f20097e;
        Logger.m3965a("FunkisHome :: event: " + o2xVar + ", state: " + av41Var, new Object[0]);
        boolean z2 = o2xVar instanceof ltw;
        Set setM15571a = gbu.f78413a;
        if (z2) {
            ltw ltwVar = (ltw) o2xVar;
            boolean z3 = !av41Var.f20095c && ltwVar.f136872a;
            av41 av41VarM27223a = av41.m27223a(av41Var, null, null, ltwVar.f136872a, false, null, 507);
            if (z3) {
                setM15571a = Effects.m15571a(new yjt(er51Var.f62026b));
            }
            return Next.m15607i(av41VarM27223a, setM15571a);
        }
        boolean z4 = o2xVar instanceof w0x;
        uj00 uj00Var = uj00.f230850a;
        if (z4) {
            w0x w0xVar = (w0x) o2xVar;
            return Next.m15607i(av41.m27223a(av41Var, null, w0xVar.f246881a, false, w0xVar.f246882b, null, 493), Effects.m15571a(new kft(uj00Var, w0xVar.f246882b)));
        }
        boolean z5 = o2xVar instanceof duw;
        uj00 uj00Var2 = uj00.f230852c;
        if (z5) {
            duw duwVar = (duw) o2xVar;
            boolean z6 = duwVar.f53314c;
            uj00 uj00Var3 = duwVar.f53313b;
            bj00 bj00Var = duwVar.f53312a;
            if (z6) {
                viy viyVar = (viy) g6f.m43689C0(bj00Var.f27582a);
                if (viyVar != null) {
                    str2 = viyVar.f241809c;
                } else {
                    str2 = null;
                }
            } else {
                Iterator it = bj00Var.f27582a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((viy) next).f241811e == null);
                viy viyVar2 = (viy) next;
                if (viyVar2 != null) {
                    str2 = viyVar2.f241809c;
                } else {
                    str2 = null;
                }
            }
            Object obj2 = cj00.f38471a;
            ArrayList<viy> arrayList2 = bj00Var.f27582a;
            ArrayList arrayList3 = new ArrayList();
            for (viy viyVar3 : arrayList2) {
                j6f.m52564V(g6f.m43700N0(cj00.m32910a(viyVar3), Collections.singletonList(viyVar3.f241809c)), arrayList3);
            }
            Iterator it2 = arrayList3.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!wj50.m88271j((String) next2, str3));
            String str4 = (String) next2;
            uj00 uj00Var4 = uj00.f230851b;
            if (str4 == null && uj00Var3 == uj00Var4) {
                str3 = "default";
            } else if (str4 != null) {
                str3 = str4;
            }
            boolean z7 = av41Var.f20099g;
            v181 v181Var = av41Var.f20100h;
            a281 a281Var = z181Var.f278258a;
            ArrayList arrayList4 = bj00Var.f27582a;
            ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(cj00.m32911b((viy) it3.next(), str3, str2, v181Var));
            }
            av41 av41VarM27223a2 = av41.m27223a(av41Var, new z181(a281Var, arrayList5, z7, 24), str3, false, false, str2, 476);
            if (str4 == null && uj00Var3 != uj00Var4) {
                setM15571a = Effects.m15571a(new kft(uj00Var4, z));
            } else if (uj00Var3 == uj00Var) {
                setM15571a = Effects.m15571a(new kft(uj00Var2, z));
            }
            return Next.m15607i(av41VarM27223a2, setM15571a);
        }
        if (o2xVar instanceof cuw) {
            return ((cuw) o2xVar).f42241b ? Next.m15605a(Effects.m15571a(new kft(uj00Var2, z))) : Next.m15608j();
        }
        if (o2xVar instanceof ozw) {
            return Next.m15605a(Effects.m15571a(new hht(((ozw) o2xVar).f172375a)));
        }
        if (o2xVar instanceof utw) {
            utw utwVar = (utw) o2xVar;
            boolean z8 = utwVar.f234003a;
            return z8 == z ? Next.m15608j() : Next.m15607i(av41.m27223a(av41Var, null, null, false, z8, null, 495), Effects.m15571a(new kft(uj00Var, utwVar.f234003a)));
        }
        if (!(o2xVar instanceof cww)) {
            if (!(o2xVar instanceof nvw)) {
                if (o2xVar.equals(ctw.f41990a)) {
                    return m63262b(av41Var, "");
                }
                if (o2xVar.equals(ctw.f41991b)) {
                    return Next.m15605a(Effects.m15571a(new kft(uj00Var, z)));
                }
                throw new NoWhenBranchMatchedException();
            }
            String str5 = ((nvw) o2xVar).f158968a;
            Iterator it4 = z181Var.f278259b.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                Object next3 = it4.next();
                if (wj50.m88271j(((w181) next3).f247023c, str5)) {
                    obj = next3;
                    break;
                }
            }
            w181 w181Var2 = (w181) obj;
            return w181Var2 != null ? m63262b(av41Var, w181Var2.f247021a) : Next.m15608j();
        }
        List<w181> listM63266f = m63266f(er51Var.f62025a, z181Var.f278259b, ((cww) o2xVar).f42846a);
        ArrayList arrayList6 = new ArrayList();
        for (w181 w181Var3 : listM63266f) {
            j6f.m52564V(g6f.m43700N0(w181Var3.f247026f, Collections.singletonList(w181Var3)), arrayList6);
        }
        if (arrayList6.isEmpty()) {
            w181Var = (w181) g6f.m43741q0(z181Var.f278259b);
            arrayList = new ArrayList(i6f.m49804T(listM63266f, 10));
            for (w181 w181VarM86978a : listM63266f) {
                if (wj50.m88271j(w181VarM86978a.f247021a, w181Var.f247021a)) {
                    w181VarM86978a = w181.m86978a(w181VarM86978a, true, null, ContentMediaFormat.PARTIAL_CONTENT_PODCAST);
                }
                arrayList.add(w181VarM86978a);
            }
            listM63266f = arrayList;
        } else {
            Iterator it5 = arrayList6.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    w181Var = (w181) g6f.m43741q0(z181Var.f278259b);
                    arrayList = new ArrayList(i6f.m49804T(listM63266f, 10));
                    while (r0.hasNext()) {
                        if (wj50.m88271j(w181VarM86978a.f247021a, w181Var.f247021a)) {
                            w181VarM86978a = w181.m86978a(w181VarM86978a, true, null, ContentMediaFormat.PARTIAL_CONTENT_PODCAST);
                        }
                        arrayList.add(w181VarM86978a);
                    }
                    listM63266f = arrayList;
                } else if (((w181) it5.next()).f247024d) {
                }
            }
        }
        z181 z181VarM95093a = z181.m95093a(z181Var, listM63266f);
        w181 w181VarM95094b = z181.m95094b(z181VarM95093a.f278259b);
        String str6 = (w181VarM95094b == null || (str = w181VarM95094b.f247023c) == null) ? "default" : str;
        return Next.m15607i(av41.m27223a(av41Var, z181VarM95093a, str6, false, false, null, 508), Effects.m15571a(new ijt(str6)));
    }

    /* JADX INFO: renamed from: f */
    public static List m63266f(String str, List list, String str2) {
        if (list.isEmpty()) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w181 w181Var = (w181) it.next();
            List list2 = w181Var.f247026f;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((w181) it2.next()).f247021a);
            }
            boolean zContains = arrayList2.contains(str);
            arrayList.add(w181.m86978a(w181Var, !(!wj50.m88271j(w181Var.f247021a, str2) || wj50.m88271j(str, str2) || zContains) || (wj50.m88271j(str, str2) && zContains), m63266f(str, w181Var.f247026f, str2), 983));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized vya0 m63267a(Context context) {
        if (context == null) {
            try {
                context = p8y.m69343a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f148818Y == null) {
            f148818Y = new vya0(context, p8y.m69344b());
        }
        return f148818Y;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object obj2;
        Object objEmpty;
        switch (this.f148833a) {
            case 0:
                return new h3b(true, (RestrictedIntegrationsResponse) obj);
            case 1:
                hv31 hv31Var = (hv31) obj;
                fv31 fv31Var = lbz.f131780a;
                return k0e1.m54988g(((mv31) hv31Var).m62896q(fv31Var), dau.f47107a).map(dzx.f54787c).startWithItem(Boolean.valueOf(hv31Var.mo48713h(fv31Var, false)));
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 21:
            default:
                Map map = (Map) obj;
                return Boolean.valueOf(dxf1.m37244s("has-podcasts-available", map) || dxf1.m37246v(map));
            case 3:
                return oww.f170793b;
            case 6:
                return new j960((Set) obj);
            case 10:
                return new oh6("", null, "", false, ((wwy0) obj).f255856a, null, 42);
            case 12:
                return new ifb0(new dnb0((s7f) obj));
            case 13:
                o2x0 o2x0Var = (o2x0) obj;
                return (!o2x0Var.f161171a.f149852O0 || (obj2 = o2x0Var.f161172b) == null) ? new ogc0(1) : new pgc0((ngc0) obj2);
            case 17:
                eyl0 eyl0Var = (eyl0) obj;
                zpj0 zpj0Var = zpj0.f285145Q0;
                eyl0Var.getClass();
                if (eyl0Var instanceof dyl0) {
                    objEmpty = zpj0Var.invoke(eyl0Var);
                } else {
                    if (!(eyl0Var instanceof byl0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objEmpty = Observable.empty();
                }
                return (ObservableSource) objEmpty;
            case 18:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 19:
                return ((Boolean) obj).booleanValue() ? tqk0.f222827a : sqk0.f213112a;
            case 20:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOfflinePlayableCache$RemoveTrackResponse.m16222n(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.offline_playable_cache_esperanto.proto.EsOfflinePlayableCache.RemoveTrackResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 22:
                return hk10.f92312b;
            case 23:
                return new fxx((List) obj, null, null, null);
            case 24:
                return new rzw(((Boolean) obj).booleanValue());
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService$StreamSettingChange.m17612q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.StreamSettingChange: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 26:
                return C2244p5.f174033a;
            case 27:
                return Boolean.valueOf(dxf1.m37244s("apply-child-content-restrictions", (Map) obj));
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f148833a) {
            case 7:
                return First.m15574b((p370) obj);
            default:
                return First.m15574b((j580) obj);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str3.charAt(i);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new nup0(str3, mec0Var, str2, str);
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        Logger.m3967c((Throwable) obj, "Go: Failed to open Spotify login page", new Object[0]);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((Integer) obj, (Boolean) obj2);
    }
}
