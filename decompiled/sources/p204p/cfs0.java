package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f37431a;

    /* JADX INFO: renamed from: b */
    public final String f37432b;

    public cfs0(String str, String str2) {
        this.f37431a = str;
        this.f37432b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfs0)) {
            return false;
        }
        cfs0 cfs0Var = (cfs0) obj;
        return wj50.m88271j(this.f37431a, cfs0Var.f37431a) && wj50.m88271j(this.f37432b, cfs0Var.f37432b);
    }

    public final int hashCode() {
        String str = this.f37431a;
        return this.f37432b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
