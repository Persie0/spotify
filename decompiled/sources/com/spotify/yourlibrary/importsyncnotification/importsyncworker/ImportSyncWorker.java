package com.spotify.yourlibrary.importsyncnotification.importsyncworker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.bpp;
import p204p.e890;
import p204p.eei0;
import p204p.fbk;
import p204p.he30;
import p204p.ibk;
import p204p.ix70;
import p204p.kei0;
import p204p.ki40;
import p204p.l7t0;
import p204p.lqi0;
import p204p.mi40;
import p204p.mvl0;
import p204p.na6;
import p204p.oi40;
import p204p.qp20;
import p204p.r1a;
import p204p.rhy0;
import p204p.ri40;
import p204p.si40;
import p204p.vyf1;
import p204p.yuk;
import p204p.z140;
import p204p.zv41;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bc\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/yourlibrary/importsyncnotification/importsyncworker/ImportSyncWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/ix70;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/mi40;", "importSyncObserver", "Lp/ki40;", "importSyncNotificationManager", "Lp/lqi0;", "", "importSyncFailure", "Lp/am71;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/rhy0;Lp/mi40;Lp/ki40;Lp/lqi0;Lp/am71;)V", "p/npn", "src_main_java_com_spotify_yourlibrary_importsyncnotification_importsyncworker-importsyncworker"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ImportSyncWorker extends MusicAppQuasarWorker<ix70> {

    /* JADX INFO: renamed from: l */
    public final z140 f7093l;

    /* JADX INFO: renamed from: m */
    public final rhy0 f7094m;

    /* JADX INFO: renamed from: n */
    public final mi40 f7095n;

    /* JADX INFO: renamed from: o */
    public final ki40 f7096o;

    /* JADX INFO: renamed from: p */
    public final lqi0 f7097p;

    /* JADX INFO: renamed from: q */
    public final am71 f7098q;

    /* JADX INFO: renamed from: r */
    public final eei0 f7099r;

    /* JADX INFO: renamed from: s */
    public final String f7100s;

    /* JADX INFO: renamed from: t */
    public final long f7101t;

    /* JADX INFO: renamed from: u */
    public final long f7102u;

    public ImportSyncWorker(Context context, WorkerParameters workerParameters, z140 z140Var, rhy0 rhy0Var, mi40 mi40Var, ki40 ki40Var, lqi0 lqi0Var, am71 am71Var) {
        super(context, workerParameters);
        this.f7093l = z140Var;
        this.f7094m = rhy0Var;
        this.f7095n = mi40Var;
        this.f7096o = ki40Var;
        this.f7097p = lqi0Var;
        this.f7098q = am71Var;
        eei0 eei0Var = eei0.f58803a;
        this.f7099r = eei0Var;
        this.f7100s = eei0Var.getName();
        this.f7101t = 30L;
        this.f7102u = 300L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m23251A(fbk fbkVar) {
        si40 si40Var;
        if (fbkVar instanceof si40) {
            si40Var = (si40) fbkVar;
            int i = si40Var.f209356c;
            if ((i & Integer.MIN_VALUE) != 0) {
                si40Var.f209356c = i - Integer.MIN_VALUE;
            } else {
                si40Var = new si40(this, (ibk) fbkVar);
            }
        } else {
            si40Var = new si40(this, (ibk) fbkVar);
        }
        Object objM86756u = si40Var.f209354a;
        int i2 = si40Var.f209356c;
        fbk fbkVar2 = null;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            r1a r1aVar = new r1a(mvl0.m62953p(new qp20(this.f7095n.f143934a.f191668c, 7)), new he30(this, fbkVar2, 4), 8);
            bpp bppVar = new bpp(2, 21, fbkVar2);
            si40Var.f209356c = 1;
            objM86756u = vyf1.m86756u(r1aVar, bppVar, si40Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        ri40 ri40Var = (ri40) objM86756u;
        if (ri40Var instanceof oi40) {
            String str = ((oi40) ri40Var).f165696a;
            if (str == null) {
                str = "unknown";
            }
            zv41 zv41Var = (zv41) this.f7097p;
            zv41Var.getClass();
            zv41Var.m97091m(null, str);
        }
        return e890.m38084a();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo6805k(Object obj, l7t0 l7t0Var) {
        return m23251A(l7t0Var);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF7102u() {
        return this.f7102u;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF7101t() {
        return this.f7101t;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF7094m() {
        return this.f7094m;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF7100s() {
        return this.f7100s;
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
    public final z140 getF7093l() {
        return this.f7093l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f7099r;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF7098q() {
        return this.f7098q;
    }
}
