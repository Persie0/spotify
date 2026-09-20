package p204p;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class i500 implements ComponentCallbacks, View.OnCreateContextMenuListener, hc80, ijc1, fd20, h9y0, zf0 {

    /* JADX INFO: renamed from: z1 */
    public static final Object f98672z1 = new Object();

    /* JADX INFO: renamed from: L0 */
    public boolean f98673L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f98674M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f98675N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f98676O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f98677P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f98678Q0;

    /* JADX INFO: renamed from: R0 */
    public int f98679R0;

    /* JADX INFO: renamed from: S0 */
    public c700 f98680S0;

    /* JADX INFO: renamed from: T0 */
    public c600 f98681T0;

    /* JADX INFO: renamed from: U0 */
    public j700 f98682U0;

    /* JADX INFO: renamed from: V0 */
    public i500 f98683V0;

    /* JADX INFO: renamed from: W0 */
    public int f98684W0;

    /* JADX INFO: renamed from: X */
    public boolean f98685X;

    /* JADX INFO: renamed from: X0 */
    public int f98686X0;

    /* JADX INFO: renamed from: Y */
    public boolean f98687Y;

    /* JADX INFO: renamed from: Y0 */
    public String f98688Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f98689Z;

    /* JADX INFO: renamed from: Z0 */
    public boolean f98690Z0;

    /* JADX INFO: renamed from: a */
    public int f98691a;

    /* JADX INFO: renamed from: a1 */
    public boolean f98692a1;

    /* JADX INFO: renamed from: b */
    public Bundle f98693b;

    /* JADX INFO: renamed from: b1 */
    public boolean f98694b1;

    /* JADX INFO: renamed from: c */
    public SparseArray f98695c;

    /* JADX INFO: renamed from: c1 */
    public boolean f98696c1;

    /* JADX INFO: renamed from: d */
    public Bundle f98697d;

    /* JADX INFO: renamed from: d1 */
    public boolean f98698d1;

    /* JADX INFO: renamed from: e */
    public String f98699e;

    /* JADX INFO: renamed from: e1 */
    public final boolean f98700e1;

    /* JADX INFO: renamed from: f */
    public Bundle f98701f;

    /* JADX INFO: renamed from: f1 */
    public boolean f98702f1;

    /* JADX INFO: renamed from: g */
    public i500 f98703g;

    /* JADX INFO: renamed from: g1 */
    public ViewGroup f98704g1;

    /* JADX INFO: renamed from: h */
    public String f98705h;

    /* JADX INFO: renamed from: h1 */
    public View f98706h1;

    /* JADX INFO: renamed from: i */
    public int f98707i;

    /* JADX INFO: renamed from: i1 */
    public boolean f98708i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f98709j1;

    /* JADX INFO: renamed from: k1 */
    public e500 f98710k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f98711l1;

    /* JADX INFO: renamed from: m1 */
    public LayoutInflater f98712m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f98713n1;

    /* JADX INFO: renamed from: o1 */
    public String f98714o1;

    /* JADX INFO: renamed from: p1 */
    public fb80 f98715p1;

    /* JADX INFO: renamed from: q1 */
    public oc80 f98716q1;

    /* JADX INFO: renamed from: r1 */
    public y800 f98717r1;

    /* JADX INFO: renamed from: s1 */
    public final xoi0 f98718s1;

    /* JADX INFO: renamed from: t */
    public Boolean f98719t;

    /* JADX INFO: renamed from: t1 */
    public n9y0 f98720t1;

    /* JADX INFO: renamed from: u1 */
    public ltx0 f98721u1;

    /* JADX INFO: renamed from: v1 */
    public final int f98722v1;

    /* JADX INFO: renamed from: w1 */
    public final AtomicInteger f98723w1;

    /* JADX INFO: renamed from: x1 */
    public final ArrayList f98724x1;

    /* JADX INFO: renamed from: y1 */
    public final b500 f98725y1;

    public i500() {
        this.f98691a = -1;
        this.f98699e = UUID.randomUUID().toString();
        this.f98705h = null;
        this.f98719t = null;
        this.f98682U0 = new j700();
        this.f98700e1 = true;
        this.f98709j1 = true;
        new eph(this, 28);
        this.f98715p1 = fb80.f67754e;
        this.f98718s1 = new xoi0();
        this.f98723w1 = new AtomicInteger();
        this.f98724x1 = new ArrayList();
        this.f98725y1 = new b500(this);
        m49725x0();
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m49692A0() {
        if (this.f98690Z0) {
            return true;
        }
        c700 c700Var = this.f98680S0;
        if (c700Var != null) {
            i500 i500Var = this.f98683V0;
            c700Var.getClass();
            if (i500Var == null ? false : i500Var.m49692A0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m49693B0() {
        return this.f98679R0 > 0;
    }

    /* JADX INFO: renamed from: C0 */
    public void mo49694C0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: D0 */
    public void mo26182D0(int i, int i2, Intent intent) {
        if (c700.m31595O(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void mo875E0(Context context) {
        this.f98702f1 = true;
        c600 c600Var = this.f98681T0;
        if ((c600Var == null ? null : c600Var.f34327Z) != null) {
            this.f98702f1 = true;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void mo876F0(Bundle bundle) {
        this.f98702f1 = true;
        m49704Z0();
        j700 j700Var = this.f98682U0;
        if (j700Var.f34688w >= 1) {
            return;
        }
        j700Var.f34657J = false;
        j700Var.f34658K = false;
        j700Var.f34664Q.f151000g = false;
        j700Var.m31653u(1);
    }

    /* JADX INFO: renamed from: G0 */
    public View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f98722v1;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public void mo3093H0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: I0 */
    public void mo878I0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: J0 */
    public void mo29537J0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: K0 */
    public LayoutInflater mo49695K0(Bundle bundle) {
        c600 c600Var = this.f98681T0;
        if (c600Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo31500d0 = c600Var.mo31500d0();
        twg1.m81757y(layoutInflaterMo31500d0, this.f98682U0.f34671f);
        return layoutInflaterMo31500d0;
    }

    /* JADX INFO: renamed from: L0 */
    public void mo879L0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f98702f1 = true;
        c600 c600Var = this.f98681T0;
        if ((c600Var == null ? null : c600Var.f34327Z) != null) {
            this.f98702f1 = true;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void mo3094M0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: N0 */
    public void mo3095N0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: P0 */
    public void mo3104P0() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo3105Q0() {
        this.f98702f1 = true;
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: S */
    public final vic1 mo34125S() {
        Application application;
        if (this.f98680S0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f98720t1 == null) {
            Context applicationContext = m49702X0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && c700.m31595O(3)) {
                Objects.toString(m49702X0().getApplicationContext());
            }
            this.f98720t1 = new n9y0(application, this, this.f98701f);
        }
        return this.f98720t1;
    }

    /* JADX INFO: renamed from: S0 */
    public void mo49696S0(Bundle bundle) {
        this.f98702f1 = true;
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: T */
    public final koi0 mo34126T() {
        Application application;
        Context applicationContext = m49702X0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && c700.m31595O(3)) {
            Objects.toString(m49702X0().getApplicationContext());
        }
        koi0 koi0Var = new koi0(0);
        if (application != null) {
            koi0Var.m56998a(tic1.f220605d, application);
        }
        koi0Var.m56998a(gyf1.f85601a, this);
        koi0Var.m56998a(gyf1.f85602b, this);
        Bundle bundle = this.f98701f;
        if (bundle != null) {
            koi0Var.m56998a(gyf1.f85603c, bundle);
        }
        return koi0Var;
    }

    /* JADX INFO: renamed from: T0 */
    public void mo49697T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f98682U0.m31613V();
        this.f98678Q0 = true;
        this.f98717r1 = new y800(this, mo34134w(), new RunnableC2364s6(this, 7));
        View viewMo877G0 = mo877G0(layoutInflater, viewGroup, bundle);
        this.f98706h1 = viewMo877G0;
        if (viewMo877G0 == null) {
            if (this.f98717r1.f270161e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f98717r1 = null;
            return;
        }
        this.f98717r1.m93034b();
        if (c700.m31595O(3)) {
            Objects.toString(this.f98706h1);
            toString();
        }
        eug1.m40073o(this.f98706h1, this.f98717r1);
        lug1.m59989F(this.f98706h1, this.f98717r1);
        y85.m93047D(this.f98706h1, this.f98717r1);
        this.f98718s1.mo33104m(this.f98717r1);
    }

    /* JADX INFO: renamed from: U0 */
    public final a500 m49698U0(hsg1 hsg1Var, fi00 fi00Var, yf0 yf0Var) {
        if (this.f98691a > 1) {
            throw new IllegalStateException(klh.m56835g("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        d500 d500Var = new d500(this, fi00Var, atomicReference, hsg1Var, yf0Var);
        if (this.f98691a >= 0) {
            d500Var.mo28123a();
        } else {
            this.f98724x1.add(d500Var);
        }
        return new a500(atomicReference);
    }

    /* JADX INFO: renamed from: V0 */
    public final m500 m49699V0() {
        m500 m500VarM49715n0 = m49715n0();
        if (m500VarM49715n0 != null) {
            return m500VarM49715n0;
        }
        throw new IllegalStateException(klh.m56835g("Fragment ", this, " not attached to an activity."));
    }

    /* JADX INFO: renamed from: W */
    public Activity m49700W() {
        return m49715n0();
    }

    /* JADX INFO: renamed from: W0 */
    public final Bundle m49701W0() {
        Bundle bundle = this.f98701f;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(klh.m56835g("Fragment ", this, " does not have any arguments."));
    }

    /* JADX INFO: renamed from: X0 */
    public final Context m49702X0() {
        Context contextM49717p0 = m49717p0();
        if (contextM49717p0 != null) {
            return contextM49717p0;
        }
        throw new IllegalStateException(klh.m56835g("Fragment ", this, " not attached to a context."));
    }

    /* JADX INFO: renamed from: Y0 */
    public final View m49703Y0() {
        View view = this.f98706h1;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(klh.m56835g("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m49704Z0() {
        Bundle bundle;
        Bundle bundle2 = this.f98693b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f98682U0.m31623c0(bundle);
        j700 j700Var = this.f98682U0;
        j700Var.f34657J = false;
        j700Var.f34658K = false;
        j700Var.f34664Q.f151000g = false;
        j700Var.m31653u(1);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m49705a1(int i, int i2, int i3, int i4) {
        if (this.f98710k1 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m49714m0().f56203b = i;
        m49714m0().f56204c = i2;
        m49714m0().f56205d = i3;
        m49714m0().f56206e = i4;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m49706b1(Bundle bundle) {
        c700 c700Var = this.f98680S0;
        if (c700Var != null) {
            if (c700Var == null ? false : c700Var.m31611T()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f98701f = bundle;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m49707c1() {
        if (!this.f98698d1) {
            this.f98698d1 = true;
            if (!m49727z0() || m49692A0()) {
                return;
            }
            this.f98681T0.mo31501e0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m49708d1(h500 h500Var) {
        Bundle bundle;
        if (this.f98680S0 != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (h500Var == null || (bundle = h500Var.f87693a) == null) {
            bundle = null;
        }
        this.f98693b = bundle;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m49709e1() {
        i800.m49895g(this);
        this.f98694b1 = true;
        c700 c700Var = this.f98680S0;
        if (c700Var != null) {
            c700Var.f34664Q.m63789e(this);
        } else {
            this.f98696c1 = true;
        }
    }

    @Override // p204p.zf0
    /* JADX INFO: renamed from: f0 */
    public final hg0 mo34131f0(yf0 yf0Var, hsg1 hsg1Var) {
        return m49698U0(hsg1Var, new skp(this, 10), yf0Var);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m49710f1(i500 i500Var) {
        if (i500Var != null) {
            i800.m49896h(this, i500Var);
        }
        c700 c700Var = this.f98680S0;
        c700 c700Var2 = i500Var != null ? i500Var.f98680S0 : null;
        if (c700Var != null && c700Var2 != null && c700Var != c700Var2) {
            throw new IllegalArgumentException(klh.m56835g("Fragment ", i500Var, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (i500 i500VarM49723v0 = i500Var; i500VarM49723v0 != null; i500VarM49723v0 = i500VarM49723v0.m49723v0(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + i500Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (i500Var == null) {
            this.f98705h = null;
            this.f98703g = null;
        } else if (this.f98680S0 == null || i500Var.f98680S0 == null) {
            this.f98705h = null;
            this.f98703g = i500Var;
        } else {
            this.f98705h = i500Var.f98699e;
            this.f98703g = null;
        }
        this.f98707i = 0;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m49711g1(Intent intent) {
        c600 c600Var = this.f98681T0;
        if (c600Var == null) {
            throw new IllegalStateException(klh.m56835g("Fragment ", this, " not attached to Activity"));
        }
        lzj.m60360f0(c600Var.f34324L0, intent);
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f98716q1;
    }

    /* JADX INFO: renamed from: k0 */
    public q0f1 mo49712k0() {
        return new c500(this);
    }

    /* JADX INFO: renamed from: l0 */
    public void mo49713l0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f98684W0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f98686X0));
        printWriter.print(" mTag=");
        printWriter.println(this.f98688Y0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f98691a);
        printWriter.print(" mWho=");
        printWriter.print(this.f98699e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f98679R0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f98685X);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f98687Y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f98674M0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f98675N0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f98690Z0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f98692a1);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f98700e1);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f98698d1);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f98694b1);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f98709j1);
        if (this.f98680S0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f98680S0);
        }
        if (this.f98681T0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f98681T0);
        }
        if (this.f98683V0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f98683V0);
        }
        if (this.f98701f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f98701f);
        }
        if (this.f98693b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f98693b);
        }
        if (this.f98695c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f98695c);
        }
        if (this.f98697d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f98697d);
        }
        i500 i500VarM49723v0 = m49723v0(false);
        if (i500VarM49723v0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(i500VarM49723v0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f98707i);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        e500 e500Var = this.f98710k1;
        printWriter.println(e500Var == null ? false : e500Var.f56202a);
        e500 e500Var2 = this.f98710k1;
        if ((e500Var2 == null ? 0 : e500Var2.f56203b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            e500 e500Var3 = this.f98710k1;
            printWriter.println(e500Var3 == null ? 0 : e500Var3.f56203b);
        }
        e500 e500Var4 = this.f98710k1;
        if ((e500Var4 == null ? 0 : e500Var4.f56204c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            e500 e500Var5 = this.f98710k1;
            printWriter.println(e500Var5 == null ? 0 : e500Var5.f56204c);
        }
        e500 e500Var6 = this.f98710k1;
        if ((e500Var6 == null ? 0 : e500Var6.f56205d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            e500 e500Var7 = this.f98710k1;
            printWriter.println(e500Var7 == null ? 0 : e500Var7.f56205d);
        }
        e500 e500Var8 = this.f98710k1;
        if ((e500Var8 == null ? 0 : e500Var8.f56206e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            e500 e500Var9 = this.f98710k1;
            printWriter.println(e500Var9 != null ? e500Var9.f56206e : 0);
        }
        if (this.f98704g1 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f98704g1);
        }
        if (this.f98706h1 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f98706h1);
        }
        if (m49717p0() != null) {
            vw90.m86531p(this).m86540n(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f98682U0 + ":");
        this.f98682U0.m31654v(s571.m77250i(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: m0 */
    public final e500 m49714m0() {
        if (this.f98710k1 == null) {
            e500 e500Var = new e500();
            e500Var.f56210i = null;
            Object obj = f98672z1;
            e500Var.f56211j = obj;
            e500Var.f56212k = null;
            e500Var.f56213l = obj;
            e500Var.f56214m = null;
            e500Var.f56215n = obj;
            e500Var.f56216o = 1.0f;
            e500Var.f56217p = null;
            this.f98710k1 = e500Var;
        }
        return this.f98710k1;
    }

    /* JADX INFO: renamed from: n0 */
    public final m500 m49715n0() {
        c600 c600Var = this.f98681T0;
        if (c600Var == null) {
            return null;
        }
        return (m500) c600Var.f34327Z;
    }

    /* JADX INFO: renamed from: o0 */
    public final c700 m49716o0() {
        if (this.f98681T0 != null) {
            return this.f98682U0;
        }
        throw new IllegalStateException(klh.m56835g("Fragment ", this, " has not been attached yet."));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f98702f1 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m49699V0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f98702f1 = true;
    }

    /* JADX INFO: renamed from: p0 */
    public final Context m49717p0() {
        c600 c600Var = this.f98681T0;
        if (c600Var == null) {
            return null;
        }
        return c600Var.f34324L0;
    }

    /* JADX INFO: renamed from: q0 */
    public final LayoutInflater m49718q0() {
        LayoutInflater layoutInflater = this.f98712m1;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterMo49695K0 = mo49695K0(null);
        this.f98712m1 = layoutInflaterMo49695K0;
        return layoutInflaterMo49695K0;
    }

    /* JADX INFO: renamed from: r0 */
    public final int m49719r0() {
        fb80 fb80Var = this.f98715p1;
        return (fb80Var == fb80.f67751b || this.f98683V0 == null) ? fb80Var.ordinal() : Math.min(fb80Var.ordinal(), this.f98683V0.m49719r0());
    }

    /* JADX INFO: renamed from: s0 */
    public final c700 m49720s0() {
        c700 c700Var = this.f98680S0;
        if (c700Var != null) {
            return c700Var;
        }
        throw new IllegalStateException(klh.m56835g("Fragment ", this, " not associated with a fragment manager."));
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.f98681T0 == null) {
            throw new IllegalStateException(klh.m56835g("Fragment ", this, " not attached to Activity"));
        }
        c700 c700VarM49720s0 = m49720s0();
        if (c700VarM49720s0.f34652E != null) {
            c700VarM49720s0.f34655H.addLast(new v600(this.f98699e, i));
            c700VarM49720s0.f34652E.mo24737a(intent);
        } else {
            c600 c600Var = c700VarM49720s0.f34689x;
            if (i == -1) {
                lzj.m60360f0(c600Var.f34324L0, intent);
            } else {
                c600Var.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final Resources m49721t0() {
        return m49702X0().getResources();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f98699e);
        if (this.f98684W0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f98684W0));
        }
        if (this.f98688Y0 != null) {
            sb.append(" tag=");
            sb.append(this.f98688Y0);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final String m49722u0(int i) {
        return m49721t0().getString(i);
    }

    /* JADX INFO: renamed from: v0 */
    public final i500 m49723v0(boolean z) {
        String str;
        if (z) {
            i800.m49894f(this);
        }
        i500 i500Var = this.f98703g;
        if (i500Var != null) {
            return i500Var;
        }
        c700 c700Var = this.f98680S0;
        if (c700Var == null || (str = this.f98705h) == null) {
            return null;
        }
        return c700Var.f34668c.m89872s(str);
    }

    @Override // p204p.ijc1
    /* JADX INFO: renamed from: w */
    public final hjc1 mo34134w() {
        if (this.f98680S0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m49719r0() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f98680S0.f34664Q.f150997d;
        hjc1 hjc1Var = (hjc1) map.get(this.f98699e);
        if (hjc1Var != null) {
            return hjc1Var;
        }
        hjc1 hjc1Var2 = new hjc1();
        map.put(this.f98699e, hjc1Var2);
        return hjc1Var2;
    }

    /* JADX INFO: renamed from: w0 */
    public final hc80 m49724w0() {
        y800 y800Var = this.f98717r1;
        if (y800Var != null) {
            return y800Var;
        }
        throw new IllegalStateException(klh.m56835g("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @Override // p204p.h9y0
    /* JADX INFO: renamed from: x */
    public final f9y0 mo34135x() {
        return this.f98721u1.m59915g();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m49725x0() {
        this.f98716q1 = new oc80(this, true);
        this.f98721u1 = ltx0.m59910e(this);
        this.f98720t1 = null;
        ArrayList arrayList = this.f98724x1;
        b500 b500Var = this.f98725y1;
        if (arrayList.contains(b500Var)) {
            return;
        }
        if (this.f98691a >= 0) {
            b500Var.mo28123a();
        } else {
            arrayList.add(b500Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m49726y0() {
        m49725x0();
        this.f98714o1 = this.f98699e;
        this.f98699e = UUID.randomUUID().toString();
        this.f98685X = false;
        this.f98687Y = false;
        this.f98674M0 = false;
        this.f98675N0 = false;
        this.f98677P0 = false;
        this.f98679R0 = 0;
        this.f98680S0 = null;
        this.f98682U0 = new j700();
        this.f98681T0 = null;
        this.f98684W0 = 0;
        this.f98686X0 = 0;
        this.f98688Y0 = null;
        this.f98690Z0 = false;
        this.f98692a1 = false;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m49727z0() {
        return this.f98681T0 != null && this.f98685X;
    }

    public i500(int i) {
        this();
        this.f98722v1 = i;
    }

    /* JADX INFO: renamed from: O0 */
    public void mo880O0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: R0 */
    public void mo881R0(View view, Bundle bundle) {
    }
}
