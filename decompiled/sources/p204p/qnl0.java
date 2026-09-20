package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qnl0 {

    /* JADX INFO: renamed from: a */
    public final long f190644a;

    /* JADX INFO: renamed from: b */
    public final boolean f190645b;

    public qnl0(long j, boolean z) {
        this.f190644a = j;
        this.f190645b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnl0)) {
            return false;
        }
        qnl0 qnl0Var = (qnl0) obj;
        return this.f190644a == qnl0Var.f190644a && this.f190645b == qnl0Var.f190645b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190645b) + (Long.hashCode(this.f190644a) * 31);
    }
}
