package p204p;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class fpc1 {

    /* JADX INFO: renamed from: a */
    public final rb20 f71801a;

    /* JADX INFO: renamed from: b */
    public final wy3 f71802b;

    /* JADX INFO: renamed from: c */
    public View f71803c;

    /* JADX INFO: renamed from: d */
    public eh00 f71804d;

    /* JADX INFO: renamed from: e */
    public Object f71805e;

    /* JADX INFO: renamed from: f */
    public boolean f71806f;

    /* JADX INFO: renamed from: g */
    public gb80 f71807g;

    /* JADX INFO: renamed from: h */
    public final ne2 f71808h;

    /* JADX INFO: renamed from: i */
    public final ay1 f71809i;

    /* JADX INFO: renamed from: j */
    public final by1 f71810j;

    /* JADX INFO: renamed from: k */
    public final Handler f71811k;

    /* JADX INFO: renamed from: l */
    public c9k f71812l;

    /* JADX INFO: renamed from: m */
    public long f71813m;

    /* JADX INFO: renamed from: n */
    public boolean f71814n;

    /* JADX INFO: renamed from: o */
    public final n081 f71815o;

    /* JADX INFO: renamed from: p */
    public boolean f71816p;

    /* JADX INFO: renamed from: q */
    public Object f71817q;

    /* JADX INFO: renamed from: r */
    public siv0 f71818r;

    /* JADX INFO: renamed from: s */
    public int f71819s;

    /* JADX INFO: renamed from: t */
    public final int[] f71820t;

    /* JADX INFO: renamed from: u */
    public Boolean f71821u;

    /* JADX INFO: renamed from: v */
    public boolean f71822v;

    public fpc1() {
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a;
        wy3 wy3Var = new wy3();
        this.f71801a = rb20Var;
        this.f71802b = wy3Var;
        this.f71804d = pib1.f177892T0;
        this.f71805e = hhc1.f91328L0;
        this.f71808h = new ne2(this, 23);
        this.f71809i = new ay1(this, 27);
        this.f71810j = new by1(this, 4);
        this.f71811k = new Handler(Looper.getMainLooper());
        this.f71815o = new n081(this, 13);
        this.f71816p = true;
        this.f71817q = hhc1.f91344Z;
        siv0 siv0Var = siv0.f209669e;
        vyg1.m86774n();
        this.f71818r = siv0.f209669e;
        this.f71820t = new int[2];
    }

    /* JADX INFO: renamed from: a */
    public final void m42325a() {
        if (this.f71803c == null || wj50.m88271j(this.f71821u, Boolean.FALSE)) {
            return;
        }
        this.f71802b.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = 10 - (jUptimeMillis - this.f71813m);
        n081 n081Var = this.f71815o;
        Handler handler = this.f71811k;
        if (j > 0) {
            if (this.f71814n) {
                return;
            }
            this.f71814n = true;
            handler.postDelayed(n081Var, j);
            return;
        }
        if (this.f71814n) {
            handler.removeCallbacks(n081Var);
            this.f71814n = false;
        }
        this.f71813m = jUptimeMillis;
        m42327c();
    }

    /* JADX INFO: renamed from: b */
    public final void m42326b() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f71803c;
        if (view == null) {
            return;
        }
        if (this.f71822v) {
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.f71810j);
            }
            this.f71822v = false;
        }
        View view2 = this.f71803c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this.f71809i);
        }
        gb80 gb80Var = this.f71807g;
        if (gb80Var != null) {
            gb80Var.mo31988d(this.f71808h);
        }
        if (this.f71814n) {
            this.f71811k.removeCallbacks(this.f71815o);
            this.f71814n = false;
        }
        c9k c9kVar = this.f71812l;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f71812l = null;
        this.f71803c = null;
        this.f71804d = pib1.f177892T0;
        siv0 siv0Var = siv0.f209669e;
        vyg1.m86774n();
        m42328d(siv0.f209669e, 0);
        this.f71805e = hhc1.f91328L0;
        this.f71817q = hhc1.f91344Z;
        this.f71806f = false;
        this.f71816p = true;
        this.f71821u = null;
        this.f71813m = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m42327c() {
        int iM78243b;
        View view;
        View view2;
        gb80 gb80Var;
        fb80 fb80VarMo31987b;
        siv0 siv0Var;
        View view3 = this.f71803c;
        siv0 siv0Var2 = siv0.f209669e;
        vyg1.m86774n();
        siv0 siv0VarM65843v = siv0.f209669e;
        if (view3 == null || (view = this.f71803c) == null || !view.isAttachedToWindow() || !this.f71806f || (view2 = this.f71803c) == null || !view2.isShown() || wj50.m88271j(this.f71821u, Boolean.FALSE) || (gb80Var = this.f71807g) == null || (fb80VarMo31987b = gb80Var.mo31987b()) == null || !fb80VarMo31987b.m41223a(fb80.f67753d) || !this.f71816p || isg1.m51535o(view3) || (siv0Var = (siv0) this.f71804d.invoke()) == null) {
            iM78243b = 0;
        } else {
            siv0VarM65843v = nxf1.m65843v(view3, this.f71820t);
            iM78243b = siv0VarM65843v.m78243b(siv0Var);
        }
        m42328d(siv0VarM65843v, iM78243b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p.gh00] */
    /* JADX INFO: renamed from: d */
    public final void m42328d(siv0 siv0Var, int i) {
        if (this.f71819s != i) {
            this.f71805e.invoke(Integer.valueOf(i));
        }
        if (!wj50.m88271j(this.f71818r, siv0Var)) {
            this.f71817q.invoke(siv0Var);
        }
        this.f71819s = i;
        this.f71818r = siv0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m42329e(View view, eh00 eh00Var, i7t0 i7t0Var, gh00 gh00Var, gh00 gh00Var2) {
        ViewTreeObserver viewTreeObserver;
        gb80 lifecycle;
        if (this.f71803c != null || this.f71804d.invoke() != null) {
            throw new IllegalStateException("startTracking can not be used more than once unless endTracking is called!");
        }
        hc80 hc80VarM40067h = eug1.m40067h(view);
        if (hc80VarM40067h != null && (lifecycle = hc80VarM40067h.getLifecycle()) != null) {
            gb80 gb80Var = this.f71807g;
            ne2 ne2Var = this.f71808h;
            if (gb80Var != null) {
                gb80Var.mo31988d(ne2Var);
            }
            this.f71807g = lifecycle;
            lifecycle.mo31986a(ne2Var);
        }
        this.f71803c = view;
        this.f71804d = eh00Var;
        this.f71805e = gh00Var;
        this.f71817q = gh00Var2;
        if (i7t0Var != null) {
            c9k c9kVarM56661c = kk40.m56661c(this.f71801a);
            this.f71812l = c9kVarM56661c;
            x0h1.m89578u(c9kVarM56661c, null, 0, new njb0(i7t0Var, this, (fbk) null), 3);
        }
        if (!this.f71822v) {
            View view2 = this.f71803c;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnScrollChangedListener(this.f71810j);
            }
            this.f71822v = true;
        }
        view.addOnAttachStateChangeListener(this.f71809i);
        inl0.m51135a(view, new vpa1(5, view, this));
    }
}
