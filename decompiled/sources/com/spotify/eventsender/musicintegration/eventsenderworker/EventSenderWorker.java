package com.spotify.eventsender.musicintegration.eventsenderworker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import p204p.am71;
import p204p.b890;
import p204p.bga;
import p204p.c890;
import p204p.dei0;
import p204p.e890;
import p204p.ee5;
import p204p.fdi0;
import p204p.fe5;
import p204p.gdi0;
import p204p.i8x;
import p204p.ibk;
import p204p.j7x;
import p204p.k6x;
import p204p.kei0;
import p204p.lji;
import p204p.na6;
import p204p.rhy0;
import p204p.s1h1;
import p204p.t8s;
import p204p.v6x;
import p204p.yuk;
import p204p.z140;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018Ba\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/eventsender/musicintegration/eventsenderworker/EventSenderWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/lji;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/am71;", "timeKeeper", "Lp/v6x;", "eventSender", "Lp/gdi0;", "transportBinder", "Lp/ee5;", "appUiForegroundChecker", "Lp/k6x;", "eventOwnerProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/rhy0;Lp/am71;Lp/v6x;Lp/gdi0;Lp/ee5;Lp/k6x;)V", "p/tpn", "src_main_java_com_spotify_eventsender_musicintegration_eventsenderworker-eventsenderworker"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EventSenderWorker extends MusicAppQuasarWorker<lji> {

    /* JADX INFO: renamed from: l */
    public final z140 f3915l;

    /* JADX INFO: renamed from: m */
    public final rhy0 f3916m;

    /* JADX INFO: renamed from: n */
    public final am71 f3917n;

    /* JADX INFO: renamed from: o */
    public final v6x f3918o;

    /* JADX INFO: renamed from: p */
    public final gdi0 f3919p;

    /* JADX INFO: renamed from: q */
    public final ee5 f3920q;

    /* JADX INFO: renamed from: r */
    public final k6x f3921r;

    /* JADX INFO: renamed from: s */
    public final dei0 f3922s;

    /* JADX INFO: renamed from: t */
    public final String f3923t;

    public EventSenderWorker(Context context, WorkerParameters workerParameters, z140 z140Var, rhy0 rhy0Var, am71 am71Var, v6x v6xVar, gdi0 gdi0Var, ee5 ee5Var, k6x k6xVar) {
        super(context, workerParameters);
        this.f3915l = z140Var;
        this.f3916m = rhy0Var;
        this.f3917n = am71Var;
        this.f3918o = v6xVar;
        this.f3919p = gdi0Var;
        this.f3920q = ee5Var;
        this.f3921r = k6xVar;
        dei0 dei0Var = dei0.f48095a;
        this.f3922s = dei0Var;
        this.f3923t = dei0Var.getName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final Object mo6805k(lji ljiVar, ibk ibkVar) {
        i8x i8xVar;
        if (ibkVar instanceof i8x) {
            i8xVar = (i8x) ibkVar;
            int i = i8xVar.f99855c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8xVar.f99855c = i - Integer.MIN_VALUE;
            } else {
                i8xVar = new i8x(this, ibkVar);
            }
        } else {
            i8xVar = new i8x(this, ibkVar);
        }
        Object objM76980u = i8xVar.f99853a;
        int i2 = i8xVar.f99855c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            m20944v(0.0d);
            if (this.f3921r.mo55623a() == null) {
                return new b890();
            }
            if (((fe5) this.f3920q).m41410a()) {
                return new c890();
            }
            t8s t8sVar = new t8s(this, null, 23);
            i8xVar.f99855c = 1;
            objM76980u = s1h1.m76980u(10000L, t8sVar, i8xVar);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        fdi0 fdi0Var = (fdi0) objM76980u;
        m20944v(50.0d);
        if (fdi0Var == null || m41018b()) {
            return new b890();
        }
        ((j7x) this.f3918o).f109695K.run();
        return e890.m38084a();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l */
    public final long getF6252s() {
        return 300L;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m */
    public final long getF6251r() {
        return 30L;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF3916m() {
        return this.f3916m;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF3923t() {
        return this.f3923t;
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
            message = "Unexpected exception";
        }
        na6.m63972t(message, exc);
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF3915l() {
        return this.f3915l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f3922s;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF3917n() {
        return this.f3917n;
    }
}
