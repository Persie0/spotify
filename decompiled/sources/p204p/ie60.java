package p204p;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public final class ie60 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Executor f101331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f101332c;

    public /* synthetic */ ie60(Executor executor, Object obj, int i) {
        this.f101330a = i;
        this.f101331b = executor;
        this.f101332c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f101330a) {
            case 0:
                try {
                    this.f101331b.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((je60) this.f101332c).mo53083c(e);
                    return;
                }
                break;
            case 1:
                try {
                    this.f101331b.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    ((inz) this.f101332c).m28331v(e2);
                    return;
                }
                break;
            default:
                this.f101331b.execute(runnable);
                break;
        }
    }

    public ie60(je60 je60Var, Executor executor) {
        this.f101330a = 0;
        this.f101331b = executor;
        this.f101332c = je60Var;
    }
}
