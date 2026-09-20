package p204p;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.InlineExecutionProhibitedException;

/* JADX INFO: loaded from: classes3.dex */
public final class zr20 implements Executor {

    /* JADX INFO: renamed from: c */
    public static volatile zr20 f285525c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285526a;

    /* JADX INFO: renamed from: b */
    public final Object f285527b;

    public /* synthetic */ zr20(Object obj, int i) {
        this.f285526a = i;
        this.f285527b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f285526a) {
            case 0:
                ((ExecutorService) this.f285527b).execute(runnable);
                return;
            case 1:
                jsa jsaVar = ((auk) ((csk) this.f285527b).f41640a).f19950c;
                wj50.m88279p(runnable);
                jsaVar.post(runnable);
                return;
            case 2:
                ((ywh0) this.f285527b).post(runnable);
                return;
            case 3:
                bz1 bz1Var = new bz1(runnable, Thread.currentThread());
                ((Executor) this.f285527b).execute(bz1Var);
                InlineExecutionProhibitedException inlineExecutionProhibitedException = (InlineExecutionProhibitedException) bz1Var.f32343d;
                if (inlineExecutionProhibitedException != null) {
                    throw inlineExecutionProhibitedException;
                }
                bz1Var.f32342c = null;
                return;
            default:
                ((o0e1) this.f285527b).f160373c.post(runnable);
                return;
        }
    }

    public zr20(Looper looper) {
        this.f285526a = 2;
        this.f285527b = new ywh0(looper, 6);
    }

    public zr20() {
        this.f285526a = 0;
        this.f285527b = Executors.newSingleThreadExecutor(new rgy0(1));
    }
}
