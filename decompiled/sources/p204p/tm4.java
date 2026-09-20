package p204p;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.settings.esperanto.proto.SettingsOuterClass$SettingsState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tm4 implements uq7, rzu0, vd50, qja1, yh00, InterfaceC2207oa, Function, wb71 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221597a;

    public /* synthetic */ tm4(int i) {
        this.f221597a = i;
    }

    /* JADX INFO: renamed from: A */
    public static l3u0 m81084A(pqm0[] pqm0VarArr, long j, float f, int i) {
        if ((i & 2) != 0) {
            j = 9205357640488583168L;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        float f2 = f;
        ArrayList arrayList = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var : pqm0VarArr) {
            arrayList.add(new n6f(((n6f) pqm0Var.f180351b).f150873a));
        }
        ArrayList arrayList2 = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var2 : pqm0VarArr) {
            arrayList2.add(Float.valueOf(((Number) pqm0Var2.f180350a).floatValue()));
        }
        return new l3u0(arrayList, arrayList2, j2, f2, 0);
    }

    /* JADX INFO: renamed from: C */
    public static uc61 m81085C(pqm0[] pqm0VarArr) {
        ArrayList arrayList = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var : pqm0VarArr) {
            arrayList.add(new n6f(((n6f) pqm0Var.f180351b).f150873a));
        }
        ArrayList arrayList2 = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var2 : pqm0VarArr) {
            arrayList2.add(Float.valueOf(((Number) pqm0Var2.f180350a).floatValue()));
        }
        return new uc61(9205357640488583168L, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: D */
    public static xk80 m81086D(List list, float f, float f2, int i) {
        return new xk80(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L), list, null);
    }

    /* JADX INFO: renamed from: E */
    public static xk80 m81087E(pqm0[] pqm0VarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return m81095s((pqm0[]) Arrays.copyOf(pqm0VarArr, pqm0VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: b */
    public static final void m81088b(View view) {
        float refreshRate;
        if (um4.f231714h == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            um4.f231714h = (long) (1000000000 / refreshRate);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81089e(String str, int i) {
        k0e1.m54990i(str, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m81090h(String str, int i) {
        k0e1.m54998r(str, i);
    }

    /* JADX INFO: renamed from: k */
    public static kpp m81091k(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(Request.GET);
        httpURLConnection.connect();
        return new kpp(httpURLConnection);
    }

    /* JADX INFO: renamed from: p */
    public static xk80 m81092p(List list, float f, float f2, int i) {
        return new xk80(0, (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), list, null);
    }

    /* JADX INFO: renamed from: q */
    public static xk80 m81093q(pqm0[] pqm0VarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return m81095s((pqm0[]) Arrays.copyOf(pqm0VarArr, pqm0VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m81094r() {
        return k0e1.m54969D();
    }

    /* JADX INFO: renamed from: s */
    public static xk80 m81095s(pqm0[] pqm0VarArr, long j, long j2, int i) {
        ArrayList arrayList = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var : pqm0VarArr) {
            arrayList.add(new n6f(((n6f) pqm0Var.f180351b).f150873a));
        }
        ArrayList arrayList2 = new ArrayList(pqm0VarArr.length);
        for (pqm0 pqm0Var2 : pqm0VarArr) {
            arrayList2.add(Float.valueOf(((Number) pqm0Var2.f180350a).floatValue()));
        }
        return new xk80(i, j, j2, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: t */
    public static xk80 m81096t(long j, long j2, List list) {
        return new xk80(0, j, j2, list, null);
    }

    /* JADX INFO: renamed from: u */
    public static q1j0 m81097u(Intent intent) {
        return new q1j0(intent);
    }

    /* JADX INFO: renamed from: v */
    public static r1j0 m81098v(dd41 dd41Var) {
        return new r1j0(dd41Var);
    }

    /* JADX INFO: renamed from: w */
    public static t1j0 m81099w(tme1 tme1Var) {
        return new t1j0(tme1Var);
    }

    /* JADX INFO: renamed from: x */
    public static u1j0 m81100x(Class cls, Parcelable parcelable, zzq0 zzq0Var) {
        return new u1j0(cls, parcelable, zzq0Var);
    }

    /* JADX INFO: renamed from: y */
    public static u1j0 m81101y(Class cls, Parcelable parcelable) {
        return new u1j0(cls, parcelable, uzq0.f235620a);
    }

    /* JADX INFO: renamed from: z */
    public static l3u0 m81102z(List list, long j, float f, int i) {
        if ((i & 2) != 0) {
            j = 9205357640488583168L;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        return new l3u0(list, null, j2, f, 0);
    }

    @Override // p204p.wb71
    /* JADX INFO: renamed from: a */
    public float mo81103a(StringBuilder sb) {
        return 0.0f;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f221597a) {
            case 20:
                return !((ihi) obj).f102295b;
            default:
                return ((ihi) obj).f102296c == u300.RECOMMENDED_MUSIC_VIDEOS;
        }
    }

    @Override // p204p.yh00
    public Object apply(Object obj) {
        switch (this.f221597a) {
            case 17:
                return pae0.f175512h.get(obj);
            case 24:
                SettingsOuterClass$SettingsState settingsOuterClass$SettingsState = (SettingsOuterClass$SettingsState) obj;
                return new pe01(settingsOuterClass$SettingsState.m20951C(), settingsOuterClass$SettingsState.m20954F(), settingsOuterClass$SettingsState.m20955G(), settingsOuterClass$SettingsState.m20966u(), settingsOuterClass$SettingsState.m20968w(), settingsOuterClass$SettingsState.m20958J(), settingsOuterClass$SettingsState.m20957I(), settingsOuterClass$SettingsState.m20960o(), settingsOuterClass$SettingsState.m20970y(), settingsOuterClass$SettingsState.m20961p(), settingsOuterClass$SettingsState.m20950B(), settingsOuterClass$SettingsState.m20949A(), settingsOuterClass$SettingsState.m20962q(), settingsOuterClass$SettingsState.m20963r(), settingsOuterClass$SettingsState.m20956H(), settingsOuterClass$SettingsState.m20971z(), settingsOuterClass$SettingsState.m20959K(), settingsOuterClass$SettingsState.m20967v(), settingsOuterClass$SettingsState.m20969x(), settingsOuterClass$SettingsState.m20952D(), settingsOuterClass$SettingsState.m20953E(), settingsOuterClass$SettingsState.m20964s(), settingsOuterClass$SettingsState.m20965t());
            case 25:
                return Observable.just(((sy21) obj).f215111a);
            default:
                PlayerState playerState = (PlayerState) obj;
                String strContextUri = playerState.contextUri();
                String strUri = playerState.track().mo49279c() ? ((ContextTrack) playerState.track().mo49278b()).uri() : "";
                wj50.m88279p(strUri);
                return new gx21(strContextUri, strUri, playerState.track().mo49279c() ? e72.m37976J((ContextTrack) playerState.track().mo49278b()) : false);
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: c */
    public xul0 mo37748c(Uri uri, ar7 ar7Var) {
        return C2244p5.f174033a;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        knn0 knn0VarM56948a = knn0.m56948a(i);
        return knn0VarM56948a == null ? knn0.UNKNOWN : knn0VarM56948a;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: d */
    public Bundle mo37749d(String str, String str2, int i, String str3) {
        Logger.m3966b("Google V1 doesn't support token response type", new Object[0]);
        throw new UnsupportedOperationException("Google Home V1 doesn't support token response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r9 == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.vaz] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m81104f(vaz vazVar, ibk ibkVar) {
        p050 p050Var;
        ?? r9;
        String str;
        if (ibkVar instanceof p050) {
            p050Var = (p050) ibkVar;
            int i = p050Var.f172497d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p050Var.f172497d = i - Integer.MIN_VALUE;
            } else {
                p050Var = new p050(this, ibkVar);
            }
        } else {
            p050Var = new p050(this, ibkVar);
        }
        Object objM88273k = p050Var.f172495b;
        int i2 = p050Var.f172497d;
        String str2 = "";
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        vaz vazVar2 = (vaz) p050Var.f172494a;
                        bga.m29073P(objM88273k);
                        vazVar = vazVar2;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = (String) p050Var.f172494a;
                        bga.m29073P(objM88273k);
                        vazVar = str3;
                    }
                    str2 = (String) objM88273k;
                    return new q050(str2, vazVar);
                }
                bga.m29073P(objM88273k);
                uaz uazVar = (uaz) vazVar;
                y7h1 y7h1VarM82703d = uazVar.m82703d();
                try {
                    p050Var.f172494a = uazVar;
                    p050Var.f172497d = 1;
                    Object objM88273k2 = wj50.m88273k(y7h1VarM82703d, p050Var);
                    if (objM88273k2 != yukVar) {
                        objM88273k = objM88273k2;
                        vazVar = uazVar;
                    }
                } catch (Exception unused) {
                    vazVar = uazVar;
                    r9 = vazVar;
                    str = "";
                }
                return yukVar;
                String str4 = ((f18) objM88273k).f64811a;
                r9 = vazVar;
                str = str4;
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
        }
        y7h1 y7h1VarM82702c = ((uaz) r9).m82702c();
        p050Var.f172494a = str;
        p050Var.f172497d = 2;
        objM88273k = wj50.m88273k(y7h1VarM82702c, p050Var);
        vazVar = str;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: g */
    public Intent mo37750g(zew zewVar, String str, String str2) {
        Intent intent = new Intent();
        int i = zewVar.f282143b;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    throw null;
                }
            }
        }
        intent.putExtra("ERROR_TYPE", i2);
        intent.putExtra("ERROR_CODE", zewVar.ordinal());
        intent.putExtra("ERROR_DESCRIPTION", str);
        return intent;
    }

    @Override // p204p.rzu0
    public gd70 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: i */
    public Bundle mo37751i(String str, String str2, String str3) {
        Bundle bundleM93449h = ydj.m93449h("AUTHORIZATION_CODE", str, "STATE", str2);
        bundleM93449h.putString("REDIRECT_URI", str3);
        return bundleM93449h;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: j */
    public Intent mo37752j(Bundle bundle) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtra("AUTHORIZATION_CODE", bundle.getString("AUTHORIZATION_CODE"));
        }
        return intent;
    }

    @Override // p204p.qja1
    /* JADX INFO: renamed from: l */
    public boolean mo27923l(Uri uri) {
        String host = uri.getHost();
        if (host != null && (bm51.m29796g0(host, ".spotify.com", false) || host.equals("spotify.com"))) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.contains("logout") || pathSegments.contains("revoke_sessions") || pathSegments.contains("sign-out-everywhere")) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: m */
    public xul0 mo37753m(Uri uri, zew zewVar, String str) {
        return C2244p5.f174033a;
    }

    /* JADX INFO: renamed from: n */
    public z9t m81105n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new z9t(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void mo66572o(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public /* synthetic */ tm4(Object obj, int i) {
        this.f221597a = i;
    }

    public /* synthetic */ tm4(boolean z, int i) {
        this.f221597a = i;
    }

    /* JADX INFO: renamed from: B */
    public void mo64034B(maq0 maq0Var, int i, int i2) {
    }
}
