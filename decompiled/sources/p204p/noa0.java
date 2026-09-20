package p204p;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.spotify.address.endpoint.model.p012v1.proto.C0291l;
import com.spotify.address.endpoint.model.p012v1.proto.C0292m;
import com.spotify.address.endpoint.model.p012v1.proto.C0293n;
import com.spotify.address.endpoint.model.p012v1.proto.C0294o;
import com.spotify.address.endpoint.model.p012v1.proto.FieldValue;
import com.spotify.address.endpoint.model.p012v1.proto.SavedAddress;
import com.spotify.address.endpoint.model.p012v1.proto.SubmitFormRequest;
import com.spotify.address.endpoint.model.p012v1.proto.SubmitFormResponse;
import com.spotify.deviceproxy.navigation.p059v1.NavigationCommand;
import com.spotify.mobius.MobiusLoop;
import com.spotify.pending_events.esperanto.proto.AddPendingEventRequest;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventRequest;
import com.spotify.player.model.ContextTrack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class noa0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f156636h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noa0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f156636h = i4;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0300  */
    /* JADX WARN: Code duplicated, block: B:112:0x0325  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String str;
        aj40 aj40Var;
        lcf0 lcf0VarM87729c;
        d2j0 d2j0Var;
        List listM2454q;
        List listSingletonList;
        List listSingletonList2;
        Map mapM56695h0;
        Object c6x0Var;
        i500 i500Var;
        Object c6x0Var2;
        qro qroVar;
        switch (this.f156636h) {
            case 0:
                String str2 = (String) obj;
                bfg0 bfg0Var = (bfg0) this.f78014b;
                bfg0Var.getClass();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str2 != null ? str2.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), bfg0Var.f26707a, bfg0Var.f26708b.f78049b, System.currentTimeMillis());
            case 1:
                String str3 = (String) obj;
                cfg0 cfg0Var = (cfg0) this.f78014b;
                cfg0Var.getClass();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str3 != null ? str3.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), cfg0Var.f37372a, cfg0Var.f37373b.f78049b, System.currentTimeMillis());
            case 2:
                String str4 = (String) obj;
                dfg0 dfg0Var = (dfg0) this.f78014b;
                dfg0Var.getClass();
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str4 != null ? str4.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), dfg0Var.f48600a, dfg0Var.f48601b.f78049b, System.currentTimeMillis());
            case 3:
                String str5 = (String) obj;
                ifg0 ifg0Var = (ifg0) this.f78014b;
                ifg0Var.getClass();
                dv91 dv91Var4 = new dv91("hit", 1);
                String string4 = str5 != null ? str5.toString() : null;
                if (string4 == null) {
                    string4 = "";
                }
                return new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4)), ifg0Var.f101761a, ((gag0) ifg0Var.f101762b.f206644c).f78049b, System.currentTimeMillis());
            case 4:
                String str6 = (String) obj;
                gfg0 gfg0Var = (gfg0) this.f78014b;
                gfg0Var.getClass();
                dv91 dv91Var5 = new dv91("hit", 1);
                String string5 = str6 != null ? str6.toString() : null;
                if (string5 == null) {
                    string5 = "";
                }
                return new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5)), gfg0Var.f79351a, st91.f213865b, System.currentTimeMillis());
            case 5:
                String str7 = (String) obj;
                efg0 efg0Var = (efg0) this.f78014b;
                efg0Var.getClass();
                dv91 dv91Var6 = new dv91("hit", 1);
                String string6 = str7 != null ? str7.toString() : null;
                if (string6 == null) {
                    string6 = "";
                }
                return new av91("", "", dv91Var6, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string6)), efg0Var.f59047a, st91.f213865b, System.currentTimeMillis());
            case 6:
                rpb0 rpb0Var = (rpb0) obj;
                jkb0 jkb0Var = (jkb0) this.f78014b;
                if (rpb0Var instanceof qpb0) {
                    qpb0 qpb0Var = (qpb0) rpb0Var;
                    jkb0Var.m53587r1().m15621f(new dkb0(qpb0Var.f191261a, qpb0Var.f191262b));
                } else {
                    jkb0Var.getClass();
                    if (!(rpb0Var instanceof ppb0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return w2a1.f247311a;
            case 7:
                cn01 cn01Var = (cn01) obj;
                ((ilb0) this.f78014b).getClass();
                sr01 sr01Var = cn01Var.f39857a;
                return new ykb0(((jlb0) sr01Var.m78984g()).f113578a, cn01Var.f39858b, cn01Var.f39859c, sr01Var.f213202b.f154746c);
            case 8:
                ((nwb0) this.f78014b).f159083c.m27510a((uek0) obj);
                return w2a1.f247311a;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                hme0 hme0Var = (hme0) this.f78014b;
                qu91 qu91Var = hme0Var.f92966b;
                if (qu91Var != null && (str = hme0Var.f92972h) != null) {
                    ime0 ime0Var = new ime0(hme0Var.f92968d, str, false);
                    Object objMo26462d = hme0Var.f92967c.mo26462d(ime0Var, ime0Var, null);
                    ou91 ou91Var = objMo26462d instanceof ou91 ? (ou91) objMo26462d : null;
                    if (ou91Var != null) {
                        if (iIntValue >= 50 && hme0Var.f92971g == null) {
                            hme0Var.f92971g = qu91Var.m73888n(ou91Var);
                        } else if (iIntValue < 50 && (aj40Var = hme0Var.f92971g) != null) {
                            qu91Var.m73887h(aj40Var);
                            hme0Var.f92971g = null;
                        }
                    }
                }
                return w2a1.f247311a;
            case 10:
                wcf0 wcf0Var = (wcf0) obj;
                kcf0 kcf0Var = (kcf0) this.f78014b;
                long jLongValue = ((Number) kcf0Var.f121465a.invoke()).longValue();
                synchronized (kcf0Var.f121476l) {
                    lcf0VarM87729c = wcf0Var.m87729c(jLongValue);
                }
                if (lcf0VarM87729c != null && (d2j0Var = kcf0Var.f121467c.f263668y) != null) {
                    bin0 bin0Var = (bin0) d2j0Var.f44572b;
                    String str8 = lcf0VarM87729c.f131919c;
                    ain0 ain0Var = (ain0) ((ConcurrentHashMap) d2j0Var.f44573c).get(str8);
                    if (ain0Var != null) {
                        gva byteString = tug1.m81570h(lcf0VarM87729c).toByteString();
                        qmw0 qmw0VarM16975r = ReplacePendingEventRequest.m16975r();
                        qmw0VarM16975r.m73306r(ain0Var.f16061a);
                        qmw0VarM16975r.m73307s(ain0Var.f16062b);
                        qmw0VarM16975r.m73305q("OopsMetricEvent");
                        qmw0VarM16975r.m73304m(byteString);
                        ReplacePendingEventRequest replacePendingEventRequest = (ReplacePendingEventRequest) qmw0VarM16975r.build();
                        wj50.m88279p(replacePendingEventRequest);
                        bin0Var.m29349a(replacePendingEventRequest).subscribe(din0.f49436b, din0.f49438c);
                    } else {
                        gva byteString2 = tug1.m81570h(lcf0VarM87729c).toByteString();
                        jg1 jg1VarM16959p = AddPendingEventRequest.m16959p();
                        jg1VarM16959p.m53248q("OopsMetricEvent");
                        jg1VarM16959p.m53247m(byteString2);
                        AddPendingEventRequest addPendingEventRequest = (AddPendingEventRequest) jg1VarM16959p.build();
                        wj50.m88279p(addPendingEventRequest);
                        bin0Var.callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "AddPendingEvent", addPendingEventRequest).map(s2z.f205109V0).subscribe(new ao90(18, d2j0Var, str8), pw90.f181959Z0);
                    }
                }
                return w2a1.f247311a;
            case 11:
                UUID uuid = (UUID) obj;
                kcf0 kcf0Var2 = (kcf0) this.f78014b;
                synchronized (kcf0Var2.f121476l) {
                    j6f.m52567Y(kcf0Var2.f121472h, new cfd0(uuid));
                }
                return w2a1.f247311a;
            case 12:
                ((zip) this.f78014b).mo2820d((wy10) obj);
                return w2a1.f247311a;
            case 13:
                ((zip) this.f78014b).mo2821c((gh00) obj);
                return w2a1.f247311a;
            case 14:
                ((tph0) this.f78014b).getClass();
                SavedAddress savedAddress = tph0.f222549d;
                ?? r6 = tph0.f222548c;
                C0291l c0291lM2473u = SubmitFormResponse.m2473u();
                ae50<FieldValue> ae50VarM2469p = ((SubmitFormRequest) obj).m2469p();
                int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM2469p, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (FieldValue fieldValue : ae50VarM2469p) {
                    linkedHashMap.put(fieldValue.getId(), fieldValue.getValue());
                }
                String str9 = (String) linkedHashMap.get("state");
                if (str9 == null) {
                    if (linkedHashMap.keySet().containsAll(bk5.m29624m1(new String[]{"street", "city", "state", "zip"}))) {
                        Object obj2 = linkedHashMap.get("street");
                        wj50.m88279p(obj2);
                        listM2454q = h6f.m46715L(obj2, rkh0.m75734h(", ", r6.get(linkedHashMap.get("state")), linkedHashMap.get("zip")), "US");
                    } else {
                        listM2454q = savedAddress.m2454q();
                        wj50.m88279p(listM2454q);
                    }
                    C0293n c0293nM2484s = SubmitFormResponse.SubmitSuccess.m2484s();
                    c0293nM2484s.m2534q();
                    i8y0 i8y0Var = (i8y0) savedAddress.toBuilder();
                    i8y0Var.m49962q();
                    i8y0Var.m49961m(listM2454q);
                    c0293nM2484s.m2533m(i8y0Var);
                    c0291lM2473u.m2530q(c0293nM2484s);
                } else {
                    int iHashCode = str9.hashCode();
                    if (iHashCode != 96784904) {
                        if (iHashCode != 1197722116) {
                            if (iHashCode == 1959784951 && str9.equals("invalid")) {
                                C0292m c0292mM2480p = SubmitFormResponse.SubmitError.m2480p();
                                c0292mM2480p.m2532m();
                                c0291lM2473u.m2529m(c0292mM2480p);
                            }
                        } else if (str9.equals("suggestion")) {
                            if (linkedHashMap.keySet().containsAll(bk5.m29624m1(new String[]{"street", "city", "state", "zip"}))) {
                                Object obj3 = linkedHashMap.get("street");
                                wj50.m88279p(obj3);
                                listSingletonList = h6f.m46715L(obj3, rkh0.m75734h(", ", r6.get(linkedHashMap.get("state")), linkedHashMap.get("zip")), "US");
                                listSingletonList2 = h6f.m46715L("1601 Pennsylvania Avenue", "Washington, DC, <strong>20006</strong>", "US");
                                mapM56695h0 = kkc0.m56695h0(new pqm0("street", "1601 Pennsylvania Avenue"), new pqm0("city", "Washington"), new pqm0("state", "DC"), new pqm0("zip", "20006"));
                            } else {
                                listSingletonList = Collections.singletonList("Implement me");
                                listSingletonList2 = Collections.singletonList("Implement me");
                                mapM56695h0 = nau.f152117a;
                            }
                            C0294o c0294oM2487F = SubmitFormResponse.Suggestion.m2487F();
                            c0294oM2487F.m2543x();
                            c0294oM2487F.m2539t();
                            c0294oM2487F.m2541v();
                            c0294oM2487F.m2536q(listSingletonList);
                            c0294oM2487F.m2542w();
                            c0294oM2487F.m2537r(listSingletonList2);
                            c0294oM2487F.m2540u();
                            c0294oM2487F.m2538s();
                            ArrayList arrayList = new ArrayList(mapM56695h0.size());
                            for (Map.Entry entry : mapM56695h0.entrySet()) {
                                evy evyVarM2375p = FieldValue.m2375p();
                                evyVarM2375p.m40115m((String) entry.getKey());
                                evyVarM2375p.m40116q((String) entry.getValue());
                                arrayList.add((FieldValue) evyVarM2375p.build());
                            }
                            c0294oM2487F.m2535m(arrayList);
                            c0291lM2473u.m2531r(c0294oM2487F);
                        }
                    } else if (str9.equals("error")) {
                        throw new IOException("Mock network error");
                    }
                    if (linkedHashMap.keySet().containsAll(bk5.m29624m1(new String[]{"street", "city", "state", "zip"}))) {
                        Object obj4 = linkedHashMap.get("street");
                        wj50.m88279p(obj4);
                        listM2454q = h6f.m46715L(obj4, rkh0.m75734h(", ", r6.get(linkedHashMap.get("state")), linkedHashMap.get("zip")), "US");
                    } else {
                        listM2454q = savedAddress.m2454q();
                        wj50.m88279p(listM2454q);
                    }
                    C0293n c0293nM2484s2 = SubmitFormResponse.SubmitSuccess.m2484s();
                    c0293nM2484s2.m2534q();
                    i8y0 i8y0Var2 = (i8y0) savedAddress.toBuilder();
                    i8y0Var2.m49962q();
                    i8y0Var2.m49961m(listM2454q);
                    c0293nM2484s2.m2533m(i8y0Var2);
                    c0291lM2473u.m2530q(c0293nM2484s2);
                }
                return (SubmitFormResponse) c0291lM2473u.build();
            case 15:
                ((ra9) this.f78014b).mo72486b((pa9) obj);
                return w2a1.f247311a;
            case 16:
                ((o4j0) this.f78014b).getClass();
                byte[] bArr = (byte[]) g6f.m43745s0(((woo) obj).f253523c);
                if (bArr == null) {
                    return null;
                }
                try {
                    c6x0Var = NavigationCommand.m9290r(bArr);
                    break;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                return (NavigationCommand) (c6x0Var instanceof c6x0 ? null : c6x0Var);
            case 17:
                ((MobiusLoop) this.f78014b).m15600a((g3x) obj);
                return w2a1.f247311a;
            case 18:
                ((ValueCallback) this.f78014b).onReceiveValue((Uri[]) obj);
                return w2a1.f247311a;
            case 19:
                return Boolean.valueOf(((djs) this.f78014b).m36213a((ContextTrack) obj));
            case 20:
                return Boolean.valueOf(((djs) this.f78014b).m36213a((ContextTrack) obj));
            case 21:
                return Double.valueOf(eok0.m39575a((eok0) this.f78014b, (hnk0) obj));
            case 22:
                return Double.valueOf(eok0.m39575a((eok0) this.f78014b, (hnk0) obj));
            case 23:
                return Double.valueOf(eok0.m39575a((eok0) this.f78014b, (hnk0) obj));
            case 24:
                return Double.valueOf(eok0.m39575a((eok0) this.f78014b, (hnk0) obj));
            case 25:
                return Double.valueOf(eok0.m39575a((eok0) this.f78014b, (hnk0) obj));
            case 26:
                return Double.valueOf(eok0.m39575a((eok0) this.f78014b, (hnk0) obj));
            case 27:
                ((kc20) ((ddm0) this.f78014b)).m55980a((edm0) obj);
                return w2a1.f247311a;
            case 28:
                o1m0 o1m0Var = (o1m0) obj;
                y0m0 y0m0Var = (y0m0) this.f78014b;
                s5j0 s5j0Var = y0m0Var.f268014d;
                y0m0Var.f268015e = o1m0Var;
                if (o1m0Var == null) {
                    y0m0Var.f268016f = null;
                    s5j0Var.m77280d();
                    k5j0 k5j0VarMo58245h = y0m0Var.f268011a.mo58245h();
                    i5j0 i5j0Var = k5j0VarMo58245h instanceof i5j0 ? (i5j0) k5j0VarMo58245h : null;
                    if (i5j0Var != null && (i500Var = i5j0Var.f98977a) != null) {
                        s5j0Var.m77277a(i500Var, 1, true);
                    }
                }
                return w2a1.f247311a;
            default:
                puy0 puy0Var = (puy0) obj;
                ezw0 ezw0Var = ((lyy0) this.f78014b).f138134a;
                if (puy0Var instanceof lty0) {
                    try {
                        c6x0Var2 = (dyy0) ((er70) ezw0Var.f64486c).get();
                    } catch (Throwable th2) {
                        c6x0Var2 = new c6x0(th2);
                    }
                    if (c6x0Var2 instanceof c6x0) {
                        c6x0Var2 = null;
                    }
                    dyy0 dyy0Var = (dyy0) c6x0Var2;
                    if (dyy0Var != null && (qroVar = dyy0Var.f54461a) != null) {
                        qroVar.m73660e(new cyy0(((lty0) puy0Var).f136929a));
                    }
                    break;
                }
                txy0 txy0Var = (txy0) ezw0Var.f64487d;
                if (txy0Var != null) {
                    txy0Var.m15621f(puy0Var);
                    return w2a1.f247311a;
                }
                wj50.m88260d0("mobiusViewModel");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noa0(Object obj) {
        super(1, obj, kcf0.class, "unregisterBatchObservable", "unregisterBatchObservable(Ljava/util/UUID;)V", 0, 0);
        this.f156636h = 11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noa0(kcf0 kcf0Var) {
        super(1, kcf0Var, kcf0.class, "handleViewPersistenceNeeded", "handleViewPersistenceNeeded(Lcom/spotify/performancesdk/observationplatform/impl/metrics/MetricView;)V", 0, 0);
        this.f156636h = 10;
    }
}
