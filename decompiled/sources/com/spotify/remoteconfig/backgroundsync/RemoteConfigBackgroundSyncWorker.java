package com.spotify.remoteconfig.backgroundsync;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p204p.am71;
import p204p.baw0;
import p204p.bga;
import p204p.byz0;
import p204p.e890;
import p204p.hvi0;
import p204p.ibk;
import p204p.jei0;
import p204p.kei0;
import p204p.na6;
import p204p.rhy0;
import p204p.yuk;
import p204p.z140;
import p204p.zn91;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BA\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/remoteconfig/backgroundsync/RemoteConfigBackgroundSyncWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/byz0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/z140;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/rhy0;", "scopeWorkDispatcher", "Lp/am71;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/z140;Lp/rhy0;Lp/am71;)V", "p/spn", "src_main_java_com_spotify_remoteconfig_backgroundsync-backgroundsync"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RemoteConfigBackgroundSyncWorker extends MusicAppQuasarWorker<byz0> {

    /* JADX INFO: renamed from: l */
    public final z140 f6619l;

    /* JADX INFO: renamed from: m */
    public final rhy0 f6620m;

    /* JADX INFO: renamed from: n */
    public final am71 f6621n;

    /* JADX INFO: renamed from: o */
    public final jei0 f6622o;

    /* JADX INFO: renamed from: p */
    public final long f6623p;

    /* JADX INFO: renamed from: q */
    public final long f6624q;

    /* JADX INFO: renamed from: r */
    public final String f6625r;

    public RemoteConfigBackgroundSyncWorker(Context context, WorkerParameters workerParameters, z140 z140Var, rhy0 rhy0Var, am71 am71Var) {
        super(context, workerParameters);
        this.f6619l = z140Var;
        this.f6620m = rhy0Var;
        this.f6621n = am71Var;
        this.f6622o = jei0.f111607a;
        this.f6623p = 30L;
        this.f6624q = 300L;
        this.f6625r = "remote config background sync";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final Object mo6805k(byz0 byz0Var, ibk ibkVar) {
        baw0 baw0Var;
        if (ibkVar instanceof baw0) {
            baw0Var = (baw0) ibkVar;
            int i = baw0Var.f25356c;
            if ((i & Integer.MIN_VALUE) != 0) {
                baw0Var.f25356c = i - Integer.MIN_VALUE;
            } else {
                baw0Var = new baw0(this, ibkVar);
            }
        } else {
            baw0Var = new baw0(this, ibkVar);
        }
        Object obj = baw0Var.f25354a;
        int i2 = baw0Var.f25356c;
        if (i2 == 0) {
            bga.m29073P(obj);
            Single singleFirstOrError = byz0Var.mo30943s().f239060f.filter(hvi0.f95730Y).firstOrError();
            baw0Var.f25356c = 1;
            Object objM96567o = zn91.m96567o(singleFirstOrError, baw0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
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

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getF6624q() {
        return this.f6624q;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getF6623p() {
        return this.f6623p;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final rhy0 getF6620m() {
        return this.f6620m;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF6625r() {
        return this.f6625r;
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
    public final z140 getF6619l() {
        return this.f6619l;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: y */
    public final kei0 mo6813y() {
        return this.f6622o;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: z, reason: from getter */
    public final am71 getF6621n() {
        return this.f6621n;
    }
}
