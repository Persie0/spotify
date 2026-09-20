package p204p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ekr implements Executor {

    /* JADX INFO: renamed from: b */
    public static volatile ekr f60524b;

    /* JADX INFO: renamed from: c */
    public static final ekr f60525c = new ekr(1);

    /* JADX INFO: renamed from: d */
    public static final ekr f60526d = new ekr(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60527a;

    public /* synthetic */ ekr(int i) {
        this.f60527a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f60527a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                new Thread(runnable).start();
                break;
            case 4:
                ki5.m56473e().mo42760a(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
