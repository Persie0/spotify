package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dmy implements hmy {

    /* JADX INFO: renamed from: a */
    public final koy f50632a;

    public dmy(koy koyVar) {
        this.f50632a = koyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmy) && wj50.m88271j(this.f50632a, ((dmy) obj).f50632a);
    }

    public final int hashCode() {
        return this.f50632a.hashCode();
    }
}
