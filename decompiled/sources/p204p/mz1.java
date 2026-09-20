package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mz1 {

    /* JADX INFO: renamed from: a */
    public final String f148582a;

    /* JADX INFO: renamed from: b */
    public final String f148583b;

    public mz1(String str, String str2) {
        this.f148582a = str;
        this.f148583b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz1)) {
            return false;
        }
        mz1 mz1Var = (mz1) obj;
        return wj50.m88271j(this.f148582a, mz1Var.f148582a) && wj50.m88271j(this.f148583b, mz1Var.f148583b);
    }

    public final int hashCode() {
        return this.f148583b.hashCode() + (this.f148582a.hashCode() * 31);
    }
}
