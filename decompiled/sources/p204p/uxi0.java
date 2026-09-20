package p204p;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uxi0 implements hc80, ijc1, fd20, h9y0 {

    /* JADX INFO: renamed from: X */
    public final wg61 f234932X;

    /* JADX INFO: renamed from: Y */
    public fb80 f234933Y;

    /* JADX INFO: renamed from: Z */
    public final n9y0 f234934Z;

    /* JADX INFO: renamed from: a */
    public final Context f234935a;

    /* JADX INFO: renamed from: b */
    public jyi0 f234936b;

    /* JADX INFO: renamed from: c */
    public final Bundle f234937c;

    /* JADX INFO: renamed from: d */
    public fb80 f234938d;

    /* JADX INFO: renamed from: e */
    public final dyi0 f234939e;

    /* JADX INFO: renamed from: f */
    public final String f234940f;

    /* JADX INFO: renamed from: g */
    public final Bundle f234941g;

    /* JADX INFO: renamed from: h */
    public final oc80 f234942h = new oc80(this, true);

    /* JADX INFO: renamed from: i */
    public final ltx0 f234943i = huf1.m48651k(this);

    /* JADX INFO: renamed from: t */
    public boolean f234944t;

    static {
        new x74(18);
    }

    public uxi0(Context context, jyi0 jyi0Var, Bundle bundle, fb80 fb80Var, dyi0 dyi0Var, String str, Bundle bundle2) {
        this.f234935a = context;
        this.f234936b = jyi0Var;
        this.f234937c = bundle;
        this.f234938d = fb80Var;
        this.f234939e = dyi0Var;
        this.f234940f = str;
        this.f234941g = bundle2;
        wg61 wg61Var = new wg61(new txi0(this, 0));
        this.f234932X = new wg61(new txi0(this, 1));
        this.f234933Y = fb80.f67751b;
        this.f234934Z = (n9y0) wg61Var.getValue();
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: S */
    public final vic1 mo34125S() {
        return this.f234934Z;
    }

    @Override // p204p.fd20
    /* JADX INFO: renamed from: T */
    public final koi0 mo34126T() {
        koi0 koi0Var = new koi0(0);
        Context context = this.f234935a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            koi0Var.m56998a(tic1.f220605d, application);
        }
        koi0Var.m56998a(gyf1.f85601a, this);
        koi0Var.m56998a(gyf1.f85602b, this);
        Bundle bundleM84175a = m84175a();
        if (bundleM84175a != null) {
            koi0Var.m56998a(gyf1.f85603c, bundleM84175a);
        }
        return koi0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m84175a() {
        Bundle bundle = this.f234937c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final void m84176b(fb80 fb80Var) {
        this.f234933Y = fb80Var;
        m84177c();
    }

    /* JADX INFO: renamed from: c */
    public final void m84177c() {
        if (!this.f234944t) {
            ltx0 ltx0Var = this.f234943i;
            ltx0Var.m59917j();
            this.f234944t = true;
            if (this.f234939e != null) {
                gyf1.m46149o(this);
            }
            ltx0Var.m59918k(this.f234941g);
        }
        int iOrdinal = this.f234938d.ordinal();
        int iOrdinal2 = this.f234933Y.ordinal();
        oc80 oc80Var = this.f234942h;
        if (iOrdinal < iOrdinal2) {
            oc80Var.m66678i(this.f234938d);
        } else {
            oc80Var.m66678i(this.f234933Y);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof uxi0)) {
            uxi0 uxi0Var = (uxi0) obj;
            Bundle bundle = uxi0Var.f234937c;
            if (wj50.m88271j(this.f234940f, uxi0Var.f234940f) && wj50.m88271j(this.f234936b, uxi0Var.f234936b) && wj50.m88271j(this.f234942h, uxi0Var.f234942h) && wj50.m88271j(this.f234943i.m59915g(), uxi0Var.f234943i.m59915g())) {
                Bundle bundle2 = this.f234937c;
                if (wj50.m88271j(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!wj50.m88271j(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f234942h;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f234936b.hashCode() + (this.f234940f.hashCode() * 31);
        Bundle bundle = this.f234937c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f234943i.m59915g().hashCode() + ((this.f234942h.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(uxi0.class.getSimpleName());
        sb.append("(" + this.f234940f + ')');
        sb.append(" destination=");
        sb.append(this.f234936b);
        return sb.toString();
    }

    @Override // p204p.ijc1
    /* JADX INFO: renamed from: w */
    public final hjc1 mo34134w() {
        if (!this.f234944t) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f234942h.f163857d == fb80.f67750a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        dyi0 dyi0Var = this.f234939e;
        if (dyi0Var != null) {
            return dyi0Var.m37343e(this.f234940f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @Override // p204p.h9y0
    /* JADX INFO: renamed from: x */
    public final f9y0 mo34135x() {
        return this.f234943i.m59915g();
    }
}
