package com.comscore.android.task;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class TaskExecutor {

    /* JADX INFO: renamed from: e */
    private static final long f1544e = 50000;

    /* JADX INFO: renamed from: a */
    private C0123b f1545a;

    /* JADX INFO: renamed from: b */
    private BlockingQueue<RunnableC0122a> f1546b;

    /* JADX INFO: renamed from: c */
    private boolean f1547c;

    /* JADX INFO: renamed from: d */
    private TaskExceptionHandler f1548d;

    /* JADX INFO: renamed from: com.comscore.android.task.TaskExecutor$a */
    public class C0120a implements TaskExceptionHandler {
        @Override // com.comscore.android.task.TaskExceptionHandler
        public void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable) {
            exc.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: com.comscore.android.task.TaskExecutor$b */
    public class RunnableC0121b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f1549a;

        public RunnableC0121b(Runnable runnable) {
            this.f1549a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1549a.run();
            } catch (Exception e) {
                TaskExecutor taskExecutor = TaskExecutor.this;
                TaskExceptionHandler taskExceptionHandler = taskExecutor.f1548d;
                if (taskExceptionHandler != null) {
                    taskExceptionHandler.exception(e, taskExecutor, this.f1549a);
                }
            }
        }
    }

    public TaskExecutor(TaskExceptionHandler taskExceptionHandler) {
        this.f1547c = true;
        this.f1548d = taskExceptionHandler;
        this.f1546b = new LinkedBlockingQueue();
        C0123b c0123b = new C0123b(this, this.f1548d);
        this.f1545a = c0123b;
        c0123b.start();
    }

    /* JADX INFO: renamed from: b */
    public long m1221b() {
        Iterator<RunnableC0122a> it = this.f1546b.iterator();
        long jMin = f1544e;
        while (it.hasNext()) {
            jMin = Math.min(jMin, it.next().m1225d());
        }
        return jMin;
    }

    public boolean containsTask(Runnable runnable) {
        for (RunnableC0122a runnableC0122a : this.f1546b) {
            if (runnableC0122a.m1227f() == runnable) {
                return true;
            }
            if ((runnable instanceof RunnableC0122a) && runnableC0122a == runnable) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(Runnable runnable) {
        return execute(runnable, true);
    }

    public boolean executeInMainThread(Runnable runnable) {
        if (this.f1547c) {
            return new Handler(Looper.getMainLooper()).post(new RunnableC0121b(runnable));
        }
        return false;
    }

    public boolean isEnabled() {
        return this.f1547c;
    }

    public void removeAllEnqueuedTasks() {
        ArrayList arrayList = new ArrayList();
        for (RunnableC0122a runnableC0122a : this.f1546b) {
            if (runnableC0122a.m1228g()) {
                arrayList.add(runnableC0122a);
            }
        }
        this.f1546b.removeAll(arrayList);
    }

    public boolean removeEnqueuedTask(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        for (RunnableC0122a runnableC0122a : this.f1546b) {
            if (runnableC0122a.m1227f() == runnable) {
                return this.f1546b.remove(runnableC0122a);
            }
        }
        return false;
    }

    public void setEnabled(boolean z) {
        this.f1547c = z;
    }

    public int size() {
        return this.f1546b.size();
    }

    public void waitForLastNonDelayedTaskToFinish() {
        RunnableC0122a runnableC0122a;
        int size = this.f1546b.size();
        RunnableC0122a[] runnableC0122aArr = new RunnableC0122a[size];
        this.f1546b.toArray(runnableC0122aArr);
        for (int i = size - 1; i >= 0; i--) {
            RunnableC0122a runnableC0122a2 = runnableC0122aArr[i];
            if (runnableC0122a2 != null && !runnableC0122a2.m1229h()) {
                runnableC0122a = runnableC0122aArr[i];
                waitForTaskToFinish(runnableC0122a, 0L);
            }
        }
        runnableC0122a = null;
        waitForTaskToFinish(runnableC0122a, 0L);
    }

    public void waitForTaskToFinish(Runnable runnable, long j) {
        RunnableC0122a next;
        if (!(runnable instanceof RunnableC0122a)) {
            Iterator<RunnableC0122a> it = this.f1546b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.m1227f() != runnable);
        } else {
            next = (RunnableC0122a) runnable;
        }
        if (next != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (this.f1546b.contains(next)) {
                if (j > 0 && System.currentTimeMillis() >= jCurrentTimeMillis + j) {
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void waitForTasks() {
        while (this.f1546b.size() != 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public RunnableC0122a m1219a() {
        for (RunnableC0122a runnableC0122a : this.f1546b) {
            if (runnableC0122a.m1224c() <= System.currentTimeMillis()) {
                return runnableC0122a;
            }
        }
        return null;
    }

    public boolean execute(Runnable runnable, boolean z) {
        if (z) {
            return execute(runnable, 0L);
        }
        if (!this.f1547c) {
            return false;
        }
        try {
            runnable.run();
            return true;
        } catch (Exception e) {
            if (this.f1548d == null) {
                return true;
            }
            this.f1548d.exception(e, this, runnable);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1220a(RunnableC0122a runnableC0122a) {
        this.f1546b.remove(runnableC0122a);
    }

    public TaskExecutor() {
        this(new C0120a());
    }

    public boolean execute(Runnable runnable, long j) {
        return execute(runnable, j, 0L);
    }

    public boolean execute(Runnable runnable, long j, long j2) {
        return execute(runnable, j, j2, false);
    }

    public boolean execute(Runnable runnable, long j, long j2, boolean z) {
        if (!this.f1547c) {
            return false;
        }
        for (RunnableC0122a runnableC0122a : this.f1546b) {
            if (runnableC0122a != null && runnableC0122a.m1227f() == runnable) {
                return false;
            }
        }
        this.f1546b.add(new RunnableC0122a(runnable, j, j2, z));
        this.f1545a.m1234a();
        return true;
    }
}
