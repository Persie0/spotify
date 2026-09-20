package p204p;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public final class n9h1 extends d8h1 implements RunnableFuture {

    /* JADX INFO: renamed from: O0 */
    public volatile l9h1 f151804O0;

    public n9h1(Callable callable) {
        this.f151804O0 = new l9h1(this, callable);
    }

    /* JADX INFO: renamed from: M */
    public static n9h1 m63925M(Runnable runnable, Object obj) {
        return new n9h1(Executors.callable(runnable, obj));
    }

    @Override // p204p.d8h1
    /* JADX INFO: renamed from: G */
    public final void mo35274G() {
        l9h1 l9h1Var;
        Object obj = this.f130873t;
        if ((obj instanceof a8h1) && ((a8h1) obj).f13299a && (l9h1Var = this.f151804O0) != null) {
            snk0 snk0Var = l9h1.f131125d;
            snk0 snk0Var2 = l9h1.f131124c;
            Runnable runnable = (Runnable) l9h1Var.get();
            if (runnable instanceof Thread) {
                w8h1 w8h1Var = new w8h1(l9h1Var);
                w8h1Var.m87462a(Thread.currentThread());
                if (l9h1Var.compareAndSet(runnable, w8h1Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) l9h1Var.getAndSet(snk0Var2)) == snk0Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) l9h1Var.getAndSet(snk0Var2)) == snk0Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f151804O0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.d8h1
    /* JADX INFO: renamed from: H */
    public final String mo35275H() {
        l9h1 l9h1Var = this.f151804O0;
        if (l9h1Var != null) {
            String string = l9h1Var.toString();
            return dq60.m36618r(new StringBuilder(string.length() + 7), "task=[", string, "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        l9h1 l9h1Var = this.f151804O0;
        if (l9h1Var != null) {
            l9h1Var.run();
        }
        this.f151804O0 = null;
    }
}
