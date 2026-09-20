package com.spotify.engagesdk.engagerecommendationscluster.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.byz0;
import p204p.cei0;
import p204p.dit0;
import p204p.e34;
import p204p.e890;
import p204p.g6x0;
import p204p.ibk;
import p204p.kei0;
import p204p.l7v;
import p204p.n7v;
import p204p.p7v;
import p204p.qte;
import p204p.rhy0;
import p204p.rx0;
import p204p.vas;
import p204p.vb11;
import p204p.w6x0;
import p204p.y7v;
import p204p.yuk;
import p204p.z140;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBk\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/engagesdk/engagerecommendationscluster/workers/EngageRecommendationsClusterPublisher;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/byz0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/am71;", "timeKeeper", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/rx0;", "homeLoader", "Lp/p7v;", "repository", "Lp/e34;", "properties", "Lp/dit0;", "scheduler", "Lp/l7v;", "publishStatusCoordinator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/am71;Lp/rhy0;Lp/rx0;Lp/p7v;Lp/e34;Lp/dit0;Lp/l7v;)V", "p/xpn", "src_main_java_com_spotify_engagesdk_engagerecommendationscluster-engagerecommendationscluster"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EngageRecommendationsClusterPublisher extends MusicAppQuasarWorker<byz0> {

    /* JADX INFO: renamed from: l */
    public final z140 f3880l;

    /* JADX INFO: renamed from: m */
    public final am71 f3881m;

    /* JADX INFO: renamed from: n */
    public final rhy0 f3882n;

    /* JADX INFO: renamed from: o */
    public final rx0 f3883o;

    /* JADX INFO: renamed from: p */
    public final p7v f3884p;

    /* JADX INFO: renamed from: q */
    public final e34 f3885q;

    /* JADX INFO: renamed from: r */
    public final dit0 f3886r;

    /* JADX INFO: renamed from: s */
    public final l7v f3887s;

    /* JADX INFO: renamed from: t */
    public final cei0 f3888t;

    /* JADX INFO: renamed from: u */
    public final String f3889u;

    /* JADX INFO: renamed from: v */
    public final long f3890v;

    /* JADX INFO: renamed from: w */
    public final long f3891w;

    public EngageRecommendationsClusterPublisher(Context context, WorkerParameters workerParameters, z140 z140Var, am71 am71Var, rhy0 rhy0Var, rx0 rx0Var, p7v p7vVar, e34 e34Var, dit0 dit0Var, l7v l7vVar) {
        super(context, workerParameters);
        this.f3880l = z140Var;
        this.f3881m = am71Var;
        this.f3882n = rhy0Var;
        this.f3883o = rx0Var;
        this.f3884p = p7vVar;
        this.f3885q = e34Var;
        this.f3886r = dit0Var;
        this.f3887s = l7vVar;
        this.f3888t = cei0.f37134a;
        this.f3889u = "EngageRecommendationsPublisher";
        this.f3890v = 30L;
        this.f3891w = 30L;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:18:0x0043, B:40:0x009f, B:21:0x0049, B:34:0x0084, B:36:0x008a, B:37:0x008f, B:31:0x006e), top: B:47:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (((p204p.vb11) r6).m85090a(r5, 9, 2, r11) == r7) goto L44;
     */
    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6805k(byz0 byz0Var, ibk ibkVar) throws Exception {
        n7v n7vVar;
        if (ibkVar instanceof n7v) {
            n7vVar = (n7v) ibkVar;
            int i = n7vVar.f151225d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7vVar.f151225d = i - Integer.MIN_VALUE;
            } else {
                n7vVar = new n7v(this, ibkVar);
            }
        } else {
            n7vVar = new n7v(this, ibkVar);
        }
        Object objM93012g = n7vVar.f151223b;
        int i2 = n7vVar.f151225d;
        qte qteVar = qte.f192367a;
        l7v l7vVar = this.f3887s;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM93012g);
                if (this.f3885q.m37617a()) {
                    p7v p7vVar = this.f3884p;
                    vas vasVar = new vas(this.f3883o, 11);
                    n7vVar.f151225d = 2;
                    objM93012g = ((y7v) p7vVar).m93012g(vasVar, n7vVar);
                    if (objM93012g != yukVar) {
                        if (((w6x0) objM93012g) instanceof g6x0) {
                            this.f3886r.cancel();
                        }
                        n7vVar.f151222a = null;
                        n7vVar.f151225d = 3;
                        if (((vb11) l7vVar).m85090a(qteVar, 0, 1, n7vVar) == yukVar) {
                        }
                        return e890.m38084a();
                    }
                } else {
                    n7vVar.f151225d = 1;
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM93012g);
                return e890.m38084a();
            }
            if (i2 == 2) {
                bga.m29073P(objM93012g);
                if (((w6x0) objM93012g) instanceof g6x0) {
                    this.f3886r.cancel();
                }
                n7vVar.f151222a = null;
                n7vVar.f151225d = 3;
                if (((vb11) l7vVar).m85090a(qteVar, 0, 1, n7vVar) == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Exception exc = n7vVar.f151222a;
                    bga.m29073P(objM93012g);
                    throw exc;
                }
                bga.m29073P(objM93012g);
            }
            return e890.m38084a();
        } catch (Exception e) {
            n7vVar.f151222a = e;
            n7vVar.f151225d = 4;
            if (((vb11) l7vVar).m85090a(qteVar, 7, 2, n7vVar) != yukVar) {
                throw e;
            }
        }
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF3890v() {
        return this.f3890v;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF3891w() {
        return this.f3891w;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF3882n() {
        return this.f3882n;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF3889u() {
        return this.f3889u;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF3880l() {
        return this.f3880l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f3888t;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF3881m() {
        return this.f3881m;
    }
}
