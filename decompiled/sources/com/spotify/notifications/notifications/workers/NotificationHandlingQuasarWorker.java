package com.spotify.notifications.notifications.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.c95;
import p204p.c9k;
import p204p.dvj0;
import p204p.e721;
import p204p.e890;
import p204p.edb;
import p204p.evj0;
import p204p.fbk;
import p204p.fei0;
import p204p.gh00;
import p204p.gvj0;
import p204p.ibk;
import p204p.ix70;
import p204p.kei0;
import p204p.l7t0;
import p204p.luk;
import p204p.mp1;
import p204p.na6;
import p204p.nft0;
import p204p.q0a0;
import p204p.q2k0;
import p204p.qyg1;
import p204p.ret0;
import p204p.rhy0;
import p204p.rlv0;
import p204p.rnj0;
import p204p.rr4;
import p204p.ry2;
import p204p.s54;
import p204p.sft0;
import p204p.sr4;
import p204p.twz0;
import p204p.w2a1;
import p204p.w9r0;
import p204p.wj50;
import p204p.x0h1;
import p204p.xz8;
import p204p.yuk;
import p204p.z140;
import p204p.zmy;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBs\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/notifications/notifications/workers/NotificationHandlingQuasarWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/ix70;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/am71;", "timeKeeper", "Lp/q2k0;", "notificationTypeParser", "Lp/ret0;", "handler", "Lp/e721;", "silentPushHandler", "Lp/s54;", "properties", "Lp/sft0;", "timingSampler", "Lp/luk;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/rhy0;Lp/am71;Lp/q2k0;Lp/ret0;Lp/e721;Lp/s54;Lp/sft0;Lp/luk;)V", "p/upn", "src_main_java_com_spotify_notifications_notifications_workers-workers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NotificationHandlingQuasarWorker extends MusicAppQuasarWorker<ix70> {

    /* JADX INFO: renamed from: l */
    public final z140 f6223l;

    /* JADX INFO: renamed from: m */
    public final rhy0 f6224m;

    /* JADX INFO: renamed from: n */
    public final am71 f6225n;

    /* JADX INFO: renamed from: o */
    public final q2k0 f6226o;

    /* JADX INFO: renamed from: p */
    public final ret0 f6227p;

    /* JADX INFO: renamed from: q */
    public final e721 f6228q;

    /* JADX INFO: renamed from: r */
    public final s54 f6229r;

    /* JADX INFO: renamed from: s */
    public final sft0 f6230s;

    /* JADX INFO: renamed from: t */
    public final fei0 f6231t;

    /* JADX INFO: renamed from: u */
    public final String f6232u;

    /* JADX INFO: renamed from: v */
    public final long f6233v;

    /* JADX INFO: renamed from: w */
    public final long f6234w;

    /* JADX INFO: renamed from: x */
    public final c9k f6235x;

    public NotificationHandlingQuasarWorker(Context context, WorkerParameters workerParameters, z140 z140Var, rhy0 rhy0Var, am71 am71Var, q2k0 q2k0Var, ret0 ret0Var, e721 e721Var, s54 s54Var, sft0 sft0Var, luk lukVar) {
        super(context, workerParameters);
        this.f6223l = z140Var;
        this.f6224m = rhy0Var;
        this.f6225n = am71Var;
        this.f6226o = q2k0Var;
        this.f6227p = ret0Var;
        this.f6228q = e721Var;
        this.f6229r = s54Var;
        this.f6230s = sft0Var;
        fei0 fei0Var = fei0.f68776a;
        this.f6231t = fei0Var;
        this.f6232u = fei0Var.getName();
        this.f6233v = 30L;
        this.f6234w = 300L;
        this.f6235x = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (m15979B(r1, r3, r9, p204p.zpj0.f285146R0, r5) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        if (m15979B(r2, r2, r9, r4, r5) == r7) goto L52;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m15978A(fbk fbkVar) {
        dvj0 dvj0Var;
        Long lM74181K;
        Long lM74181K2;
        if (fbkVar instanceof dvj0) {
            dvj0Var = (dvj0) fbkVar;
            int i = dvj0Var.f53473c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvj0Var.f53473c = i - Integer.MIN_VALUE;
            } else {
                dvj0Var = new dvj0(this, (ibk) fbkVar);
            }
        } else {
            dvj0Var = new dvj0(this, (ibk) fbkVar);
        }
        dvj0 dvj0Var2 = dvj0Var;
        Object obj = dvj0Var2.f53471a;
        int i2 = dvj0Var2.f53473c;
        if (i2 == 0) {
            bga.m29073P(obj);
            Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f66917b.f1404b.f207773a);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapUnmodifiableMap.size()));
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), (String) entry.getValue());
            }
            String str = (String) linkedHashMap.get("type");
            boolean zM77224f = this.f6229r.m77224f();
            boolean zM88271j = wj50.m88271j(str, "silent_push");
            am71 am71Var = this.f6225n;
            c9k c9kVar = this.f6235x;
            sft0 sft0Var = this.f6230s;
            fbk fbkVar2 = null;
            Object obj2 = yuk.f276404a;
            if (!zM88271j) {
                xz8 xz8VarM81833w = ((twz0) this.f6226o).m81833w(linkedHashMap);
                if (xz8VarM81833w == null) {
                    return e890.m38084a();
                }
                sr4 sr4VarM87556z = ((w9r0) sft0Var).m87556z();
                if (sr4VarM87556z != null) {
                    sr4VarM87556z.m79013a("sync_mode", zM77224f ? "sync" : "async");
                    lM74181K = qyg1.m74181K(((rr4) am71Var).f201947a.m27521a());
                } else {
                    lM74181K = null;
                }
                gh00 zmyVar = new zmy(this, xz8VarM81833w, fbkVar2, 15);
                if (zM77224f) {
                    Long l = lM74181K;
                    gh00 gh00Var = evj0.f63279h;
                    dvj0Var2.f53473c = 2;
                } else {
                    x0h1.m89578u(c9kVar, null, 0, new q0a0(27, this, sr4VarM87556z, lM74181K, zmyVar, null), 3);
                }
                return e890.m38084a();
            }
            sr4 sr4VarM87556z2 = ((w9r0) sft0Var).m87556z();
            if (sr4VarM87556z2 != null) {
                sr4VarM87556z2.m79013a("sync_mode", zM77224f ? "sync" : "async");
                lM74181K2 = qyg1.m74181K(((rr4) am71Var).f201947a.m27521a());
            } else {
                lM74181K2 = null;
            }
            gh00 zmyVar2 = new zmy(this, linkedHashMap, fbkVar2, 14);
            if (zM77224f) {
                dvj0Var2.f53473c = 1;
            } else {
                x0h1.m89578u(c9kVar, null, 0, new q0a0(26, this, sr4VarM87556z2, lM74181K2, zmyVar2, null), 3);
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return e890.m38084a();
        }
        bga.m29073P(obj);
        return e890.m38084a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.lang.Object] */
    /* JADX INFO: renamed from: B */
    public final Object m15979B(sr4 sr4Var, Long l, gh00 gh00Var, gh00 gh00Var2, ibk ibkVar) {
        gvj0 gvj0Var;
        NotificationHandlingQuasarWorker notificationHandlingQuasarWorker;
        rlv0 rlv0Var;
        rlv0 rlv0Var2;
        gh00 gh00Var3;
        Long l2;
        Object obj;
        sr4 sr4Var2;
        rlv0 rlv0Var3;
        String str;
        rnj0 rnj0Var;
        mp1 mp1Var;
        Object obj2;
        if (ibkVar instanceof gvj0) {
            gvj0Var = (gvj0) ibkVar;
            int i = gvj0Var.f84772i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvj0Var.f84772i = i - Integer.MIN_VALUE;
                notificationHandlingQuasarWorker = this;
            } else {
                notificationHandlingQuasarWorker = this;
                gvj0Var = new gvj0(notificationHandlingQuasarWorker, ibkVar);
            }
        } else {
            notificationHandlingQuasarWorker = this;
            gvj0Var = new gvj0(notificationHandlingQuasarWorker, ibkVar);
        }
        Object obj3 = gvj0Var.f84770g;
        ?? r5 = gvj0Var.f84772i;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        Object obj4 = yuk.f276404a;
        try {
            if (r5 == 0) {
                bga.m29073P(obj3);
                if (sr4Var == null || l == null) {
                    gvj0Var.f84764a = null;
                    gvj0Var.f84765b = null;
                    gvj0Var.f84766c = null;
                    gvj0Var.f84772i = 1;
                    if (gh00Var.invoke(gvj0Var) == obj4) {
                        return obj4;
                    }
                } else {
                    rlv0Var = new rlv0();
                    rlv0Var.f200373a = "success";
                    rlv0Var2 = new rlv0();
                    try {
                        nft0 nft0Var = new nft0(sr4Var);
                        ry2 ry2Var = new ry2(gh00Var, fbkVar, 4);
                        gvj0Var.f84764a = sr4Var;
                        gvj0Var.f84765b = l;
                        gh00Var3 = gh00Var2;
                        gvj0Var.f84766c = gh00Var3;
                        gvj0Var.f84767d = rlv0Var;
                        gvj0Var.f84768e = rlv0Var2;
                        gvj0Var.f84772i = 2;
                        Object objM89557A = x0h1.m89557A(nft0Var, ry2Var, gvj0Var);
                        if (objM89557A == obj4) {
                            return obj4;
                        }
                        l2 = l;
                        obj = obj4;
                        rlv0Var = rlv0Var;
                        obj3 = objM89557A;
                        sr4Var2 = sr4Var;
                        rlv0Var3 = rlv0Var2;
                        str = (String) gh00Var3.invoke(obj3);
                        if (str != null) {
                            rlv0Var.f200373a = "error";
                            rlv0Var3.f200373a = str;
                        }
                        rnj0Var = rnj0.f200934b;
                        rlv0 rlv0Var4 = rlv0Var3;
                        obj2 = obj;
                        mp1Var = new mp1(23, notificationHandlingQuasarWorker, sr4Var2, rlv0Var, rlv0Var4, l2, null);
                        gvj0Var.f84764a = null;
                        gvj0Var.f84765b = null;
                        gvj0Var.f84766c = null;
                        gvj0Var.f84767d = null;
                        gvj0Var.f84768e = null;
                        gvj0Var.f84772i = 3;
                        if (x0h1.m89557A(rnj0Var, mp1Var, gvj0Var) == obj2) {
                            return obj2;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        rlv0Var.f200373a = "cancelled";
                        rlv0Var2.f200373a = "worker_cancelled";
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        rlv0Var.f200373a = "error";
                        rlv0Var2.f200373a = "unknown";
                        throw th;
                    }
                }
                return w2a1Var;
            }
            if (r5 == 1) {
                bga.m29073P(obj3);
                return w2a1Var;
            }
            if (r5 != 2) {
                if (r5 == 3) {
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                if (r5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = gvj0Var.f84769f;
                bga.m29073P(obj3);
                throw th2;
            }
            rlv0Var3 = gvj0Var.f84768e;
            rlv0 rlv0Var5 = gvj0Var.f84767d;
            gh00Var3 = gvj0Var.f84766c;
            Long l3 = gvj0Var.f84765b;
            sr4Var2 = gvj0Var.f84764a;
            try {
                bga.m29073P(obj3);
                rlv0Var = rlv0Var5;
                obj = obj4;
                l2 = l3;
                try {
                    str = (String) gh00Var3.invoke(obj3);
                    if (str != null) {
                        try {
                            rlv0Var.f200373a = "error";
                            rlv0Var3.f200373a = str;
                        } catch (CancellationException e2) {
                            e = e2;
                            rlv0Var2 = rlv0Var3;
                            rlv0Var.f200373a = "cancelled";
                            rlv0Var2.f200373a = "worker_cancelled";
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            rlv0Var2 = rlv0Var3;
                            rlv0Var.f200373a = "error";
                            rlv0Var2.f200373a = "unknown";
                            throw th;
                        }
                    }
                    rnj0Var = rnj0.f200934b;
                    rlv0 rlv0Var6 = rlv0Var3;
                    obj2 = obj;
                    mp1Var = new mp1(23, notificationHandlingQuasarWorker, sr4Var2, rlv0Var, rlv0Var6, l2, null);
                    gvj0Var.f84764a = null;
                    gvj0Var.f84765b = null;
                    gvj0Var.f84766c = null;
                    gvj0Var.f84767d = null;
                    gvj0Var.f84768e = null;
                    gvj0Var.f84772i = 3;
                    if (x0h1.m89557A(rnj0Var, mp1Var, gvj0Var) == obj2) {
                        return obj2;
                    }
                    return w2a1Var;
                } catch (CancellationException e3) {
                    e = e3;
                    rlv0Var2 = rlv0Var3;
                } catch (Throwable th4) {
                    th = th4;
                    rlv0Var2 = rlv0Var3;
                }
            } catch (CancellationException e4) {
                e = e4;
                rlv0Var = rlv0Var5;
                rlv0Var2 = rlv0Var3;
                rlv0Var.f200373a = "cancelled";
                rlv0Var2.f200373a = "worker_cancelled";
                throw e;
            } catch (Throwable th5) {
                th = th5;
                rlv0Var = rlv0Var5;
                rlv0Var2 = rlv0Var3;
                rlv0Var.f200373a = "error";
                rlv0Var2.f200373a = "unknown";
                throw th;
            }
        } catch (Throwable th6) {
            rnj0 rnj0Var2 = rnj0.f200934b;
            mp1 mp1Var2 = new mp1(23, this, sr4Var, obj3, r5, l, null);
            gvj0Var.f84764a = 4;
            gvj0Var.f84765b = 4;
            gvj0Var.f84766c = 4;
            gvj0Var.f84767d = 4;
            gvj0Var.f84768e = 4;
            gvj0Var.f84769f = th6;
            gvj0Var.f84772i = 4;
            if (x0h1.m89557A(rnj0Var2, mp1Var2, gvj0Var) == 3) {
                return 3;
            }
            throw th6;
        }
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo6805k(Object obj, l7t0 l7t0Var) {
        return m15978A(l7t0Var);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF6234w() {
        return this.f6234w;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF6233v() {
        return this.f6233v;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF6224m() {
        return this.f6224m;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF6232u() {
        return this.f6232u;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker, com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: s */
    public final void mo6811s(Exception exc) {
        super.mo6811s(exc);
        if ((exc instanceof ScopeEnterTimeoutException) || (exc instanceof NoProgressTimeoutException)) {
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        na6.m63972t(message, exc);
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF6223l() {
        return this.f6223l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f6231t;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF6225n() {
        return this.f6225n;
    }
}
