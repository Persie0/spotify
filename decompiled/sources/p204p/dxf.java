package p204p;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dxf implements j4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53951a;

    public /* synthetic */ dxf(int i) {
        this.f53951a = i;
    }

    @Override // p204p.j4t0
    public final Object get() {
        switch (this.f53951a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.m1882a();
            case 2:
                gr70 gr70Var = ExecutorsRegistrar.f2390a;
                return new imq(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new pbm("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f2393d.get());
            case 3:
                gr70 gr70Var2 = ExecutorsRegistrar.f2390a;
                return new imq(Executors.newCachedThreadPool(new pbm("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f2393d.get());
            case 4:
                gr70 gr70Var3 = ExecutorsRegistrar.f2390a;
                return Executors.newSingleThreadScheduledExecutor(new pbm("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
