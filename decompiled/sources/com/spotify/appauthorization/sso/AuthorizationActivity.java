package com.spotify.appauthorization.sso;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.C1666ag;
import p204p.C2185np;
import p204p.ah4;
import p204p.ar7;
import p204p.br7;
import p204p.cec1;
import p204p.ckf1;
import p204p.cr7;
import p204p.dau;
import p204p.dr7;
import p204p.e0b0;
import p204p.e45;
import p204p.e8f;
import p204p.edb;
import p204p.egb1;
import p204p.er7;
import p204p.fh61;
import p204p.fr7;
import p204p.gcu0;
import p204p.h15;
import p204p.i0d;
import p204p.i5z;
import p204p.ic41;
import p204p.ihj0;
import p204p.ip7;
import p204p.iwr;
import p204p.j2r;
import p204p.k0e1;
import p204p.ky51;
import p204p.kyx;
import p204p.mec1;
import p204p.oq7;
import p204p.sso;
import p204p.tey;
import p204p.tm4;
import p204p.tq7;
import p204p.uq7;
import p204p.vq7;
import p204p.wj50;
import p204p.wl51;
import p204p.wq7;
import p204p.wqs;
import p204p.x74;
import p204p.xq7;
import p204p.xul0;
import p204p.yq7;
import p204p.zew;
import p204p.zq7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/appauthorization/sso/AuthorizationActivity;", "Lp/ic41;", "Lp/fr7;", "Lcom/spotify/mobius/Connectable;", "Lp/tq7;", "Lp/oq7;", "<init>", "()V", "src_main_java_com_spotify_appauthorization_sso-sso"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AuthorizationActivity extends ic41 implements fr7, Connectable<tq7, oq7> {

    /* JADX INFO: renamed from: r1 */
    public static final /* synthetic */ int f2956r1 = 0;

    /* JADX INFO: renamed from: d1 */
    public uq7 f2957d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f2958e1;

    /* JADX INFO: renamed from: f1 */
    public vq7 f2959f1;

    /* JADX INFO: renamed from: g1 */
    public final iwr f2960g1 = new iwr();

    /* JADX INFO: renamed from: h1 */
    public String f2961h1 = "";

    /* JADX INFO: renamed from: i1 */
    public MobiusLoop.Controller f2962i1;

    /* JADX INFO: renamed from: j1 */
    public yq7 f2963j1;

    /* JADX INFO: renamed from: k1 */
    public BehaviorSubject f2964k1;

    /* JADX INFO: renamed from: l1 */
    public i5z f2965l1;

    /* JADX INFO: renamed from: m1 */
    public sso f2966m1;

    /* JADX INFO: renamed from: n1 */
    public PublishSubject f2967n1;

    /* JADX INFO: renamed from: o1 */
    public i0d f2968o1;

    /* JADX INFO: renamed from: p1 */
    public e0b0 f2969p1;

    /* JADX INFO: renamed from: q1 */
    public j2r f2970q1;

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new C2185np(this, 9);
    }

    @Override // p204p.cc80, p204p.m500, p204p.cwf, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            if (i == 1337) {
                Logger.m3966b("The Login flow was canceled", new Object[0]);
            }
            m3270u0(new cr7(zew.f282128L0, null, null));
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2958e1 = true;
        super.onAttachedToWindow();
    }

    @Override // p204p.ic41, p204p.cc80, p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        uq7 h15Var;
        fh61 fh61Var = new fh61(0, 0, 2, ky51.f127669X0);
        wqs.m88787a(this, fh61Var, fh61Var);
        super.onCreate(bundle);
        ckf1.m33165n(mo31751N(), this, new ip7(this, 0), 2);
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            sso ssoVar = this.f2966m1;
            if (ssoVar == null) {
                wj50.m88260d0("deepLinkAttributionTrackersController");
                throw null;
            }
            ssoVar.m79221a(null, Uri.parse(callingPackage));
        }
        MobiusLoop.Controller controller = this.f2962i1;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.mo15604c(this);
        Intent intent = getIntent();
        String strM46402o = h15.m46402o(intent);
        int i = 1;
        if ("1".equals(strM46402o)) {
            h15Var = new e45(i);
        } else if ("sonos-v1".equals(strM46402o)) {
            h15Var = new egb1(24);
        } else if ("google-assistant-v1".equals(strM46402o)) {
            h15Var = new x74(i);
        } else if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            h15Var = new tm4(1);
        } else {
            h15Var = (intent.getDataString() == null || !h15.m46404q(intent.getDataString())) ? null : new h15(1);
        }
        if (h15Var == null) {
            Logger.m3966b("The in-app protocol has not been set", new Object[0]);
            if (!isFinishing()) {
                setResult(-2);
                finish();
            }
        } else {
            this.f2957d1 = h15Var;
        }
        BehaviorSubject behaviorSubject = this.f2964k1;
        if (behaviorSubject == null) {
            wj50.m88260d0("authInProgressPublisher");
            throw null;
        }
        behaviorSubject.onNext(new xq7(true));
        try {
            setContentView(R.layout.activity_sdk_sso);
            View viewFindViewById = findViewById(R.id.sso_webview_container);
            e8f e8fVar = e8f.f57184t;
            WeakHashMap weakHashMap = mec1.f142677a;
            cec1.m32550n(viewFindViewById, e8fVar);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                String message = e.getMessage();
                wj50.m88279p(message);
                if (wl51.m88496t0(message.toLowerCase(Locale.ROOT), "webview", false)) {
                    m3270u0(new cr7(zew.f282139h, "The system WebView is not available right now or is being updated. Try again later", ""));
                }
            }
            throw e;
        }
        j2r j2rVar = this.f2970q1;
        if (j2rVar != null) {
            j2rVar.m52232n();
        } else {
            wj50.m88260d0("authorizationLoadingIndicator");
            throw null;
        }
    }

    @Override // p204p.cc80, p204p.r55, p204p.m500, android.app.Activity
    public final void onDestroy() {
        MobiusLoop.Controller controller = this.f2962i1;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.disconnect();
        sso ssoVar = this.f2966m1;
        if (ssoVar == null) {
            wj50.m88260d0("deepLinkAttributionTrackersController");
            throw null;
        }
        ssoVar.f213686b.m23396g();
        BehaviorSubject behaviorSubject = this.f2964k1;
        if (behaviorSubject == null) {
            wj50.m88260d0("authInProgressPublisher");
            throw null;
        }
        behaviorSubject.onNext(new xq7(false));
        j2r j2rVar = this.f2970q1;
        if (j2rVar == null) {
            wj50.m88260d0("authorizationLoadingIndicator");
            throw null;
        }
        ProgressDialog progressDialog = (ProgressDialog) j2rVar.f108129c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2958e1 = false;
        super.onDetachedFromWindow();
    }

    @Override // p204p.cc80, p204p.m500, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2960g1.m51847a();
        MobiusLoop.Controller controller = this.f2962i1;
        if (controller != null) {
            controller.stop();
        } else {
            wj50.m88260d0("controller");
            throw null;
        }
    }

    @Override // p204p.cc80, p204p.m500, android.app.Activity
    public final void onResume() {
        super.onResume();
        MobiusLoop.Controller controller = this.f2962i1;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.start();
        i5z i5zVar = this.f2965l1;
        if (i5zVar == null) {
            wj50.m88260d0("intentToRequestConverter");
            throw null;
        }
        Intent intent = getIntent();
        if (intent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f2960g1.m51848b(k0e1.m54988g(((gcu0) i5zVar.f99059b).m44321c(), dau.f47107a).take(1L).singleOrError().map(new tey(21, i5zVar, intent)).flatMapCompletable(new ihj0(this, 27)).subscribe(ah4.f15611d, new C1666ag(this, 27)));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m3270u0(er7 er7Var) {
        PublishSubject publishSubject = this.f2967n1;
        if (publishSubject == null) {
            wj50.m88260d0("authResultPublisher");
            throw null;
        }
        if (publishSubject.mo23797a()) {
            PublishSubject publishSubject2 = this.f2967n1;
            if (publishSubject2 == null) {
                wj50.m88260d0("authResultPublisher");
                throw null;
            }
            publishSubject2.onNext(new wq7(this.f2959f1, er7Var));
        }
        if (er7Var instanceof zq7) {
            zq7 zq7Var = (zq7) er7Var;
            uq7 uq7Var = this.f2957d1;
            if (uq7Var == null) {
                wj50.m88260d0(kyx.f127934e);
                throw null;
            }
            Bundle bundleMo37749d = uq7Var.mo37749d(zq7Var.f285319a, zq7Var.f285322d, zq7Var.f285321c, zq7Var.f285320b);
            if (isFinishing()) {
                return;
            }
            i0d i0dVar = this.f2968o1;
            if (i0dVar == null) {
                wj50.m88260d0("clientAuthLogger");
                throw null;
            }
            String callingPackage = getCallingPackage();
            i0dVar.m49367l(callingPackage != null ? callingPackage : "unknown_package_name");
            uq7 uq7Var2 = this.f2957d1;
            if (uq7Var2 == null) {
                wj50.m88260d0(kyx.f127934e);
                throw null;
            }
            setResult(-1, uq7Var2.mo37752j(bundleMo37749d));
            finish();
            return;
        }
        if (!(er7Var instanceof ar7)) {
            if (er7Var instanceof br7) {
                m3271v0(zew.f282141t, null, null);
                return;
            }
            if (er7Var instanceof cr7) {
                cr7 cr7Var = (cr7) er7Var;
                m3271v0(cr7Var.f41196a, cr7Var.f41197b, cr7Var.f41198c);
                return;
            } else {
                if (!(er7Var instanceof dr7)) {
                    throw new NoWhenBranchMatchedException();
                }
                m3271v0(zew.f282132Y, null, ((dr7) er7Var).f52182b);
                return;
            }
        }
        ar7 ar7Var = (ar7) er7Var;
        uq7 uq7Var3 = this.f2957d1;
        if (uq7Var3 == null) {
            wj50.m88260d0(kyx.f127934e);
            throw null;
        }
        Bundle bundleMo37751i = uq7Var3.mo37751i(ar7Var.f18966a, ar7Var.f18968c, ar7Var.f18967b);
        if (isFinishing()) {
            return;
        }
        i0d i0dVar2 = this.f2968o1;
        if (i0dVar2 == null) {
            wj50.m88260d0("clientAuthLogger");
            throw null;
        }
        String callingPackage2 = getCallingPackage();
        i0dVar2.m49367l(callingPackage2 != null ? callingPackage2 : "unknown_package_name");
        uq7 uq7Var4 = this.f2957d1;
        if (uq7Var4 == null) {
            wj50.m88260d0(kyx.f127934e);
            throw null;
        }
        xul0 xul0VarMo37748c = uq7Var4.mo37748c(Uri.parse(this.f2961h1), ar7Var);
        if (xul0VarMo37748c.mo49279c() && this.f2961h1.length() > 0) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", (Uri) xul0VarMo37748c.mo49278b()));
            } catch (ActivityNotFoundException e) {
                Logger.m3966b(edb.m38564m("Failed to launch browser: ", e.getMessage()), new Object[0]);
            }
        }
        uq7 uq7Var5 = this.f2957d1;
        if (uq7Var5 == null) {
            wj50.m88260d0(kyx.f127934e);
            throw null;
        }
        setResult(-1, uq7Var5.mo37752j(bundleMo37751i));
        finish();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3271v0(zew zewVar, String str, String str2) {
        if (isFinishing()) {
            return;
        }
        Logger.m3966b(zewVar.f282142a, new Object[0]);
        i0d i0dVar = this.f2968o1;
        if (i0dVar == null) {
            wj50.m88260d0("clientAuthLogger");
            throw null;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            callingPackage = "unknown_package_name";
        }
        i0dVar.m49365j(callingPackage, zewVar.f282142a + ": " + str);
        uq7 uq7Var = this.f2957d1;
        if (uq7Var == null) {
            wj50.m88260d0(kyx.f127934e);
            throw null;
        }
        xul0 xul0VarMo37753m = uq7Var.mo37753m(Uri.parse(this.f2961h1), zewVar, str);
        if (xul0VarMo37753m.mo49279c() && this.f2961h1.length() > 0) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", (Uri) xul0VarMo37753m.mo49278b()));
            } catch (ActivityNotFoundException e) {
                Logger.m3966b(edb.m38564m("Failed to launch browser: ", e.getMessage()), new Object[0]);
            }
        }
        int i = zewVar != zew.f282128L0 ? -2 : 0;
        uq7 uq7Var2 = this.f2957d1;
        if (uq7Var2 == null) {
            wj50.m88260d0(kyx.f127934e);
            throw null;
        }
        setResult(i, uq7Var2.mo37750g(zewVar, str, str2));
        finish();
    }
}
