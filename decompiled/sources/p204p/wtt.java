package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.deeplink.UcLoggedInDeepLinkActivity;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class wtt implements qql0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255011a;

    /* JADX INFO: renamed from: b */
    public final Object f255012b;

    public /* synthetic */ wtt(Object obj, int i) {
        this.f255011a = i;
        this.f255012b = obj;
    }

    @Override // p204p.qql0
    /* JADX INFO: renamed from: a */
    public final void mo25857a() throws InterruptedException {
        switch (this.f255011a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(1);
                vzx vzxVar = (vzx) this.f255012b;
                vzxVar.f246580t = new fts(countDownLatch, 5);
                vzxVar.f246578r.clear();
                Logger.m3965a("Sending onComplete to all connected clients.", new Object[0]);
                vzxVar.f246579s.onNext(Boolean.TRUE);
                countDownLatch.await();
                break;
            case 1:
                Context context = (Context) this.f255012b;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UcLoggedInDeepLinkActivity.class), 1, 1);
                break;
            case 2:
                bed0 bed0Var = (bed0) this.f255012b;
                bed0Var.getClass();
                bed0Var.f26335b = new Handler(bed0Var.f26334a.getLooper());
                break;
            default:
                mn71 mn71Var = (mn71) this.f255012b;
                mn71Var.setEnabled(true);
                mn71Var.mo62186a(true);
                break;
        }
    }

    @Override // p204p.qql0
    public final String getName() {
        switch (this.f255011a) {
            case 0:
                return "EisShutdownOperation";
            case 1:
                return "EnableUcLoggedInDeepLinkOperation";
            case 2:
                return "MediaFocusWorkerStartupOperation";
            default:
                return "TimeKeeperStartupOperation";
        }
    }
}
