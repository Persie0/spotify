package com.spotify.engagesdk.engagesigninrequest.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.Metadata;
import p204p.am71;
import p204p.bga;
import p204p.cei0;
import p204p.e301;
import p204p.e890;
import p204p.f34;
import p204p.ibk;
import p204p.k7v;
import p204p.kei0;
import p204p.lji;
import p204p.p7v;
import p204p.rhy0;
import p204p.ulg1;
import p204p.vjz;
import p204p.vyf1;
import p204p.yuk;
import p204p.z140;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015BW\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/engagesdk/engagesigninrequest/workers/EngageOnBroadcastSignInHandler;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/lji;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/am71;", "timeKeeper", "Lp/rhy0;", "scopeWorkDispatcher", "Lio/reactivex/rxjava3/core/Flowable;", "Lp/e301;", "sessionState", "Lp/p7v;", "engageRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/am71;Lp/rhy0;Lio/reactivex/rxjava3/core/Flowable;Lp/p7v;)V", "p/von", "src_main_java_com_spotify_engagesdk_engagesigninrequest-engagesigninrequest"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EngageOnBroadcastSignInHandler extends MusicAppQuasarWorker<lji> {

    /* JADX INFO: renamed from: l */
    public final z140 f3892l;

    /* JADX INFO: renamed from: m */
    public final am71 f3893m;

    /* JADX INFO: renamed from: n */
    public final rhy0 f3894n;

    /* JADX INFO: renamed from: o */
    public final Flowable f3895o;

    /* JADX INFO: renamed from: p */
    public final p7v f3896p;

    /* JADX INFO: renamed from: q */
    public final cei0 f3897q;

    /* JADX INFO: renamed from: r */
    public final String f3898r;

    /* JADX INFO: renamed from: s */
    public final long f3899s;

    /* JADX INFO: renamed from: t */
    public final long f3900t;

    public EngageOnBroadcastSignInHandler(Context context, WorkerParameters workerParameters, z140 z140Var, am71 am71Var, rhy0 rhy0Var, Flowable<e301> flowable, p7v p7vVar) {
        super(context, workerParameters);
        this.f3892l = z140Var;
        this.f3893m = am71Var;
        this.f3894n = rhy0Var;
        this.f3895o = flowable;
        this.f3896p = p7vVar;
        this.f3897q = cei0.f37134a;
        this.f3898r = "EngageSignInRequester";
        this.f3899s = 30L;
        this.f3900t = 30L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (p204p.w1h1.m87009n(r7, r8, r0) == r4) goto L24;
     */
    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6805k(lji ljiVar, ibk ibkVar) {
        k7v k7vVar;
        p7v p7vVar;
        if (ibkVar instanceof k7v) {
            k7vVar = (k7v) ibkVar;
            int i = k7vVar.f120202d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7vVar.f120202d = i - Integer.MIN_VALUE;
            } else {
                k7vVar = new k7v(this, ibkVar);
            }
        } else {
            k7vVar = new k7v(this, ibkVar);
        }
        Object obj = k7vVar.f120200b;
        int i2 = k7vVar.f120202d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                p7vVar = k7vVar.f120199a;
                bga.m29073P(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                k7vVar.f120199a = null;
                k7vVar.f120202d = 2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return e890.m38084a();
        }
        bga.m29073P(obj);
        if (new f34(false, ljiVar.mo56605i()).m40634a()) {
            vjz vjzVarM83390x = ulg1.m83390x(this.f3895o);
            p7v p7vVar2 = this.f3896p;
            k7vVar.f120199a = p7vVar2;
            k7vVar.f120202d = 1;
            Object objM86755t = vyf1.m86755t(vjzVarM83390x, k7vVar);
            if (objM86755t != yukVar) {
                obj = objM86755t;
                p7vVar = p7vVar2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                k7vVar.f120199a = null;
                k7vVar.f120202d = 2;
            }
            return yukVar;
        }
        return e890.m38084a();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF3899s() {
        return this.f3899s;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF3900t() {
        return this.f3900t;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF3894n() {
        return this.f3894n;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF3898r() {
        return this.f3898r;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: x, reason: from getter */
    public final z140 getF3892l() {
        return this.f3892l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f3897q;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF3893m() {
        return this.f3893m;
    }
}
