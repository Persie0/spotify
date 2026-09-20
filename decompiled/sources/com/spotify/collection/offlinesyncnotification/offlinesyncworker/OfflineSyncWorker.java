package com.spotify.collection.offlinesyncnotification.offlinesyncworker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.e890;
import p204p.fbk;
import p204p.hei0;
import p204p.i3l0;
import p204p.ibk;
import p204p.ix70;
import p204p.k1l0;
import p204p.k3l0;
import p204p.kei0;
import p204p.l3l0;
import p204p.l7t0;
import p204p.lgc;
import p204p.na6;
import p204p.njg1;
import p204p.nlv0;
import p204p.rhy0;
import p204p.yuk;
import p204p.z140;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BQ\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/collection/offlinesyncnotification/offlinesyncworker/OfflineSyncWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/ix70;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/k3l0;", "offlineSyncObserver", "Lp/i3l0;", "offlineSyncNotificationManager", "Lp/am71;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/rhy0;Lp/k3l0;Lp/i3l0;Lp/am71;)V", "p/dpn", "src_main_java_com_spotify_collection_offlinesyncnotification_offlinesyncworker-offlinesyncworker"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OfflineSyncWorker extends MusicAppQuasarWorker<ix70> {

    /* JADX INFO: renamed from: l */
    public final z140 f3364l;

    /* JADX INFO: renamed from: m */
    public final rhy0 f3365m;

    /* JADX INFO: renamed from: n */
    public final k3l0 f3366n;

    /* JADX INFO: renamed from: o */
    public final i3l0 f3367o;

    /* JADX INFO: renamed from: p */
    public final am71 f3368p;

    /* JADX INFO: renamed from: q */
    public final hei0 f3369q;

    /* JADX INFO: renamed from: r */
    public final String f3370r;

    /* JADX INFO: renamed from: s */
    public final long f3371s;

    /* JADX INFO: renamed from: t */
    public final long f3372t;

    public OfflineSyncWorker(Context context, WorkerParameters workerParameters, z140 z140Var, rhy0 rhy0Var, k3l0 k3l0Var, i3l0 i3l0Var, am71 am71Var) {
        super(context, workerParameters);
        this.f3364l = z140Var;
        this.f3365m = rhy0Var;
        this.f3366n = k3l0Var;
        this.f3367o = i3l0Var;
        this.f3368p = am71Var;
        hei0 hei0Var = hei0.f90443a;
        this.f3369q = hei0Var;
        this.f3370r = hei0Var.getName();
        this.f3371s = 30L;
        this.f3372t = 300L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m6804A(fbk fbkVar) {
        l3l0 l3l0Var;
        nlv0 nlv0Var;
        if (fbkVar instanceof l3l0) {
            l3l0Var = (l3l0) fbkVar;
            int i = l3l0Var.f129346d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3l0Var.f129346d = i - Integer.MIN_VALUE;
            } else {
                l3l0Var = new l3l0(this, (ibk) fbkVar);
            }
        } else {
            l3l0Var = new l3l0(this, (ibk) fbkVar);
        }
        Object obj = l3l0Var.f129344b;
        int i2 = l3l0Var.f129346d;
        if (i2 == 0) {
            bga.m29073P(obj);
            nlv0 nlv0Var2 = new nlv0();
            this.f3366n.m55271a(new k1l0(this, 1), new lgc(nlv0Var2, 3));
            nlv0Var = nlv0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nlv0Var = l3l0Var.f129343a;
            bga.m29073P(obj);
        }
        while (!nlv0Var.f155174a && !m41018b()) {
            l3l0Var.f129343a = nlv0Var;
            l3l0Var.f129346d = 1;
            Object objM64619l = njg1.m64619l(125L, l3l0Var);
            yuk yukVar = yuk.f276404a;
            if (objM64619l == yukVar) {
                return yukVar;
            }
        }
        return e890.m38084a();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo6805k(Object obj, l7t0 l7t0Var) {
        return m6804A(l7t0Var);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF3372t() {
        return this.f3372t;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF3371s() {
        return this.f3371s;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF3365m() {
        return this.f3365m;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF3370r() {
        return this.f3370r;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker, com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: r */
    public final void mo6810r(int i) {
        super.mo6810r(i);
        this.f3366n.m55272b();
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
    public final z140 getF3364l() {
        return this.f3364l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f3369q;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF3368p() {
        return this.f3368p;
    }
}
