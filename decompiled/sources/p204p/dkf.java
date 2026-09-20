package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dkf implements lkf {

    /* JADX INFO: renamed from: a */
    public final String f49965a;

    /* JADX INFO: renamed from: b */
    public final boolean f49966b;

    public dkf(String str, boolean z) {
        this.f49965a = str;
        this.f49966b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkf)) {
            return false;
        }
        dkf dkfVar = (dkf) obj;
        return wj50.m88271j(this.f49965a, dkfVar.f49965a) && this.f49966b == dkfVar.f49966b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49966b) + (this.f49965a.hashCode() * 31);
    }
}
