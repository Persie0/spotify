package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class l0e1 extends k0e1 {

    /* JADX INFO: renamed from: J0 */
    public static l0e1 f128401J0;

    /* JADX INFO: renamed from: K0 */
    public static l0e1 f128402K0;

    /* JADX INFO: renamed from: L0 */
    public static final Object f128403L0;

    /* JADX INFO: renamed from: A0 */
    public final dii f128404A0;

    /* JADX INFO: renamed from: B0 */
    public final WorkDatabase f128405B0;

    /* JADX INFO: renamed from: C0 */
    public final o0e1 f128406C0;

    /* JADX INFO: renamed from: D0 */
    public final List f128407D0;

    /* JADX INFO: renamed from: E0 */
    public final mir0 f128408E0;

    /* JADX INFO: renamed from: F0 */
    public final phn0 f128409F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f128410G0;

    /* JADX INFO: renamed from: H0 */
    public BroadcastReceiver.PendingResult f128411H0;

    /* JADX INFO: renamed from: I0 */
    public final ft81 f128412I0;

    /* JADX INFO: renamed from: z0 */
    public final Context f128413z0;

    static {
        gaz.m44194g("WorkManagerImpl");
        f128401J0 = null;
        f128402K0 = null;
        f128403L0 = new Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0e1(Context context, final dii diiVar, o0e1 o0e1Var, final WorkDatabase workDatabase, final List list, mir0 mir0Var, ft81 ft81Var) {
        int i = 0;
        super(i);
        this.f128410G0 = false;
        Context applicationContext = context.getApplicationContext();
        if (jh3.m53321l(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        gaz.m44193f(new gaz(diiVar.f49370h));
        this.f128413z0 = applicationContext;
        this.f128406C0 = o0e1Var;
        this.f128405B0 = workDatabase;
        this.f128408E0 = mir0Var;
        this.f128412I0 = ft81Var;
        this.f128404A0 = diiVar;
        this.f128407D0 = list;
        c9k c9kVarM56661c = kk40.m56661c(o0e1Var.f160372b);
        this.f128409F0 = new phn0(workDatabase, 12);
        final fc5 fc5Var = o0e1Var.f160371a;
        int i2 = hgy0.f91237a;
        mir0Var.m61909a(new qgx() { // from class: p.ggy0
            @Override // p204p.qgx
            /* JADX INFO: renamed from: a */
            public final void mo1166a(f0e1 f0e1Var, boolean z) {
                fc5Var.execute(new feb(list, f0e1Var, diiVar, workDatabase, 21));
            }
        });
        o0e1Var.m66013a(new d200(applicationContext, this));
        int i3 = a2a1.f11611b;
        if (fir0.m41770a(applicationContext)) {
            o1e1 o1e1VarMo1155F = workDatabase.mo1155F();
            o1e1VarMo1155F.getClass();
            TreeMap treeMap = ojx0.f166164i;
            wxf1.m89255l(c9kVarM56661c, b0g1.m27776L(mvl0.m62953p(cyf1.m34372h(oyf1.m68473l0(hz40.m49223A(o1e1VarMo1155F.f160711a, false, new String[]{"workspec"}, new n1e1(o1e1VarMo1155F, ig31.m50495m(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"), 2)), new y1a1(4, null)))), new z1a1(applicationContext, (fbk) null, i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static l0e1 m57799S(Context context) {
        l0e1 l0e1VarM57799S;
        Object obj = f128403L0;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        l0e1VarM57799S = f128401J0;
                        if (l0e1VarM57799S == null) {
                            l0e1VarM57799S = f128402K0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return l0e1VarM57799S;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l0e1VarM57799S == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof aii)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m57800U(applicationContext, ((bb41) ((aii) applicationContext)).m28615c());
            l0e1VarM57799S = m57799S(applicationContext);
        }
        return l0e1VarM57799S;
    }

    /* JADX INFO: renamed from: U */
    public static void m57800U(Context context, dii diiVar) {
        synchronized (f128403L0) {
            try {
                l0e1 l0e1Var = f128401J0;
                if (l0e1Var != null && f128402K0 != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (l0e1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f128402K0 == null) {
                        f128402K0 = n0e1.m63446w(applicationContext, diiVar);
                    }
                    f128401J0 = f128402K0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final brl0 m57801R(String str, int i, lmn0 lmn0Var) {
        if (i == 3) {
            return e95.m38203h(this, str, lmn0Var);
        }
        return new yzd1(this, str, i != 2 ? 1 : 2, Collections.singletonList(lmn0Var), null).m94985w0();
    }

    /* JADX INFO: renamed from: T */
    public final hzd0 m57802T(String str) {
        o1e1 o1e1VarMo1155F = this.f128405B0.mo1155F();
        o1e1VarMo1155F.getClass();
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        ojx0VarM50495m.mo38269L0(1, str);
        wl50 wl50VarM59185k = o1e1VarMo1155F.f160711a.m59185k();
        String[] strArr = {"WorkTag", "WorkProgress", "workspec", "workname"};
        n1e1 n1e1Var = new n1e1(o1e1VarMo1155F, ojx0VarM50495m, 0);
        wl50VarM59185k.f252467b.m33111g(strArr);
        return zuj0.m97052o(wl50VarM59185k.f252472g.m64231v(strArr, n1e1Var), i1e1.f97498y, this.f128406C0);
    }

    /* JADX INFO: renamed from: V */
    public final void m57803V() {
        synchronized (f128403L0) {
            try {
                this.f128410G0 = true;
                BroadcastReceiver.PendingResult pendingResult = this.f128411H0;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f128411H0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
