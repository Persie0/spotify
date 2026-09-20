package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class sx11 extends ogs implements h631 {

    /* JADX INFO: renamed from: A1 */
    public boolean f214765A1;

    /* JADX INFO: renamed from: B1 */
    public final ox11 f214766B1;

    /* JADX INFO: renamed from: j1 */
    public final dy11 f214767j1;

    /* JADX INFO: renamed from: k1 */
    public final sem0 f214768k1;

    /* JADX INFO: renamed from: l1 */
    public final i4t0 f214769l1;

    /* JADX INFO: renamed from: m1 */
    public final oc0 f214770m1;

    /* JADX INFO: renamed from: n1 */
    public final ox11 f214771n1;

    /* JADX INFO: renamed from: o1 */
    public final zv41 f214772o1;

    /* JADX INFO: renamed from: p1 */
    public final nuu0 f214773p1;

    /* JADX INFO: renamed from: q1 */
    public final zv41 f214774q1;

    /* JADX INFO: renamed from: r1 */
    public final nuu0 f214775r1;

    /* JADX INFO: renamed from: s1 */
    public final zv41 f214776s1;

    /* JADX INFO: renamed from: t1 */
    public final nuu0 f214777t1;

    /* JADX INFO: renamed from: u1 */
    public final fiz f214778u1;

    /* JADX INFO: renamed from: v1 */
    public esa0 f214779v1;

    /* JADX INFO: renamed from: w1 */
    public final FrameLayout f214780w1;

    /* JADX INFO: renamed from: x1 */
    public final FrameLayout f214781x1;

    /* JADX INFO: renamed from: y1 */
    public final CoordinatorLayout f214782y1;

    /* JADX INFO: renamed from: z1 */
    public boolean f214783z1;

    /* JADX INFO: renamed from: D1 */
    public static final /* synthetic */ qr60[] f214764D1 = {new spi0(sx11.class, "contentView", "getContentView()Landroid/view/View;", 0), new spi0(sx11.class, "mainLayoutConfig", "getMainLayoutConfig()Lcom/spotify/mainlayout/contenttypes/sidedrawer/SideDrawerMainLayoutConfig;", 0), new spi0(sx11.class, "drawerState", "getDrawerState()I", 0)};

    /* JADX INFO: renamed from: C1 */
    public static final on3 f214763C1 = new on3(26);

    public sx11(m500 m500Var, dy11 dy11Var, sem0 sem0Var, pwn pwnVar) {
        super(m500Var);
        this.f214767j1 = dy11Var;
        this.f214768k1 = sem0Var;
        this.f214769l1 = pwnVar;
        this.f214770m1 = new oc0(this, 2);
        this.f214771n1 = new ox11(this, 1);
        Boolean bool = Boolean.FALSE;
        zv41 zv41VarM52819d = jag1.m52819d(bool);
        this.f214772o1 = zv41VarM52819d;
        this.f214773p1 = bzf1.m31021m(zv41VarM52819d);
        zv41 zv41VarM52819d2 = jag1.m52819d(bool);
        this.f214774q1 = zv41VarM52819d2;
        this.f214775r1 = bzf1.m31021m(zv41VarM52819d2);
        zv41 zv41VarM52819d3 = jag1.m52819d(bool);
        this.f214776s1 = zv41VarM52819d3;
        this.f214777t1 = bzf1.m31021m(zv41VarM52819d3);
        fbk fbkVar = null;
        this.f214778u1 = mvl0.m62953p(xtm0.m92074U(mvl0.m62953p(new gq0(bzf1.m31021m(m500Var.f31643a.f163863j), 14)), new zf01(fbkVar, this, 5)));
        FrameLayout frameLayout = new FrameLayout(getContext());
        lgs lgsVar = new lgs();
        lgsVar.f133277a = 8388611;
        frameLayout.setLayoutParams(lgsVar);
        frameLayout.setBackgroundColor(-16777216);
        cec1.m32550n(frameLayout, new urt0(this, 24));
        this.f214780w1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout2.setBackgroundColor(lzj.m60386v(frameLayout2.getContext(), R.color.sidedrawer_background));
        frameLayout2.setClipToOutline(true);
        this.f214781x1 = frameLayout2;
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext());
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setClickable(false);
        this.f214782y1 = coordinatorLayout;
        this.f214783z1 = true;
        this.f214766B1 = new ox11(this, 2);
        setLayoutParams(new lgs());
        frameLayout.addView(frameLayout2);
        frameLayout2.addView(coordinatorLayout);
        addView(frameLayout);
        setScrimColor(-1291845632);
        nx11 nx11Var = new nx11(this);
        if (this.f165230U0 == null) {
            this.f165230U0 = new ArrayList();
        }
        this.f165230U0.add(nx11Var);
        x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new cj40(this, fbkVar, 26), 3);
        x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new q2y0(this, fbkVar, 23), 3);
        x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new px11(this, null), 3);
    }

    private final int getDrawerState() {
        qr60 qr60Var = f214764D1[2];
        return ((Number) this.f214766B1.f61172a).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawerState(int i) {
        this.f214766B1.m39516c(f214764D1[2], this, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: u */
    public static final void m79565u(sx11 sx11Var) {
        if (!((Boolean) sx11Var.f214774q1.getValue()).booleanValue() || ((Boolean) sx11Var.f214776s1.getValue()).booleanValue()) {
            esa0 esa0Var = sx11Var.f214779v1;
            if (esa0Var != null) {
                esa0Var.m39903d();
            }
            sx11Var.f214779v1 = null;
            return;
        }
        if (sx11Var.f214779v1 == null) {
            sem0 sem0Var = sx11Var.f214768k1;
            sem0Var.m77919b(1);
            sx11Var.f214779v1 = new esa0(sem0Var, 27);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m79566y(sx11 sx11Var) {
        View viewM66905d = sx11Var.m66905d(8388611);
        sx11Var.m79569x(viewM66905d != null ? ogs.m66899k(viewM66905d) : false ? 1.0f : 0.0f);
    }

    public final View getContentView() {
        qr60 qr60Var = f214764D1[0];
        return (View) this.f214770m1.f61172a;
    }

    public final hy11 getMainLayoutConfig() {
        qr60 qr60Var = f214764D1[1];
        return (hy11) this.f214771n1.f61172a;
    }

    @Override // p204p.ogs, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f214783z1 = true;
    }

    @Override // p204p.ogs, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f214783z1) {
            this.f214783z1 = false;
            m79566y(this);
            View viewM66905d = m66905d(8388611);
            Boolean boolValueOf = Boolean.valueOf(viewM66905d != null ? ogs.m66899k(viewM66905d) : false);
            zv41 zv41Var = this.f214772o1;
            zv41Var.getClass();
            zv41Var.m97091m(null, boolValueOf);
            m79570z();
        }
    }

    public final void setContentView(View view) {
        this.f214770m1.m39516c(f214764D1[0], this, view);
    }

    public void setIsOverlapped(boolean z) {
        fr0.m42476t(z, this.f214776s1, null);
        this.f214780w1.setImportantForAccessibility(z ? 4 : 1);
    }

    public final void setMainLayoutConfig(hy11 hy11Var) {
        this.f214771n1.m39516c(f214764D1[1], this, hy11Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m79567v() {
        View viewM66905d = m66905d(8388611);
        if (viewM66905d != null ? ogs.m66899k(viewM66905d) : false) {
            this.f214765A1 = true;
            View viewM66905d2 = m66905d(8388611);
            if (viewM66905d2 != null) {
                m66903b(viewM66905d2);
            } else {
                throw new IllegalArgumentException("No drawer view found with gravity " + ogs.m66896h(8388611));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m79568w(boolean z) {
        if (!z) {
            this.f214765A1 = false;
            Boolean bool = Boolean.TRUE;
            zv41 zv41Var = this.f214774q1;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
        }
        View viewM66905d = m66905d(8388611);
        if (viewM66905d != null) {
            m66909n(viewM66905d, z);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + ogs.m66896h(8388611));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m79569x(float f) {
        float fM67383b;
        View contentView = getContentView();
        if (contentView != null) {
            hy11 mainLayoutConfig = getMainLayoutConfig();
            int i = mainLayoutConfig != null ? mainLayoutConfig.f96429a : 0;
            int i2 = i == 0 ? -1 : qx11.f193456a[edb.m38547C(i)];
            if (i2 == -1 || i2 == 1) {
                fM67383b = 0.0f;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fM67383b = on3.m67383b(f214763C1, this.f214780w1.getWidth() * f, getLayoutDirection() == 1);
            }
            contentView.setTranslationX(fM67383b);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m79570z() {
        Set setSingleton;
        View viewM66905d = m66905d(8388611);
        boolean z = true;
        if (!(viewM66905d != null ? ogs.m66901m(viewM66905d) : false) && getDrawerState() != 1 && getDrawerState() != 2) {
            z = false;
        }
        zv41 zv41Var = this.f214774q1;
        if (((Boolean) zv41Var.getValue()).booleanValue() != z) {
            fr0.m42476t(z, zv41Var, null);
        }
        if (z) {
            FrameLayout frameLayout = this.f214781x1;
            C2042k7 c2042k7 = new C2042k7(frameLayout, 8);
            if (c2042k7.hasNext()) {
                Object next = c2042k7.next();
                if (c2042k7.hasNext()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(next);
                    while (c2042k7.hasNext()) {
                        linkedHashSet.add(c2042k7.next());
                    }
                    setSingleton = linkedHashSet;
                } else {
                    setSingleton = Collections.singleton(next);
                }
            } else {
                setSingleton = gbu.f78413a;
            }
            if (s601.m77304g0(this.f214782y1, setSingleton).isEmpty()) {
                frameLayout.addView(((zw11) this.f214769l1.get()).m97105a(this), 0);
            }
        }
    }

    @Override // p204p.h631
    public CoordinatorLayout getSnackbarContainer() {
        if (!((Boolean) this.f214774q1.getValue()).booleanValue() || this.f214765A1) {
            return null;
        }
        return this.f214782y1;
    }
}
