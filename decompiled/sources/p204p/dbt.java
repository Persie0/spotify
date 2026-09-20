package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dbt implements hbt {

    /* JADX INFO: renamed from: a */
    public final RuntimeException f47362a;

    public dbt(RuntimeException runtimeException) {
        this.f47362a = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbt) && this.f47362a.equals(((dbt) obj).f47362a);
    }

    public final int hashCode() {
        return this.f47362a.hashCode();
    }
}
