package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kmn0 extends c1e1 {
    public kmn0(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        i1e1 i1e1Var = this.f33079c;
        long millis = timeUnit.toMillis(j);
        i1e1Var.getClass();
        if (millis < 900000) {
            gaz.m44190b().getClass();
        }
        i1e1Var.m49414e(millis < 900000 ? 900000L : millis, millis < 900000 ? 900000L : millis);
    }

    @Override // p204p.c1e1
    /* JADX INFO: renamed from: c */
    public final e1e1 mo31256c() {
        if (this.f33077a && this.f33079c.f97508j.f13306d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        i1e1 i1e1Var = this.f33079c;
        if (i1e1Var.f97515q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new lmn0(this.f33078b, i1e1Var, this.f33080d);
    }

    @Override // p204p.c1e1
    /* JADX INFO: renamed from: d */
    public final c1e1 mo31257d() {
        return this;
    }
}
