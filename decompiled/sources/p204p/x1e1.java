package p204p;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1e1 {
    /* JADX INFO: renamed from: a */
    public abstract f890 mo36127a(Context context, String str, WorkerParameters workerParameters);

    /* JADX INFO: renamed from: b */
    public final f890 m89636b(Context context, String str, WorkerParameters workerParameters) {
        f890 f890VarMo36127a = mo36127a(context, str, workerParameters);
        if (f890VarMo36127a == null) {
            try {
                try {
                    f890VarMo36127a = (f890) Class.forName(str).asSubclass(f890.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th) {
                    gaz gazVarM44190b = gaz.m44190b();
                    int i = y1e1.f268251a;
                    gazVarM44190b.getClass();
                    throw th;
                }
            } catch (Throwable th2) {
                gaz gazVarM44190b2 = gaz.m44190b();
                int i2 = y1e1.f268251a;
                gazVarM44190b2.getClass();
                throw th2;
            }
        }
        if (!f890VarMo36127a.f66919d) {
            return f890VarMo36127a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
