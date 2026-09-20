package com.spotify.share.housekeeping.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.share.housekeeping.api.ShareHousekeepingWorker;
import kotlin.Metadata;
import p204p.b890;
import p204p.bga;
import p204p.cks;
import p204p.e890;
import p204p.ezw0;
import p204p.fbk;
import p204p.hvi0;
import p204p.ibk;
import p204p.ils;
import p204p.joj0;
import p204p.jwg1;
import p204p.luk;
import p204p.nr01;
import p204p.ts01;
import p204p.w2a1;
import p204p.x0h1;
import p204p.yuk;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/share/housekeeping/impl/ShareHousekeepingWorkerImpl;", "Lcom/spotify/share/housekeeping/api/ShareHousekeepingWorker;", "Lp/nr01;", "filesCleaner", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Lp/nr01;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/j1n", "src_main_java_com_spotify_share_housekeeping_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ShareHousekeepingWorkerImpl extends ShareHousekeepingWorker {

    /* JADX INFO: renamed from: h */
    public static final long f6652h;

    /* JADX INFO: renamed from: g */
    public final nr01 f6653g;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f6652h = jwg1.m54449D(30, ils.MINUTES);
    }

    public ShareHousekeepingWorkerImpl(nr01 nr01Var, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f6653g = nr01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) {
        ts01 ts01Var;
        if (fbkVar instanceof ts01) {
            ts01Var = (ts01) fbkVar;
            int i = ts01Var.f223185c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ts01Var.f223185c = i - Integer.MIN_VALUE;
            } else {
                ts01Var = new ts01(this, (ibk) fbkVar);
            }
        } else {
            ts01Var = new ts01(this, (ibk) fbkVar);
        }
        Object obj = ts01Var.f223183a;
        int i2 = ts01Var.f223185c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                nr01 nr01Var = this.f6653g;
                long j = f6652h;
                ts01Var.f223185c = 1;
                ezw0 ezw0Var = (ezw0) nr01Var;
                Object objM89557A = x0h1.m89557A((luk) ezw0Var.f64487d, new joj0(ezw0Var, j, null), ts01Var);
                Object obj2 = yuk.f276404a;
                if (objM89557A != obj2) {
                    objM89557A = w2a1.f247311a;
                }
                if (objM89557A == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return e890.m38084a();
        } catch (Throwable unused) {
            return new b890();
        }
    }
}
