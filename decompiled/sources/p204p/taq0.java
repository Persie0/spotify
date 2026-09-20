package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class taq0 {

    /* JADX INFO: renamed from: a */
    public final String f218653a;

    /* JADX INFO: renamed from: b */
    public final int f218654b;

    public taq0(String str, int i) {
        this.f218653a = str;
        this.f218654b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taq0)) {
            return false;
        }
        taq0 taq0Var = (taq0) obj;
        return wj50.m88271j(this.f218653a, taq0Var.f218653a) && this.f218654b == taq0Var.f218654b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f218654b) + (this.f218653a.hashCode() * 31);
    }
}
