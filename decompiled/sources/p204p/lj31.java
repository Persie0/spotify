package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lj31 implements mj31 {

    /* JADX INFO: renamed from: a */
    public final String f133945a;

    public lj31(String str) {
        this.f133945a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj31) && wj50.m88271j(this.f133945a, ((lj31) obj).f133945a);
    }

    public final int hashCode() {
        String str = this.f133945a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
