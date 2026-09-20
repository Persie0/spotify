package com.spotify.notifications.notifications.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p204p.am71;
import p204p.b890;
import p204p.bga;
import p204p.c890;
import p204p.e890;
import p204p.fbk;
import p204p.hv31;
import p204p.ibk;
import p204p.iei0;
import p204p.ix70;
import p204p.kei0;
import p204p.l7t0;
import p204p.na6;
import p204p.nrs0;
import p204p.ntb;
import p204p.rhy0;
import p204p.tft0;
import p204p.uft0;
import p204p.us30;
import p204p.wft0;
import p204p.xft0;
import p204p.yft0;
import p204p.yuk;
import p204p.z140;
import p204p.zn91;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BI\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/notifications/notifications/workers/PushTokenSyncQuasarWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/ix70;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/uft0;", "pushTokenManager", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/am71;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/uft0;Lp/z140;Lp/rhy0;Lp/am71;)V", "p/wpn", "src_main_java_com_spotify_notifications_notifications_workers-workers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PushTokenSyncQuasarWorker extends MusicAppQuasarWorker<ix70> {

    /* JADX INFO: renamed from: l */
    public final uft0 f6245l;

    /* JADX INFO: renamed from: m */
    public final z140 f6246m;

    /* JADX INFO: renamed from: n */
    public final rhy0 f6247n;

    /* JADX INFO: renamed from: o */
    public final am71 f6248o;

    /* JADX INFO: renamed from: p */
    public final iei0 f6249p;

    /* JADX INFO: renamed from: q */
    public final String f6250q;

    /* JADX INFO: renamed from: r */
    public final long f6251r;

    /* JADX INFO: renamed from: s */
    public final long f6252s;

    public PushTokenSyncQuasarWorker(Context context, WorkerParameters workerParameters, uft0 uft0Var, z140 z140Var, rhy0 rhy0Var, am71 am71Var) {
        super(context, workerParameters);
        this.f6245l = uft0Var;
        this.f6246m = z140Var;
        this.f6247n = rhy0Var;
        this.f6248o = am71Var;
        iei0 iei0Var = iei0.f101420a;
        this.f6249p = iei0Var;
        this.f6250q = iei0Var.getName();
        this.f6251r = 30L;
        this.f6252s = 300L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m15980A(fbk fbkVar) {
        yft0 yft0Var;
        if (fbkVar instanceof yft0) {
            yft0Var = (yft0) fbkVar;
            int i = yft0Var.f272330c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yft0Var.f272330c = i - Integer.MIN_VALUE;
            } else {
                yft0Var = new yft0(this, (ibk) fbkVar);
            }
        } else {
            yft0Var = new yft0(this, (ibk) fbkVar);
        }
        Object obj = yft0Var.f272328a;
        int i2 = yft0Var.f272330c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                wft0 wft0Var = (wft0) this.f6245l;
                hv31 hv31Var = wft0Var.f250895e;
                uft0.f229873a.getClass();
                String strMo48710e = hv31Var.mo48710e(tft0.m80706a(), "");
                String str = strMo48710e != null ? strMo48710e : "";
                xft0 xft0Var = wft0Var.f250892b;
                xft0Var.getClass();
                Completable completableFlatMapCompletable = Single.create(new nrs0(xft0Var, 13)).doOnError(new ntb(20)).subscribeOn(wft0Var.f250896f).flatMapCompletable(new us30(29, wft0Var, str));
                yft0Var.f272330c = 1;
                Object objM96565n = zn91.m96565n(completableFlatMapCompletable, yft0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return e890.m38084a();
        } catch (Exception e) {
            if (this.f66917b.f1405c < 3) {
                return new c890();
            }
            na6.m63972t("Push token sync failed after 3 attempts", e);
            return new b890();
        }
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo6805k(Object obj, l7t0 l7t0Var) {
        return m15980A(l7t0Var);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF6252s() {
        return this.f6252s;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF6251r() {
        return this.f6251r;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF6247n() {
        return this.f6247n;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF6250q() {
        return this.f6250q;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF6246m() {
        return this.f6246m;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f6249p;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF6248o() {
        return this.f6248o;
    }
}
