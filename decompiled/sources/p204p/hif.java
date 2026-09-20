package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hif implements mif {

    /* JADX INFO: renamed from: a */
    public final uhf f91805a;

    public hif(uhf uhfVar) {
        this.f91805a = uhfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hif) && wj50.m88271j(this.f91805a, ((hif) obj).f91805a);
    }

    public final int hashCode() {
        return this.f91805a.hashCode();
    }
}
