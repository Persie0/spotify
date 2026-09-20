package p204p;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f9y0 {

    /* JADX INFO: renamed from: a */
    public final g9y0 f67389a;

    /* JADX INFO: renamed from: b */
    public C1982ik f67390b;

    public f9y0(g9y0 g9y0Var) {
        this.f67389a = g9y0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m41108a(String str) {
        g9y0 g9y0Var = this.f67389a;
        if (!g9y0Var.f77925g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = g9y0Var.f77924f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM92013A = xtf1.m92050y(str, bundle) ? xtf1.m92013A(str, bundle) : null;
        bundle.remove(str);
        if (xtf1.m92015C(bundle)) {
            g9y0Var.f77924f = null;
        }
        return bundleM92013A;
    }

    /* JADX INFO: renamed from: b */
    public final e9y0 m41109b(String str) {
        e9y0 e9y0Var;
        g9y0 g9y0Var = this.f67389a;
        synchronized (g9y0Var.f77921c) {
            Iterator it = g9y0Var.f77922d.entrySet().iterator();
            do {
                e9y0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                e9y0 e9y0Var2 = (e9y0) entry.getValue();
                if (wj50.m88271j(str2, str)) {
                    e9y0Var = e9y0Var2;
                }
            } while (e9y0Var == null);
        }
        return e9y0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m41110c(String str, e9y0 e9y0Var) {
        g9y0 g9y0Var = this.f67389a;
        synchronized (g9y0Var.f77921c) {
            if (g9y0Var.f77922d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            g9y0Var.f77922d.put(str, e9y0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m41111d() {
        if (!this.f67389a.f77926h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1982ik c1982ik = this.f67390b;
        if (c1982ik == null) {
            c1982ik = new C1982ik(this);
        }
        this.f67390b = c1982ik;
        try {
            i480.class.getDeclaredConstructor(null);
            C1982ik c1982ik2 = this.f67390b;
            if (c1982ik2 != null) {
                c1982ik2.m50848a(i480.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + i480.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m41112e(String str) {
        g9y0 g9y0Var = this.f67389a;
        synchronized (g9y0Var.f77921c) {
        }
    }
}
