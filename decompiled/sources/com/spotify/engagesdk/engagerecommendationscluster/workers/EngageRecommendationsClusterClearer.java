package com.spotify.engagesdk.engagerecommendationscluster.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.cei0;
import p204p.e890;
import p204p.i7v;
import p204p.ibk;
import p204p.j7v;
import p204p.kei0;
import p204p.lji;
import p204p.m7v;
import p204p.p7v;
import p204p.rhy0;
import p204p.y7v;
import p204p.yuk;
import p204p.z140;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BQ\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/engagesdk/engagerecommendationscluster/workers/EngageRecommendationsClusterClearer;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/lji;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/am71;", "timeKeeper", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/p7v;", "engageRepository", "Lp/i7v;", "cubesWorkerForegroundInfoFactory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/am71;Lp/rhy0;Lp/p7v;Lp/i7v;)V", "p/ypn", "src_main_java_com_spotify_engagesdk_engagerecommendationscluster-engagerecommendationscluster"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EngageRecommendationsClusterClearer extends MusicAppQuasarWorker<lji> {

    /* JADX INFO: renamed from: l */
    public final z140 f3871l;

    /* JADX INFO: renamed from: m */
    public final am71 f3872m;

    /* JADX INFO: renamed from: n */
    public final rhy0 f3873n;

    /* JADX INFO: renamed from: o */
    public final p7v f3874o;

    /* JADX INFO: renamed from: p */
    public final i7v f3875p;

    /* JADX INFO: renamed from: q */
    public final cei0 f3876q;

    /* JADX INFO: renamed from: r */
    public final String f3877r;

    /* JADX INFO: renamed from: s */
    public final long f3878s;

    /* JADX INFO: renamed from: t */
    public final long f3879t;

    public EngageRecommendationsClusterClearer(Context context, WorkerParameters workerParameters, z140 z140Var, am71 am71Var, rhy0 rhy0Var, p7v p7vVar, i7v i7vVar) {
        super(context, workerParameters);
        this.f3871l = z140Var;
        this.f3872m = am71Var;
        this.f3873n = rhy0Var;
        this.f3874o = p7vVar;
        this.f3875p = i7vVar;
        this.f3876q = cei0.f37134a;
        this.f3877r = "EngageRecommendationsClusterClearer";
        this.f3878s = 30L;
        this.f3879t = 30L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final Object mo6805k(lji ljiVar, ibk ibkVar) throws Throwable {
        m7v m7vVar;
        if (ibkVar instanceof m7v) {
            m7vVar = (m7v) ibkVar;
            int i = m7vVar.f140845c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7vVar.f140845c = i - Integer.MIN_VALUE;
            } else {
                m7vVar = new m7v(this, ibkVar);
            }
        } else {
            m7vVar = new m7v(this, ibkVar);
        }
        Object obj = m7vVar.f140843a;
        int i2 = m7vVar.f140845c;
        if (i2 == 0) {
            bga.m29073P(obj);
            m7vVar.f140845c = 1;
            Object objM93007b = ((y7v) this.f3874o).m93007b(m7vVar);
            yuk yukVar = yuk.f276404a;
            if (objM93007b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return e890.m38084a();
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: h */
    public final Object mo1148h() {
        return ((j7v) this.f3875p).m52648c();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF3878s() {
        return this.f3878s;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF3879t() {
        return this.f3879t;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF3873n() {
        return this.f3873n;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF3877r() {
        return this.f3877r;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF3871l() {
        return this.f3871l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f3876q;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF3872m() {
        return this.f3872m;
    }
}
