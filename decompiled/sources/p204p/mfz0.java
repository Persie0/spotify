package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mfz0 {

    /* JADX INFO: renamed from: a */
    public final String f143243a;

    /* JADX INFO: renamed from: b */
    public final int f143244b;

    public mfz0(String str, int i) {
        this.f143243a = str;
        this.f143244b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfz0)) {
            return false;
        }
        mfz0 mfz0Var = (mfz0) obj;
        return wj50.m88271j(this.f143243a, mfz0Var.f143243a) && this.f143244b == mfz0Var.f143244b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f143244b) + (this.f143243a.hashCode() * 31);
    }
}
