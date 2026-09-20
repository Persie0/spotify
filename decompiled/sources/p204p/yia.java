package p204p;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yia extends AsyncTask {
    /* JADX INFO: renamed from: a */
    public final void m93702a(Object... objArr) {
        try {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
        } catch (Exception e) {
            syg1.m79704w("Caught Exception in AsyncTask: " + e.getMessage());
            execute(objArr);
        }
    }
}
