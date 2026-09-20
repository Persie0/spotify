package p204p;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class cwf extends bwf implements ijc1, fd20, h9y0, c7l0, sg0, zf0, s7l0, wfl0, dbl0, cbl0, ebl0, che0 {

    /* JADX INFO: renamed from: R0 */
    public static final /* synthetic */ int f42728R0 = 0;

    /* JADX INFO: renamed from: L0 */
    public final CopyOnWriteArrayList f42729L0;

    /* JADX INFO: renamed from: M0 */
    public final CopyOnWriteArrayList f42730M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f42731N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f42732O0;

    /* JADX INFO: renamed from: P0 */
    public final wg61 f42733P0;

    /* JADX INFO: renamed from: Q0 */
    public final wg61 f42734Q0;

    /* JADX INFO: renamed from: X */
    public final CopyOnWriteArrayList f42735X;

    /* JADX INFO: renamed from: Y */
    public final CopyOnWriteArrayList f42736Y;

    /* JADX INFO: renamed from: Z */
    public final CopyOnWriteArrayList f42737Z;

    /* JADX INFO: renamed from: b */
    public final fzj f42738b;

    /* JADX INFO: renamed from: c */
    public final li80 f42739c;

    /* JADX INFO: renamed from: d */
    public final ltx0 f42740d;

    /* JADX INFO: renamed from: e */
    public hjc1 f42741e;

    /* JADX INFO: renamed from: f */
    public final yvf f42742f;

    /* JADX INFO: renamed from: g */
    public final wg61 f42743g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f42744h;

    /* JADX INFO: renamed from: i */
    public final zvf f42745i;

    /* JADX INFO: renamed from: t */
    public final CopyOnWriteArrayList f42746t;

    public cwf() {
        fzj fzjVar = new fzj(0);
        this.f42738b = fzjVar;
        this.f42739c = new li80(new RunnableC2364s6(this, 2));
        ltx0 ltx0VarM48651k = huf1.m48651k(this);
        this.f42740d = ltx0VarM48651k;
        this.f42742f = new yvf(this);
        this.f42743g = new wg61(new b8b(this, 8));
        this.f42744h = new AtomicInteger();
        this.f42745i = new zvf(this);
        this.f42746t = new CopyOnWriteArrayList();
        this.f42735X = new CopyOnWriteArrayList();
        this.f42736Y = new CopyOnWriteArrayList();
        this.f42737Z = new CopyOnWriteArrayList();
        this.f42729L0 = new CopyOnWriteArrayList();
        this.f42730M0 = new CopyOnWriteArrayList();
        oc80 oc80Var = this.f31643a;
        if (oc80Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        oc80Var.mo31986a(new vvf(this, 0));
        this.f31643a.mo31986a(new vvf(this, 1));
        this.f31643a.mo31986a(new ne2(this, 2));
        ltx0VarM48651k.m59917j();
        gyf1.m46149o(this);
        ltx0VarM48651k.m59915g().m41110c("android:support:activity-result", new wvf(this, 0));
        fzjVar.m43220a(new w7l0() { // from class: p.tvf
            @Override // p204p.w7l0
            /* JADX INFO: renamed from: a */
            public final void mo55415a() {
                cwf cwfVar = this.f224152a;
                Bundle bundleM41108a = cwfVar.f42740d.m59915g().m41108a("android:support:activity-result");
                if (bundleM41108a != null) {
                    cwfVar.f42745i.m69851e(bundleM41108a);
                }
            }
        });
        this.f42733P0 = new wg61(new awf(this, 0));
        this.f42734Q0 = new wg61(new awf(this, 2));
    }

    @Override // p204p.ebl0
    /* JADX INFO: renamed from: G */
    public final void mo34123G(y8j y8jVar) {
        this.f42729L0.add(y8jVar);
    }

    @Override // p204p.che0
    /* JADX INFO: renamed from: K */
    public final void mo156K(iie0 iie0Var) {
        this.f42739c.m59037b(iie0Var);
    }

    @Override // p204p.c7l0
    /* JADX INFO: renamed from: N */
    public final b7l0 mo31751N() {
        return (b7l0) this.f42734Q0.getValue();
    }

    @Override // p204p.s7l0
    /* JADX INFO: renamed from: Q */
    public final void mo34124Q(y8j y8jVar) {
        this.f42746t.remove(y8jVar);
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: S */
    public final vic1 mo34125S() {
        return (vic1) this.f42733P0.getValue();
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: T */
    public final koi0 mo34126T() {
        koi0 koi0Var = new koi0(0);
        if (getApplication() != null) {
            koi0Var.m56998a(tic1.f220605d, getApplication());
        }
        koi0Var.m56998a(gyf1.f85601a, this);
        koi0Var.m56998a(gyf1.f85602b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            koi0Var.m56998a(gyf1.f85603c, extras);
        }
        return koi0Var;
    }

    @Override // p204p.cbl0
    /* JADX INFO: renamed from: X */
    public final void mo32178X(y8j y8jVar) {
        this.f42737Z.add(y8jVar);
    }

    @Override // p204p.cbl0
    /* JADX INFO: renamed from: Y */
    public final void mo32179Y(y8j y8jVar) {
        this.f42737Z.remove(y8jVar);
    }

    @Override // p204p.wfl0
    /* JADX INFO: renamed from: a0 */
    public final void mo34127a0(y8j y8jVar) {
        this.f42735X.remove(y8jVar);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m34130e0();
        this.f42742f.m94694a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p204p.wfl0
    /* JADX INFO: renamed from: b0 */
    public final void mo34128b0(y8j y8jVar) {
        this.f42735X.add(y8jVar);
    }

    @Override // p204p.s7l0
    /* JADX INFO: renamed from: c0 */
    public final void mo34129c0(y8j y8jVar) {
        this.f42746t.add(y8jVar);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m34130e0() {
        eug1.m40073o(getWindow().getDecorView(), this);
        lug1.m59989F(getWindow().getDecorView(), this);
        y85.m93047D(getWindow().getDecorView(), this);
        gug1.m45757C(getWindow().getDecorView(), this);
        dug1.m36966v(getWindow().getDecorView(), this);
    }

    @Override // p204p.zf0
    /* JADX INFO: renamed from: f0 */
    public final hg0 mo34131f0(yf0 yf0Var, hsg1 hsg1Var) {
        return this.f42745i.m69853g("activity_rq#" + this.f42744h.getAndIncrement(), this, hsg1Var, yf0Var);
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f31643a;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f42745i.m69850c(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        mo31751N().m28388d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f42746t.iterator();
        while (it.hasNext()) {
            ((y8j) it.next()).accept(configuration);
        }
    }

    @Override // p204p.bwf, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f42740d.m59918k(bundle);
        this.f42738b.m43224e(this);
        super.onCreate(bundle);
        int i = xrw0.f265430b;
        vrw0.m86301b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.f42739c.m59045v(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f42739c.m59047x(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f42731N0) {
            return;
        }
        Iterator it = this.f42737Z.iterator();
        while (it.hasNext()) {
            ((y8j) it.next()).accept(new dai0(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f42736Y.iterator();
        while (it.hasNext()) {
            ((y8j) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f42739c.m59046w(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f42732O0) {
            return;
        }
        Iterator it = this.f42729L0.iterator();
        while (it.hasNext()) {
            ((y8j) it.next()).accept(new azn0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.f42739c.m59048y(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f42745i.m69850c(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        xvf xvfVar;
        hjc1 hjc1Var = this.f42741e;
        if (hjc1Var == null && (xvfVar = (xvf) getLastNonConfigurationInstance()) != null) {
            hjc1Var = xvfVar.f266380a;
        }
        if (hjc1Var == null) {
            return null;
        }
        xvf xvfVar2 = new xvf();
        xvfVar2.f266380a = hjc1Var;
        return xvfVar2;
    }

    @Override // p204p.bwf, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        oc80 oc80Var = this.f31643a;
        if (oc80Var != null) {
            oc80Var.m66678i(fb80.f67752c);
        }
        super.onSaveInstanceState(bundle);
        this.f42740d.m59919l(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f42735X.iterator();
        while (it.hasNext()) {
            ((y8j) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f42730M0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // p204p.che0
    /* JADX INFO: renamed from: r */
    public final void mo171r(iie0 iie0Var) {
        this.f42739c.m59036B(iie0Var);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (k0e1.m54969D()) {
                fn1.m42176e(k0e1.m54980O("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ((dh00) this.f42743g.getValue()).m35955a();
        } finally {
            fn1.m42178g();
        }
    }

    @Override // p204p.sg0
    /* JADX INFO: renamed from: s */
    public final pg0 mo34132s() {
        return this.f42745i;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m34130e0();
        this.f42742f.m94694a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // p204p.ebl0
    /* JADX INFO: renamed from: t */
    public final void mo34133t(y8j y8jVar) {
        this.f42729L0.remove(y8jVar);
    }

    @Override // p204p.ijc1
    /* JADX INFO: renamed from: w */
    public final hjc1 mo34134w() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f42741e == null) {
            xvf xvfVar = (xvf) getLastNonConfigurationInstance();
            if (xvfVar != null) {
                this.f42741e = xvfVar.f266380a;
            }
            if (this.f42741e == null) {
                this.f42741e = new hjc1();
            }
        }
        hjc1 hjc1Var = this.f42741e;
        wj50.m88279p(hjc1Var);
        return hjc1Var;
    }

    @Override // p204p.h9y0
    /* JADX INFO: renamed from: x */
    public final f9y0 mo34135x() {
        return this.f42740d.m59915g();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f42731N0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f42731N0 = false;
            Iterator it = this.f42737Z.iterator();
            while (it.hasNext()) {
                ((y8j) it.next()).accept(new dai0(z, 0));
            }
        } catch (Throwable th) {
            this.f42731N0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f42732O0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f42732O0 = false;
            Iterator it = this.f42729L0.iterator();
            while (it.hasNext()) {
                ((y8j) it.next()).accept(new azn0(z, 0));
            }
        } catch (Throwable th) {
            this.f42732O0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m34130e0();
        this.f42742f.m94694a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m34130e0();
        this.f42742f.m94694a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
