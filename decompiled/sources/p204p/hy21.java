package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class hy21 implements kx21 {

    /* JADX INFO: renamed from: a */
    public final p431 f96437a;

    /* JADX INFO: renamed from: b */
    public final er70 f96438b;

    /* JADX INFO: renamed from: c */
    public final er70 f96439c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f96440d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f96441e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f96442f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public final Object f96443g = new Object();

    /* JADX INFO: renamed from: h */
    public final g130 f96444h = new g130(2);

    public hy21(p431 p431Var, er70 er70Var, er70 er70Var2, Scheduler scheduler, Scheduler scheduler2) {
        this.f96437a = p431Var;
        this.f96438b = er70Var;
        this.f96439c = er70Var2;
        this.f96440d = scheduler;
        this.f96441e = scheduler2;
    }

    /* JADX INFO: renamed from: f */
    public static r431 m49107f(uv11 uv11Var) {
        int iOrdinal = uv11Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return r431.f195646b;
            }
            if (iOrdinal == 2) {
                return r431.f195647c;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return r431.f195645a;
    }

    /* JADX INFO: renamed from: b */
    public final Completable m49108b(String str, ux21 ux21Var) {
        cy21 cy21VarM49109c = m49109c(str);
        return cy21VarM49109c.m34337a().takeUntil(new vyr0(new AtomicBoolean(true), cy21VarM49109c, ux21Var, new nlv0(), 28)).ignoreElements();
    }

    /* JADX INFO: renamed from: c */
    public final cy21 m49109c(String str) {
        cy21 cy21Var;
        synchronized (this.f96443g) {
            try {
                g130 g130Var = this.f96444h;
                Object obj = g130Var.get(str);
                if (obj == null) {
                    ay21 ay21Var = new ay21(0, (byte) 0);
                    cy21 cy21Var2 = new cy21(ay21Var, Observable.defer(new gy21(new AtomicReference(new iy21(str, new hys0())), this, str, ay21Var)).serialize().replay(1).m23778f());
                    g130Var.put(str, cy21Var2);
                    obj = cy21Var2;
                }
                cy21Var = (cy21) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cy21Var;
    }

    /* JADX INFO: renamed from: d */
    public final Observable m49110d(String str) {
        if (str.length() != 0) {
            Observable observableDistinctUntilChanged = m49109c(str).m34337a().filter(hkr0.f92476N0).map(new h15(this, 26)).distinctUntilChanged();
            wj50.m88279p(observableDistinctUntilChanged);
            return observableDistinctUntilChanged;
        }
        Logger.m3973i("Observing shuffle state for empty context uri!", new Object[0]);
        Observable observableEmpty = Observable.empty();
        wj50.m88279p(observableEmpty);
        return observableEmpty;
    }

    /* JADX INFO: renamed from: e */
    public final Completable m49111e(String str, r431 r431Var, d850 d850Var) {
        uv11 uv11Var;
        int andIncrement = this.f96442f.getAndIncrement();
        int iOrdinal = r431Var.ordinal();
        if (iOrdinal == 0) {
            uv11Var = uv11.f234311a;
        } else if (iOrdinal == 1) {
            uv11Var = uv11.f234312b;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uv11Var = uv11.f234313c;
        }
        return m49108b(str, new sx21(andIncrement, uv11Var, d850Var));
    }

    /* JADX INFO: renamed from: g */
    public final Completable m49112g(String str, d850 d850Var) {
        return m49108b(str, new tx21(this.f96442f.getAndIncrement(), d850Var));
    }
}
