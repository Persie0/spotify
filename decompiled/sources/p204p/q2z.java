package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mdata.esperanto.proto.ObserveResponse;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.offline.utilcore.LicenseStatusException;
import com.spotify.offline_esperanto.proto.EsOffline$ContextsProgressResponse;
import com.spotify.offline_esperanto.proto.EsOffline$LicenseStatusResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.tome.pageactivity.PageActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes10.dex */
public final class q2z implements Function, Predicate, vja1, BiFunction, kjv0, BiPredicate, Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184758a;

    /* JADX INFO: renamed from: b */
    public static final q2z f184748b = new q2z(0);

    /* JADX INFO: renamed from: c */
    public static final q2z f184750c = new q2z(1);

    /* JADX INFO: renamed from: d */
    public static final q2z f184751d = new q2z(2);

    /* JADX INFO: renamed from: e */
    public static final q2z f184752e = new q2z(3);

    /* JADX INFO: renamed from: f */
    public static final q2z f184753f = new q2z(4);

    /* JADX INFO: renamed from: g */
    public static final q2z f184754g = new q2z(5);

    /* JADX INFO: renamed from: h */
    public static final q2z f184755h = new q2z(6);

    /* JADX INFO: renamed from: i */
    public static final q2z f184756i = new q2z(7);

    /* JADX INFO: renamed from: t */
    public static final q2z f184757t = new q2z(8);

    /* JADX INFO: renamed from: X */
    public static final q2z f184741X = new q2z(9);

    /* JADX INFO: renamed from: Y */
    public static final q2z f184743Y = new q2z(10);

    /* JADX INFO: renamed from: Z */
    public static final q2z f184745Z = new q2z(11);

    /* JADX INFO: renamed from: L0 */
    public static final q2z f184729L0 = new q2z(12);

    /* JADX INFO: renamed from: M0 */
    public static final q2z f184730M0 = new q2z(13);

    /* JADX INFO: renamed from: N0 */
    public static final q2z f184731N0 = new q2z(14);

    /* JADX INFO: renamed from: O0 */
    public static final q2z f184732O0 = new q2z(15);

    /* JADX INFO: renamed from: P0 */
    public static final q2z f184733P0 = new q2z(16);

    /* JADX INFO: renamed from: Q0 */
    public static final q2z f184734Q0 = new q2z(17);

    /* JADX INFO: renamed from: R0 */
    public static final q2z f184735R0 = new q2z(18);

    /* JADX INFO: renamed from: S0 */
    public static final q2z f184736S0 = new q2z(19);

    /* JADX INFO: renamed from: T0 */
    public static final q2z f184737T0 = new q2z(20);

    /* JADX INFO: renamed from: U0 */
    public static final q2z f184738U0 = new q2z(22);

    /* JADX INFO: renamed from: V0 */
    public static final q2z f184739V0 = new q2z(23);

    /* JADX INFO: renamed from: W0 */
    public static final q2z f184740W0 = new q2z(24);

    /* JADX INFO: renamed from: X0 */
    public static final q2z f184742X0 = new q2z(25);

    /* JADX INFO: renamed from: Y0 */
    public static final q2z f184744Y0 = new q2z(26);

    /* JADX INFO: renamed from: Z0 */
    public static final q2z f184746Z0 = new q2z(27);

    /* JADX INFO: renamed from: a1 */
    public static final q2z f184747a1 = new q2z(28);

    /* JADX INFO: renamed from: b1 */
    public static final q2z f184749b1 = new q2z(29);

    public /* synthetic */ q2z(int i) {
        this.f184758a = i;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m72036b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setClassName(context.getApplicationContext(), PageActivity.class.getName());
        intent.setFlags(536870912);
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public int m72037a(int i, int i2) {
        return (i - 1) - i2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws LicenseStatusException {
        switch (this.f184758a) {
            case 0:
                dy31 dy31Var = (dy31) obj;
                List list = dy31Var.f54162b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((sbn0) it.next()).f207528a);
                }
                return new hzq0(new r951(dy31Var.f54161a, arrayList, dy31Var.f54163c, dy31Var.f54164d, dy31Var.f54165e, dy31Var.f54166f, dy31Var.f54167g));
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 21:
            case 23:
            case 24:
            default:
                return (qu80) ((p2x0) obj).m68971d();
            case 4:
                return Observable.empty();
            case 5:
                return (qu80) ((p2x0) obj).m68971d();
            case 6:
                xe60 xe60Var = xe60.f260648d;
                FlowableJust flowableJust = ze60.f281892a;
                double dMin = Math.min(Math.log((((((Double) obj).doubleValue() - 0.0d) / 1.0d) * 0.66d) + 0.0d + 1.0d), 1.0d);
                i641 i641Var = xe60Var.f260649a;
                return new xe60(new i641(ye60.m93527b(dMin, 1.0d)), new i641(ye60.m93527b(dMin, 0.4d)), new i641(ye60.m93527b(dMin, 0.1d)));
            case 7:
                return Integer.valueOf(((gmr0) obj).f81456g);
            case 10:
                return Boolean.valueOf(((qy9) obj).f193853a);
            case 12:
                Float f = (Float) ((gv31) obj).f84602a;
                return Float.valueOf(f != null ? f.floatValue() : 1.0f);
            case 14:
                byte[] bArr = (byte[]) obj;
                try {
                    return ObserveResponse.m13440q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.mdata.esperanto.proto.ObserveResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 17:
                return Boolean.valueOf(((q5c1) obj) instanceof o5c1);
            case 19:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline$ContextsProgressResponse.m16101p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.ContextsProgressResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 20:
                EsOffline$LicenseStatusResponse esOffline$LicenseStatusResponse = (EsOffline$LicenseStatusResponse) obj;
                if (esOffline$LicenseStatusResponse.m16169n() == 0) {
                    return new oa80(esOffline$LicenseStatusResponse.m16171p(), esOffline$LicenseStatusResponse.m16170o());
                }
                throw new LicenseStatusException(edb.m38561j(esOffline$LicenseStatusResponse.m16169n(), "LicenseStatus error: "));
            case 22:
                kjt kjtVar = (kjt) obj;
                Observable observableJust = Observable.just(kjtVar);
                kjtVar.getClass();
                return observableJust.delay(20000L, TimeUnit.MILLISECONDS).map(uty.f234014S0);
            case 25:
                return Boolean.valueOf(((PlayerState) obj).isPaused());
            case 26:
                return (Long) ((xul0) obj).mo49280e(0L);
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new ImmediateWorkRunner();
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        switch (this.f184758a) {
            case 2:
                return new ax00(mec0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("playlist_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str3.charAt(i);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new uup0(str3, mec0Var, str2, str);
                }
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        by50 by50Var = (by50) obj;
        by50 by50Var2 = (by50) obj2;
        return wj50.m88271j(by50Var.f32075a, by50Var2.f32075a) && wj50.m88271j(by50Var.f32078d.f266863a, by50Var2.f32078d.f266863a);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f184758a) {
            case 1:
                return !((Map) obj).isEmpty();
            case 8:
                uvk uvkVar = (uvk) obj;
                return !(uvkVar.f234459a > 0 || uvkVar.f234460b > 0 || uvkVar.f234461c > 0);
            case 9:
                hr90 hr90Var = (hr90) obj;
                return ((hr90Var instanceof tq90) || (hr90Var instanceof uq90)) ? false : true;
            case 11:
                return ((xul0) obj).mo49279c();
            case 23:
                dgd1 dgd1Var = (dgd1) obj;
                return (dgd1Var instanceof bgd1) || (dgd1Var instanceof agd1);
            default:
                return ((PlayerState) obj).track().mo49279c();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f184758a) {
            case 3:
                return new gy10((u4y) obj, ((Number) obj2).intValue());
            case 13:
                return new qqm0((PlayerState) obj, (s431) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
