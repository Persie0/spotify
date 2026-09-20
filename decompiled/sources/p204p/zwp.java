package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Function;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class zwp extends ConstraintLayout implements kcm0 {

    /* JADX INFO: renamed from: p1 */
    public static final /* synthetic */ int f287018p1 = 0;

    /* JADX INFO: renamed from: R0 */
    public final z9p f287019R0;

    /* JADX INFO: renamed from: S0 */
    public final r6o0 f287020S0;

    /* JADX INFO: renamed from: T0 */
    public final y0i0 f287021T0;

    /* JADX INFO: renamed from: U0 */
    public final bcm0 f287022U0;

    /* JADX INFO: renamed from: V0 */
    public final i26 f287023V0;

    /* JADX INFO: renamed from: W0 */
    public final boolean f287024W0;

    /* JADX INFO: renamed from: X0 */
    public v3a0 f287025X0;

    /* JADX INFO: renamed from: Y0 */
    public final xoi0 f287026Y0;

    /* JADX INFO: renamed from: Z0 */
    public u9m0 f287027Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f287028a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f287029b1;

    /* JADX INFO: renamed from: c1 */
    public View f287030c1;

    /* JADX INFO: renamed from: d1 */
    public xjp f287031d1;

    /* JADX INFO: renamed from: e1 */
    public final ViewGroup f287032e1;

    /* JADX INFO: renamed from: f1 */
    public final jdb f287033f1;

    /* JADX INFO: renamed from: g1 */
    public final cx21 f287034g1;

    /* JADX INFO: renamed from: h1 */
    public m94 f287035h1;

    /* JADX INFO: renamed from: i1 */
    public final m94 f287036i1;

    /* JADX INFO: renamed from: j1 */
    public final m94 f287037j1;

    /* JADX INFO: renamed from: k1 */
    public final boolean f287038k1;

    /* JADX INFO: renamed from: l1 */
    public final uh00 f287039l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f287040m1;

    /* JADX INFO: renamed from: n1 */
    public mwx0 f287041n1;

    /* JADX INFO: renamed from: o1 */
    public final wwp f287042o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwp(Context context, z9p z9pVar, bcm0 bcm0Var, i26 i26Var, kk00 kk00Var, ndg1 ndg1Var, boolean z, rw71 rw71Var, rw71 rw71Var2, boolean z2, up9 up9Var) {
        super(context);
        context.getClass();
        fby.m41270e();
        r3a0 r3a0Var = r3a0.f195465a;
        this.f287025X0 = r3a0Var;
        this.f287026Y0 = new xoi0(r3a0Var);
        this.f287033f1 = new jdb(this, 1);
        this.f287042o1 = new wwp(this);
        this.f287022U0 = bcm0Var;
        if (bcm0Var != null) {
            bcm0Var.m28764j();
        }
        LayoutInflater.from(context).inflate(R.layout.pageloader, this);
        setId(R.id.page_loader_view);
        this.f287032e1 = (ViewGroup) findViewById(R.id.content);
        this.f287034g1 = r46.m74713F((ConstraintLayout) findViewById(R.id.toast_stub), new mo4(this, 17));
        if (bcm0Var != null) {
            bcm0Var.m28763i();
        }
        this.f287019R0 = z9pVar;
        if (((b5a0) z9pVar.f280845d) == null) {
            ((uh00) z9pVar.f280844c).getClass();
        }
        ((qir0) z9pVar.f280843b).getClass();
        this.f287020S0 = (r6o0) ((qir0) z9pVar.f280843b).get();
        this.f287021T0 = new y0i0(getResources(), rw71Var, rw71Var2, 4);
        this.f287023V0 = i26Var;
        this.f287024W0 = z;
        this.f287038k1 = z2;
        this.f287039l1 = up9Var;
        this.f287036i1 = new m94(19, this, kk00Var);
        this.f287037j1 = new m94(20, this, ndg1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(v3a0 v3a0Var) {
        u9m0 u9m0VarM97151D;
        xul0 hzq0Var;
        r6o0 r6o0Var = this.f287020S0;
        v3a0Var.getClass();
        if (v3a0Var.getClass() == this.f287025X0.getClass()) {
            return;
        }
        v3a0 v3a0Var2 = this.f287025X0;
        bcm0 bcm0Var = this.f287022U0;
        if (bcm0Var != null) {
            if (v3a0Var.mo66186c()) {
                bcm0Var.m28760f();
            } else {
                if ((v3a0Var.mo60646h() || v3a0Var.mo72065a() || v3a0Var.mo68998e() || v3a0Var.mo79983d() || v3a0Var.mo52253g()) && (v3a0Var2 == null || !v3a0Var2.mo66186c())) {
                    bcm0Var.m28760f();
                }
                if (v3a0Var.mo60646h()) {
                    bcm0Var.m28759e();
                } else if (v3a0Var.mo72065a() || v3a0Var.mo68998e() || v3a0Var.mo79983d() || v3a0Var.mo52253g()) {
                    bcm0Var.m28758d();
                }
                inl0.m51135a(this, new wpa1(4, new C2245p6(this, 11), this));
            }
        }
        try {
            u9m0VarM97151D = m97151D(v3a0Var);
        } catch (Exception e) {
            v3a0Var = fby.m41271g(e);
            u9m0VarM97151D = r6o0Var;
        }
        v3a0 v3a0Var3 = v3a0Var;
        if (bcm0Var != null && ((v3a0Var3 instanceof m3a0) || (v3a0Var3 instanceof t3a0))) {
            bcm0Var.m28757c();
        }
        boolean zMo60646h = v3a0Var3.mo60646h();
        ViewGroup viewGroup = this.f287032e1;
        if (zMo60646h || v3a0Var3.mo72065a() || v3a0Var3.mo52253g()) {
            lhg1.m58983j(viewGroup);
        } else if (!this.f287024W0 || this.f287027Z0 != null) {
            lhg1.m58984k(viewGroup);
        }
        u9m0 u9m0Var = this.f287027Z0;
        if (u9m0VarM97151D == u9m0Var) {
            this.f287025X0 = v3a0Var3;
        } else {
            if (u9m0Var != null) {
                m97150C();
                if (this.f287028a1) {
                    viewGroup.removeView(this.f287030c1);
                    this.f287030c1 = null;
                    this.f287028a1 = false;
                }
                this.f287027Z0 = null;
            }
            this.f287025X0 = v3a0Var3;
            this.f287027Z0 = u9m0VarM97151D;
            if (!this.f287028a1) {
                Context context = getContext();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                xjp xjpVar = this.f287031d1;
                u9m0VarM97151D.mo59670e(context, xjpVar != null ? (Bundle) xjpVar.f262184c : null, layoutInflaterFrom, viewGroup);
                u9m0 u9m0Var2 = this.f287027Z0;
                View view = u9m0Var2.getView();
                ViewParent parent = view.getParent();
                if (parent != null) {
                    Class<?> cls = parent.getClass();
                    Class<?> cls2 = u9m0Var2.getClass();
                    IllegalStateException illegalStateException = new IllegalStateException("PageElement's view already has a parent.");
                    StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 4];
                    System.arraycopy(stackTrace, 0, stackTraceElementArr, 4, stackTrace.length);
                    stackTraceElementArr[0] = new StackTraceElement(cls.getName(), "", "", 0);
                    stackTraceElementArr[1] = new StackTraceElement("[[ The view is attached to a parent of type ↑↑ ]]", "", "", 0);
                    stackTraceElementArr[2] = new StackTraceElement(cls2.getName(), "", "", 0);
                    stackTraceElementArr[3] = new StackTraceElement("[[ The concrete PageElement implementation ↑↑ ]]", "", "", 0);
                    illegalStateException.setStackTrace(stackTraceElementArr);
                    throw illegalStateException;
                }
                viewGroup.addView(view);
                this.f287030c1 = view;
                this.f287028a1 = true;
            }
            m97149B();
        }
        if (this.f287027Z0 == r6o0Var) {
            r6o0Var.mo29574a(v3a0Var3.mo66186c());
        } else if (v3a0Var3.mo60646h() || v3a0Var3.mo72065a() || v3a0Var3.mo52253g()) {
            r6o0Var.mo29574a(false);
        }
        y0i0 y0i0Var = this.f287021T0;
        Resources resources = (Resources) y0i0Var.f267991d;
        r3a0 r3a0Var = r3a0.f195465a;
        boolean zEquals = v3a0Var3.equals(r3a0Var);
        q3a0 q3a0Var = q3a0.f184828a;
        o3a0 o3a0Var = o3a0.f161331a;
        xul0 xul0VarM92201d = C2244p5.f174033a;
        if (zEquals || v3a0Var3.equals(o3a0Var) || (v3a0Var3 instanceof m3a0) || v3a0Var3.equals(q3a0Var) || (v3a0Var3 instanceof j3a0) || (v3a0Var3 instanceof s3a0)) {
            hzq0Var = xul0VarM92201d;
        } else if (v3a0Var3 instanceof p3a0) {
            xgj0 xgj0Var = ((p3a0) v3a0Var3).f173597b;
            rw71 rw71Var = (rw71) y0i0Var.f267989b;
            if (rw71Var == null) {
                int iOrdinal = xgj0Var.ordinal();
                if (iOrdinal == 0) {
                    rw71Var = new rw71(resources.getString(R.string.pageloader_network_error_forced_offline_title), resources.getString(R.string.pageloader_network_error_forced_offline_description));
                } else if (iOrdinal == 1) {
                    rw71Var = new rw71(resources.getString(R.string.pageloader_network_error_airplane_mode_title), resources.getString(R.string.pageloader_network_error_airplane_mode_description));
                } else if (iOrdinal == 2) {
                    rw71Var = new rw71(resources.getString(R.string.pageloader_network_error_no_network_connection_title), resources.getString(R.string.pageloader_network_error_no_network_connection_description));
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rw71Var = new rw71(resources.getString(R.string.pageloader_network_error_unknown_title), resources.getString(R.string.pageloader_network_error_unknown_description));
                }
            }
            hzq0Var = new hzq0(rw71Var);
        } else {
            if (!(v3a0Var3 instanceof t3a0)) {
                throw new NoWhenBranchMatchedException();
            }
            rw71 rw71Var2 = (rw71) y0i0Var.f267990c;
            if (rw71Var2 == null) {
                rw71Var2 = new rw71(resources.getString(R.string.pageloader_something_went_wrong_title), resources.getString(R.string.pageloader_something_went_wrong_description));
            }
            hzq0Var = new hzq0(rw71Var2);
        }
        Resources resources2 = (Resources) y0i0Var.f267991d;
        if (!v3a0Var3.equals(r3a0Var) && !v3a0Var3.equals(o3a0Var) && !(v3a0Var3 instanceof m3a0) && !v3a0Var3.equals(q3a0Var) && !(v3a0Var3 instanceof j3a0) && !(v3a0Var3 instanceof s3a0)) {
            if (v3a0Var3 instanceof p3a0) {
                int iOrdinal2 = ((p3a0) v3a0Var3).f173597b.ordinal();
                if (iOrdinal2 == 0) {
                    xul0VarM92201d = xul0.m92201d(resources2.getString(R.string.pageloader_network_error_forced_offline_button));
                } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    xul0VarM92201d = xul0.m92200a(Build.VERSION.SDK_INT >= 29 ? resources2.getString(R.string.pageloader_network_error_connected_button) : null);
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xul0VarM92201d = xul0.m92201d(resources2.getString(R.string.pageloader_network_error_button));
                }
            } else {
                if (!(v3a0Var3 instanceof t3a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                xul0VarM92201d = xul0.m92201d(resources2.getString(R.string.pageloader_something_went_wrong_button));
            }
        }
        String str = (String) xul0VarM92201d.mo49283h();
        boolean zMo49279c = hzq0Var.mo49279c();
        cx21 cx21Var = this.f287034g1;
        if (zMo49279c) {
            cx21Var.m34192N((rw71) hzq0Var.mo49278b(), str);
            if (this.f287023V0 != null) {
                v3a0Var3.mo52254i(new twp(0), new twp(1), new twp(2), new twp(3), new twp(4), new uwp(this, 0), new twp(5), new uwp(this, 1));
            }
        } else {
            cx21Var.m34185C();
        }
        if (bcm0Var != null && ((v3a0Var3 instanceof m3a0) || (v3a0Var3 instanceof t3a0))) {
            bcm0Var.m28756b();
        }
        this.f287026Y0.mo33104m(v3a0Var3);
    }

    /* JADX INFO: renamed from: z */
    public static void m97148z(v3a0 v3a0Var, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(s571.m77251j("factory for ", String.valueOf(v3a0Var), " is not specified"));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m97149B() {
        Bundle bundle;
        if (!this.f287040m1 || this.f287029b1) {
            return;
        }
        if (this.f287031d1 != null && this.f287025X0.mo60646h()) {
            ViewGroup viewGroup = this.f287032e1;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                try {
                    childAt.restoreHierarchyState((SparseArray) this.f287031d1.f262183b);
                } catch (Exception e) {
                    usg1.m83896o(childAt);
                    throw new RuntimeException("Failed to restore, but also failed to find the conflicting ids", e);
                }
            }
            u9m0 u9m0Var = this.f287027Z0;
            if ((u9m0Var instanceof kx41) && (bundle = (Bundle) this.f287031d1.f262184c) != null) {
                ((kx41) u9m0Var).mo57584d(bundle);
            }
            this.f287031d1 = null;
        }
        this.f287027Z0.start();
        this.f287029b1 = true;
    }

    /* JADX INFO: renamed from: C */
    public final void m97150C() {
        if (this.f287029b1) {
            m97152E();
            this.f287027Z0.stop();
            this.f287029b1 = false;
        }
    }

    /* JADX INFO: renamed from: D */
    public final u9m0 m97151D(v3a0 v3a0Var) {
        final int i = 3;
        Function function = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i2 = 4;
        Function function2 = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i2) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i3 = 5;
        Function function3 = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i3) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i4 = 6;
        Function function4 = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i4) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i5 = 7;
        Function function5 = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i5) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i6 = 0;
        Function function6 = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i6) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i7 = 1;
        Function function7 = new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i7) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        };
        final int i8 = 2;
        return (u9m0) v3a0Var.mo52252f(function, function2, function3, function4, function5, function6, function7, new Function(this) { // from class: p.swp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zwp f214699b;

            {
                this.f214699b = this;
            }

            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                u9m0 u9m0VarMo31464f;
                Bundle bundle;
                switch (i8) {
                    case 0:
                        return this.f214699b.f287020S0;
                    case 1:
                        s3a0 s3a0Var = (s3a0) obj;
                        s3a0Var.getClass();
                        zwp zwpVar = this.f214699b;
                        z9p z9pVar = zwpVar.f287019R0;
                        zwp.m97148z(s3a0Var, (rb9) z9pVar.f280848g);
                        return (u9m0) ((rb9) z9pVar.f280848g).apply(s3a0Var, new vwp(zwpVar));
                    case 2:
                        return this.f214699b.f287020S0;
                    case 3:
                        return this.f214699b.f287020S0;
                    case 4:
                        return this.f214699b.f287020S0;
                    case 5:
                        m3a0 m3a0Var = (m3a0) obj;
                        zwp zwpVar2 = this.f214699b;
                        z9p z9pVar2 = zwpVar2.f287019R0;
                        if (((b5a0) z9pVar2.f280845d) != null) {
                            xjp xjpVar = zwpVar2.f287031d1;
                            if (xjpVar == null || (bundle = (Bundle) xjpVar.f262185d) == null) {
                                bundle = new Bundle();
                            }
                            Object obj2 = m3a0Var.f139579a;
                            b5a0 b5a0Var = (b5a0) z9pVar2.f280845d;
                            b5a0Var.getClass();
                            c5a0 c5a0Var = b5a0Var.f23533a;
                            z5a0 z5a0VarM53257C = jg31.m53257C(c5a0Var.f34112a, bundle);
                            c5a0Var.f34120i = z5a0VarM53257C;
                            z5a0 z5a0Var = z5a0VarM53257C.f279523e;
                            y5a0 y5a0Var = c5a0Var.f34118g;
                            if (y5a0Var != null) {
                                y85.m93047D(y5a0Var.f269382a, z5a0Var);
                            }
                            u9m0VarMo31464f = c5a0Var.mo31464f(obj2, z5a0VarM53257C);
                        } else {
                            zwp.m97148z(m3a0Var, (uh00) z9pVar2.f280844c);
                            u9m0VarMo31464f = (u9m0) ((uh00) z9pVar2.f280844c).apply(m3a0Var.f139579a);
                        }
                        if (u9m0VarMo31464f.getView() != null) {
                            Logger.m3973i("Your loaded PageElement %s has a view before being initialized. This might indicate that you are reusing injected views instead of creating a new one in initView", u9m0VarMo31464f);
                        }
                        return u9m0VarMo31464f;
                    case 6:
                        q3a0 q3a0Var = (q3a0) obj;
                        q3a0Var.getClass();
                        z9p z9pVar3 = this.f214699b.f287019R0;
                        zwp.m97148z(q3a0Var, (qir0) z9pVar3.f280846e);
                        return (u9m0) ((qir0) z9pVar3.f280846e).get();
                    default:
                        j3a0 j3a0Var = (j3a0) obj;
                        z9p z9pVar4 = this.f214699b.f287019R0;
                        zwp.m97148z(j3a0Var, (uh00) z9pVar4.f280847f);
                        return (u9m0) ((uh00) z9pVar4.f280847f).apply(j3a0Var.f108329a);
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m97152E() {
        if (this.f287025X0.mo60646h()) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ViewGroup viewGroup = this.f287032e1;
            if (viewGroup.getChildCount() > 0) {
                viewGroup.getChildAt(0).saveHierarchyState(sparseArray);
            }
            u9m0 u9m0Var = this.f287027Z0;
            Bundle bundleMo57585f = u9m0Var instanceof kx41 ? ((kx41) u9m0Var).mo57585f() : null;
            uh00 uh00Var = this.f287039l1;
            this.f287031d1 = new xjp(sparseArray, bundleMo57585f, uh00Var != null ? (Bundle) uh00Var.apply(w2a1.f247311a) : null, 5);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m97153F(hc80 hc80Var, mwx0 mwx0Var) {
        mwx0Var.getClass();
        mwx0 mwx0Var2 = this.f287041n1;
        jdb jdbVar = this.f287033f1;
        if (mwx0Var2 != null) {
            mwx0Var2.f147895b.mo33102k(jdbVar);
        }
        this.f287041n1 = mwx0Var;
        this.f287035h1 = new m94(18, this, mwx0Var);
        if (this.f287024W0) {
            fby.m41268c();
            setState(o3a0.f161331a);
        }
        mwx0Var.f147895b.m33100g(jdbVar);
        hc80Var.getLifecycle().mo31986a(this.f287042o1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public u9m0 getCurrentPageElement() {
        return this.f287027Z0;
    }

    public ck90 getRenderedState() {
        return this.f287026Y0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bcm0 bcm0Var = this.f287022U0;
        if (bcm0Var != null) {
            bcm0Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f287027Z0 != null) {
            m97150C();
            if (this.f287028a1) {
                this.f287032e1.removeView(this.f287030c1);
                this.f287030c1 = null;
                this.f287028a1 = false;
            }
        }
        bcm0 bcm0Var = this.f287022U0;
        if (bcm0Var != null) {
            bcm0Var.m28765k();
        }
        mwx0 mwx0Var = this.f287041n1;
        if (mwx0Var != null) {
            mwx0Var.f147895b.mo33102k(this.f287033f1);
            this.f287041n1 = null;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle;
        ywp ywpVar = (ywp) parcelable;
        super.onRestoreInstanceState(ywpVar.getSuperState());
        bcm0 bcm0Var = this.f287022U0;
        if (bcm0Var != null && (bundle = ywpVar.f277021b) != null) {
            bcm0Var.m28761g(bundle);
        }
        this.f287031d1 = ywpVar.f277020a;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ywp ywpVar = new ywp(super.onSaveInstanceState());
        m97152E();
        ywpVar.f277020a = this.f287031d1;
        bcm0 bcm0Var = this.f287022U0;
        if (bcm0Var != null) {
            ywpVar.f277021b = bcm0Var.m28762h();
        }
        return ywpVar;
    }
}
