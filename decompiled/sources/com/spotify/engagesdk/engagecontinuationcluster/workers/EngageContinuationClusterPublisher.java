package com.spotify.engagesdk.engagecontinuationcluster.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.byz0;
import p204p.cei0;
import p204p.d34;
import p204p.d7v;
import p204p.dit0;
import p204p.e890;
import p204p.g6x0;
import p204p.ibk;
import p204p.kei0;
import p204p.l7v;
import p204p.p7v;
import p204p.qte;
import p204p.rhy0;
import p204p.sx0;
import p204p.vas;
import p204p.vb11;
import p204p.w6x0;
import p204p.y7v;
import p204p.yuk;
import p204p.z140;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBk\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/engagesdk/engagecontinuationcluster/workers/EngageContinuationClusterPublisher;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/byz0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/am71;", "timeKeeper", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/sx0;", "recentlyPlayedLoader", "Lp/p7v;", "publisher", "Lp/d34;", "properties", "Lp/dit0;", "scheduler", "Lp/l7v;", "engagePublishStatusCoordinator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/am71;Lp/rhy0;Lp/sx0;Lp/p7v;Lp/d34;Lp/dit0;Lp/l7v;)V", "p/ton", "src_main_java_com_spotify_engagesdk_engagecontinuationcluster-engagecontinuationcluster"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EngageContinuationClusterPublisher extends MusicAppQuasarWorker<byz0> {

    /* JADX INFO: renamed from: l */
    public final z140 f3857l;

    /* JADX INFO: renamed from: m */
    public final am71 f3858m;

    /* JADX INFO: renamed from: n */
    public final rhy0 f3859n;

    /* JADX INFO: renamed from: o */
    public final sx0 f3860o;

    /* JADX INFO: renamed from: p */
    public final p7v f3861p;

    /* JADX INFO: renamed from: q */
    public final d34 f3862q;

    /* JADX INFO: renamed from: r */
    public final dit0 f3863r;

    /* JADX INFO: renamed from: s */
    public final l7v f3864s;

    /* JADX INFO: renamed from: t */
    public final cei0 f3865t;

    /* JADX INFO: renamed from: u */
    public final String f3866u;

    /* JADX INFO: renamed from: v */
    public final long f3867v;

    /* JADX INFO: renamed from: w */
    public final long f3868w;

    public EngageContinuationClusterPublisher(Context context, WorkerParameters workerParameters, z140 z140Var, am71 am71Var, rhy0 rhy0Var, sx0 sx0Var, p7v p7vVar, d34 d34Var, dit0 dit0Var, l7v l7vVar) {
        super(context, workerParameters);
        this.f3857l = z140Var;
        this.f3858m = am71Var;
        this.f3859n = rhy0Var;
        this.f3860o = sx0Var;
        this.f3861p = p7vVar;
        this.f3862q = d34Var;
        this.f3863r = dit0Var;
        this.f3864s = l7vVar;
        this.f3865t = cei0.f37134a;
        this.f3866u = "EngageContinuationClusterPublisher";
        this.f3867v = 30L;
        this.f3868w = 30L;
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
        d7v d7vVar;
        if (ibkVar instanceof d7v) {
            d7vVar = (d7v) ibkVar;
            int i = d7vVar.f46279d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d7vVar.f46279d = i - Integer.MIN_VALUE;
            } else {
                d7vVar = new d7v(this, ibkVar);
            }
        } else {
            d7vVar = new d7v(this, ibkVar);
        }
        Object objM93011f = d7vVar.f46277b;
        int i2 = d7vVar.f46279d;
        qte qteVar = qte.f192368b;
        l7v l7vVar = this.f3864s;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM93011f);
                if (this.f3862q.m34802a()) {
                    p7v p7vVar = this.f3861p;
                    vas vasVar = new vas(this.f3860o, 10);
                    d7vVar.f46279d = 2;
                    objM93011f = ((y7v) p7vVar).m93011f(vasVar, d7vVar);
                    if (objM93011f != yukVar) {
                        if (((w6x0) objM93011f) instanceof g6x0) {
                            this.f3863r.cancel();
                        }
                        d7vVar.f46276a = null;
                        d7vVar.f46279d = 3;
                        if (((vb11) l7vVar).m85090a(qteVar, 0, 1, d7vVar) == yukVar) {
                        }
                        return e890.m38084a();
                    }
                } else {
                    d7vVar.f46279d = 1;
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM93011f);
                return e890.m38084a();
            }
            if (i2 == 2) {
                bga.m29073P(objM93011f);
                if (((w6x0) objM93011f) instanceof g6x0) {
                    this.f3863r.cancel();
                }
                d7vVar.f46276a = null;
                d7vVar.f46279d = 3;
                if (((vb11) l7vVar).m85090a(qteVar, 0, 1, d7vVar) == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Exception exc = d7vVar.f46276a;
                    bga.m29073P(objM93011f);
                    throw exc;
                }
                bga.m29073P(objM93011f);
            }
            return e890.m38084a();
        } catch (Exception e) {
            d7vVar.f46276a = e;
            d7vVar.f46279d = 4;
            if (((vb11) l7vVar).m85090a(qteVar, 7, 2, d7vVar) != yukVar) {
                throw e;
            }
        }
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF3867v() {
        return this.f3867v;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF3868w() {
        return this.f3868w;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF3859n() {
        return this.f3859n;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF3866u() {
        return this.f3866u;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF3857l() {
        return this.f3857l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f3865t;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF3858m() {
        return this.f3858m;
    }
}
