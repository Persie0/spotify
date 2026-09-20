package p204p;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oz3 f43428b;

    public /* synthetic */ cz3(oz3 oz3Var, int i) {
        this.f43427a = i;
        this.f43428b = oz3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43427a) {
            case 0:
                oz3 oz3Var = this.f43428b;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!oz3Var.f172039i.isEmpty()) {
                    try {
                        ((eh00) oz3Var.f172039i.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            default:
                oz3 oz3Var2 = this.f43428b;
                oz3Var2.f172023c2 = false;
                MotionEvent motionEvent = oz3Var2.f172004U1;
                wj50.m88279p(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                oz3Var2.m68592J(motionEvent);
                return;
        }
    }
}
