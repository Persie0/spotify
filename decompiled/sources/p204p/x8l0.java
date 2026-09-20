package p204p;

import android.os.SystemClock;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class x8l0 implements kpi0 {

    /* JADX INFO: renamed from: f */
    public static final long f259178f;

    /* JADX INFO: renamed from: g */
    public static final long f259179g;

    /* JADX INFO: renamed from: a */
    public final xre f259180a;

    /* JADX INFO: renamed from: b */
    public final C2048kd f259181b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f259182c;

    /* JADX INFO: renamed from: d */
    public Set f259183d;

    /* JADX INFO: renamed from: e */
    public gd5 f259184e;

    static {
        long millis = TimeUnit.HOURS.toMillis(1L);
        f259178f = millis;
        f259179g = millis / ((long) 1000);
    }

    public x8l0(xre xreVar, C2048kd c2048kd, Scheduler scheduler) {
        this.f259180a = xreVar;
        this.f259181b = c2048kd;
        this.f259182c = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public static final Exception m90213a(x8l0 x8l0Var, String str, String str2) {
        return new Exception(edb.m38566o("Failed on-demand-set ", str, " request: ", str2));
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m90214b(String str) {
        gd5 gd5Var = this.f259184e;
        if (gd5Var != null && new v8l0(str).equals(gd5Var.m44353D())) {
            long jM44354E = gd5Var.m44354E();
            ((wy3) this.f259180a).getClass();
            if (jM44354E > SystemClock.elapsedRealtime()) {
                return Boolean.TRUE;
            }
        }
        Set set = this.f259183d;
        if (set == null) {
            return null;
        }
        return Boolean.valueOf(set.contains(new v8l0(str)));
    }

    /* JADX INFO: renamed from: c */
    public final CompletableAndThenCompletable m90215c(Set set) {
        n401 n401VarM16227o = com.spotify.on_demand_set.proto.Set.m16227o();
        n401VarM16227o.m63650m(g6f.m43728j1(set));
        com.spotify.on_demand_set.proto.Set set2 = (com.spotify.on_demand_set.proto.Set) n401VarM16227o.build();
        wj50.m88279p(set2);
        return this.f259181b.m56132i(set2).flatMapCompletable(new pqk0(this, 2)).m23298o(this.f259182c).m23292c(new CompletableDefer(new ve0(11, this, set)));
    }
}
