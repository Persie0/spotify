package p204p;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes11.dex */
public final class dd60 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47729a;

    /* JADX INFO: renamed from: b */
    public final Runnable f47730b;

    public /* synthetic */ dd60(int i, Runnable runnable) {
        this.f47729a = i;
        this.f47730b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47729a) {
            case 0:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                this.f47730b.run();
                break;
            case 1:
                try {
                    this.f47730b.run();
                } catch (Exception unused) {
                    qvf1.m74015l("Executor");
                    return;
                }
                break;
            case 2:
                this.f47730b.run();
                break;
            case 3:
                this.f47730b.run();
                break;
            case 4:
                this.f47730b.run();
                break;
            case 5:
                Deque deque = (Deque) e8g0.f57193b.get();
                ig31.m50506x(deque);
                Runnable runnable = this.f47730b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                e8g0.f57193b.set(new ArrayDeque());
                this.f47730b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f47729a) {
            case 2:
                return this.f47730b.toString();
            case 3:
                return this.f47730b.toString();
            default:
                return super.toString();
        }
    }
}
