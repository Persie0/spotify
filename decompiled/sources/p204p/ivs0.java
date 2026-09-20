package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ivs0 {

    /* JADX INFO: renamed from: a */
    public final pob f106285a;

    public ivs0(pob pobVar) {
        this.f106285a = pobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivs0) && wj50.m88271j(this.f106285a, ((ivs0) obj).f106285a);
    }

    public final int hashCode() {
        pob pobVar = this.f106285a;
        if (pobVar == null) {
            return 0;
        }
        return pobVar.hashCode();
    }
}
