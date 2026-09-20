package p204p;

/* JADX INFO: renamed from: p.for, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class Cfor extends uor {

    /* JADX INFO: renamed from: a */
    public final ynr f71591a;

    public Cfor(ynr ynrVar) {
        this.f71591a = ynrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cfor) && wj50.m88271j(this.f71591a, ((Cfor) obj).f71591a);
    }

    public final int hashCode() {
        return this.f71591a.hashCode();
    }
}
