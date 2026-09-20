package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jd8 {

    /* JADX INFO: renamed from: a */
    public final bf8 f111283a;

    /* JADX INFO: renamed from: b */
    public final zc8 f111284b;

    /* JADX INFO: renamed from: c */
    public final og8 f111285c;

    /* JADX INFO: renamed from: d */
    public final xre f111286d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f111287e;

    /* JADX INFO: renamed from: f */
    public final fw7 f111288f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f111289g = new ConcurrentHashMap();

    public jd8(bf8 bf8Var, zc8 zc8Var, og8 og8Var, xre xreVar, Scheduler scheduler, fw7 fw7Var) {
        this.f111283a = bf8Var;
        this.f111284b = zc8Var;
        this.f111285c = og8Var;
        this.f111286d = xreVar;
        this.f111287e = scheduler;
        this.f111288f = fw7Var;
    }
}
