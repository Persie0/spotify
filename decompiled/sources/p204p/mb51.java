package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class mb51 extends kyf1 {

    /* JADX INFO: renamed from: h */
    public final long f141803h;

    /* JADX INFO: renamed from: i */
    public final TimeUnit f141804i;

    public mb51(long j, TimeUnit timeUnit) {
        this.f141803h = j;
        this.f141804i = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb51)) {
            return false;
        }
        mb51 mb51Var = (mb51) obj;
        return this.f141803h == mb51Var.f141803h && this.f141804i == mb51Var.f141804i;
    }

    public final int hashCode() {
        return this.f141804i.hashCode() + (Long.hashCode(this.f141803h) * 31);
    }

    /* JADX INFO: renamed from: q */
    public final long m61348q() {
        return this.f141803h;
    }

    /* JADX INFO: renamed from: r */
    public final TimeUnit m61349r() {
        return this.f141804i;
    }
}
