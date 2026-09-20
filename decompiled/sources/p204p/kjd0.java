package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class kjd0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f123346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f123347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjd0(int i, Object obj, Object obj2) {
        super(0);
        this.f123345a = i;
        this.f123346b = obj;
        this.f123347c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // p204p.eh00
    public final Object invoke() {
        Object obj;
        String str;
        String str2;
        azu0 azu0Var;
        fj51 fj51Var;
        boolean z;
        ej51 ej51Var;
        er70 er70Var;
        int i = this.f123345a;
        int i2 = 23;
        int i3 = 10;
        int i4 = 11;
        Long l = 0;
        fj51 fj51Var2 = null;
        boolean z2 = false;
        z2 = false;
        int i5 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f123346b;
        Object obj3 = this.f123347c;
        switch (i) {
            case 0:
                ((gh00) obj2).invoke((tfd0) obj3);
                return w2a1Var;
            case 1:
                return ((xcq0) obj2).mo60201a((yeq0) obj3);
            case 2:
                v5r0 v5r0Var = (v5r0) obj3;
                return ((hun0) obj2).m48683d(v5r0Var, v5r0Var, true, v5r0Var);
            case 3:
                return Long.valueOf(n5h1.m63735k((cg21) obj2, ((xre) obj3) != null ? Long.valueOf(System.currentTimeMillis()) : 0));
            case 4:
                return Integer.valueOf((int) (yb71.m93234a((yb71) obj2, "…", (if71) obj3, 0, false, 1, 0L, null, null, 1004).f47232c >> 32));
            case 5:
                ((rmx) ((b6e0) obj2).f23953h).m75984c((String) obj3).subscribe();
                return w2a1Var;
            case 6:
                m5r0 m5r0Var = (m5r0) obj3;
                ((hp3) obj2).getClass();
                return new qce0(m5r0Var, m5r0Var, m5r0Var);
            case 7:
                f5u f5uVar = ((ezs0) obj2).f64465g;
                if (f5uVar != null) {
                    ((j7e0) obj3).f109574a.m25381i(new C2475uy(g95.m43999x(f5uVar)));
                }
                return w2a1Var;
            case 8:
                if (((Integer) obj2) != null) {
                    ((eh00) obj3).invoke();
                }
                return w2a1Var;
            case 9:
                ((gh00) obj2).invoke(new ide0((xiw0) obj3));
                return w2a1Var;
            case 10:
                ((yum0) obj3).setValue(Boolean.FALSE);
                sdo sdoVar = (sdo) obj2;
                kv91 kv91Var = (kv91) sdoVar.f208048b;
                ghh0 ghh0Var = (ghh0) ((wg61) sdoVar.f208053g).getValue();
                ghh0Var.getClass();
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), ghh0Var.f79929b, ghh0Var.f79928a, System.currentTimeMillis()), null);
                sdoVar.m77859g();
                return w2a1Var;
            case 11:
                Set set = ((pei0) ((i4t0) obj2).get()).f176762a;
                Set set2 = set.isEmpty() ? null : set;
                lau lauVar = lau.f131415a;
                if (set2 == null) {
                    return jag1.m52819d(lauVar);
                }
                dte0 dte0Var = (dte0) obj3;
                Set set3 = set2;
                ArrayList arrayList = new ArrayList(i6f.m49804T(set3, 10));
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    arrayList.add(mvl0.m62953p(vkf1.m85850P(((rte0) it.next()).mo37621c(), dte0.f52802i, lauVar)));
                }
                return bzf1.m31027s(new v78((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), i2), dte0Var.f52808d, hf11.f90581a, 1);
            case 12:
                zhf0 zhf0Var = (zhf0) obj3;
                boolean z3 = zhf0Var.f282913m;
                boolean z4 = zhf0Var.f282910j;
                yhf0 yhf0Var = zhf0Var.f282901a;
                if (!z3) {
                    gh00 gh00Var = (gh00) obj2;
                    boolean z5 = yhf0Var.f272867b;
                    Boolean bool = yhf0Var.f272866a;
                    if (z5) {
                        obj = phf0.f177646a;
                    } else {
                        Boolean bool2 = Boolean.TRUE;
                        boolean zM88271j = wj50.m88271j(bool, bool2);
                        qhf0 qhf0Var = qhf0.f188770a;
                        if (zM88271j && !z4) {
                            int iOrdinal = zhf0Var.f282912l.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1 && iOrdinal != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj = qhf0Var;
                            } else {
                                obj = uhf0.f230444a;
                            }
                        } else if (wj50.m88271j(bool, bool2)) {
                            obj = qhf0Var;
                        } else if (wj50.m88271j(bool, bool2) || z4) {
                            i490 i490Var = zhf0Var.f282906f;
                            obj = ((i490Var == null || i490Var.equals(v390.f236813a)) && !zhf0Var.f282904d) ? thf0.f220418a : vhf0.f241514a;
                        } else {
                            obj = whf0.f251347a;
                        }
                    }
                    gh00Var.invoke(obj);
                }
                return w2a1Var;
            case 13:
                x0h1.m89578u((xuk) obj2, null, 0, new xoa0((ijf0) obj3, l, i2), 3);
                return w2a1Var;
            case 14:
                xik xikVar = (xik) obj3;
                return new hgo(((bun) obj2).m30576a((pgo) xikVar.f261889d, null), new zrf0(xikVar, i5));
            case 15:
                ((gh00) obj2).invoke((egf0) obj3);
                return w2a1Var;
            case 16:
                pvf0 pvf0Var = ((e3g0) obj2).f55790c;
                rzl0 rzl0Var = ((yuf0) obj3).f276343P0.f24196b;
                pvf0Var.f181737c = new aox0(rzl0Var.f204175b, rzl0Var.f204181h, rzl0Var.f204170Q0);
                return w2a1Var;
            case 17:
                ((ContentResolver) obj2).unregisterContentObserver((wmg0) obj3);
                return w2a1Var;
            case 18:
                jph0 jph0Var = (jph0) obj2;
                String str3 = jph0Var.f114656a;
                Logger.m3965a("Initializing ".concat(str3), new Object[0]);
                jph0Var.f114662g.mo59007a(str3, new gph0((f0k) obj3, z2 ? 1 : 0));
                return w2a1Var;
            case 19:
                ((gh00) obj2).invoke((Window) obj3);
                return w2a1Var;
            case 20:
                m7i0 m7i0Var = (m7i0) obj2;
                ra9 ra9Var = m7i0Var.f140784b;
                e7i0 e7i0Var = (e7i0) obj3;
                qtw0 qtw0Var = new qtw0(e7i0Var.f56943b);
                px6 px6Var = new px6();
                int i6 = 0;
                int i7 = 1;
                int i8 = 0;
                azu0 azu0Var2 = new azu0(14, new ptw0(i7, qtw0Var, qtw0.class, "generatePlaybackMetadata", "generatePlaybackMetadata(Lcom/spotify/betamax/player/PlaybackIdentity;)Ljava/util/Map;", i8, i6, 0), new ptw0(i7, qtw0Var, qtw0.class, "removePlaybackMetadata", "removePlaybackMetadata(Lcom/spotify/betamax/player/PlaybackIdentity;)V", i8, i6, 1));
                vh4 vh4Var = m7i0Var.f140790h;
                int iOrdinal2 = vh4Var.ordinal();
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        str2 = null;
                    } else {
                        str = "config_param:use_multiplayer_sr_module";
                    }
                    if (str2 != null) {
                        ej51Var = m7i0Var.f140789g;
                        er70Var = ej51Var.f60149b;
                        if (((lp4) er70Var.get()).m59585a()) {
                            qon qonVar = ej51Var.f60148a;
                            boolean zM59586b = ((lp4) er70Var.get()).m59586b();
                            son sonVar = qonVar.f191010a.f201303a;
                            azu0Var = azu0Var2;
                            fj51Var2 = new fj51(str2, new sr6(new CosmosCoroutineTransport(new mof((CallbackRouter) sonVar.f212061f3.get(), 11))), (xre) sonVar.f211251B1.get(), (luk) sonVar.f212491v3.get(), (luk) sonVar.f211921a2.get(), (mlr0) sonVar.f212095g9.get(), azu0Var2, zM59586b);
                        } else {
                            azu0Var = azu0Var2;
                        }
                    } else {
                        azu0Var = azu0Var2;
                    }
                    fj51Var = fj51Var2;
                    if (fj51Var == null && vh4Var == vh4.ENABLED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liz lizVar = new liz();
                    int i9 = 0;
                    int i10 = 2;
                    int i11 = 0;
                    return new ph50(e7i0Var, new ooa0(0, m7i0Var.f140786d, ab9.class, "create", "create()Lcom/spotify/betamax/player/TrackerManager;", 0, 0, 13), new yrv(i10, qtw0Var, qtw0.class, "setInteractionLoggingResult", "setInteractionLoggingResult(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", i11, i9, 24), new yrv(i10, qtw0Var, qtw0.class, "setLinkingId", "setLinkingId(Ljava/lang/String;Ljava/lang/String;)V", i11, i9, 25), new yrv(i10, qtw0Var, qtw0.class, "setProvenanceId", "setProvenanceId(Ljava/lang/String;Ljava/lang/String;)V", i11, i9, 26), lizVar, ra9Var.mo72487c("multiplayer", null, new iac1(), m7i0Var.f140785c, bk5.m29582E0(new pzo0[]{px6Var, fj51Var, m7i0Var.f140791i}), !z, azu0Var, lizVar, new mgy(false)), new noa0(1, ra9Var, ra9.class, "release", "release(Lcom/spotify/betamax/player/BetamaxPlayer;)V", 0, 0, 15), px6Var, fj51Var, z);
                }
                str = "config_param:rcs_copy_mode_enabled";
                str2 = str;
                if (str2 != null) {
                    ej51Var = m7i0Var.f140789g;
                    er70Var = ej51Var.f60149b;
                    if (((lp4) er70Var.get()).m59585a()) {
                        azu0Var = azu0Var2;
                    } else {
                        qon qonVar2 = ej51Var.f60148a;
                        boolean zM59586b2 = ((lp4) er70Var.get()).m59586b();
                        son sonVar2 = qonVar2.f191010a.f201303a;
                        azu0Var = azu0Var2;
                        fj51Var2 = new fj51(str2, new sr6(new CosmosCoroutineTransport(new mof((CallbackRouter) sonVar2.f212061f3.get(), 11))), (xre) sonVar2.f211251B1.get(), (luk) sonVar2.f212491v3.get(), (luk) sonVar2.f211921a2.get(), (mlr0) sonVar2.f212095g9.get(), azu0Var2, zM59586b2);
                    }
                } else {
                    azu0Var = azu0Var2;
                }
                fj51Var = fj51Var2;
                if (fj51Var == null) {
                    z = false;
                } else {
                    z = false;
                }
                liz lizVar2 = new liz();
                int i12 = 0;
                int i13 = 2;
                int i14 = 0;
                return new ph50(e7i0Var, new ooa0(0, m7i0Var.f140786d, ab9.class, "create", "create()Lcom/spotify/betamax/player/TrackerManager;", 0, 0, 13), new yrv(i13, qtw0Var, qtw0.class, "setInteractionLoggingResult", "setInteractionLoggingResult(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", i14, i12, 24), new yrv(i13, qtw0Var, qtw0.class, "setLinkingId", "setLinkingId(Ljava/lang/String;Ljava/lang/String;)V", i14, i12, 25), new yrv(i13, qtw0Var, qtw0.class, "setProvenanceId", "setProvenanceId(Ljava/lang/String;Ljava/lang/String;)V", i14, i12, 26), lizVar2, ra9Var.mo72487c("multiplayer", null, new iac1(), m7i0Var.f140785c, bk5.m29582E0(new pzo0[]{px6Var, fj51Var, m7i0Var.f140791i}), !z, azu0Var, lizVar2, new mgy(false)), new noa0(1, ra9Var, ra9.class, "release", "release(Lcom/spotify/betamax/player/BetamaxPlayer;)V", 0, 0, 15), px6Var, fj51Var, z);
            case 21:
                C2317qx c2317qx = (C2317qx) obj2;
                if (c2317qx != null) {
                    ((kqi0) obj3).setValue(c2317qx);
                }
                return w2a1Var;
            case 22:
                edi0 edi0Var = (edi0) obj2;
                return edi0.m38596b(edi0Var, ((Context) obj3).getPackageManager(), edi0Var.f58523a);
            case 23:
                ((vei0) obj2).f240760a.mo58242e((h7m) obj3);
                return w2a1Var;
            case 24:
                lyi0 lyi0Var = (lyi0) obj2;
                if (lyi0Var != null) {
                    return new pyi0(((pfi0) obj3).m69808j().f145378h, lyi0Var);
                }
                return null;
            case 25:
                pfi0 pfi0Var = (pfi0) obj2;
                return pfi0Var.f177088g.mo32587a((h9y0) obj3, pfi0Var.f177083b, pfi0Var.f177086e, pfi0Var.f177082a, pfi0Var.f177087f);
            case 26:
                dgi0 dgi0Var = (dgi0) obj2;
                int i15 = dgi0Var.f48807b;
                int i16 = dgi0Var.f48808c;
                int iLongValue = (int) ((Number) ((kqi0) obj3).getValue()).longValue();
                if (i15 <= iLongValue && iLongValue <= i16) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 27:
                pgo pgoVar = ((cu50) ((ydi) ((b8n) obj2).f24623a.f247852b).f271774b).f42051b;
                jg31.m53271i(pgoVar);
                return new hgo(new as5(pgoVar, 11), new e9f0((ogi0) obj3, i3));
            case 28:
                wym wymVar = (wym) ((c8n) obj2).f35279a.f247852b;
                pgo pgoVar2 = ((cu50) wymVar.f256320b).f42051b;
                jg31.m53271i(pgoVar2);
                return new hgo(new hgc(pgoVar2, ((l3n) wymVar.f256321c).m58011d(), 7), new e9f0((wgi0) obj3, i4));
            default:
                fhi0 fhi0Var = (fhi0) obj3;
                String str4 = fhi0Var.f69668c;
                if (str4 != null) {
                    ((gh00) obj2).invoke(new ehi0(str4, fhi0Var.f69669d));
                }
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjd0(zhf0 zhf0Var, gh00 gh00Var, sif0 sif0Var) {
        super(0);
        this.f123345a = 12;
        this.f123347c = zhf0Var;
        this.f123346b = gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjd0(fhi0 fhi0Var, gh00 gh00Var) {
        super(0);
        this.f123345a = 29;
        this.f123347c = fhi0Var;
        this.f123346b = gh00Var;
    }
}
