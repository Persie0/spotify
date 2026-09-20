package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fy61 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gy61 f74533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f74534b;

    public fy61(gy61 gy61Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f74533a = gy61Var;
        this.f74534b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.f74533a.m46121a();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f74534b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
