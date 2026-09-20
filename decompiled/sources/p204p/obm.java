package p204p;

import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class obm implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163677a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f163678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f163679c;

    public /* synthetic */ obm(Runnable runnable, by81 by81Var) {
        this.f163678b = runnable;
        this.f163679c = by81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f163677a) {
            case 0:
                pbm pbmVar = (pbm) this.f163679c;
                Process.setThreadPriority(pbmVar.f175876c);
                StrictMode.ThreadPolicy threadPolicy = pbmVar.f175877d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                this.f163678b.run();
                return;
            default:
                Runnable runnable = this.f163678b;
                by81 by81Var = (by81) this.f163679c;
                try {
                    runnable.run();
                    return;
                } finally {
                    by81Var.m30881a();
                }
        }
    }

    public /* synthetic */ obm(pbm pbmVar, Runnable runnable) {
        this.f163679c = pbmVar;
        this.f163678b = runnable;
    }
}
