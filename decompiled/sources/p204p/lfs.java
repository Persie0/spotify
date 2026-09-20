package p204p;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class lfs {

    /* JADX INFO: renamed from: a */
    public int f133003a;

    /* JADX INFO: renamed from: b */
    public long f133004b;

    /* JADX INFO: renamed from: c */
    public Object f133005c;

    /* JADX INFO: renamed from: d */
    public Object f133006d;

    /* JADX INFO: renamed from: e */
    public final Object f133007e;

    public lfs(lv61 lv61Var, int i, long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f133003a = i;
        this.f133004b = timeUnit.toNanos(j);
        this.f133005c = lv61Var.m60068d();
        this.f133006d = new tqr(dq60.m36616p(c0f1.f32775b, " ConnectionPool connection closer", new StringBuilder()), 1, this);
        this.f133007e = new ConcurrentLinkedQueue();
        if (j <= 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "keepAliveDuration <= 0: ").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public int m58916a(avu0 avu0Var, long j) {
        TimeZone timeZone = c0f1.f32774a;
        ArrayList arrayList = avu0Var.f20278q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + avu0Var.f20264c.f210738a.f276529h + " was leaked. Did you forget to close a response body?";
                wco0 wco0Var = wco0.f250081a;
                wco0.f250081a.mo57292k(((xuu0) reference).f266176a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    avu0Var.f20279r = j - this.f133004b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public lfs() {
        this.f133004b = 0L;
        this.f133003a = 0;
        this.f133007e = new krb();
    }
}
