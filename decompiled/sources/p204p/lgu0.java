package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lgu0 implements pgu0 {

    /* JADX INFO: renamed from: a */
    public final String f133300a;

    public lgu0(String str) {
        this.f133300a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgu0) && wj50.m88271j(this.f133300a, ((lgu0) obj).f133300a);
    }

    public final int hashCode() {
        String str = this.f133300a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
