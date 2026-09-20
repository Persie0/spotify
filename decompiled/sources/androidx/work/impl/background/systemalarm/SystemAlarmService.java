package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import p204p.dh61;
import p204p.gaz;
import p204p.m7d1;
import p204p.n7d1;
import p204p.tc80;

/* JADX INFO: loaded from: classes3.dex */
public class SystemAlarmService extends tc80 {

    /* JADX INFO: renamed from: b */
    public dh61 f1422b;

    /* JADX INFO: renamed from: c */
    public boolean f1423c;

    static {
        gaz.m44194g("SystemAlarmService");
    }

    /* JADX INFO: renamed from: i */
    public final void m1163i() {
        this.f1423c = true;
        gaz.m44190b().getClass();
        int i = m7d1.f140768a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (n7d1.f151138a) {
            linkedHashMap.putAll(n7d1.f151139b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                gaz.m44190b().getClass();
            }
        }
        stopSelf();
    }

    @Override // p204p.tc80, android.app.Service
    public final void onCreate() {
        super.onCreate();
        dh61 dh61Var = new dh61(this);
        this.f1422b = dh61Var;
        if (dh61Var.f49001i != null) {
            gaz.m44190b().getClass();
        } else {
            dh61Var.f49001i = this;
        }
        this.f1423c = false;
    }

    @Override // p204p.tc80, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1423c = true;
        dh61 dh61Var = this.f1422b;
        dh61Var.getClass();
        gaz.m44190b().getClass();
        dh61Var.f48996d.m61913f(dh61Var);
        dh61Var.f49001i = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1423c) {
            gaz.m44190b().getClass();
            dh61 dh61Var = this.f1422b;
            dh61Var.getClass();
            gaz.m44190b().getClass();
            dh61Var.f48996d.m61913f(dh61Var);
            dh61Var.f49001i = null;
            dh61 dh61Var2 = new dh61(this);
            this.f1422b = dh61Var2;
            if (dh61Var2.f49001i != null) {
                gaz.m44190b().getClass();
            } else {
                dh61Var2.f49001i = this;
            }
            this.f1423c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1422b.m35995b(intent, i2);
        return 3;
    }
}
