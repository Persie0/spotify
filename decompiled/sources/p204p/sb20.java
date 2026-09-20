package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.comscore.util.crashreport.CrashReportManager;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class sb20 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f207323b;

    public /* synthetic */ sb20(int i, Runnable runnable) {
        this.f207322a = i;
        this.f207323b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.f207322a;
        Object obj = this.f207323b;
        switch (i) {
            case 0:
                n5q n5qVar = xsr.f265651a;
                ((hqb) obj).m48208B(pvb0.f181680a, Long.valueOf(j));
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? r35.m74600h(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new z55((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + CrashReportManager.TIME_WINDOW);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ sb20(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f207322a = 1;
        this.f207323b = context;
    }
}
