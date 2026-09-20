package p204p;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class clq {

    /* JADX INFO: renamed from: a */
    public final blq f39336a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f39337b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f39338c = new AtomicBoolean(false);

    public clq(blq blqVar) {
        this.f39336a = blqVar;
    }

    /* JADX INFO: renamed from: c */
    public final n95 m33294c() {
        if (this.f39338c.get()) {
            throw new IllegalStateException("Cannot acquire handle after delayed execution has fired");
        }
        n95 n95Var = new n95();
        n95Var.f151718b = this;
        n95Var.f151717a = new AtomicBoolean(false);
        m33295d().incrementAndGet();
        return n95Var;
    }

    /* JADX INFO: renamed from: d */
    public final AtomicInteger m33295d() {
        return this.f39337b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && clq.class.equals(obj.getClass())) {
            clq clqVar = (clq) obj;
            if (wj50.m88271j(this.f39336a, clqVar.f39336a) && this.f39337b.get() == clqVar.f39337b.get() && this.f39338c.get() == clqVar.f39338c.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f39336a, this.f39337b, this.f39338c);
    }
}
