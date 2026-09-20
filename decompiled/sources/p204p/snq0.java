package p204p;

import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.reachability.esperanto.proto.EsReachabilityProvider$ReachabilityState;
import com.spotify.kidsdatamigration.p085v1.MigrationStatusPubsub;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p196j$.util.Base64;
import spotify.socialgraph.esperanto.proto.FollowResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class snq0 implements Function, Predicate, BiFunction, t6l0, Function4, sq31, lir, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f211017a;

    /* JADX INFO: renamed from: b */
    public static final snq0 f211007b = new snq0(0);

    /* JADX INFO: renamed from: c */
    public static final snq0 f211009c = new snq0(1);

    /* JADX INFO: renamed from: d */
    public static final snq0 f211010d = new snq0(2);

    /* JADX INFO: renamed from: e */
    public static final snq0 f211011e = new snq0(3);

    /* JADX INFO: renamed from: f */
    public static final snq0 f211012f = new snq0(4);

    /* JADX INFO: renamed from: g */
    public static final snq0 f211013g = new snq0(5);

    /* JADX INFO: renamed from: h */
    public static final snq0 f211014h = new snq0(6);

    /* JADX INFO: renamed from: i */
    public static final snq0 f211015i = new snq0(7);

    /* JADX INFO: renamed from: t */
    public static final snq0 f211016t = new snq0(8);

    /* JADX INFO: renamed from: X */
    public static final snq0 f211000X = new snq0(9);

    /* JADX INFO: renamed from: Y */
    public static final snq0 f211002Y = new snq0(10);

    /* JADX INFO: renamed from: Z */
    public static final snq0 f211004Z = new snq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final snq0 f210988L0 = new snq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final snq0 f210989M0 = new snq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final snq0 f210990N0 = new snq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final snq0 f210991O0 = new snq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final snq0 f210992P0 = new snq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final snq0 f210993Q0 = new snq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final snq0 f210994R0 = new snq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final snq0 f210995S0 = new snq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final snq0 f210996T0 = new snq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final snq0 f210997U0 = new snq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final snq0 f210998V0 = new snq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final snq0 f210999W0 = new snq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final snq0 f211001X0 = new snq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final snq0 f211003Y0 = new snq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final snq0 f211005Z0 = new snq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final snq0 f211006a1 = new snq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final snq0 f211008b1 = new snq0(28);

    public /* synthetic */ snq0(int i) {
        this.f211017a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        hpg1 c2430tw;
        switch (this.f211017a) {
            case 0:
                return new aoq0((fpq0) obj);
            case 1:
                List list = (List) obj;
                t6y0 t6y0Var = (t6y0) list.get(0);
                int i = ((t6y0) list.get(1)).f217650a;
                if (i == 2) {
                    return hpr0.f93834a;
                }
                if (i == 3) {
                    return fpr0.f71965a;
                }
                return (t6y0Var.f217650a == 2 && i == 1) ? ipr0.f104548a : gpr0.f83240a;
            case 2:
            case 6:
            case 9:
            case 15:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 25:
            default:
                MigrationStatusPubsub migrationStatusPubsub = (MigrationStatusPubsub) obj;
                String migrationId = migrationStatusPubsub.getMigrationId();
                int i2 = AbstractC2353rw.f203167a[migrationStatusPubsub.m12169n().ordinal()];
                if (i2 == 1) {
                    c2430tw = C2511vw.f245366c;
                } else if (i2 == 2) {
                    c2430tw = new C2430tw(migrationStatusPubsub.getChildId());
                } else {
                    if (i2 != 3) {
                        throw new IllegalArgumentException("Failed to parse kids-data-migration");
                    }
                    c2430tw = C2473uw.f234532c;
                }
                return new C2316qw(migrationId, c2430tw);
            case 3:
                return new hpt0((Map) obj);
            case 4:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsReachabilityProvider$ReachabilityState.m7587s(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.reachability.esperanto.proto.EsReachabilityProvider.ReachabilityState: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 5:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to fetch Item Specific Recommendations", new Object[0]);
                return lau.f131415a;
            case 7:
                return Boolean.valueOf(((kob) obj).f124749c);
            case 8:
                return new k6x0(obj);
            case 10:
                String str = (String) ((PlayerState) obj).contextMetadata().get("duration");
                Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
            case 11:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 12:
                Boolean bool = (Boolean) ((gv31) obj).f84602a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 13:
                return new g521((hc2) obj);
            case 14:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((Map) obj2);
                }
                ArrayList<Map.Entry> arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((Map) it.next()).entrySet(), arrayList2);
                }
                int iM31820L = c95.m31820L(i6f.m49804T(arrayList2, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Map.Entry entry : arrayList2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                return linkedHashMap;
            case 16:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return FollowResponse.m97970o(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.socialgraph.esperanto.proto.FollowResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 19:
                return new ri71(sh71.f209137a, true);
            case 23:
                return Boolean.valueOf(((g0j) obj).f75382b);
            case 24:
                xxc1 xxc1Var = (xxc1) obj;
                gh00 gh00Var = xxc1Var.f266943a.f54149d;
                if (gh00Var != null) {
                    Double d = xxc1Var.f266946d;
                    gh00Var.invoke(Double.valueOf(d != null ? d.doubleValue() : xxc1Var.f266945c));
                }
                return xxc1Var;
            case 26:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return YourLibraryResponse.m98194s(bArr4);
                } catch (Exception e4) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                }
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new pkd1(mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f211017a) {
            case 2:
                return ((Boolean) obj).booleanValue();
            case 21:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        view.setPadding(dx40VarMo51806g.f53848a, dx40VarMo51806g.f53849b, dx40VarMo51806g.f53850c, dx40VarMo51806g.f53851d);
        return swd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        j131 j131Var = (j131) obj3;
        wj50.m88279p(str);
        wj50.m88279p(str2);
        return new c131(str, str2, (s431) obj4, j131Var.f107633a, j131Var.f107634b);
    }

    public snq0(C2391sw c2391sw) {
        this.f211017a = 29;
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        return !wj50.m88271j(((pd51) obj).f176354b, ((pd51) obj2).f176354b);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f211017a) {
            case 6:
                return new q1y((PlayerState) obj, ((Boolean) obj2).booleanValue());
            default:
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return new hzq0(bool);
                }
                return C2244p5.f174033a;
        }
    }
}
