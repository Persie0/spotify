package com.spotify.music;

import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import p204p.a600;
import p204p.ae00;
import p204p.b5y0;
import p204p.bnm0;
import p204p.bsa;
import p204p.bxi;
import p204p.c700;
import p204p.ccf0;
import p204p.cdi0;
import p204p.cdv;
import p204p.d050;
import p204p.dm11;
import p204p.ekx0;
import p204p.elq;
import p204p.er70;
import p204p.f050;
import p204p.f700;
import p204p.fb41;
import p204p.fh61;
import p204p.fxi;
import p204p.guo;
import p204p.h7m;
import p204p.hvb0;
import p204p.i7j0;
import p204p.ic41;
import p204p.jfm0;
import p204p.kin0;
import p204p.l5j0;
import p204p.ld41;
import p204p.ly11;
import p204p.m8j0;
import p204p.m9y0;
import p204p.md41;
import p204p.n9y0;
import p204p.na6;
import p204p.nun0;
import p204p.nzy0;
import p204p.o4n0;
import p204p.o700;
import p204p.o7m;
import p204p.oc41;
import p204p.ofm0;
import p204p.opo;
import p204p.ox91;
import p204p.oxe;
import p204p.ozy0;
import p204p.p3h1;
import p204p.p4l0;
import p204p.p69;
import p204p.p700;
import p204p.pvd1;
import p204p.pw71;
import p204p.qre0;
import p204p.qwn;
import p204p.qxe;
import p204p.rb5;
import p204p.rr4;
import p204p.s301;
import p204p.so3;
import p204p.sr4;
import p204p.sso;
import p204p.v7z0;
import p204p.vei0;
import p204p.vg0;
import p204p.w221;
import p204p.wg61;
import p204p.wj50;
import p204p.wqs;
import p204p.wub0;
import p204p.wvl0;
import p204p.x7l0;
import p204p.xy3;
import p204p.y23;
import p204p.yic1;
import p204p.yqa0;
import p204p.zy5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/music/SpotifyMainActivity;", "Lp/oc41;", "Lp/cdi0;", "Lp/p700;", "Lp/ofm0;", "Lp/ox91;", "Lp/yqa0;", "Lp/o700;", "Lp/pvd1;", "<init>", "()V", "src_main_java_com_spotify_app_music_main-main"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SpotifyMainActivity extends ic41 implements oc41, cdi0, p700, ofm0, ox91, yqa0, o700, pvd1, wvl0 {

    /* JADX INFO: renamed from: A1 */
    public bnm0 f6046A1;

    /* JADX INFO: renamed from: B1 */
    public md41 f6047B1;

    /* JADX INFO: renamed from: C1 */
    public b5y0 f6048C1;

    /* JADX INFO: renamed from: f1 */
    public cdv f6057f1;

    /* JADX INFO: renamed from: g1 */
    public i7j0 f6058g1;

    /* JADX INFO: renamed from: h1 */
    public o7m f6059h1;

    /* JADX INFO: renamed from: i1 */
    public er70 f6060i1;

    /* JADX INFO: renamed from: j1 */
    public er70 f6061j1;

    /* JADX INFO: renamed from: k1 */
    public er70 f6062k1;

    /* JADX INFO: renamed from: l1 */
    public er70 f6063l1;

    /* JADX INFO: renamed from: m1 */
    public ekx0 f6064m1;

    /* JADX INFO: renamed from: n1 */
    public s301 f6065n1;

    /* JADX INFO: renamed from: o1 */
    public vg0 f6066o1;

    /* JADX INFO: renamed from: p1 */
    public m8j0 f6067p1;

    /* JADX INFO: renamed from: q1 */
    public qwn f6068q1;

    /* JADX INFO: renamed from: r1 */
    public l5j0 f6069r1;

    /* JADX INFO: renamed from: s1 */
    public er70 f6070s1;

    /* JADX INFO: renamed from: t1 */
    public er70 f6071t1;

    /* JADX INFO: renamed from: u1 */
    public er70 f6072u1;

    /* JADX INFO: renamed from: v1 */
    public er70 f6073v1;

    /* JADX INFO: renamed from: w1 */
    public vei0 f6074w1;

    /* JADX INFO: renamed from: x1 */
    public ly11 f6075x1;

    /* JADX INFO: renamed from: y1 */
    public qre0 f6076y1;

    /* JADX INFO: renamed from: z1 */
    public er70 f6077z1;

    /* JADX INFO: renamed from: d1 */
    public final CopyOnWriteArrayList f6055d1 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e1 */
    public final CopyOnWriteArrayList f6056e1 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: D1 */
    public final oxe f6049D1 = qxe.m74116a();

    /* JADX INFO: renamed from: E1 */
    public final p69 f6050E1 = p69.m69191a(Boolean.FALSE);

    /* JADX INFO: renamed from: F1 */
    public final h7m f6051F1 = new h7m(this, 7);

    /* JADX INFO: renamed from: G1 */
    public final wg61 f6052G1 = new wg61(new ld41(this, 0));

    /* JADX INFO: renamed from: H1 */
    public final w221 f6053H1 = new w221(this, 6);

    /* JADX INFO: renamed from: I1 */
    public final wg61 f6054I1 = new wg61(new ld41(this, 2));

    /* JADX INFO: renamed from: v0 */
    public static Drawable m15680v0(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            return background;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return m15680v0(view2);
        }
        return null;
    }

    @Override // p204p.ox91
    /* JADX INFO: renamed from: H */
    public final boolean getF6893u1() {
        return m15688x0().mo39317A();
    }

    @Override // p204p.yqa0
    /* JADX INFO: renamed from: J */
    public final fxi mo15682J() {
        return m15687w0().f60742b.f99396e;
    }

    @Override // p204p.ic41, p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 getF6890r1() {
        bnm0 bnm0Var = this.f6046A1;
        if (bnm0Var != null) {
            return bnm0Var;
        }
        wj50.m88260d0("pageViewObservable");
        throw null;
    }

    @Override // p204p.m500
    /* JADX INFO: renamed from: g0 */
    public final c700 mo15683g0() {
        return m15687w0().f60742b.f99398g.m95407w();
    }

    @Override // p204p.ofm0
    /* JADX INFO: renamed from: j0 */
    public final jfm0 mo15684j0(Class cls) {
        return m15688x0().mo15684j0(cls);
    }

    @Override // p204p.cc80, p204p.m500, p204p.cwf, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        m15689y0(i, i2, intent);
        m15690z0();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p204p.ic41, p204p.cc80, p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Drawable drawableM15680v0;
        xy3 xy3Var = (xy3) this.f6049D1;
        xy3Var.m92400e("main_activity_on_create");
        if (bundle == null) {
            sr4 sr4Var = xy3Var.f267194g;
            if (sr4Var != null) {
                sr4Var.m79013a("state_restore", "false");
            }
        } else {
            sr4 sr4Var2 = xy3Var.f267194g;
            if (sr4Var2 != null) {
                sr4Var2.m79013a("state_restore", "true");
            }
        }
        if (wj50.m88271j(xy3Var.f267203p, Boolean.TRUE)) {
            xy3Var.m92397b("spotify_service_already_running");
        }
        Long l = xy3Var.f267192e;
        if (l != null) {
            if (((rr4) xy3Var.f267188a).f201947a.m27521a() - l.longValue() > 10000000) {
                xy3Var.m92397b("app_was_running_in_background");
            }
        }
        setTheme(R.style.Theme_Glue_NoActionBar);
        fh61 fh61VarM78610n = so3.m78610n();
        wqs.m88787a(this, fh61VarM78610n, fh61VarM78610n);
        super.onCreate(bundle);
        s301 s301Var = this.f6065n1;
        if (s301Var == null) {
            wj50.m88260d0("sessionUiTeardownRegistry");
            throw null;
        }
        vg0 vg0Var = this.f6066o1;
        if (vg0Var == null) {
            wj50.m88260d0("sessionUiHost");
            throw null;
        }
        this.f6048C1 = s301Var.m77114b(vg0Var);
        m15687w0().f60741a = bundle;
        if (!isTaskRoot() && getIntent().getData() == null && !wj50.m88271j(getIntent().getAction(), "android.intent.action.SEND")) {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (isTaskRoot() || Build.VERSION.SDK_INT >= 30 || !activityManager.getAppTasks().isEmpty()) {
                finish();
                return;
            }
        }
        vei0 vei0Var = this.f6074w1;
        if (vei0Var == null) {
            wj50.m88260d0("navigationBarActiveItemProvider");
            throw null;
        }
        ly11 ly11Var = this.f6075x1;
        if (ly11Var == null) {
            wj50.m88260d0("sideDrawerPageViewObservableProvider");
            throw null;
        }
        rb5 rb5Var = new rb5(vei0Var, ly11Var);
        this.f6046A1 = zy5.m97225f(rb5Var);
        md41 md41Var = new md41(rb5Var);
        l5j0 l5j0Var = this.f6069r1;
        if (l5j0Var == null) {
            wj50.m88260d0("fragmentChangeListener");
            throw null;
        }
        l5j0Var.mo58244g(md41Var);
        this.f6047B1 = md41Var;
        try {
            qwn qwnVar = this.f6068q1;
            if (qwnVar == null) {
                wj50.m88260d0("navigationSystemFactory");
                throw null;
            }
            qwnVar.m74089a(this, this, new ld41(this, 3), (kin0) new yic1(this, new n9y0()).m93705c(kin0.class));
            m15688x0().mo39321U();
            Intent intent = getIntent();
            if (intent != null && bundle == null) {
                onNewIntent(intent);
            }
            setVisible(false);
            x7l0 x7l0VarMo39320R = m15688x0().mo39320R();
            l5j0 l5j0Var2 = this.f6069r1;
            if (l5j0Var2 == null) {
                wj50.m88260d0("fragmentChangeListener");
                throw null;
            }
            l5j0Var2.mo58244g(x7l0VarMo39320R);
            setContentView(R.layout.empty_main);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.main_content);
            xy3Var.m92400e("content_view_creation");
            ekx0 ekx0VarM15688x0 = m15688x0();
            LayoutInflater layoutInflater = getLayoutInflater();
            wj50.m88279p(frameLayout);
            ekx0VarM15688x0.mo39319I(layoutInflater, frameLayout);
            xy3Var.m92396a("content_view_creation");
            cdv cdvVar = this.f6057f1;
            if (cdvVar == null) {
                wj50.m88260d0("fragmentStackReader");
                throw null;
            }
            cdvVar.m32466i(new v7z0(this, 11));
            l5j0 l5j0Var3 = this.f6069r1;
            if (l5j0Var3 == null) {
                wj50.m88260d0("fragmentChangeListener");
                throw null;
            }
            l5j0Var3.mo58244g(this.f6051F1);
            mo15684j0(pw71.class).mo31540d(new ccf0(this, 13));
            Object parent = frameLayout.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null && (drawableM15680v0 = m15680v0(view)) != null) {
                frameLayout.setBackground(drawableM15680v0);
                view.setBackgroundColor(-16777216);
            }
            p3h1.m69032r(frameLayout, new y23(frameLayout, 10));
            xy3Var.m92396a("main_activity_on_create");
        } catch (BadParcelableException e) {
            Logger.m3967c(e, "Failed to initialize navigation system with restored state", new Object[0]);
            finish();
            startActivity(getIntent());
        } catch (ClassNotFoundException e2) {
            Logger.m3967c(e2, "Failed to initialize navigation system with restored state", new Object[0]);
            finish();
            startActivity(getIntent());
        }
    }

    @Override // p204p.cc80, p204p.r55, p204p.m500, android.app.Activity
    public final void onDestroy() {
        l5j0 l5j0Var = this.f6069r1;
        if (l5j0Var == null) {
            wj50.m88260d0("fragmentChangeListener");
            throw null;
        }
        l5j0Var.mo58242e(this.f6051F1);
        x7l0 x7l0VarMo39320R = m15688x0().mo39320R();
        l5j0 l5j0Var2 = this.f6069r1;
        if (l5j0Var2 == null) {
            wj50.m88260d0("fragmentChangeListener");
            throw null;
        }
        l5j0Var2.mo58242e(x7l0VarMo39320R);
        md41 md41Var = this.f6047B1;
        if (md41Var != null) {
            l5j0 l5j0Var3 = this.f6069r1;
            if (l5j0Var3 == null) {
                wj50.m88260d0("fragmentChangeListener");
                throw null;
            }
            l5j0Var3.mo58242e(md41Var);
        }
        cdv cdvVar = this.f6057f1;
        if (cdvVar == null) {
            wj50.m88260d0("fragmentStackReader");
            throw null;
        }
        cdvVar.m32466i(null);
        er70 er70Var = this.f6071t1;
        if (er70Var == null) {
            wj50.m88260d0("deeplinkPluginLifecycle");
            throw null;
        }
        ((guo) er70Var.get()).m45789a();
        er70 er70Var2 = this.f6073v1;
        if (er70Var2 == null) {
            wj50.m88260d0("deepLinkAttributionTrackersController");
            throw null;
        }
        ((sso) er70Var2.get()).f213686b.m23396g();
        b5y0 b5y0Var = this.f6048C1;
        if (b5y0Var != null) {
            b5y0Var.m28228n();
        }
        this.f6048C1 = null;
        super.onDestroy();
    }

    @Override // p204p.ic41, p204p.cwf, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // p204p.cc80, p204p.m500, android.app.Activity
    public final void onPause() {
        super.onPause();
        er70 er70Var = this.f6062k1;
        if (er70Var != null) {
            ((f050) er70Var.get()).m40438a();
        } else {
            wj50.m88260d0("installReferrerRetriever");
            throw null;
        }
    }

    @Override // p204p.m500, p204p.cwf, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        m15689y0(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr));
        m15690z0();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // p204p.cc80, p204p.m500, android.app.Activity
    public final void onResume() {
        xy3 xy3Var = (xy3) this.f6049D1;
        xy3Var.m92400e("main_activity_on_resume");
        super.onResume();
        er70 er70Var = this.f6062k1;
        if (er70Var == null) {
            wj50.m88260d0("installReferrerRetriever");
            throw null;
        }
        f050 f050Var = (f050) er70Var.get();
        d050 d050Var = f050Var.f64548b;
        if (d050Var.f43775i.mo48713h(d050.f43763j, false)) {
            d050Var.m34518a(null);
        } else {
            try {
                f050Var.f64547a.startConnection(new ae00(f050Var, 11));
            } catch (SecurityException e) {
                na6.m63959g("Unable to start connection", e);
            }
        }
        xy3Var.m92396a("main_activity_on_resume");
    }

    @Override // p204p.cc80, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = m15687w0().f60741a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        } else {
            super.onSaveInstanceState(bundle);
        }
        ((m9y0) this.f6054I1.getValue()).m61231d(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        er70 er70Var = this.f6061j1;
        if (er70Var == null) {
            wj50.m88260d0("searchRequestedPluginPoint");
            throw null;
        }
        Iterator it = ((ozy0) er70Var.get()).m68670a().iterator();
        while (it.hasNext()) {
            ((nzy0) it.next()).m65968a();
        }
        return false;
    }

    @Override // p204p.cc80, p204p.r55, p204p.m500, android.app.Activity
    public final void onStart() {
        xy3 xy3Var = (xy3) this.f6049D1;
        xy3Var.m92400e("main_activity_on_start");
        super.onStart();
        er70 er70Var = this.f6063l1;
        if (er70Var == null) {
            wj50.m88260d0("mainActivityMonitoringPluginPoint");
            throw null;
        }
        Iterator<E> it = ((wub0) er70Var.get()).f255131a.iterator();
        while (it.hasNext()) {
            nun0 nun0Var = (nun0) ((hvb0) it.next());
            if (nun0Var.f158678f) {
                nun0Var.f158676d.mo58244g(nun0Var.f158680h);
                nun0Var.f158679g = nun0Var.f158674b.m32730a(false).observeOn(nun0Var.f158677e).subscribe(new o4n0(nun0Var, 5));
            }
        }
        er70 er70Var2 = this.f6070s1;
        if (er70Var2 == null) {
            wj50.m88260d0("foregroundFragmentChangedPluginPoint");
            throw null;
        }
        x7l0 x7l0Var = (x7l0) er70Var2.get();
        l5j0 l5j0Var = this.f6069r1;
        if (l5j0Var == null) {
            wj50.m88260d0("fragmentChangeListener");
            throw null;
        }
        l5j0Var.mo58244g(x7l0Var);
        er70 er70Var3 = this.f6072u1;
        if (er70Var3 == null) {
            wj50.m88260d0("branch");
            throw null;
        }
        ((fb41) er70Var3.get()).m41208b(this);
        xy3Var.m92396a("main_activity_on_start");
    }

    @Override // p204p.m500, android.app.Activity
    public final void onStateNotSaved() {
        super.onStateNotSaved();
        m15690z0();
    }

    @Override // p204p.cc80, p204p.r55, p204p.m500, android.app.Activity
    public final void onStop() {
        super.onStop();
        er70 er70Var = this.f6070s1;
        if (er70Var == null) {
            wj50.m88260d0("foregroundFragmentChangedPluginPoint");
            throw null;
        }
        x7l0 x7l0Var = (x7l0) er70Var.get();
        l5j0 l5j0Var = this.f6069r1;
        if (l5j0Var == null) {
            wj50.m88260d0("fragmentChangeListener");
            throw null;
        }
        l5j0Var.mo58242e(x7l0Var);
        er70 er70Var2 = this.f6063l1;
        if (er70Var2 == null) {
            wj50.m88260d0("mainActivityMonitoringPluginPoint");
            throw null;
        }
        Iterator<E> it = ((wub0) er70Var2.get()).f255131a.iterator();
        while (it.hasNext()) {
            nun0 nun0Var = (nun0) ((hvb0) it.next());
            nun0Var.f158676d.mo58242e(nun0Var.f158680h);
            nun0Var.f158679g.dispose();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f6050E1.accept(Boolean.valueOf(z));
    }

    @Override // p204p.ic41
    /* JADX INFO: renamed from: s0 */
    public final a600 mo4026s0() {
        return new dm11(this);
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        na6.m63957e("Change orientation outside ForcedOrientationPagePropertyObserver is not allowed. Refer to com.spotify.tome.pagecapabilities.properties.ForcedOrientation Page property");
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        na6.m63965m("Don't call setTitle() directly, use setTitleForFragment() instead");
    }

    @Override // p204p.ic41
    /* JADX INFO: renamed from: t0 */
    public final void mo15685t0() {
        oxe oxeVar = this.f6049D1;
        ((xy3) oxeVar).m92400e("main_activity_injection");
        opo.m67559i(this);
        ((xy3) oxeVar).m92396a("main_activity_injection");
    }

    @Override // p204p.bwf, p204p.wvl0
    /* JADX INFO: renamed from: u */
    public final void mo15686u(int i) {
        super.setRequestedOrientation(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final elq m15687w0() {
        return (elq) this.f6052G1.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    public final ekx0 m15688x0() {
        ekx0 ekx0Var = this.f6064m1;
        if (ekx0Var != null) {
            return ekx0Var;
        }
        wj50.m88260d0("rootUI");
        throw null;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m15689y0(int i, int i2, Intent intent) {
        Iterator it = this.f6056e1.iterator();
        while (it.hasNext()) {
            bsa bsaVar = ((bxi) it.next()).f31868a;
            if (bsaVar.m30385R()) {
                bsaVar.m30384Q().m69850c(i, i2, intent);
            } else {
                bsaVar.m30412m0(new p4l0(i, i2, intent, 3));
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m15690z0() {
        Iterator it = this.f6055d1.iterator();
        while (it.hasNext()) {
            ((f700) it.next()).f66527a.f99398g.m95409y();
        }
    }
}
