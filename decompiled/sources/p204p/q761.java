package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q761 {

    /* JADX INFO: renamed from: a */
    public final itq f186040a;

    public q761(itq itqVar) {
        this.f186040a = itqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q761) && wj50.m88271j(this.f186040a, ((q761) obj).f186040a);
    }

    public final int hashCode() {
        itq itqVar = this.f186040a;
        if (itqVar != null) {
            return itqVar.hashCode();
        }
        return 0;
    }
}
