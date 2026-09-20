package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dh61 implements qgx {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ int f48992X = 0;

    /* JADX INFO: renamed from: a */
    public final Context f48993a;

    /* JADX INFO: renamed from: b */
    public final o0e1 f48994b;

    /* JADX INFO: renamed from: c */
    public final v1e1 f48995c;

    /* JADX INFO: renamed from: d */
    public final mir0 f48996d;

    /* JADX INFO: renamed from: e */
    public final l0e1 f48997e;

    /* JADX INFO: renamed from: f */
    public final dcf f48998f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f48999g;

    /* JADX INFO: renamed from: h */
    public Intent f49000h;

    /* JADX INFO: renamed from: i */
    public SystemAlarmService f49001i;

    /* JADX INFO: renamed from: t */
    public final u4l0 f49002t;

    static {
        gaz.m44194g("SystemAlarmDispatcher");
    }

    public dh61(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f48993a = applicationContext;
        hm11 hm11VarCreate = qr41.create();
        l0e1 l0e1VarM57799S = l0e1.m57799S(systemAlarmService);
        this.f48997e = l0e1VarM57799S;
        this.f48998f = new dcf(applicationContext, l0e1VarM57799S.f128404A0.f49366d, hm11VarCreate);
        this.f48995c = new v1e1(l0e1VarM57799S.f128404A0.f49369g);
        mir0 mir0Var = l0e1VarM57799S.f128408E0;
        this.f48996d = mir0Var;
        o0e1 o0e1Var = l0e1VarM57799S.f128406C0;
        this.f48994b = o0e1Var;
        this.f49002t = new u4l0(29, mir0Var, o0e1Var);
        mir0Var.m61909a(this);
        this.f48999g = new ArrayList();
        this.f49000h = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m35994c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // p204p.qgx
    /* JADX INFO: renamed from: a */
    public final void mo1166a(f0e1 f0e1Var, boolean z) {
        zr20 zr20Var = this.f48994b.f160374d;
        int i = dcf.f47543f;
        Intent intent = new Intent(this.f48993a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        dcf.m35648d(intent, f0e1Var);
        zr20Var.execute(new ti3(this, intent, 0, 11));
    }

    /* JADX INFO: renamed from: b */
    public final void m35995b(Intent intent, int i) {
        gaz gazVarM44190b = gaz.m44190b();
        Objects.toString(intent);
        gazVarM44190b.getClass();
        m35994c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            gaz.m44190b().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m35994c();
            synchronized (this.f48999g) {
                try {
                    Iterator it = this.f48999g.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f48999g) {
            try {
                boolean zIsEmpty = this.f48999g.isEmpty();
                this.f48999g.add(intent);
                if (zIsEmpty) {
                    m35996d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m35996d() {
        m35994c();
        PowerManager.WakeLock wakeLockM61061a = m7d1.m61061a(this.f48993a, "ProcessCommand");
        try {
            wakeLockM61061a.acquire();
            this.f48997e.f128406C0.m66013a(new ch61(this, 0));
        } finally {
            wakeLockM61061a.release();
        }
    }
}
