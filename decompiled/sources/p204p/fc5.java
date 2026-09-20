package p204p;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class fc5 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68005a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f68006b;

    /* JADX INFO: renamed from: c */
    public Runnable f68007c;

    /* JADX INFO: renamed from: d */
    public final Object f68008d;

    /* JADX INFO: renamed from: e */
    public final Executor f68009e;

    public fc5(Executor executor) {
        this.f68005a = 1;
        this.f68009e = executor;
        this.f68006b = new ArrayDeque();
        this.f68008d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final void m41292a() {
        switch (this.f68005a) {
            case 0:
                synchronized (this.f68008d) {
                    try {
                        Runnable runnable = (Runnable) this.f68006b.poll();
                        this.f68007c = runnable;
                        if (runnable != null) {
                            ((ekr) this.f68009e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f68006b.poll();
                this.f68007c = runnable2;
                if (runnable2 != null) {
                    this.f68009e.execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f68005a) {
            case 0:
                synchronized (this.f68008d) {
                    try {
                        this.f68006b.add(new fr2(9, this, runnable));
                        if (this.f68007c == null) {
                            m41292a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f68008d) {
                    try {
                        this.f68006b.add(new uod0(22, this, runnable));
                        if (this.f68007c == null) {
                            m41292a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public fc5(ekr ekrVar) {
        this.f68005a = 0;
        this.f68008d = new Object();
        this.f68006b = new ArrayDeque();
        this.f68009e = ekrVar;
    }
}
