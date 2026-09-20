package p204p;

import android.os.Looper;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class g9j0 {

    /* JADX INFO: renamed from: a */
    public final ub80 f77805a;

    /* JADX INFO: renamed from: b */
    public final boolean f77806b;

    /* JADX INFO: renamed from: c */
    public final long f77807c;

    /* JADX INFO: renamed from: d */
    public final long f77808d;

    /* JADX INFO: renamed from: e */
    public final long f77809e;

    /* JADX INFO: renamed from: f */
    public f9j0 f77810f;

    /* JADX INFO: renamed from: g */
    public final bqa f77811g;

    /* JADX INFO: renamed from: h */
    public boolean f77812h;

    /* JADX INFO: renamed from: i */
    public final hb11 f77813i;

    /* JADX INFO: renamed from: j */
    public final luu0 f77814j;

    public g9j0(m500 m500Var, aii0 aii0Var) {
        ub80 ub80VarM63737m = n5h1.m63737m(m500Var);
        boolean zM26104d = aii0Var.m26104d();
        this.f77805a = ub80VarM63737m;
        this.f77806b = zM26104d;
        this.f77807c = 100L;
        this.f77808d = 2000L;
        this.f77809e = 3000L;
        this.f77810f = new c9j0(nau.f152117a);
        this.f77811g = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        hb11 hb11VarM52092t = j0g1.m52092t(1, 0, 0, 6);
        this.f77813i = hb11VarM52092t;
        this.f77814j = bzf1.m31020l(hb11VarM52092t);
    }

    /* JADX INFO: renamed from: d */
    public static void m44050d() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null && !wj50.m88271j(Looper.myLooper(), mainLooper)) {
            throw new IllegalStateException("NavigationTransactionCoordinator must be called on the main thread");
        }
    }

    /* JADX INFO: renamed from: a */
    public final gzi0 m44051a(p9j0 p9j0Var) {
        m44050d();
        return !this.f77806b ? new gzi0(UUID.randomUUID()) : m44052b(p9j0Var, false);
    }

    /* JADX INFO: renamed from: b */
    public final gzi0 m44052b(p9j0 p9j0Var, boolean z) {
        d9j0 d9j0Var;
        UUID uuidRandomUUID = UUID.randomUUID();
        gzi0 gzi0Var = new gzi0(uuidRandomUUID);
        di41 di41VarM89578u = x0h1.m89578u(this.f77805a, null, 2, new rph0(this, gzi0Var, null, 17), 1);
        b9j0 b9j0Var = new b9j0(gzi0Var, false, z, di41VarM89578u);
        f9j0 f9j0Var = this.f77810f;
        if (f9j0Var instanceof c9j0) {
            d9j0Var = new d9j0(uuidRandomUUID, p9j0Var, Collections.singletonList(b9j0Var), ((c9j0) f9j0Var).f35577a);
        } else if (f9j0Var instanceof d9j0) {
            d9j0 d9j0Var2 = (d9j0) f9j0Var;
            d9j0Var = d9j0.m35374a(d9j0Var2, g6f.m43701O0(b9j0Var, d9j0Var2.f46847c), null, 11);
        } else {
            if (!(f9j0Var instanceof e9j0)) {
                throw new NoWhenBranchMatchedException();
            }
            d9j0Var = new d9j0(uuidRandomUUID, p9j0Var, Collections.singletonList(b9j0Var), ((e9j0) f9j0Var).f57459c);
        }
        this.f77810f = d9j0Var;
        if (f9j0Var instanceof e9j0) {
            m44058i((e9j0) f9j0Var);
        }
        di41VarM89578u.start();
        return gzi0Var;
    }

    /* JADX INFO: renamed from: c */
    public final gzi0 m44053c(k9j0 k9j0Var) {
        m44050d();
        return !this.f77806b ? new gzi0(UUID.randomUUID()) : m44052b(k9j0Var, true);
    }

    /* JADX INFO: renamed from: e */
    public final void m44054e(gzi0 gzi0Var) {
        Object next;
        UUID uuid = gzi0Var.f85957a;
        m44050d();
        if (this.f77806b) {
            f9j0 f9j0Var = this.f77810f;
            d9j0 d9j0Var = f9j0Var instanceof d9j0 ? (d9j0) f9j0Var : null;
            if (d9j0Var == null) {
                return;
            }
            List<b9j0> list = d9j0Var.f46847c;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((b9j0) next).f24951a.f85957a.equals(uuid));
            b9j0 b9j0Var = (b9j0) next;
            if (b9j0Var == null) {
                return;
            }
            b9j0Var.f24954d.mo26601e(null);
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (b9j0 b9j0Var2 : list) {
                if (b9j0Var2.f24951a.f85957a.equals(uuid)) {
                    b9j0Var2 = new b9j0(b9j0Var2.f24951a, true, false, b9j0Var2.f24954d);
                }
                arrayList.add(b9j0Var2);
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!((b9j0) it2.next()).f24952b) {
                        this.f77810f = d9j0.m35374a(d9j0Var, arrayList, null, 11);
                        return;
                    }
                }
            }
            UUID uuid2 = d9j0Var.f46845a;
            p9j0 p9j0Var = d9j0Var.f46846b;
            Map map = d9j0Var.f46848d;
            di41 di41VarM44059j = m44059j(uuid2, this.f77807c);
            di41 di41VarM44059j2 = m44059j(uuid2, this.f77808d);
            this.f77810f = new e9j0(uuid2, p9j0Var, map, di41VarM44059j, di41VarM44059j2);
            di41VarM44059j.start();
            di41VarM44059j2.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public final luu0 m44055f() {
        return this.f77814j;
    }

    /* JADX INFO: renamed from: g */
    public final void m44056g(gzi0 gzi0Var) {
        List list;
        m44050d();
        if (this.f77806b) {
            f9j0 f9j0Var = this.f77810f;
            Object obj = null;
            d9j0 d9j0Var = f9j0Var instanceof d9j0 ? (d9j0) f9j0Var : null;
            if (d9j0Var == null || (list = d9j0Var.f46847c) == null) {
                return;
            }
            for (Object obj2 : list) {
                b9j0 b9j0Var = (b9j0) obj2;
                if (b9j0Var.f24951a.f85957a.equals(gzi0Var.f85957a) && b9j0Var.f24953c && !b9j0Var.f24952b) {
                    obj = obj2;
                    break;
                }
            }
            b9j0 b9j0Var2 = (b9j0) obj;
            if (b9j0Var2 == null) {
                return;
            }
            m44054e(b9j0Var2.f24951a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m44057h(Map map) {
        m44050d();
        if (this.f77806b) {
            f9j0 f9j0Var = this.f77810f;
            boolean z = f9j0Var instanceof c9j0;
            long j = this.f77807c;
            if (z) {
                UUID uuidRandomUUID = UUID.randomUUID();
                di41 di41VarM44059j = m44059j(uuidRandomUUID, j);
                di41 di41VarM44059j2 = m44059j(uuidRandomUUID, this.f77808d);
                this.f77810f = new e9j0(uuidRandomUUID, j9j0.f110187a, map, di41VarM44059j, di41VarM44059j2);
                di41VarM44059j.start();
                di41VarM44059j2.start();
                return;
            }
            if (f9j0Var instanceof d9j0) {
                this.f77810f = d9j0.m35374a((d9j0) f9j0Var, null, map, 7);
                return;
            }
            if (!(f9j0Var instanceof e9j0)) {
                throw new NoWhenBranchMatchedException();
            }
            e9j0 e9j0Var = (e9j0) f9j0Var;
            e9j0Var.f57460d.mo26601e(null);
            di41 di41VarM44059j3 = m44059j(e9j0Var.f57457a, j);
            this.f77810f = new e9j0(e9j0Var.f57457a, e9j0Var.f57458b, map, di41VarM44059j3, e9j0Var.f57461e);
            di41VarM44059j3.start();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m44058i(e9j0 e9j0Var) {
        fbk fbkVar = null;
        e9j0Var.f57460d.mo26601e(null);
        e9j0Var.f57461e.mo26601e(null);
        if (this.f77811g.mo30231j(new z8j0(e9j0Var.f57457a, e9j0Var.f57458b, e9j0Var.f57459c)) instanceof tnc) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f77812h) {
            return;
        }
        this.f77812h = true;
        x0h1.m89578u(this.f77805a, null, 4, new rph0(this, fbkVar, 18), 1);
    }

    /* JADX INFO: renamed from: j */
    public final di41 m44059j(UUID uuid, long j) {
        return x0h1.m89578u(this.f77805a, null, 2, new u37(j, this, uuid, (fbk) null, 13), 1);
    }
}
