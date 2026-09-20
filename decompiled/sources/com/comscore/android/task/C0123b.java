package com.comscore.android.task;

/* JADX INFO: renamed from: com.comscore.android.task.b */
/* JADX INFO: loaded from: classes3.dex */
class C0123b extends Thread {

    /* JADX INFO: renamed from: a */
    private boolean f1560a = false;

    /* JADX INFO: renamed from: b */
    private Object f1561b = new Object();

    /* JADX INFO: renamed from: c */
    private TaskExecutor f1562c;

    /* JADX INFO: renamed from: d */
    private TaskExceptionHandler f1563d;

    public C0123b(TaskExecutor taskExecutor, TaskExceptionHandler taskExceptionHandler) {
        this.f1563d = taskExceptionHandler;
        this.f1562c = taskExecutor;
    }

    /* JADX INFO: renamed from: a */
    public void m1234a() {
        synchronized (this.f1561b) {
            this.f1561b.notify();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1235b() {
        this.f1560a = true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1236c() {
        return this.f1560a;
    }

    /* JADX INFO: renamed from: d */
    public void m1237d() {
        long jM1221b = this.f1562c.m1221b();
        if (jM1221b > 0) {
            m1233a(jM1221b);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        TaskExceptionHandler taskExceptionHandler;
        while (!m1236c()) {
            RunnableC0122a runnableC0122aM1219a = this.f1562c.m1219a();
            if (runnableC0122aM1219a != null) {
                runnableC0122aM1219a.run();
                if (runnableC0122aM1219a.m1223b() != null && (taskExceptionHandler = this.f1563d) != null) {
                    taskExceptionHandler.exception(runnableC0122aM1219a.m1223b(), this.f1562c, runnableC0122aM1219a.m1227f());
                }
                this.f1562c.m1220a(runnableC0122aM1219a);
                if (runnableC0122aM1219a.m1231j()) {
                    this.f1562c.execute(runnableC0122aM1219a.m1227f(), runnableC0122aM1219a.m1226e(), runnableC0122aM1219a.m1226e());
                }
            } else {
                m1237d();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1233a(long j) {
        synchronized (this.f1561b) {
            try {
                this.f1561b.wait(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
