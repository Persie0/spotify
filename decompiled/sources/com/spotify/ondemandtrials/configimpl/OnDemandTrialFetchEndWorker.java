package com.spotify.ondemandtrials.configimpl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.b890;
import p204p.bga;
import p204p.e890;
import p204p.f9l0;
import p204p.fbk;
import p204p.ibk;
import p204p.iml0;
import p204p.uml0;
import p204p.yuk;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/ondemandtrials/configimpl/OnDemandTrialFetchEndWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/iml0;", "oneDayTrialEndMessagingApi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/iml0;)V", "p/yon", "src_main_java_com_spotify_ondemandtrials_configimpl-configimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OnDemandTrialFetchEndWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final iml0 f6398g;

    public OnDemandTrialFetchEndWorker(Context context, WorkerParameters workerParameters, iml0 iml0Var) {
        super(context, workerParameters);
        this.f6398g = iml0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) {
        f9l0 f9l0Var;
        if (fbkVar instanceof f9l0) {
            f9l0Var = (f9l0) fbkVar;
            int i = f9l0Var.f67298c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9l0Var.f67298c = i - Integer.MIN_VALUE;
            } else {
                f9l0Var = new f9l0(this, (ibk) fbkVar);
            }
        } else {
            f9l0Var = new f9l0(this, (ibk) fbkVar);
        }
        Object obj = f9l0Var.f67296a;
        int i2 = f9l0Var.f67298c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                iml0 iml0Var = this.f6398g;
                f9l0Var.f67298c = 1;
                Object objM83455b = ((uml0) iml0Var).m83455b(f9l0Var);
                yuk yukVar = yuk.f276404a;
                if (objM83455b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return e890.m38084a();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new b890();
        }
    }
}
