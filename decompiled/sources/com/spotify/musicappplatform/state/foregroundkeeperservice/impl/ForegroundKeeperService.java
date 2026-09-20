package com.spotify.musicappplatform.state.foregroundkeeperservice.impl;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.a300;
import p204p.b300;
import p204p.c300;
import p204p.cx10;
import p204p.dxq0;
import p204p.edb;
import p204p.geg1;
import p204p.i6o;
import p204p.l0y0;
import p204p.lzj;
import p204p.m45;
import p204p.mc80;
import p204p.na6;
import p204p.nw31;
import p204p.s200;
import p204p.t200;
import p204p.u200;
import p204p.v200;
import p204p.w200;
import p204p.wj50;
import p204p.x200;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/musicappplatform/state/foregroundkeeperservice/impl/ForegroundKeeperService;", "Lp/i6o;", "<init>", "()V", "src_main_java_com_spotify_musicappplatform_state_foregroundkeeperservice_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ForegroundKeeperService extends i6o {

    /* JADX INFO: renamed from: a */
    public c300 f6087a;

    /* JADX INFO: renamed from: b */
    public cx10 f6088b;

    /* JADX INFO: renamed from: c */
    public m45 f6089c;

    /* JADX INFO: renamed from: d */
    public Random f6090d;

    /* JADX INFO: renamed from: e */
    public a300 f6091e;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // p204p.i6o, android.app.Service
    public final void onCreate() {
        super.onCreate();
        Logger.m3965a("[ForegroundKeeperService] onCreate()", new Object[0]);
        c300 c300Var = this.f6087a;
        if (c300Var == null) {
            wj50.m88260d0("foregroundNotifierFactory");
            throw null;
        }
        a300 a300VarM31357a = c300Var.m31357a(b300.f22754a);
        this.f6091e = a300VarM31357a;
        a300VarM31357a.f11779m = true;
        a300VarM31357a.m24576j(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Logger.m3965a("[ForegroundKeeperService] onDestroy()", new Object[0]);
        super.onDestroy();
        a300 a300Var = this.f6091e;
        if (a300Var == null) {
            wj50.m88260d0("foregroundNotifier");
            throw null;
        }
        a300Var.m24577k();
        a300 a300Var2 = this.f6091e;
        if (a300Var2 == null) {
            wj50.m88260d0("foregroundNotifier");
            throw null;
        }
        synchronized (a300Var2) {
            try {
                a300Var2.m24571e("hideAllNotifications() called, ongoing notifications count: " + a300Var2.f11773g.size());
                nw31 nw31VarM57837s = l0y0.m57837s(a300Var2.f11773g);
                while (nw31VarM57837s.hasNext()) {
                    int iNextInt = nw31VarM57837s.nextInt();
                    a300Var2.f11767a.cancel(iNextInt);
                    a300Var2.f11773g.remove(iNextInt);
                }
                a300Var2.m24571e("hideAllNotifications() completed, all notifications cleared");
            } catch (Throwable th) {
                throw th;
            }
        }
        stopForeground(1);
        c300 c300Var = this.f6087a;
        if (c300Var == null) {
            wj50.m88260d0("foregroundNotifierFactory");
            throw null;
        }
        c300Var.f33511h.remove(b300.f22754a);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Logger.m3965a("[ForegroundKeeperService] onStartCommand() intent-id=" + (intent != null ? Integer.valueOf(intent.getIntExtra("intent-id", -1)) : null), new Object[0]);
        boolean z = true;
        boolean z2 = intent != null && dxq0.m37270b(intent);
        if (z2 && Build.VERSION.SDK_INT < 31) {
            try {
                lzj.m60362g0(this, R.id.notification_placeholder_fg_start, null);
            } catch (Exception e) {
                Logger.m3965a(edb.m38564m("[ForegroundKeeperService] Failed early startForeground: ", e.getMessage()), new Object[0]);
            }
        }
        if (intent == null || !intent.hasExtra("notifier-action")) {
            z = false;
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("notifier-action");
            x200 x200Var = parcelableExtra instanceof x200 ? (x200) parcelableExtra : null;
            if (x200Var == null) {
                Logger.m3965a("[ForegroundKeeperService] onStartCommand() action is null", new Object[0]);
            } else if (x200Var instanceof v200) {
                a300 a300Var = this.f6091e;
                if (a300Var == null) {
                    wj50.m88260d0("foregroundNotifier");
                    throw null;
                }
                v200 v200Var = (v200) x200Var;
                synchronized (a300Var) {
                    a300Var.m24571e("showNotification() called with action: id=" + v200Var.m84489h() + ", foreground=" + v200Var.m84488g() + ", fgsType=" + v200Var.m84487c());
                    a300Var.m24567a(v200Var);
                }
            } else if (x200Var instanceof s200) {
                a300 a300Var2 = this.f6091e;
                if (a300Var2 == null) {
                    wj50.m88260d0("foregroundNotifier");
                    throw null;
                }
                Intent intentM76999c = ((s200) x200Var).m76999c();
                dxq0.m37271c(intentM76999c);
                a300Var2.m24568b(intentM76999c);
            } else if (x200Var instanceof t200) {
                a300 a300Var3 = this.f6091e;
                if (a300Var3 == null) {
                    wj50.m88260d0("foregroundNotifier");
                    throw null;
                }
                t200 t200Var = (t200) x200Var;
                synchronized (a300Var3) {
                    a300Var3.m24571e("hideNotification() called with action: id=" + t200Var.m79888c());
                    a300Var3.m24567a(t200Var);
                }
            } else if (x200Var instanceof w200) {
                a300 a300Var4 = this.f6091e;
                if (a300Var4 == null) {
                    wj50.m88260d0("foregroundNotifier");
                    throw null;
                }
                List listM44518y = geg1.m44518y("ForegroundKeeperService");
                synchronized (a300Var4) {
                    a300Var4.m24571e("stopEnsureForegroundStart() called with reasons: " + listM44518y);
                    a300Var4.m24567a(new w200(listM44518y));
                }
            } else {
                if (!(x200Var instanceof u200)) {
                    throw new NoWhenBranchMatchedException();
                }
                Logger.m3965a("[ForegroundKeeperService] NoAction, notification handled directly", new Object[0]);
            }
            z = false;
        }
        if (!z2 || z) {
            return 2;
        }
        Logger.m3965a("[ForegroundKeeperService] Foreground start required but action didn't trigger it, showing placeholder", new Object[0]);
        a300 a300Var5 = this.f6091e;
        if (a300Var5 == null) {
            wj50.m88260d0("foregroundNotifier");
            throw null;
        }
        dxq0.m37271c(intent);
        a300Var5.m24568b(intent);
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        Logger.m3965a("[ForegroundKeeperService] onTaskRemoved() intent-id=" + (intent != null ? Integer.valueOf(intent.getIntExtra("intent-id", -1)) : null), new Object[0]);
        m45 m45Var = this.f6089c;
        if (m45Var == null) {
            wj50.m88260d0("appActivitiesWatcher");
            throw null;
        }
        if (m45Var.f139840a > 0) {
            Random random = this.f6090d;
            if (random == null) {
                wj50.m88260d0("random");
                throw null;
            }
            if (random.nextDouble() <= 0.01d) {
                na6.m63971s("[ForegroundKeeperService] Received onTaskRemoved when UI is still in FG, ignoring it");
                return;
            }
            return;
        }
        cx10 cx10Var = this.f6088b;
        if (cx10Var == null) {
            wj50.m88260d0("onTaskRemovedPluginPoint");
            throw null;
        }
        Iterator it = cx10Var.m34172c().iterator();
        while (it.hasNext()) {
            ((mc80) it.next()).mo61457a();
        }
        super.onTaskRemoved(intent);
    }
}
