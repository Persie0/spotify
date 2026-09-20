package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qmr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f190381a;

    /* JADX INFO: renamed from: b */
    public final boolean f190382b;

    public qmr(boolean z, boolean z2) {
        this.f190381a = z;
        this.f190382b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmr)) {
            return false;
        }
        qmr qmrVar = (qmr) obj;
        return this.f190381a == qmrVar.f190381a && this.f190382b == qmrVar.f190382b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190382b) + (Boolean.hashCode(this.f190381a) * 31);
    }
}
