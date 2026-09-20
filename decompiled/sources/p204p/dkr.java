package p204p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class dkr implements Executor {

    /* JADX INFO: renamed from: b */
    public static final dkr f50013b = new dkr(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dkr f50014c = new dkr(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ dkr f50015d = new dkr(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50016a;

    public /* synthetic */ dkr(int i) {
        this.f50016a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f50016a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
