package p204p;

import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class zkq0 implements Function, BiFunction, Init, tpk, Predicate, wk31, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283833a;

    /* JADX INFO: renamed from: b */
    public static final zkq0 f283824b = new zkq0(0);

    /* JADX INFO: renamed from: c */
    public static final zkq0 f283825c = new zkq0(1);

    /* JADX INFO: renamed from: d */
    public static final zkq0 f283826d = new zkq0(2);

    /* JADX INFO: renamed from: e */
    public static final zkq0 f283827e = new zkq0(3);

    /* JADX INFO: renamed from: f */
    public static final zkq0 f283828f = new zkq0(4);

    /* JADX INFO: renamed from: g */
    public static final zkq0 f283829g = new zkq0(5);

    /* JADX INFO: renamed from: h */
    public static final zkq0 f283830h = new zkq0(6);

    /* JADX INFO: renamed from: i */
    public static final zkq0 f283831i = new zkq0(7);

    /* JADX INFO: renamed from: t */
    public static final zkq0 f283832t = new zkq0(8);

    /* JADX INFO: renamed from: X */
    public static final zkq0 f283817X = new zkq0(9);

    /* JADX INFO: renamed from: Y */
    public static final zkq0 f283819Y = new zkq0(10);

    /* JADX INFO: renamed from: Z */
    public static final zkq0 f283821Z = new zkq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final zkq0 f283805L0 = new zkq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final zkq0 f283806M0 = new zkq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final zkq0 f283807N0 = new zkq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final zkq0 f283808O0 = new zkq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final zkq0 f283809P0 = new zkq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final zkq0 f283810Q0 = new zkq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final zkq0 f283811R0 = new zkq0(19);

    /* JADX INFO: renamed from: S0 */
    public static final zkq0 f283812S0 = new zkq0(20);

    /* JADX INFO: renamed from: T0 */
    public static final zkq0 f283813T0 = new zkq0(21);

    /* JADX INFO: renamed from: U0 */
    public static final zkq0 f283814U0 = new zkq0(22);

    /* JADX INFO: renamed from: V0 */
    public static final zkq0 f283815V0 = new zkq0(23);

    /* JADX INFO: renamed from: W0 */
    public static final zkq0 f283816W0 = new zkq0(24);

    /* JADX INFO: renamed from: X0 */
    public static final zkq0 f283818X0 = new zkq0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final zkq0 f283820Y0 = new zkq0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final zkq0 f283822Z0 = new zkq0(27);

    /* JADX INFO: renamed from: a1 */
    public static final zkq0 f283823a1 = new zkq0(28);

    public /* synthetic */ zkq0(int i) {
        this.f283833a = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m96337a(int i, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w861 w861Var = (w861) it.next();
                v861 v861Var = w861Var instanceof v861 ? (v861) w861Var : null;
                if ((v861Var != null ? v861Var.f238414a : 0) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static flw0 m96338b(t221 t221Var, p221 p221Var) {
        if (p221Var != null) {
            return new flw0(t221Var, p221Var);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f283833a) {
            case 2:
                return kkc0.m56700m0((Map) obj, (Map) obj2);
            case 23:
                return new pqm0((ContextTrack) obj, (q5c1) obj2);
            default:
                return new pqm0(((pqm0) obj).f180351b, Double.valueOf(((Number) obj2).doubleValue()));
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((zpw0) obj);
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new qv61(mec0Var, str2, str);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return Long.valueOf(((p3x0) obj).m69093g());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        xul0 xul0Var = (xul0) obj;
        return xul0Var.mo49279c() && !e72.m37978L((ContextTrack) xul0Var.mo49278b());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleJust;
        int i;
        String strM98241n;
        List listSingletonList;
        switch (this.f283833a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return (gmr0) ((xul0) obj).mo49278b();
            case 2:
            case 7:
            case 9:
            case 10:
            case 13:
            case 17:
            case 19:
            case 23:
            default:
                ae50<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> ae50VarM98196n = ((YourLibraryResponse) obj).m98196n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM98196n, 10));
                for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : ae50VarM98196n) {
                    wj50.m88279p(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity);
                    String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri();
                    String name = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getName();
                    List listSingletonList2 = Collections.singletonList(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().m98274q());
                    long jM98275r = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().m98275r();
                    toe1 toe1VarM98262r = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r();
                    int iM98239i = 0;
                    switch (toe1VarM98262r == null ? -1 : czk0.f43581a[toe1VarM98262r.ordinal()]) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.mo78647e().getUri();
                            i = (!uri2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !uri2.equals("spotify:collection:tracks") && !uri2.equals("spotify:internal:collection:tracks") && (!bm51.m29803n0(uri2, "spotify:user:", false) || !bm51.m29796g0(uri2, ":collection", false))) ? 7 : 5;
                            break;
                        case 6:
                            i = 8;
                            break;
                        default:
                            i = 10;
                            break;
                    }
                    toe1 toe1VarM98262r2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r();
                    int i2 = toe1VarM98262r2 == null ? -1 : czk0.f43581a[toe1VarM98262r2.ordinal()];
                    if (i2 == 1) {
                        strM98241n = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98259n().m98241n();
                    } else if (i2 == 3) {
                        strM98241n = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98260o().m98246o();
                    } else if (i2 == 5) {
                        strM98241n = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98295o();
                    } else if (i2 != 6) {
                        strM98241n = "";
                    } else {
                        strM98241n = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98269y().m98311n();
                    }
                    toe1 toe1VarM98262r3 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r();
                    int i3 = toe1VarM98262r3 == null ? -1 : czk0.f43581a[toe1VarM98262r3.ordinal()];
                    if (i3 == 3) {
                        listSingletonList = Collections.singletonList(azk0.f21638c);
                    } else if (i3 != 6) {
                        listSingletonList = Collections.singletonList(azk0.f21636a);
                    } else {
                        listSingletonList = Collections.singletonList(azk0.f21637b);
                    }
                    List list = listSingletonList;
                    toe1 toe1VarM98262r4 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98262r();
                    if ((toe1VarM98262r4 != null ? czk0.f43581a[toe1VarM98262r4.ordinal()] : -1) == 5) {
                        Iterator<E> it = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98267w().m98304y().iterator();
                        while (it.hasNext()) {
                            iM98239i += ((YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType) it.next()).m98239i();
                        }
                    }
                    arrayList.add(new zyk0(uri, name, listSingletonList2, i, true, strM98241n, (String) null, iM98239i, (bzk0) null, list, jM98275r, 2368));
                }
                return arrayList;
            case 3:
                lcf lcfVar = (lcf) obj;
                if (lcfVar instanceof hcf) {
                    return new fot0(((hcf) lcfVar).f89783a);
                }
                return got0.f83014a;
            case 4:
                return new gau0((fau0) obj);
            case 5:
                p2x0 p2x0Var = (p2x0) obj;
                if (p2x0Var instanceof k2x0) {
                    return Completable.m23286j(new Throwable(((k2x0) p2x0Var).f118699a.mo27977b()));
                }
                if (p2x0Var instanceof m2x0) {
                    return CompletableEmpty.f7437a;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 8:
                return new x5x0(9, (Throwable) obj);
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                Object obj2 = ((gv31) obj).f84602a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 14:
                return new h521((oh2) obj);
            case 15:
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new vx21((t031) it2.next()));
                }
                return Observable.fromIterable(arrayList2);
            case 16:
                return ((Single) ((qua0) obj).f192612a.f122314q.invoke()).map(pmr0.f179203O0).onErrorReturn(ykq0.f273792P0);
            case 18:
                m6b.m60995j("LP pause effect failed: ", ((hcf) ((lcf) obj)).f89783a);
                return w2a1.f247311a;
            case 20:
                p2x0 p2x0Var2 = (p2x0) obj;
                if (p2x0Var2 instanceof k2x0) {
                    j2x0 j2x0Var = ((k2x0) p2x0Var2).f118699a;
                    if (!(j2x0Var instanceof g2x0) && !(j2x0Var instanceof c2x0)) {
                        singleJust = Single.error(new Throwable("Unable to get playlist: " + j2x0Var));
                    } else {
                        singleJust = Single.just(C2244p5.f174033a);
                    }
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                if (p2x0Var2 instanceof m2x0) {
                    return Single.just(xul0.m92201d(((List) ((m2x0) p2x0Var2).f139474a).get(0)));
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                return kv81.f126798a;
            case 22:
                mfs0 mfs0Var = (mfs0) obj;
                return new pqm0(mfs0Var.f143169a, mfs0Var.f143170b);
            case 24:
                return ((PlayerState) obj).playbackQuality();
        }
    }
}
