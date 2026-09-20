package p204p;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class nua {

    /* JADX INFO: renamed from: a */
    public final AtomicLong f158543a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f158544b;

    public nua() {
        AtomicLong atomicLong = new AtomicLong(0L);
        AtomicLong atomicLong2 = new AtomicLong(0L);
        this.f158543a = atomicLong;
        this.f158544b = atomicLong2;
    }

    /* JADX INFO: renamed from: a */
    public final AtomicLong m65685a() {
        return this.f158544b;
    }

    /* JADX INFO: renamed from: b */
    public final AtomicLong m65686b() {
        return this.f158543a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nua)) {
            return false;
        }
        nua nuaVar = (nua) obj;
        return wj50.m88271j(this.f158543a, nuaVar.f158543a) && wj50.m88271j(this.f158544b, nuaVar.f158544b);
    }

    public final int hashCode() {
        return this.f158544b.hashCode() + (this.f158543a.hashCode() * 31);
    }
}
