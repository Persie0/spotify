package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j9f0 implements k9f0 {

    /* JADX INFO: renamed from: a */
    public final daq0 f110163a;

    public j9f0(daq0 daq0Var) {
        this.f110163a = daq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9f0) && this.f110163a.equals(((j9f0) obj).f110163a);
    }

    public final int hashCode() {
        return this.f110163a.hashCode();
    }
}
