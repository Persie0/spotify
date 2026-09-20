package p204p;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ex10 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final fx10 f63645a;

    /* JADX INFO: renamed from: b */
    public Exception f63646b;

    public ex10(fx10 fx10Var) {
        this.f63645a = fx10Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = p2l.f173365a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        try {
                            fx10 fx10Var = this.f63645a;
                            fx10Var.getClass();
                            String str = dx10.f53819j;
                            return hvi0.m48875k(fx10Var);
                        } catch (Exception e) {
                            this.f63646b = e;
                            return null;
                        }
                    } catch (Throwable th) {
                        p2l.m68953a(this, th);
                    }
                }
            } catch (Throwable th2) {
                p2l.m68953a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return;
        }
        try {
            List list = (List) obj;
            if (!set.contains(this)) {
                try {
                    super.onPostExecute(list);
                    Exception exc = this.f63646b;
                    if (exc != null) {
                        String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        p8y p8yVar = p8y.f175080a;
                    }
                } catch (Throwable th) {
                    p2l.m68953a(this, th);
                }
            }
        } catch (Throwable th2) {
            p2l.m68953a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        fx10 fx10Var = this.f63645a;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            super.onPreExecute();
            p8y p8yVar = p8y.f175080a;
            if (fx10Var.f74219a == null) {
                fx10Var.f74219a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.f63645a + "}";
    }
}
