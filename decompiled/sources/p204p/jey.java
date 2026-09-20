package p204p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.http.ExternalIntegrationBackendResponseModel;
import com.spotify.externalintegration.http.ExternalIntegrationSectionContentModel;
import com.spotify.kidsgraduation.p088v1.GetPrivacyPolicyAcceptanceResponse;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline$HasResourceResponse;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.tap.playback.TapPlaybackException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class jey implements Function, BiFunction, yh00, Predicate, vja1 {

    /* JADX INFO: renamed from: b */
    public static final jey f111736b;

    /* JADX INFO: renamed from: c */
    public static final jey f111738c;

    /* JADX INFO: renamed from: d */
    public static final jey f111740d;

    /* JADX INFO: renamed from: e */
    public static final jey f111742e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111749a;

    /* JADX INFO: renamed from: f */
    public static final tiv0 f111744f = new tiv0(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: g */
    public static final jey f111745g = new jey(2);

    /* JADX INFO: renamed from: h */
    public static final jey f111746h = new jey(3);

    /* JADX INFO: renamed from: i */
    public static final jey f111747i = new jey(4);

    /* JADX INFO: renamed from: t */
    public static final jey f111748t = new jey(5);

    /* JADX INFO: renamed from: X */
    public static final jey f111729X = new jey(7);

    /* JADX INFO: renamed from: Y */
    public static final jey f111731Y = new jey(8);

    /* JADX INFO: renamed from: Z */
    public static final jey f111733Z = new jey(9);

    /* JADX INFO: renamed from: L0 */
    public static final jey f111717L0 = new jey(10);

    /* JADX INFO: renamed from: M0 */
    public static final jey f111718M0 = new jey(11);

    /* JADX INFO: renamed from: N0 */
    public static final jey f111719N0 = new jey(12);

    /* JADX INFO: renamed from: O0 */
    public static final jey f111720O0 = new jey(13);

    /* JADX INFO: renamed from: P0 */
    public static final jey f111721P0 = new jey(14);

    /* JADX INFO: renamed from: Q0 */
    public static final jey f111722Q0 = new jey(15);

    /* JADX INFO: renamed from: R0 */
    public static final jey f111723R0 = new jey(16);

    /* JADX INFO: renamed from: S0 */
    public static final jey f111724S0 = new jey(17);

    /* JADX INFO: renamed from: T0 */
    public static final jey f111725T0 = new jey(18);

    /* JADX INFO: renamed from: U0 */
    public static final jey f111726U0 = new jey(19);

    /* JADX INFO: renamed from: V0 */
    public static final jey f111727V0 = new jey(20);

    /* JADX INFO: renamed from: W0 */
    public static final jey f111728W0 = new jey(21);

    /* JADX INFO: renamed from: X0 */
    public static final jey f111730X0 = new jey(22);

    /* JADX INFO: renamed from: Y0 */
    public static final jey f111732Y0 = new jey(23);

    /* JADX INFO: renamed from: Z0 */
    public static final jey f111734Z0 = new jey(24);

    /* JADX INFO: renamed from: a1 */
    public static final jey f111735a1 = new jey(25);

    /* JADX INFO: renamed from: b1 */
    public static final jey f111737b1 = new jey(26);

    /* JADX INFO: renamed from: c1 */
    public static final jey f111739c1 = new jey(27);

    /* JADX INFO: renamed from: d1 */
    public static final jey f111741d1 = new jey(28);

    /* JADX INFO: renamed from: e1 */
    public static final jey f111743e1 = new jey(29);

    static {
        int i = 0;
        f111736b = new jey(i);
        f111738c = new jey(i);
        f111740d = new jey(i);
        f111742e = new jey(i);
    }

    public /* synthetic */ jey(int i) {
        this.f111749a = i;
    }

    /* JADX INFO: renamed from: a */
    public static C2300qn m53131a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C2300qn(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public static Next m53132b(ga60 ga60Var, ca60 ca60Var) {
        oc8 oc8Var;
        h2a1 h2a1Var;
        ddy0 ddy0Var;
        String str;
        Object obj = null;
        r960Var = null;
        r960 r960Var = null;
        oc8Var = null;
        oc8Var = null;
        oc8 oc8Var2 = null;
        if (ca60Var instanceof z960) {
            ga60 ga60VarM44147a = ga60.m44147a(ga60Var, ddy0.m35758a(ga60Var.f77982a, ((z960) ca60Var).f280671a, false, null, null, 30), null, 6);
            return Next.m15607i(ga60VarM44147a, yjg1.m93915g(ga60VarM44147a));
        }
        if (ca60Var instanceof w960) {
            ga60 ga60VarM44147a2 = ga60.m44147a(ga60Var, ddy0.m35758a(ga60Var.f77982a, false, false, ((w960) ca60Var).f249090a, null, 23), null, 6);
            Set setM43734m1 = g6f.m43734m1(yjg1.m93915g(ga60VarM44147a2));
            if (yjg1.m93912d(ga60Var, ga60VarM44147a2)) {
                ddy0 ddy0Var2 = ga60VarM44147a2.f77982a;
                String str2 = ddy0Var2.f47917d;
                r960 r960Var2 = str2 != null ? new r960(str2, ddy0Var2.f47918e) : null;
                if (r960Var2 != null) {
                    setM43734m1.add(r960Var2);
                }
            }
            return Next.m15607i(ga60VarM44147a2, setM43734m1);
        }
        if (ca60Var instanceof aa60) {
            ga60 ga60VarM44147a3 = ga60.m44147a(ga60Var, null, ((aa60) ca60Var).f13770a, 5);
            if (yjg1.m93912d(ga60Var, ga60VarM44147a3) && (str = (ddy0Var = ga60VarM44147a3.f77982a).f47917d) != null) {
                r960Var = new r960(str, ddy0Var.f47918e);
            }
            return r960Var != null ? Next.m15607i(ga60VarM44147a3, Collections.singleton(r960Var)) : Next.m15606h(ga60VarM44147a3);
        }
        if (!(ca60Var instanceof x960)) {
            if (ca60Var instanceof y960) {
                ga60 ga60VarM44147a4 = ga60.m44147a(ga60Var, ddy0.m35758a(ga60Var.f77982a, false, ((y960) ca60Var).f270517a, null, null, 29), null, 6);
                return Next.m15607i(ga60VarM44147a4, yjg1.m93915g(ga60VarM44147a4));
            }
            if (ca60Var instanceof ba60) {
                return Next.m15606h(ga60.m44147a(ga60Var, ddy0.m35758a(ga60Var.f77982a, false, false, null, ((ba60) ca60Var).f25097a, 15), null, 6));
            }
            throw new NoWhenBranchMatchedException();
        }
        yc8 yc8Var = ((x960) ca60Var).f259283a;
        boolean z = ga60Var.f77984c;
        Set set = ga60Var.f77983b;
        if (z) {
            int iOrdinal = yc8Var.f271425b.f79568b.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                h2a1Var = h2a1.JAM_CLOSE;
            } else if (iOrdinal == 2) {
                h2a1Var = h2a1.JAM_FAR;
            } else if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mc8 mc8Var = new mc8(h2a1Var);
            if (set.contains(mc8Var)) {
                oc8Var2 = mc8Var;
            }
        } else {
            int iOrdinal2 = yc8Var.f271425b.f79568b.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                oc8Var = r860.f196719b.f196723a;
            } else if (iOrdinal2 == 2) {
                oc8Var = r860.f196720c.f196723a;
            } else if (iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashSet linkedHashSetM43750v0 = g6f.m43750v0(set, yc8Var.f271427d);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : linkedHashSetM43750v0) {
                if (obj2 instanceof nc8) {
                    arrayList.add(obj2);
                }
            }
            for (Object obj3 : arrayList) {
                if (wj50.m88271j((nc8) obj3, oc8Var)) {
                    obj = obj3;
                    break;
                }
            }
            oc8Var2 = (nc8) obj;
        }
        String str3 = ga60Var.f77982a.f47917d;
        if (str3 == null) {
            return Next.m15608j();
        }
        return oc8Var2 == null ? Next.m15608j() : Next.m15605a(Collections.singleton(new t960(yc8Var.f271424a, oc8Var2, str3)));
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f111749a) {
            case 4:
                return new pqm0((tny0) obj, (pqm0) obj2);
            default:
                return new pqm0((hdk0) obj, (fuh0) obj2);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("playlist_id");
        if (str4 != null && igg1.m50543v(str4) && (str3 = (String) linkedHashMap.get("track_id")) != null && igg1.m50543v(str3)) {
            return new evp0(str4, str3, mec0Var, str2, str);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f111749a) {
            case 13:
                return ((xul0) obj).mo49279c();
            case 16:
                return ((xul0) obj).mo49279c();
            case 24:
                Throwable th = (Throwable) obj;
                if (th instanceof TapPlaybackException) {
                    Logger.m3967c(th, "Go: Playback failed", new Object[0]);
                    return true;
                }
                Logger.m3967c(th, "Go: Error occurred while trying to play music", new Object[0]);
                return true;
            default:
                return ((PlayerState) obj).track().mo49279c();
        }
    }

    public String toString() {
        switch (this.f111749a) {
            case 0:
                if (equals(f111736b)) {
                    return "FULLSTACK";
                }
                if (equals(f111738c)) {
                    return "OPEN_XR";
                }
                if (equals(f111740d)) {
                    return "SPATIAL";
                }
                return equals(f111742e) ? "PROJECTED" : "UNKNOWN";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        lt10 lt10Var;
        pyx pyxVar;
        oyx oyxVar;
        ExternalIntegrationSectionContentModel externalIntegrationSectionContentModel;
        String str;
        switch (this.f111749a) {
            case 2:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 3:
            case 4:
            case 6:
            case 13:
            case 15:
            case 16:
            case 24:
            case 25:
            default:
                w46 w46Var = (w46) g6f.m43745s0((List) obj);
                if (w46Var != null) {
                    return w46Var;
                }
                wzk wzkVar = new wzk();
                lau lauVar = lau.f131415a;
                return new w46("", "", wzkVar, lauVar, lauVar, lauVar, lauVar);
            case 5:
                Long l = (Long) ((xul0) obj).mo49283h();
                return Long.valueOf(l != null ? l.longValue() : 0L);
            case 7:
                GetPrivacyPolicyAcceptanceResponse getPrivacyPolicyAcceptanceResponse = (GetPrivacyPolicyAcceptanceResponse) obj;
                int i = j570.f108895a[getPrivacyPolicyAcceptanceResponse.m12217o().ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        lt10Var = ht10.f94894a;
                    } else if (i == 2) {
                        lt10Var = it10.f105391a;
                    } else if (i == 3) {
                        lt10Var = jt10.f115685a;
                    } else if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new yfr0(lt10Var, getPrivacyPolicyAcceptanceResponse.m12216n());
                }
                throw new IllegalArgumentException("Unsupported privacy policy type");
            case 8:
                return new ga80(to50.f222185a, (Boolean) obj);
            case 9:
                return ((jn90) obj).f114046a;
            case 10:
                return Observable.empty();
            case 11:
                return Boolean.valueOf(((pe01) obj).f176590g == 5);
            case 12:
                ucb0 ucb0Var = (ucb0) obj;
                List<hcb0> list = ucb0Var.f228991b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (hcb0 hcb0Var : list) {
                    long j = hcb0Var.f89746a;
                    String str2 = hcb0Var.f89747b;
                    List<ncb0> list2 = hcb0Var.f89748c;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    for (ncb0 ncb0Var : list2) {
                        arrayList2.add(new tab0(ncb0Var.f152487a, ncb0Var.f152488b));
                    }
                    arrayList.add(new rab0(j, str2, arrayList2));
                }
                int iM38547C = edb.m38547C(ucb0Var.f228992c);
                int i2 = 1;
                if (iM38547C != 0) {
                    if (iM38547C == 1) {
                        i2 = 2;
                    } else {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 3;
                    }
                }
                boolean z = ucb0Var.f228995f;
                String str3 = ucb0Var.f228994e;
                List<qcb0> list3 = ucb0Var.f228993d;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list3, 10));
                for (qcb0 qcb0Var : list3) {
                    arrayList3.add(new uab0(qcb0Var.f187294a, qcb0Var.f187295b, qcb0Var.f187296c));
                }
                kcb0 kcb0Var = ucb0Var.f228996g;
                sab0 sab0Var = new sab0(kcb0Var.f121421a, kcb0Var.f121422b, kcb0Var.f121423c);
                ecb0 ecb0Var = ucb0Var.f228997h;
                int i3 = ecb0Var.f58300a;
                int i4 = ecb0Var.f58301b;
                int i5 = ecb0Var.f58302c;
                return new s7f(arrayList, i2, arrayList3, str3, z, sab0Var, new vab0(ucb0Var.f228998i.f219061a), 0, new sbb0(i3, i3, i5, i4, i5, false), 384);
            case 14:
                return Observable.empty();
            case 17:
                PlayerState playerState = (PlayerState) obj;
                return bk5.m29582E0(new ContextTrack[]{g6f.m43689C0(playerState.prevTracks()), playerState.track().mo49283h(), g6f.m43745s0(playerState.nextTracks())});
            case 18:
                return Collections.singletonList((ContextTrack) obj);
            case 19:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline$HasResourceResponse.m16163o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.HasResourceResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 20:
                return Boolean.valueOf(((EsOffline$Progress) obj).m16198C());
            case 21:
                List list4 = (List) obj;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList4.add(lfg1.m58874C((axx) it.next()));
                }
                return arrayList4;
            case 22:
                Throwable th = (Throwable) obj;
                if ((th instanceof HttpException) && ((HttpException) th).f288164a < 500) {
                    return Single.just(new s6x0(new c6x0(th)));
                }
                return Single.error(th);
            case 23:
                o2x0 o2x0Var = (o2x0) obj;
                n2x0 n2x0Var = o2x0Var.f161171a;
                int i6 = n2x0Var.m63571a().f22998c;
                long jCurrentTimeMillis = (System.currentTimeMillis() - n2x0Var.f149856Z) / ((long) 1000);
                if (n2x0Var.f149865i != null) {
                    pyxVar = pyx.f183536c;
                } else {
                    pyxVar = (n2x0Var.f149866t == null || jCurrentTimeMillis > ((long) i6)) ? pyx.f183534a : pyx.f183535b;
                }
                ExternalIntegrationBackendResponseModel externalIntegrationBackendResponseModel = (ExternalIntegrationBackendResponseModel) o2x0Var.f161172b;
                String str4 = null;
                if (externalIntegrationBackendResponseModel != null) {
                    List list5 = externalIntegrationBackendResponseModel.sectionContent;
                    ExternalIntegrationSectionContentModel externalIntegrationSectionContentModel2 = (ExternalIntegrationSectionContentModel) g6f.m43745s0(list5);
                    oyxVar = new oyx(list5, pyxVar, externalIntegrationSectionContentModel2 != null ? externalIntegrationSectionContentModel2.responseId : null);
                } else {
                    if (externalIntegrationBackendResponseModel != null && (externalIntegrationSectionContentModel = (ExternalIntegrationSectionContentModel) g6f.m43745s0(externalIntegrationBackendResponseModel.sectionContent)) != null) {
                        str4 = externalIntegrationSectionContentModel.responseId;
                    }
                    oyxVar = new oyx(lau.f131415a, pyxVar, str4);
                }
                return oyxVar;
            case 26:
                PlayerState playerState2 = (PlayerState) obj;
                return Boolean.valueOf(playerState2.isPlaying() && !playerState2.isPaused());
            case 27:
                ybv ybvVar = ((qu80) obj).f192599e;
                String str5 = ybvVar.f271257b;
                String strM84311c = ybvVar.f271259d.m84311c(1);
                qla1 qla1Var = ybvVar.f271260e;
                if (qla1Var == null || (str = qla1Var.f189804c) == null) {
                    str = "";
                }
                return new mmv(str5, strM84311c, 5, str);
        }
    }
}
