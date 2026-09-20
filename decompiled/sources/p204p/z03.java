package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z03 implements a13 {

    /* JADX INFO: renamed from: a */
    public final String f277945a;

    public z03(String str) {
        this.f277945a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z03) && wj50.m88271j(this.f277945a, ((z03) obj).f277945a);
    }

    public final int hashCode() {
        return this.f277945a.hashCode();
    }
}
